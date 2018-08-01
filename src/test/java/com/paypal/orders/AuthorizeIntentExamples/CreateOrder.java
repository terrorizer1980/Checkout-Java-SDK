package com.paypal.orders.AuthorizeIntentExamples;

import com.braintreepayments.http.HttpResponse;
import com.paypal.Skeleton;
import com.paypal.orders.*;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class CreateOrder extends Skeleton {
    private OrderRequest buildRequestBody() {
        OrderRequest orderRequest = new OrderRequest();
        orderRequest.intent("CAPTURE");

        ApplicationContext applicationContext = new ApplicationContext()
                .brandName("EXAMPLE INC")
                .landingPage("BILLING")
                .cancelUrl("https://www.google.com")
                .returnUrl("https://www.google.com")
                .userAction("CONTINUE")
                .shippingPreference("SET_PROVIDED_ADDRESS");
        orderRequest.applicationContext(applicationContext);

        List<PurchaseUnitRequest> purchaseUnitRequests = new ArrayList<>();
        PurchaseUnitRequest purchaseUnitRequest = new PurchaseUnitRequest()
                .referenceId("PUHF")
                .description("Sporting Goods")
                .customId("CUST-HighFashions")
                .softDescriptor("HighFashions")
                .amount(new AmountWithBreakdown()
                        .currencyCode("USD")
                        .value("230.00")
                        .breakdown(new AmountBreakdown()
                                .itemTotal(new Money()
                                        .currencyCode("USD")
                                        .value("180.00"))
                                .shipping(new Money()
                                        .currencyCode("USD")
                                        .value("20.00"))
                                .handling(new Money()
                                        .currencyCode("USD")
                                        .value("10.00"))
                                .taxTotal(new Money()
                                        .currencyCode("USD")
                                        .value("20.00"))
                                .giftWrap(new Money()
                                        .currencyCode("USD")
                                        .value("10.00"))
                                .shippingDiscount(new Money()
                                        .currencyCode("USD")
                                        .value("10.00"))))
                .payee(new Payee()
                        .emailAddress("rpenmetsa-us@paypal.com"))
                .items(new ArrayList<Item>() {{
                    add(new Item()
                            .name("T-shirt")
                            .description("Green XL")
                            .sku("sku01")
                            .unitAmount(new Money()
                                    .currencyCode("USD")
                                    .value("90.00"))
                            .tax(new Money()
                                    .currencyCode("USD")
                                    .value("10.00"))
                            .quantity("1")
                            .category("PHYSICAL_GOODS"));
                    add(new Item()
                            .name("Shoes")
                            .description("Running, Size 10.5")
                            .sku("sku02")
                            .unitAmount(new Money()
                                    .currencyCode("USD")
                                    .value("45.00"))
                            .tax(new Money()
                                    .currencyCode("USD")
                                    .value("5.00"))
                            .quantity("2")
                            .category("PHYSICAL_GOODS"));}})
                .shipping(new ShippingDetails()
                        .method("United States Postal Service")
                        .name(new Name().fullName("John Doe"))
                        .address(new PortablePostalAddress()
                                .addressLine1("123 Townsend St")
                                .addressLine2("Floor 6")
                                .adminArea2("San Francisco")
                                .adminArea1("CA")
                                .postalCode("94107")
                                .countryCode("US"))
                );
        purchaseUnitRequests.add(purchaseUnitRequest);
        orderRequest.purchaseUnits(purchaseUnitRequests);
        return orderRequest;
    }

    public HttpResponse<Order> createOrder(boolean debug) throws IOException {
        OrdersCreateRequest request = new OrdersCreateRequest().authToken("Bearer " + authenticationToken());
        request.requestBody(buildRequestBody());
        HttpResponse<Order> response = client().execute(request);
        if (debug) {
            if (response.statusCode() == 201) {
                System.out.println("Order id: " + response.result().id());
                System.out.println("Links: ");
                for (LinkDescription link : response.result().links()) {
                    System.out.println("\t" + link.rel() + ": " + link.href() + "\tCall Type: " + link.method());
                }
            }
        }
        return response;
    }

    public static void main(String args[]){
        try {
            new CreateOrder().createOrder(true);
        } catch (com.braintreepayments.http.exceptions.HttpException e){
            System.out.println(e.statusCode());
        }
        catch (Exception e){
            e.printStackTrace();
        }
    }
}
