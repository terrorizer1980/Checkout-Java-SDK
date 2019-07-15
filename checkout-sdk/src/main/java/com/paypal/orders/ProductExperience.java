// This class was generated on Thu, 16 May 2019 09:53:44 PDT by version 0.1.0-dev+8fcb5f of Braintree SDK Generator
// ProductExperience.java
// @version 0.1.0-dev+8fcb5f
// @type object
// @data H4sIAAAAAAAC/7yUQasUMQzH736K0PMgnvcm6EnQQRYvIkteJ/Na7KQ1zaBF3neXdvbt7DAuHnzssWma/H//pv1tjiWROZhe4jBbhfe/EokntmQ68wXF40OgjzjVHNOZD1TWxTvKVnxSH9kczNERpHMVulTJoA4VEOZMAjZOKZBShsiA0GPpMYAKckZb67w2nXkrgmWR9aYznwmHTxyKOYwYMtXAj9kLDZdALzGRqKdsDl8vQFnF8+MewjpkprBhWWN/QcIyESuMIf6EcyJoSfS/UnkO4an7p15ilXJK0bNuNG/jt3VPpC4OZ/tdzAQaISuKgl6lJYmWcr4T1LnraRG34dptbdH6HdZQgZ4HqzFdzxMcnc9gkSHHidRPlOGBYPDjSFILqUNup5qh0AwFPz4bhvxYOzjyApPnAYa5IrUT1pH9HudlNu7l3PLCTrXl1rftxu232Qb5jgNcjTytH8Je+Y2EPUG7kjVxIRmjtMt4+b+k8X17evUHAAD//w==
// DO NOT EDIT
package com.paypal.orders;

import java.util.Map;
import java.util.HashMap;
import java.util.List;
import java.util.ArrayList;
import com.braintreepayments.http.annotations.*;
/**
 * The product experiences that a user completes on a PayPal transaction.
 */
@Model
public class ProductExperience {

    // Required default constructor
    public ProductExperience() {}

	/**
	* The payment flow channel type.
	*/
	@SerializedName("channel")
	private String channel;

	public String channel() { return channel; }
	
	public ProductExperience channel(String channel) {
	    this.channel = channel;
	    return this;
	}

	/**
	* The payment method user chose to start the payment process.
	*/
	@SerializedName("entry_point")
	private String entryPoint;

	public String entryPoint() { return entryPoint; }
	
	public ProductExperience entryPoint(String entryPoint) {
	    this.entryPoint = entryPoint;
	    return this;
	}

	/**
	* Payment method used to complete the transaction. This can sometimes be different than the entry point if user changed their mind during the checkout flow.
	*/
	@SerializedName("payment_method")
	private String paymentMethod;

	public String paymentMethod() { return paymentMethod; }
	
	public ProductExperience paymentMethod(String paymentMethod) {
	    this.paymentMethod = paymentMethod;
	    return this;
	}

	/**
	* The product flow type.
	*/
	@SerializedName("product_flow")
	private String productFlow;

	public String productFlow() { return productFlow; }
	
	public ProductExperience productFlow(String productFlow) {
	    this.productFlow = productFlow;
	    return this;
	}

	/**
	* The user experience flow for the PayPal transaction.
	*/
	@SerializedName("user_experience_flow")
	private String userExperienceFlow;

	public String userExperienceFlow() { return userExperienceFlow; }
	
	public ProductExperience userExperienceFlow(String userExperienceFlow) {
	    this.userExperienceFlow = userExperienceFlow;
	    return this;
	}
}
