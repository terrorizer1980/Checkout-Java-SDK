// This class was generated on Fri, 20 Jul 2018 16:05:52 PDT by version 0.1.0-dev+0ee05a-dirty of Braintree SDK Generator
// AmountWithBreakdown.java
// @version 0.1.0-dev+0ee05a-dirty
// @type object
// @data H4sIAAAAAAAC/+yZW2vkNhTH3/spDn5qwRmnFygM9CHdpbAt3Q1tKJQkxGek41isLHmPpGRN6Xcvtke+zKSXQOjDjt5Gf1s6F/3Pj2Tmj+yqaynbZheNDcbDo/I1fM+E76V9NFme/YascKfpLTb9a1me/UTdvHhNTrBqvbIm22ZXNYG3HjVYlsSAi0PRgB3eQw27GAB8jR5atg9KkgNJHpV2ObggakAHfjpQeWr25+V7yePHSXG1altl7nOo0Ug9fLpXlYdHxjYHZVxgNIJyQCNBKif6fS4HVQGabnMTzs+/Fjsuhg/0poLOBnAtCVV1UI5hNlPeZT6ktq+PPgTUDso+x7shtxJaHRyUHj+uhZhnXMds47rP+a7POQpT5iU0yiyPuItVlIfZX82pNcF52BEgtNYprx4ITGh2xOOlSBKqQQ0tk1BOWTO0B+ESu0vUZy60rWVPEsYICDVT9d1NVnvfum1RSHogbVviTYtdi3ojbFNIK1yhjKd7xv7CC6mYhC+YnC9EYCYjujNhJbniJhtTjvIYp8BR3WR5dsGM3WjS8zz7hVC+M7rLthVqR73wISgmOQmX3OfjFblse31o739w9m7xaLb4Uj32+uxjWy0MsZnjHHl7tvb/YesX69/P1lB33LTJrqumLdXjpsWrHq023ktlGRAqZdAI1feA0TgU/a4ZBgg71H21YBla7BoyHmR4QZc4z8rcH5cZU77rTbsq9fDJcbnXvmaiM1Ejo/DE8ObXd2fffPXlt3Mj+r23nz9rbr4YyakkGa8qRSMq40vP6ojncNAQE7T+M//XrjygDutuROW4C8OTHB5rJWpo1H3dU2k7TnvQ47SPK63G1YWBoRfEgzv2pfWVavWeoPzx8vdybAIygbEefNcqgVp3UPHoHdR7NBbx1IMYEwDjjqdjXb19vYjlwk6qfqhln6EFX9vg0Ehfu6fDFbHCHywP98T75kcW22omsUZBbj8QK4fk4Ijg+lXUXvVGeK5tXsIZtwtv/A0XIq1W7liIiQqJCokKp0aF6c+VlT2WauJC4kLiwslxYfq/eQ2GpZzIkMiQyHBqZIjff6zcsRATFRIVEhVOlQrTN+BP4mH5NHEicSJx4tQ4Mf36trLHUk1cSFxIXPjEuHD7H9yRZibNTJqZeWY++wsAAP//
// DO NOT EDIT
package com.paypal.orders;

import java.util.Map;
import java.util.HashMap;
import java.util.List;
import java.util.ArrayList;
import com.braintreepayments.http.annotations.*;
/**
 * The total order amount with an optional breakdown that provides details, such as the total item amount, total tax amount, shipping, handling, gift wrap, insurance, and discounts, if any.<br/>If you specify `amount.breakdown`, the amount equals `item_total` plus `tax_total` plus `shipping` plus `handling` plus `gift_wrap` plus `insurance` minus `shipping_discount`.<br/>The amount must be a positive number with decimal precision and a PayPal-supported <a href="https://developer.paypal.com/docs/integration/direct/rest/currency-codes/">currency</a>.
 */
@Model
public class AmountWithBreakdown {

    // Required default constructor
    public AmountWithBreakdown() {}

	/**
	* The breakdown of the amount. Breakdown provides details such as total item amount, total tax amount, shipping, handling, gift wrap, insurance, and discounts, if any.
	*/
	@SerializedName("breakdown")
	private AmountBreakdown breakdown;

	public AmountBreakdown breakdown() { return breakdown; }
	
	public AmountWithBreakdown breakdown(AmountBreakdown breakdown) {
	    this.breakdown = breakdown;
	    return this;
	}

	/**
	* REQUIRED
	* The [three-character ISO-4217 currency code](/docs/integration/direct/rest/currency-codes/) that identifies the currency.
	*/
	@SerializedName("currency_code")
	private String currencyCode;

	public String currencyCode() { return currencyCode; }
	
	public AmountWithBreakdown currencyCode(String currencyCode) {
	    this.currencyCode = currencyCode;
	    return this;
	}

	/**
	* REQUIRED
	* The value, which might be:<ul><li>An integer for currencies like `JPY` that are not typically fractional.</li><li>A decimal fraction for currencies like `TND` that are subdivided into thousandths.</li></ul>For the required number of decimal places for a currency code, see [Currency Codes](/docs/integration/direct/rest/currency-codes/).
	*/
	@SerializedName("value")
	private String value;

	public String value() { return value; }
	
	public AmountWithBreakdown value(String value) {
	    this.value = value;
	    return this;
	}
}
