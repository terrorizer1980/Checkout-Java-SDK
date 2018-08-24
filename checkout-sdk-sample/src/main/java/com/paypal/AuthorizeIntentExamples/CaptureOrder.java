package com.paypal.AuthorizeIntentExamples;

import com.braintreepayments.http.HttpResponse;
import com.paypal.payments.*;
import com.paypal.orders.OrderRequest;
import com.paypal.payments.Capture;
import com.paypal.SampleSkeleton;

import java.io.IOException;

public class CaptureOrder extends SampleSkeleton {
    /**
     * Creating empty body for capture request
     * @return OrderRequest request with empty body
     */
    public OrderRequest buildRequestBody() {
        return new OrderRequest();
    }

    /**
     * Method to capture order after authorization
     * @param authId Authorization ID from authorizeOrder response
     * @param debug true = print response data
     * @return HttpResponse<Capture> response received from API
     * @throws IOException Exceptions from API if any
     */
    public HttpResponse<Capture> captureOrder(String authId, boolean debug) throws IOException {
        AuthorizationsCaptureRequest request = new AuthorizationsCaptureRequest(authId);
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

