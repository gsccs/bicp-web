package com.gsccs.cmcc.bill.service;

import java.util.List;

import com.gsccs.cmcc.bill.model.BillItem;
import com.gsccs.cmcc.bill.model.BillTpl;
import com.gsccs.cmcc.bill.model.Subject;
import com.gsccs.cmcc.bill.model.BillSum;


/**
 * 账单接口
 * @author x.d zhang
 *
 */
public interface BillService {

	public Integer addSubject(Subject param);
	public void updateSubject(Subject param);
	public Subject getSubject(Integer id);
	
	public Integer add(BillItem recomd);
	public void update(BillItem recomd);
	public BillItem getBillItem(String id);
	public void delBillItem(String id);
	
	public Integer addBillSum(BillSum param);
	public void updateBillSum(BillSum param);
	public BillSum getBillSum(String id);
	public void delBillSum(String id);
	
	public Integer addBillTpl(BillTpl param);
	public void updateBillTpl(BillTpl param);
	public BillTpl getBillTpl(String id);
	public void delBillTpl(String id);
	
	
	public List<BillSum> find(BillSum param, String order, int currPage,
			int pageSize);
	public List<BillItem> find(BillItem param, String order, int currPage,
			int pageSize);
	public List<Subject> find(Subject param, String order, int currPage,
			int pageSize);
	public List<BillTpl> find(BillTpl param, String order, int currPage,
			int pageSize);
	
	public int count(BillSum param);
	public int count(BillItem param);
	public int count(Subject param);
	public int count(BillTpl param);
}
