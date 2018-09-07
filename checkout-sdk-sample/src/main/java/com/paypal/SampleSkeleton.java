package com.paypal;

import com.paypal.core.PayPalEnvironment;
import com.paypal.core.PayPalHttpClient;
import org.apache.commons.lang3.StringUtils;
import org.json.JSONArray;
import org.json.JSONObject;

import java.util.Iterator;

public class SampleSkeleton {
    // Setting up environment
    private PayPalEnvironment environment = new PayPalEnvironment.Sandbox(
            "AVNCVvV9oQ7qee5O8OW4LSngEeU1dI7lJAGCk91E_bjrXF2LXB2TK2ICXQuGtpcYSqs4mz1BMNQWuso1",
            "EDQzd81k-1z2thZw6typSPOTEjxC_QbJh6IithFQuXdRFc7BjVht5rQapPiTaFt5RC-HCa1ir6mi-H5l");
    // Setting up client for that order
    PayPalHttpClient client = new PayPalHttpClient(environment);

    /**
     * Method to get client object
     * @return PayPalHttpClient client
     */
    public PayPalHttpClient client() {
        return this.client;
    }

    /**
     * Method to pretty print a response
     * @param jo JSONObject
     * @param pre prefix (default="")
     * @return String pretty printed JSON
     */
    public String prettyPrint(JSONObject jo, String pre)
    {
        Iterator<?> keys = jo.keys();
        StringBuilder pretty = new StringBuilder();
        while( keys.hasNext() ) {
            String key = (String)keys.next();
            pretty.append(String.format("%s%s: ", pre, StringUtils.capitalize(key)));
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
}
