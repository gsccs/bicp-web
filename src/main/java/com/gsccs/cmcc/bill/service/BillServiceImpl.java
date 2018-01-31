package com.gsccs.cmcc.bill.service;

import java.util.List;

import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gsccs.cmcc.bill.dao.BillItemMapper;
import com.gsccs.cmcc.bill.dao.BillSumMapper;
import com.gsccs.cmcc.bill.dao.SubjectMapper;
import com.gsccs.cmcc.bill.model.BillItem;
import com.gsccs.cmcc.bill.model.BillItemExample;
import com.gsccs.cmcc.bill.model.BillItemExample.Criteria;
import com.gsccs.cmcc.bill.model.Subject;
import com.gsccs.cmcc.bill.model.BillSum;

@Service
public class BillServiceImpl implements BillService{
	
	@Autowired
	private BillSumMapper billSumMapper;	
	@Autowired
	private BillItemMapper billItemMapper;
	@Autowired
	private SubjectMapper subjectMapper;

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
	public void del(String id) {
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

	private void proSearchParam(BillItem param, Criteria criteria) {
		if (param != null) {
			if (StringUtils.isNotEmpty(param.getBillid())) {
				criteria.andBillidEqualTo(param.getBillid());
			}

			if (StringUtils.isNotEmpty(param.getSubjectid())) {
				criteria.andSubjectidEqualTo(param.getSubjectid());
			}
		}
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
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Subject> find(Subject param, String order,
			int currPage, int pageSize) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public BillSum getBillSum(String id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int count(BillSum param) {
		// TODO Auto-generated method stub
		return 0;
	}

}
