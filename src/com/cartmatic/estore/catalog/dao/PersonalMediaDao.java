package com.cartmatic.estore.catalog.dao;

import java.util.List;

import com.cartmatic.estore.common.model.catalog.PersonalMedia;
import com.cartmatic.estore.core.dao.GenericDao;
/**
 * Dao interface for ProductMedia.
 */
public interface PersonalMediaDao extends GenericDao<PersonalMedia> {
	
	/**查找个性化图片
	 * @param shoppingcartId 购物车id
	 * @return
	 */
	public List<PersonalMedia> findPersonalMediaBySC(Integer shoppingcartId);
	
	
	/**查找个性化图片
	 * @param salesOrderId 订单id
	 * @return
	 */
	public List<PersonalMedia> findPersonalMediaBySO(Integer salesOrderId);
	
	
}