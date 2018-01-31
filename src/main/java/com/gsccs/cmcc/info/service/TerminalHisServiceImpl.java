package com.gsccs.cmcc.info.service;

import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gsccs.cmcc.info.model.TerminalHis;
import com.gsccs.cmcc.info.model.TerminalHisExample;
import com.gsccs.cmcc.merchant.dao.TerminalHisMapper;

@Service
public class TerminalHisServiceImpl implements TerminalHisService {

	@Autowired
	private TerminalHisMapper ictprogTMapper;
	

	private void proSearchParam(TerminalHis param,
			TerminalHisExample.Criteria criteria) {
		if (param != null) {
			if (param.getId() != null) {
				criteria.andIdEqualTo(param.getId());
			}
			if(param.getParid() !=null){
				criteria.andParidEqualTo(param.getParid());
			}
		}
	}

	

	@Override
	public void addIctprogress(TerminalHis ictprog) {
		if (null != ictprog) {
			ictprog.setId(UUID.randomUUID().toString());
			ictprogTMapper.insert(ictprog);
		}
		
	}

	@Override
	public void updateIctprogress(TerminalHis ictprog) {
		ictprogTMapper.updateByPrimaryKey(ictprog);
		
	}

	@Override
	public void delIctprogress(String id) {
		ictprogTMapper.deleteByPrimaryKey(id);
		
	}

	@Override
	public List<TerminalHis> find(TerminalHis ictprog, String order,
			int currPage, int pageSize) {
		TerminalHisExample example = new TerminalHisExample();
		TerminalHisExample.Criteria c = example.createCriteria();
		proSearchParam(ictprog, c);
		example.setPageSize(pageSize);
		example.setCurrPage(currPage);
		return ictprogTMapper.selectPageByExample(example);
	}

	@Override
	public List<TerminalHis> find(TerminalHis ictprog) {
		TerminalHisExample example = new TerminalHisExample();
		TerminalHisExample.Criteria c = example.createCriteria();
		proSearchParam(ictprog, c);
		return ictprogTMapper.selectByExample(example);
	}

	@Override
	public int count(TerminalHis ictprog) {
		TerminalHisExample example = new TerminalHisExample();
		TerminalHisExample.Criteria c = example.createCriteria();
		proSearchParam(ictprog, c);
		return ictprogTMapper.countByExample(example);
	}



	@Override
	public TerminalHis getIctprogress(String id) {
		return ictprogTMapper.selectByPrimaryKey(id);
	}
}
