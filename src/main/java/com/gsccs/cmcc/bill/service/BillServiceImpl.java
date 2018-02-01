package com.gsccs.cmcc.bill.service;

import java.util.ArrayList;
import java.util.List;

import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gsccs.cmcc.bill.dao.BillItemMapper;
import com.gsccs.cmcc.bill.dao.BillSumMapper;
import com.gsccs.cmcc.bill.dao.BillTplMapper;
import com.gsccs.cmcc.bill.dao.SubjectMapper;
import com.gsccs.cmcc.bill.model.BillItem;
import com.gsccs.cmcc.bill.model.BillItemExample;
import com.gsccs.cmcc.bill.model.BillSum;
import com.gsccs.cmcc.bill.model.BillSumExample;
import com.gsccs.cmcc.bill.model.BillTpl;
import com.gsccs.cmcc.bill.model.BillTplExample;
import com.gsccs.cmcc.bill.model.Subject;
import com.gsccs.cmcc.bill.model.SubjectExample;

@Service
public class BillServiceImpl implements BillService{
	
	@Autowired
	private BillSumMapper billSumMapper;	
	@Autowired
	private BillItemMapper billItemMapper;
	@Autowired
	private SubjectMapper subjectMapper;
	@Autowired
	private BillTplMapper billTplMapper;

	@Override
	public Integer add(BillItem param) {
		if (null != param) {
			billItemMapper.insert(param);
		}
		return null;
	}

	@Override
	public void update(BillItem recomd) {
		billItemMapper.updateByPrimaryKey(recomd);
	}

	@Override
	public BillItem getBillItem(String id) {
		return billItemMapper.selectByPrimaryKey(Integer.valueOf(id));
	}

	@Override
	public void delBillItem(String id) {
		billItemMapper.deleteByPrimaryKey(Integer.valueOf(id));
	}

	@Override
	public List<BillItem> find(BillItem semreport, String order,
			int currPage, int pageSize) {
		BillItemExample example = new BillItemExample();
		BillItemExample.Criteria c = example.createCriteria();
		proSearchParam(semreport, c);
		example.setPageSize(pageSize);
		example.setCurrPage(currPage);
		return billItemMapper.selectPageByExample(example);
	}

	@Override
	public int count(BillItem recomd) {
		BillItemExample example = new BillItemExample();
		BillItemExample.Criteria c = example.createCriteria();
		proSearchParam(recomd, c);
		return billItemMapper.countByExample(example);
	}

	@Override
	public List<BillSum> find(BillSum param, String order, int currPage,
			int pageSize) {
		BillSumExample example = new BillSumExample();
		BillSumExample.Criteria c = example.createCriteria();
		proSearchParam(param, c);
		example.setPageSize(pageSize);
		example.setCurrPage(currPage);
		return billSumMapper.selectPageByExample(example);
	}

	@Override
	public List<Subject> find(Subject param, String order,
			int currPage, int pageSize) {
		SubjectExample example = new SubjectExample();
		SubjectExample.Criteria c = example.createCriteria();
		proSearchParam(param, c);
		example.setPageSize(pageSize);
		example.setCurrPage(currPage);
		return subjectMapper.selectPageByExample(example);
	}

	@Override
	public BillSum getBillSum(String id) {
		return billSumMapper.selectByPrimaryKey(id);
	}

	@Override
	public int count(BillSum param) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int count(Subject param) {
		return 0;
	}
	
	@Override
	public int count(BillTpl param) {
		return 0;
	}
	

	@Override
	public List<BillTpl> find(BillTpl param, String order, int currPage,
			int pageSize) {
		BillTplExample example = new BillTplExample();
		BillTplExample.Criteria c = example.createCriteria();
		proSearchParam(param, c);
		example.setPageSize(pageSize);
		example.setCurrPage(currPage);
		return billTplMapper.selectPageByExample(example);
	}

	
	private void proSearchParam(BillItem param, BillItemExample.Criteria criteria) {
		if (param != null) {
			if (StringUtils.isNotEmpty(param.getBillid())) {
				criteria.andBillidEqualTo(param.getBillid());
			}

			if (null != param.getKmid()) {
				criteria.andKmidEqualTo(param.getKmid());
			}
		}
	}
	
	private void proSearchParam(BillSum param, BillSumExample.Criteria criteria) {
		if (param != null) {
			if (StringUtils.isNotEmpty(param.getBillno())) {
				criteria.andBillnoEqualTo(param.getBillno());
			}
			
			if (StringUtils.isNotEmpty(param.getUserid())) {
				criteria.andUseridEqualTo(param.getUserid());
			}

			if (StringUtils.isNotEmpty(param.getStatus())) {
				criteria.andStatusEqualTo(param.getStatus());
			}
		}
	}
	
	private void proSearchParam(BillTpl param, BillTplExample.Criteria criteria) {
		if (param != null) {
			if (StringUtils.isNotEmpty(param.getTitle())) {
				criteria.andTitleLike("%"+param.getTitle()+"%");
			}

			if (StringUtils.isNotEmpty(param.getStatus())) {
				criteria.andStatusEqualTo(param.getStatus());
			}
		}
	}
	
	private void proSearchParam(Subject param, SubjectExample.Criteria criteria) {
		if (param != null) {
			if (StringUtils.isNotEmpty(param.getTitle())) {
				criteria.andTitleLike("%"+param.getTitle()+"%");
			}

			if (StringUtils.isNotEmpty(param.getStatus())) {
				criteria.andStatusEqualTo(param.getStatus());
			}
			
		}
	}

	@Override
	public Integer saveSubject(Subject param) {
		Integer id = null;
		if (null==param){
			return null;
		}
		if (null==param.getId()){
			subjectMapper.insert(param);
			id = param.getId();
		}else{
			subjectMapper.updateByPrimaryKeySelective(param);
			id = param.getId();
		}
		return id;
	}

	
	@Override
	public void delSubject(Integer id) {
		subjectMapper.deleteByPrimaryKey(id);
	}

	@Override
	public Subject getSubject(Integer id) {
		return subjectMapper.selectByPrimaryKey(id);
	}


	@Override
	public Integer addBillSum(BillSum param) {
		return null;
	}

	@Override
	public void updateBillSum(BillSum param) {
		
	}

	@Override
	public void delBillSum(String id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Integer addBillTpl(BillTpl param) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void updateBillTpl(BillTpl param) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public BillTpl getBillTpl(String id) {
		return billTplMapper.selectByPrimaryKey(id);
	}

	@Override
	public void delBillTpl(String id) {
		billTplMapper.deleteByPrimaryKey(id);
	}

	@Override
	public Integer saveBillTpl(BillTpl param) {
		Integer id = null;
		if (null==param){
			return null;
		}
		if (null==param.getId()){
			billTplMapper.insert(param);
			id = param.getId();
		}else{
			billTplMapper.updateByPrimaryKeySelective(param);
			id = param.getId();
		}
		return id;
	}

	@Override
	public List<Subject> find(String ids) {
		if (StringUtils.isEmpty(ids)){
			return null;
		}
		String[] kmids = ids.split(",");
		List<Integer> idList = new ArrayList<Integer>();
		if (null!=kmids && kmids.length>0){
			for(String id:kmids){
				idList.add(Integer.valueOf(id));
			}
		}
		
		if (null != idList && idList.size()>0){
			SubjectExample example = new SubjectExample();
			SubjectExample.Criteria c = example.createCriteria();
			c.andIdIn(idList);
			return subjectMapper.selectPageByExample(example);
		}
		return null;
		
	}


}
