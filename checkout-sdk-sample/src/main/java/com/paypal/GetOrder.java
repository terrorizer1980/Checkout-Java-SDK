package com.paypal;

import com.braintreepayments.http.HttpResponse;
import com.paypal.orders.*;
import org.json.JSONObject;
import com.paypal.CaptureIntentExamples.CreateOrder;
import java.io.IOException;

public class GetOrder extends SampleSkeleton {

    public void getOrder() throws IOException {
        HttpResponse<Order> response = new CreateOrder().createOrder(false);
        OrdersGetRequest request = new OrdersGetRequest(response.result().id());

        response = client.execute(request);

        prettyPrint(new JSONObject(response.result()), "");
    }

    public static void main(String[] args) throws IOException{
        new GetOrder().getOrder();
    }
}
