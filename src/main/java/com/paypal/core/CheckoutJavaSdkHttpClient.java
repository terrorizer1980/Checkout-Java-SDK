package com.paypal.core;

import com.braintreepayments.http.Headers;
import com.braintreepayments.http.Environment;
import com.braintreepayments.http.HttpClient;
import com.braintreepayments.http.HttpRequest;

import java.io.IOException;

public class CheckoutJavaSdkHttpClient extends HttpClient {

	public CheckoutJavaSdkHttpClient(Environment environment) {
		super(environment);
	}

	@Override
	protected String getUserAgent() {
		return "CheckoutJavaSDK HttpClient"; // TODO: Change me
	}
}
