// This class was generated on Thu, 16 May 2019 09:53:44 PDT by version 0.1.0-dev+8fcb5f of Braintree SDK Generator
// FlightLeg.java
// @version 0.1.0-dev+8fcb5f
// @type object
// @data H4sIAAAAAAAC/+xYX28bRw5/v09B6F4SQH+SOHeH85uRILhc0SRojRaFa8jUDFc79ezMlsOVvS3y3QvO7tqWVm6bNlWA1E+2htzh/x/J+Xly2tY0OZ4U3q1LWXpaT6aTb5Adrjy9wWpE+4La/ngynbykZNjV4mKYHE9OSwJLgs4niAVISdB9Cp7W88l0csKMbSfwyXTyFaF9G3w7OS7QJ9KDHxvHZG8O3nGsicVRmhyf3aiahF3YoyZa61QT9MsQBfXftKXwPQzbRpwEoGAjJ6ooCEQGJpVolA4xZLPEmUuSOewwGwywIsAAuKZg2hlaSxYGYXoZQoXBokRuYR03xCF/yb3pN7xTSI0pARMgbNA31N8leD2Hky2dnPJ4V7leygoT2RtN25o0GAUy3b2zswCunJT6q2SimcUWKhdc1VSQBNs/G7LQeP9++ttxY3Yb9Et0XEeW7ZCNaOOU62lgoqWpWmepcIEsrFo4e31yenL+qBSp0/FicXV1NXcoOI+8XtTNyjvTpcHiHa4pLfSKWSJkU84x1dePD+wCcRXttb8njI1XwhRcF+yyPK4qePYc/sdQRK5QDqS/UT2Jl+q/Lf13CGP9NT4gV3HmSYQY0JjYBHFhneMJUqKAsxTEFY5SNrO/9FC2xfBDE3KpLbuqWYamWhFvG/orXDsAM9SeC3DnK+hqETBEKYl7pilclc6UIHFN+bjCS4KmBoTkwtqTXiGMRrTIs2NwTQfyjKUaWRqmvaW7j/pZFu+toRaF7vFBTxo7IAkGO0MfA4Ey5WI+ex2EOJDkI8Bgc6H3RX3rEonRp7kjKbJTSqn8ggtzdHT0338mynk1+9f834/ncBqBqWZK2m1STcah17aMvmsv6W5zyEJjASvHUk6hjQ2kMjbeQpM6LVOXrSECphSNQ6Fexcj57+yn3iCcw7clBdoQQx1TcitP03yPDNYjW7jQWzPMXeSeNYfT0iVgWjceGehadU9aJzZS0japervOPd53Ss3hVVRerGoV8opW3CC3cPRUm2Tmz77UElOEcQkuQ7wKgKvY6JSCNbSEnA6eOSPgH5E+NfR/GQO1e2ZD5G3F+4OxuqZh1qEoRwArRXnVFBAKFzDkhBTGkNDsDkAr9BhMzq0a2zww2Yb++olyUHlPX9uhjM0962YqU6KiMzG8/vrt7Pmzp/+5dYR+e/5oYaNJCxeE1pzxbGEdk5GFzniLgXmmzGnxeH9D7Jk+yCPCzR/L2owXW94YTsZeyJShiVV5F1jR8ffNkydHpvH5L3W/vOt+nQTIvqCcx4Npaql3lwQX/3/33UXnBGTKOCBt7Qx630LBXe6gn3eXLoZbd2SAJeMq9Ddf7Jd1+ublHVmpWVm3cTqFuyARpIxNwmClTPvFLQYLFZU0TrdTfh4NFGIHRWqPhlJfEFsZMoVEBGcvhrMXmggfmjYfIzPOf0duaPUvV5hcGtfMmLYHJHTma1LX/9Gxd4FA4pDwraKFxiKvNQokFFT6DWsSLIquXzJuyOdFTJJeUTg91Sg0vve0aIvpd7nDoCXtuIQesPIBKx+w8u+Jld2z2hgnt87HedK/qd365TatP8pL205q9xl2r/57luFdyie34b4QJOKNM7Q0HtP2W+EuZc/i1nFA5tAG02/q5W036hd9rGvv6FBLRZJYx82+x5hdytimGGh4iLnz+hKsbtq685XdI4TaWGNKFBR6XAJFWPG6AsbuhQJhEHaYxip4vWVq9/uhsT401ofG+pk11vP3//gFAAD//w==
// DO NOT EDIT
package com.paypal.orders;

import java.util.Map;
import java.util.HashMap;
import java.util.List;
import java.util.ArrayList;
import com.braintreepayments.http.annotations.*;
/**
 * The details of the flight leg.
 */
@Model
public class FlightLeg {

    // Required default constructor
    public FlightLeg() {}

	/**
	* An endorsement or restriction on the ticket. An endorsement can be an agency-added notation or a mandatory government required notation, such as a value-added tax. A restriction is a limitation based on the type of fare, such as a ticket with a three-day minimum stay.
	*/
	@SerializedName("additional_notations")
	private String additionalNotations;

	public String additionalNotations() { return additionalNotations; }
	
	public FlightLeg additionalNotations(String additionalNotations) {
	    this.additionalNotations = additionalNotations;
	    return this;
	}

