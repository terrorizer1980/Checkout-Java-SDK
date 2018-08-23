package com.paypal;

import com.braintreepayments.http.HttpResponse;
import com.braintreepayments.http.serializer.Json;
import com.paypal.orders.OrdersPatchRequest;
import com.paypal.orders.Patch;

import java.io.IOException;

public class PatchOrder extends SampleSkeleton {
    private Patch buildRequestBody() throws IOException {
        String json = "";
        return new Json().decode(json, Patch.class);
    }

    public void patchOrder() throws IOException {

        OrdersPatchRequest request = new OrdersPatchRequest("0dA0yarCPMqNf ");
        request.requestBody(buildRequestBody());
        HttpResponse<Void> response = client().execute(request);

    }
}
