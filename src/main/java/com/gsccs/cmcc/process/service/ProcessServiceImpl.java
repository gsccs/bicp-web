package com.gsccs.cmcc.process.service;

import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.alibaba.druid.util.StringUtils;
import com.gsccs.cmcc.process.dao.DefineMapper;
import com.gsccs.cmcc.process.dao.NodeMapper;
import com.gsccs.cmcc.process.model.Define;
import com.gsccs.cmcc.process.model.DefineExample;
import com.gsccs.cmcc.process.model.Node;
import com.gsccs.cmcc.process.model.NodeExample;

@Service
public class ProcessServiceImpl implements ProcessService {

	@Autowired
	private DefineMapper processDefMapper;
	@Autowired
	private NodeMapper processNodeMapper;

	@Override
	public List<Define> find(Define param, String orderstr, int page,
			int pagesize) {
		DefineExample example = new DefineExample();
		DefineExample.Criteria c = example.createCriteria();
		prefix(c, param);
		example.setCurrPage(page);
		example.setPageSize(pagesize);
		return processDefMapper.selectPageByExample(example);
	}

	@Override
	public int count(Define param) {
		DefineExample example = new DefineExample();
		DefineExample.Criteria c = example.createCriteria();
		prefix(c, param);
		return processDefMapper.countByExample(example);
	}

	@Override
	public void addProcessDef(Define workPlan) {
		if (null != workPlan) {
			workPlan.setId(UUID.randomUUID().clockSequence()+"");
			//workPlan.setAddtime(new Date());
			processDefMapper.insert(workPlan);
		}
	}

	@Override
	public void updateProcessDef(Define param) {
		if (null != param) {
			processDefMapper.updateByPrimaryKey(param);
		}
	}

	@Override
	public void deleteProcessDef(String id) {
		processDefMapper.deleteByPrimaryKey(id);
	}

	@Override
	public List<Node> find(Node param, String orderstr, int page,
			int pagesize) {
		NodeExample example = new NodeExample();
		NodeExample.Criteria c = example.createCriteria();
		prefix(c, param);
		example.setCurrPage(page);
		example.setPageSize(pagesize);
		return processNodeMapper.selectPageByExample(example);
	}

	@Override
	public int count(Node param) {
		NodeExample example = new NodeExample();
		NodeExample.Criteria c = example.createCriteria();
		prefix(c, param);
		return processNodeMapper.countByExample(example);
	}

	@Override
	public void addProcessNode(Node param) {
		if (null != param) {
			param.setId(UUID.randomUUID().toString());
			//param.setAddtime(new Date());
			processNodeMapper.insert(param);
		}
	}

	@Override
	public void updateProcessNode(Node workNotice) {
		if (null != workNotice) {
			processNodeMapper.updateByPrimaryKey(workNotice);
		}
	}

	@Override
	public void deleteProcessNode(String id) {
		if (null != id && id.trim().length() > 0) {
			processNodeMapper.deleteByPrimaryKey(id);
		}
	}

	/**
	 * @param c
	 * @param param
	 */
	private void prefix(DefineExample.Criteria c, Define param) {
		if (null != param) {
			if (!StringUtils.isEmpty(param.getTitle())) {
				c.andTitleLike("%" + param.getTitle() + "%");
			}
		}
	}

	private void prefix(NodeExample.Criteria c, Node param) {
		if (null != param) {
			if (!StringUtils.isEmpty(param.getDefid())) {
				c.andDefidEqualTo(param.getDefid());
			}
		}
	}

	@Override
	public Define getProcessDef(String id) {
		return processDefMapper.selectByPrimaryKey(id);
	}

	@Override
	public Node getProcessNode(String id) {
		return processNodeMapper.selectByPrimaryKey(id);
	}

}
