// This class was generated on Thu, 16 May 2019 09:53:44 PDT by version 0.1.0-dev+8fcb5f of Braintree SDK Generator
// CreditFinancingOffer.java
// @version 0.1.0-dev+8fcb5f
// @type object
// @data H4sIAAAAAAAC/+xVXWvsRgx9768QfmrBG6cfUNi3kFBIS5PQhkJJw0Y7I6+HjGdcjZxgLvnvl/HXZteb3IS79yXsk7Gk0eicOZI+JddNRck8UUzayCI3Dp0ybrXweU6cpMk/yAaXli6wfDXuD2r6kCRNzigoNpUY75J5cl0QaBI0NgAufS0gBUGFDfEskCUlpKFLDGNiaBMfJWlywoxNV+ZxmvxFqC+dbZJ5jjZQNPxfGyY9Gq7YV8RiKCTzmxHguQuC1pbkBM66YqbozDpoocegNbTd/inaDhtWFfsH0vDsWHR1X4tuYGV/KP/0jpoprv7Sha5pA8+mfYpD1czkVAPoNGDpayeQewYc3gktCKMLqOKpFEKtCsAACEu06BSB5xGyrml/SIOwcasdAu1LXiivN8Fue6Zwb6RgopkqkFEJMZz/fTn75acff10TEc/efp9pr0JmnNCKMSbItGFSkjEFyYbgWQwO2Q8gBQoYTU5Mbii08h+C3sWIcL1FiKutfUq/yMoD2q2nHyxTFlpPCo+FUQWUZlUILGn+X318/LOqbful7s+a7u/EQcsFcauOHlpEas09wd3vV//edSQgEzgvIE1lFFrbQM6ddtAedUmzIevWHaBJmRLteGL3XdcXZ8/uCvVSmwej2yYUD1L4OqDTUoTd12UDwt88t+/EPfng6nJJDD4fC6ksKgp9Q2woJIVABDeng+00CuG9stmHMm7foI2K2Hi9ORcG01QdeSSkBfVopOhVMs5zKGLzr5hIg3go8Z4GZxwBX9v+b8ZkQqi31tJommLqXPFp2878Jptoq1H7fplWLsTlRt294aUlMy7Qdb3xRArGQeldFPp+K39hxYgXtIsIK4p5E8G267BoDovmsGg+7KJ5dUL0PbpjQKw9h/lwmA+H+fDB5sPt03efAQAA//8=
// DO NOT EDIT
package com.paypal.orders;

import java.util.Map;
import java.util.HashMap;
import java.util.List;
import java.util.ArrayList;
import com.braintreepayments.http.annotations.*;
/**
 * The details about the payer-selected credit financing offer.
 */
@Model
public class CreditFinancingOffer {

    // Required default constructor
    public CreditFinancingOffer() {}

	/**
	* The payer-approved installment payment plan details.
	*/
	@SerializedName("installment_details")
	private InstallmentDetails installmentDetails;

	public InstallmentDetails installmentDetails() { return installmentDetails; }
	
	public CreditFinancingOffer installmentDetails(InstallmentDetails installmentDetails) {
	    this.installmentDetails = installmentDetails;
	    return this;
	}

	/**
	* The issuer of the credit financing offer.
	*/
	@SerializedName("issuer")
	private String issuer;

	public String issuer() { return issuer; }
	
	public CreditFinancingOffer issuer(String issuer) {
	    this.issuer = issuer;
	    return this;
	}

	/**
	* The payer-selected financing term, in months.
	*/
	@SerializedName("term")
	private Integer term;

	public Integer term() { return term; }
	
	public CreditFinancingOffer term(Integer term) {
	    this.term = term;
	    return this;
	}

	/**
	* The currency and amount for a financial transaction, such as a balance or payment due.
	*/
	@SerializedName("total_interest")
	private Money totalInterest;

	public Money totalInterest() { return totalInterest; }
	
	public CreditFinancingOffer totalInterest(Money totalInterest) {
	    this.totalInterest = totalInterest;
	    return this;
	}

	/**
	* The currency and amount for a financial transaction, such as a balance or payment due.
	*/
	@SerializedName("total_payment")
	private Money totalPayment;

	public Money totalPayment() { return totalPayment; }
	
	public CreditFinancingOffer totalPayment(Money totalPayment) {
	    this.totalPayment = totalPayment;
	    return this;
	}
}
