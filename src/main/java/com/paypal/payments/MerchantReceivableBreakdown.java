// This class was generated on Fri, 20 Jul 2018 16:07:18 PDT by version 0.1.0-dev+0ee05a-dirty of Braintree SDK Generator
// MerchantReceivableBreakdown.java
// @version 0.1.0-dev+0ee05a-dirty
// @type object
// @data H4sIAAAAAAAC/+xZW28bNxN9/37FYJ++AoqVOHEK+Km5ohckMVK3QJEGyoic1RLmkpshKWVb5L8Xs9yVtJKCuq1ToLGejJ3hbQ7PHI7GvxeXbUPFefGCWFXoIrwmRWaJc0vwmAmvtF+5YlL8jGzE+BJrGV5Mih+o3Xw8paDYNNF4V5wXlxWBpojGkob5sAr4EmJFoLCJiUlDg21NLp4Uk+IRM7b5KHcnxWtC/crZtjgv0QYSw/tkmPTacMG+IY6GQnH+Zh3Esw8Sw4LgNUbaPzT17hln9yaCXc9+OMMIkBEQK4wSIXFtHIUuLKx9chGiB+XdkjhCyb4G7whUYianWnGi87EiXttuLvoQ2bjFftjBJ1Y0GzYcBb7v2w/9TayY6I6qkFFFYvjux1d3Hpze+3oTl/Ka3v5/qr0KU+MiLRhlgak2TCpOmUKcDoPvyOAw/SqDaDS5aErTg3hTqLhk7cfJn0ITkRcUD0Oz77tV0CzRpnGSDJZ9GDJUm5hzKpzAs/fJLNFSTgvJhORMHHQgc28TFzz3XGOMpAEDdFgRg2fQpEyNFroDwMrEqlsrerh3BtosTAzyIWuyWVTrDYZ5jTf/XGU62N5uAffCO2r3cVuwD2GWERjBt+PYR3EDn9ODmpSeAaE0Dp0yaCEyuoBKZk0gJFUJVAhztOgUCVi9qIJO9PmlZTjyTIg7inbX8x/Mncjp86dO55nAqjKqgrpj75zOf013795XyXZ/KX9Zk78euXVuCDv60CRSa64I3n1/8cu7DAIygfMRYtsYhda2UHLmDtqTvOh0WHVnj3XuDDMO73X58unWXiHNtVkaTVpOKAnpU0CnYxUObzcdInzuOadvDz64VM8l+ctNEltUFPqEGDFkAoEI3jwZbE+ECH+VNjfBjGuog6N4SBtG5qMyHJXhqAy3TRkabBu0s5LG/BiZj8pwVIajMnyxynBhMZaea3hOB7oXTe8VLQhjjdjxjBnzyAHKIQWYYWROeo5OCEEUJqB8XZsQjHdhIt45+ytiXFDn7+8rBK8Myg+07kfYNZo5D/++fnxCJw9UT8fK6aiPR328BZXT0KN+jIEOVlD7xdMn6qbcnc6hC0j1sPSq8sBdC7yneZmcDp18lMmWxtps9qyJT+Bye64JgDZ4uHJ+5UREZGB3hs+vGlSjsTPUmimMX4ddzz4Ycp/sMJPY/EYaujnQz+l5NrdeXb1PPtI23UJk7xbZ8tLHIc2m23b4qYHo4eEDWAtT6MiN1voVaZhT6eXTaTg9O/vUKCxF0QTTvIewLG/wTb/pxgLBLNwJfOtXtCSedLMW5Ii7lEWlqJFnrMYPpk41WHKLWOVEcOPo5VZPz7aPnm+9wSiowZJ40ERJWQfJdSDp654S6IMJcZ3NuzD/O93egcMzo0fkGdv3qXOB7YUICbby2DwdRFcyAWoMV6QFICkrhqZsPwOV6h7jXpSEgk5ETq4gBRoKDMO6K1QM9bDvzgvA1O0wty2QU9x2F9s999Cwb9hQRG5hKQG7rjcs8nH/VOamQFqoSU4upZfLkOxNdYuv8buP1/9vO9QYOuQ9VjnHKudY5XxhVc7bj//7AwAA//8=
// DO NOT EDIT
package com.paypal.payments;

import java.util.Map;
import java.util.HashMap;
import java.util.List;
import java.util.ArrayList;
import com.braintreepayments.http.annotations.*;
/**
 * The detailed breakdown of the captured payment.
 */
@Model
public class MerchantReceivableBreakdown {

    // Required default constructor
    public MerchantReceivableBreakdown() {}

	/**
	* The exchange rate that determines the amount to convert from one currency to another currency.
	*/
	@SerializedName("exchange_rate")
	private ExchangeRate exchangeRate;

	public ExchangeRate exchangeRate() { return exchangeRate; }
	
	public MerchantReceivableBreakdown exchangeRate(ExchangeRate exchangeRate) {
	    this.exchangeRate = exchangeRate;
	    return this;
	}

	/**
	* The currency and amount for a financial transaction, such as a balance or payment due.
	*/
	@SerializedName("gross_amount")
	private Money grossAmount;

	public Money grossAmount() { return grossAmount; }
	
	public MerchantReceivableBreakdown grossAmount(Money grossAmount) {
	    this.grossAmount = grossAmount;
	    return this;
	}

	/**
	* The currency and amount for a financial transaction, such as a balance or payment due.
	*/
	@SerializedName("net_amount")
	private Money netAmount;

	public Money netAmount() { return netAmount; }
	
	public MerchantReceivableBreakdown netAmount(Money netAmount) {
	    this.netAmount = netAmount;
	    return this;
	}

	/**
	* The currency and amount for a financial transaction, such as a balance or payment due.
	*/
	@SerializedName("paypal_fee")
	private Money paypalFee;

	public Money paypalFee() { return paypalFee; }
	
	public MerchantReceivableBreakdown paypalFee(Money paypalFee) {
	    this.paypalFee = paypalFee;
	    return this;
	}

	/**
	* An array of platform or partner fees, commissions, or brokerage fees that associated with the captured payment.
	*/
	@SerializedName(value = "platform_fees", listClass = PlatformFee.class)
	private List<PlatformFee> platformFees;

	public List<PlatformFee> platformFees() { return platformFees; }
	
	public MerchantReceivableBreakdown platformFees(List<PlatformFee> platformFees) {
	    this.platformFees = platformFees;
	    return this;
	}

	/**
	* The currency and amount for a financial transaction, such as a balance or payment due.
	*/
	@SerializedName("receivable_amount")
	private Money receivableAmount;

	public Money receivableAmount() { return receivableAmount; }
	
	public MerchantReceivableBreakdown receivableAmount(Money receivableAmount) {
	    this.receivableAmount = receivableAmount;
	    return this;
	}
}
