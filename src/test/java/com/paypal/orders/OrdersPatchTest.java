package com.paypal.orders;

import com.braintreepayments.http.HttpResponse;
import com.braintreepayments.http.serializer.Json;
import com.paypal.core.Skeleton;
import com.paypal.core.Skeleton;

import java.io.IOException;

public class OrdersPatchTest extends Skeleton {
    private Patch buildRequestBody() throws IOException {
        String json = "";
        return new Json().decode(json, Patch.class);
    }

    public void testOrdersPatchRequest() throws IOException {
        OrdersPatchRequest request = new OrdersPatchRequest("0dA0yarCPMqNf ");
        request.requestBody(buildRequestBody());

        HttpResponse<Void> response = client().execute(request);

        // Add your own checks here
    }
}
