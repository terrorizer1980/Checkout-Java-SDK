// This class was generated on Thu, 16 May 2019 09:53:44 PDT by version 0.1.0-dev+8fcb5f of Braintree SDK Generator
// AirlineTicket.java
// @version 0.1.0-dev+8fcb5f
// @type object
// @data H4sIAAAAAAAC/+xY3W4bNxO9/55isN9NAqy0Tt0fVHeCjQBu0SRwhRaFa8gjcqQlTJGb4dD2tsi7F9wfxeuV2wQVetHqytjhkHPm8PCQ1u/Zoq4om2Vo2BpHSzHqliTLs5+QDa4svcHt3vHvqe6Gsjw7p6DYVGK8y2bZoiTQJGhsgLVnkJKgmw/t/GmWZ3NmrNvqJ3l2SajfOltnszXaQCnwPhomvQu8Y18Ri6GQza52uH/wjuox3DUyDUB2gTFQFZnJqRrQacCtj04a0Ahr49ApgxaE0QVUaVYOIaoSMADCCi06ReAZKqy35AR0pMP1FoSN24yb6yEvldfDLp+OjNu9kpKJJqpERiXEcPHj28mXX7z65iMRae71i0J7FQrjhDaMaYFCGyYlBVOQok+epORQvAQpUcBocmLWhkKz533SZzEiHJ8Q4qK1H/K/ZOUObRyy0UfGLDQjOdyXRpWwNZtSYEWzX+PJyamKtvlL7Zc17dfcQcMFcaOOrrXUqTW3BDffvfvlpiUBmcB5Aakro9DaGtbcagfttF206Fd9UgM0KbNFu5uxv9bizfmjWiGutLkzmnRC6EFKHwM6LWXYX67oO3zdnU3uyAcXtyti8OsdkMqiotAdiIFCcghEcHXWx86SED5XNodQxvUjbTznBvTEDOjoBUcvOHrBv9oLntOGCSHSUqMMBTIIj1USBJ2eoPWOICXlYBxcXTghdiRNqHENMVtKFG1Rrl+UIlWYFYV4b8PUkKynnjdFKVtb8Fqdnp5++/9Aze5Ovpp+/XIKCw9MFVNIBhIqaizH0gZtq9Pw2HOaon4NK8NS5lD7CKH00WqIoUUZ4N5ICc4DhuCVQaEOYtpus6XJb11DOIWfS3J0RwyVD8GsLOXNOtJ3j6zhJq26TDNvkqhpCovSBGDaRIsM9JCwh6RW7Sk02r9Da1p6rG1BTSGpjR5wW6Uir2nFEbmG01dgQpvfcOm8lMZtUvDW+XsHuPJRwBJWUBNy+Lv2+olukqRh3GapkNkQj632mYQ9F0yb0ByatHOJ2/ZFDI3++B/qqD3cgx52oTHq7u0+aSDqHnBvEAwX5weGvfLeErox7mQcbJSQ3vePyL7RYTcXThvVnouSpCQe7gB8XOHAHT3zMBF8GHTQfh8fJseHyfFh8p97mAjjHdklbvYfm73DY9VczBfzjqMc0AYP88uzR2Y9vzwrHuWkC5wgOvM+UnctcZ/d/3bTVoa2cneIuqsgXf6H+UnnEw/QkAWXgs+T1A2PSUoDu/v3T7qjQzZ3/eF/fwAAAP//
// DO NOT EDIT
package com.paypal.orders;

import java.util.Map;
import java.util.HashMap;
import java.util.List;
import java.util.ArrayList;
import com.braintreepayments.http.annotations.*;
/**
 * The details for the airline ticket.
 */
@Model
public class AirlineTicket {

    // Required default constructor
    public AirlineTicket() {}

	/**
	* The currency and amount for a financial transaction, such as a balance or payment due.
	*/
	@SerializedName("fare")
	private Money fare;

	public Money fare() { return fare; }
	
	public AirlineTicket fare(Money fare) {
	    this.fare = fare;
	    return this;
	}

	/**
	* The currency and amount for a financial transaction, such as a balance or payment due.
	*/
	@SerializedName("fee")
	private Money fee;

	public Money fee() { return fee; }
	
	public AirlineTicket fee(Money fee) {
	    this.fee = fee;
	    return this;
	}

	/**
	* The stand-alone date, in [Internet date and time format](https://tools.ietf.org/html/rfc3339#section-5.6). To represent special legal values, such as a date of birth, you should use dates with no associated time or time-zone data. Whenever possible, use the standard `date_time` type. This regular expression does not validate all dates. For example, February 31 is valid and nothing is known about leap years.
	*/
	@SerializedName("issue_date")
	private String issueDate;

	public String issueDate() { return issueDate; }
	
	public AirlineTicket issueDate(String issueDate) {
	    this.issueDate = issueDate;
	    return this;
	}

	/**
	* The carrier code of the ticket issuer.
	*/
	@SerializedName("issuing_carrier_code")
	private String issuingCarrierCode;

	public String issuingCarrierCode() { return issuingCarrierCode; }
	
	public AirlineTicket issuingCarrierCode(String issuingCarrierCode) {
	    this.issuingCarrierCode = issuingCarrierCode;
	    return this;
	}

	/**
	* The airline-issued ticket number or ID.
	*/
	@SerializedName("number")
	private String number;

	public String number() { return number; }
	
	public AirlineTicket number(String number) {
	    this.number = number;
	    return this;
	}

	/**
	* Indicates whether the ticket is restricted.
	*/
	@SerializedName("restricted_ticket")
	private Boolean restrictedTicket;

	public Boolean restrictedTicket() { return restrictedTicket; }
	
	public AirlineTicket restrictedTicket(Boolean restrictedTicket) {
	    this.restrictedTicket = restrictedTicket;
	    return this;
	}

	/**
	* The currency and amount for a financial transaction, such as a balance or payment due.
	*/
	@SerializedName("tax")
	private Money tax;

	public Money tax() { return tax; }
	
	public AirlineTicket tax(Money tax) {
	    this.tax = tax;
	    return this;
	}

	/**
	* The IATA number, also ARC number or ARC/IATA number. The unique code or number for the travel agency that issued this ticket.
	*/
	@SerializedName("travel_agency_code")
	private String travelAgencyCode;

	public String travelAgencyCode() { return travelAgencyCode; }
	
	public AirlineTicket travelAgencyCode(String travelAgencyCode) {
	    this.travelAgencyCode = travelAgencyCode;
	    return this;
	}

	/**
	* The name of the travel agency that issued the ticket.
	*/
	@SerializedName("travel_agency_name")
	private String travelAgencyName;

	public String travelAgencyName() { return travelAgencyName; }
	
	public AirlineTicket travelAgencyName(String travelAgencyName) {
	    this.travelAgencyName = travelAgencyName;
	    return this;
	}
}
