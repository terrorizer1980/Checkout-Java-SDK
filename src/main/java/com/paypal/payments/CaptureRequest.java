// This class was generated on Fri, 20 Jul 2018 16:07:18 PDT by version 0.1.0-dev+0ee05a-dirty of Braintree SDK Generator
// CaptureRequest.java
// @version 0.1.0-dev+0ee05a-dirty
// @type object
// @data H4sIAAAAAAAC/+xYX28cNRB/51OM7gmkS66kf5DyRGioCKhtVAISKlUyZ8/eWvHa27Gd64L47mjs3bvbvUO0IuUpysNmxzM7f/yb30zy5+yqa2l2OnuObUxM8IbeJwpxNp/9imxwaekVNqIwm89+om77ck5BsWmj8W5rHoBMrIkBofUsZ+AZYk1QJWsBU6w9mz9IAzY+uQi+AnS78ha7hlw8ns1nZ8zYlfAezWdvCPVrZ7vZaYU2kAjeJ8OkN4JL9i1xNBRmp283ib30jrr9dIr/UVIb0Ti1q5pAJWZyqgN0m9ArL2lWxqFTBi1ERhdQidUcQlI1YACEJVp0iqQOfW6gE91ffiGycav9BIeQr5XXNMpzerKf7ttYM9GRqpFRRWK4+Pn10ZOTr7/ZFkJs33250F6FhXGRVozygYU2TCoumEJcDMpHohwWX0GsMYLR5KKpDIUMjEHpkyoSOU0K4pK1f83/tSp3aNO4GoNkvwr5ZA7r2qgaGrOqIyzp9Pf06NFjlWx+UnmzprydOci1IM7o6FOTTK25Jbj58fK3m1IEZALnI8SuNQqt7aDigh20x+Wji+GrEx+gSZkG7cbisK+rV+c7vkJaanNnNGmJ0EOsfQrodKzDYXeLIcMXfQNzX3xwqVkSS+cOgbQWFYW+IUYImUMggrfPB9lzAcKnwuY+kPFuBxtL7y2h2weH9LK9VoXKRiCZnozBcuG0URgpwLqmTH9V4vxUAy0qdLAkaFAT4AqNCzFX9QDzwZWHBm+pJxebOSfTZ/81KWqE6OFGkr3ZNWiRo3DRRhOVora40lRhsnEuTHST63bzX1noI5vOuDtvFF0bPSrqSLzffg2xqtHFo5Z9Qe7FecaYJNPb9owSAEPwymAkDWsTa4i1Cfc1SyZZXvYsfuFC5JQ7cD/l3vW1GSltcz98Pi7CmesAtTaFFTbTY8ek9NwldpdCB/lXjk5wl0L0DXE4hu+dhBWgIixQrPIkynohY6tBvqVYmng7uTRZ7EiDNmGZOFD2LerKW0uFeGR6S/fHynMDFdExnLWtFRLSSbAAnrWEw4RbpirY3AA+CCB79f4sf3ivM8LnH5q7yV4308F56HQft1VyOmyZtyarwUv312grySzugPu+sTncxQuiA6DsT68rojCG4+RkCkRAiVGCv0M2PgmcBCzKN40JQaA4h2jakNlFe5eve3phzx62uIct7mGLe9ji7mOLe9kzKHyHgQ4OYKLpyKXDENEU0diwWS4GcoZ17YFJkbnrYV64vV/IKmNtEecpdwy7W0teSmzwcOv82gmJiGKO4fOzBjVo7DVqzRTGRD892S+G3CcX/kabx2+2gd6mx9nSenX7PvlIu3ALkb1bFckrH4c2W+zK4ZdWdtdnT2BDTCGDG631a9KwpMrLq9Nw8vTpP2lhJYwmNS0+BGXFwbe9060Eglm5Y/jBr+mOeJ6tVuSIc8uWFZlkD/pgmtSAJbeKdWkEN85ebvXk6W7o5dZbjFI1uCMeOFFa1kFyuUj6Y6ME+mBC3HTztMz/z74+YHi6sI/l+9DpF1EBOcPF+UC60gnQYLglLQUK/eYYtxaoVB7GPSkJBJ2QnFxBCrRZ6VmXv3CoL/vULgBT9rC0HZBT3OWLzeMeWvYtG4rIXd5isPz7Sejj8YnYpkBaoElOLqWny5Ds/Sxp7/qfL/4GAAD//w==
// DO NOT EDIT
package com.paypal.payments;

import java.util.Map;
import java.util.HashMap;
import java.util.List;
import java.util.ArrayList;
import com.braintreepayments.http.annotations.*;
/**
 * Captures either a portion or the full authorized amount of an authorized payment.
 */
@Model
public class CaptureRequest {

    // Required default constructor
    public CaptureRequest() {}

	/**
	* The currency and amount for a financial transaction, such as a balance or payment due.
	*/
	@SerializedName("amount")
	private Money amount;

	public Money amount() { return amount; }
	
	public CaptureRequest amount(Money amount) {
	    this.amount = amount;
	    return this;
	}

	/**
	* Indicates whether further captures can be made against the authorized payment. To make a final and full capture, set to `true`. To make a partial capture, accept the default, or `false`.
	*/
	@SerializedName("final_capture")
	private Boolean finalCapture;

	public Boolean finalCapture() { return finalCapture; }
	
	public CaptureRequest finalCapture(Boolean finalCapture) {
	    this.finalCapture = finalCapture;
	    return this;
	}

	/**
	* The merchant-provided ID for the invoice that is associated with this payment.
	*/
	@SerializedName("invoice_id")
	private String invoiceId;

	public String invoiceId() { return invoiceId; }
	
	public CaptureRequest invoiceId(String invoiceId) {
	    this.invoiceId = invoiceId;
	    return this;
	}

	/**
	* Any additional payment instructions for PayPal for Partner customers. Enables features for partners and marketplaces, such as delayed disbursement and collection of a platform fee. Applies during order creation for captured payments or during capture of authorized payments.
	*/
	@SerializedName("payment_instruction")
	private PaymentInstruction paymentInstruction;

	public PaymentInstruction paymentInstruction() { return paymentInstruction; }
	
	public CaptureRequest paymentInstruction(PaymentInstruction paymentInstruction) {
	    this.paymentInstruction = paymentInstruction;
	    return this;
	}
}
