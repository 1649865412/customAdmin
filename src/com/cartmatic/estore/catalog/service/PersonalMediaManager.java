package com.cartmatic.estore.catalog.service;

import java.util.List;
import java.util.Map;

import com.cartmatic.estore.common.model.catalog.PersonalMedia;
import com.cartmatic.estore.common.model.catalog.ProductDataModel;
import com.cartmatic.estore.common.model.catalog.ProductMedia;
import com.cartmatic.estore.core.service.GenericManager;

/**
 * Manager interface for ProductMedia, responsible for business processing, and communicate between web and persistence layer.
 *
 */
public interface PersonalMediaManager extends GenericManager<PersonalMedia> {
	
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
	
	
	public List<String> savePersonalMedias(Integer shoppingcartId, String[] personalMediaIds,
			String[]personalMediaTypes,String[] mediaUrls, String productMedia_deleteds[]) ;
	
	/**
	 * 保存个性化图片（）
	 * @return
	 */
	public Map<String, Object> saveMediaAction(Integer shoppingcartId, Integer salesOrderId) ;
	
	
}
