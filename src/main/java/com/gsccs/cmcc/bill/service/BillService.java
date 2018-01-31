package com.gsccs.cmcc.bill.service;

import java.util.List;

import com.gsccs.cmcc.bill.model.BillItem;
import com.gsccs.cmcc.bill.model.Subject;
import com.gsccs.cmcc.bill.model.BillSum;


/**
 * 账单接口
 * @author x.d zhang
 *
 */
public interface BillService {

	public Integer add(BillItem recomd);

	public void update(BillItem recomd);
	
	public BillSum getBillSum(String id);
	
	public BillItem getBillItem(String id);

	public void del(String id);
	
	public List<BillSum> find(BillSum param, String order, int currPage,
			int pageSize);
	public List<BillItem> find(BillItem param, String order, int currPage,
			int pageSize);
	public List<Subject> find(Subject param, String order, int currPage,
			int pageSize);
	
	public int count(BillSum param);
	
	public int count(BillItem param);
}
