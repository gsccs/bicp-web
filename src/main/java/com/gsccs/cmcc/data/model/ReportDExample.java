package com.gsccs.cmcc.data.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ReportDExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ReportDExample() {
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

        public Criteria andInterviewdateIsNull() {
            addCriterion("interviewdate is null");
            return (Criteria) this;
        }

        public Criteria andInterviewdateIsNotNull() {
            addCriterion("interviewdate is not null");
            return (Criteria) this;
        }

        public Criteria andInterviewdateEqualTo(Date value) {
            addCriterion("interviewdate =", value, "interviewdate");
            return (Criteria) this;
        }

        public Criteria andInterviewdateNotEqualTo(Date value) {
            addCriterion("interviewdate <>", value, "interviewdate");
            return (Criteria) this;
        }

        public Criteria andInterviewdateGreaterThan(Date value) {
            addCriterion("interviewdate >", value, "interviewdate");
            return (Criteria) this;
        }

        public Criteria andInterviewdateGreaterThanOrEqualTo(Date value) {
            addCriterion("interviewdate >=", value, "interviewdate");
            return (Criteria) this;
        }

        public Criteria andInterviewdateLessThan(Date value) {
            addCriterion("interviewdate <", value, "interviewdate");
            return (Criteria) this;
        }

        public Criteria andInterviewdateLessThanOrEqualTo(Date value) {
            addCriterion("interviewdate <=", value, "interviewdate");
            return (Criteria) this;
        }

        public Criteria andInterviewdateIn(List<Date> values) {
            addCriterion("interviewdate in", values, "interviewdate");
            return (Criteria) this;
        }

        public Criteria andInterviewdateNotIn(List<Date> values) {
            addCriterion("interviewdate not in", values, "interviewdate");
            return (Criteria) this;
        }

        public Criteria andInterviewdateBetween(Date value1, Date value2) {
            addCriterion("interviewdate between", value1, value2, "interviewdate");
            return (Criteria) this;
        }

        public Criteria andInterviewdateNotBetween(Date value1, Date value2) {
            addCriterion("interviewdate not between", value1, value2, "interviewdate");
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

        public Criteria andUsernameIsNull() {
            addCriterion("username is null");
            return (Criteria) this;
        }

        public Criteria andUsernameIsNotNull() {
            addCriterion("username is not null");
            return (Criteria) this;
        }

        public Criteria andUsernameEqualTo(String value) {
            addCriterion("username =", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameNotEqualTo(String value) {
            addCriterion("username <>", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameGreaterThan(String value) {
            addCriterion("username >", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameGreaterThanOrEqualTo(String value) {
            addCriterion("username >=", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameLessThan(String value) {
            addCriterion("username <", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameLessThanOrEqualTo(String value) {
            addCriterion("username <=", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameLike(String value) {
            addCriterion("username like", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameNotLike(String value) {
            addCriterion("username not like", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameIn(List<String> values) {
            addCriterion("username in", values, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameNotIn(List<String> values) {
            addCriterion("username not in", values, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameBetween(String value1, String value2) {
            addCriterion("username between", value1, value2, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameNotBetween(String value1, String value2) {
            addCriterion("username not between", value1, value2, "username");
            return (Criteria) this;
        }

        public Criteria andTerminalIsNull() {
            addCriterion("terminal is null");
            return (Criteria) this;
        }

        public Criteria andTerminalIsNotNull() {
            addCriterion("terminal is not null");
            return (Criteria) this;
        }

        public Criteria andTerminalEqualTo(Integer value) {
            addCriterion("terminal =", value, "terminal");
            return (Criteria) this;
        }

        public Criteria andTerminalNotEqualTo(Integer value) {
            addCriterion("terminal <>", value, "terminal");
            return (Criteria) this;
        }

        public Criteria andTerminalGreaterThan(Integer value) {
            addCriterion("terminal >", value, "terminal");
            return (Criteria) this;
        }

        public Criteria andTerminalGreaterThanOrEqualTo(Integer value) {
            addCriterion("terminal >=", value, "terminal");
            return (Criteria) this;
        }

        public Criteria andTerminalLessThan(Integer value) {
            addCriterion("terminal <", value, "terminal");
            return (Criteria) this;
        }

        public Criteria andTerminalLessThanOrEqualTo(Integer value) {
            addCriterion("terminal <=", value, "terminal");
            return (Criteria) this;
        }

        public Criteria andTerminalIn(List<Integer> values) {
            addCriterion("terminal in", values, "terminal");
            return (Criteria) this;
        }

        public Criteria andTerminalNotIn(List<Integer> values) {
            addCriterion("terminal not in", values, "terminal");
            return (Criteria) this;
        }

        public Criteria andTerminalBetween(Integer value1, Integer value2) {
            addCriterion("terminal between", value1, value2, "terminal");
            return (Criteria) this;
        }

        public Criteria andTerminalNotBetween(Integer value1, Integer value2) {
            addCriterion("terminal not between", value1, value2, "terminal");
            return (Criteria) this;
        }

        public Criteria andFgFlowIsNull() {
            addCriterion("fg_flow is null");
            return (Criteria) this;
        }

        public Criteria andFgFlowIsNotNull() {
            addCriterion("fg_flow is not null");
            return (Criteria) this;
        }

        public Criteria andFgFlowEqualTo(Integer value) {
            addCriterion("fg_flow =", value, "fgFlow");
            return (Criteria) this;
        }

        public Criteria andFgFlowNotEqualTo(Integer value) {
            addCriterion("fg_flow <>", value, "fgFlow");
            return (Criteria) this;
        }

        public Criteria andFgFlowGreaterThan(Integer value) {
            addCriterion("fg_flow >", value, "fgFlow");
            return (Criteria) this;
        }

        public Criteria andFgFlowGreaterThanOrEqualTo(Integer value) {
            addCriterion("fg_flow >=", value, "fgFlow");
            return (Criteria) this;
        }

        public Criteria andFgFlowLessThan(Integer value) {
            addCriterion("fg_flow <", value, "fgFlow");
            return (Criteria) this;
        }

        public Criteria andFgFlowLessThanOrEqualTo(Integer value) {
            addCriterion("fg_flow <=", value, "fgFlow");
            return (Criteria) this;
        }

        public Criteria andFgFlowIn(List<Integer> values) {
            addCriterion("fg_flow in", values, "fgFlow");
            return (Criteria) this;
        }

        public Criteria andFgFlowNotIn(List<Integer> values) {
            addCriterion("fg_flow not in", values, "fgFlow");
            return (Criteria) this;
        }

        public Criteria andFgFlowBetween(Integer value1, Integer value2) {
            addCriterion("fg_flow between", value1, value2, "fgFlow");
            return (Criteria) this;
        }

        public Criteria andFgFlowNotBetween(Integer value1, Integer value2) {
            addCriterion("fg_flow not between", value1, value2, "fgFlow");
            return (Criteria) this;
        }

        public Criteria andFgCardIsNull() {
            addCriterion("fg_card is null");
            return (Criteria) this;
        }

        public Criteria andFgCardIsNotNull() {
            addCriterion("fg_card is not null");
            return (Criteria) this;
        }

        public Criteria andFgCardEqualTo(Integer value) {
            addCriterion("fg_card =", value, "fgCard");
            return (Criteria) this;
        }

        public Criteria andFgCardNotEqualTo(Integer value) {
            addCriterion("fg_card <>", value, "fgCard");
            return (Criteria) this;
        }

        public Criteria andFgCardGreaterThan(Integer value) {
            addCriterion("fg_card >", value, "fgCard");
            return (Criteria) this;
        }

        public Criteria andFgCardGreaterThanOrEqualTo(Integer value) {
            addCriterion("fg_card >=", value, "fgCard");
            return (Criteria) this;
        }

        public Criteria andFgCardLessThan(Integer value) {
            addCriterion("fg_card <", value, "fgCard");
            return (Criteria) this;
        }

        public Criteria andFgCardLessThanOrEqualTo(Integer value) {
            addCriterion("fg_card <=", value, "fgCard");
            return (Criteria) this;
        }

        public Criteria andFgCardIn(List<Integer> values) {
            addCriterion("fg_card in", values, "fgCard");
            return (Criteria) this;
        }

        public Criteria andFgCardNotIn(List<Integer> values) {
            addCriterion("fg_card not in", values, "fgCard");
            return (Criteria) this;
        }

        public Criteria andFgCardBetween(Integer value1, Integer value2) {
            addCriterion("fg_card between", value1, value2, "fgCard");
            return (Criteria) this;
        }

        public Criteria andFgCardNotBetween(Integer value1, Integer value2) {
            addCriterion("fg_card not between", value1, value2, "fgCard");
            return (Criteria) this;
        }

        public Criteria andAppIsNull() {
            addCriterion("app is null");
            return (Criteria) this;
        }

        public Criteria andAppIsNotNull() {
            addCriterion("app is not null");
            return (Criteria) this;
        }

        public Criteria andAppEqualTo(Integer value) {
            addCriterion("app =", value, "app");
            return (Criteria) this;
        }

        public Criteria andAppNotEqualTo(Integer value) {
            addCriterion("app <>", value, "app");
            return (Criteria) this;
        }

        public Criteria andAppGreaterThan(Integer value) {
            addCriterion("app >", value, "app");
            return (Criteria) this;
        }

        public Criteria andAppGreaterThanOrEqualTo(Integer value) {
            addCriterion("app >=", value, "app");
            return (Criteria) this;
        }

        public Criteria andAppLessThan(Integer value) {
            addCriterion("app <", value, "app");
            return (Criteria) this;
        }

        public Criteria andAppLessThanOrEqualTo(Integer value) {
            addCriterion("app <=", value, "app");
            return (Criteria) this;
        }

        public Criteria andAppIn(List<Integer> values) {
            addCriterion("app in", values, "app");
            return (Criteria) this;
        }

        public Criteria andAppNotIn(List<Integer> values) {
            addCriterion("app not in", values, "app");
            return (Criteria) this;
        }

        public Criteria andAppBetween(Integer value1, Integer value2) {
            addCriterion("app between", value1, value2, "app");
            return (Criteria) this;
        }

        public Criteria andAppNotBetween(Integer value1, Integer value2) {
            addCriterion("app not between", value1, value2, "app");
            return (Criteria) this;
        }

        public Criteria andProduct1IsNull() {
            addCriterion("product1 is null");
            return (Criteria) this;
        }

        public Criteria andProduct1IsNotNull() {
            addCriterion("product1 is not null");
            return (Criteria) this;
        }

        public Criteria andProduct1EqualTo(String value) {
            addCriterion("product1 =", value, "product1");
            return (Criteria) this;
        }

        public Criteria andProduct1NotEqualTo(String value) {
            addCriterion("product1 <>", value, "product1");
            return (Criteria) this;
        }

        public Criteria andProduct1GreaterThan(String value) {
            addCriterion("product1 >", value, "product1");
            return (Criteria) this;
        }

        public Criteria andProduct1GreaterThanOrEqualTo(String value) {
            addCriterion("product1 >=", value, "product1");
            return (Criteria) this;
        }

        public Criteria andProduct1LessThan(String value) {
            addCriterion("product1 <", value, "product1");
            return (Criteria) this;
        }

        public Criteria andProduct1LessThanOrEqualTo(String value) {
            addCriterion("product1 <=", value, "product1");
            return (Criteria) this;
        }

        public Criteria andProduct1Like(String value) {
            addCriterion("product1 like", value, "product1");
            return (Criteria) this;
        }

        public Criteria andProduct1NotLike(String value) {
            addCriterion("product1 not like", value, "product1");
            return (Criteria) this;
        }

        public Criteria andProduct1In(List<String> values) {
            addCriterion("product1 in", values, "product1");
            return (Criteria) this;
        }

        public Criteria andProduct1NotIn(List<String> values) {
            addCriterion("product1 not in", values, "product1");
            return (Criteria) this;
        }

        public Criteria andProduct1Between(String value1, String value2) {
            addCriterion("product1 between", value1, value2, "product1");
            return (Criteria) this;
        }

        public Criteria andProduct1NotBetween(String value1, String value2) {
            addCriterion("product1 not between", value1, value2, "product1");
            return (Criteria) this;
        }

        public Criteria andResult1IsNull() {
            addCriterion("result1 is null");
            return (Criteria) this;
        }

        public Criteria andResult1IsNotNull() {
            addCriterion("result1 is not null");
            return (Criteria) this;
        }

        public Criteria andResult1EqualTo(String value) {
            addCriterion("result1 =", value, "result1");
            return (Criteria) this;
        }

        public Criteria andResult1NotEqualTo(String value) {
            addCriterion("result1 <>", value, "result1");
            return (Criteria) this;
        }

        public Criteria andResult1GreaterThan(String value) {
            addCriterion("result1 >", value, "result1");
            return (Criteria) this;
        }

        public Criteria andResult1GreaterThanOrEqualTo(String value) {
            addCriterion("result1 >=", value, "result1");
            return (Criteria) this;
        }

        public Criteria andResult1LessThan(String value) {
            addCriterion("result1 <", value, "result1");
            return (Criteria) this;
        }

        public Criteria andResult1LessThanOrEqualTo(String value) {
            addCriterion("result1 <=", value, "result1");
            return (Criteria) this;
        }

        public Criteria andResult1Like(String value) {
            addCriterion("result1 like", value, "result1");
            return (Criteria) this;
        }

        public Criteria andResult1NotLike(String value) {
            addCriterion("result1 not like", value, "result1");
            return (Criteria) this;
        }

        public Criteria andResult1In(List<String> values) {
            addCriterion("result1 in", values, "result1");
            return (Criteria) this;
        }

        public Criteria andResult1NotIn(List<String> values) {
            addCriterion("result1 not in", values, "result1");
            return (Criteria) this;
        }

        public Criteria andResult1Between(String value1, String value2) {
            addCriterion("result1 between", value1, value2, "result1");
            return (Criteria) this;
        }

        public Criteria andResult1NotBetween(String value1, String value2) {
            addCriterion("result1 not between", value1, value2, "result1");
            return (Criteria) this;
        }

        public Criteria andProduct2IsNull() {
            addCriterion("product2 is null");
            return (Criteria) this;
        }

        public Criteria andProduct2IsNotNull() {
            addCriterion("product2 is not null");
            return (Criteria) this;
        }

        public Criteria andProduct2EqualTo(String value) {
            addCriterion("product2 =", value, "product2");
            return (Criteria) this;
        }

        public Criteria andProduct2NotEqualTo(String value) {
            addCriterion("product2 <>", value, "product2");
            return (Criteria) this;
        }

        public Criteria andProduct2GreaterThan(String value) {
            addCriterion("product2 >", value, "product2");
            return (Criteria) this;
        }

        public Criteria andProduct2GreaterThanOrEqualTo(String value) {
            addCriterion("product2 >=", value, "product2");
            return (Criteria) this;
        }

        public Criteria andProduct2LessThan(String value) {
            addCriterion("product2 <", value, "product2");
            return (Criteria) this;
        }

        public Criteria andProduct2LessThanOrEqualTo(String value) {
            addCriterion("product2 <=", value, "product2");
            return (Criteria) this;
        }

        public Criteria andProduct2Like(String value) {
            addCriterion("product2 like", value, "product2");
            return (Criteria) this;
        }

        public Criteria andProduct2NotLike(String value) {
            addCriterion("product2 not like", value, "product2");
            return (Criteria) this;
        }

        public Criteria andProduct2In(List<String> values) {
            addCriterion("product2 in", values, "product2");
            return (Criteria) this;
        }

        public Criteria andProduct2NotIn(List<String> values) {
            addCriterion("product2 not in", values, "product2");
            return (Criteria) this;
        }

        public Criteria andProduct2Between(String value1, String value2) {
            addCriterion("product2 between", value1, value2, "product2");
            return (Criteria) this;
        }

        public Criteria andProduct2NotBetween(String value1, String value2) {
            addCriterion("product2 not between", value1, value2, "product2");
            return (Criteria) this;
        }

        public Criteria andResult2IsNull() {
            addCriterion("result2 is null");
            return (Criteria) this;
        }

        public Criteria andResult2IsNotNull() {
            addCriterion("result2 is not null");
            return (Criteria) this;
        }

        public Criteria andResult2EqualTo(String value) {
            addCriterion("result2 =", value, "result2");
            return (Criteria) this;
        }

        public Criteria andResult2NotEqualTo(String value) {
            addCriterion("result2 <>", value, "result2");
            return (Criteria) this;
        }

        public Criteria andResult2GreaterThan(String value) {
            addCriterion("result2 >", value, "result2");
            return (Criteria) this;
        }

        public Criteria andResult2GreaterThanOrEqualTo(String value) {
            addCriterion("result2 >=", value, "result2");
            return (Criteria) this;
        }

        public Criteria andResult2LessThan(String value) {
            addCriterion("result2 <", value, "result2");
            return (Criteria) this;
        }

        public Criteria andResult2LessThanOrEqualTo(String value) {
            addCriterion("result2 <=", value, "result2");
            return (Criteria) this;
        }

        public Criteria andResult2Like(String value) {
            addCriterion("result2 like", value, "result2");
            return (Criteria) this;
        }

        public Criteria andResult2NotLike(String value) {
            addCriterion("result2 not like", value, "result2");
            return (Criteria) this;
        }

        public Criteria andResult2In(List<String> values) {
            addCriterion("result2 in", values, "result2");
            return (Criteria) this;
        }

        public Criteria andResult2NotIn(List<String> values) {
            addCriterion("result2 not in", values, "result2");
            return (Criteria) this;
        }

        public Criteria andResult2Between(String value1, String value2) {
            addCriterion("result2 between", value1, value2, "result2");
            return (Criteria) this;
        }

        public Criteria andResult2NotBetween(String value1, String value2) {
            addCriterion("result2 not between", value1, value2, "result2");
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