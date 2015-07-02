package com.cartmatic.estore.common.model.customer;

import com.cartmatic.estore.common.model.customer.base.CustomHistoryTbl;

/**
 * Model class for Address. Add not database mapped fileds in this class.
 */
public class CustomHistory extends CustomHistoryTbl {
	
	private String url ;

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

}
