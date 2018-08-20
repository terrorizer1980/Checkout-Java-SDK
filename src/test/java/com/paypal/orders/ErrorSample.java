package com.paypal.orders;

import com.braintreepayments.http.HttpResponse;
import com.paypal.core.Skeleton;
import com.braintreepayments.http.exceptions.HttpException;
import com.paypal.core.Skeleton;
import org.json.JSONArray;
import org.json.JSONObject;

import java.io.IOException;
import java.util.*;

import static org.apache.commons.lang3.text.WordUtils.capitalize;

public class ErrorSample extends Skeleton {

    public String prettyPrint(JSONObject jo, String pre)
    {
        Iterator<?> keys = jo.keys();
        StringBuilder pretty = new StringBuilder();
        while( keys.hasNext() ) {
            String key = (String)keys.next();
            pretty.append(String.format("%s%s: ", pre, capitalize(key)));
            if (jo.get(key) instanceof JSONObject) {
                pretty.append(prettyPrint(jo.getJSONObject(key), pre + "\t"));
            }
            else if (jo.get(key) instanceof JSONArray){
                int sno = 1;
                for ( Object jsonObject: jo.getJSONArray(key)){
                    pretty.append(String.format("\n%s\t%d:\n", pre, sno++));
                    pretty.append(prettyPrint((JSONObject) jsonObject, pre + "\t\t"));
                }
            }
            else{
                pretty.append(String.format("%s\n", jo.getString(key)));
            }
        }
        return pretty.toString();
    }

    /**
     * Body has no required parameters (intent, purchase_units)
     */
    public void createError1() {
        OrdersCreateRequest request = new OrdersCreateRequest().authToken("Bearer " + authenticationToken());
        request.requestBody(new OrderRequest());
        System.out.println("Request Body: {}\n");
        System.out.println("Response:");
        try {
            HttpResponse<Order> response = client().execute(request);
        } catch (IOException e){
            HttpException h = (HttpException) e;
            JSONObject message = new JSONObject(h.getMessage());
            System.out.println(this.prettyPrint(message, ""));
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
                "}\n");
        System.out.println("Response:");
        try {
            HttpResponse<Order> response = client().execute(request);
        } catch (IOException e){
            HttpException h = (HttpException) e;
            JSONObject message = new JSONObject(h.getMessage());
            System.out.println(this.prettyPrint(message, ""));
        }
    }

    /**
     * Body has invalid parameter value for intent
     */
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
                "}\n");
        System.out.println("Response:");
        try {
            HttpResponse<Order> response = client().execute(request);
        } catch (IOException e){
            HttpException h = (HttpException) e;
            JSONObject message = new JSONObject(h.getMessage());
            System.out.println(this.prettyPrint(message, ""));
            System.out.println();
        }
    }
    public static void main(String[] args) {
        ErrorSample errorSample = new ErrorSample();

        System.out.println("Calling createError1 (Body has no required parameters (intent, purchase_units))");
        errorSample.createError1();

        System.out.println("Calling createError2 (Authorization header has an empty string)");
        errorSample.createError2();

        System.out.println("Calling createError3 (Body has invalid parameter value for intent)");
        errorSample.createError3();

    }
}
