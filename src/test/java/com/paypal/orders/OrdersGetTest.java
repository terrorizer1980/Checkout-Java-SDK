package com.paypal.orders;

import com.braintreepayments.http.HttpResponse;
import com.paypal.Skeleton;
import com.paypal.core.Skeleton;

import java.io.IOException;

public class OrdersGetTest extends Skeleton {

    public void testOrdersGetRequest() throws IOException {
        OrdersGetRequest request = new OrdersGetRequest("HEOMdFyqOqYHXJ");

        HttpResponse<Order> response = client().execute(request);
//        assertEquals(response.statusCode(), 200);
//        assertNotNull(response.result());

        // Add your own checks here
    }
}
