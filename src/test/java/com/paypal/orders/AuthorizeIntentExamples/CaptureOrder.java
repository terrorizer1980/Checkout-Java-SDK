package com.paypal.orders.AuthorizeIntentExamples;

import com.braintreepayments.http.HttpResponse;
import com.braintreepayments.http.serializer.Json;
import com.paypal.Skeleton;
import com.paypal.payments.*;
import com.paypal.orders.OrderRequest;
import com.paypal.orders.Customer;
import com.paypal.payments.Capture;

import java.io.IOException;

public class CaptureOrder extends Skeleton {
    public OrderRequest buildRequestBody() {
        return new OrderRequest();
    }

    public HttpResponse<Capture> captureOrder(String authId, boolean debug) throws IOException {
        AuthorizationsCaptureRequest request = new AuthorizationsCaptureRequest(authId);
        request.authToken("Bearer " + authenticationToken());
        request.requestBody(buildRequestBody());
        HttpResponse<Capture> response = client().execute(request);
        if (debug){
            System.out.println("Status Code: " + response.statusCode());
            System.out.println("Status: " + response.result().status());
            System.out.println("Order ID: " + response.result().id());
            System.out.println("Links: ");
            for (LinkDescription link : response.result().links()) {
                System.out.println("\t" + link.rel() + ": " + link.href() + "\tCall Type: " + link.method());
            }
        }
        return response;
    }

    public static void main(String[] args) {
        try {
            new CaptureOrder().captureOrder("3GE1976542881364S", true);
        }catch (Exception e){
            e.printStackTrace();
        }
    }

}

