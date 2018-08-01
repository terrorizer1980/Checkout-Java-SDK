// This class was generated on Fri, 20 Jul 2018 16:05:52 PDT by version 0.1.0-dev+0ee05a-dirty of Braintree SDK Generator
// Customer.java
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
 * The customer who approves and pays for the order. The customer is also known as the payer.
 */
@Model
public class Customer {

    // Required default constructor
    public Customer() {}

	/**
	* The portable international postal address. Maps to [AddressValidationMetadata](https://github.com/googlei18n/libaddressinput/wiki/AddressValidationMetadata) and HTML 5.1 [Autofilling form controls: the autocomplete attribute](https://www.w3.org/TR/html51/sec-forms.html#autofilling-form-controls-the-autocomplete-attribute).
	*/
	@SerializedName("address")
	private PortablePostalAddress address;

	public PortablePostalAddress address() { return address; }
	
	public Customer address(PortablePostalAddress address) {
	    this.address = address;
	    return this;
	}

	/**
	* The stand-alone date, in [Internet date and time format](https://tools.ietf.org/html/rfc3339#section-5.6). To represent special legal values, such as a date of birth, you should use dates with no associated time or time-zone data. Whenever possible, use the standard `date_time` type. This regular expression does not validate all dates. For example, February 31 is valid and nothing is known about leap years.
	*/
	@SerializedName("birth_date")
	private String birthDate;

	public String birthDate() { return birthDate; }
	
	public Customer birthDate(String birthDate) {
	    this.birthDate = birthDate;
	    return this;
	}

	/**
	* The internationalized email address.<blockquote><strong>Note:</strong> Up to 64 characters are allowed before and 255 characters are allowed after the <code>@</code> sign. However, the generally accepted maximum length for an email address is 254 characters. The pattern verifies that an unquoted <code>@</code> sign exists.</blockquote>
	*/
	@SerializedName("email_address")
	private String emailAddress;

	public String emailAddress() { return emailAddress; }
	
	public Customer emailAddress(String emailAddress) {
	    this.emailAddress = emailAddress;
	    return this;
	}

	/**
	* The externally-provided ID of the customer.
	*/
	@SerializedName("external_id")
	private String externalId;

	public String externalId() { return externalId; }
	
	public Customer externalId(String externalId) {
	    this.externalId = externalId;
	    return this;
	}

	/**
	* The name of the party.
	*/
	@SerializedName("name")
	private Name name;

	public Name name() { return name; }
	
	public Customer name(Name name) {
	    this.name = name;
	    return this;
	}

	/**
	* The PayPal payer ID, which is a masked version of the PayPal account number intended for use with third parties. The account number is reversibly encrypted and a proprietary variant of Base32 is used to encode the result.
	*/
	@SerializedName("payer_id")
	private String payerId;

	public String payerId() { return payerId; }
	
	public Customer payerId(String payerId) {
	    this.payerId = payerId;
	    return this;
	}

	/**
	* The phone information.
	*/
	@SerializedName("phone")
	private Phone phone;

	public Phone phone() { return phone; }
	
	public Customer phone(Phone phone) {
	    this.phone = phone;
	    return this;
	}

	/**
	* The tax ID of the customer. The customer is also known as the payer.
	*/
	@SerializedName("tax_info")
	private TaxInformation taxInfo;

	public TaxInformation taxInfo() { return taxInfo; }
	
	public Customer taxInfo(TaxInformation taxInfo) {
	    this.taxInfo = taxInfo;
	    return this;
	}
}
