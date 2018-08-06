package com.paypal.orders.AuthorizeIntentExamples;

import com.braintreepayments.http.HttpResponse;
import com.paypal.Skeleton;
import com.paypal.orders.LinkDescription;
import com.paypal.orders.Order;
import com.paypal.orders.OrderActionRequest;
import com.paypal.orders.OrdersAuthorizeRequest;

import java.io.IOException;

public class AuthorizeOrder extends Skeleton {
    private OrderActionRequest buildRequestBody() {
        return new OrderActionRequest();
    }

    public HttpResponse<Order> authorizeOrder(String orderId, boolean debug) throws IOException {
        OrdersAuthorizeRequest request = new OrdersAuthorizeRequest(orderId).authToken("Bearer " + authenticationToken());
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
}
