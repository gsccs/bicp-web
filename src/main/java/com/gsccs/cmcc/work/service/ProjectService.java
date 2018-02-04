package com.gsccs.cmcc.work.service;

import java.util.List;

import com.gsccs.cmcc.work.model.Project;

public interface ProjectService {

	public void add(Project param);

	public void update(Project param);

	public Project get(String id);

	public void del(String id);

	public List<Project> find(Project param, String order, int currPage,
			int pageSize);
	
	public int count(Project param);
	
	public List<Project> find(Project param);
	
	public boolean isExist(String ispcode);
}
