package com.gsccs.cmcc.data.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.gsccs.plat.bass.BaseExample;

public class TradeVspExample extends BaseExample{
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TradeVspExample() {
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

        public Criteria andMchNoIsNull() {
            addCriterion("mchno is null");
            return (Criteria) this;
        }

        public Criteria andMchNoIsNotNull() {
            addCriterion("mchno is not null");
            return (Criteria) this;
        }

        public Criteria andMchNoEqualTo(String value) {
            addCriterion("mchno =", value, "mchno");
            return (Criteria) this;
        }

        public Criteria andMchNoNotEqualTo(String value) {
            addCriterion("mchno <>", value, "mchno");
            return (Criteria) this;
        }


        public Criteria andMchNoIn(List<String> values) {
            addCriterion("mchno in", values, "mchno");
            return (Criteria) this;
        }

        public Criteria andMchNoNotIn(List<String> values) {
            addCriterion("mchno not in", values, "mchno");
            return (Criteria) this;
        }

        public Criteria andHaslineIsNull() {
            addCriterion("hasline is null");
            return (Criteria) this;
        }

        public Criteria andHaslineIsNotNull() {
            addCriterion("hasline is not null");
            return (Criteria) this;
        }

        public Criteria andHaslineEqualTo(String value) {
            addCriterion("hasline =", value, "hasline");
            return (Criteria) this;
        }

        public Criteria andHaslineNotEqualTo(String value) {
            addCriterion("hasline <>", value, "hasline");
            return (Criteria) this;
        }

        public Criteria andHaslineGreaterThan(String value) {
            addCriterion("hasline >", value, "hasline");
            return (Criteria) this;
        }

        public Criteria andHaslineGreaterThanOrEqualTo(String value) {
            addCriterion("hasline >=", value, "hasline");
            return (Criteria) this;
        }

        public Criteria andHaslineLessThan(String value) {
            addCriterion("hasline <", value, "hasline");
            return (Criteria) this;
        }

        public Criteria andHaslineLessThanOrEqualTo(String value) {
            addCriterion("hasline <=", value, "hasline");
            return (Criteria) this;
        }

        public Criteria andHaslineLike(String value) {
            addCriterion("hasline like", value, "hasline");
            return (Criteria) this;
        }

        public Criteria andHaslineNotLike(String value) {
            addCriterion("hasline not like", value, "hasline");
            return (Criteria) this;
        }

        public Criteria andHaslineIn(List<String> values) {
            addCriterion("hasline in", values, "hasline");
            return (Criteria) this;
        }

        public Criteria andHaslineNotIn(List<String> values) {
            addCriterion("hasline not in", values, "hasline");
            return (Criteria) this;
        }

        public Criteria andHaslineBetween(String value1, String value2) {
            addCriterion("hasline between", value1, value2, "hasline");
            return (Criteria) this;
        }

        public Criteria andHaslineNotBetween(String value1, String value2) {
            addCriterion("hasline not between", value1, value2, "hasline");
            return (Criteria) this;
        }

        public Criteria andIsptypeIsNull() {
            addCriterion("isptype is null");
            return (Criteria) this;
        }

        public Criteria andIsptypeIsNotNull() {
            addCriterion("isptype is not null");
            return (Criteria) this;
        }

        public Criteria andIsptypeEqualTo(String value) {
            addCriterion("isptype =", value, "isptype");
            return (Criteria) this;
        }

        public Criteria andIsptypeNotEqualTo(String value) {
            addCriterion("isptype <>", value, "isptype");
            return (Criteria) this;
        }

        

        public Criteria andIsptypeLike(String value) {
            addCriterion("isptype like", value, "isptype");
            return (Criteria) this;
        }

        public Criteria andIsptypeNotLike(String value) {
            addCriterion("isptype not like", value, "isptype");
            return (Criteria) this;
        }

        public Criteria andIsptypeIn(List<String> values) {
            addCriterion("isptype in", values, "isptype");
            return (Criteria) this;
        }

        public Criteria andIsptypeNotIn(List<String> values) {
            addCriterion("isptype not in", values, "isptype");
            return (Criteria) this;
        }

      
        public Criteria andLinetypeIsNull() {
            addCriterion("linetype is null");
            return (Criteria) this;
        }

        public Criteria andLinetypeIsNotNull() {
            addCriterion("linetype is not null");
            return (Criteria) this;
        }

        public Criteria andLinetypeEqualTo(String value) {
            addCriterion("linetype =", value, "linetype");
            return (Criteria) this;
        }

        public Criteria andLinetypeNotEqualTo(String value) {
            addCriterion("linetype <>", value, "linetype");
            return (Criteria) this;
        }

       

        public Criteria andLinetypeLike(String value) {
            addCriterion("linetype like", value, "linetype");
            return (Criteria) this;
        }

        public Criteria andLinetypeNotLike(String value) {
            addCriterion("linetype not like", value, "linetype");
            return (Criteria) this;
        }

        public Criteria andLinetypeIn(List<String> values) {
            addCriterion("linetype in", values, "linetype");
            return (Criteria) this;
        }

        public Criteria andLinetypeNotIn(List<String> values) {
            addCriterion("linetype not in", values, "linetype");
            return (Criteria) this;
        }

        public Criteria andBitsizeIsNull() {
            addCriterion("bitsize is null");
            return (Criteria) this;
        }

        public Criteria andBitsizeIsNotNull() {
            addCriterion("bitsize is not null");
            return (Criteria) this;
        }

        public Criteria andBitsizeEqualTo(Integer value) {
            addCriterion("bitsize =", value, "bitsize");
            return (Criteria) this;
        }

        public Criteria andBitsizeNotEqualTo(Integer value) {
            addCriterion("bitsize <>", value, "bitsize");
            return (Criteria) this;
        }

        public Criteria andBitsizeGreaterThan(Integer value) {
            addCriterion("bitsize >", value, "bitsize");
            return (Criteria) this;
        }

        public Criteria andBitsizeGreaterThanOrEqualTo(Integer value) {
            addCriterion("bitsize >=", value, "bitsize");
            return (Criteria) this;
        }

        public Criteria andBitsizeLessThan(Integer value) {
            addCriterion("bitsize <", value, "bitsize");
            return (Criteria) this;
        }

        public Criteria andBitsizeLessThanOrEqualTo(Integer value) {
            addCriterion("bitsize <=", value, "bitsize");
            return (Criteria) this;
        }

        public Criteria andBitsizeIn(List<Integer> values) {
            addCriterion("bitsize in", values, "bitsize");
            return (Criteria) this;
        }

        public Criteria andBitsizeNotIn(List<Integer> values) {
            addCriterion("bitsize not in", values, "bitsize");
            return (Criteria) this;
        }


        public Criteria andFeemonthIsNull() {
            addCriterion("feemonth is null");
            return (Criteria) this;
        }

        public Criteria andFeemonthIsNotNull() {
            addCriterion("feemonth is not null");
            return (Criteria) this;
        }

        public Criteria andFeemonthEqualTo(String value) {
            addCriterion("feemonth =", value, "feemonth");
            return (Criteria) this;
        }

        public Criteria andFeemonthNotEqualTo(String value) {
            addCriterion("feemonth <>", value, "feemonth");
            return (Criteria) this;
        }

        
        public Criteria andFeemonthLike(String value) {
            addCriterion("feemonth like", value, "feemonth");
            return (Criteria) this;
        }

        public Criteria andFeemonthNotLike(String value) {
            addCriterion("feemonth not like", value, "feemonth");
            return (Criteria) this;
        }

        public Criteria andFeemonthIn(List<String> values) {
            addCriterion("feemonth in", values, "feemonth");
            return (Criteria) this;
        }

        public Criteria andFeemonthNotIn(List<String> values) {
            addCriterion("feemonth not in", values, "feemonth");
            return (Criteria) this;
        }

        public Criteria andFeemonthBetween(String value1, String value2) {
            addCriterion("feemonth between", value1, value2, "feemonth");
            return (Criteria) this;
        }

        public Criteria andFeemonthNotBetween(String value1, String value2) {
            addCriterion("feemonth not between", value1, value2, "feemonth");
            return (Criteria) this;
        }

        public Criteria andPaytypeIsNull() {
            addCriterion("paytype is null");
            return (Criteria) this;
        }

        public Criteria andPaytypeIsNotNull() {
            addCriterion("paytype is not null");
            return (Criteria) this;
        }

        public Criteria andPaytypeEqualTo(String value) {
            addCriterion("paytype =", value, "paytype");
            return (Criteria) this;
        }

        public Criteria andPaytypeNotEqualTo(String value) {
            addCriterion("paytype <>", value, "paytype");
            return (Criteria) this;
        }

        public Criteria andPaytypeGreaterThan(String value) {
            addCriterion("paytype >", value, "paytype");
            return (Criteria) this;
        }

        public Criteria andPaytypeGreaterThanOrEqualTo(String value) {
            addCriterion("paytype >=", value, "paytype");
            return (Criteria) this;
        }

        public Criteria andPaytypeLessThan(String value) {
            addCriterion("paytype <", value, "paytype");
            return (Criteria) this;
        }

        public Criteria andPaytypeLessThanOrEqualTo(String value) {
            addCriterion("paytype <=", value, "paytype");
            return (Criteria) this;
        }

        public Criteria andPaytypeLike(String value) {
            addCriterion("paytype like", value, "paytype");
            return (Criteria) this;
        }

        public Criteria andPaytypeNotLike(String value) {
            addCriterion("paytype not like", value, "paytype");
            return (Criteria) this;
        }

        public Criteria andPaytypeIn(List<String> values) {
            addCriterion("paytype in", values, "paytype");
            return (Criteria) this;
        }

        public Criteria andPaytypeNotIn(List<String> values) {
            addCriterion("paytype not in", values, "paytype");
            return (Criteria) this;
        }

     

        public Criteria andSigndateIsNull() {
            addCriterion("signdate is null");
            return (Criteria) this;
        }

        public Criteria andSigndateIsNotNull() {
            addCriterion("signdate is not null");
            return (Criteria) this;
        }

        public Criteria andSigndateEqualTo(Date value) {
            addCriterion("signdate =", value, "signdate");
            return (Criteria) this;
        }

        public Criteria andSigndateNotEqualTo(Date value) {
            addCriterion("signdate <>", value, "signdate");
            return (Criteria) this;
        }

        public Criteria andSigndateGreaterThan(Date value) {
            addCriterion("signdate >", value, "signdate");
            return (Criteria) this;
        }

        public Criteria andSigndateGreaterThanOrEqualTo(Date value) {
            addCriterion("signdate >=", value, "signdate");
            return (Criteria) this;
        }

        public Criteria andSigndateLessThan(Date value) {
            addCriterion("signdate <", value, "signdate");
            return (Criteria) this;
        }

        public Criteria andSigndateLessThanOrEqualTo(Date value) {
            addCriterion("signdate <=", value, "signdate");
            return (Criteria) this;
        }

        public Criteria andSigndateIn(List<Date> values) {
            addCriterion("signdate in", values, "signdate");
            return (Criteria) this;
        }

        public Criteria andSigndateNotIn(List<Date> values) {
            addCriterion("signdate not in", values, "signdate");
            return (Criteria) this;
        }

        public Criteria andSigndateBetween(Date value1, Date value2) {
            addCriterion("signdate between", value1, value2, "signdate");
            return (Criteria) this;
        }

        public Criteria andSigndateNotBetween(Date value1, Date value2) {
            addCriterion("signdate not between", value1, value2, "signdate");
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

        public Criteria andPaydateIsNull() {
            addCriterion("paydate is null");
            return (Criteria) this;
        }

        public Criteria andPaydateIsNotNull() {
            addCriterion("paydate is not null");
            return (Criteria) this;
        }

        public Criteria andPaydateEqualTo(Date value) {
            addCriterion("paydate =", value, "paydate");
            return (Criteria) this;
        }

        public Criteria andPaydateNotEqualTo(Date value) {
            addCriterion("paydate <>", value, "paydate");
            return (Criteria) this;
        }

        public Criteria andPaydateGreaterThan(Date value) {
            addCriterion("paydate >", value, "paydate");
            return (Criteria) this;
        }

        public Criteria andPaydateGreaterThanOrEqualTo(Date value) {
            addCriterion("paydate >=", value, "paydate");
            return (Criteria) this;
        }

        public Criteria andPaydateLessThan(Date value) {
            addCriterion("paydate <", value, "paydate");
            return (Criteria) this;
        }

        public Criteria andPaydateLessThanOrEqualTo(Date value) {
            addCriterion("paydate <=", value, "paydate");
            return (Criteria) this;
        }

        public Criteria andPaydateIn(List<Date> values) {
            addCriterion("paydate in", values, "paydate");
            return (Criteria) this;
        }

        public Criteria andPaydateNotIn(List<Date> values) {
            addCriterion("paydate not in", values, "paydate");
            return (Criteria) this;
        }

        public Criteria andPaydateBetween(Date value1, Date value2) {
            addCriterion("paydate between", value1, value2, "paydate");
            return (Criteria) this;
        }

        public Criteria andPaydateNotBetween(Date value1, Date value2) {
            addCriterion("paydate not between", value1, value2, "paydate");
            return (Criteria) this;
        }

        public Criteria andRemarkIsNull() {
            addCriterion("remark is null");
            return (Criteria) this;
        }

        public Criteria andRemarkIsNotNull() {
            addCriterion("remark is not null");
            return (Criteria) this;
        }

        public Criteria andRemarkEqualTo(String value) {
            addCriterion("remark =", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotEqualTo(String value) {
            addCriterion("remark <>", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkGreaterThan(String value) {
            addCriterion("remark >", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkGreaterThanOrEqualTo(String value) {
            addCriterion("remark >=", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLessThan(String value) {
            addCriterion("remark <", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLessThanOrEqualTo(String value) {
            addCriterion("remark <=", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLike(String value) {
            addCriterion("remark like", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotLike(String value) {
            addCriterion("remark not like", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkIn(List<String> values) {
            addCriterion("remark in", values, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotIn(List<String> values) {
            addCriterion("remark not in", values, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkBetween(String value1, String value2) {
            addCriterion("remark between", value1, value2, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotBetween(String value1, String value2) {
            addCriterion("remark not between", value1, value2, "remark");
            return (Criteria) this;
        }

        public Criteria andCustomerIsNull() {
            addCriterion("customer is null");
            return (Criteria) this;
        }

        public Criteria andCustomerIsNotNull() {
            addCriterion("customer is not null");
            return (Criteria) this;
        }

        public Criteria andCustomerEqualTo(String value) {
            addCriterion("customer =", value, "customer");
            return (Criteria) this;
        }

        public Criteria andCustomerNotEqualTo(String value) {
            addCriterion("customer <>", value, "customer");
            return (Criteria) this;
        }

        public Criteria andCustomerGreaterThan(String value) {
            addCriterion("customer >", value, "customer");
            return (Criteria) this;
        }

        public Criteria andCustomerGreaterThanOrEqualTo(String value) {
            addCriterion("customer >=", value, "customer");
            return (Criteria) this;
        }

        public Criteria andCustomerLessThan(String value) {
            addCriterion("customer <", value, "customer");
            return (Criteria) this;
        }

        public Criteria andCustomerLessThanOrEqualTo(String value) {
            addCriterion("customer <=", value, "customer");
            return (Criteria) this;
        }

        public Criteria andCustomerLike(String value) {
            addCriterion("customer like", value, "customer");
            return (Criteria) this;
        }

        public Criteria andCustomerNotLike(String value) {
            addCriterion("customer not like", value, "customer");
            return (Criteria) this;
        }

        public Criteria andCustomerIn(List<String> values) {
            addCriterion("customer in", values, "customer");
            return (Criteria) this;
        }

        public Criteria andCustomerNotIn(List<String> values) {
            addCriterion("customer not in", values, "customer");
            return (Criteria) this;
        }

        public Criteria andCustomerBetween(String value1, String value2) {
            addCriterion("customer between", value1, value2, "customer");
            return (Criteria) this;
        }

        public Criteria andCustomerNotBetween(String value1, String value2) {
            addCriterion("customer not between", value1, value2, "customer");
            return (Criteria) this;
        }

        public Criteria andYeartariffIsNull() {
            addCriterion("yeartariff is null");
            return (Criteria) this;
        }

        public Criteria andYeartariffIsNotNull() {
            addCriterion("yeartariff is not null");
            return (Criteria) this;
        }

        public Criteria andYeartariffEqualTo(String value) {
            addCriterion("yeartariff =", value, "yeartariff");
            return (Criteria) this;
        }

        public Criteria andYeartariffNotEqualTo(String value) {
            addCriterion("yeartariff <>", value, "yeartariff");
            return (Criteria) this;
        }

        public Criteria andYeartariffGreaterThan(String value) {
            addCriterion("yeartariff >", value, "yeartariff");
            return (Criteria) this;
        }

        public Criteria andYeartariffGreaterThanOrEqualTo(String value) {
            addCriterion("yeartariff >=", value, "yeartariff");
            return (Criteria) this;
        }

        public Criteria andYeartariffLessThan(String value) {
            addCriterion("yeartariff <", value, "yeartariff");
            return (Criteria) this;
        }

        public Criteria andYeartariffLessThanOrEqualTo(String value) {
            addCriterion("yeartariff <=", value, "yeartariff");
            return (Criteria) this;
        }

        public Criteria andYeartariffLike(String value) {
            addCriterion("yeartariff like", value, "yeartariff");
            return (Criteria) this;
        }

        public Criteria andYeartariffNotLike(String value) {
            addCriterion("yeartariff not like", value, "yeartariff");
            return (Criteria) this;
        }

        public Criteria andYeartariffIn(List<String> values) {
            addCriterion("yeartariff in", values, "yeartariff");
            return (Criteria) this;
        }

        public Criteria andYeartariffNotIn(List<String> values) {
            addCriterion("yeartariff not in", values, "yeartariff");
            return (Criteria) this;
        }

        public Criteria andYeartariffBetween(String value1, String value2) {
            addCriterion("yeartariff between", value1, value2, "yeartariff");
            return (Criteria) this;
        }

        public Criteria andYeartariffNotBetween(String value1, String value2) {
            addCriterion("yeartariff not between", value1, value2, "yeartariff");
            return (Criteria) this;
        }

        public Criteria andPactnumberIsNull() {
            addCriterion("pactnumber is null");
            return (Criteria) this;
        }

        public Criteria andPactnumberIsNotNull() {
            addCriterion("pactnumber is not null");
            return (Criteria) this;
        }

        public Criteria andPactnumberEqualTo(String value) {
            addCriterion("pactnumber =", value, "pactnumber");
            return (Criteria) this;
        }

        public Criteria andPactnumberNotEqualTo(String value) {
            addCriterion("pactnumber <>", value, "pactnumber");
            return (Criteria) this;
        }

        public Criteria andPactnumberGreaterThan(String value) {
            addCriterion("pactnumber >", value, "pactnumber");
            return (Criteria) this;
        }

        public Criteria andPactnumberGreaterThanOrEqualTo(String value) {
            addCriterion("pactnumber >=", value, "pactnumber");
            return (Criteria) this;
        }

        public Criteria andPactnumberLessThan(String value) {
            addCriterion("pactnumber <", value, "pactnumber");
            return (Criteria) this;
        }

        public Criteria andPactnumberLessThanOrEqualTo(String value) {
            addCriterion("pactnumber <=", value, "pactnumber");
            return (Criteria) this;
        }

        public Criteria andPactnumberLike(String value) {
            addCriterion("pactnumber like", value, "pactnumber");
            return (Criteria) this;
        }

        public Criteria andPactnumberNotLike(String value) {
            addCriterion("pactnumber not like", value, "pactnumber");
            return (Criteria) this;
        }

        public Criteria andPactnumberIn(List<String> values) {
            addCriterion("pactnumber in", values, "pactnumber");
            return (Criteria) this;
        }

        public Criteria andPactnumberNotIn(List<String> values) {
            addCriterion("pactnumber not in", values, "pactnumber");
            return (Criteria) this;
        }

        public Criteria andPactnumberBetween(String value1, String value2) {
            addCriterion("pactnumber between", value1, value2, "pactnumber");
            return (Criteria) this;
        }

        public Criteria andPactnumberNotBetween(String value1, String value2) {
            addCriterion("pactnumber not between", value1, value2, "pactnumber");
            return (Criteria) this;
        }

        public Criteria andPactnameIsNull() {
            addCriterion("pactname is null");
            return (Criteria) this;
        }

        public Criteria andPactnameIsNotNull() {
            addCriterion("pactname is not null");
            return (Criteria) this;
        }

        public Criteria andPactnameEqualTo(String value) {
            addCriterion("pactname =", value, "pactname");
            return (Criteria) this;
        }

        public Criteria andPactnameNotEqualTo(String value) {
            addCriterion("pactname <>", value, "pactname");
            return (Criteria) this;
        }

        public Criteria andPactnameGreaterThan(String value) {
            addCriterion("pactname >", value, "pactname");
            return (Criteria) this;
        }

        public Criteria andPactnameGreaterThanOrEqualTo(String value) {
            addCriterion("pactname >=", value, "pactname");
            return (Criteria) this;
        }

        public Criteria andPactnameLessThan(String value) {
            addCriterion("pactname <", value, "pactname");
            return (Criteria) this;
        }

        public Criteria andPactnameLessThanOrEqualTo(String value) {
            addCriterion("pactname <=", value, "pactname");
            return (Criteria) this;
        }

        public Criteria andPactnameLike(String value) {
            addCriterion("pactname like", value, "pactname");
            return (Criteria) this;
        }

        public Criteria andPactnameNotLike(String value) {
            addCriterion("pactname not like", value, "pactname");
            return (Criteria) this;
        }

        public Criteria andPactnameIn(List<String> values) {
            addCriterion("pactname in", values, "pactname");
            return (Criteria) this;
        }

        public Criteria andPactnameNotIn(List<String> values) {
            addCriterion("pactname not in", values, "pactname");
            return (Criteria) this;
        }

        public Criteria andPactnameBetween(String value1, String value2) {
            addCriterion("pactname between", value1, value2, "pactname");
            return (Criteria) this;
        }

        public Criteria andPactnameNotBetween(String value1, String value2) {
            addCriterion("pactname not between", value1, value2, "pactname");
            return (Criteria) this;
        }

        public Criteria andPactvalidityIsNull() {
            addCriterion("pactvalidity is null");
            return (Criteria) this;
        }

        public Criteria andPactvalidityIsNotNull() {
            addCriterion("pactvalidity is not null");
            return (Criteria) this;
        }

        public Criteria andPactvalidityEqualTo(String value) {
            addCriterion("pactvalidity =", value, "pactvalidity");
            return (Criteria) this;
        }

        public Criteria andPactvalidityNotEqualTo(String value) {
            addCriterion("pactvalidity <>", value, "pactvalidity");
            return (Criteria) this;
        }

        public Criteria andPactvalidityGreaterThan(String value) {
            addCriterion("pactvalidity >", value, "pactvalidity");
            return (Criteria) this;
        }

        public Criteria andPactvalidityGreaterThanOrEqualTo(String value) {
            addCriterion("pactvalidity >=", value, "pactvalidity");
            return (Criteria) this;
        }

        public Criteria andPactvalidityLessThan(String value) {
            addCriterion("pactvalidity <", value, "pactvalidity");
            return (Criteria) this;
        }

        public Criteria andPactvalidityLessThanOrEqualTo(String value) {
            addCriterion("pactvalidity <=", value, "pactvalidity");
            return (Criteria) this;
        }

        public Criteria andPactvalidityLike(String value) {
            addCriterion("pactvalidity like", value, "pactvalidity");
            return (Criteria) this;
        }

        public Criteria andPactvalidityNotLike(String value) {
            addCriterion("pactvalidity not like", value, "pactvalidity");
            return (Criteria) this;
        }

        public Criteria andPactvalidityIn(List<String> values) {
            addCriterion("pactvalidity in", values, "pactvalidity");
            return (Criteria) this;
        }

        public Criteria andPactvalidityNotIn(List<String> values) {
            addCriterion("pactvalidity not in", values, "pactvalidity");
            return (Criteria) this;
        }

        public Criteria andPactvalidityBetween(String value1, String value2) {
            addCriterion("pactvalidity between", value1, value2, "pactvalidity");
            return (Criteria) this;
        }

        public Criteria andPactvalidityNotBetween(String value1, String value2) {
            addCriterion("pactvalidity not between", value1, value2, "pactvalidity");
            return (Criteria) this;
        }

        public Criteria andWorknumberIsNull() {
            addCriterion("worknumber is null");
            return (Criteria) this;
        }

        public Criteria andWorknumberIsNotNull() {
            addCriterion("worknumber is not null");
            return (Criteria) this;
        }

        public Criteria andWorknumberEqualTo(String value) {
            addCriterion("worknumber =", value, "worknumber");
            return (Criteria) this;
        }

        public Criteria andWorknumberNotEqualTo(String value) {
            addCriterion("worknumber <>", value, "worknumber");
            return (Criteria) this;
        }

        public Criteria andWorknumberGreaterThan(String value) {
            addCriterion("worknumber >", value, "worknumber");
            return (Criteria) this;
        }

        public Criteria andWorknumberGreaterThanOrEqualTo(String value) {
            addCriterion("worknumber >=", value, "worknumber");
            return (Criteria) this;
        }

        public Criteria andWorknumberLessThan(String value) {
            addCriterion("worknumber <", value, "worknumber");
            return (Criteria) this;
        }

        public Criteria andWorknumberLessThanOrEqualTo(String value) {
            addCriterion("worknumber <=", value, "worknumber");
            return (Criteria) this;
        }

        public Criteria andWorknumberLike(String value) {
            addCriterion("worknumber like", value, "worknumber");
            return (Criteria) this;
        }

        public Criteria andWorknumberNotLike(String value) {
            addCriterion("worknumber not like", value, "worknumber");
            return (Criteria) this;
        }

        public Criteria andWorknumberIn(List<String> values) {
            addCriterion("worknumber in", values, "worknumber");
            return (Criteria) this;
        }

        public Criteria andWorknumberNotIn(List<String> values) {
            addCriterion("worknumber not in", values, "worknumber");
            return (Criteria) this;
        }

        public Criteria andWorknumberBetween(String value1, String value2) {
            addCriterion("worknumber between", value1, value2, "worknumber");
            return (Criteria) this;
        }

        public Criteria andWorknumberNotBetween(String value1, String value2) {
            addCriterion("worknumber not between", value1, value2, "worknumber");
            return (Criteria) this;
        }

        public Criteria andSpeclinenameIsNull() {
            addCriterion("speclinename is null");
            return (Criteria) this;
        }

        public Criteria andSpeclinenameIsNotNull() {
            addCriterion("speclinename is not null");
            return (Criteria) this;
        }

        public Criteria andSpeclinenameEqualTo(String value) {
            addCriterion("speclinename =", value, "speclinename");
            return (Criteria) this;
        }

        public Criteria andSpeclinenameNotEqualTo(String value) {
            addCriterion("speclinename <>", value, "speclinename");
            return (Criteria) this;
        }

        public Criteria andSpeclinenameGreaterThan(String value) {
            addCriterion("speclinename >", value, "speclinename");
            return (Criteria) this;
        }

        public Criteria andSpeclinenameGreaterThanOrEqualTo(String value) {
            addCriterion("speclinename >=", value, "speclinename");
            return (Criteria) this;
        }

        public Criteria andSpeclinenameLessThan(String value) {
            addCriterion("speclinename <", value, "speclinename");
            return (Criteria) this;
        }

        public Criteria andSpeclinenameLessThanOrEqualTo(String value) {
            addCriterion("speclinename <=", value, "speclinename");
            return (Criteria) this;
        }

        public Criteria andSpeclinenameLike(String value) {
            addCriterion("speclinename like", value, "speclinename");
            return (Criteria) this;
        }

        public Criteria andSpeclinenameNotLike(String value) {
            addCriterion("speclinename not like", value, "speclinename");
            return (Criteria) this;
        }

        public Criteria andSpeclinenameIn(List<String> values) {
            addCriterion("speclinename in", values, "speclinename");
            return (Criteria) this;
        }

        public Criteria andSpeclinenameNotIn(List<String> values) {
            addCriterion("speclinename not in", values, "speclinename");
            return (Criteria) this;
        }

        public Criteria andSpeclinenameBetween(String value1, String value2) {
            addCriterion("speclinename between", value1, value2, "speclinename");
            return (Criteria) this;
        }

        public Criteria andSpeclinenameNotBetween(String value1, String value2) {
            addCriterion("speclinename not between", value1, value2, "speclinename");
            return (Criteria) this;
        }

        public Criteria andEsopnumberIsNull() {
            addCriterion("esopnumber is null");
            return (Criteria) this;
        }

        public Criteria andEsopnumberIsNotNull() {
            addCriterion("esopnumber is not null");
            return (Criteria) this;
        }

        public Criteria andEsopnumberEqualTo(String value) {
            addCriterion("esopnumber =", value, "esopnumber");
            return (Criteria) this;
        }

        public Criteria andEsopnumberNotEqualTo(String value) {
            addCriterion("esopnumber <>", value, "esopnumber");
            return (Criteria) this;
        }

        public Criteria andEsopnumberGreaterThan(String value) {
            addCriterion("esopnumber >", value, "esopnumber");
            return (Criteria) this;
        }

        public Criteria andEsopnumberGreaterThanOrEqualTo(String value) {
            addCriterion("esopnumber >=", value, "esopnumber");
            return (Criteria) this;
        }

        public Criteria andEsopnumberLessThan(String value) {
            addCriterion("esopnumber <", value, "esopnumber");
            return (Criteria) this;
        }

        public Criteria andEsopnumberLessThanOrEqualTo(String value) {
            addCriterion("esopnumber <=", value, "esopnumber");
            return (Criteria) this;
        }

        public Criteria andEsopnumberLike(String value) {
            addCriterion("esopnumber like", value, "esopnumber");
            return (Criteria) this;
        }

        public Criteria andEsopnumberNotLike(String value) {
            addCriterion("esopnumber not like", value, "esopnumber");
            return (Criteria) this;
        }

        public Criteria andEsopnumberIn(List<String> values) {
            addCriterion("esopnumber in", values, "esopnumber");
            return (Criteria) this;
        }

        public Criteria andEsopnumberNotIn(List<String> values) {
            addCriterion("esopnumber not in", values, "esopnumber");
            return (Criteria) this;
        }

        public Criteria andEsopnumberBetween(String value1, String value2) {
            addCriterion("esopnumber between", value1, value2, "esopnumber");
            return (Criteria) this;
        }

        public Criteria andEsopnumberNotBetween(String value1, String value2) {
            addCriterion("esopnumber not between", value1, value2, "esopnumber");
            return (Criteria) this;
        }

        public Criteria andEsopthemeIsNull() {
            addCriterion("esoptheme is null");
            return (Criteria) this;
        }

        public Criteria andEsopthemeIsNotNull() {
            addCriterion("esoptheme is not null");
            return (Criteria) this;
        }

        public Criteria andEsopthemeEqualTo(String value) {
            addCriterion("esoptheme =", value, "esoptheme");
            return (Criteria) this;
        }

        public Criteria andEsopthemeNotEqualTo(String value) {
            addCriterion("esoptheme <>", value, "esoptheme");
            return (Criteria) this;
        }

        public Criteria andEsopthemeGreaterThan(String value) {
            addCriterion("esoptheme >", value, "esoptheme");
            return (Criteria) this;
        }

        public Criteria andEsopthemeGreaterThanOrEqualTo(String value) {
            addCriterion("esoptheme >=", value, "esoptheme");
            return (Criteria) this;
        }

        public Criteria andEsopthemeLessThan(String value) {
            addCriterion("esoptheme <", value, "esoptheme");
            return (Criteria) this;
        }

        public Criteria andEsopthemeLessThanOrEqualTo(String value) {
            addCriterion("esoptheme <=", value, "esoptheme");
            return (Criteria) this;
        }

        public Criteria andEsopthemeLike(String value) {
            addCriterion("esoptheme like", value, "esoptheme");
            return (Criteria) this;
        }

        public Criteria andEsopthemeNotLike(String value) {
            addCriterion("esoptheme not like", value, "esoptheme");
            return (Criteria) this;
        }

        public Criteria andEsopthemeIn(List<String> values) {
            addCriterion("esoptheme in", values, "esoptheme");
            return (Criteria) this;
        }

        public Criteria andEsopthemeNotIn(List<String> values) {
            addCriterion("esoptheme not in", values, "esoptheme");
            return (Criteria) this;
        }

        public Criteria andEsopthemeBetween(String value1, String value2) {
            addCriterion("esoptheme between", value1, value2, "esoptheme");
            return (Criteria) this;
        }

        public Criteria andEsopthemeNotBetween(String value1, String value2) {
            addCriterion("esoptheme not between", value1, value2, "esoptheme");
            return (Criteria) this;
        }

        public Criteria andOpentimeIsNull() {
            addCriterion("opentime is null");
            return (Criteria) this;
        }

        public Criteria andOpentimeIsNotNull() {
            addCriterion("opentime is not null");
            return (Criteria) this;
        }

        public Criteria andOpentimeEqualTo(Date value) {
            addCriterion("opentime =", value, "opentime");
            return (Criteria) this;
        }

        public Criteria andOpentimeNotEqualTo(Date value) {
            addCriterion("opentime <>", value, "opentime");
            return (Criteria) this;
        }

        public Criteria andOpentimeGreaterThan(Date value) {
            addCriterion("opentime >", value, "opentime");
            return (Criteria) this;
        }

        public Criteria andOpentimeGreaterThanOrEqualTo(Date value) {
            addCriterion("opentime >=", value, "opentime");
            return (Criteria) this;
        }

        public Criteria andOpentimeLessThan(Date value) {
            addCriterion("opentime <", value, "opentime");
            return (Criteria) this;
        }

        public Criteria andOpentimeLessThanOrEqualTo(Date value) {
            addCriterion("opentime <=", value, "opentime");
            return (Criteria) this;
        }

        public Criteria andOpentimeIn(List<Date> values) {
            addCriterion("opentime in", values, "opentime");
            return (Criteria) this;
        }

        public Criteria andOpentimeNotIn(List<Date> values) {
            addCriterion("opentime not in", values, "opentime");
            return (Criteria) this;
        }

        public Criteria andOpentimeBetween(Date value1, Date value2) {
            addCriterion("opentime between", value1, value2, "opentime");
            return (Criteria) this;
        }

        public Criteria andOpentimeNotBetween(Date value1, Date value2) {
            addCriterion("opentime not between", value1, value2, "opentime");
            return (Criteria) this;
        }

        public Criteria andBossnumberIsNull() {
            addCriterion("bossnumber is null");
            return (Criteria) this;
        }

        public Criteria andBossnumberIsNotNull() {
            addCriterion("bossnumber is not null");
            return (Criteria) this;
        }

        public Criteria andBossnumberEqualTo(String value) {
            addCriterion("bossnumber =", value, "bossnumber");
            return (Criteria) this;
        }

        public Criteria andBossnumberNotEqualTo(String value) {
            addCriterion("bossnumber <>", value, "bossnumber");
            return (Criteria) this;
        }

        public Criteria andBossnumberGreaterThan(String value) {
            addCriterion("bossnumber >", value, "bossnumber");
            return (Criteria) this;
        }

        public Criteria andBossnumberGreaterThanOrEqualTo(String value) {
            addCriterion("bossnumber >=", value, "bossnumber");
            return (Criteria) this;
        }

        public Criteria andBossnumberLessThan(String value) {
            addCriterion("bossnumber <", value, "bossnumber");
            return (Criteria) this;
        }

        public Criteria andBossnumberLessThanOrEqualTo(String value) {
            addCriterion("bossnumber <=", value, "bossnumber");
            return (Criteria) this;
        }

        public Criteria andBossnumberLike(String value) {
            addCriterion("bossnumber like", value, "bossnumber");
            return (Criteria) this;
        }

        public Criteria andBossnumberNotLike(String value) {
            addCriterion("bossnumber not like", value, "bossnumber");
            return (Criteria) this;
        }

        public Criteria andBossnumberIn(List<String> values) {
            addCriterion("bossnumber in", values, "bossnumber");
            return (Criteria) this;
        }

        public Criteria andBossnumberNotIn(List<String> values) {
            addCriterion("bossnumber not in", values, "bossnumber");
            return (Criteria) this;
        }

        public Criteria andBossnumberBetween(String value1, String value2) {
            addCriterion("bossnumber between", value1, value2, "bossnumber");
            return (Criteria) this;
        }

        public Criteria andBossnumberNotBetween(String value1, String value2) {
            addCriterion("bossnumber not between", value1, value2, "bossnumber");
            return (Criteria) this;
        }

        public Criteria andFtolltimeIsNull() {
            addCriterion("ftolltime is null");
            return (Criteria) this;
        }

        public Criteria andFtolltimeIsNotNull() {
            addCriterion("ftolltime is not null");
            return (Criteria) this;
        }

        public Criteria andFtolltimeEqualTo(Date value) {
            addCriterion("ftolltime =", value, "ftolltime");
            return (Criteria) this;
        }

        public Criteria andFtolltimeNotEqualTo(Date value) {
            addCriterion("ftolltime <>", value, "ftolltime");
            return (Criteria) this;
        }

        public Criteria andFtolltimeGreaterThan(Date value) {
            addCriterion("ftolltime >", value, "ftolltime");
            return (Criteria) this;
        }

        public Criteria andFtolltimeGreaterThanOrEqualTo(Date value) {
            addCriterion("ftolltime >=", value, "ftolltime");
            return (Criteria) this;
        }

        public Criteria andFtolltimeLessThan(Date value) {
            addCriterion("ftolltime <", value, "ftolltime");
            return (Criteria) this;
        }

        public Criteria andFtolltimeLessThanOrEqualTo(Date value) {
            addCriterion("ftolltime <=", value, "ftolltime");
            return (Criteria) this;
        }

        public Criteria andFtolltimeIn(List<Date> values) {
            addCriterion("ftolltime in", values, "ftolltime");
            return (Criteria) this;
        }

        public Criteria andFtolltimeNotIn(List<Date> values) {
            addCriterion("ftolltime not in", values, "ftolltime");
            return (Criteria) this;
        }

        public Criteria andFtolltimeBetween(Date value1, Date value2) {
            addCriterion("ftolltime between", value1, value2, "ftolltime");
            return (Criteria) this;
        }

        public Criteria andFtolltimeNotBetween(Date value1, Date value2) {
            addCriterion("ftolltime not between", value1, value2, "ftolltime");
            return (Criteria) this;
        }

        public Criteria andFtollsumIsNull() {
            addCriterion("ftollsum is null");
            return (Criteria) this;
        }

        public Criteria andFtollsumIsNotNull() {
            addCriterion("ftollsum is not null");
            return (Criteria) this;
        }

        public Criteria andFtollsumEqualTo(Float value) {
            addCriterion("ftollsum =", value, "ftollsum");
            return (Criteria) this;
        }

        public Criteria andFtollsumNotEqualTo(Float value) {
            addCriterion("ftollsum <>", value, "ftollsum");
            return (Criteria) this;
        }

        public Criteria andFtollsumGreaterThan(Float value) {
            addCriterion("ftollsum >", value, "ftollsum");
            return (Criteria) this;
        }

        public Criteria andFtollsumGreaterThanOrEqualTo(Float value) {
            addCriterion("ftollsum >=", value, "ftollsum");
            return (Criteria) this;
        }

        public Criteria andFtollsumLessThan(Float value) {
            addCriterion("ftollsum <", value, "ftollsum");
            return (Criteria) this;
        }

        public Criteria andFtollsumLessThanOrEqualTo(Float value) {
            addCriterion("ftollsum <=", value, "ftollsum");
            return (Criteria) this;
        }

        public Criteria andFtollsumIn(List<Float> values) {
            addCriterion("ftollsum in", values, "ftollsum");
            return (Criteria) this;
        }

        public Criteria andFtollsumNotIn(List<Float> values) {
            addCriterion("ftollsum not in", values, "ftollsum");
            return (Criteria) this;
        }

        public Criteria andFtollsumBetween(Float value1, Float value2) {
            addCriterion("ftollsum between", value1, value2, "ftollsum");
            return (Criteria) this;
        }

        public Criteria andFtollsumNotBetween(Float value1, Float value2) {
            addCriterion("ftollsum not between", value1, value2, "ftollsum");
            return (Criteria) this;
        }
        
        public Criteria andAreacodeEqualTo(String value) {
            addCriterion("areacode =", value, "areacode");
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