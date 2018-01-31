package com.gsccs.cmcc.info.service;

import java.util.List;
import java.util.UUID;

import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gsccs.cmcc.info.model.Terminal;
import com.gsccs.cmcc.info.model.TerminalExample;
import com.gsccs.cmcc.info.model.TerminalHis;
import com.gsccs.cmcc.info.model.TerminalHisExample;
import com.gsccs.cmcc.merchant.dao.TerminalMapper;
import com.gsccs.cmcc.merchant.dao.TerminalHisMapper;


@Service
public class TerminalServiceImpl implements TerminalService {

	@Autowired
	private TerminalMapper terminalMapper;
	@Autowired
	private TerminalHisMapper terminalHisMapper;

	
	@Override
	public void save(Terminal param) {
		if (null != param) {
			if (StringUtils.isEmpty(param.getId())){
				param.setId(UUID.randomUUID().toString());
				terminalMapper.insert(param);
			}else{
				Terminal terminalDb = terminalMapper.selectByPrimaryKey(param.getId());
				terminalMapper.updateByPrimaryKey(param);
				TerminalHis terminalHis = new TerminalHis();
				if (!terminalDb.getMchno().equals(param.getMchno())){
					terminalHis.setEdittype("1001");
				}
				
				if (!terminalDb.getTerno().equals(param.getTerno())){
					terminalHis.setEdittype("1002");
				}
				
				if (!terminalDb.getPgmv().equals(param.getPgmv())){
					terminalHis.setEdittype("1003");
				}
				
				if (!terminalDb.getUserid().equals(param.getUserid())){
					terminalHis.setEdittype("2001");
				}
				
				if (StringUtils.isNotEmpty(terminalHis.getEdittype())){
					terminalHis.setId(UUID.randomUUID().toString());
					terminalHis.setParid(param.getId());
					terminalHis.setMchno(param.getMchno());
					terminalHis.setTerno(param.getTerno());
					terminalHis.setPgmv(param.getPgmv());
					terminalHisMapper.insert(terminalHis);
				}else{
					terminalHis = null;
				}
				
			}
		}
	}

	@Override
	public List<Terminal> find(Terminal param, String order,
			int currPage, int pageSize) {
		TerminalExample example = new TerminalExample();
		TerminalExample.Criteria c = example.createCriteria();
		proSearchParam(param, c);
		example.setPageSize(pageSize);
		example.setCurrPage(currPage);
		return terminalMapper.selectPageByExample(example);
	}

	@Override
	public int count(Terminal ictproject) {
		TerminalExample example = new TerminalExample();
		TerminalExample.Criteria c = example.createCriteria();
		proSearchParam(ictproject, c);
		return terminalMapper.countByExample(example);
	}

	@Override
	public Terminal get(String id) {
		return terminalMapper.selectByPrimaryKey(id);
	}

	@Override
	public void update(Terminal param) {
		if (null != param) {
			terminalMapper.updateByPrimaryKey(param);
		}
	}

	@Override
	public void del(String id) {
		TerminalHisExample example = new TerminalHisExample();
		TerminalHisExample.Criteria c = example.createCriteria();
		c.andParidEqualTo(id);
		// 删除进度
		terminalHisMapper.deleteByExample(example);
		// 删除项目
		terminalMapper.deleteByPrimaryKey(id);
	}

	@Override
	public List<Terminal> find(Terminal param) {
		TerminalExample example = new TerminalExample();
		TerminalExample.Criteria c = example.createCriteria();
		proSearchParam(param, c);
		return terminalMapper.selectByExample(example);
	}
	
	
	@Override
	public TerminalHis getTerHis(String id) {
		return terminalHisMapper.selectByPrimaryKey(id);
	}

	@Override
	public List<TerminalHis> find(TerminalHis param, String order,
			int currPage, int pageSize) {
		TerminalHisExample example = new TerminalHisExample();
		TerminalHisExample.Criteria c = example.createCriteria();
		proSearchParam(param, c);
		if (StringUtils.isNotEmpty(order)){
			example.setOrderByClause(order);
		}else{
			example.setOrderByClause("edittime desc");
		}
		example.setPageSize(pageSize);
		example.setCurrPage(currPage);
		return terminalHisMapper.selectPageByExample(example);
	}

	@Override
	public int count(TerminalHis param) {
		TerminalHisExample example = new TerminalHisExample();
		TerminalHisExample.Criteria c = example.createCriteria();
		proSearchParam(param, c);
		return terminalHisMapper.countByExample(example);
	}


	@Override
	public void delHis(String id) {
		terminalHisMapper.deleteByPrimaryKey(id);
	}
	
	
	private void proSearchParam(Terminal param,
			TerminalExample.Criteria criteria) {
		if (param != null) {
			if (param.getId() != null) {
				criteria.andIdEqualTo(param.getId());
			}
			
			if (StringUtils.isNotEmpty(param.getMchno())) {
				criteria.andMchNoEqualTo(param.getMchno());
			}
			
			if (StringUtils.isNotEmpty(param.getTersn())) {
				criteria.andTersnEqualTo(param.getTersn());
			}
			
			if (StringUtils.isNotEmpty(param.getUserid())) {
				criteria.andUseridEqualTo(param.getUserid());
			}
			
			if (StringUtils.isNotEmpty(param.getBrands())) {
				criteria.andBrandsEqualTo(param.getBrands());
			}

			if (StringUtils.isNotEmpty(param.getStatus())) {
				criteria.andStatusEqualTo(param.getStatus());
			}
		}
	}
	
	
	private void proSearchParam(TerminalHis param,
			TerminalHisExample.Criteria criteria) {
		if (param != null) {
			if (param.getId() != null) {
				criteria.andIdEqualTo(param.getId());
			}
			
			if (StringUtils.isNotEmpty(param.getParid())) {
				criteria.andParidEqualTo(param.getParid());
			}
			
			if (StringUtils.isNotEmpty(param.getUserid())) {
				criteria.andUseridEqualTo(param.getUserid());
			}
			
			if (StringUtils.isNotEmpty(param.getEdittype())) {
				criteria.andEdittypeEqualTo(param.getEdittype());
			}
		}
	}

	@Override
	public void saveHis(TerminalHis param) {
		terminalHisMapper.updateByPrimaryKey(param);
	}
}
