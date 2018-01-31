package com.gsccs.cmcc.data.model;

import java.util.Date;

public class ReportD {
	
    private String areaname;
	
    private Date interviewdate;
	
    private String ispname;
	
    private String username;
	
    private Integer terminal;
	
    private Integer fgFlow;
	
    private Integer fgCard;
	
    private Integer app;
	
    private String product1;
	
    private String result1;
	
    private String product2;
	
    private String result2;

    public String getAreaname() {
        return areaname;
    }

    public void setAreaname(String areaname) {
        this.areaname = areaname == null ? null : areaname.trim();
    }

    public Date getInterviewdate() {
        return interviewdate;
    }

    public void setInterviewdate(Date interviewdate) {
        this.interviewdate = interviewdate;
    }

    public String getIspname() {
        return ispname;
    }

    public void setIspname(String ispname) {
        this.ispname = ispname == null ? null : ispname.trim();
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username == null ? null : username.trim();
    }

    public Integer getTerminal() {
        return terminal;
    }

    public void setTerminal(Integer terminal) {
        this.terminal = terminal;
    }

    public Integer getFgFlow() {
        return fgFlow;
    }

    public void setFgFlow(Integer fgFlow) {
        this.fgFlow = fgFlow;
    }

    public Integer getFgCard() {
        return fgCard;
    }

    public void setFgCard(Integer fgCard) {
        this.fgCard = fgCard;
    }

    public Integer getApp() {
        return app;
    }

    public void setApp(Integer app) {
        this.app = app;
    }

    public String getProduct1() {
        return product1;
    }

    public void setProduct1(String product1) {
        this.product1 = product1 == null ? null : product1.trim();
    }

    public String getResult1() {
        return result1;
    }

    public void setResult1(String result1) {
        this.result1 = result1 == null ? null : result1.trim();
    }

    public String getProduct2() {
        return product2;
    }

    public void setProduct2(String product2) {
        this.product2 = product2 == null ? null : product2.trim();
    }

    public String getResult2() {
        return result2;
    }

    public void setResult2(String result2) {
        this.result2 = result2 == null ? null : result2.trim();
    }
}