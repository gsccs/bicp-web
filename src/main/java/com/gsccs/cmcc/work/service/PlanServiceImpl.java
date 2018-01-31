package com.gsccs.cmcc.work.service;

import java.util.Date;
import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.alibaba.druid.util.StringUtils;
import com.gsccs.cmcc.work.dao.WorkNoticeMapper;
import com.gsccs.cmcc.work.dao.PlanMapper;
import com.gsccs.cmcc.work.model.WorkNotice;
import com.gsccs.cmcc.work.model.WorkNoticeExample;
import com.gsccs.cmcc.work.model.Plan;
import com.gsccs.cmcc.work.model.PlanExample;

@Service
public class PlanServiceImpl implements PlanService {

	@Autowired
	private PlanMapper workPlanMapper;
	@Autowired
	private WorkNoticeMapper workNoticeMapper;

	@Override
	public List<Plan> find(Plan param, String orderstr, int page,
			int pagesize) {
		PlanExample example = new PlanExample();
		PlanExample.Criteria c = example.createCriteria();
		prefix(c, param);
		example.setCurrPage(page);
		example.setPageSize(pagesize);
		return workPlanMapper.selectPageByExample(example);
	}

	@Override
	public int count(Plan param) {
		PlanExample example = new PlanExample();
		PlanExample.Criteria c = example.createCriteria();
		prefix(c, param);
		return workPlanMapper.countByExample(example);
	}

	@Override
	public void add(Plan workPlan) {
		if (null != workPlan) {
			workPlan.setId(UUID.randomUUID().clockSequence()+"");
			workPlan.setAddtime(new Date());
			workPlanMapper.insert(workPlan);
		}
	}

	@Override
	public void update(Plan workPlan) {
		if (null != workPlan) {
			workPlanMapper.updateByPrimaryKey(workPlan);
		}
	}

	@Override
	public void deletePlan(String id) {
		workPlanMapper.deleteByPrimaryKey(id);
	}

	@Override
	public List<WorkNotice> find(WorkNotice param, String orderstr, int page,
			int pagesize) {
		WorkNoticeExample example = new WorkNoticeExample();
		WorkNoticeExample.Criteria c = example.createCriteria();
		prefix(c, param);
		example.setCurrPage(page);
		example.setPageSize(pagesize);
		return workNoticeMapper.selectPageByExample(example);
	}

	@Override
	public int count(WorkNotice param) {
		WorkNoticeExample example = new WorkNoticeExample();
		WorkNoticeExample.Criteria c = example.createCriteria();
		prefix(c, param);
		return workNoticeMapper.countByExample(example);
	}

	@Override
	public void add(WorkNotice workNotice) {
		if (null != workNotice) {
			workNotice.setId(UUID.randomUUID().toString());
			workNotice.setAddtime(new Date());
			workNoticeMapper.insert(workNotice);
		}
	}

	@Override
	public void update(WorkNotice workNotice) {
		if (null != workNotice) {
			workNoticeMapper.updateByPrimaryKey(workNotice);
		}
	}

	@Override
	public void deleteNotice(String id) {
		if (null != id && id.trim().length() > 0) {
			workNoticeMapper.deleteByPrimaryKey(id);
		}
	}

	/**
	 * @param c
	 * @param param
	 */
	private void prefix(PlanExample.Criteria c, Plan param) {
		if (null != param) {
			System.err.println(param.getTitle());
			if (!StringUtils.isEmpty(param.getTitle())) {
				c.andTitleLike("%" + param.getTitle() + "%");
			}
			if (!StringUtils.isEmpty(param.getState())) {
				c.andStateEqualTo(param.getState());
			}
		}
	}

	private void prefix(WorkNoticeExample.Criteria c, WorkNotice param) {
		if (null != param) {
			if (!StringUtils.isEmpty(param.getContent())) {
				c.andContentLike("%" + param.getContent() + "%");
			}
		}
	}

	@Override
	public Plan getPlan(String id) {

		return workPlanMapper.selectByPrimaryKey(id);
	}

	@Override
	public WorkNotice getNotice(String id) {
		return workNoticeMapper.selectByPrimaryKey(id);
	}

}
