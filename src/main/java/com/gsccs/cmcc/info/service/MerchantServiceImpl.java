package com.gsccs.cmcc.info.service;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import org.apache.commons.lang3.StringUtils;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.subject.Subject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gsccs.cmcc.info.model.Merchant;
import com.gsccs.cmcc.info.model.MerchantExample;
import com.gsccs.cmcc.merchant.dao.MerchantMapper;
import com.gsccs.plat.auth.dao.UserMapper;
import com.gsccs.plat.auth.model.User;
import com.gsccs.plat.auth.model.UserExample;
import com.gsccs.plat.auth.model.UserExample.Criteria;
import com.gsccs.plat.auth.service.AreaService;
import com.gsccs.plat.auth.service.UserService;
import com.gsccs.plat.bass.Constants;

@Service
public class MerchantServiceImpl implements MerchantService {

	@Autowired
	private MerchantMapper merchantMapper;
	@Autowired
	private UserService userService;
	@Autowired
	private AreaService areaService;
	@Autowired
	private UserMapper userMapper;

	@Override
	public void addCorp(Merchant corp) {
		if (null != corp) {
			if (StringUtils.isEmpty(corp.getId())) {
				corp.setId(UUID.randomUUID().toString());
			}
			merchantMapper.insert(corp);
		}
	}

	@Override
	public List<Merchant> find(Merchant corp, String order, int currPage, int pageSize) {
		MerchantExample example = new MerchantExample();
		MerchantExample.Criteria c = example.createCriteria();
		proSearchParam(corp, c);
		
		example.setPageSize(pageSize);
		example.setCurrPage(currPage);
		return merchantMapper.selectPageByExample(example);
	}

	
	private void proSearchParam(Merchant corp, MerchantExample.Criteria criteria) {
		if (corp != null) {
			if (corp.getId() != null) {
				criteria.andIdEqualTo(corp.getId());
			}

			if (StringUtils.isNotEmpty(corp.getTitle())) {
				criteria.andTitleLike("%" + corp.getTitle() + "%");
			}

			if (null != corp.getStatus()) {
				criteria.andStatusEqualTo(corp.getStatus());
			}
		}

	}

	
	@Override
	public int count(Merchant corp) {
		MerchantExample example = new MerchantExample();
		MerchantExample.Criteria c = example.createCriteria();
		proSearchParam(corp, c);
		return merchantMapper.countByExample(example);
	}

	
	@Override
	public int countByAuth(Merchant param) {
		Subject subject = SecurityUtils.getSubject();
		String account = (String) subject.getPrincipal();
		User user = userService.findByAccount(account);

		MerchantExample example = new MerchantExample();
		MerchantExample.Criteria c = example.createCriteria();
		proSearchParam(param, c);
		if (subject.hasRole(Constants.ROLE_YY_QA)) { 				// 业务主管
			return merchantMapper.countByExample(example);
		} else {
			if (subject.hasRole(Constants.ROLE_YY_DA)) { 			// 部门主管
				c.andSql(" amuserid in (select id from plat_sys_user where orgid="+user.getOrgid()+")");
			}  else if (subject.hasRole(Constants.ROLE_YY_AM)) { 	// 客户经理
				c.andAmuseridEqualTo(user.getId());
			} 
			return merchantMapper.countByExample(example);
		}
	}

	@Override
	public Merchant getCorp(String id) {
		return merchantMapper.selectByPrimaryKey(id);
	}

	@Override
	public void updateCorp(Merchant param) {
		if (null != param) {
			merchantMapper.updateByPrimaryKey(param);
		}
	}

	@Override
	public void delCorp(String id) {
		merchantMapper.deleteByPrimaryKey(id);
	}

	@Override
	public List<Merchant> find(Merchant corp) {
		MerchantExample example = new MerchantExample();
		MerchantExample.Criteria c = example.createCriteria();
		proSearchParam(corp, c);
		return merchantMapper.selectByExample(example);
	}

	
	@Override
	public List<Merchant> findMchByAuth(Merchant param, String order, int page,
			int pageSize) {
		List<Merchant> corpList = null;
		Subject subject = SecurityUtils.getSubject();
		String account = (String) subject.getPrincipal();
		User user = userService.findByAccount(account);

		MerchantExample example = new MerchantExample();
		MerchantExample.Criteria c = example.createCriteria();
		
		if (subject.hasRole(Constants.ROLE_YY_QA)) { 				// 业务主管
			return this.find(param, order, page, pageSize);
		} else {
			if (subject.hasRole(Constants.ROLE_YY_DA)) { 			// 部门主管
				c.andSql(" amuserid in (select id from plat_sys_user where orgid="+user.getOrgid()+")");
			}  else if (subject.hasRole(Constants.ROLE_YY_AM)) { 	// 客户经理
				c.andAmuseridEqualTo(user.getId());
			} 
			
			proSearchParam(param, c);
			example.setPageSize(pageSize);
			example.setCurrPage(page);
			
			corpList = merchantMapper.selectPageByExample(example);
		}
		
		return corpList;
	}

	public List<Long> getUsers(User user) {
		UserExample uexample = new UserExample();
		Criteria ucriteria = uexample.createCriteria();
		if (null != user && user.getOrgid() != null
				&& !user.getOrgid().equals("")) {
			ucriteria.andOrganizationIdEqualTo(user.getOrgid());
		}
		List<User> userList = userMapper.selectByExample(uexample);

		List<Long> uList = new ArrayList<>();
		for (User u : userList) {
			uList.add(u.getId());
		}
		return uList;
	}

	public String getUserids(User user) {
		String userids = "";
		List<User> uList = null;
		UserExample example = new UserExample();
		Criteria criteria = example.createCriteria();
		if (null != user && user.getOrgid() != null
				&& !user.getOrgid().equals("")) {
			criteria.andOrganizationIdEqualTo(user.getOrgid());
		}
		uList = userMapper.selectByExample(example);
		if (null != uList) {
			for (User u : uList) {
				userids += u.getId() + ",";
			}
			if (userids.length() > 0) {
				userids = userids.substring(0, userids.length() - 1);
			}
			userids = "(" + userids + ")";
		}
		System.out.println("userids = " + userids);
		return userids;
	}


	
}
