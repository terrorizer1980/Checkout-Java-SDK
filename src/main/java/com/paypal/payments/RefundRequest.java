// This class was generated on Fri, 20 Jul 2018 16:07:18 PDT by version 0.1.0-dev+0ee05a-dirty of Braintree SDK Generator
// RefundRequest.java
// @version 0.1.0-dev+0ee05a-dirty
// @type object
// @data H4sIAAAAAAAC/6yU3U7cPBCGz7+rGOXoq5Ql9EeqtGeIVSWoCghQpYqiZWLPEreOHcZjUFRx75XzszTsVgXBWTyeycz7+LV/ZedtQ9k8O6VVdBpO6SZSkCzPviIbLC0dYZ32szz7TO3DYkFBsWnEeLeuDoCgsJHIpKHBtiYnOZQtHCx24JNnQFhFa4G77ByMUzZqAnRAdSMtHJ4dHwH3I0DpdTuWNchicGvl97i7+14pr6n7Iqx9dNJHi4cw+PIHKQHjQCra0inLsz1mbHseu3l2SqiPnW2z+QptoBS4iYZJrwMn7BtiMRSy+cWa5BfvqN0E2M81wbgOTWGeVwQqMpNTLaDT0OfBqidoHDqVYAijC6hSVQ4hqgownUCJFp0i8DyeAehIz9InHP8qLwgbd72pb5x4mZhPZD7e2VR7IRUTzVSFjEqI4eDsePbh3duPDxxS7eX/hfYqFMYJXTOmHxTaMCkpmIIUY/IsJYfiDUiFAkaTE7MyFLqTH5NeCMRFa+/zf1K5RRunNMbIJoVuJ4e7yqgKanNdCZQ0750cbW/jfmVNv9pz0LEg7swxSEtKrflJcHV48u2qh4BM4LyAtI1RaG0LK+6tg3ZnuCzjXx/1AE3K1GjXFdt7nR8t/ugVYqnNrdGk04QepPIxoNNShe3tilFhuvDpnHiADy7WJTH41XqQxqKiMNyHiUNyCERwsT/G9pMRnmub13DG5RO8YdytN4qWRk8MMglvuqQmVhU6mTXse8AHiw5FgjbUDsYPgCF4ZVBIw52RCqQyYXhEX/rgPfECOC+0FL9ssCWe6Hy8symVCcNgt94Rrzb35f1/vwEAAP//
// DO NOT EDIT
package com.paypal.payments;

import java.util.Map;
import java.util.HashMap;
import java.util.List;
import java.util.ArrayList;
import com.braintreepayments.http.annotations.*;
/**
 * Refunds a captured payment, by ID. For a full refund, include an empty JSON request body. For a partial refund, include an <code>amount</code> object in the JSON request body.
 */
@Model
public class RefundRequest {

    // Required default constructor
    public RefundRequest() {}

	/**
	* REQUIRED
	* The currency and amount for a financial transaction, such as a balance or payment due.
	*/
	@SerializedName("amount")
	private Money amount;

	public Money amount() { return amount; }
	
	public RefundRequest amount(Money amount) {
	    this.amount = amount;
	    return this;
	}

	/**
	* The merchant-provided ID for the invoice that is associated with this refund.
	*/
	@SerializedName("invoice_id")
	private String invoiceId;

	public String invoiceId() { return invoiceId; }
	
	public RefundRequest invoiceId(String invoiceId) {
	    this.invoiceId = invoiceId;
	    return this;
	}

	/**
	* The reason for the refund.
	*/
	@SerializedName("note_to_payer")
	private String noteToPayer;

	public String noteToPayer() { return noteToPayer; }
	
	public RefundRequest noteToPayer(String noteToPayer) {
	    this.noteToPayer = noteToPayer;
	    return this;
	}
}
