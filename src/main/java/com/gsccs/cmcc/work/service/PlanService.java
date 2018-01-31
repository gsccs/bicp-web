package com.gsccs.cmcc.work.service;

import java.util.List;

import com.gsccs.cmcc.work.model.WorkNotice;
import com.gsccs.cmcc.work.model.Plan;

/**
 * 计划管理接口
 * @author x.d zhang
 *
 */
public interface PlanService {

	public List<Plan> find(Plan param, String orderstr, int page,
			int pagesize);
	public int count(Plan param);
	public Plan getPlan(String id);
	public void add(Plan workPlan);
	public void update(Plan workPlan);
	public void deletePlan(String id);
	
	
	public List<WorkNotice> find(WorkNotice param, String orderstr, int page,
			int pagesize);
	public int count(WorkNotice param);
	public WorkNotice getNotice(String id);
	public void add(WorkNotice workNotice);
	public void update(WorkNotice workNotice);
	public void deleteNotice(String id);
	
	

}
