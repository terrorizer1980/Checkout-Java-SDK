package com.paypal.orders.CaptureIntentExamples;

import com.braintreepayments.http.HttpResponse;
import com.paypal.core.Skeleton;
import com.paypal.orders.*;

import java.io.IOException;

public class CaptureOrder extends Skeleton {
    public OrderRequest buildRequestBody() {
        return new OrderRequest();
    }

    public HttpResponse<Order> captureOrder(String orderId, boolean debug) throws IOException {
        OrdersCaptureRequest request = new OrdersCaptureRequest(orderId);
        request.authToken("Bearer " + authenticationToken());
        request.requestBody(buildRequestBody());
        HttpResponse<Order> response = client().execute(request);
        if (debug){
            System.out.println("Status Code: " + response.statusCode());
            System.out.println("Status: " + response.result().status());
            System.out.println("Order ID: " + response.result().id());
            System.out.println("Links: ");
            for (LinkDescription link : response.result().links()) {
                System.out.println("\t" + link.rel() + ": " + link.href());
            }
            System.out.println("Buyer: ");
            Customer buyer = response.result().payer();
            System.out.println("\tEmail Address: " + buyer.emailAddress());
            System.out.println("\tName: " + buyer.name().fullName());
            System.out.println("\tPhone Number: " + buyer.phone().countryCode() + buyer.phone().nationalNumber());
        }
        return response;
    }

    public static void main(String[] args) {
        try {
            new CaptureOrder().captureOrder("64T39100PX9050111", true);
        }catch (Exception e){
            e.printStackTrace();
        }
    }

}

