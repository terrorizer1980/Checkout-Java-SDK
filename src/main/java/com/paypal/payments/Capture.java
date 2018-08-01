// This class was generated on Fri, 20 Jul 2018 16:07:18 PDT by version 0.1.0-dev+0ee05a-dirty of Braintree SDK Generator
// Capture.java
// @version 0.1.0-dev+0ee05a-dirty
// @type object
// @data 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
// DO NOT EDIT
package com.paypal.payments;

import java.util.Map;
import java.util.HashMap;
import java.util.List;
import java.util.ArrayList;
import com.braintreepayments.http.annotations.*;
/**
 * A captured payment.
 */
@Model
public class Capture {

    // Required default constructor
    public Capture() {}

	/**
	* The currency and amount for a financial transaction, such as a balance or payment due.
	*/
	@SerializedName("amount")
	private Money amount;

	public Money amount() { return amount; }
	
	public Capture amount(Money amount) {
	    this.amount = amount;
	    return this;
	}

	/**
	* The date and time, in [Internet date and time format](https://tools.ietf.org/html/rfc3339#section-5.6). Seconds are required while fractional seconds are optional.<blockquote><strong>Note:</strong> The regular expression provides guidance but does not reject all invalid dates.</blockquote>
	*/
	@SerializedName("create_time")
	private String createTime;

	public String createTime() { return createTime; }
	
	public Capture createTime(String createTime) {
	    this.createTime = createTime;
	    return this;
	}

	/**
	* The funds that are held on behalf of the merchant.
	*/
	@SerializedName("disbursement_mode")
	private String disbursementMode;

	public String disbursementMode() { return disbursementMode; }
	
	public Capture disbursementMode(String disbursementMode) {
	    this.disbursementMode = disbursementMode;
	    return this;
	}

	/**
	* Indicates whether additional captured payments can be made against an authorized payment. Value is:<ul><li><code>true</code>. You cannot make captured payments against this authorized payment. When no explicit authorized payment exists, default is <code>true</code>.</li><li><code>false</code>. You can make additional captured payments against this authorized payment.</li></ul>
	*/
	@SerializedName("final_capture")
	private Boolean finalCapture;

	public Boolean finalCapture() { return finalCapture; }
	
	public Capture finalCapture(Boolean finalCapture) {
	    this.finalCapture = finalCapture;
	    return this;
	}

	/**
	* The PayPal-generated ID for the captured payment.
	*/
	@SerializedName("id")
	private String id;

	public String id() { return id; }
	
	public Capture id(String id) {
	    this.id = id;
	    return this;
	}

	/**
	* The merchant-defined ID of the invoice that is associated with this captured payment.
	*/
	@SerializedName("invoice_id")
	private String invoiceId;

	public String invoiceId() { return invoiceId; }
	
	public Capture invoiceId(String invoiceId) {
	    this.invoiceId = invoiceId;
	    return this;
	}

	/**
	* An array of related [HATEOAS links](/docs/api/overview/#hateoas-links).
	*/
	@SerializedName(value = "links", listClass = LinkDescription.class)
	private List<LinkDescription> links;

	public List<LinkDescription> links() { return links; }
	
	public Capture links(List<LinkDescription> links) {
	    this.links = links;
	    return this;
	}

	/**
	* The level of protection offered as defined by [PayPal Seller Protection for Merchants](https://www.paypal.com/us/webapps/mpp/security/seller-protection).
	*/
	@SerializedName("seller_protection")
	private SellerProtection sellerProtection;

	public SellerProtection sellerProtection() { return sellerProtection; }
	
	public Capture sellerProtection(SellerProtection sellerProtection) {
	    this.sellerProtection = sellerProtection;
	    return this;
	}

	/**
	* The detailed breakdown of the captured payment.
	*/
	@SerializedName("seller_receivable_breakdown")
	private MerchantReceivableBreakdown sellerReceivableBreakdown;

	public MerchantReceivableBreakdown sellerReceivableBreakdown() { return sellerReceivableBreakdown; }
	
	public Capture sellerReceivableBreakdown(MerchantReceivableBreakdown sellerReceivableBreakdown) {
	    this.sellerReceivableBreakdown = sellerReceivableBreakdown;
	    return this;
	}

	/**
	* The status of the captured payment.
	*/
	@SerializedName("status")
	private String status;

	public String status() { return status; }
	
	public Capture status(String status) {
	    this.status = status;
	    return this;
	}

	/**
	* The details of the captured payment status.
	*/
	@SerializedName("status_details")
	private StatusDetails statusDetails;

	public StatusDetails statusDetails() { return statusDetails; }
	
	public Capture statusDetails(StatusDetails statusDetails) {
	    this.statusDetails = statusDetails;
	    return this;
	}

	/**
	* The date and time, in [Internet date and time format](https://tools.ietf.org/html/rfc3339#section-5.6). Seconds are required while fractional seconds are optional.<blockquote><strong>Note:</strong> The regular expression provides guidance but does not reject all invalid dates.</blockquote>
	*/
	@SerializedName("update_time")
	private String updateTime;

	public String updateTime() { return updateTime; }
	
	public Capture updateTime(String updateTime) {
	    this.updateTime = updateTime;
	    return this;
	}
}
