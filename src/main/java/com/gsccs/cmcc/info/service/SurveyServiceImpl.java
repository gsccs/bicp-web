package com.gsccs.cmcc.info.service;

import java.util.ArrayList;
import java.util.List;

import org.apache.commons.lang3.StringUtils;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.subject.Subject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.gsccs.cmcc.info.model.Merchant;
import com.gsccs.cmcc.info.model.PropT;
import com.gsccs.cmcc.info.model.PropvalT;
import com.gsccs.cmcc.product.model.Product;
import com.gsccs.plat.auth.model.AreaT;
import com.gsccs.plat.auth.model.User;
import com.gsccs.plat.auth.service.AreaService;
import com.gsccs.plat.auth.service.DictService;
import com.gsccs.plat.auth.service.UserService;
import com.gsccs.plat.bass.Constants;
import com.gsccs.plat.bass.Datagrid;
import com.gsccs.plat.bass.DatagridColumn;
import com.gsccs.plat.bass.DatagridColumn.Align;
import com.gsccs.plat.bass.TreeGrid;

@Service
public class SurveyServiceImpl implements SurveyService {

	@Autowired
	private UserService userService;
	@Autowired
	private ProductService productService;
	@Autowired
	private PropService propService;
	@Autowired
	private MerchantService corpService;
	@Autowired
	private DictService dictService;
	@Autowired
	private AreaService areaService;

	@Override
	public JSONArray getDataGridHeader() {
		// 表头定义
		JSONArray columns = new JSONArray();
		List<DatagridColumn> row_1_columns = new ArrayList<DatagridColumn>();
		List<DatagridColumn> row_2_columns = new ArrayList<DatagridColumn>();
		// 客户表头
		DatagridColumn corpcol = new DatagridColumn();
		corpcol.setTitle("走访信息");
		corpcol.setField("id");
		corpcol.setColspan(3);
		corpcol.setAlign(Align.CENTER.getType());
		row_1_columns.add(corpcol);

		DatagridColumn areacol = new DatagridColumn();
		areacol.setTitle("地域");
		areacol.setField("areaname");
		areacol.setWidth(50);
		row_2_columns.add(areacol);

		DatagridColumn corptitlecol = new DatagridColumn();
		corptitlecol.setTitle("集团客户");
		corptitlecol.setField("corpname");
		corptitlecol.setWidth(100);
		row_2_columns.add(corptitlecol);

		DatagridColumn amnamecol = new DatagridColumn();
		amnamecol.setTitle("客户经理");
		amnamecol.setField("amname");
		row_2_columns.add(amnamecol);

		// 业务数据表头
		Product product_param = new Product();
		List<Product> productList = productService.find(product_param, "", 1,
				Integer.MAX_VALUE);
		if (null != productList && productList.size() > 0) {
			for (Product productT : productList) {
				PropT propParam = new PropT();
				propParam.setProductid(productT.getId());
				List<PropT> propList = propService.find(propParam, "indexnum",
						1, Integer.MAX_VALUE);
				if (null != propList && propList.size() > 0) {
					// 遍历所有属性
					for (PropT propT : propList) {
						DatagridColumn propdc = new DatagridColumn();
						// 获取属性的名字
						propdc.setField(propT.getPropcode());
						propdc.setTitle(propT.getTitle());
						propdc.setWidth(80);
						row_2_columns.add(propdc);
					}
					DatagridColumn productdc = new DatagridColumn();
					productdc.setTitle(productT.getTitle());
					productdc.setColspan(propList.size());
					row_1_columns.add(productdc);
				}
			}
		}

		columns.add(row_1_columns);
		columns.add(row_2_columns);
		return columns;
	}
	
	
	@Override
	public JSONArray getTreeGridHeader() {
		// 表头定义
		JSONArray columns = new JSONArray();
		List<DatagridColumn> row_1_columns = new ArrayList<DatagridColumn>();
		List<DatagridColumn> row_2_columns = new ArrayList<DatagridColumn>();
		// 客户表头
		DatagridColumn corpcol = new DatagridColumn();
		corpcol.setTitle("走访信息");
		corpcol.setField("id");
		corpcol.setColspan(3);
		corpcol.setAlign(Align.CENTER.getType());
		row_1_columns.add(corpcol);

		DatagridColumn areacol = new DatagridColumn();
		areacol.setTitle("地域");
		areacol.setField("text");
		areacol.setWidth(50);
		row_2_columns.add(areacol);

		DatagridColumn corptitlecol = new DatagridColumn();
		corptitlecol.setTitle("集团客户");
		corptitlecol.setField("ispcode");
		corptitlecol.setWidth(100);
		row_2_columns.add(corptitlecol);

		DatagridColumn amnamecol = new DatagridColumn();
		amnamecol.setTitle("客户经理");
		amnamecol.setField("amname");
		row_2_columns.add(amnamecol);

		// 业务数据表头
		Product product_param = new Product();
		List<Product> productList = productService.find(product_param, "", 1,
				Integer.MAX_VALUE);
		if (null != productList && productList.size() > 0) {
			for (Product productT : productList) {
				PropT propParam = new PropT();
				propParam.setProductid(productT.getId());
				List<PropT> propList = propService.find(propParam, "indexnum",
						1, Integer.MAX_VALUE);
				if (null != propList && propList.size() > 0) {
					// 遍历所有属性
					for (PropT propT : propList) {
						DatagridColumn propdc = new DatagridColumn();
						// 获取属性的名字
						propdc.setField(propT.getPropcode());
						propdc.setTitle(propT.getTitle());
						propdc.setWidth(80);
						row_2_columns.add(propdc);
					}
					DatagridColumn productdc = new DatagridColumn();
					productdc.setTitle(productT.getTitle());
					productdc.setColspan(propList.size());
					row_1_columns.add(productdc);
				}
			}
		}

		columns.add(row_1_columns);
		columns.add(row_2_columns);
		return columns;
	}

