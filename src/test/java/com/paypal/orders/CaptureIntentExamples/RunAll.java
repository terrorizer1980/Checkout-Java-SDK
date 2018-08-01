package com.paypal.orders.CaptureIntentExamples;
import com.braintreepayments.http.HttpResponse;
import com.paypal.orders.CaptureIntentExamples.*;
import com.paypal.orders.LinkDescription;
import com.paypal.orders.Order;


public class RunAll {
    public static void main(String[] args) {
        try {
            HttpResponse<Order> orderResponse = new CreateOrder().createOrder(false);
            String orderId = "";
            System.out.println("Creating Order...");
            if (orderResponse.statusCode() == 201){
                orderId = orderResponse.result().id();
                System.out.println("Links:");
                for (LinkDescription link : orderResponse.result().links()) {
                    System.out.println("\t" + link.rel() + ": " + link.href());
                }
            }
            System.out.println("Created Successfully\n");
            System.out.println("Copy approve link and paste it in browser. Login with buyer account and follow the instructions.\nOnce approved hit enter...");
            System.in.read();
            System.out.println("Capturing Order...");
            orderResponse = new CaptureOrder().captureOrder(orderId, false);
            if (orderResponse.statusCode() == 201){
                System.out.println("Captured Successfully");
                System.out.println("Status Code: " + orderResponse.statusCode());
                System.out.println("Status: " + orderResponse.result().status());
                System.out.println("Order ID: " + orderResponse.result().id());
                System.out.println("Links:");
                for (LinkDescription link : orderResponse.result().links()) {
                    System.out.println("\t" + link.rel() + ": " + link.href());
                }
            }


        } catch(Exception e){
            e.printStackTrace();
        }
    }
}
