package com.paypal.orders;

import com.braintreepayments.http.HttpResponse;
import com.paypal.Skeleton;
import com.braintreepayments.http.exceptions.HttpException;
import org.json.JSONObject;

import java.io.IOException;
import java.util.*;

public class ErrorSample extends Skeleton {
    /**
     * Body has no required parameters (intent, purchase_units)
     */
    public void createError1() {
        OrdersCreateRequest request = new OrdersCreateRequest().authToken("Bearer " + authenticationToken());
        request.requestBody(new OrderRequest());
        System.out.println("Request Body: {}");
        System.out.println("Response:");
        try {
            HttpResponse<Order> response = client().execute(request);
        } catch (IOException e){
            HttpException h = (HttpException) e;
            JSONObject message = new JSONObject(h.getMessage());
            System.out.println("Status Code: " + h.statusCode());
            System.out.println("Debug ID: " + message.get("debug_id"));
            System.out.println("Details:");
            System.out.println("\tName: " + message.get("name"));
            System.out.println("\tMessage: " + message.get("message"));
            System.out.println("\tProblems:");
            int sno = 1;
            for (Object detail: message.getJSONArray("details")){
                JSONObject obj = (JSONObject) detail;
                System.out.println("\t\t" + sno++ + ". Field: " + obj.getString("field") + "\tIssue: " + obj.getString("issue"));
            }
            System.out.println();
        }
    }

    /**
     * Authorization header has an empty string
     */
    public void createError2() {
        OrdersCreateRequest request = new OrdersCreateRequest().authToken("");
        request.requestBody(new OrderRequest()
                .intent("CAPTURE")
                .purchaseUnits(new ArrayList<PurchaseUnitRequest>() {{
                    add(new PurchaseUnitRequest().amount(new AmountWithBreakdown().currencyCode("USD").value("100.00")));
                }}));
        System.out.println("Request Body:");
        System.out.println("{\n" +
                "   \"intent\": \"CAPTURE\",\n" +
                "   \"purchase_units\": [\n" +
                "       {\n" +
                "           \"amount\": {\n" +
                "               \"currency_code\": \"USD\",\n" +
                "               \"value\": \"100.00\"\n" +
                "           }\n" +
                "       }\n" +
                "   ]\n" +
                "}");
        System.out.println("Response:");
        try {
            HttpResponse<Order> response = client().execute(request);
        } catch (IOException e){
            HttpException h = (HttpException) e;
            JSONObject message = new JSONObject(h.getMessage());
            System.out.println("Status Code: " + h.statusCode());
            System.out.println("Details:");
            System.out.println("\tName: " + message.get("name"));
            System.out.println("\tMessage: " + message.get("message"));
            System.out.println();
        }
    }

    public void createError3() {
        OrdersCreateRequest request = new OrdersCreateRequest().authToken("Bearer " + authenticationToken());
        request.requestBody(new OrderRequest()
                .intent("INVALID")
                .purchaseUnits(new ArrayList<PurchaseUnitRequest>() {{
                    add(new PurchaseUnitRequest().amount(new AmountWithBreakdown().currencyCode("USD").value("100.00")));
                }}));
        System.out.println("Request Body:");
        System.out.println("{\n" +
                "   \"intent\": \"INVALID\",\n" +
                "   \"purchase_units\": [\n" +
                "       {\n" +
                "           \"amount\": {\n" +
                "               \"currency_code\": \"USD\",\n" +
                "               \"value\": \"100.00\"\n" +
                "           }\n" +
                "       }\n" +
                "   ]\n" +
                "}");
        System.out.println("Response:");
        try {
            HttpResponse<Order> response = client().execute(request);
        } catch (IOException e){
            HttpException h = (HttpException) e;
            JSONObject message = new JSONObject(h.getMessage());
            System.out.println("Status Code: " + h.statusCode());
            System.out.println("Details:");
            System.out.println("\tName: " + message.get("name"));
            System.out.println("\tMessage: " + message.get("message"));
            System.out.println("\tProblems:");
            int sno = 1;
            for (Object detail: message.getJSONArray("details")){
                JSONObject obj = (JSONObject) detail;
                System.out.println("\t\t" + sno++ + ". Field: " + obj.getString("field") + "\tIssue: " + obj.getString("issue"));
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        ErrorSample errorSample = new ErrorSample();

        System.out.println("Calling createError1...");
        errorSample.createError1();

        System.out.println("Calling createError2...");
        errorSample.createError2();

        System.out.println("Calling createError3...");
        errorSample.createError3();

    }
}
