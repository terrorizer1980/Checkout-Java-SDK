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

public class OrdersCreateTest extends TestHarness {

    public static OrderRequest buildRequestBody() throws IOException {
        return new OrderRequest()
                .intent("CAPTURE")
                .purchaseUnits(new ArrayList<PurchaseUnitRequest>(){{
                    add(new PurchaseUnitRequest()
                            .referenceId("test_ref_id1")
                            .amount(new AmountWithBreakdown()
                                    .currencyCode("USD")
                                    .value("100.00")));
                }});
    }

    public static Order createOrder(HttpClient client) throws IOException {
        OrdersCreateRequest request = new OrdersCreateRequest();
        request.requestBody(buildRequestBody());
        request.prefer("return=representation");
        HttpResponse<Order> response = client.execute(request);
        assertEquals(response.statusCode(), 201);

        Order createdOrder = response.result();
        assertNotNull(createdOrder);
        return createdOrder;
    }

    @Test
    public void testOrdersCreateRequest() throws IOException {
        Order createdOrder = createOrder(client());

        assertNotNull(createdOrder.id());

        assertEquals(createdOrder.intent(), "CAPTURE");

        assertNotNull(createdOrder.purchaseUnits());
        assertEquals(createdOrder.purchaseUnits().size(), 1);
        PurchaseUnit firstPurchaseUnit = createdOrder.purchaseUnits().get(0);
        assertEquals(firstPurchaseUnit.referenceId(), "test_ref_id1");
        assertEquals(firstPurchaseUnit.amount().currencyCode(), "USD");
        assertEquals(firstPurchaseUnit.amount().value(), "100.00");

        assertNotNull(createdOrder.createTime());

        assertNotNull(createdOrder.links());
        boolean foundApprovalURL = false;
        for (LinkDescription linkDescription :createdOrder.links()) {
            if ("approve".equals(linkDescription.rel())) {
                foundApprovalURL = true;
                assertNotNull(linkDescription.href());
                assertEquals(linkDescription.method(), "GET");
            }
        }
        assertTrue(foundApprovalURL);

        assertEquals(createdOrder.status(), "CREATED");
    }
}
