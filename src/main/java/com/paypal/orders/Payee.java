// This class was generated on Fri, 20 Jul 2018 16:05:52 PDT by version 0.1.0-dev+0ee05a-dirty of Braintree SDK Generator
// Payee.java
// @version 0.1.0-dev+0ee05a-dirty
// @type object
// @data H4sIAAAAAAAC/+xXTW8bRw++v7+C2JMNKJLjxDno9KZygAZFXSF1e0kNgZqhtAPPcjYcruVt4f9ezOzK9kp26hZuWrS9CBh+DMmHDznaX4rztqZiWsyxJSpGxY8oDpeezrBK4mJUfEPt3eGUohFXqwtcTIvzkqAiMSWywqYMIGTIXVEELQlWDdsIyBZWjV857ztxEEsyhoGvi4A+BrjksGHAzrBOKY2LUfFWBNsuz6NR8YHQfse+LaYr9JGS4FPjhOytYC6hJlFHsZh+vK3w1MXaY5uKg2+3gd/zKkiFuZ694m3nsbCoOABiR/EZUNzd/U8vGd7WNaFE0JClpokaKhJwDKYkcxkaHYEKckSTro4joAqd7/CvNY4y7PcsoHRRg7TPB2dUcbzeB20pyHbB6XAfsoF4H7CkgLDK5W4heiIONbYVsf41eHDj/c3ot0FpomOKcZHTGgKzq9oHx7GScCYRevcz2b46tFYoxvFPzdHRK7P0wVx+aoJSPne/JqoEXneSs6A07cST+3L4oU4Qv3kNpkRBoyQRUAjQ+7AhC0tahXRkC8cnJ49Z4UpJcqO6GCbYPpX/90HvJBDdmsfwddjQFckoe62JSdD7FtAYqpUsVHjtqqYCT7zWElZBAHlYfRqk45P7qXeDVqMm1OCKxK1cXkmoybvhDJJ9apZA1y7qFuXJLszPS6B5GZg+w5+61z/An61qnz9ZA9xUywS1Y3AawSAHdgb9kF7w8d345ZvXvbXjNdQeGbotdnFQqtZxOplsNpux02bsWCdCZnL+4sO72YvsOiE+/PPXjAkNq7SL1KwBHjuKfTR6AzDofaovGcLBbHb4haCBLolq6Zjsltn96pvNukWVN2IftQsHVRMVOCgsCdZC2M0aMrw8AevWTnve7/qZwDHxN4XAO62lqK479Qicnc4Oc/TYLBNmybm/4+D7s9/XUpXmjy1Kulbi6AIvutCD1j6g3G/vrVGf/Bfa8FtgH8p7X/fQAzho29+Ai4/OyT+aohc3F0+haXqBFv0LNOTojua/1/xf/Jo/Rp/tP9yFswPyDOX71JljO0efvxIE3p+OYFM6U+ZPCagwXpJNAOXl1w9x74EmT/N2WBIF2ZLNLWgiwcZpCVo6sVBjrqWDfdcvglCOsPQtEBtpc2MTlRBqCbU4UpQWrlLBrCmNrzDSq+Pk20SyiZrEeZxTfkKx8fosO/ri5n+/AgAA//8=
// DO NOT EDIT
package com.paypal.orders;

import java.util.Map;
import java.util.HashMap;
import java.util.List;
import java.util.ArrayList;
import com.braintreepayments.http.annotations.*;
/**
 * The merchant who receives the funds and fulfills the order. The merchant is also known as the payee.
 */
@Model
public class Payee {

    // Required default constructor
    public Payee() {}

	/**
	* The merchant information. The merchant is also known as the payee. Appears to the customer in checkout, transactions, email receipts, and transaction history.
	*/
	@SerializedName("display_data")
	private DisplayableMerchantInformation displayData;

	public DisplayableMerchantInformation displayData() { return displayData; }
	
	public Payee displayData(DisplayableMerchantInformation displayData) {
	    this.displayData = displayData;
	    return this;
	}

	/**
	* The internationalized email address.<blockquote><strong>Note:</strong> Up to 64 characters are allowed before and 255 characters are allowed after the <code>@</code> sign. However, the generally accepted maximum length for an email address is 254 characters. The pattern verifies that an unquoted <code>@</code> sign exists.</blockquote>
	*/
	@SerializedName("email_address")
	private String emailAddress;

	public String emailAddress() { return emailAddress; }
	
	public Payee emailAddress(String emailAddress) {
	    this.emailAddress = emailAddress;
	    return this;
	}

	/**
	* The PayPal payer ID, which is a masked version of the PayPal account number intended for use with third parties. The account number is reversibly encrypted and a proprietary variant of Base32 is used to encode the result.
	*/
	@SerializedName("merchant_id")
	private String merchantId;

	public String merchantId() { return merchantId; }
	
	public Payee merchantId(String merchantId) {
	    this.merchantId = merchantId;
	    return this;
	}
}
