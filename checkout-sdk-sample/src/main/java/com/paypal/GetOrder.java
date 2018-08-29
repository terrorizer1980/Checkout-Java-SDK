package com.paypal;

import com.braintreepayments.http.HttpResponse;
import com.paypal.orders.*;
import org.json.JSONObject;
import com.braintreepayments.http.serializer.Json;
import com.paypal.CaptureIntentExamples.CreateOrder;
import java.io.IOException;

public class GetOrder extends SampleSkeleton {

    /**
     * Method to perform sample GET on an order
     * @throws IOException Exceptions from API if any
     */
    public void getOrder(String orderId) throws IOException {
        OrdersGetRequest request = new OrdersGetRequest(orderId);
        HttpResponse<Order> response = client.execute(request);
        System.out.println("Full response body:");
        System.out.println(new JSONObject(new Json().serialize(response.result())).toString(4));
    }

    public static void main(String[] args) throws IOException{
        HttpResponse<Order> response = new CreateOrder().createOrder(false);
        new GetOrder().getOrder(response.result().id());
    }
}
