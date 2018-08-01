// This class was generated on Fri, 20 Jul 2018 16:05:52 PDT by version 0.1.0-dev+0ee05a-dirty of Braintree SDK Generator
// ApplicationContext.java
// @version 0.1.0-dev+0ee05a-dirty
// @type object
// @data H4sIAAAAAAAC/8RY227cNhO+/59ioP+mBnZXiZOmiIFeuEkQGHXXRk5FkQYbmpqVCFOkOkNmoxR594LUwdJqvTnU2F6tNRwO+c03J/rv5FVdYXKSnFaVVlI4ZQ08scbhR5fMkjeClLjSuBRlUEpmya9Y33w8RZakqrApOUmeeHa2VJ+QwRUIlahLNA7W2m4AP1ZICo1EWFuC2noCGfWReJHMklMiUTd3uTdLXqDILoyuk5O10IxB8JdXhFkvuCRbITmFnJy87VGwI2Xy6cWvSJhsZcLHEMJIPAbzqkDQ4go1uEI4sB+QSGUttCvPyiAzhK2gTBReivpSaBBSWm8c2JGUlcN/C9N4rT/PvohVCiNRrzzpEdaReIr19Ytz2BRIGG/dUQOKgTBThNJhBmLtkKBAsAQc1KLNEd0HAqmFyZTJV5XIx5RuLUyBurpCsGtoFSEogrPAhd3sIC2Ga+8OWaC8tt4t4I3QHkHxyZ/+3r0H0uv4i82XVsMvabPmLzy/eH62bITpjXQBr7kNrK0Y0jYP0TW86qLdPj7itgN/OTs/P1s+33eksWa+fewXz0s7vAdi20qht3juRFOG32phch9pFfm7HwrnKj5JU2et5oVCt15YytPClTq9ktXDn/7PKMP2+fFRZNvF1G9NKAObQskihEg8U31qUgSJLM0JtQiZ0dycZ8BeFiAYSmQWOfIMFLMPv8JkwD7PkWMqxSN5ATEmRR4yrRQZgq9CdIYT3p69vIBHDx7Pj2+uEyi8gbTZbBbaykVuP6TshMkEZZwqtnFXWhVV5HylFbtFVVRHs2jYRm8JHU+Y3//x8fFDaJw49lgw740KJqLLFNuoHI0Gm7wIXjxqsHVXnj+4/+gRCF0VYn4MMaKobi+eZlZyqozDnGKvSZvakhKyS1vdedDl9OiOS8ll249+Q1fYbBpkbQFbld36TbBNlqZB15eI4IoSSRbCuL4HVoRrpND+DtHsfI20YtSxaI8b3vbS7UDmnVYPokHf1cge4wFbG6PWSKvGm7SFbcfiFF1363mv1sNj6+kO+IlQ3n0FmC6onL1GszPcupUpjJBBFDJYaoXGzXM0SLEQxT0HooPQeTKTSWMkvqNJQ1QV2Q/4X4waXKiqiiNFn8TjuNu5PsXd6Q2Kwd7h4aniSou6gdxvFllGYfJ0duS+/WPBMxPw8NjhzoIsrGUEYXqzO6bWvZZfYHCbdFu212RLCImWhzuHpe6AzFMnammcN9wKDRVZicwH4tUz0qppwyM+x/KtJ441a5V7QgYBjSfYkTV5443wcFLGd0PScCkE8nTDpahhaTe79LtRM76fvnPefHKxfHW2fP1sx/z3Eh1sqw+Q/yzHUIZbT2Nu1tb3CTsJrEEM9S1Q5Djrvfbydq8Nl+DKO2dNSH8UxHFsBVcobmeYUEiaiF2rUA5FGQdYxWCsg2tjNwOVkUeDjjLKqVg1Q9MOgDahoTm7H9igu+cIG+WKYLQN3q3g/rZx/fL0j9Xy4vdb6Ho/5qcslXt/N2x8ZUh+Nxm3EbGXg9aho/8lqLLELKjremCuf51pJa/5mzAd4Hnz7vP//gEAAP//
// DO NOT EDIT
package com.paypal.orders;

import java.util.Map;
import java.util.HashMap;
import java.util.List;
import java.util.ArrayList;
import com.braintreepayments.http.annotations.*;
/**
 * Customizes the payment flow experience for your customers.
 */
