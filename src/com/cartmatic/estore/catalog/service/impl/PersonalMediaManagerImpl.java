package com.cartmatic.estore.catalog.service.impl;

import java.util.List;
import java.util.Map;

import com.cartmatic.estore.catalog.dao.PersonalMediaDao;
import com.cartmatic.estore.catalog.service.PersonalMediaManager;
import com.cartmatic.estore.common.model.catalog.PersonalMedia;
import com.cartmatic.estore.common.model.catalog.ProductDataModel;
import com.cartmatic.estore.core.service.impl.GenericManagerImpl;


/**
 * Manager implementation for ProductMedia, responsible for business processing, and communicate between web and persistence layer.
 */
public class PersonalMediaManagerImpl extends GenericManagerImpl<PersonalMedia> implements PersonalMediaManager {

	private PersonalMediaDao personalMediaDao;
	/*
	 * (non-Javadoc)
	 * 
	 * @see com.cartmatic.estore.core.service.impl.GenericManagerImpl#init()
	 */
	@Override
	protected void initManager() {
		dao = personalMediaDao;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.cartmatic.estore.core.service.impl.GenericManagerImpl#onDelete(java.lang.Object)
	 */
	@Override
	protected void onDelete(PersonalMedia entity) {

	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.cartmatic.estore.core.service.impl.GenericManagerImpl#onSave(java.lang.Object)
	 */
	@Override
	protected void onSave(PersonalMedia entity) {

	}

	@Override
	public List<PersonalMedia> findPersonalMediaBySC(Integer shoppingcartId) {
		// TODO Auto-generated method stub
		return this.personalMediaDao.findPersonalMediaBySC(shoppingcartId);
	}

	@Override
	public List<PersonalMedia> findPersonalMediaBySO(Integer salesOrderId) {
		// TODO Auto-generated method stub
		return this.personalMediaDao.findPersonalMediaBySO(salesOrderId);
	}
	
	
	@Override
	public List<String> savePersonalMedias(Integer shoppingcartId, String[] personalMediaIds, String[] personalMediaTypes,
			String[] mediaUrls, String[] productMediaDeleteds) {
		// TODO Auto-generated method stub
		if(personalMediaIds != null){
			for(int i=0; i<personalMediaIds.length; i++){
				PersonalMedia pm = new PersonalMedia();
			
				int id = Integer.valueOf(personalMediaIds[i]);
				
				if(productMediaDeleteds != null && productMediaDeleteds[i] != null && productMediaDeleteds[i].equals("1")){
					if(id>0){
						deleteById(id);
					}
					continue;
				}
				
				if(id > 0){
					pm.setId(id);
				}
				
				pm.setShoppingcartId(shoppingcartId);
				pm.setMediaType(Short.valueOf(personalMediaTypes[i]));
				pm.setMediaUrl(mediaUrls[i]);
				save(pm);
			}
		}
		
		return null;
	}

	@Override
	public Map<String, Object> saveMediaAction(Integer shoppingcartId, Integer salesOrderId) {
		// TODO Auto-generated method stub
		List<PersonalMedia> pms = this.findPersonalMediaBySC(shoppingcartId);
		for(PersonalMedia pm : pms){
			pm.setSalesOrderId(salesOrderId);
			this.save(pm);
		}
		return null;
	}

	public PersonalMediaDao getPersonalMediaDao() {
		return personalMediaDao;
	}

	public void setPersonalMediaDao(PersonalMediaDao personalMediaDao) {
		this.personalMediaDao = personalMediaDao;
	}
}
