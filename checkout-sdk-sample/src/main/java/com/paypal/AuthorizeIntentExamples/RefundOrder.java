package com.paypal.AuthorizeIntentExamples;

import com.braintreepayments.http.HttpResponse;
import com.paypal.payments.*;
import com.paypal.orders.OrderRequest;
import com.paypal.payments.Capture;
import com.paypal.SampleSkeleton;

import java.io.IOException;

public class RefundOrder extends SampleSkeleton {
    /**
     * Creating empty body for refund request
     * @return OrderRequest request with empty body
     */
    public OrderRequest buildRequestBody() {
        return new OrderRequest();
    }

    /**
     * Method to capture order after authorization
     * @param captureId Capture ID from authorizeOrder response
     * @param debug true = print response data
     * @return HttpResponse<Capture> response received from API
     * @throws IOException Exceptions from API if any
     */
    public HttpResponse<Refund> refundOrder(String captureId, boolean debug) throws IOException {
        CapturesRefundRequest request = new CapturesRefundRequest(captureId);
        request.prefer("return=representation");
        request.requestBody(buildRequestBody());
        HttpResponse<Refund> response = client().execute(request);
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
            new RefundOrder().refundOrder("CAPTURE-ID", true);
        }catch (Exception e){
            e.printStackTrace();
        }
    }

}

