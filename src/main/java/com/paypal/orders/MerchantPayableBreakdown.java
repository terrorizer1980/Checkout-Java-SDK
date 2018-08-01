// This class was generated on Fri, 20 Jul 2018 16:05:52 PDT by version 0.1.0-dev+0ee05a-dirty of Braintree SDK Generator
// MerchantPayableBreakdown.java
// @version 0.1.0-dev+0ee05a-dirty
// @type object
// @data H4sIAAAAAAAC/+yZb2/bthPHn/9excGPfgPcuE2bDsijpf+wblgadNmAoSvcM3myiFCkejzZ1Ya994GUZFu2siVFNmCpHhnmkSL51fc+OlG/Ty7rkiankx+IVY5O4AJrXFiCZ0x4pf3aTaaTn5FNbDzHIvadTCffU73984KCYlOK8W5yOrnMCRbdYPAZSE7AlFVOH02mkzNmrJtJH04nbwn1G2fryWmGNlBs+FgZJr1puGBfEouhMDl9t12ud1QfrmzJPoQ5Fr5y0lvlXuBwxapiJqdqQKeh6QeZZ0DIjEOnDFoQRhdQxVFTCJXKAQMgLNCiUwSeocS6ICegK7q7vQZh45aHm+2WPFdeU2+3+5HD7b6TnIkeqBwZlRDD6x/fPHhy/OjrrRBx7Pv/z7RXYWac0JIxXmCmDZOSGVOQWdf5QewcZl+B5ChgNDkxmaGQ7n3X6VaKCFd7grjK2j+mf6vKCm3VV6NrOVQhRaawzo3KoTDLXGBBp79WDx8+VpVNv9T8s6b5d+YgaUGc3NFuLe7UmiuCD99d/PKhEQGZwHkBqUuj0NoaMm68g/aoueisu+reHKBJmQLtZsTwXJfnL3bmCtVCm5XRpOMKPUjuq4BOSx6Gp5t1O3zluc3RRnxwVbEgjqnbLaS0qCi0CdFzyBQCEbx73rU9j0a4rW3uwhnvd7xxDR0cyRAbes0jGUYyjGS4t2Q4J4GzJoc3BQ68Fir+ihbzxU4tNMSNXoe+mc4cYFx/1GxbFSV7NapFfR1JS5YjeEtSsSMN65xcL0v6tRSYANpkGXHESsa+GOx8gfUFWkCl0qbXOTGlQNEVfLm3OqWjYYgXDnuaP73zKk15tyIW0kM0HgiOTB6ZPDL53jL55acIoiXBWxQ6tAi14Tk34a1V9iOHlul6QOzRqK9JiAvjWru38BAPLXgalHq3AxnxgM5LTvx52fFZvAi+YkXzbsLexg9j/0FmDKhyQ2gI8pJkWJrD2BclzW142ki18yxtK5CXHyuzQktNWsRMqJyRrqBovLfdF7zyXKAI6fh87XDreUOjtABYG8nTtcTDoxPQZmkkQCIfASeYtxNsKOaNkzuR7QavhmVz6jVUkByExnJkLEfGcuSelSM3Y0SJdp4R7fNh2zyyYWTDyIZ7+6pyYVEyzwW8ooE3lbKNRhaEPiP2ItefEXU9m6RncdEQRGEKyheFCcF4F6YxumB/RYxLSvHNWdLgl7a7P8MZKJTGAmmE4AjBL+DrWndy/AwDDZZJhxXSNcWRJkFjt/DaHEqvcw9MisyqtXk6mU74yCqbGWubZs+a+Agud8eaAGiDhyvn1y5CJHZMa/jnqUEFGjtHrZlC/xGwHzkUI95PdtiY2PxGGtIYaMe0PltYr64+Vl5o125B2Ltl03LupUuz2W47/FTGF+6nT2ADppDMjdb6NWlYUObjX6fh+OTkul6YRaJFTZs5osuaCb5pJ922QDBLdwTf+jWtiKdp1JIccUpZVIpKIQ0FfjJFVYAlt5S8SQTX3328q8cnu0tv7nqJElWDFXHHxJiyDiqXRNI3XSXQJxNkk837Mv87xzedh+dG98zTbz+0TvuVJ5qc4fWLDroxE6DAcEU6ChRrh2u+C7VQihZ0EXLxFlShPbaR3LBO1YihVvb9cQGY0gwLWwM5xXW6selxDyX7kg0Jcg2ruGGXDnsiPh4fx7FVIB2tSS7elBaXobJ3dfxzg5c78YJ23hRPwx+mrusxVjtjtTNWO/fuOOh/fwIAAP//
// DO NOT EDIT
package com.paypal.orders;

import java.util.Map;
import java.util.HashMap;
import java.util.List;
import java.util.ArrayList;
import com.braintreepayments.http.annotations.*;
/**
 * The breakdown of the refund.
 */
@Model
public class MerchantPayableBreakdown {

    // Required default constructor
    public MerchantPayableBreakdown() {}

	/**
	* The currency and amount for a financial transaction, such as a balance or payment due.
	*/
	@SerializedName("gross_amount")
	private Money grossAmount;

	public Money grossAmount() { return grossAmount; }
	
	public MerchantPayableBreakdown grossAmount(Money grossAmount) {
	    this.grossAmount = grossAmount;
	    return this;
	}

	/**
	* The currency and amount for a financial transaction, such as a balance or payment due.
	*/
	@SerializedName("net_amount")
	private Money netAmount;

	public Money netAmount() { return netAmount; }
	
	public MerchantPayableBreakdown netAmount(Money netAmount) {
	    this.netAmount = netAmount;
	    return this;
	}

	/**
	* An array of breakdown values for the net amount. Returned when the currency of the refund is different from the currency of the PayPal account where the merchant holds their funds.
	*/
	@SerializedName(value = "net_amount_breakdown", listClass = NetAmountBreakdownItem.class)
	private List<NetAmountBreakdownItem> netAmountBreakdown;

	public List<NetAmountBreakdownItem> netAmountBreakdown() { return netAmountBreakdown; }
	
	public MerchantPayableBreakdown netAmountBreakdown(List<NetAmountBreakdownItem> netAmountBreakdown) {
	    this.netAmountBreakdown = netAmountBreakdown;
	    return this;
	}

	/**
	* The currency and amount for a financial transaction, such as a balance or payment due.
	*/
	@SerializedName("paypal_fee")
	private Money paypalFee;

	public Money paypalFee() { return paypalFee; }
	
	public MerchantPayableBreakdown paypalFee(Money paypalFee) {
	    this.paypalFee = paypalFee;
	    return this;
	}

	/**
	* An array of platform or partner fees, commissions, or brokerage fees for the refund.
	*/
	@SerializedName(value = "platform_fees", listClass = PlatformFee.class)
	private List<PlatformFee> platformFees;

	public List<PlatformFee> platformFees() { return platformFees; }
	
	public MerchantPayableBreakdown platformFees(List<PlatformFee> platformFees) {
	    this.platformFees = platformFees;
	    return this;
	}

	/**
	* The currency and amount for a financial transaction, such as a balance or payment due.
	*/
	@SerializedName("total_refunded_amount")
	private Money totalRefundedAmount;

	public Money totalRefundedAmount() { return totalRefundedAmount; }
	
	public MerchantPayableBreakdown totalRefundedAmount(Money totalRefundedAmount) {
	    this.totalRefundedAmount = totalRefundedAmount;
	    return this;
	}
}
