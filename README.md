# REST API SDK for Java V2

![Home Image](homepage.jpg)

__Welcome to PayPal Java SDK__. This repository contains PayPal's Java SDK and samples for REST API.

This is a part of the next major PayPal SDK. It includes a simplified interface to only provide simple model objects and blueprints for HTTP calls. This repo currently contains functionality for PayPal Checkout APIs which includes Orders V2 and Payments V2.

## Please Note
> **The Payment Card Industry (PCI) Council has [mandated](http://blog.pcisecuritystandards.org/migrating-from-ssl-and-early-tls) that early versions of TLS be retired from service.  All organizations that handle credit card information are required to comply with this standard. As part of this obligation, PayPal is updating its services to require TLS 1.2 for all HTTPS connections. At this time, PayPal will also require HTTP/1.1 for all connections. [Click here](https://github.com/paypal/tls-update) for more information. Connections to the sandbox environment use only TLS 1.2.**

## Direct Credit Card Support
> **Important: The PayPal REST API no longer supports new direct credit card integrations.**  Please instead consider [Braintree Direct](https://www.braintreepayments.com/products/braintree-direct); which is, PayPal's preferred integration solution for accepting direct credit card payments in your mobile app or website. Braintree, a PayPal service, is the easiest way to accept credit cards, PayPal, and many other payment methods.

## Prerequisites

Java JDK 6 or higher

An environment which supports TLS 1.2 (see the TLS-update site for more information)

## Usage

### Setting up credentials
Get client ID and client secret by going to https://developer.paypal.com/developer/applications and generating a REST API app. Get <b>Client ID</b> and <b>Secret</b> from there.

```java
import com.paypal.core.PayPalEnvironment;
import com.paypal.core.PayPalHttpClient;
public class Credentials {
    static String clientId = "CLIENT-ID";
    static String secret = "CLIENT-SECRET";
    
    // Creating a sandbox environment
    private PayPalEnvironment environment = new PayPalEnvironment.Sandbox(clientId, secret);
    
    // Creating a client for the environment
    static PayPalHttpClient client = new PayPalHttpClient(environment);
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
        OrdersCreateRequest request = new OrdersCreateRequest()
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
            HttpResponse<Order> response = Credentials.client.execute(request);  
            
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
        OrdersCaptureRequest request = new OrdersCaptureRequest("ORDER-ID");
        
        try {
            // Call API with your client and get a response for your call
            HttpResponse<Order> response = Credentials.client.execute(request);  
            
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
