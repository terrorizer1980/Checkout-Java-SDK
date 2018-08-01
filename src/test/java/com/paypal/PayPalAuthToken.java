package com.paypal;

import org.json.*;
import org.apache.http.HttpHeaders;
import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.HttpClientBuilder;

import javax.activation.MimeType;
import javax.net.ssl.HttpsURLConnection;
import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;
import java.nio.charset.StandardCharsets;
import java.util.Base64;
import java.util.Scanner;

public class PayPalAuthToken {
    public String createAuthToken(String clientId, String secret){
        String access_token = "";
        try {
            URL url = new URL("https://api.sandbox.paypal.com/v1/oauth2/token");

            HttpsURLConnection connection = (HttpsURLConnection) url.openConnection();
            connection.setRequestMethod("POST");

            String credentials = clientId + ":" + secret;
            String encodedData = Base64.getEncoder().encodeToString(credentials.getBytes(StandardCharsets.UTF_8));
            connection.setDoOutput(true);
            connection.setRequestProperty("Authorization", "Basic " + encodedData);
            String urlparameters = "grant_type=client_credentials";
            DataOutputStream dataOutputStream = new DataOutputStream(connection.getOutputStream());
            dataOutputStream.writeBytes(urlparameters);
            dataOutputStream.flush();
            dataOutputStream.close();
            BufferedReader in = new BufferedReader(
                    new InputStreamReader(connection.getInputStream()));
            String inputLine;
            StringBuffer response = new StringBuffer();

            while ((inputLine = in.readLine()) != null) {
                response.append(inputLine);
            }
            in.close();
            JSONObject jsonObject = new JSONObject(response.toString());
            access_token = jsonObject.get("access_token").toString();

        } catch (Exception e){
            e.printStackTrace();
        }
        return access_token;
    }
    public static void main(String[] args){
        String data = new PayPalAuthToken().createAuthToken("AVNCVvV9oQ7qee5O8OW4LSngEeU1dI7lJAGCk91E_bjrXF2LXB2TK2ICXQuGtpcYSqs4mz1BMNQWuso1",
                            "EDQzd81k-1z2thZw6typSPOTEjxC_QbJh6IithFQuXdRFc7BjVht5rQapPiTaFt5RC-HCa1ir6mi-H5l");
        System.out.println(data);
    }
}
