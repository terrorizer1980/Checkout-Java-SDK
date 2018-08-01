// This class was generated on Fri, 20 Jul 2018 16:05:52 PDT by version 0.1.0-dev+0ee05a-dirty of Braintree SDK Generator
// LinkSchema.java
// @version 0.1.0-dev+0ee05a-dirty
// @type object
// @data H4sIAAAAAAAC/8SVzU7bQBDH732K0V4KUkhQ1XLILVWpFLVpENBeEIeJPY63Xc+a3TFgVbx7tU4gbJwgVBw47n/24zez8/FXndclqaH6rvkPnCU5Fah66hc6jTNDP7AIRtVT36heLb6QT5wuRVtWQ3WeEzi6qsgLpCgI1oEJ1wm6OUlf9dTIOawXLx321ClhOmVTq2GGxlMQrirtKH0QTpwtyYkmr4YXD4x29psSaeNhmurAgmYsVPiItm2L4V8Ix5Uxd70HwpExMM0gPLUB05hpFsMtlRhpxIABCWwGvpod+OZXfB9CoJsAF5UXuEajUxQCnKNmL4DGRPtj145e6hrXT7jG9bprS6Ub1yxTyKrCOtqhi9vyK6VMc5NFcW7F+i7zajtZSZwSJ+FQjBYZdsnmxWmet9kyh/OCWE7JW1M1Tz8m3Gh+ixjqVs/QGzvFiCEY+t1Shb7bZgrtM2a6V7bXU7Oj44qYUKo3zINiKa/w7pX2ZGgsIHVJgJxCYlnoVg6IE5tqnkNTytTdkNiWjjPN6Orj5bMRfMvU9qLB5jY2nBHBxaQyosvKldYTjFnIMQlMUBs4vhViH1oE7E3Gk+N9OEEnMGUawlfrCpTwd6sz5D3OCT7bVJO/3MtFSj8cDMRa4/uaJOtbNx/kUpiBy5IPhx8/7fdfp57DF0ZhWwpPffl/x+f8xg6hyT4IWM+KxFE3kbh8Rs9gK1EoFutddq8p0/bxa5nWxu+90t34Xe3vuMdsy7cSJT8TdHGkH6trmWcBy9LUILn2i/pEEAuSEwQvkBPy7+Hn6dj3wIcrGlNYw42WfHHuGk1F/deZPCVKKIVHJ9c8bVnfYj6WW/B2y3V59+4fAAAA//8=
// DO NOT EDIT
package com.paypal.orders;

import java.util.Map;
import java.util.HashMap;
import java.util.List;
import java.util.ArrayList;
import com.braintreepayments.http.annotations.*;
/**
 * The request data or link target.
 */
@Model
public class LinkSchema {

    // Required default constructor
    public LinkSchema() {}

	/**
	*/
	@SerializedName("additionalItems")
	private Object additionalItems;

	public Object additionalItems() { return additionalItems; }
	
	public LinkSchema additionalItems(Object additionalItems) {
	    this.additionalItems = additionalItems;
	    return this;
	}

	/**
	*/
	@SerializedName("definitions")
	private Object definitions;

	public Object definitions() { return definitions; }
	
	public LinkSchema definitions(Object definitions) {
	    this.definitions = definitions;
	    return this;
	}

	/**
	*/
	@SerializedName("dependencies")
	private Object dependencies;

	public Object dependencies() { return dependencies; }
	
	public LinkSchema dependencies(Object dependencies) {
	    this.dependencies = dependencies;
	    return this;
	}

	/**
	*/
	@SerializedName("fragmentResolution")
	private String fragmentResolution;

	public String fragmentResolution() { return fragmentResolution; }
	
	public LinkSchema fragmentResolution(String fragmentResolution) {
	    this.fragmentResolution = fragmentResolution;
	    return this;
	}

	/**
	* An item.
	*/
	@SerializedName("items")
	private Object items;

	public Object items() { return items; }
	
	public LinkSchema items(Object items) {
	    this.items = items;
	    return this;
	}

	/**
	* The media type and context-encoding scheme.
	*/
	@SerializedName("media")
	private Media media;

	public Media media() { return media; }
	
	public LinkSchema media(Media media) {
	    this.media = media;
	    return this;
	}

	/**
	*/
	@SerializedName("not")
	private Object not;

	public Object not() { return not; }
	
	public LinkSchema not(Object not) {
	    this.not = not;
	    return this;
	}


	/**
	* To apply this schema to the instances' URIs, start the URIs with this value.
	*/
	@SerializedName("pathStart")
	private String pathStart;

	public String pathStart() { return pathStart; }
	
	public LinkSchema pathStart(String pathStart) {
	    this.pathStart = pathStart;
	    return this;
	}

	/**
	*/
	@SerializedName("patternProperties")
	private Object patternProperties;

	public Object patternProperties() { return patternProperties; }
	
	public LinkSchema patternProperties(Object patternProperties) {
	    this.patternProperties = patternProperties;
	    return this;
	}

	/**
	*/
	@SerializedName("properties")
	private Object properties;

	public Object properties() { return properties; }
	
	public LinkSchema properties(Object properties) {
	    this.properties = properties;
	    return this;
	}
}
