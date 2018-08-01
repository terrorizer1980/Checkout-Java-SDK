// This class was generated on Fri, 20 Jul 2018 16:05:52 PDT by version 0.1.0-dev+0ee05a-dirty of Braintree SDK Generator
// TaxInformation.java
// @version 0.1.0-dev+0ee05a-dirty
// @type object
// @data H4sIAAAAAAAC/6yQwUvrQBDG7++vGPbyLiG8wjvlJvQighYNXkTKNDtpBje768xGu0j/d0lsq1IPFT3Ox4/h+30vps6RTGVq3MC5b4P0mDh4U5hbFMaVo0vsR8AU5oLy+zEnbYTjBFem7gjS+GIOoYXUETSDptCTlFB/uIAV0GmABx+ePaBObMRMUprCnIlgfmv0rzDXhPbKu2yqFp3SGDwOLGQPwUJCJElMaqq7g4smYb8+Vki4WbL9JHKIjnX2lf/qzqyEmyHGIIkstEGm5gvMC3SjQE8+QU+pCxaCd7mEOkdu0LlcTOhuHlaYzaDpULBJJAou+PX0j73lJ7YDOgX0Fmb/v8RWg7InVdKfLuYH57bFibMt00gdb7fPTxgQRvSbK/6G4v32zysAAAD//w==
// DO NOT EDIT
package com.paypal.orders;

import java.util.Map;
import java.util.HashMap;
import java.util.List;
import java.util.ArrayList;
import com.braintreepayments.http.annotations.*;
/**
 * The tax ID of the customer. The customer is also known as the payer.
 */
@Model
public class TaxInformation {

    // Required default constructor
    public TaxInformation() {}

	/**
	* The customer's tax ID. Supported for the PayPal payment method only. Typically, the tax ID is 11 characters long for individuals and 14 characters long for businesses.
	*/
	@SerializedName("tax_id")
	private String taxId;

	public String taxId() { return taxId; }
	
	public TaxInformation taxId(String taxId) {
	    this.taxId = taxId;
	    return this;
	}

	/**
	* The customer's tax ID type. Supported for the PayPal payment method only.
	*/
	@SerializedName("tax_id_type")
	private String taxIdType;

	public String taxIdType() { return taxIdType; }
	
	public TaxInformation taxIdType(String taxIdType) {
	    this.taxIdType = taxIdType;
	    return this;
	}
}
