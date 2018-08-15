# REST API SDK for Java V2

![Home Image](homepage.jpg)

__Welcome to PayPal Java SDK__. This repository contains PayPal's Java SDK and samples for REST API.

This is a part of the next major PayPal SDK. It includes a simplified interface to only provide simple model objects and blueprints for HTTP calls. This repo currently contains functionality for PayPal Checkout APIs which includes Orders V2 and Payments V2.

## Prerequisites

Java JDK 6 or higher
An environment which supports TLS 1.2 (see the TLS-update site for more information)

## Usage

### Setting up credentials
Get client ID and client secret by going to https://developer.paypal.com/developer/applications and generating a REST API app. Get <b>Client ID</b> and <b>Secret</b> from there.

```java
import com.paypal.core.PayPalAuthenticationToken;
public class Credentials {
    static String clientId = "CLIENT-ID";
    static String secret = "CLIENT-SECRET";
    
    // Generating authentication token
    static String authToken = new PayPalAuthenticationToken().createAuthToken(clientId, clientSecret);
    
    // Creating a client to use
    static HttpClient client = new Skeleton().client();
}
```

## Examples
### Creating an Order
This will create an order and print order id for the created order

```java
import com.paypal.orders.*;

public class CreateOrderExample {
    public static void main(String[] args){
        
        // Construct a request object and set desired parameters
        // Here, OrdersCreateRequest() creates a POST request to /v2/checkout/orders
        OrdersCreateRequest request = new OrdersCreateRequest().authToken("Bearer " + Credentials.authToken)
                                          .requestBody(new OrderRequest()
                                              .intent("CAPTURE")
                                              .purchaseUnits(new ArrayList<PurchaseUnitRequest> () {{
                                                  add(new Item()
                                                      .unitAmount(new Money()
                                                          .currencyCode("USD")
                                                          .value("100.00")
                                                      )); 
                                                  }}
                                              ));
        
        try {
            // Call API with your client and get a response for your call
            HttpResponse<Order> response = client().execute(request);  
            
            // If call returns body in response, you can get the deserialized version by calling result() on the response
            Order order = response.result();
            System.out.println("Order ID: ", order.id());
        } catch (IOException ioe) {
            if (ioe instanceof HttpException) {
              // Something went wrong server-side
            HttpException he = (HttpException) ioe;
            int statusCode = he.getStatusCode();
            String debugId = he.getMessage().get("debug_id");
            } else {
            // Something went wrong client-side
            }
        }
    }
}
```

### Capturing an Order
This will capture an order
```java
import com.paypal.orders.*;

public class CaptureOrderExample {
    public static void main(String[] args){
        
        // Construct a request object and set desired parameters
        // Here, OrdersCaptureRequest() creates a POST request to /v2/checkout/orders
        // Replace ORDER-ID with the order id from create order
        OrdersCaptureRequest request = new OrdersCaptureRequest("ORDER-ID").authToken("Bearer " + Credentials.authToken);
        
        try {
            // Call API with your client and get a response for your call
            HttpResponse<Order> response = client().execute(request);  
            
            // If call returns body in response, you can get the deserialized version by calling result() on the response
            Order order = response.result();
        } catch (IOException ioe) {
            if (ioe instanceof HttpException) {
              // Something went wrong server-side
            HttpException he = (HttpException) ioe;
            int statusCode = he.getStatusCode();
            String debugId = he.getMessage().get("debug_id");
            } else {
            // Something went wrong client-side
            }
        }
    }
}
```
## Samples

You can start off by trying out [creating and capturing an order](/src/test/java/com/paypal/orders/CaptureIntentExamples/RunAll.java).

To try out different samples for both create and authorize intent head to [this link](/src/test/java/com/paypal/orders).
