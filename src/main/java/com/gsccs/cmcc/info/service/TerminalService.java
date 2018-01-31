package com.gsccs.cmcc.info.service;

import java.util.List;

import com.gsccs.cmcc.info.model.Terminal;
import com.gsccs.cmcc.info.model.TerminalHis;

public interface TerminalService {

	public void save(Terminal param);

	public void update(Terminal param);

	public Terminal get(String id);

	public void del(String id);

	public List<Terminal> find(Terminal param, String order,
			int currPage, int pageSize);
	
	public List<Terminal> find(Terminal param);

	public int count(Terminal param);
	
	public TerminalHis getTerHis(String id);
	
	public List<TerminalHis> find(TerminalHis param, String order,
			int currPage, int pageSize);
	public int count(TerminalHis param);
	
	public void saveHis(TerminalHis param);
	
	public void delHis(String id);
}
