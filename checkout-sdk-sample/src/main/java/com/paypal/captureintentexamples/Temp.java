package com.paypal.captureintentexamples;

import java.io.IOException;

import com.braintreepayments.http.HttpResponse;
import com.braintreepayments.http.exceptions.HttpException;
import com.paypal.PayPalClient;
import com.paypal.orders.*;

public class Temp {
	public static void main(String[] args) {

		// Construct a request object and set desired parameters
		// Here, OrdersCaptureRequest() creates a POST request to /v2/checkout/orders
		// Replace ORDER-ID with the order id from create order
		OrdersCaptureRequest request = new OrdersCaptureRequest("ORDER-ID");

		try {
			// Call API with your client and get a response for your call
			HttpResponse<Order> response = new PayPalClient().client().execute(request);

			// If call returns body in response, you can get the deserialized version by
			// calling result() on the response
			Order order = response.result();
			System.out.println(order.status());
		} catch (IOException ioe) {
			if (ioe instanceof HttpException) {
				// Something went wrong server-side
				HttpException he = (HttpException) ioe;
				int statusCode = he.statusCode();
				String message = he.getMessage();
				System.out.println("Status Code: " + statusCode + " - Message:" + message);
			} else {
				// Something went wrong client-side
			}
		}
	}
}