package com.gsccs.cmcc.data.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class InfoDExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public InfoDExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andAreanameIsNull() {
            addCriterion("areaname is null");
            return (Criteria) this;
        }

        public Criteria andAreanameIsNotNull() {
            addCriterion("areaname is not null");
            return (Criteria) this;
        }

        public Criteria andAreanameEqualTo(String value) {
            addCriterion("areaname =", value, "areaname");
            return (Criteria) this;
        }

        public Criteria andAreanameNotEqualTo(String value) {
            addCriterion("areaname <>", value, "areaname");
            return (Criteria) this;
        }

        public Criteria andAreanameGreaterThan(String value) {
            addCriterion("areaname >", value, "areaname");
            return (Criteria) this;
        }

        public Criteria andAreanameGreaterThanOrEqualTo(String value) {
            addCriterion("areaname >=", value, "areaname");
            return (Criteria) this;
        }

        public Criteria andAreanameLessThan(String value) {
            addCriterion("areaname <", value, "areaname");
            return (Criteria) this;
        }

        public Criteria andAreanameLessThanOrEqualTo(String value) {
            addCriterion("areaname <=", value, "areaname");
            return (Criteria) this;
        }

        public Criteria andAreanameLike(String value) {
            addCriterion("areaname like", value, "areaname");
            return (Criteria) this;
        }

        public Criteria andAreanameNotLike(String value) {
            addCriterion("areaname not like", value, "areaname");
            return (Criteria) this;
        }

        public Criteria andAreanameIn(List<String> values) {
            addCriterion("areaname in", values, "areaname");
            return (Criteria) this;
        }

        public Criteria andAreanameNotIn(List<String> values) {
            addCriterion("areaname not in", values, "areaname");
            return (Criteria) this;
        }

        public Criteria andAreanameBetween(String value1, String value2) {
            addCriterion("areaname between", value1, value2, "areaname");
            return (Criteria) this;
        }

        public Criteria andAreanameNotBetween(String value1, String value2) {
            addCriterion("areaname not between", value1, value2, "areaname");
            return (Criteria) this;
        }

        public Criteria andKnowdateIsNull() {
            addCriterion("knowdate is null");
            return (Criteria) this;
        }

        public Criteria andKnowdateIsNotNull() {
            addCriterion("knowdate is not null");
            return (Criteria) this;
        }

        public Criteria andKnowdateEqualTo(Date value) {
            addCriterion("knowdate =", value, "knowdate");
            return (Criteria) this;
        }

        public Criteria andKnowdateNotEqualTo(Date value) {
            addCriterion("knowdate <>", value, "knowdate");
            return (Criteria) this;
        }

        public Criteria andKnowdateGreaterThan(Date value) {
            addCriterion("knowdate >", value, "knowdate");
            return (Criteria) this;
        }

        public Criteria andKnowdateGreaterThanOrEqualTo(Date value) {
            addCriterion("knowdate >=", value, "knowdate");
            return (Criteria) this;
        }

        public Criteria andKnowdateLessThan(Date value) {
            addCriterion("knowdate <", value, "knowdate");
            return (Criteria) this;
        }

        public Criteria andKnowdateLessThanOrEqualTo(Date value) {
            addCriterion("knowdate <=", value, "knowdate");
            return (Criteria) this;
        }

        public Criteria andKnowdateIn(List<Date> values) {
            addCriterion("knowdate in", values, "knowdate");
            return (Criteria) this;
        }

        public Criteria andKnowdateNotIn(List<Date> values) {
            addCriterion("knowdate not in", values, "knowdate");
            return (Criteria) this;
        }

        public Criteria andKnowdateBetween(Date value1, Date value2) {
            addCriterion("knowdate between", value1, value2, "knowdate");
            return (Criteria) this;
        }

        public Criteria andKnowdateNotBetween(Date value1, Date value2) {
            addCriterion("knowdate not between", value1, value2, "knowdate");
            return (Criteria) this;
        }

        public Criteria andIspcodeIsNull() {
            addCriterion("ispcode is null");
            return (Criteria) this;
        }

        public Criteria andIspcodeIsNotNull() {
            addCriterion("ispcode is not null");
            return (Criteria) this;
        }

        public Criteria andIspcodeEqualTo(String value) {
            addCriterion("ispcode =", value, "ispcode");
            return (Criteria) this;
        }

        public Criteria andIspcodeNotEqualTo(String value) {
            addCriterion("ispcode <>", value, "ispcode");
            return (Criteria) this;
        }

        public Criteria andIspcodeGreaterThan(String value) {
            addCriterion("ispcode >", value, "ispcode");
            return (Criteria) this;
        }

        public Criteria andIspcodeGreaterThanOrEqualTo(String value) {
            addCriterion("ispcode >=", value, "ispcode");
            return (Criteria) this;
        }

        public Criteria andIspcodeLessThan(String value) {
            addCriterion("ispcode <", value, "ispcode");
            return (Criteria) this;
        }

        public Criteria andIspcodeLessThanOrEqualTo(String value) {
            addCriterion("ispcode <=", value, "ispcode");
            return (Criteria) this;
        }

        public Criteria andIspcodeLike(String value) {
            addCriterion("ispcode like", value, "ispcode");
            return (Criteria) this;
        }

        public Criteria andIspcodeNotLike(String value) {
            addCriterion("ispcode not like", value, "ispcode");
            return (Criteria) this;
        }

        public Criteria andIspcodeIn(List<String> values) {
            addCriterion("ispcode in", values, "ispcode");
            return (Criteria) this;
        }

        public Criteria andIspcodeNotIn(List<String> values) {
            addCriterion("ispcode not in", values, "ispcode");
            return (Criteria) this;
        }

        public Criteria andIspcodeBetween(String value1, String value2) {
            addCriterion("ispcode between", value1, value2, "ispcode");
            return (Criteria) this;
        }

        public Criteria andIspcodeNotBetween(String value1, String value2) {
            addCriterion("ispcode not between", value1, value2, "ispcode");
            return (Criteria) this;
        }

        public Criteria andIspnameIsNull() {
            addCriterion("ispname is null");
            return (Criteria) this;
        }

        public Criteria andIspnameIsNotNull() {
            addCriterion("ispname is not null");
            return (Criteria) this;
        }

        public Criteria andIspnameEqualTo(String value) {
            addCriterion("ispname =", value, "ispname");
            return (Criteria) this;
        }

        public Criteria andIspnameNotEqualTo(String value) {
            addCriterion("ispname <>", value, "ispname");
            return (Criteria) this;
        }

        public Criteria andIspnameGreaterThan(String value) {
            addCriterion("ispname >", value, "ispname");
            return (Criteria) this;
        }

        public Criteria andIspnameGreaterThanOrEqualTo(String value) {
            addCriterion("ispname >=", value, "ispname");
            return (Criteria) this;
        }

        public Criteria andIspnameLessThan(String value) {
            addCriterion("ispname <", value, "ispname");
            return (Criteria) this;
        }

        public Criteria andIspnameLessThanOrEqualTo(String value) {
            addCriterion("ispname <=", value, "ispname");
            return (Criteria) this;
        }

        public Criteria andIspnameLike(String value) {
            addCriterion("ispname like", value, "ispname");
            return (Criteria) this;
        }

        public Criteria andIspnameNotLike(String value) {
            addCriterion("ispname not like", value, "ispname");
            return (Criteria) this;
        }

        public Criteria andIspnameIn(List<String> values) {
            addCriterion("ispname in", values, "ispname");
            return (Criteria) this;
        }

        public Criteria andIspnameNotIn(List<String> values) {
            addCriterion("ispname not in", values, "ispname");
            return (Criteria) this;
        }

        public Criteria andIspnameBetween(String value1, String value2) {
            addCriterion("ispname between", value1, value2, "ispname");
            return (Criteria) this;
        }

        public Criteria andIspnameNotBetween(String value1, String value2) {
            addCriterion("ispname not between", value1, value2, "ispname");
            return (Criteria) this;
        }

        public Criteria andUsrenameIsNull() {
            addCriterion("usrename is null");
            return (Criteria) this;
        }

        public Criteria andUsrenameIsNotNull() {
            addCriterion("usrename is not null");
            return (Criteria) this;
        }

        public Criteria andUsrenameEqualTo(String value) {
            addCriterion("usrename =", value, "usrename");
            return (Criteria) this;
        }

        public Criteria andUsrenameNotEqualTo(String value) {
            addCriterion("usrename <>", value, "usrename");
            return (Criteria) this;
        }

        public Criteria andUsrenameGreaterThan(String value) {
            addCriterion("usrename >", value, "usrename");
            return (Criteria) this;
        }

        public Criteria andUsrenameGreaterThanOrEqualTo(String value) {
            addCriterion("usrename >=", value, "usrename");
            return (Criteria) this;
        }

        public Criteria andUsrenameLessThan(String value) {
            addCriterion("usrename <", value, "usrename");
            return (Criteria) this;
        }

        public Criteria andUsrenameLessThanOrEqualTo(String value) {
            addCriterion("usrename <=", value, "usrename");
            return (Criteria) this;
        }

        public Criteria andUsrenameLike(String value) {
            addCriterion("usrename like", value, "usrename");
            return (Criteria) this;
        }

        public Criteria andUsrenameNotLike(String value) {
            addCriterion("usrename not like", value, "usrename");
            return (Criteria) this;
        }

        public Criteria andUsrenameIn(List<String> values) {
            addCriterion("usrename in", values, "usrename");
            return (Criteria) this;
        }

        public Criteria andUsrenameNotIn(List<String> values) {
            addCriterion("usrename not in", values, "usrename");
            return (Criteria) this;
        }

        public Criteria andUsrenameBetween(String value1, String value2) {
            addCriterion("usrename between", value1, value2, "usrename");
            return (Criteria) this;
        }

        public Criteria andUsrenameNotBetween(String value1, String value2) {
            addCriterion("usrename not between", value1, value2, "usrename");
            return (Criteria) this;
        }

        public Criteria andPnameIsNull() {
            addCriterion("pname is null");
            return (Criteria) this;
        }

        public Criteria andPnameIsNotNull() {
            addCriterion("pname is not null");
            return (Criteria) this;
        }

        public Criteria andPnameEqualTo(String value) {
            addCriterion("pname =", value, "pname");
            return (Criteria) this;
        }

        public Criteria andPnameNotEqualTo(String value) {
            addCriterion("pname <>", value, "pname");
            return (Criteria) this;
        }

        public Criteria andPnameGreaterThan(String value) {
            addCriterion("pname >", value, "pname");
            return (Criteria) this;
        }

        public Criteria andPnameGreaterThanOrEqualTo(String value) {
            addCriterion("pname >=", value, "pname");
            return (Criteria) this;
        }

        public Criteria andPnameLessThan(String value) {
            addCriterion("pname <", value, "pname");
            return (Criteria) this;
        }

        public Criteria andPnameLessThanOrEqualTo(String value) {
            addCriterion("pname <=", value, "pname");
            return (Criteria) this;
        }

        public Criteria andPnameLike(String value) {
            addCriterion("pname like", value, "pname");
            return (Criteria) this;
        }

        public Criteria andPnameNotLike(String value) {
            addCriterion("pname not like", value, "pname");
            return (Criteria) this;
        }

        public Criteria andPnameIn(List<String> values) {
            addCriterion("pname in", values, "pname");
            return (Criteria) this;
        }

        public Criteria andPnameNotIn(List<String> values) {
            addCriterion("pname not in", values, "pname");
            return (Criteria) this;
        }

        public Criteria andPnameBetween(String value1, String value2) {
            addCriterion("pname between", value1, value2, "pname");
            return (Criteria) this;
        }

        public Criteria andPnameNotBetween(String value1, String value2) {
            addCriterion("pname not between", value1, value2, "pname");
            return (Criteria) this;
        }

        public Criteria andPcontentIsNull() {
            addCriterion("pcontent is null");
            return (Criteria) this;
        }

        public Criteria andPcontentIsNotNull() {
            addCriterion("pcontent is not null");
            return (Criteria) this;
        }

        public Criteria andPcontentEqualTo(String value) {
            addCriterion("pcontent =", value, "pcontent");
            return (Criteria) this;
        }

        public Criteria andPcontentNotEqualTo(String value) {
            addCriterion("pcontent <>", value, "pcontent");
            return (Criteria) this;
        }

        public Criteria andPcontentGreaterThan(String value) {
            addCriterion("pcontent >", value, "pcontent");
            return (Criteria) this;
        }

        public Criteria andPcontentGreaterThanOrEqualTo(String value) {
            addCriterion("pcontent >=", value, "pcontent");
            return (Criteria) this;
        }

        public Criteria andPcontentLessThan(String value) {
            addCriterion("pcontent <", value, "pcontent");
            return (Criteria) this;
        }

        public Criteria andPcontentLessThanOrEqualTo(String value) {
            addCriterion("pcontent <=", value, "pcontent");
            return (Criteria) this;
        }

        public Criteria andPcontentLike(String value) {
            addCriterion("pcontent like", value, "pcontent");
            return (Criteria) this;
        }

        public Criteria andPcontentNotLike(String value) {
            addCriterion("pcontent not like", value, "pcontent");
            return (Criteria) this;
        }

        public Criteria andPcontentIn(List<String> values) {
            addCriterion("pcontent in", values, "pcontent");
            return (Criteria) this;
        }

        public Criteria andPcontentNotIn(List<String> values) {
            addCriterion("pcontent not in", values, "pcontent");
            return (Criteria) this;
        }

        public Criteria andPcontentBetween(String value1, String value2) {
            addCriterion("pcontent between", value1, value2, "pcontent");
            return (Criteria) this;
        }

        public Criteria andPcontentNotBetween(String value1, String value2) {
            addCriterion("pcontent not between", value1, value2, "pcontent");
            return (Criteria) this;
        }

        public Criteria andMoneyIsNull() {
            addCriterion("money is null");
            return (Criteria) this;
        }

        public Criteria andMoneyIsNotNull() {
            addCriterion("money is not null");
            return (Criteria) this;
        }

        public Criteria andMoneyEqualTo(Float value) {
            addCriterion("money =", value, "money");
            return (Criteria) this;
        }

        public Criteria andMoneyNotEqualTo(Float value) {
            addCriterion("money <>", value, "money");
            return (Criteria) this;
        }

        public Criteria andMoneyGreaterThan(Float value) {
            addCriterion("money >", value, "money");
            return (Criteria) this;
        }

        public Criteria andMoneyGreaterThanOrEqualTo(Float value) {
            addCriterion("money >=", value, "money");
            return (Criteria) this;
        }

        public Criteria andMoneyLessThan(Float value) {
            addCriterion("money <", value, "money");
            return (Criteria) this;
        }

        public Criteria andMoneyLessThanOrEqualTo(Float value) {
            addCriterion("money <=", value, "money");
            return (Criteria) this;
        }

        public Criteria andMoneyIn(List<Float> values) {
            addCriterion("money in", values, "money");
            return (Criteria) this;
        }

        public Criteria andMoneyNotIn(List<Float> values) {
            addCriterion("money not in", values, "money");
            return (Criteria) this;
        }

        public Criteria andMoneyBetween(Float value1, Float value2) {
            addCriterion("money between", value1, value2, "money");
            return (Criteria) this;
        }

        public Criteria andMoneyNotBetween(Float value1, Float value2) {
            addCriterion("money not between", value1, value2, "money");
            return (Criteria) this;
        }

        public Criteria andStartdateIsNull() {
            addCriterion("startdate is null");
            return (Criteria) this;
        }

        public Criteria andStartdateIsNotNull() {
            addCriterion("startdate is not null");
            return (Criteria) this;
        }

        public Criteria andStartdateEqualTo(Date value) {
            addCriterion("startdate =", value, "startdate");
            return (Criteria) this;
        }

        public Criteria andStartdateNotEqualTo(Date value) {
            addCriterion("startdate <>", value, "startdate");
            return (Criteria) this;
        }

        public Criteria andStartdateGreaterThan(Date value) {
            addCriterion("startdate >", value, "startdate");
            return (Criteria) this;
        }

        public Criteria andStartdateGreaterThanOrEqualTo(Date value) {
            addCriterion("startdate >=", value, "startdate");
            return (Criteria) this;
        }

        public Criteria andStartdateLessThan(Date value) {
            addCriterion("startdate <", value, "startdate");
            return (Criteria) this;
        }

        public Criteria andStartdateLessThanOrEqualTo(Date value) {
            addCriterion("startdate <=", value, "startdate");
            return (Criteria) this;
        }

        public Criteria andStartdateIn(List<Date> values) {
            addCriterion("startdate in", values, "startdate");
            return (Criteria) this;
        }

        public Criteria andStartdateNotIn(List<Date> values) {
            addCriterion("startdate not in", values, "startdate");
            return (Criteria) this;
        }

        public Criteria andStartdateBetween(Date value1, Date value2) {
            addCriterion("startdate between", value1, value2, "startdate");
            return (Criteria) this;
        }

        public Criteria andStartdateNotBetween(Date value1, Date value2) {
            addCriterion("startdate not between", value1, value2, "startdate");
            return (Criteria) this;
        }

        public Criteria andNegotiatedateIsNull() {
            addCriterion("negotiatedate is null");
            return (Criteria) this;
        }

        public Criteria andNegotiatedateIsNotNull() {
            addCriterion("negotiatedate is not null");
            return (Criteria) this;
        }

        public Criteria andNegotiatedateEqualTo(Date value) {
            addCriterion("negotiatedate =", value, "negotiatedate");
            return (Criteria) this;
        }

        public Criteria andNegotiatedateNotEqualTo(Date value) {
            addCriterion("negotiatedate <>", value, "negotiatedate");
            return (Criteria) this;
        }

        public Criteria andNegotiatedateGreaterThan(Date value) {
            addCriterion("negotiatedate >", value, "negotiatedate");
            return (Criteria) this;
        }

        public Criteria andNegotiatedateGreaterThanOrEqualTo(Date value) {
            addCriterion("negotiatedate >=", value, "negotiatedate");
            return (Criteria) this;
        }

        public Criteria andNegotiatedateLessThan(Date value) {
            addCriterion("negotiatedate <", value, "negotiatedate");
            return (Criteria) this;
        }

        public Criteria andNegotiatedateLessThanOrEqualTo(Date value) {
            addCriterion("negotiatedate <=", value, "negotiatedate");
            return (Criteria) this;
        }

        public Criteria andNegotiatedateIn(List<Date> values) {
            addCriterion("negotiatedate in", values, "negotiatedate");
            return (Criteria) this;
        }

        public Criteria andNegotiatedateNotIn(List<Date> values) {
            addCriterion("negotiatedate not in", values, "negotiatedate");
            return (Criteria) this;
        }

        public Criteria andNegotiatedateBetween(Date value1, Date value2) {
            addCriterion("negotiatedate between", value1, value2, "negotiatedate");
            return (Criteria) this;
        }

        public Criteria andNegotiatedateNotBetween(Date value1, Date value2) {
            addCriterion("negotiatedate not between", value1, value2, "negotiatedate");
            return (Criteria) this;
        }

        public Criteria andMoneysourceIsNull() {
            addCriterion("moneysource is null");
            return (Criteria) this;
        }

        public Criteria andMoneysourceIsNotNull() {
            addCriterion("moneysource is not null");
            return (Criteria) this;
        }

        public Criteria andMoneysourceEqualTo(String value) {
            addCriterion("moneysource =", value, "moneysource");
            return (Criteria) this;
        }

        public Criteria andMoneysourceNotEqualTo(String value) {
            addCriterion("moneysource <>", value, "moneysource");
            return (Criteria) this;
        }

        public Criteria andMoneysourceGreaterThan(String value) {
            addCriterion("moneysource >", value, "moneysource");
            return (Criteria) this;
        }

        public Criteria andMoneysourceGreaterThanOrEqualTo(String value) {
            addCriterion("moneysource >=", value, "moneysource");
            return (Criteria) this;
        }

        public Criteria andMoneysourceLessThan(String value) {
            addCriterion("moneysource <", value, "moneysource");
            return (Criteria) this;
        }

        public Criteria andMoneysourceLessThanOrEqualTo(String value) {
            addCriterion("moneysource <=", value, "moneysource");
            return (Criteria) this;
        }

        public Criteria andMoneysourceLike(String value) {
            addCriterion("moneysource like", value, "moneysource");
            return (Criteria) this;
        }

        public Criteria andMoneysourceNotLike(String value) {
            addCriterion("moneysource not like", value, "moneysource");
            return (Criteria) this;
        }

        public Criteria andMoneysourceIn(List<String> values) {
            addCriterion("moneysource in", values, "moneysource");
            return (Criteria) this;
        }

        public Criteria andMoneysourceNotIn(List<String> values) {
            addCriterion("moneysource not in", values, "moneysource");
            return (Criteria) this;
        }

        public Criteria andMoneysourceBetween(String value1, String value2) {
            addCriterion("moneysource between", value1, value2, "moneysource");
            return (Criteria) this;
        }

        public Criteria andMoneysourceNotBetween(String value1, String value2) {
            addCriterion("moneysource not between", value1, value2, "moneysource");
            return (Criteria) this;
        }

        public Criteria andPartnerIsNull() {
            addCriterion("partner is null");
            return (Criteria) this;
        }

        public Criteria andPartnerIsNotNull() {
            addCriterion("partner is not null");
            return (Criteria) this;
        }

        public Criteria andPartnerEqualTo(String value) {
            addCriterion("partner =", value, "partner");
            return (Criteria) this;
        }

        public Criteria andPartnerNotEqualTo(String value) {
            addCriterion("partner <>", value, "partner");
            return (Criteria) this;
        }

        public Criteria andPartnerGreaterThan(String value) {
            addCriterion("partner >", value, "partner");
            return (Criteria) this;
        }

        public Criteria andPartnerGreaterThanOrEqualTo(String value) {
            addCriterion("partner >=", value, "partner");
            return (Criteria) this;
        }

        public Criteria andPartnerLessThan(String value) {
            addCriterion("partner <", value, "partner");
            return (Criteria) this;
        }

        public Criteria andPartnerLessThanOrEqualTo(String value) {
            addCriterion("partner <=", value, "partner");
            return (Criteria) this;
        }

        public Criteria andPartnerLike(String value) {
            addCriterion("partner like", value, "partner");
            return (Criteria) this;
        }

        public Criteria andPartnerNotLike(String value) {
            addCriterion("partner not like", value, "partner");
            return (Criteria) this;
        }

        public Criteria andPartnerIn(List<String> values) {
            addCriterion("partner in", values, "partner");
            return (Criteria) this;
        }

        public Criteria andPartnerNotIn(List<String> values) {
            addCriterion("partner not in", values, "partner");
            return (Criteria) this;
        }

        public Criteria andPartnerBetween(String value1, String value2) {
            addCriterion("partner between", value1, value2, "partner");
            return (Criteria) this;
        }

        public Criteria andPartnerNotBetween(String value1, String value2) {
            addCriterion("partner not between", value1, value2, "partner");
            return (Criteria) this;
        }

        public Criteria andIsplaneIsNull() {
            addCriterion("isplane is null");
            return (Criteria) this;
        }

        public Criteria andIsplaneIsNotNull() {
            addCriterion("isplane is not null");
            return (Criteria) this;
        }

        public Criteria andIsplaneEqualTo(String value) {
            addCriterion("isplane =", value, "isplane");
            return (Criteria) this;
        }

        public Criteria andIsplaneNotEqualTo(String value) {
            addCriterion("isplane <>", value, "isplane");
            return (Criteria) this;
        }

        public Criteria andIsplaneGreaterThan(String value) {
            addCriterion("isplane >", value, "isplane");
            return (Criteria) this;
        }

        public Criteria andIsplaneGreaterThanOrEqualTo(String value) {
            addCriterion("isplane >=", value, "isplane");
            return (Criteria) this;
        }

        public Criteria andIsplaneLessThan(String value) {
            addCriterion("isplane <", value, "isplane");
            return (Criteria) this;
        }

        public Criteria andIsplaneLessThanOrEqualTo(String value) {
            addCriterion("isplane <=", value, "isplane");
            return (Criteria) this;
        }

        public Criteria andIsplaneLike(String value) {
            addCriterion("isplane like", value, "isplane");
            return (Criteria) this;
        }

        public Criteria andIsplaneNotLike(String value) {
            addCriterion("isplane not like", value, "isplane");
            return (Criteria) this;
        }

        public Criteria andIsplaneIn(List<String> values) {
            addCriterion("isplane in", values, "isplane");
            return (Criteria) this;
        }

        public Criteria andIsplaneNotIn(List<String> values) {
            addCriterion("isplane not in", values, "isplane");
            return (Criteria) this;
        }

        public Criteria andIsplaneBetween(String value1, String value2) {
            addCriterion("isplane between", value1, value2, "isplane");
            return (Criteria) this;
        }

        public Criteria andIsplaneNotBetween(String value1, String value2) {
            addCriterion("isplane not between", value1, value2, "isplane");
            return (Criteria) this;
        }

        public Criteria andPlanetypeIsNull() {
            addCriterion("planetype is null");
            return (Criteria) this;
        }

        public Criteria andPlanetypeIsNotNull() {
            addCriterion("planetype is not null");
            return (Criteria) this;
        }

        public Criteria andPlanetypeEqualTo(String value) {
            addCriterion("planetype =", value, "planetype");
            return (Criteria) this;
        }

        public Criteria andPlanetypeNotEqualTo(String value) {
            addCriterion("planetype <>", value, "planetype");
            return (Criteria) this;
        }

        public Criteria andPlanetypeGreaterThan(String value) {
            addCriterion("planetype >", value, "planetype");
            return (Criteria) this;
        }

        public Criteria andPlanetypeGreaterThanOrEqualTo(String value) {
            addCriterion("planetype >=", value, "planetype");
            return (Criteria) this;
        }

        public Criteria andPlanetypeLessThan(String value) {
            addCriterion("planetype <", value, "planetype");
            return (Criteria) this;
        }

        public Criteria andPlanetypeLessThanOrEqualTo(String value) {
            addCriterion("planetype <=", value, "planetype");
            return (Criteria) this;
        }

        public Criteria andPlanetypeLike(String value) {
            addCriterion("planetype like", value, "planetype");
            return (Criteria) this;
        }

        public Criteria andPlanetypeNotLike(String value) {
            addCriterion("planetype not like", value, "planetype");
            return (Criteria) this;
        }

        public Criteria andPlanetypeIn(List<String> values) {
            addCriterion("planetype in", values, "planetype");
            return (Criteria) this;
        }

        public Criteria andPlanetypeNotIn(List<String> values) {
            addCriterion("planetype not in", values, "planetype");
            return (Criteria) this;
        }

        public Criteria andPlanetypeBetween(String value1, String value2) {
            addCriterion("planetype between", value1, value2, "planetype");
            return (Criteria) this;
        }

        public Criteria andPlanetypeNotBetween(String value1, String value2) {
            addCriterion("planetype not between", value1, value2, "planetype");
            return (Criteria) this;
        }

        public Criteria andPlanenumIsNull() {
            addCriterion("planenum is null");
            return (Criteria) this;
        }

        public Criteria andPlanenumIsNotNull() {
            addCriterion("planenum is not null");
            return (Criteria) this;
        }

        public Criteria andPlanenumEqualTo(Integer value) {
            addCriterion("planenum =", value, "planenum");
            return (Criteria) this;
        }

        public Criteria andPlanenumNotEqualTo(Integer value) {
            addCriterion("planenum <>", value, "planenum");
            return (Criteria) this;
        }

        public Criteria andPlanenumGreaterThan(Integer value) {
            addCriterion("planenum >", value, "planenum");
            return (Criteria) this;
        }

        public Criteria andPlanenumGreaterThanOrEqualTo(Integer value) {
            addCriterion("planenum >=", value, "planenum");
            return (Criteria) this;
        }

        public Criteria andPlanenumLessThan(Integer value) {
            addCriterion("planenum <", value, "planenum");
            return (Criteria) this;
        }

        public Criteria andPlanenumLessThanOrEqualTo(Integer value) {
            addCriterion("planenum <=", value, "planenum");
            return (Criteria) this;
        }

        public Criteria andPlanenumIn(List<Integer> values) {
            addCriterion("planenum in", values, "planenum");
            return (Criteria) this;
        }

        public Criteria andPlanenumNotIn(List<Integer> values) {
            addCriterion("planenum not in", values, "planenum");
            return (Criteria) this;
        }

        public Criteria andPlanenumBetween(Integer value1, Integer value2) {
            addCriterion("planenum between", value1, value2, "planenum");
            return (Criteria) this;
        }

        public Criteria andPlanenumNotBetween(Integer value1, Integer value2) {
            addCriterion("planenum not between", value1, value2, "planenum");
            return (Criteria) this;
        }

        public Criteria andFeeIsNull() {
            addCriterion("fee is null");
            return (Criteria) this;
        }

        public Criteria andFeeIsNotNull() {
            addCriterion("fee is not null");
            return (Criteria) this;
        }

        public Criteria andFeeEqualTo(Float value) {
            addCriterion("fee =", value, "fee");
            return (Criteria) this;
        }

        public Criteria andFeeNotEqualTo(Float value) {
            addCriterion("fee <>", value, "fee");
            return (Criteria) this;
        }

        public Criteria andFeeGreaterThan(Float value) {
            addCriterion("fee >", value, "fee");
            return (Criteria) this;
        }

        public Criteria andFeeGreaterThanOrEqualTo(Float value) {
            addCriterion("fee >=", value, "fee");
            return (Criteria) this;
        }

        public Criteria andFeeLessThan(Float value) {
            addCriterion("fee <", value, "fee");
            return (Criteria) this;
        }

        public Criteria andFeeLessThanOrEqualTo(Float value) {
            addCriterion("fee <=", value, "fee");
            return (Criteria) this;
        }

        public Criteria andFeeIn(List<Float> values) {
            addCriterion("fee in", values, "fee");
            return (Criteria) this;
        }

        public Criteria andFeeNotIn(List<Float> values) {
            addCriterion("fee not in", values, "fee");
            return (Criteria) this;
        }

        public Criteria andFeeBetween(Float value1, Float value2) {
            addCriterion("fee between", value1, value2, "fee");
            return (Criteria) this;
        }

        public Criteria andFeeNotBetween(Float value1, Float value2) {
            addCriterion("fee not between", value1, value2, "fee");
            return (Criteria) this;
        }

        public Criteria andEnddateIsNull() {
            addCriterion("enddate is null");
            return (Criteria) this;
        }

        public Criteria andEnddateIsNotNull() {
            addCriterion("enddate is not null");
            return (Criteria) this;
        }

        public Criteria andEnddateEqualTo(Date value) {
            addCriterion("enddate =", value, "enddate");
            return (Criteria) this;
        }

        public Criteria andEnddateNotEqualTo(Date value) {
            addCriterion("enddate <>", value, "enddate");
            return (Criteria) this;
        }

        public Criteria andEnddateGreaterThan(Date value) {
            addCriterion("enddate >", value, "enddate");
            return (Criteria) this;
        }

        public Criteria andEnddateGreaterThanOrEqualTo(Date value) {
            addCriterion("enddate >=", value, "enddate");
            return (Criteria) this;
        }

        public Criteria andEnddateLessThan(Date value) {
            addCriterion("enddate <", value, "enddate");
            return (Criteria) this;
        }

        public Criteria andEnddateLessThanOrEqualTo(Date value) {
            addCriterion("enddate <=", value, "enddate");
            return (Criteria) this;
        }

        public Criteria andEnddateIn(List<Date> values) {
            addCriterion("enddate in", values, "enddate");
            return (Criteria) this;
        }

        public Criteria andEnddateNotIn(List<Date> values) {
            addCriterion("enddate not in", values, "enddate");
            return (Criteria) this;
        }

        public Criteria andEnddateBetween(Date value1, Date value2) {
            addCriterion("enddate between", value1, value2, "enddate");
            return (Criteria) this;
        }

        public Criteria andEnddateNotBetween(Date value1, Date value2) {
            addCriterion("enddate not between", value1, value2, "enddate");
            return (Criteria) this;
        }

        public Criteria andIscxIsNull() {
            addCriterion("iscx is null");
            return (Criteria) this;
        }

        public Criteria andIscxIsNotNull() {
            addCriterion("iscx is not null");
            return (Criteria) this;
        }

        public Criteria andIscxEqualTo(String value) {
            addCriterion("iscx =", value, "iscx");
            return (Criteria) this;
        }

        public Criteria andIscxNotEqualTo(String value) {
            addCriterion("iscx <>", value, "iscx");
            return (Criteria) this;
        }

        public Criteria andIscxGreaterThan(String value) {
            addCriterion("iscx >", value, "iscx");
            return (Criteria) this;
        }

        public Criteria andIscxGreaterThanOrEqualTo(String value) {
            addCriterion("iscx >=", value, "iscx");
            return (Criteria) this;
        }

        public Criteria andIscxLessThan(String value) {
            addCriterion("iscx <", value, "iscx");
            return (Criteria) this;
        }

        public Criteria andIscxLessThanOrEqualTo(String value) {
            addCriterion("iscx <=", value, "iscx");
            return (Criteria) this;
        }

        public Criteria andIscxLike(String value) {
            addCriterion("iscx like", value, "iscx");
            return (Criteria) this;
        }

        public Criteria andIscxNotLike(String value) {
            addCriterion("iscx not like", value, "iscx");
            return (Criteria) this;
        }

        public Criteria andIscxIn(List<String> values) {
            addCriterion("iscx in", values, "iscx");
            return (Criteria) this;
        }

        public Criteria andIscxNotIn(List<String> values) {
            addCriterion("iscx not in", values, "iscx");
            return (Criteria) this;
        }

        public Criteria andIscxBetween(String value1, String value2) {
            addCriterion("iscx between", value1, value2, "iscx");
            return (Criteria) this;
        }

        public Criteria andIscxNotBetween(String value1, String value2) {
            addCriterion("iscx not between", value1, value2, "iscx");
            return (Criteria) this;
        }

        public Criteria andIsydgjIsNull() {
            addCriterion("isydgj is null");
            return (Criteria) this;
        }

        public Criteria andIsydgjIsNotNull() {
            addCriterion("isydgj is not null");
            return (Criteria) this;
        }

        public Criteria andIsydgjEqualTo(String value) {
            addCriterion("isydgj =", value, "isydgj");
            return (Criteria) this;
        }

        public Criteria andIsydgjNotEqualTo(String value) {
            addCriterion("isydgj <>", value, "isydgj");
            return (Criteria) this;
        }

        public Criteria andIsydgjGreaterThan(String value) {
            addCriterion("isydgj >", value, "isydgj");
            return (Criteria) this;
        }

        public Criteria andIsydgjGreaterThanOrEqualTo(String value) {
            addCriterion("isydgj >=", value, "isydgj");
            return (Criteria) this;
        }

        public Criteria andIsydgjLessThan(String value) {
            addCriterion("isydgj <", value, "isydgj");
            return (Criteria) this;
        }

        public Criteria andIsydgjLessThanOrEqualTo(String value) {
            addCriterion("isydgj <=", value, "isydgj");
            return (Criteria) this;
        }

        public Criteria andIsydgjLike(String value) {
            addCriterion("isydgj like", value, "isydgj");
            return (Criteria) this;
        }

        public Criteria andIsydgjNotLike(String value) {
            addCriterion("isydgj not like", value, "isydgj");
            return (Criteria) this;
        }

        public Criteria andIsydgjIn(List<String> values) {
            addCriterion("isydgj in", values, "isydgj");
            return (Criteria) this;
        }

        public Criteria andIsydgjNotIn(List<String> values) {
            addCriterion("isydgj not in", values, "isydgj");
            return (Criteria) this;
        }

        public Criteria andIsydgjBetween(String value1, String value2) {
            addCriterion("isydgj between", value1, value2, "isydgj");
            return (Criteria) this;
        }

        public Criteria andIsydgjNotBetween(String value1, String value2) {
            addCriterion("isydgj not between", value1, value2, "isydgj");
            return (Criteria) this;
        }

        public Criteria andIsyqjkIsNull() {
            addCriterion("isyqjk is null");
            return (Criteria) this;
        }

        public Criteria andIsyqjkIsNotNull() {
            addCriterion("isyqjk is not null");
            return (Criteria) this;
        }

        public Criteria andIsyqjkEqualTo(String value) {
            addCriterion("isyqjk =", value, "isyqjk");
            return (Criteria) this;
        }

        public Criteria andIsyqjkNotEqualTo(String value) {
            addCriterion("isyqjk <>", value, "isyqjk");
            return (Criteria) this;
        }

        public Criteria andIsyqjkGreaterThan(String value) {
            addCriterion("isyqjk >", value, "isyqjk");
            return (Criteria) this;
        }

        public Criteria andIsyqjkGreaterThanOrEqualTo(String value) {
            addCriterion("isyqjk >=", value, "isyqjk");
            return (Criteria) this;
        }

        public Criteria andIsyqjkLessThan(String value) {
            addCriterion("isyqjk <", value, "isyqjk");
            return (Criteria) this;
        }

        public Criteria andIsyqjkLessThanOrEqualTo(String value) {
            addCriterion("isyqjk <=", value, "isyqjk");
            return (Criteria) this;
        }

        public Criteria andIsyqjkLike(String value) {
            addCriterion("isyqjk like", value, "isyqjk");
            return (Criteria) this;
        }

        public Criteria andIsyqjkNotLike(String value) {
            addCriterion("isyqjk not like", value, "isyqjk");
            return (Criteria) this;
        }

        public Criteria andIsyqjkIn(List<String> values) {
            addCriterion("isyqjk in", values, "isyqjk");
            return (Criteria) this;
        }

        public Criteria andIsyqjkNotIn(List<String> values) {
            addCriterion("isyqjk not in", values, "isyqjk");
            return (Criteria) this;
        }

        public Criteria andIsyqjkBetween(String value1, String value2) {
            addCriterion("isyqjk between", value1, value2, "isyqjk");
            return (Criteria) this;
        }

        public Criteria andIsyqjkNotBetween(String value1, String value2) {
            addCriterion("isyqjk not between", value1, value2, "isyqjk");
            return (Criteria) this;
        }

        public Criteria andIsyzjIsNull() {
            addCriterion("isyzj is null");
            return (Criteria) this;
        }

        public Criteria andIsyzjIsNotNull() {
            addCriterion("isyzj is not null");
            return (Criteria) this;
        }

        public Criteria andIsyzjEqualTo(String value) {
            addCriterion("isyzj =", value, "isyzj");
            return (Criteria) this;
        }

        public Criteria andIsyzjNotEqualTo(String value) {
            addCriterion("isyzj <>", value, "isyzj");
            return (Criteria) this;
        }

        public Criteria andIsyzjGreaterThan(String value) {
            addCriterion("isyzj >", value, "isyzj");
            return (Criteria) this;
        }

        public Criteria andIsyzjGreaterThanOrEqualTo(String value) {
            addCriterion("isyzj >=", value, "isyzj");
            return (Criteria) this;
        }

        public Criteria andIsyzjLessThan(String value) {
            addCriterion("isyzj <", value, "isyzj");
            return (Criteria) this;
        }

        public Criteria andIsyzjLessThanOrEqualTo(String value) {
            addCriterion("isyzj <=", value, "isyzj");
            return (Criteria) this;
        }

        public Criteria andIsyzjLike(String value) {
            addCriterion("isyzj like", value, "isyzj");
            return (Criteria) this;
        }

        public Criteria andIsyzjNotLike(String value) {
            addCriterion("isyzj not like", value, "isyzj");
            return (Criteria) this;
        }

        public Criteria andIsyzjIn(List<String> values) {
            addCriterion("isyzj in", values, "isyzj");
            return (Criteria) this;
        }

        public Criteria andIsyzjNotIn(List<String> values) {
            addCriterion("isyzj not in", values, "isyzj");
            return (Criteria) this;
        }

        public Criteria andIsyzjBetween(String value1, String value2) {
            addCriterion("isyzj between", value1, value2, "isyzj");
            return (Criteria) this;
        }

        public Criteria andIsyzjNotBetween(String value1, String value2) {
            addCriterion("isyzj not between", value1, value2, "isyzj");
            return (Criteria) this;
        }

        public Criteria andIsqyjzIsNull() {
            addCriterion("isqyjz is null");
            return (Criteria) this;
        }

        public Criteria andIsqyjzIsNotNull() {
            addCriterion("isqyjz is not null");
            return (Criteria) this;
        }

        public Criteria andIsqyjzEqualTo(String value) {
            addCriterion("isqyjz =", value, "isqyjz");
            return (Criteria) this;
        }

        public Criteria andIsqyjzNotEqualTo(String value) {
            addCriterion("isqyjz <>", value, "isqyjz");
            return (Criteria) this;
        }

        public Criteria andIsqyjzGreaterThan(String value) {
            addCriterion("isqyjz >", value, "isqyjz");
            return (Criteria) this;
        }

        public Criteria andIsqyjzGreaterThanOrEqualTo(String value) {
            addCriterion("isqyjz >=", value, "isqyjz");
            return (Criteria) this;
        }

        public Criteria andIsqyjzLessThan(String value) {
            addCriterion("isqyjz <", value, "isqyjz");
            return (Criteria) this;
        }

        public Criteria andIsqyjzLessThanOrEqualTo(String value) {
            addCriterion("isqyjz <=", value, "isqyjz");
            return (Criteria) this;
        }

        public Criteria andIsqyjzLike(String value) {
            addCriterion("isqyjz like", value, "isqyjz");
            return (Criteria) this;
        }

        public Criteria andIsqyjzNotLike(String value) {
            addCriterion("isqyjz not like", value, "isqyjz");
            return (Criteria) this;
        }

        public Criteria andIsqyjzIn(List<String> values) {
            addCriterion("isqyjz in", values, "isqyjz");
            return (Criteria) this;
        }

        public Criteria andIsqyjzNotIn(List<String> values) {
            addCriterion("isqyjz not in", values, "isqyjz");
            return (Criteria) this;
        }

        public Criteria andIsqyjzBetween(String value1, String value2) {
            addCriterion("isqyjz between", value1, value2, "isqyjz");
            return (Criteria) this;
        }

        public Criteria andIsqyjzNotBetween(String value1, String value2) {
            addCriterion("isqyjz not between", value1, value2, "isqyjz");
            return (Criteria) this;
        }

        public Criteria andIsxtbgIsNull() {
            addCriterion("isxtbg is null");
            return (Criteria) this;
        }

        public Criteria andIsxtbgIsNotNull() {
            addCriterion("isxtbg is not null");
            return (Criteria) this;
        }

        public Criteria andIsxtbgEqualTo(String value) {
            addCriterion("isxtbg =", value, "isxtbg");
            return (Criteria) this;
        }

        public Criteria andIsxtbgNotEqualTo(String value) {
            addCriterion("isxtbg <>", value, "isxtbg");
            return (Criteria) this;
        }

        public Criteria andIsxtbgGreaterThan(String value) {
            addCriterion("isxtbg >", value, "isxtbg");
            return (Criteria) this;
        }

        public Criteria andIsxtbgGreaterThanOrEqualTo(String value) {
            addCriterion("isxtbg >=", value, "isxtbg");
            return (Criteria) this;
        }

        public Criteria andIsxtbgLessThan(String value) {
            addCriterion("isxtbg <", value, "isxtbg");
            return (Criteria) this;
        }

        public Criteria andIsxtbgLessThanOrEqualTo(String value) {
            addCriterion("isxtbg <=", value, "isxtbg");
            return (Criteria) this;
        }

        public Criteria andIsxtbgLike(String value) {
            addCriterion("isxtbg like", value, "isxtbg");
            return (Criteria) this;
        }

        public Criteria andIsxtbgNotLike(String value) {
            addCriterion("isxtbg not like", value, "isxtbg");
            return (Criteria) this;
        }

        public Criteria andIsxtbgIn(List<String> values) {
            addCriterion("isxtbg in", values, "isxtbg");
            return (Criteria) this;
        }

        public Criteria andIsxtbgNotIn(List<String> values) {
            addCriterion("isxtbg not in", values, "isxtbg");
            return (Criteria) this;
        }

        public Criteria andIsxtbgBetween(String value1, String value2) {
            addCriterion("isxtbg between", value1, value2, "isxtbg");
            return (Criteria) this;
        }

        public Criteria andIsxtbgNotBetween(String value1, String value2) {
            addCriterion("isxtbg not between", value1, value2, "isxtbg");
            return (Criteria) this;
        }

        public Criteria andIsjttxlIsNull() {
            addCriterion("isjttxl is null");
            return (Criteria) this;
        }

        public Criteria andIsjttxlIsNotNull() {
            addCriterion("isjttxl is not null");
            return (Criteria) this;
        }

        public Criteria andIsjttxlEqualTo(String value) {
            addCriterion("isjttxl =", value, "isjttxl");
            return (Criteria) this;
        }

        public Criteria andIsjttxlNotEqualTo(String value) {
            addCriterion("isjttxl <>", value, "isjttxl");
            return (Criteria) this;
        }

        public Criteria andIsjttxlGreaterThan(String value) {
            addCriterion("isjttxl >", value, "isjttxl");
            return (Criteria) this;
        }

        public Criteria andIsjttxlGreaterThanOrEqualTo(String value) {
            addCriterion("isjttxl >=", value, "isjttxl");
            return (Criteria) this;
        }

        public Criteria andIsjttxlLessThan(String value) {
            addCriterion("isjttxl <", value, "isjttxl");
            return (Criteria) this;
        }

        public Criteria andIsjttxlLessThanOrEqualTo(String value) {
            addCriterion("isjttxl <=", value, "isjttxl");
            return (Criteria) this;
        }

        public Criteria andIsjttxlLike(String value) {
            addCriterion("isjttxl like", value, "isjttxl");
            return (Criteria) this;
        }

        public Criteria andIsjttxlNotLike(String value) {
            addCriterion("isjttxl not like", value, "isjttxl");
            return (Criteria) this;
        }

        public Criteria andIsjttxlIn(List<String> values) {
            addCriterion("isjttxl in", values, "isjttxl");
            return (Criteria) this;
        }

        public Criteria andIsjttxlNotIn(List<String> values) {
            addCriterion("isjttxl not in", values, "isjttxl");
            return (Criteria) this;
        }

        public Criteria andIsjttxlBetween(String value1, String value2) {
            addCriterion("isjttxl between", value1, value2, "isjttxl");
            return (Criteria) this;
        }

        public Criteria andIsjttxlNotBetween(String value1, String value2) {
            addCriterion("isjttxl not between", value1, value2, "isjttxl");
            return (Criteria) this;
        }

        public Criteria andIswqtIsNull() {
            addCriterion("iswqt is null");
            return (Criteria) this;
        }

        public Criteria andIswqtIsNotNull() {
            addCriterion("iswqt is not null");
            return (Criteria) this;
        }

        public Criteria andIswqtEqualTo(String value) {
            addCriterion("iswqt =", value, "iswqt");
            return (Criteria) this;
        }

        public Criteria andIswqtNotEqualTo(String value) {
            addCriterion("iswqt <>", value, "iswqt");
            return (Criteria) this;
        }

        public Criteria andIswqtGreaterThan(String value) {
            addCriterion("iswqt >", value, "iswqt");
            return (Criteria) this;
        }

        public Criteria andIswqtGreaterThanOrEqualTo(String value) {
            addCriterion("iswqt >=", value, "iswqt");
            return (Criteria) this;
        }

        public Criteria andIswqtLessThan(String value) {
            addCriterion("iswqt <", value, "iswqt");
            return (Criteria) this;
        }

        public Criteria andIswqtLessThanOrEqualTo(String value) {
            addCriterion("iswqt <=", value, "iswqt");
            return (Criteria) this;
        }

        public Criteria andIswqtLike(String value) {
            addCriterion("iswqt like", value, "iswqt");
            return (Criteria) this;
        }

        public Criteria andIswqtNotLike(String value) {
            addCriterion("iswqt not like", value, "iswqt");
            return (Criteria) this;
        }

        public Criteria andIswqtIn(List<String> values) {
            addCriterion("iswqt in", values, "iswqt");
            return (Criteria) this;
        }

        public Criteria andIswqtNotIn(List<String> values) {
            addCriterion("iswqt not in", values, "iswqt");
            return (Criteria) this;
        }

        public Criteria andIswqtBetween(String value1, String value2) {
            addCriterion("iswqt between", value1, value2, "iswqt");
            return (Criteria) this;
        }

        public Criteria andIswqtNotBetween(String value1, String value2) {
            addCriterion("iswqt not between", value1, value2, "iswqt");
            return (Criteria) this;
        }

        public Criteria andIsmdmIsNull() {
            addCriterion("ismdm is null");
            return (Criteria) this;
        }

        public Criteria andIsmdmIsNotNull() {
            addCriterion("ismdm is not null");
            return (Criteria) this;
        }

        public Criteria andIsmdmEqualTo(String value) {
            addCriterion("ismdm =", value, "ismdm");
            return (Criteria) this;
        }

        public Criteria andIsmdmNotEqualTo(String value) {
            addCriterion("ismdm <>", value, "ismdm");
            return (Criteria) this;
        }

        public Criteria andIsmdmGreaterThan(String value) {
            addCriterion("ismdm >", value, "ismdm");
            return (Criteria) this;
        }

        public Criteria andIsmdmGreaterThanOrEqualTo(String value) {
            addCriterion("ismdm >=", value, "ismdm");
            return (Criteria) this;
        }

        public Criteria andIsmdmLessThan(String value) {
            addCriterion("ismdm <", value, "ismdm");
            return (Criteria) this;
        }

        public Criteria andIsmdmLessThanOrEqualTo(String value) {
            addCriterion("ismdm <=", value, "ismdm");
            return (Criteria) this;
        }

        public Criteria andIsmdmLike(String value) {
            addCriterion("ismdm like", value, "ismdm");
            return (Criteria) this;
        }

        public Criteria andIsmdmNotLike(String value) {
            addCriterion("ismdm not like", value, "ismdm");
            return (Criteria) this;
        }

        public Criteria andIsmdmIn(List<String> values) {
            addCriterion("ismdm in", values, "ismdm");
            return (Criteria) this;
        }

        public Criteria andIsmdmNotIn(List<String> values) {
            addCriterion("ismdm not in", values, "ismdm");
            return (Criteria) this;
        }

        public Criteria andIsmdmBetween(String value1, String value2) {
            addCriterion("ismdm between", value1, value2, "ismdm");
            return (Criteria) this;
        }

        public Criteria andIsmdmNotBetween(String value1, String value2) {
            addCriterion("ismdm not between", value1, value2, "ismdm");
            return (Criteria) this;
        }

        public Criteria andOtherIsNull() {
            addCriterion("other is null");
            return (Criteria) this;
        }

        public Criteria andOtherIsNotNull() {
            addCriterion("other is not null");
            return (Criteria) this;
        }

        public Criteria andOtherEqualTo(String value) {
            addCriterion("other =", value, "other");
            return (Criteria) this;
        }

        public Criteria andOtherNotEqualTo(String value) {
            addCriterion("other <>", value, "other");
            return (Criteria) this;
        }

        public Criteria andOtherGreaterThan(String value) {
            addCriterion("other >", value, "other");
            return (Criteria) this;
        }

        public Criteria andOtherGreaterThanOrEqualTo(String value) {
            addCriterion("other >=", value, "other");
            return (Criteria) this;
        }

        public Criteria andOtherLessThan(String value) {
            addCriterion("other <", value, "other");
            return (Criteria) this;
        }

        public Criteria andOtherLessThanOrEqualTo(String value) {
            addCriterion("other <=", value, "other");
            return (Criteria) this;
        }

        public Criteria andOtherLike(String value) {
            addCriterion("other like", value, "other");
            return (Criteria) this;
        }

        public Criteria andOtherNotLike(String value) {
            addCriterion("other not like", value, "other");
            return (Criteria) this;
        }

        public Criteria andOtherIn(List<String> values) {
            addCriterion("other in", values, "other");
            return (Criteria) this;
        }

        public Criteria andOtherNotIn(List<String> values) {
            addCriterion("other not in", values, "other");
            return (Criteria) this;
        }

        public Criteria andOtherBetween(String value1, String value2) {
            addCriterion("other between", value1, value2, "other");
            return (Criteria) this;
        }

        public Criteria andOtherNotBetween(String value1, String value2) {
            addCriterion("other not between", value1, value2, "other");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}