// This class was generated on Fri, 20 Jul 2018 16:07:18 PDT by version 0.1.0-dev+0ee05a-dirty of Braintree SDK Generator
// MerchantBase.java
// @version 0.1.0-dev+0ee05a-dirty
// @type object
// @data H4sIAAAAAAAC/6xUzW7UPBTdf09x5XU0rdqvLGYFqAsQolSosAFU3bFPJlad6/TamWlAfXdkZ/ozrRBIsInkY5/4np/kh7mYBpileQ+1HUum15xgGvOZ1fMq4Iz7sm0a8w7Tw+IUyaofso9iluaiAzlk9iFRG5VyB+rvXrjtIiks/Aap7rSjuEQsjtoxtD6EGY7qoAu6eMz1iTikSFcSt0I8Hxx4AhamMa9UeZrnP2zMR7D7IGEyy5ZDQgGuR69w98C5xgGaPZJZfrlXnrJ6WT+XjJ59uGTnFCnt6X+689wMLxkqXBAO/jscVQ7tOIuv4+HhsV2FaK+ux5hR1/PTpqxR1jNyFjOWM3zwGKdPA+VIL/4n27GyzdBErCAOIW7haIU2lqU4Ojo5+dUpbjPmtOY7bHS7UV7uLn1AKPm1LOhN3GIDbSprDYFyCBOxtRgyHPV84/uxpwBZ5662gWVffUn16OTx6HPqA+fiGm2gvvW1LJwLe5RqkvvTKQk3PuU7lw+e2vyXzZExhNvmt/W56/Cld3vl2cefV+ecp3MOteRKb08b2nbedvVLoJ7TFVwxKPkoFNuawo7B1sZRMsnYr6C1guLgagRjAm197ih3Xh0NXLXMtj/lJVLUG1ZhIojVqQZbqsQ0aBzUI7NOtCmCJZcxyk/j+KhwxwRXqgkpodT5FGkMefEvbP92+99PAAAA//8=
// DO NOT EDIT
package com.paypal.payments;

import java.util.Map;
import java.util.HashMap;
import java.util.List;
import java.util.ArrayList;
import com.braintreepayments.http.annotations.*;
/**
 * The details for the merchant who receives the funds and fulfills the order. The merchant is also known as the payee.
 */
@Model
public class MerchantBase {

    // Required default constructor
    public MerchantBase() {}

	/**
	* The internationalized email address.<blockquote><strong>Note:</strong> Up to 64 characters are allowed before and 255 characters are allowed after the <code>@</code> sign. However, the generally accepted maximum length for an email address is 254 characters. The pattern verifies that an unquoted <code>@</code> sign exists.</blockquote>
	*/
	@SerializedName("email_address")
	private String emailAddress;

	public String emailAddress() { return emailAddress; }
	
	public MerchantBase emailAddress(String emailAddress) {
	    this.emailAddress = emailAddress;
	    return this;
	}

	/**
	* The PayPal payer ID, which is a masked version of the PayPal account number intended for use with third parties. The account number is reversibly encrypted and a proprietary variant of Base32 is used to encode the result.
	*/
	@SerializedName("merchant_id")
	private String merchantId;

	public String merchantId() { return merchantId; }
	
	public MerchantBase merchantId(String merchantId) {
	    this.merchantId = merchantId;
	    return this;
	}
}
