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

import static org.testng.Assert.*;

public class OrdersGetTest extends TestHarness {

    @Test
    public void testOrdersGetRequest() throws IOException {
        Order order = OrdersCreateTest.createOrder(client());
        
        OrdersGetRequest request = new OrdersGetRequest(order.id());

        HttpResponse<Order> response = client().execute(request);
        assertEquals(response.statusCode(), 200);
        assertNotNull(response.result());

        order = response.result();

        assertNotNull(order.id());

        assertEquals(order.intent(), "CAPTURE");

        assertNotNull(order.purchaseUnits());
        assertEquals(order.purchaseUnits().size(), 1);
        PurchaseUnit firstPurchaseUnit = order.purchaseUnits().get(0);
        assertEquals(firstPurchaseUnit.referenceId(), "test_ref_id1");
        assertEquals(firstPurchaseUnit.amount().currencyCode(), "USD");
        assertEquals(firstPurchaseUnit.amount().value(), "100.00");

        assertNotNull(order.createTime());

        assertNotNull(order.links());
        boolean foundApprovalURL = false;
        for (LinkDescription linkDescription :order.links()) {
            if ("approve".equals(linkDescription.rel())) {
                foundApprovalURL = true;
                assertNotNull(linkDescription.href());
                assertEquals(linkDescription.method(), "GET");
            }
        }
        assertTrue(foundApprovalURL);

        assertEquals(order.status(), "CREATED");
    }
}
