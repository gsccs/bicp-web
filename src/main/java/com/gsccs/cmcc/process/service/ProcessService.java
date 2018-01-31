package com.gsccs.cmcc.process.service;

import java.util.List;

import com.gsccs.cmcc.process.model.Define;
import com.gsccs.cmcc.process.model.Node;

/**
 * 计划管理接口
 * @author x.d zhang
 *
 */
public interface ProcessService {

	public List<Define> find(Define param, String orderstr, int page,
			int pagesize);
	public int count(Define param);
	public Define getProcessDef(String id);
	public void addProcessDef(Define param);
	public void updateProcessDef(Define param);
	public void deleteProcessDef(String id);
	
	
	public List<Node> find(Node param, String orderstr, int page,
			int pagesize);
	public int count(Node param);
	public Node getProcessNode(String id);
	public void addProcessNode(Node param);
	public void updateProcessNode(Node param);
	public void deleteProcessNode(String id);
	
	

}
