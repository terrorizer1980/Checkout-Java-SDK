# PayPal SDK V2

This is a part of the next major PayPal SDK. It includes a simplified interface to only provide simple model objects and blueprints for HTTP calls. This repo currently contains functionality for PayPal Checkout APIs which includes Orders V2 and Payments V2.

## Creating an Order

```java
//Creating Access Token for Sandbox

String clientId = "AVNCVvV9oQ7qee5O8OW4LSngEeU1dI7lJAGCk91E_bjrXF2LXB2TK2ICXQuGtpcYSqs4mz1BMNQWuso1";
String clientSecret = "EDQzd81k-1z2thZw6typSPOTEjxC_QbJh6IithFQuXdRFc7BjVht5rQapPiTaFt5RC-HCa1ir6mi-H5l";
String authToken = new PayPalAuthToken().createAuthToken(clientId, clientSecret);

// Creating an environment
HttpClient client = new Skeleton().client();

// Construct a request object and set desired parameters
// Here, OrdersCreateRequest() creates a POST request to /v2/checkout/orders
OrdersCreateRequest request = new OrdersCreateRequest().authToken("Bearer " + authToken)
                                  .requestBody(new OrderRequest()
                                      .intent("CAPTURE")
                                      .purchaseUnits(new ArrayList<PurchaseUnitRequest> () {{
                                          add(new Item()
                                              .unitAmount(new Money()
                                                  .currencyCode("USD")
                                                  .value("100.00")
                                              )) 
                                          }}
                                      ));

try {
    // Call API with your client and get a response for your call
    HttpResponse<Order> response = client().execute(request);  
    
    // If call returns body in response, you can get the deserialized version by calling result() on the response
    Order order = response.result();
} catch (IOException ioe) {
    if (ioe instanceof HttpException) {
      // Something went wrong server-side
    HttpException he = (HttpException) ioe);
    int statusCode = he.getStatusCode();
    String debugId = he.getMessage().get("debug_id");
} else {
    // Something went wrong client-side
}
```


## Capturing an Order

```java
// Here, OrdersCaptureRequest() creates a POST request to /v2/checkout/orders
// order.Id() returns the orderId from the order created above
OrdersCreateRequest request = new OrdersCaptureRequest(order.Id()).authToken("Bearer " + authToken);

try {
    // Call API with your client and get a response for your call
    HttpResponse<Order> response = client().execute(request);  
    // If call returns body in response, you can get the deserialized version by calling result() on the response
    Order order = response.result();
} catch (IOException ioe) {
    if (ioe instanceof HttpException) {
      // Something went wrong server-side
    HttpException he = (HttpException) ioe);
    int statusCode = he.getStatusCode();
    String debugId = he.getMessage().get("debug_id");
} else {
    // Something went wrong client-side
}
```
