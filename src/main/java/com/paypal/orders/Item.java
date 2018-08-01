// This class was generated on Fri, 20 Jul 2018 16:05:52 PDT by version 0.1.0-dev+0ee05a-dirty of Braintree SDK Generator
// Item.java
// @version 0.1.0-dev+0ee05a-dirty
// @type object
// @data H4sIAAAAAAAC/+yXTU/8NhDG7/0Uo1z6Rwob+iJV2hsCVaKUF8FSqaIIZu3ZjbWOHewxNKr47pXzsiSEFYKiVQ+cohlP7N/MPn6U/SeZVSUl0+SIqUjS5A90CueaTrGI2SRNjql6Dg7JC6dKVtYk02SWE0hiVNrDwjrgnEAxFR7YwpygDE7k6ElOkjTZdw6r5rC9NLkglGdGV8l0gdpTTNwH5UiuE+fOluRYkU+m12tMz06Z5RhUINPSumoA3EuOwSModBXAVUn/ldIErZ/SN1FlD6VPO8xvmjTJhrxXvSVuEx994DaxYbRxFaIoFOv3jZZd+BjhfUDDioci6CU3kHYVEzgJnqNwER5zqwlMKObktgPvV2HA3cRjZM9WrGBFVCqzhGAUw7fL46udwQ38ZEmcWEPVGJnx7wFyE4+RRXCOjKgAjQQsbDBc0yIslEEjFGpgh8ajiG+l4IPIAT0gzFGjEbWQSqwKMgwy0Bb8pEW+FVYOVf9yZdzuNeeOaFfk6FAwOTi6PNv9+ccffnkeRHz35lsmrfCZMkxLh3GDTCpHgjNHnrOueDcW+2wHOEcGJcmwWijy9Y/dFW1How+ow3AaXWY8hXolhcdciRwKtczjzZr+Ffb2fhJB109qIq2aaN9APQtytTra1mKnWq0I7n47//OuGQI6AmM5urYSqHUFC9doB/Wk2TTrdn1xBkgSqkC9fuP1s2anh72zfJhL9aBkNF/DFji3waORnPvXj8u6Dn9tL6Vrh99aCtjFGqTUKMi3F2KgkBQ8EVwfdLmDKIT3yuYzlHHzthdEI7pt7vZAIMP8/80bxv1+WcOXNXxZw8esYZM2gtNDT6jjsS6uLn6P/xzqjzJlFtYVdQ8TmOXK16tYloTOgzKtxD3bgtz3vu8RkCvP1lWf8hF08/TdvwAAAP//
// DO NOT EDIT
package com.paypal.orders;

import java.util.Map;
import java.util.HashMap;
import java.util.List;
import java.util.ArrayList;
import com.braintreepayments.http.annotations.*;
/**
 * The details for the items to be purchased.
 */
@Model
public class Item {

    // Required default constructor
    public Item() {}

	/**
	* The item category type.
	*/
	@SerializedName("category")
	private String category;

	public String category() { return category; }
	
	public Item category(String category) {
	    this.category = category;
	    return this;
	}

	/**
	* The detailed item description.
	*/
	@SerializedName("description")
	private String description;

	public String description() { return description; }
	
	public Item description(String description) {
	    this.description = description;
	    return this;
	}

	/**
	* REQUIRED
	* The item name or title.
	*/
	@SerializedName("name")
	private String name;

	public String name() { return name; }
	
	public Item name(String name) {
	    this.name = name;
	    return this;
	}

	/**
	* REQUIRED
	* The item quantity. Must be a whole number.
	*/
	@SerializedName("quantity")
	private String quantity;

	public String quantity() { return quantity; }
	
	public Item quantity(String quantity) {
	    this.quantity = quantity;
	    return this;
	}

	/**
	* The stock keeping unit (SKU) for the item.
	*/
	@SerializedName("sku")
	private String sku;

	public String sku() { return sku; }
	
	public Item sku(String sku) {
	    this.sku = sku;
	    return this;
	}

	/**
	* The currency and amount for a financial transaction, such as a balance or payment due.
	*/
	@SerializedName("tax")
	private Money tax;

	public Money tax() { return tax; }
	
	public Item tax(Money tax) {
	    this.tax = tax;
	    return this;
	}

	/**
	* REQUIRED
	* The currency and amount for a financial transaction, such as a balance or payment due.
	*/
	@SerializedName("unit_amount")
	private Money unitAmount;

	public Money unitAmount() { return unitAmount; }
	
	public Item unitAmount(Money unitAmount) {
	    this.unitAmount = unitAmount;
	    return this;
	}

	/**
	* The URL to item information. This URL appears in the customer's transaction history.
	*/
	@SerializedName("url")
	private String url;

	public String url() { return url; }
	
	public Item url(String url) {
	    this.url = url;
	    return this;
	}
}
