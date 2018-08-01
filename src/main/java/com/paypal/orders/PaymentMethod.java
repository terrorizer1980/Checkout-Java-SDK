// This class was generated on Fri, 20 Jul 2018 16:05:52 PDT by version 0.1.0-dev+0ee05a-dirty of Braintree SDK Generator
// PaymentMethod.java
// @version 0.1.0-dev+0ee05a-dirty
// @type object
// @data H4sIAAAAAAAC/6zRT0szMRAG8Pv7KcKcty+e9yZ4E7VI8SJS0t2nbiD/nJkcgvS7S1uboqt40GNmhuT5TV5pVTOop6WtAVHNDXRKI3X0YNnZjcetDfs+dXSNej5cQQZ2WV2K1NNqghmKaApgY+NoAniYbFST3+/NjC0YcYD8p44umW09Pn3R0T3seBd9pX5rvWBfeCmOMbbCklMGq4NQ/9hCi7KLz/Owm1LBa4HHoBg/RJ+1vocsTlMNEQ7LMSkanXA2ilP8FhWL97vuR5nAe/D6uE3+ZPuiOdedUi/aWONJKvwH/3OgPO3+vQEAAP//
// DO NOT EDIT
package com.paypal.orders;

import java.util.Map;
import java.util.HashMap;
import java.util.List;
import java.util.ArrayList;
import com.braintreepayments.http.annotations.*;
/**
 * The customer and merchant payment preferences.
 */
@Model
public class PaymentMethod {

    // Required default constructor
    public PaymentMethod() {}

	/**
	* The customer-selected payment method on the merchant site.
	*/
	@SerializedName("buyer_selected")
	private String buyerSelected;

	public String buyerSelected() { return buyerSelected; }
	
	public PaymentMethod buyerSelected(String buyerSelected) {
	    this.buyerSelected = buyerSelected;
	    return this;
	}

	/**
	* The merchant-preferred payment sources.
	*/
	@SerializedName("seller_preferred")
	private String sellerPreferred;

	public String sellerPreferred() { return sellerPreferred; }
	
	public PaymentMethod sellerPreferred(String sellerPreferred) {
	    this.sellerPreferred = sellerPreferred;
	    return this;
	}
}
