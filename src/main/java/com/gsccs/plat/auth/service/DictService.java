package com.gsccs.plat.auth.service;

import java.util.List;

import com.gsccs.plat.auth.model.DictGroupT;
import com.gsccs.plat.auth.model.DictItemT;

/**
 * <p>
 * User: x.d zhang
 * <p>
 * Date: 14-1-28
 * <p>
 * Version: 1.0
 */
public interface DictService {

	public void addDictGroup(DictGroupT dictGroupT);

	public void updateDictGroupT(DictGroupT dictGroupT);

	public void deleteDictGroupT(Integer id);

	public DictGroupT getGroupById(Integer id);

	public DictGroupT getGroupByCode(String code);
	
	public List<DictItemT> getDictItems(String groupcode);
	
	public List<DictGroupT> findGroupList(DictGroupT param, int page, int pagesize);
	
	public List<DictGroupT> findGroupList(DictGroupT param);
	
	public Integer countDictGroup(DictGroupT param);
	
	public void addDictItem(DictItemT dictItemT);

	public void updateDictItemT(DictItemT dictItemT);

	public void deleteDictItemT(Integer id);

	public DictItemT getDictById(Integer id);
	
	public List<DictItemT> findDictlist(String ids);

	public List<DictItemT> findItemList(DictItemT param, int page, int pagesize);
	
	public List<DictItemT> findItemList(DictItemT param);
	
	public Integer countDictItem(DictItemT param);
}
