package com.paypal.orders;

import com.braintreepayments.http.HttpResponse;
import com.braintreepayments.http.serializer.Json;
import com.paypal.Skeleton;
import com.paypal.core.Skeleton;

import java.io.IOException;

public class OrdersPatchTest extends Skeleton {
    private Patch buildRequestBody() throws IOException {
        String json = "{\"from\":\"pAcAbyratXQP5RS8\",\"op\":\"UcfUtRIQ7Fb624d\",\"path\":\"AC63L4WADrwuSQR8G63\",\"value\":{}}";
        return new Json().decode(json, Patch.class);
    }

    public void testOrdersPatchRequest() throws IOException {
        OrdersPatchRequest request = new OrdersPatchRequest("0dA0yarCPMqNf ");
        request.requestBody(buildRequestBody());

        HttpResponse<Void> response = client().execute(request);

        // Add your own checks here
    }
}
