package com.paypal;
import com.braintreepayments.http.Environment;
import com.braintreepayments.http.HttpClient;
import com.paypal.core.CheckoutJavaSdkHttpClient;


public class Skeleton {

    private CheckoutJavaSdkHttpClient client;

    protected HttpClient client() {
        Environment environment = new Environment() {
            @Override
            public String baseUrl() {
                return System.getenv("BASE_URL");
            }
        };

        return new CheckoutJavaSdkHttpClient(environment);
    }

    protected String authenticationToken(){
        String clientId = "AVNCVvV9oQ7qee5O8OW4LSngEeU1dI7lJAGCk91E_bjrXF2LXB2TK2ICXQuGtpcYSqs4mz1BMNQWuso1";
        String clientSecret = "EDQzd81k-1z2thZw6typSPOTEjxC_QbJh6IithFQuXdRFc7BjVht5rQapPiTaFt5RC-HCa1ir6mi-H5l";
        return new PayPalAuthenticationToken().createAuthToken(clientId, clientSecret);
    }

}
