// This class was generated on Fri, 20 Jul 2018 16:07:18 PDT by version 0.1.0-dev+0ee05a-dirty of Braintree SDK Generator
// AuthorizationsVoidRequest.java
// @version 0.1.0-dev+0ee05a-dirty
// @type request
// @data H4sIAAAAAAAC/2yS0YpTMRCG732KYa5jz7J4lTvZKruI7tGWBZFFpifTPdE0iZPJYix9dzltFVt7++XPMP/HbPEDbRgtUtUxif9F6lMss+fkHRqccxnE54mhxYfkXTGQBAaKA4digCL8+ckOMrUNRzWwanA3n8HnVKdoTArTwMtp0JEURiqwYo6wriE0GChrFXYzNPixsrSehDasLAXtl0eDt0yO5Zy+TbI5Zz3peMK2uGx56lxUfHxCgw8knlaBL7n4uhfxjtvx8T8ry5Ghp9ZTePnEkYWUHdzNYZ0EdOSLjdPex1TutQi1wz5XBj8xufsYGto1hcIT+FG9sEOrUtlgLymzqOeCNtYQdo+HDBc9DJnghEpOsfC/7CZF5XiMIeUc/LBv2H0rKaLBW9X8nnVMDi3294slHuShxe75ujsuX7rTU+m257p23fF6Ft99/tvkzc/Mg7JbKGktN8kx2uurV7sXvwEAAP//
// DO NOT EDIT
package com.paypal.payments;

import com.braintreepayments.http.*;
import java.util.*;
import java.util.stream.Collectors;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
/**
 * Voids, or cancels, an authorized payment, by ID. You cannot void an authorized payment that has been fully captured.
 */
public class AuthorizationsVoidRequest extends HttpRequest<Void> {

    public AuthorizationsVoidRequest(String authorizationId) {
        super("/v2/payments/authorizations/{authorization_id}/void?", "POST", Void.class);
        try {
            path(path().replace("{authorization_id}", URLEncoder.encode(String.valueOf(authorizationId), "UTF-8")));
        } catch (UnsupportedEncodingException ignored) {}
        
        header("Content-Type", "application/json");
    }
    
}
