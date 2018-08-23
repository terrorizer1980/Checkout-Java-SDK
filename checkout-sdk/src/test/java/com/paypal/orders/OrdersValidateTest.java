package com.paypal.orders;

import com.braintreepayments.http.HttpResponse;
import com.braintreepayments.http.HttpClient;
import com.braintreepayments.http.serializer.Json;
import com.paypal.TestHarness;
import java.io.File;
import java.nio.file.Paths;
import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
import org.testng.annotations.Test;

import java.io.IOException;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertNotNull;
import static org.testng.Assert.fail;

public class OrdersValidateTest extends TestHarness {
    private OrderActionRequest buildRequestBody() throws IOException {
        return new OrderActionRequest()
                    .paymentSource(new PaymentSource()
                                    .card(new Card()
                                            .name("John Doe")
                                            .expiry("2020-02")
                                            .number("4111111111111111")));
    }

    @Test(enabled=false)
    public void testOrdersValidateRequest() throws IOException {
        Order order = OrdersCreateTest.createOrder(client());

        OrdersValidateRequest request = new OrdersValidateRequest(order.id());

        request.requestBody(buildRequestBody());

        HttpResponse<Order> response = client().execute(request);
        assertEquals(response.statusCode(), 200);
        assertNotNull(response.result());
    }
}
