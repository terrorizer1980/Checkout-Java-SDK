// This class was generated on Fri, 20 Jul 2018 16:05:52 PDT by version 0.1.0-dev+0ee05a-dirty of Braintree SDK Generator
// PaymentSource.java
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
 * The payment source definition.
 */
@Model
public class PaymentSource {

    // Required default constructor
    public PaymentSource() {}

	/**
	* The payment card to use to fund a payment. Can be a credit or debit card.
	*/
	@SerializedName("card")
	private PaymentCard card;

	public PaymentCard card() { return card; }
	
	public PaymentSource card(PaymentCard card) {
	    this.card = card;
	    return this;
	}

	/**
	* The tokenized payment source to fund a payment.
	*/
	@SerializedName("token")
	private Token token;

	public Token token() { return token; }
	
	public PaymentSource token(Token token) {
	    this.token = token;
	    return this;
	}
}
