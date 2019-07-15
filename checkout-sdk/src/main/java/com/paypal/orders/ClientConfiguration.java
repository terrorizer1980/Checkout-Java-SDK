// This class was generated on Thu, 16 May 2019 09:53:44 PDT by version 0.1.0-dev+8fcb5f of Braintree SDK Generator
// ClientConfiguration.java
// @version 0.1.0-dev+8fcb5f
// @type object
// @data H4sIAAAAAAAC/7yVQY8TPQyG79+vsHKuPnHeGwIOCAkqtOKCUOVNnI7FTBIcD8sI8d9Rkm67YVrBoepxEk/s5/Ub56e5XxKZO/NqZAoKNgbP+1lQOQazMZ9QGB9Geo9TiTIb846W08drylY41eDzZ4AOqGAx6SyUQQeCJNHNVsGP8TEDBgc5kWXPFuhHImEKtoaiAsKcScDGKY2klAEh4ZJwBBUMGW3J8b/ZmJciuDSWFxvzkdB9CONi7jyOmcrCt5mF3HFhKzGRKFM2d5+PKmQVDvs1Nybu0Nt3T39f0XhCWQATl8IdaAQV3u9JGvrVaw/zOP7aHAG2B23fHIVcw9DzvRNTt3wOrZ389xbFAAhbXLa37pIdMAQaO6rT2hkkXKZi2GJEOASCLomu3JRL9VJQWXYpctC+E9365bon0iG6g/xDzFTslhVFn8xWw5JESznfCOqQddeK67hWWz3adoVV78+TsSrTcz/B/cAZLAbIcSLliTI8EDj2nqQcpAOG+lcVFKqgwP5JMAz7kmEgFpg4OHBzQap/2IHs1zg3b9xKuXbDdiVlr1u/cfluViPf0MBFyN1pIKwrvxCwJqgtOQU2Eh/b1Lz+LKl8X/6BkIPSvr1kOxRlj7a/qxcCesK3joKyZ5IjU45eH1GozdDDuzBgLr38zq5Zn0IppcY/y3NjO9ro6KwdDxt/NHNJ5Qnw3QRCaykplsbmOM5X7OB/vwEAAP//
// DO NOT EDIT
package com.paypal.orders;

import java.util.Map;
import java.util.HashMap;
import java.util.List;
import java.util.ArrayList;
import com.braintreepayments.http.annotations.*;
/**
 * Client configuration that captures the product flows and specific experiences that a user completes a paypal transaction.
 */
@Model
public class ClientConfiguration {

    // Required default constructor
    public ClientConfiguration() {}

	/**
	* The primary api used to trigger the paypal transaction.
	*/
	@SerializedName("api")
	private String api;

	public String api() { return api; }
	
	public ClientConfiguration api(String api) {
	    this.api = api;
	    return this;
	}

	/**
	* The product experiences that a user completes on a PayPal transaction.
	*/
	@SerializedName("experience")
	private ProductExperience experience;

	public ProductExperience experience() { return experience; }
	
	public ClientConfiguration experience(ProductExperience experience) {
	    this.experience = experience;
	    return this;
	}

	/**
	* Identifier for the software that paypal has provided to enable the integration.
	*/
	@SerializedName("integration_artifact")
	private String integrationArtifact;

	public String integrationArtifact() { return integrationArtifact; }
	
	public ClientConfiguration integrationArtifact(String integrationArtifact) {
	    this.integrationArtifact = integrationArtifact;
	    return this;
	}

	/**
	* Types of the payment acceptance solution.
	*/
	@SerializedName("product_code")
	private String productCode;

	public String productCode() { return productCode; }
	
	public ClientConfiguration productCode(String productCode) {
	    this.productCode = productCode;
	    return this;
	}
}
