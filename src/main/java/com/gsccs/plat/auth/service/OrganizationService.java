package com.gsccs.plat.auth.service;

import com.alibaba.fastjson.JSONArray;
import com.gsccs.plat.auth.model.Organization;

import java.util.List;

/**
 * <p>
 * User: x.d zhang
 * <p>
 * Date: 14-1-28
 * <p>
 * Version: 1.0
 */
public interface OrganizationService {

	public Organization createOrganization(Organization organization);

	public Organization updateOrganization(Organization organization);

	public void deleteOrganization(Long organizationId);

	Organization findOne(Long organizationId);

	List<Organization> findAll();
	
	public JSONArray findOrgTree();
	
	List<Organization> find(Organization param);

	Object findAllWithExclude(Organization excludeOraganization);

	void move(Organization source, Organization target);

	public String getOrgTreeToJson();

}
