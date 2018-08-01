// This class was generated on Fri, 20 Jul 2018 16:05:52 PDT by version 0.1.0-dev+0ee05a-dirty of Braintree SDK Generator
// Name.java
// @version 0.1.0-dev+0ee05a-dirty
// @type object
// @data H4sIAAAAAAAC/7yVQY/TQAyF7/wKay57iSrOvVXbnpBgtSpcEFq5jdNaO/GEsQNEaP87yiRNm02hB1a5NW8c5/ObN9PfbttU5JbuI5bkMvcFI+POU3pcOpe5D9ScH9ak+8iVcRC3dNsjgWBJEAqwI0GF0ZqFy9wqRmy6xu8z90iYfxLfuGWBXqkVvtccKR+Ehxgqisakbvl1QFKLLIcpFHqjKGj0VNTeP0lHfua8vj5GX28eHjf3q+1mvYDtCf1OYXg3DbaAexTYESDsamUh1aRnILx/7n6FCCgNBDtS7NywIxrsUSRY+65Wng1YLEDBUS0Dj2p9/5MVULR9zl9JPF3Nf/optfcv2U1Tr1v5dwOTaRQ1yOBdWzwn8oF/kEyZR/JN6FSddrHfnBkHKDnPPU0nGOs3R+jK+0B9VgL0GsACqIVIUNbeuPJ0WafAsvd1znLoT67FIE3J+84KbNN8p9mo9zymVJEK/jXyY5CuWJGWErSxecrauYe7aE5urYvX3IM05e6W0qm3i+tnVt44Cd5Zuxm6vrRLS8m+9xpWbfaeJfwUQE2zXbvt+OIPA1gB+/b/zG//ydfZLcfZLcMpu339m/j57eXdHwAAAP//
// DO NOT EDIT
package com.paypal.orders;

import java.util.Map;
import java.util.HashMap;
import java.util.List;
import java.util.ArrayList;
import com.braintreepayments.http.annotations.*;
/**
 * The name of the party.
 */
@Model
public class Name {

    // Required default constructor
    public Name() {}

	/**
	* DEPRECATED. The party's alternate name. Can be a business name, nickname, or any other name that cannot be split into first, last name. Required for a business party name.
	*/
	@SerializedName("alternate_full_name")
	private String alternateFullName;

	public String alternateFullName() { return alternateFullName; }
	
	public Name alternateFullName(String alternateFullName) {
	    this.alternateFullName = alternateFullName;
	    return this;
	}

	/**
	* The person party's full name.
	*/
	@SerializedName("full_name")
	private String fullName;

	public String fullName() { return fullName; }
	
	public Name fullName(String fullName) {
	    this.fullName = fullName;
	    return this;
	}

	/**
	* The person party's given, or first, name.
	*/
	@SerializedName("given_name")
	private String givenName;

	public String givenName() { return givenName; }
	
	public Name givenName(String givenName) {
	    this.givenName = givenName;
	    return this;
	}

	/**
	* The person party's middle name. Use also to store multiple middle names including the patronymic, or father's, middle name.
	*/
	@SerializedName("middle_name")
	private String middleName;

	public String middleName() { return middleName; }
	
	public Name middleName(String middleName) {
	    this.middleName = middleName;
	    return this;
	}

	/**
	* The prefix, or title, to the party name.
	*/
	@SerializedName("prefix")
	private String prefix;

	public String prefix() { return prefix; }
	
	public Name prefix(String prefix) {
	    this.prefix = prefix;
	    return this;
	}

	/**
	* The suffix for the party's name.
	*/
	@SerializedName("suffix")
	private String suffix;

	public String suffix() { return suffix; }
	
	public Name suffix(String suffix) {
	    this.suffix = suffix;
	    return this;
	}

	/**
	* The person party's surname or family name. Also known as the last name. Required if the party is a person. Use also to store multiple surnames including the matronymic, or mother's, surname.
	*/
	@SerializedName("surname")
	private String surname;

	public String surname() { return surname; }
	
	public Name surname(String surname) {
	    this.surname = surname;
	    return this;
	}
}