	/**
	* The airport code, as defined by [IATA](https://www.iata.org/publications/Pages/code-search.aspx).
	*/
	@SerializedName("arrival_airport")
	private String arrivalAirport;

	public String arrivalAirport() { return arrivalAirport; }
	
	public FlightLeg arrivalAirport(String arrivalAirport) {
	    this.arrivalAirport = arrivalAirport;
	    return this;
	}

	/**
	* The time, in the hh:mm 24 Hr format.
	*/
	@SerializedName("arrival_time")
	private String arrivalTime;

	public String arrivalTime() { return arrivalTime; }
	
	public FlightLeg arrivalTime(String arrivalTime) {
	    this.arrivalTime = arrivalTime;
	    return this;
	}

	/**
	* The IATA two-letter accounting code that identifies the carrier.
	*/
	@SerializedName("carrier_code")
	private String carrierCode;

	public String carrierCode() { return carrierCode; }
	
	public FlightLeg carrierCode(String carrierCode) {
	    this.carrierCode = carrierCode;
	    return this;
	}

	/**
	* A ticket in conjunction  with  another ticket, which together make up a single contract of carriage.
	*/
	@SerializedName("conjunction_ticket_number")
	private String conjunctionTicketNumber;

	public String conjunctionTicketNumber() { return conjunctionTicketNumber; }
	
	public FlightLeg conjunctionTicketNumber(String conjunctionTicketNumber) {
	    this.conjunctionTicketNumber = conjunctionTicketNumber;
	    return this;
	}

	/**
	* The airport code, as defined by [IATA](https://www.iata.org/publications/Pages/code-search.aspx).
	*/
	@SerializedName("departure_airport")
	private String departureAirport;

	public String departureAirport() { return departureAirport; }
	
	public FlightLeg departureAirport(String departureAirport) {
	    this.departureAirport = departureAirport;
	    return this;
	}

	/**
	* The stand-alone date, in [Internet date and time format](https://tools.ietf.org/html/rfc3339#section-5.6). To represent special legal values, such as a date of birth, you should use dates with no associated time or time-zone data. Whenever possible, use the standard `date_time` type. This regular expression does not validate all dates. For example, February 31 is valid and nothing is known about leap years.
	*/
	@SerializedName("departure_date")
	private String departureDate;

	public String departureDate() { return departureDate; }
	
	public FlightLeg departureDate(String departureDate) {
	    this.departureDate = departureDate;
	    return this;
	}

	/**
	* The time, in the hh:mm 24 Hr format.
	*/
	@SerializedName("departure_time")
	private String departureTime;

	public String departureTime() { return departureTime; }
	
	public FlightLeg departureTime(String departureTime) {
	    this.departureTime = departureTime;
	    return this;
	}

	/**
	* The currency and amount for a financial transaction, such as a balance or payment due.
	*/
	@SerializedName("fare")
	private Money fare;

	public Money fare() { return fare; }
	
	public FlightLeg fare(Money fare) {
	    this.fare = fare;
	    return this;
	}

	/**
	* The code used by airline to identify a fare type and enable airline staff and travel agents to find the rules for this ticket.
	*/
	@SerializedName("fare_basis_code")
	private String fareBasisCode;

	public String fareBasisCode() { return fareBasisCode; }
	
	public FlightLeg fareBasisCode(String fareBasisCode) {
	    this.fareBasisCode = fareBasisCode;
	    return this;
	}

	/**
	* The currency and amount for a financial transaction, such as a balance or payment due.
	*/
	@SerializedName("fee")
	private Money fee;

	public Money fee() { return fee; }
	
	public FlightLeg fee(Money fee) {
	    this.fee = fee;
	    return this;
	}

	/**
	* The flight number of the current leg.
	*/
	@SerializedName("flight_code")
	private String flightCode;

	public String flightCode() { return flightCode; }
	
	public FlightLeg flightCode(String flightCode) {
	    this.flightCode = flightCode;
	    return this;
	}

	/**
	* The flight number of the current leg.
	*/
	@SerializedName("flight_number")
	private Integer flightNumber;

	public Integer flightNumber() { return flightNumber; }
	
	public FlightLeg flightNumber(Integer flightNumber) {
	    this.flightNumber = flightNumber;
	    return this;
	}

	/**
	* The service class to which the airline ticket applies.
	*/
	@SerializedName("service_class")
	private String serviceClass;

	public String serviceClass() { return serviceClass; }
	
	public FlightLeg serviceClass(String serviceClass) {
	    this.serviceClass = serviceClass;
	    return this;
	}

	/**
	* The one-letter code that indicates whether the passenger is entitled to make a stopover.
	*/
	@SerializedName("stopover_code")
	private String stopoverCode;

	public String stopoverCode() { return stopoverCode; }
	
	public FlightLeg stopoverCode(String stopoverCode) {
	    this.stopoverCode = stopoverCode;
	    return this;
	}

	/**
	* The currency and amount for a financial transaction, such as a balance or payment due.
	*/
	@SerializedName("tax")
	private Money tax;

	public Money tax() { return tax; }
	
	public FlightLeg tax(Money tax) {
	    this.tax = tax;
	    return this;
	}
}
