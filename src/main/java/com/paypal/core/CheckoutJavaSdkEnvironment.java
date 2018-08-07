package com.paypal.core;

import com.braintreepayments.http.Environment;
import java.lang.UnsupportedOperationException;

public class CheckoutJavaSdkEnvironment implements Environment {

	public String baseUrl() {
		return System.getenv("BASE_URL");
	}
}
