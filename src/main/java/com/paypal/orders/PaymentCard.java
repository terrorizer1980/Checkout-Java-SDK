// This class was generated on Fri, 20 Jul 2018 16:05:52 PDT by version 0.1.0-dev+0ee05a-dirty of Braintree SDK Generator
// PaymentCard.java
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
 * The payment card to use to fund a payment. Can be a credit or debit card.
 */
@Model
public class PaymentCard {

    // Required default constructor
    public PaymentCard() {}

	/**
	* The portable international postal address. Maps to [AddressValidationMetadata](https://github.com/googlei18n/libaddressinput/wiki/AddressValidationMetadata) and HTML 5.1 [Autofilling form controls: the autocomplete attribute](https://www.w3.org/TR/html51/sec-forms.html#autofilling-form-controls-the-autocomplete-attribute).
	*/
	@SerializedName("billing_address")
	private PortablePostalAddress billingAddress;

	public PortablePostalAddress billingAddress() { return billingAddress; }
	
	public PaymentCard billingAddress(PortablePostalAddress billingAddress) {
	    this.billingAddress = billingAddress;
	    return this;
	}

	/**
	* The card network or brand. Applies to credit, debit, gift, and payment cards.
	*/
	@SerializedName("card_type")
	private String cardType;

	public String cardType() { return cardType; }
	
	public PaymentCard cardType(String cardType) {
	    this.cardType = cardType;
	    return this;
	}

	/**
	* REQUIRED
	* The year and month, in ISO-8601 `YYYY-MM` date format. See [Internet date and time format](https://tools.ietf.org/html/rfc3339#section-5.6).
	*/
	@SerializedName("expiry")
	private String expiry;

	public String expiry() { return expiry; }
	
	public PaymentCard expiry(String expiry) {
	    this.expiry = expiry;
	    return this;
	}

	/**
	* The PayPal-generated ID for the card.
	*/
	@SerializedName("id")
	private String id;

	public String id() { return id; }
	
	public PaymentCard id(String id) {
	    this.id = id;
	    return this;
	}

	/**
	* The last digits of the payment card.
	*/
	@SerializedName("last_digits")
	private String lastDigits;

	public String lastDigits() { return lastDigits; }
	
	public PaymentCard lastDigits(String lastDigits) {
	    this.lastDigits = lastDigits;
	    return this;
	}

	/**
	* The card holder's name as it appears on the card.
	*/
	@SerializedName("name")
	private String name;

	public String name() { return name; }
	
	public PaymentCard name(String name) {
	    this.name = name;
	    return this;
	}

	/**
	* REQUIRED
	* The primary account number (PAN) for the payment card.
	*/
	@SerializedName("number")
	private String number;

	public String number() { return number; }
	
	public PaymentCard number(String number) {
	    this.number = number;
	    return this;
	}

	/**
	* The three- or four-digit security code of the card. Also known as the CVV, CVC, CVN, CVE, or CID.
	*/
	@SerializedName("security_code")
	private String securityCode;

	public String securityCode() { return securityCode; }
	
	public PaymentCard securityCode(String securityCode) {
	    this.securityCode = securityCode;
	    return this;
	}
}
