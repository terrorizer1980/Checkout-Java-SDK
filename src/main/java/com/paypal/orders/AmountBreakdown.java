// This class was generated on Fri, 20 Jul 2018 16:05:52 PDT by version 0.1.0-dev+0ee05a-dirty of Braintree SDK Generator
// AmountBreakdown.java
// @version 0.1.0-dev+0ee05a-dirty
// @type object
// @data H4sIAAAAAAAC/+yYX2vbSBTF3/dTXPS0C0qU/QMLfssmLLSlSWhDoaTBuZ65si4Zzah3RklEyXcvI1uOFLuUQJ7qebJ15t+9x0c/LH3LLruGsll2XLvWBvhPCG+1u7dZnn1CYVwYOsM6zsjy7B11Txen5JVwE9jZbJZdVgSLYTG4EkJFgP2mh0+7QiPujjV50BSQjQffqgrQQ3ABDXCger0qX0sBHzaKr7hp2C5zqNBq039bchngXrDJga1vBa2iHNBq0OxVXOdz4BLQdodZnh2LYLfq+SjPPhDqc2u6bFai8RSFry0L6Y1wIa4hCUw+m11t3HrvLHXbFsVa5rGWiVdjdds01YqQVV1f8qpRKJ0AQskWreLogaD1qOKqfOMYwgJN7BacQINdTTaAbun1uvRB2C632xxKniunadLq85Htdq9CJUQHqkJBFUjgzcfzg3/++vPfJyPi2uvfC+2UL9gGWgrGDQrNQioUQj4Uw+SDONkXf0CoMABrsoFLJt/Hb5j0IkeCtM8Msa0xj/lPXblD007dGJRtF/qRHO4rVhXUvKwCLGj2pT06+lu1pv+k1ZXh1dWxhd4Lkj4d69Zip4ZvCW7eXny+WZmAQmBdgNA1rNCYDkpZZQfN4WrTYtj12RmgSXGNZrNi91mXZ6ejs3y70Bxvah0rdBAq13q0OlR+93HF0OH/TvrfSdbmg23rBUmkx1BIY1CRX98Qk4Tk4Ing6mTQTmIQXhqb10jG9SgbP+DCQKtJOkZiokKiQqLCvlFh83dlEo+xmriQuJC4sHdcCFTP+4efKRjGciJDIkMiw76RYXj/MUnHSExUSFRIVNhXKsyHF5478TAeTZxInEic2DdOBHzY8VgxVhMXEhcSF34xLlw//vYdAAD//w==
// DO NOT EDIT
package com.paypal.orders;

import java.util.Map;
import java.util.HashMap;
import java.util.List;
import java.util.ArrayList;
import com.braintreepayments.http.annotations.*;
/**
 * The breakdown of the amount. Breakdown provides details such as total item amount, total tax amount, shipping, handling, gift wrap, insurance, and discounts, if any.
 */
@Model
public class AmountBreakdown {

    // Required default constructor
    public AmountBreakdown() {}

	/**
	* The currency and amount for a financial transaction, such as a balance or payment due.
	*/
	@SerializedName("gift_wrap")
	private Money giftWrap;

	public Money giftWrap() { return giftWrap; }
	
	public AmountBreakdown giftWrap(Money giftWrap) {
	    this.giftWrap = giftWrap;
	    return this;
	}

	/**
	* The currency and amount for a financial transaction, such as a balance or payment due.
	*/
	@SerializedName("handling")
	private Money handling;

	public Money handling() { return handling; }
	
	public AmountBreakdown handling(Money handling) {
	    this.handling = handling;
	    return this;
	}

	/**
	* The currency and amount for a financial transaction, such as a balance or payment due.
	*/
	@SerializedName("insurance")
	private Money insurance;

	public Money insurance() { return insurance; }
	
	public AmountBreakdown insurance(Money insurance) {
	    this.insurance = insurance;
	    return this;
	}

	/**
	* The currency and amount for a financial transaction, such as a balance or payment due.
	*/
	@SerializedName("item_total")
	private Money itemTotal;

	public Money itemTotal() { return itemTotal; }
	
	public AmountBreakdown itemTotal(Money itemTotal) {
	    this.itemTotal = itemTotal;
	    return this;
	}

	/**
	* The currency and amount for a financial transaction, such as a balance or payment due.
	*/
	@SerializedName("shipping")
	private Money shipping;

	public Money shipping() { return shipping; }
	
	public AmountBreakdown shipping(Money shipping) {
	    this.shipping = shipping;
	    return this;
	}

	/**
	* The currency and amount for a financial transaction, such as a balance or payment due.
	*/
	@SerializedName("shipping_discount")
	private Money shippingDiscount;

	public Money shippingDiscount() { return shippingDiscount; }
	
	public AmountBreakdown shippingDiscount(Money shippingDiscount) {
	    this.shippingDiscount = shippingDiscount;
	    return this;
	}

	/**
	* The currency and amount for a financial transaction, such as a balance or payment due.
	*/
	@SerializedName("tax_total")
	private Money taxTotal;

	public Money taxTotal() { return taxTotal; }
	
	public AmountBreakdown taxTotal(Money taxTotal) {
	    this.taxTotal = taxTotal;
	    return this;
	}
}
