package com.gsccs.cmcc.info.service;

import java.util.List;

import com.gsccs.cmcc.info.model.TerminalHis;

public interface TerminalHisService {

	public void addIctprogress(TerminalHis param);

	public void updateIctprogress(TerminalHis param);

	public TerminalHis getIctprogress(String id);

	public void delIctprogress(String id);

	public List<TerminalHis> find(TerminalHis param, String order,
			int currPage, int pageSize);
	
	public List<TerminalHis> find(TerminalHis param);

	public int count(TerminalHis param);
}
