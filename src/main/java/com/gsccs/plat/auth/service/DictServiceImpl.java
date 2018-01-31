package com.gsccs.plat.auth.service;

import java.util.Arrays;
import java.util.List;
import java.util.UUID;

import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gsccs.plat.auth.dao.DictGroupTMapper;
import com.gsccs.plat.auth.dao.DictItemTMapper;
import com.gsccs.plat.auth.model.DictGroupT;
import com.gsccs.plat.auth.model.DictGroupTExample;
import com.gsccs.plat.auth.model.DictItemT;
import com.gsccs.plat.auth.model.DictItemTExample;

@Service
public class DictServiceImpl implements DictService {

	@Autowired
	private DictGroupTMapper dictGroupTMapper;
	@Autowired
	private DictItemTMapper dictItemTMapper;

	@Override
	public void addDictGroup(DictGroupT groupT) {
		if (null != groupT) {
			String code = groupT.getCode();
			DictGroupT t = getGroupByCode(code);
			if (null == t) { 
				dictGroupTMapper.insert(groupT);
			} 
		}
	}

	@Override
	public void updateDictGroupT(DictGroupT groupT) {
		if (null != groupT) {
			dictGroupTMapper.updateByPrimaryKey(groupT);
		}
	}

	@Override
	public void deleteDictGroupT(Integer groupid) {
		if (null==groupid){
			return;
		}
		DictItemTExample example = new DictItemTExample();
		DictItemTExample.Criteria c= example.createCriteria();
		c.andGroupidEqualTo(groupid);
		dictItemTMapper.deleteByExample(example);
		dictGroupTMapper.deleteByPrimaryKey(groupid);

	}

	@Override
	public DictGroupT getGroupById(Integer id) {
		return dictGroupTMapper.selectByPrimaryKey(id);
	}
	

	@Override
	public DictGroupT getGroupByCode(String code) {
		DictGroupTExample example = new DictGroupTExample();
		DictGroupTExample.Criteria c = example.createCriteria();
		c.andCodeEqualTo(code);
		List<DictGroupT> list = dictGroupTMapper.selectByExample(example);
		if (null != list && list.size() > 0) {
			return list.get(0);
		}
		return null;
	}

	@Override
	public List<DictGroupT> findGroupList(DictGroupT param, int page,
			int pagesize) {
		DictGroupTExample example = new DictGroupTExample();
		DictGroupTExample.Criteria c = example.createCriteria();
		proSearchParam(param, c);
		example.setCurrPage(page);
		example.setPageSize(pagesize);
		return dictGroupTMapper.selectPageByExample(example);
	}

	@Override
	public void addDictItem(DictItemT dictItem) {
		if (null != dictItem) {
			dictItemTMapper.insert(dictItem);
		}
	}

	@Override
	public void updateDictItemT(DictItemT dictItem) {
		dictItemTMapper.updateByPrimaryKey(dictItem);
	}

	@Override
	public void deleteDictItemT(Integer id) {
		dictItemTMapper.deleteByPrimaryKey(id);
	}

	@Override
	public DictItemT getDictById(Integer id) {
		return dictItemTMapper.selectByPrimaryKey(id);
	}

	@Override
	public List<DictItemT> findItemList(DictItemT param, int page, int pagesize) {
		DictItemTExample example = new DictItemTExample();
		DictItemTExample.Criteria c = example.createCriteria();
		proSearchParam(param, c);
		return dictItemTMapper.selectByExample(example);
	}

	public void proSearchParam(DictGroupT dictGroupT,
			DictGroupTExample.Criteria criteria) {
		if (null != dictGroupT) {
			if (StringUtils.isNotEmpty(dictGroupT.getCode())) {
				criteria.andCodeEqualTo(dictGroupT.getCode());
			}

			if (StringUtils.isNotEmpty(dictGroupT.getStatus())) {
				criteria.andStatusEqualTo(dictGroupT.getStatus());
			}
		}
	}

	public void proSearchParam(DictItemT dictItemT,
			DictItemTExample.Criteria criteria) {
		if (null != dictItemT) {
			if (StringUtils.isNotEmpty(dictItemT.getCode())) {
				criteria.andCodeEqualTo(dictItemT.getCode());
			}
			if (null != dictItemT.getGroupid()) {
				criteria.andGroupidEqualTo(dictItemT.getGroupid());
			}
		}
	}

	@Override
	public Integer countDictGroup(DictGroupT param) {
		DictGroupTExample example = new DictGroupTExample();
		DictGroupTExample.Criteria c = example.createCriteria();
		proSearchParam(param, c);
		return dictGroupTMapper.countByExample(example);
	}

	@Override
	public Integer countDictItem(DictItemT param) {
		DictItemTExample example = new DictItemTExample();
		DictItemTExample.Criteria c = example.createCriteria();
		proSearchParam(param, c);
		return dictItemTMapper.countByExample(example);
	}

	@Override
	public List<DictItemT> getDictItems(String code) {
		if (StringUtils.isEmpty(code)){
			return null;
		}
		DictGroupTExample example = new DictGroupTExample();
		DictGroupTExample.Criteria c = example.createCriteria();
		c.andCodeEqualTo(code);
		List<DictGroupT> list = dictGroupTMapper.selectByExample(example);
		if (null != list && list.size() > 0) {
			DictItemTExample example2 = new DictItemTExample();
			DictItemTExample.Criteria c2 = example2.createCriteria();
			c2.andGroupidEqualTo(list.get(0).getId());
			return dictItemTMapper.selectByExample(example2);
		}
		return null;
	}
	
	@Override
	public List<DictGroupT> findGroupList(DictGroupT param) {
		DictGroupTExample example = new DictGroupTExample();
		DictGroupTExample.Criteria c = example.createCriteria();
		proSearchParam(param, c);
		return dictGroupTMapper.selectByExample(example);
	}
	
	
	@Override
	public List<DictItemT> findItemList(DictItemT param) {
		DictItemTExample example = new DictItemTExample();
		DictItemTExample.Criteria c = example.createCriteria();
		proSearchParam(param, c);
		return dictItemTMapper.selectByExample(example);
	}
	

	@Override
	public List<DictItemT> findDictlist(String ids) {
		if (StringUtils.isNotEmpty(ids)) {
			String[] idArray = ids.split(",");
			if (null != idArray && idArray.length > 0) {
				List<String> idlist = Arrays.asList(idArray);
				for (String id : idlist) {
					if (StringUtils.isEmpty(id)) {
						idlist.remove(id);
					}
				}
				if (null != idlist && idlist.size() > 0) {
					DictItemTExample example = new DictItemTExample();
					DictItemTExample.Criteria c = example.createCriteria();
					c.andIdIn(idlist);
					return dictItemTMapper.selectByExample(example);
				}
			}
		}
		return null;
	}

	
}
