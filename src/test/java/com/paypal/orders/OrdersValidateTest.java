package com.paypal.orders;

import com.braintreepayments.http.HttpResponse;
import com.braintreepayments.http.serializer.Json;
import com.paypal.core.Skeleton;
import com.paypal.core.Skeleton;

import java.io.IOException;

public class OrdersValidateTest extends Skeleton {
    private OrderActionRequest buildRequestBody() throws IOException {
        String json = "";
        return new Json().decode(json, OrderActionRequest.class);
    }

    public void testOrdersValidateRequest() throws IOException {
        OrdersValidateRequest request = new OrdersValidateRequest("OPcOx64Wb5zsdC2T")
            .payPalClientMetadataId("8Dg1IKHAvNB");
        request.requestBody(buildRequestBody());

        HttpResponse<Order> response = client().execute(request);

        // Add your own checks here
    }
}
