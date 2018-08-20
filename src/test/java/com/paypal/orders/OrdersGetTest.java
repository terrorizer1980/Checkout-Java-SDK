package com.paypal.orders;

import com.braintreepayments.http.HttpResponse;
import com.paypal.core.Skeleton;
import com.paypal.core.Skeleton;

import java.io.IOException;

public class OrdersGetTest extends Skeleton {

    public void testOrdersGetRequest() throws IOException {
        OrdersGetRequest request = new OrdersGetRequest("ORDER-ID");

        HttpResponse<Order> response = client().execute(request);
    }
}
