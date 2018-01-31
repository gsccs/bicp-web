package com.gsccs.cmcc.info.service;

import java.util.List;

import com.gsccs.cmcc.info.model.Merchant;


public interface MerchantService {

	public void addCorp(Merchant param);

	public void updateCorp(Merchant param);

	public Merchant getCorp(String id);

	public void delCorp(String id);
	
	public List<Merchant> find(Merchant param, String order, int currPage,
			int pageSize);
	
	/**
	 * 根据用户查询可查看商户
	 * @param corp
	 * @param order
	 * @param page
	 * @param pageSize
	 * @return
	 */
	public List<Merchant> findMchByAuth(Merchant param,String order, int page,
			int pageSize);
			
	public List<Merchant> find(Merchant param);
	
	public int countByAuth(Merchant param);
	
	public int count(Merchant param);
	
	
}
