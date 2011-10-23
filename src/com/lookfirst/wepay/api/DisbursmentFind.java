package com.lookfirst.wepay.api;

import java.util.List;

import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * https://stage.wepay.com/developer/reference/disbursement
 *
 * This call allows you to find disbursements.
 *
 * @author Jon Scott Stevens
 * @author Jeff Schnitzer
 */
@Data
@EqualsAndHashCode(callSuper=false)
public class DisbursmentFind extends WePayRequest<List<DisbursementDetails>> {

	/** Yes	The unique ID of the account you want to look up disbursements for. */
	private String accountId;
	/** No	The reference_id on the disbursement object (set in /disbursement/create). */
	private String referenceId;
	/** No	The state the disbursement is in (new, sent, or failed). */
	private String state;

	/** */
	@Override
	public String getEndpoint() {
		return "/disbursement/find";
	}
}