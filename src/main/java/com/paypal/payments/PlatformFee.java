// This class was generated on Fri, 20 Jul 2018 16:07:18 PDT by version 0.1.0-dev+0ee05a-dirty of Braintree SDK Generator
// PlatformFee.java
// @version 0.1.0-dev+0ee05a-dirty
// @type object
// @data H4sIAAAAAAAC/6xW32/cNgx+319B+GkDLrksbTYgT+saFPuBpsGWDRiyIOVJ9JmILLkUdRdv6P8+SLYvd7kEa5E+GaZEkfz48ZP+rS77jqrT6sKh1kFaeENUzao/URgXjs6xzavVrPqV+vufM4pGuFMOvjqtLhuCbvIPAh2KehKoiWZgQttyjBz8LK8tJNyS4JLyKmiDChwBYwyGUcnCmrUBbQhU0Ec0OcYhnAcFhEgdCirlgzgGVxy29oGjJdQS2nIA3SmJRwcdSezIKK/oEHaSzTlwBMct56PYQzShI0BvS1pujf3j2QXhJZfDsW/JK9RBykKXxDQYCZJnPaxm1SsR7AeUj2bVb4T2nXd9dVqji5QNHxIL2Y3hQkJHokyxOr3a9Odt8NTvNwbbkLzutGdj2m+SSSLkTV/qG/aVvBFq9ugNo9uGcwYxmQYwAsICHXpDQ3uHim2iz6pPJT1ZXlRhv9yvb8r4xgRLO2U+XNmv9kobITowDQoaJYGff3938PL42+/vcci+11/PbTBxzl5pKZgPmFsWMjoXijqfNh/kzXH+zUhaS165Zoql69OmZwLik3MfZ/+Lygpd2kVjsuyjUFZmsG7YNNDyslFY0Onf6ejohUmufGn4czz8vfJQsMgTHGQqLVfq+Jbg/S8Xf70fQEAh8EFB+44NOtdDLQN10B0Oh86nUx/EAEuGW3Qbj8djXZ6fbcWKaWF5xbaMqgbQJqSI3moTHw83nyp8M06njOCDT+2CBEK9SaRzaCiO87DDkBlEIrh6PdleZyJ8Lm2+BDOut7jxlrLOeIUfMT6i2B32tEuRybJPEUuK7OJGwtrp6HUTQMgQr0aa18nbWNSjTq5m5+IohpZkkNaNb5HPGODWh7XPGlLEMefw5UTxqfmgFtndoLVCMe6A8HBlH4zcT/E4kJj/IQvFB0afkWcLF8zthxSUtukWVYJfDpbzoNOYzbft8EcHGuC7l7ARpljIjc6FNVlYUB1kuIKOT06e2oV1VrSM6RAjs2wI8MMY9N4CkZf+EH4Ka1qRzIrXkjxJGVk0hrp8t7V4x21qwZFfajMMgt+tPnf1+GQ79fFCRc2owYpk0sQ8sh6SLyDZT80S6I6jbqb5IczPZM4nyuvE4Ru2O+TZte9T5wL7i+FFkC+bs0l08yRAi/GWbAYoP4Wy7ui9BxpT7uJRlDIFfRa53IIUaXp1sNjytmIaYX/oF0GoRFi4Hsgb6Utjy20PnYROmBSlh1Uu2GtOI8vHi+Psm2J+TYXsGCyNchmTe/YrZtSu649f/QcAAP//
// DO NOT EDIT
package com.paypal.payments;

import java.util.Map;
import java.util.HashMap;
import java.util.List;
import java.util.ArrayList;
import com.braintreepayments.http.annotations.*;
/**
 * The platform or partner fee, commission, or brokerage fee that is associated with the transaction. Not a separate or isolated transaction leg from the external perspective. The platform fee is limited in scope and is always associated with the original payment for the purchase unit.
 */
@Model
public class PlatformFee {

    // Required default constructor
    public PlatformFee() {}

	/**
	* REQUIRED
	* The currency and amount for a financial transaction, such as a balance or payment due.
	*/
	@SerializedName("amount")
	private Money amount;

	public Money amount() { return amount; }
	
	public PlatformFee amount(Money amount) {
	    this.amount = amount;
	    return this;
	}

	/**
	* The details for the merchant who receives the funds and fulfills the order. The merchant is also known as the payee.
	*/
	@SerializedName("payee")
	private MerchantBase payee;

	public MerchantBase payee() { return payee; }
	
	public PlatformFee payee(MerchantBase payee) {
	    this.payee = payee;
	    return this;
	}
}
