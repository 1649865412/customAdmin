package com.cartmatic.estore.customer.service;

import java.util.List;

import com.cartmatic.estore.common.model.customer.Address;
import com.cartmatic.estore.common.model.customer.AddressModel;
import com.cartmatic.estore.common.model.customer.CustomHistory;
import com.cartmatic.estore.core.service.GenericManager;

/**
 * Manager interface for CustomHistory, responsible for business processing, and communicate between web and persistence layer.
 *
 */
public interface CustomHistoryManager extends GenericManager<CustomHistory> {
	
	/**
	 * 根据用户和产品查找唯一用户定制历史
	 * @param userId
	 * @param productId
	 * @return
	 */
	public CustomHistory findUniqueCH(Integer userId, Integer productId);
	
}
