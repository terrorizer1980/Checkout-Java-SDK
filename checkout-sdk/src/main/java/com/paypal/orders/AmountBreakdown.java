// This class was generated on Wed, 22 Aug 2018 20:49:05 PDT by version 0.1.0-dev+904328-dirty of Braintree SDK Generator
// AmountBreakdown.java
// @version 0.1.0-dev+904328-dirty
// @type object
// @data H4sIAAAAAAAC/+yYT2vbTBDG7++nGHR6C0qU/oGCb2lCoS1NQhsKJQ3JeHdkLVntqrOjJKLkuxdJliPZLiWQU72nZJ/dmZ15PPph+Vdy3lSUzJLD0tdO4B0T3mh/55I0+YZscG7pBMv2RJImn6h5XBxTUGwqMd4ls+S8IJgPweBzkIIAu6T7j1mhYn9rNAXQJGhsgFCrAjCAeEELRqhcRqVLSfB+pYTCVJVxixQKdNp2/y1MLnDHWKVgXKgZnaIU0GnQJqg2LqRgckDX7CdpcsiMTd/zQZp8IdSnzjbJLEcbqBV+1oZJr4Qz9hWxGArJ7GLl1mfvqNm0aKhqYtVI3LRM1czkVNMV3LcJuWdAyI1Dp0zrAKMLqNqodOUXwhxt2yt4hgqbkpyArun5egzCfdVrTQ4lXymvadLp+s5muxdSMNGeKpBRCTF8+Hq69+bVy7ePRrSxl/9n2quQGSe0YGwTZNowKcmYgmTD4b32cMhegBQoYDQ5Mbmh0A3fcOhJjgjXa4a42tqH9K+u3KKtp24MyqYL3U4Kd4VRBZRmUQjMafajPjh4rWrb/aV+ZU2/OnTQeUHcTceytbZTa24Irj+efb/uTUAmcF5AmsootLaBnPvZQbvfJ82GrGt3gCZlSrSriO13nZ8cj+4K9Vyb9pHWbYUepPB1QKelCNuvy4YO33vuPidemg+uLufELTuGQiqLisLygZhMSAqBCC6OBu2oHYSnjs1zTMblaDb+QIUVlibjMVYjFyIXIhd2jgtC5VX3JWcKhrEcyRDJEMmwa2QY3nMm0zESIxUiFSIVdpUKV8MPG1vxMN6NnIiciJzYNU4I3m95rRirkQuRC5EL/xgXLh/++w0AAP//
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
