package com.gsccs.cmcc.work.service;

import java.util.List;
import java.util.UUID;

import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gsccs.cmcc.work.dao.TaskMapper;
import com.gsccs.cmcc.work.model.Task;
import com.gsccs.cmcc.work.model.TaskExample;

@Service
public class TaskServiceImpl implements TaskService{
	
	@Autowired
	private TaskMapper taskMapper;

	@Override
	public void add(Task param) {
		if (null != param) {
			if (StringUtils.isEmpty(param.getId())){
				param.setId(UUID.randomUUID().toString());
			}
			taskMapper.insert(param);
		}
	}

	@Override
	public void update(Task param) {
		taskMapper.updateByPrimaryKey(param);
		
	}

	@Override
	public Task get(String id) {
		return taskMapper.selectByPrimaryKey(id);
	}

	@Override
	public void del(String id) {
		taskMapper.deleteByPrimaryKey(id);
	}

	@Override
	public List<Task> find(Task param, String order,
			int currPage, int pageSize) {
		TaskExample example = new TaskExample();
		TaskExample.Criteria c = example.createCriteria();
		proSearchParam(param, c);
		example.setPageSize(pageSize);
		example.setCurrPage(currPage);
		return taskMapper.selectPageByExample(example);
	}

	@Override
	public List<Task> find(Task param) {
		TaskExample example = new TaskExample();
		TaskExample.Criteria c = example.createCriteria();
		proSearchParam(param, c);
		return taskMapper.selectByExample(example);
	}

	@Override
	public int count(Task param) {
		TaskExample example = new TaskExample();
		TaskExample.Criteria c = example.createCriteria();
		proSearchParam(param, c);
		return taskMapper.countByExample(example);
	}

	

	private void proSearchParam(Task param, TaskExample.Criteria criteria) {
		if (param != null) {
			if (param.getId() != null ) {
				criteria.andIdEqualTo(param.getId());
			}
			if (param.getPid() !=null) {
				criteria.andPidEqualTo( param.getPid() );
			}
			if (param.getStatus() !=null) {
				criteria.andStatusEqualTo( param.getStatus() );
			}
		}
	}
}
