// This class was generated on Fri, 20 Jul 2018 16:05:52 PDT by version 0.1.0-dev+0ee05a-dirty of Braintree SDK Generator
// PurchaseUnitRequest.java
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
 * The purchase unit request. Includes required information for the payment contract.
 */
@Model
public class PurchaseUnitRequest {

    // Required default constructor
    public PurchaseUnitRequest() {}

	/**
	* REQUIRED
	* The total order amount with an optional breakdown that provides details, such as the total item amount, total tax amount, shipping, handling, gift wrap, insurance, and discounts, if any.<br/>If you specify `amount.breakdown`, the amount equals `item_total` plus `tax_total` plus `shipping` plus `handling` plus `gift_wrap` plus `insurance` minus `shipping_discount`.<br/>The amount must be a positive number with decimal precision and a PayPal-supported <a href="https://developer.paypal.com/docs/integration/direct/rest/currency-codes/">currency</a>.
	*/
	@SerializedName("amount")
	private AmountWithBreakdown amount;

	public AmountWithBreakdown amount() { return amount; }
	
	public PurchaseUnitRequest amount(AmountWithBreakdown amount) {
	    this.amount = amount;
	    return this;
	}

	/**
	* The client-provided external ID. Used to reconcile client transactions with PayPal transactions. Appears in transaction and settlement reports.
	*/
	@SerializedName("custom_id")
	private String customId;

	public String customId() { return customId; }
	
	public PurchaseUnitRequest customId(String customId) {
	    this.customId = customId;
	    return this;
	}

	/**
	* The purchase description.
	*/
	@SerializedName("description")
	private String description;

	public String description() { return description; }
	
	public PurchaseUnitRequest description(String description) {
	    this.description = description;
	    return this;
	}

	/**
	* The partner-provided external invoice number for this order.
	*/
	@SerializedName("invoice_id")
	private String invoiceId;

	public String invoiceId() { return invoiceId; }
	
	public PurchaseUnitRequest invoiceId(String invoiceId) {
	    this.invoiceId = invoiceId;
	    return this;
	}

	/**
	* An array of items that the customer is purchasing from the merchant.
	*/
	@SerializedName(value = "items", listClass = Item.class)
	private List<Item> items;

	public List<Item> items() { return items; }
	
	public PurchaseUnitRequest items(List<Item> items) {
	    this.items = items;
	    return this;
	}

	/**
	* The merchant who receives the funds and fulfills the order. The merchant is also known as the payee.
	*/
	@SerializedName("payee")
	private Payee payee;

	public Payee payee() { return payee; }
	
	public PurchaseUnitRequest payee(Payee payee) {
	    this.payee = payee;
	    return this;
	}

	/**
	* Any additional payment instructions for PayPal for Partner customers. Enables features for partners and marketplaces, such as delayed disbursement and collection of a platform fee. Applies during order creation for captured payments or during capture of authorized payments.
	*/
	@SerializedName("payment_instruction")
	private PaymentInstruction paymentInstruction;

	public PaymentInstruction paymentInstruction() { return paymentInstruction; }
	
	public PurchaseUnitRequest paymentInstruction(PaymentInstruction paymentInstruction) {
	    this.paymentInstruction = paymentInstruction;
	    return this;
	}

	/**
	* The ID for the purchase unit. Required for multiple purchase units where you must update the order by using `PATCH`.
	*/
	@SerializedName("reference_id")
	private String referenceId;

	public String referenceId() { return referenceId; }
	
	public PurchaseUnitRequest referenceId(String referenceId) {
	    this.referenceId = referenceId;
	    return this;
	}

	/**
	* The shipping details.
	*/
	@SerializedName("shipping")
	private ShippingDetails shipping;

	public ShippingDetails shipping() { return shipping; }
	
	public PurchaseUnitRequest shipping(ShippingDetails shipping) {
	    this.shipping = shipping;
	    return this;
	}

	/**
	* The payment descriptor on the payer's credit card statement.
	*/
	@SerializedName("soft_descriptor")
	private String softDescriptor;

	public String softDescriptor() { return softDescriptor; }
	
	public PurchaseUnitRequest softDescriptor(String softDescriptor) {
	    this.softDescriptor = softDescriptor;
	    return this;
	}
}
