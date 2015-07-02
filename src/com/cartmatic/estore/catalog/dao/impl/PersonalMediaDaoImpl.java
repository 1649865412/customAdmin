package com.cartmatic.estore.catalog.dao.impl;

import java.util.ArrayList;
import java.util.List;

import com.cartmatic.estore.Constants;
import com.cartmatic.estore.catalog.dao.PersonalMediaDao;
import com.cartmatic.estore.common.model.catalog.PersonalMedia;
import com.cartmatic.estore.common.model.catalog.ProductMedia;
import com.cartmatic.estore.core.dao.impl.HibernateGenericDaoImpl;

/**
 * Dao implementation for ProductMedia.
*/
public class PersonalMediaDaoImpl extends HibernateGenericDaoImpl<PersonalMedia> implements PersonalMediaDao {

	
	@Override
	public List<PersonalMedia> findPersonalMediaBySC(Integer shoppingcartId) {
		// TODO Auto-generated method stub
		StringBuffer hql=new StringBuffer("from PersonalMedia pm where pm.shoppingcartId=? ");
		List<Object> objList=new ArrayList<Object>();
		objList.add(shoppingcartId);
		List<PersonalMedia> personalMedia=findByHql(hql.toString(), objList.toArray());
		return personalMedia;
	}

	@Override
	public List<PersonalMedia> findPersonalMediaBySO(Integer salesOrderId) {
		// TODO Auto-generated method stub
		StringBuffer hql=new StringBuffer("from PersonalMedia pm where pm.salesOrderId=? ");
		List<Object> objList=new ArrayList<Object>();
		objList.add(salesOrderId);
		List<PersonalMedia> personalMedia=findByHql(hql.toString(), objList.toArray());
		return personalMedia;
	}


}