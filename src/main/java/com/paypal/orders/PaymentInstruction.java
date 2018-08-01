// This class was generated on Fri, 20 Jul 2018 16:05:52 PDT by version 0.1.0-dev+0ee05a-dirty of Braintree SDK Generator
// PaymentInstruction.java
// @version 0.1.0-dev+0ee05a-dirty
// @type object
// @data H4sIAAAAAAAC/7RWb2/bthN+//sUB736DXDtLm06IK+WNSuWDU2DLRswZEF6Jk8WEYpUj6Rdbdh3H46UYstOhnVLkRexjne6P89zj/hHddV3VJ1Ul9i35CKcuxA5qWi8q2bVL8gGl5YusBWnalb9QP324YyCYtNl55Pq1PWAWht5RAvd8EazfWOA2jNcYn+JdvjJ0RGDSiH6ljjM4VsnCQPUhDExlZCu+AVAp6FFvqPYWVQUZhCSagADaLLYkwZtwjJxoJxb3JW3lnJ68DUgdBZj7bmFmmgOp11nDQXQiY1bgWct5TBhDpDcCjspRI8NBfA8ug9n+cUpNp7N7zuO82pWnTJjX2b8fFb9SKjfOdtXJzXaQGL4kAyTvjdcsu+Io6FQnVzfoxOipDsEZLfZ29ZrmiD00OkUsquGoE5OB4gNRkAmaMhq8A6W1KCtpbPYELTEqkEX/2tLLln752zLuhGLN0SH3Y1I3dZEYdLZ/sk+EQGlRil+jWx8EjoJWZRvWxOCUHEG0XRhlsH0LsO9D9irfw/YW++oP+wIW59cnLRybzpERiVmcqrPNC5+mZEItXHolEELkdEFzPTe7gLCEi06RZB3p+yhTvT5CTmWfKv2ybh/ctjudWyY6JlqkFFFYjj/6d2zl0dffrUdhMTe/H+hvQoL4yKtOAO30IZJxQVTiIvR+Zk4h8UXhdpGk4umllWPO6P9pIlETn9P58emskabptMYLYdTyCcz2DRGNdCaVRNhSSe/pefPX6hk838qT9aUp1MHeRbERa9Ka9KpNXcE77+//PX9dr+djxD7zii0toeaC3fQzstLF+Nb93KAJmVake0h4uFcVxdnO7lCWmqzNpq0VOghNj4FdDo24eF0i7HDN54zTjwMH1xql8Sy0WMh5QMwLMSEITMIRHD9erS9FiJ8Km2eghk3O9x4OygofIPhIa3DnqYUGS2HFNEU0djS+q44w6bxwKTIrAeaF20X+aiTrY21xZy/cnO42o01AdAGD3fOb5yIiDjmGj6/alCLxt6i1kxhKvT7J4fDEDy56Dfa/PnNMTDEDDxbWq/uPiQfaZduIbJ3q2K58HFcs8WuHX7uIHp49RLuhSlkcqO1fkMallR7eXQajo6PH/PCWhRNZlpyCMtKgq+HpFsLBLNyc/jOb2hNPMtRK3LEeWVRKeoiyT3oo2lTC5bcKjZlEdy0e0H16Hi39IJ6h1GmBmviURNlZR0kl4ek/2mVQB9NiPfbvD/mp70tPEafkcO3Rk/IM7UfUme4iArJGc7PRtGVTYAWwx1pGVAYbo5xG4FK5Y/xIEpCQSciJxCkQLAxsYHYGNb55mpoGPt+XACmnGFpeyCnuM/A5s89dOw7NhSR+3yLkSX1dZaPF0cSmwJpoSY5AWWQy5Ds01zSbvLf//4CAAD//w==
// DO NOT EDIT
package com.paypal.orders;

import java.util.Map;
import java.util.HashMap;
import java.util.List;
import java.util.ArrayList;
import com.braintreepayments.http.annotations.*;
/**
 * Any additional payment instructions for PayPal for Partner customers. Enables features for partners and marketplaces, such as delayed disbursement and collection of a platform fee. Applies during order creation for captured payments or during capture of authorized payments.
 */
@Model
public class PaymentInstruction {

    // Required default constructor
    public PaymentInstruction() {}

	/**
	* The funds that are held on behalf of the merchant.
	*/
	@SerializedName("disbursement_mode")
	private String disbursementMode;

	public String disbursementMode() { return disbursementMode; }
	
	public PaymentInstruction disbursementMode(String disbursementMode) {
	    this.disbursementMode = disbursementMode;
	    return this;
	}

	/**
	* An array of various fees, commissions, tips, or donations.
	*/
	@SerializedName(value = "platform_fees", listClass = PlatformFee.class)
	private List<PlatformFee> platformFees;

	public List<PlatformFee> platformFees() { return platformFees; }
	
	public PaymentInstruction platformFees(List<PlatformFee> platformFees) {
	    this.platformFees = platformFees;
	    return this;
	}
}