	@Override
	public TreeGrid findCorpTree(Merchant corpParam,Integer page, Integer rows) {
		TreeGrid datagrid = new TreeGrid();
		try {
			// 设置表头
			//datagrid.setColumns(this.getGridHeader());

			// 表格数据
			Subject subject = SecurityUtils.getSubject();
			String account = (String) subject.getPrincipal();
			User user = userService.findByAccount(account);
			AreaT areaTparam = new AreaT();
			JSONArray areatree = null;
			if (subject.hasRole(Constants.ROLE_ADMIN)) {
				//System.out.println(Constants.ROLE_ADMIN);
				areatree = areaService.findAreaTree();
			} else if (subject.hasRole(Constants.ROLE_YY_QA)) {
				//System.out.println(Constants.ROLE_YY_QA);
				//System.out.println(user.getAreaid());
				// AreaT userAreaT = areaService.findById(user.getAreaid());
				// areaTparam.setParentid(userAreaT.getParentid());
				areatree = areaService.findAreaTree(user.getAreaid());
			} else if (subject.hasRole(Constants.ROLE_YY_AM)) {
				//System.out.println(Constants.ROLE_YY_AM);
				areaTparam.setParentid(user.getAreaid());
				corpParam.setAmUserId(user.getId());
				areatree = areaService.findAreaTree();
			}
			
			findAreaCorps(areatree,corpParam);
			//System.out.println(array.toJSONString());
			/*if (null != areatree && areatree.size() > 0) {
				for (int i = 0; i < areatree.size(); i++) {
					JSONObject areajson = areatree.getJSONObject(i);
					JSONArray childrens = areajson.getJSONArray("children");
					if (null != childrens && childrens.size() > 0) {
						for (int j = 0; j < childrens.size(); j++) {
							JSONObject subareajson = childrens.getJSONObject(j);
							// 客户列表
							corpParam.setAcode(subareajson.getInteger("id"));
							subareajson.put("children", findCorpList(corpParam));
						}
					}else{
						// 客户列表
						corpParam.setAcode(areajson.getInteger("id"));
						areajson.put("children", findCorpList(corpParam));
					}
				}
			}*/
			datagrid.setRows(areatree);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return datagrid;
	}

	
	private JSONArray findAreaCorps(JSONArray areatree,Merchant corpParam){
		if (null != areatree && areatree.size() > 0) {
			for (int i = 0; i < areatree.size(); i++) {
				JSONObject areajson = areatree.getJSONObject(i);
				// 客户列表
				corpParam.setAcode(areajson.getInteger("id"));
				//System.out.println("地域树:"+areajson.getInteger("id"));
				
				JSONArray childrens = areajson.getJSONArray("children");
				if (null != childrens && childrens.size() > 0) {
					findAreaCorps(childrens,corpParam);
				}else{
					//System.out.println("修改前："+areatree.toJSONString());
					//areatree.remove(areajson);
					areajson.put("children", findCorpList(corpParam,1,100));
					//areatree.set(i, areajson);
					//System.out.println("修改后："+areatree.toJSONString());
				}
			}
		}
		return areatree;
	}
	
	private JSONArray findCorpList(Merchant corpParam,Integer page, Integer rows) {
		JSONArray rowarray = new JSONArray();
		List<Merchant> corplist = corpService.find(corpParam, "", page,
				rows);
		//System.out.println("企业列表："+corplist.size());
		if (null == corplist ||corplist.size() <= 0) {
			return rowarray;
		}
		for (Merchant corpT : corplist) {
			// 客户基本信息
			JSONObject corpjson = new JSONObject();
			corpjson.put("id", corpT.getId());
			corpjson.put("ispcode", corpT.getId());
			//corpjson.put("amname", corpT.getAmname());
			//corpjson.put("text", corpT.getTitle());
			//corpjson.put("areaname", corpT.getAcodestr());
			//corpjson.put("corpname", corpT.getTitle());
			// 客户信息化产品信息
			List<PropvalT> propvalList = propService.findCorpProp(corpT
					.getId());
			if (null != propvalList && propvalList.size() > 0) {
				for (PropvalT propval : propvalList) {
					if (StringUtils.isNotEmpty(propval.getDictval())) {
						corpjson.put(propval.getPropcode(),
								propval.getDictval());
					} else {
						corpjson.put(propval.getPropcode(),
								propval.getPropval());
					}

				}
			}
			rowarray.add(corpjson);
		}
		return rowarray;
	}

	@Override
	public Datagrid findCorpDgList(Merchant param, Integer page, Integer rows) {
		Datagrid datagrid = new Datagrid();
		JSONArray corpList = findCorpList(param,page,rows);
		Integer total = corpService.count(param);
		datagrid.setRows(corpList);
		datagrid.setTotal(Long.valueOf(total));
		return datagrid;
	}

}
