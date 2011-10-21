package com.lookfirst.wepay.api;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

/**
 * https://stage.wepay.com/developer/reference/account
 *
 * This call lets you get the tax rates for an account. They will be in the same format as detailed in the /account/set_tax call.
 *
 * @author Jon Scott Stevens
 */
@Data
@ToString
@EqualsAndHashCode(callSuper=false)
public class WePayAccountGetTax extends WePayRequest<WePayAccountGetTaxResponse> {

	/** The unique ID of the account you want to look up. */
	private String accountId;

	/** */
	public WePayAccountGetTax() {
		super(WePayAccountGetTaxResponse.class);
	}

	/** */
	@Override
	public String getEndpoint() {
		return "/account/get_tax";
	}
}