// This class was generated on Fri, 20 Jul 2018 16:05:52 PDT by version 0.1.0-dev+0ee05a-dirty of Braintree SDK Generator
// Authorization.java
// @version 0.1.0-dev+0ee05a-dirty
// @type object
// @data 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
// DO NOT EDIT
package com.paypal.orders;

import java.util.Map;
import java.util.HashMap;
import java.util.List;
import java.util.ArrayList;
import com.braintreepayments.http.annotations.*;
/**
 * The authorized payment transaction.
 */
@Model
public class Authorization {

    // Required default constructor
    public Authorization() {}

	/**
	* The currency and amount for a financial transaction, such as a balance or payment due.
	*/
	@SerializedName("amount")
	private Money amount;

	public Money amount() { return amount; }
	
	public Authorization amount(Money amount) {
	    this.amount = amount;
	    return this;
	}

	/**
	* The date and time, in [Internet date and time format](https://tools.ietf.org/html/rfc3339#section-5.6). Seconds are required while fractional seconds are optional.<blockquote><strong>Note:</strong> The regular expression provides guidance but does not reject all invalid dates.</blockquote>
	*/
	@SerializedName("create_time")
	private String createTime;

	public String createTime() { return createTime; }
	
	public Authorization createTime(String createTime) {
	    this.createTime = createTime;
	    return this;
	}

	/**
	* The date and time, in [Internet date and time format](https://tools.ietf.org/html/rfc3339#section-5.6). Seconds are required while fractional seconds are optional.<blockquote><strong>Note:</strong> The regular expression provides guidance but does not reject all invalid dates.</blockquote>
	*/
	@SerializedName("expiration_time")
	private String expirationTime;

	public String expirationTime() { return expirationTime; }
	
	public Authorization expirationTime(String expirationTime) {
	    this.expirationTime = expirationTime;
	    return this;
	}

	/**
	* The PayPal-generated ID for the authorized payment.
	*/
	@SerializedName("id")
	private String id;

	public String id() { return id; }
	
	public Authorization id(String id) {
	    this.id = id;
	    return this;
	}

	/**
	* The merchant-defined ID for the invoice for this authorized payment.
	*/
	@SerializedName("invoice_id")
	private String invoiceId;

	public String invoiceId() { return invoiceId; }
	
	public Authorization invoiceId(String invoiceId) {
	    this.invoiceId = invoiceId;
	    return this;
	}

	/**
	* An array of related [HATEOAS links](/docs/api/overview/#hateoas-links).
	*/
	@SerializedName(value = "links", listClass = LinkDescription.class)
	private List<LinkDescription> links;

	public List<LinkDescription> links() { return links; }
	
	public Authorization links(List<LinkDescription> links) {
	    this.links = links;
	    return this;
	}

	/**
	* The level of protection offered as defined by [PayPal Seller Protection for Merchants](https://www.paypal.com/us/webapps/mpp/security/seller-protection).
	*/
	@SerializedName("seller_protection")
	private SellerProtection sellerProtection;

	public SellerProtection sellerProtection() { return sellerProtection; }
	
	public Authorization sellerProtection(SellerProtection sellerProtection) {
	    this.sellerProtection = sellerProtection;
	    return this;
	}

	/**
	* The status for the authorized payment.
	*/
	@SerializedName("status")
	private String status;

	public String status() { return status; }
	
	public Authorization status(String status) {
	    this.status = status;
	    return this;
	}

	/**
	* The date and time, in [Internet date and time format](https://tools.ietf.org/html/rfc3339#section-5.6). Seconds are required while fractional seconds are optional.<blockquote><strong>Note:</strong> The regular expression provides guidance but does not reject all invalid dates.</blockquote>
	*/
	@SerializedName("update_time")
	private String updateTime;

	public String updateTime() { return updateTime; }
	
	public Authorization updateTime(String updateTime) {
	    this.updateTime = updateTime;
	    return this;
	}
}
