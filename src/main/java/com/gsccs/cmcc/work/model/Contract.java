package com.gsccs.cmcc.work.model;

import java.util.Date;

/**
 * 项目对象
 * @author x.d zhang
 *
 */
public class Contract {
	
    private String id;
    private String pcode;			//项目编号
    private String mchno;			//商户号
    private String title;			//项目名称
    
    private Long sellerid;		//买方
    private Long buyerid;			//卖方
    private Long storerid;		//店东
    private Long agentid;			//经纪人
    private Long officerid;		//需求人
    
    private String sellertel;		//买方手机号
    private String buyertel;		//卖方手机号
    private String storertel;		//店东手机号
    private String agenttel;		//经纪人手机号
    private String officertel;		//需求人手机号
    
    private String sellername;		//买方名称
    private String buyername;		//卖方名称
    private String storername;		//店东名称
    private String agentname;		//经纪人名称
    private String officername;		//需求人名称
    
    private Date addtime;			//创建时间
    private Date endtime;			//上线时间
    private String status;
    private String remark;
    private Integer ordernum;
    
    //查询显示

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }
    
	public String getPcode() {
		return pcode;
	}

	public void setPcode(String pcode) {
		this.pcode = pcode;
	}

	public String getMchno() {
		return mchno;
	}

	public void setMchno(String mchno) {
		this.mchno = mchno;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	

	public Date getAddtime() {
		return addtime;
	}

	public void setAddtime(Date addtime) {
		this.addtime = addtime;
	}

	public Long getSellerid() {
		return sellerid;
	}

	public void setSellerid(Long sellerid) {
		this.sellerid = sellerid;
	}

	public Long getBuyerid() {
		return buyerid;
	}

	public void setBuyerid(Long buyerid) {
		this.buyerid = buyerid;
	}

	public Long getStorerid() {
		return storerid;
	}

	public void setStorerid(Long storerid) {
		this.storerid = storerid;
	}

	public Long getAgentid() {
		return agentid;
	}

	public void setAgentid(Long agentid) {
		this.agentid = agentid;
	}

	public Long getOfficerid() {
		return officerid;
	}

	public void setOfficerid(Long officerid) {
		this.officerid = officerid;
	}

	public Date getEndtime() {
		return endtime;
	}

	public void setEndtime(Date endtime) {
		this.endtime = endtime;
	}
	
	
	public String getSellertel() {
		return sellertel;
	}

	public void setSellertel(String sellertel) {
		this.sellertel = sellertel;
	}

	public String getBuyertel() {
		return buyertel;
	}

	public void setBuyertel(String buyertel) {
		this.buyertel = buyertel;
	}

	public String getStorertel() {
		return storertel;
	}

	public void setStorertel(String storertel) {
		this.storertel = storertel;
	}

	public String getAgenttel() {
		return agenttel;
	}

	public void setAgenttel(String agenttel) {
		this.agenttel = agenttel;
	}

	public String getOfficertel() {
		return officertel;
	}

	public void setOfficertel(String officertel) {
		this.officertel = officertel;
	}

	public String getSellername() {
		return sellername;
	}

	public void setSellername(String sellername) {
		this.sellername = sellername;
	}

	public String getBuyername() {
		return buyername;
	}

	public void setBuyername(String buyername) {
		this.buyername = buyername;
	}

	public String getStorername() {
		return storername;
	}

	public void setStorername(String storername) {
		this.storername = storername;
	}

	public String getAgentname() {
		return agentname;
	}

	public void setAgentname(String agentname) {
		this.agentname = agentname;
	}

	public String getOfficername() {
		return officername;
	}

	public void setOfficername(String officername) {
		this.officername = officername;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getRemark() {
		return remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

	public Integer getOrdernum() {
		return ordernum;
	}

	public void setOrdernum(Integer ordernum) {
		this.ordernum = ordernum;
	}

	

	
	
    
}