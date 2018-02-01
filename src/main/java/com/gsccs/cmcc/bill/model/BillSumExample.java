package com.gsccs.cmcc.bill.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.gsccs.plat.bass.BaseExample;


public class BillSumExample extends BaseExample{
	
    protected String orderByClause;
    protected boolean distinct;
    protected List<Criteria> oredCriteria;

    public BillSumExample() {
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

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(String value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(String value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<String> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<String> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andUseridEqualTo(String value) {
            addCriterion("userid =", value, "userid");
            return (Criteria) this;
        }
        
        public Criteria andBillnoIsNull() {
            addCriterion("billno is null");
            return (Criteria) this;
        }

        public Criteria andBillnoIsNotNull() {
            addCriterion("billno is not null");
            return (Criteria) this;
        }

        public Criteria andBillnoEqualTo(String value) {
            addCriterion("billno =", value, "billno");
            return (Criteria) this;
        }

        public Criteria andBillnoLike(String value) {
            addCriterion("billno like", value, "billno");
            return (Criteria) this;
        }

        public Criteria andBillnoNotLike(String value) {
            addCriterion("billno not like", value, "billno");
            return (Criteria) this;
        }

        public Criteria andBillnoIn(List<String> values) {
            addCriterion("billno in", values, "billno");
            return (Criteria) this;
        }

        public Criteria andBillnoNotIn(List<String> values) {
            addCriterion("billno not in", values, "billno");
            return (Criteria) this;
        }


        public Criteria andAdddateIsNull() {
            addCriterion("adddate is null");
            return (Criteria) this;
        }

        public Criteria andAdddateIsNotNull() {
            addCriterion("adddate is not null");
            return (Criteria) this;
        }

        public Criteria andAdddateEqualTo(Date value) {
            addCriterion("adddate =", value, "adddate");
            return (Criteria) this;
        }

        public Criteria andAdddateNotEqualTo(Date value) {
            addCriterion("adddate <>", value, "adddate");
            return (Criteria) this;
        }

        public Criteria andAdddateGreaterThan(Date value) {
            addCriterion("adddate >", value, "adddate");
            return (Criteria) this;
        }

        public Criteria andAdddateGreaterThanOrEqualTo(Date value) {
            addCriterion("adddate >=", value, "adddate");
            return (Criteria) this;
        }

        public Criteria andAdddateLessThan(Date value) {
            addCriterion("adddate <", value, "adddate");
            return (Criteria) this;
        }

        public Criteria andAdddateLessThanOrEqualTo(Date value) {
            addCriterion("adddate <=", value, "adddate");
            return (Criteria) this;
        }

        public Criteria andAdddateIn(List<Date> values) {
            addCriterion("adddate in", values, "adddate");
            return (Criteria) this;
        }

        public Criteria andAdddateNotIn(List<Date> values) {
            addCriterion("adddate not in", values, "adddate");
            return (Criteria) this;
        }

        public Criteria andAmuseridIsNull() {
            addCriterion("amuserid is null");
            return (Criteria) this;
        }

        public Criteria andAmuseridIsNotNull() {
            addCriterion("amuserid is not null");
            return (Criteria) this;
        }

        public Criteria andAmuseridEqualTo(String value) {
            addCriterion("amuserid =", value, "amuserid");
            return (Criteria) this;
        }

        public Criteria andAmuseridNotEqualTo(String value) {
            addCriterion("amuserid <>", value, "amuserid");
            return (Criteria) this;
        }

        
        public Criteria andAmuseridIn(List<String> values) {
            addCriterion("amuserid in", values, "amuserid");
            return (Criteria) this;
        }

        public Criteria andAmuseridNotIn(List<String> values) {
            addCriterion("amuserid not in", values, "amuserid");
            return (Criteria) this;
        }

        public Criteria andAmuseridBetween(String value1, String value2) {
            addCriterion("amuserid between", value1, value2, "amuserid");
            return (Criteria) this;
        }

        public Criteria andAmuseridNotBetween(String value1, String value2) {
            addCriterion("amuserid not between", value1, value2, "amuserid");
            return (Criteria) this;
        }

        public Criteria andAddtimeIsNull() {
            addCriterion("addtime is null");
            return (Criteria) this;
        }

        public Criteria andAddtimeIsNotNull() {
            addCriterion("addtime is not null");
            return (Criteria) this;
        }

        public Criteria andAddtimeEqualTo(Date value) {
            addCriterion("addtime =", value, "addtime");
            return (Criteria) this;
        }

        public Criteria andAddtimeNotEqualTo(Date value) {
            addCriterion("addtime <>", value, "addtime");
            return (Criteria) this;
        }

        public Criteria andAddtimeGreaterThan(Date value) {
            addCriterion("addtime >", value, "addtime");
            return (Criteria) this;
        }

        public Criteria andAddtimeGreaterThanOrEqualTo(Date value) {
            addCriterion("addtime >=", value, "addtime");
            return (Criteria) this;
        }

        public Criteria andAddtimeLessThan(Date value) {
            addCriterion("addtime <", value, "addtime");
            return (Criteria) this;
        }

        public Criteria andAddtimeLessThanOrEqualTo(Date value) {
            addCriterion("addtime <=", value, "addtime");
            return (Criteria) this;
        }

        public Criteria andAddtimeIn(List<Date> values) {
            addCriterion("addtime in", values, "addtime");
            return (Criteria) this;
        }

        public Criteria andAddtimeNotIn(List<Date> values) {
            addCriterion("addtime not in", values, "addtime");
            return (Criteria) this;
        }

        public Criteria andAddtimeBetween(Date value1, Date value2) {
            addCriterion("addtime between", value1, value2, "addtime");
            return (Criteria) this;
        }

        public Criteria andAddtimeNotBetween(Date value1, Date value2) {
            addCriterion("addtime not between", value1, value2, "addtime");
            return (Criteria) this;
        }

        public Criteria andStatusIsNull() {
            addCriterion("status is null");
            return (Criteria) this;
        }

        public Criteria andStatusIsNotNull() {
            addCriterion("status is not null");
            return (Criteria) this;
        }

        public Criteria andStatusEqualTo(String value) {
            addCriterion("status =", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotEqualTo(String value) {
            addCriterion("status <>", value, "status");
            return (Criteria) this;
        }

        
        public Criteria andStatusIn(List<String> values) {
            addCriterion("status in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotIn(List<String> values) {
            addCriterion("status not in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusBetween(String value1, String value2) {
            addCriterion("status between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotBetween(String value1, String value2) {
            addCriterion("status not between", value1, value2, "status");
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