@Model
public class ApplicationContext {

    // Required default constructor
    public ApplicationContext() {}

	/**
	* The label that overrides the business name in the PayPal account on the PayPal site.
	*/
	@SerializedName("brand_name")
	private String brandName;

	public String brandName() { return brandName; }
	
	public ApplicationContext brandName(String brandName) {
	    this.brandName = brandName;
	    return this;
	}

	/**
	* The URL where the customer is redirected after he or she cancels the payment.
	*/
	@SerializedName("cancel_url")
	private String cancelUrl;

	public String cancelUrl() { return cancelUrl; }
	
	public ApplicationContext cancelUrl(String cancelUrl) {
	    this.cancelUrl = cancelUrl;
	    return this;
	}

	/**
	* The type of landing page to show on the PayPal site for customer checkout. Value is:<ul><li><code>LOGIN</code>. Uses the PayPal account log in landing page.</li><li><code>BILLING</code>. Uses the non-PayPal account landing page.</li></ul>
	*/
	@SerializedName("landing_page")
	private String landingPage;

	public String landingPage() { return landingPage; }
	
	public ApplicationContext landingPage(String landingPage) {
	    this.landingPage = landingPage;
	    return this;
	}

	/**
	* The [language tag](https://tools.ietf.org/html/bcp47#section-2) for the language in which to localize the error-related strings, such as messages, issues, and suggested actions. The tag is made up of the [ISO 639-2 language code](https://www.loc.gov/standards/iso639-2/php/code_list.php), the optional [ISO-15924 script tag](https://www.unicode.org/iso15924/codelists.html), and the [ISO-3166 alpha-2 country code](/docs/integration/direct/rest/country-codes/).
	*/
	@SerializedName("locale")
	private String locale;

	public String locale() { return locale; }
	
	public ApplicationContext locale(String locale) {
	    this.locale = locale;
	    return this;
	}

	/**
	* The customer and merchant payment preferences.
	*/
	@SerializedName("payment_method")
	private PaymentMethod paymentMethod;

	public PaymentMethod paymentMethod() { return paymentMethod; }
	
	public ApplicationContext paymentMethod(PaymentMethod paymentMethod) {
	    this.paymentMethod = paymentMethod;
	    return this;
	}

	/**
	* The internal client-generated token.
	*/
	@SerializedName("payment_token")
	private String paymentToken;

	public String paymentToken() { return paymentToken; }
	
	public ApplicationContext paymentToken(String paymentToken) {
	    this.paymentToken = paymentToken;
	    return this;
	}

	/**
	* The URL where the customer is redirected after he or she approves the payment.
	*/
	@SerializedName("return_url")
	private String returnUrl;

	public String returnUrl() { return returnUrl; }
	
	public ApplicationContext returnUrl(String returnUrl) {
	    this.returnUrl = returnUrl;
	    return this;
	}

	/**
	* The shipping preference:<ul><li>Displays the shipping address to the customer.</li><li>Enables the customer to choose an address on the PayPal site.</li><li>Restricts the customer from changing the address during the payment-approval process.
	*/
	@SerializedName("shipping_preference")
	private String shippingPreference;

	public String shippingPreference() { return shippingPreference; }
	
	public ApplicationContext shippingPreference(String shippingPreference) {
	    this.shippingPreference = shippingPreference;
	    return this;
	}

	/**
	* Configures a <strong>Continue</strong> or <strong>Pay Now</strong> checkout flow. Value is:<ul><li><code>CONTINUE</code>. Set <code>user_action=continue</code>. After you redirect the customer to the PayPal payment page, a <Strong>Continue</Strong> button appears. Use this option when the final amount is not known when the checkout flow is initiated and you want to redirect the customer to the merchant page without processing the payment.</li><li><code>PAY_NOW</code>. Set `user_action=commit`. After you redirect the customer to the PayPal payment page, a <strong>Pay Now</strong> button appears. Use this option when the final amount is known when the checkout is initiated and you want to process the payment immediately when the customer clicks <strong>Pay Now</strong>.</li></ul>
	*/
	@SerializedName("user_action")
	private String userAction;

	public String userAction() { return userAction; }
	
	public ApplicationContext userAction(String userAction) {
	    this.userAction = userAction;
	    return this;
	}
}
