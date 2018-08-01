// This class was generated on Fri, 20 Jul 2018 16:05:52 PDT by version 0.1.0-dev+0ee05a-dirty of Braintree SDK Generator
// Refund.java
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
 * The refund information.
 */
@Model
public class Refund {

    // Required default constructor
    public Refund() {}

	/**
	* The currency and amount for a financial transaction, such as a balance or payment due.
	*/
	@SerializedName("amount")
	private Money amount;

	public Money amount() { return amount; }
	
	public Refund amount(Money amount) {
	    this.amount = amount;
	    return this;
	}

	/**
	* The date and time, in [Internet date and time format](https://tools.ietf.org/html/rfc3339#section-5.6). Seconds are required while fractional seconds are optional.<blockquote><strong>Note:</strong> The regular expression provides guidance but does not reject all invalid dates.</blockquote>
	*/
	@SerializedName("create_time")
	private String createTime;

	public String createTime() { return createTime; }
	
	public Refund createTime(String createTime) {
	    this.createTime = createTime;
	    return this;
	}

	/**
	* The PayPal-generated ID for the refund.
	*/
	@SerializedName("id")
	private String id;

	public String id() { return id; }
	
	public Refund id(String id) {
	    this.id = id;
	    return this;
	}

	/**
	* The merchant-defined ID of the invoice for this refund.
	*/
	@SerializedName("invoice_id")
	private String invoiceId;

	public String invoiceId() { return invoiceId; }
	
	public Refund invoiceId(String invoiceId) {
	    this.invoiceId = invoiceId;
	    return this;
	}

	/**
	* An array of related [HATEOAS links](/docs/api/overview/#hateoas-links).
	*/
	@SerializedName(value = "links", listClass = LinkDescription.class)
	private List<LinkDescription> links;

	public List<LinkDescription> links() { return links; }
	
	public Refund links(List<LinkDescription> links) {
	    this.links = links;
	    return this;
	}

	/**
	* The reason for the refund.
	*/
	@SerializedName("note_to_payer")
	private String noteToPayer;

	public String noteToPayer() { return noteToPayer; }
	
	public Refund noteToPayer(String noteToPayer) {
	    this.noteToPayer = noteToPayer;
	    return this;
	}

	/**
	* The breakdown of the refund.
	*/
	@SerializedName("seller_payable_breakdown")
	private MerchantPayableBreakdown sellerPayableBreakdown;

	public MerchantPayableBreakdown sellerPayableBreakdown() { return sellerPayableBreakdown; }
	
	public Refund sellerPayableBreakdown(MerchantPayableBreakdown sellerPayableBreakdown) {
	    this.sellerPayableBreakdown = sellerPayableBreakdown;
	    return this;
	}

	/**
	* The status of the capture.
	*/
	@SerializedName("status")
	private String status;

	public String status() { return status; }
	
	public Refund status(String status) {
	    this.status = status;
	    return this;
	}

	/**
	* The details of the refund status.
	*/
	@SerializedName("status_details")
	private StatusDetails statusDetails;

	public StatusDetails statusDetails() { return statusDetails; }
	
	public Refund statusDetails(StatusDetails statusDetails) {
	    this.statusDetails = statusDetails;
	    return this;
	}

	/**
	* The date and time, in [Internet date and time format](https://tools.ietf.org/html/rfc3339#section-5.6). Seconds are required while fractional seconds are optional.<blockquote><strong>Note:</strong> The regular expression provides guidance but does not reject all invalid dates.</blockquote>
	*/
	@SerializedName("update_time")
	private String updateTime;

	public String updateTime() { return updateTime; }
	
	public Refund updateTime(String updateTime) {
	    this.updateTime = updateTime;
	    return this;
	}
}
