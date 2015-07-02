package com.cartmatic.estore.customer.service.impl;

import java.util.HashMap;
import java.util.Map;

import com.cartmatic.estore.common.model.customer.CustomHistory;
import com.cartmatic.estore.core.service.impl.GenericManagerImpl;
import com.cartmatic.estore.customer.dao.CustomHistoryDao;
import com.cartmatic.estore.customer.service.CustomHistoryManager;


/**
 * Manager implementation for Address, responsible for business processing, and communicate between web and persistence layer.
 */
public class CustomHistoryManagerImpl extends GenericManagerImpl<CustomHistory> implements CustomHistoryManager {

	private CustomHistoryDao customHistoryDao;
	
	@Override
	protected void initManager() {
		// TODO Auto-generated method stub
		this.dao = this.customHistoryDao;
	}

	@Override
	protected void onDelete(CustomHistory entity) {
		// TODO Auto-generated method stub
		
	}

	@Override
	protected void onSave(CustomHistory entity) {
		// TODO Auto-generated method stub
		
	}

	public CustomHistoryDao getCustomHistoryDao() {
		return customHistoryDao;
	}

	public void setCustomHistoryDao(CustomHistoryDao customHistoryDao) {
		this.customHistoryDao = customHistoryDao;
	}

	@Override
	public CustomHistory findUniqueCH(Integer userId, Integer productId) {
		// TODO Auto-generated method stub
		Map<String,Object> map = new HashMap<String,Object>();
		map.put("appUser.appuserId", userId);
		map.put("product.productId", productId);
		return this.customHistoryDao.findUniqueByMapProperty(map);
	}

	

}
