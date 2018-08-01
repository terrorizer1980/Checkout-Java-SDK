// This class was generated on Fri, 20 Jul 2018 16:07:18 PDT by version 0.1.0-dev+0ee05a-dirty of Braintree SDK Generator
// ReauthorizeRequest.java
// @version 0.1.0-dev+0ee05a-dirty
// @type object
// @data H4sIAAAAAAAC/6xU72vcRhD93r9iEC20IN/ZSUOov5mYgluamNgtBNc0c7uj09DVrjIz60Qt/t/LSqezz+fSGvxNO7vz4715T39Xl0NP1XH1njBbm4T/InhPnzKpVXX1GwrjKtBb7Mqjqq5+puHucErqhHvjFHdLKGCE7cnDOQ7nGACdSzka9Dh0FK2G1QBnpwu4TEBRsxBYiwZNjl4BhUCNQwC8QQ5ljBrk3pi7LTY1ARsjATYFjmyMAawVogOPA7QpJoGehJMH+tKzkC7gZMywlnVzVcOQMjiM/6NdimGAFB1BI6kDj4NCk7KAJXjxwwLOGnh5OIVbvCHoUZU8KJcUawk8GkFqxu/9+tMoXVYDJ1SePj4GRzVCv4CT+zPfuzel0ECLCgiRPv8LKQv48ATkBXQSyH0Be3T06psZRxJecywLv0vDblw9Rg8xWcmgL47KRQSOBZyOPHz9+hX8enG6gIvc90lMJ4pL2d/z4eFL55Kn8YumklN0eRcGmfQLPQp2ZCSLqq5ORHCYxH5YF636dzEM1XGDQakEPmUW8tvAuaSexJi0Or7a2uSXFGnYN8Y0yY49tqFdk1y2BC6LUHTDSMaGl0IkQsMRoxtFKxgVXcmqQbNrYVzdCgMW3svGNnvwmZ4Pn5pwXO8DnEf+o9C8g/PhzT7cq0lrrkVBV6x2dvHu4PsXR6/viCi5198ufXK65Gi0FiwFlp6FnC2F1Jbz44PyWJffTf8K9hSNGyYdJTI/ehIjJvkBITGHcFv/Jys3GPIuG3Nkn4XxpobPLbsWOl63Bis6nsSbw6Tc6RR4Op0UYxitSUZ1bKAVpIH/JPj40/mHjxMJ5Vc5mmro2WEIAzQyaQfDYuOPueqDHuDJcYdhm/F4r8u3p/d6aV55vmFPvkyYwNqUFaO3Vh9vt5wR/phk3JNsyIeYuxVJMf48SB/QkW4MsaOQGpQIrt7MsTdFCE+VzXMo4/r2+varfwAAAP//
// DO NOT EDIT
package com.paypal.payments;

import java.util.Map;
import java.util.HashMap;
import java.util.List;
import java.util.ArrayList;
import com.braintreepayments.http.annotations.*;
/**
 * Reauthorizes an authorized PayPal account payment, by ID. To ensure that funds are still available, reauthorize an authorized payment after its initial three-day honor period expires. After this period, you can reauthorize an authorized payment only once from days four to 29. If 30 days have passed since the date of the authorized payment, you must create an authorized payment instead. A reauthorized payment itself has a new three-day honor period. You can reauthorize an authorized payment once for up to 115% of the original authorized amount and not to exceed an increase of $75 USD. Supports only the <code>amount</code> request parameter.
 */
@Model
public class ReauthorizeRequest {

    // Required default constructor
    public ReauthorizeRequest() {}

	/**
	* The currency and amount for a financial transaction, such as a balance or payment due.
	*/
	@SerializedName("amount")
	private Money amount;

	public Money amount() { return amount; }
	
	public ReauthorizeRequest amount(Money amount) {
	    this.amount = amount;
	    return this;
	}
}
