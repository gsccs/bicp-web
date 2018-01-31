/**
 * 
 */
package com.gsccs.plat.auth.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.gsccs.plat.auth.dao.AreaMapper;
import com.gsccs.plat.auth.model.AreaExample;
import com.gsccs.plat.auth.model.AreaT;

/**
 * @author x.d zhang
 * 
 */
@Service
public class AreaServiceImpl implements AreaService {

	@Autowired
	private AreaMapper areaMapper;

	@Override
	public void add(AreaT area) {
		if (null != area) {
			areaMapper.insert(area);
		}
	}

	@Override
	public void update(AreaT area) {
		if (null != area) {
			areaMapper.updateByPrimaryKey(area);
		}
	}

	@Override
	public List<AreaT> find(AreaT area) {
		AreaExample example = new AreaExample();
		AreaExample.Criteria c = example.createCriteria();
		proSearchParam(area, c);
		return areaMapper.selectByExample(example);
	}

	@Override
	public AreaT findById(Integer id) {
		return areaMapper.selectByPrimaryKey(id);
	}

	/**
	 * 查询条件
	 * 
	 * @param orders
	 * @param sid
	 * @param criteria
	 */
	private void proSearchParam(AreaT area, AreaExample.Criteria criteria) {
		if (area != null) {
			if (null != area.getParentid()) {
				criteria.andParentidEqualTo(area.getParentid());
			}

			if (null != area.getLevel()) {
				criteria.andLevelEqualTo(area.getLevel());
			}

			if (null != area.getCode()) {
				criteria.andCodeEqualTo(area.getCode());
			}

		}
	}

	@Override
	public JSONArray findAreaTree() {
		List<AreaT> roots = findAll();
		if (null != roots) {
			JSONArray rootArray = (JSONArray) JSON.toJSON(roots);
			return treeList(rootArray, 0);
		}
		return null;
	}

	@Override
	public JSONArray findAreaTree(Integer pid) {
		JSONArray rootArray = new JSONArray();
		AreaT areaT = this.findById(pid);
		if (null != areaT && pid!=0){
			JSONObject json = (JSONObject) JSON.toJSON(areaT);
			json.put("id", json.get("code"));
			json.put("text", areaT.getName());
			List<AreaT> roots = findAll();
			if (null != roots) {
				JSONArray subitems = treeList((JSONArray) JSON.toJSON(roots), pid);
				json.put("children", subitems);
			}
			rootArray.add(json);
		}else{
			rootArray = this.findAreaTree();
		}
		return rootArray;
	}

	public JSONArray treeList(JSONArray nodeList, Integer parentId) {
		JSONArray nodearray = new JSONArray();
		for (Object object : nodeList) {
			JSONObject json = (JSONObject) JSON.toJSON(object);
			int id = json.getInteger("id");
			int pid = json.getInteger("parentid");
			json.put("id", json.get("code"));
			json.put("text", json.get("name"));
			//System.out.println("parentId:"+parentId);
			//System.out.println("pid:"+pid);
			if (parentId == pid) {
				JSONArray subitems = treeList(nodeList, id);
				json.put("children", subitems);
				nodearray.add(json);
			}
		}
		return nodearray;

	}

	public List<AreaT> findAll() {
		AreaExample example = new AreaExample();
		AreaExample.Criteria c = example.createCriteria();
		return areaMapper.selectByExample(example);
	}

	@Override
	public List<AreaT> findAllSubArea(Integer pid) {
		List<AreaT> areaList = new ArrayList<>();
		AreaT pareaT = areaMapper.selectByPrimaryKey(pid);
		if (null != pareaT) {
			areaList.add(pareaT);
			subAreaList(areaList, pareaT.getId());
		}
		return areaList;
	}

	public List<AreaT> subAreaList(List<AreaT> nodeList, Integer parentId) {
		AreaT param = new AreaT();
		param.setParentid(parentId);
		List<AreaT> subAreaList = this.find(param);
		if (null != subAreaList && subAreaList.size() > 0) {
			nodeList.addAll(subAreaList);
			for (AreaT areaT : subAreaList) {
				subAreaList(nodeList, areaT.getId());
			}
		}
		return nodeList;
	}

	@Override
	public String findAllSubAreaIds(Integer pid) {
		StringBuilder sb = new StringBuilder();
		List<AreaT> arealist = this.findAllSubArea(pid);
		if (null != arealist && arealist.size() > 0) {
			for (AreaT areaT : arealist) {
				sb.append(areaT.getId());
				sb.append(",");
			}
		}
		if (sb.length() > 1) {
			sb.deleteCharAt(sb.length());
		}
		return sb.toString();
	}
}
