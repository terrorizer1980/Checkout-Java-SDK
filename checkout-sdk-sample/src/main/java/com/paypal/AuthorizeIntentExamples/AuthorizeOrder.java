package com.paypal.AuthorizeIntentExamples;

import com.braintreepayments.http.HttpResponse;
import com.paypal.SampleSkeleton;
import com.paypal.orders.LinkDescription;
import com.paypal.orders.Order;
import com.paypal.orders.OrderActionRequest;
import com.paypal.orders.OrdersAuthorizeRequest;

import java.io.IOException;

public class AuthorizeOrder extends SampleSkeleton {
    /**
     * Building empty request body
     * @return OrderActionRequest with empty body
     */
    private OrderActionRequest buildRequestBody() {
        return new OrderActionRequest();
    }

    /**
     * Method to authorize order after creation
     * @param orderId Order ID from createOrder response
     * @param debug true = print response data
     * @return HttpResponse<Order> response received from API
     * @throws IOException Exceptions from API if any
     */
    public HttpResponse<Order> authorizeOrder(String orderId, boolean debug) throws IOException {
        OrdersAuthorizeRequest request = new OrdersAuthorizeRequest(orderId);
        request.requestBody(buildRequestBody());
        HttpResponse<Order> response = client().execute(request);
        if (debug) {
            System.out.println("Link Descriptions: ");
            for (LinkDescription link : response.result().links()) {
                System.out.println("\t" + link.rel() + ": " + link.href());
            }
        }
        return response;
    }

    public static void main(String[] args) {
        try {
            new AuthorizeOrder().authorizeOrder("ORDER-ID", true);
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
