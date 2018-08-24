package com.paypal;

import com.braintreepayments.http.HttpResponse;
import com.paypal.orders.*;
import org.json.JSONObject;
import com.paypal.CaptureIntentExamples.CreateOrder;
import java.io.IOException;

public class GetOrder extends SampleSkeleton {

    /**
     * Method to perform sample GET on an order
     * @throws IOException Exceptions from API if any
     */
    public void getOrder() throws IOException {
        HttpResponse<Order> response = new CreateOrder().createOrder(false);
        OrdersGetRequest request = new OrdersGetRequest(response.result().id());
        response = client.execute(request);
        System.out.println("Status Code: " + response.statusCode());
        System.out.println("Status: " + response.result().status());
        System.out.println("Order ID: " + response.result().id());
        System.out.println("Intent: " + response.result().intent());
        System.out.println("Links: ");
        for (LinkDescription link : response.result().links()) {
            System.out.println("\t" + link.rel() + ": " + link.href() + "\tCall Type: " + link.method());
        }
        System.out.println("Gross Amount: " + response.result().grossAmount().currencyCode() + " " + response.result().grossAmount().value());
    }

    public static void main(String[] args) throws IOException{
        new GetOrder().getOrder();
    }
}
