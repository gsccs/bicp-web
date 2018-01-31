package com.gsccs.cmcc.work.service;

import java.util.List;
import java.util.UUID;

import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gsccs.cmcc.work.dao.ProjectMapper;
import com.gsccs.cmcc.work.dao.TaskMapper;
import com.gsccs.cmcc.work.model.Project;
import com.gsccs.cmcc.work.model.ProjectExample;
import com.gsccs.cmcc.work.model.TaskExample;

@Service
public class ProjectServiceImpl implements ProjectService {

	@Autowired
	private ProjectMapper projectMapper;
	@Autowired
	private TaskMapper taskMapper;

	@Override
	public void add(Project param) {
		if (null != param) {
			if (StringUtils.isEmpty(param.getId())){
				param.setId(UUID.randomUUID().toString());
			}
			projectMapper.insert(param);
		}
	}

	@Override
	public List<Project> find(Project param, String order, int currPage, int pageSize) {
		ProjectExample example = new ProjectExample();
		ProjectExample.Criteria c = example.createCriteria();
		proSearchParam(param, c);
		example.setPageSize(pageSize);
		example.setCurrPage(currPage);
		return projectMapper.selectPageByExample(example);
	}


	private void proSearchParam(Project param, ProjectExample.Criteria criteria) {
		if (param != null) {
			if (param.getId() != null) {
				criteria.andIdEqualTo(param.getId());
			}

			if (StringUtils.isNotEmpty(param.getTitle())) {
				criteria.andTitleLike("%" + param.getTitle() + "%");
			}
		}
	}

	@Override
	public int count(Project contact) {
		ProjectExample example = new ProjectExample();
		ProjectExample.Criteria c = example.createCriteria();
		proSearchParam(contact, c);
		return projectMapper.countByExample(example);
	}

	@Override
	public Project get(String id) {
		return projectMapper.selectByPrimaryKey(id);
	}

	@Override
	public void update(Project contact) {
		if (null != contact) {
			projectMapper.updateByPrimaryKey(contact);
		}
	}

	@Override
	public void del(String id) {
		TaskExample example = new TaskExample();
		TaskExample.Criteria c = example.createCriteria();
		c.andPidEqualTo(id);
		//删除通讯方式
		taskMapper.deleteByExample(example);
		//删除通讯录
		projectMapper.deleteByPrimaryKey(id);
	}

	@Override
	public boolean isExist(String id) {
		Project ct = projectMapper.selectByPrimaryKey(id);
		if(null != ct){
			return true;
		}else{
			return false;
		}
		
	}

	@Override
	public List<Project> find(Project contact) {
		ProjectExample example = new ProjectExample();
		ProjectExample.Criteria c = example.createCriteria();
		proSearchParam(contact, c);
		return projectMapper.selectByExample(example);
	}
}
