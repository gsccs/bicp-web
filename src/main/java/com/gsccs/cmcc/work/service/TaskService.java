package com.gsccs.cmcc.work.service;

import java.util.List;

import com.gsccs.cmcc.work.model.Task;

public interface TaskService {
	
	public void add(Task param);

	public void update(Task param);

	public Task get(String id);

	public void del(String id);

	public List<Task> find(Task param, String order, int currPage,
			int pageSize);

	public List<Task> find(Task param);
	
	public int count(Task param);

}
