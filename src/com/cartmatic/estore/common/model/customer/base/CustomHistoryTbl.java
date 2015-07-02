package com.cartmatic.estore.common.model.customer.base;

import java.io.Serializable;
import java.util.Date;

import com.cartmatic.estore.core.model.BaseObject;

/**
 * Address Base Java Bean, base class for the model, mapped directly to database table
 * 
 * Avoid changing this file if not necessary, will be overwritten. 
 *
 * TODO: add class/table comments
 */
public class CustomHistoryTbl extends BaseObject implements Serializable {

    protected Integer id;

    protected com.cartmatic.estore.common.model.system.AppUser appUser;
    
    protected com.cartmatic.estore.common.model.catalog.Product product;

	@Override
	public boolean equals(Object o) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return null;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public com.cartmatic.estore.common.model.system.AppUser getAppUser() {
		return appUser;
	}

	public void setAppUser(com.cartmatic.estore.common.model.system.AppUser appUser) {
		this.appUser = appUser;
	}

	public com.cartmatic.estore.common.model.catalog.Product getProduct() {
		return product;
	}

	public void setProduct(com.cartmatic.estore.common.model.catalog.Product product) {
		this.product = product;
	}
	
	public void setUpdateTime(java.util.Date updateTime) {
		this.updateTime = updateTime;
	}
	
	public Date getUpdateTime(){
		return this.updateTime;
	}
    
}