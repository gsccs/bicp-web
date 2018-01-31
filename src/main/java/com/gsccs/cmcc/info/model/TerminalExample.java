package com.gsccs.cmcc.info.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.gsccs.plat.bass.BaseExample;

public class TerminalExample extends BaseExample{
    protected String orderByClause;
    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TerminalExample() {
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

        
        public Criteria andIdLike(String value) {
            addCriterion("id like", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotLike(String value) {
            addCriterion("id not like", value, "id");
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

        
        public Criteria andMchNoLike(String value) {
            addCriterion("mchno like", value, "mchno");
            return (Criteria) this;
        }

        public Criteria andMchNoNotLike(String value) {
            addCriterion("mchno not like", value, "mchno");
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
        
        
        public Criteria andOrdernoEqualTo(String value) {
            addCriterion("orderno =", value, "orderno");
            return (Criteria) this;
        }
        
        public Criteria andTersnEqualTo(String value) {
            addCriterion("tersn =", value, "tersn");
            return (Criteria) this;
        }
        
        public Criteria andBrandsEqualTo(String value) {
            addCriterion("brands =", value, "brands");
            return (Criteria) this;
        }
        
        public Criteria andUseridEqualTo(String value) {
            addCriterion("userid =", value, "userid");
            return (Criteria) this;
        }
        
        public Criteria andPgvEqualTo(String value) {
            addCriterion("pgv =", value, "pgv");
            return (Criteria) this;
        }
        

        public Criteria andDevSnIsNull() {
            addCriterion("dev_sn is null");
            return (Criteria) this;
        }

        public Criteria andDevSnIsNotNull() {
            addCriterion("dev_sn is not null");
            return (Criteria) this;
        }

        public Criteria andDevSnEqualTo(String value) {
            addCriterion("dev_sn =", value, "dev_sn");
            return (Criteria) this;
        }

        public Criteria andDevSnNotEqualTo(String value) {
            addCriterion("dev_sn <>", value, "dev_sn");
            return (Criteria) this;
        }

        

        public Criteria andDevSnLike(String value) {
            addCriterion("dev_sn like", value, "dev_sn");
            return (Criteria) this;
        }

        public Criteria andDevSnNotLike(String value) {
            addCriterion("dev_sn not like", value, "dev_sn");
            return (Criteria) this;
        }

        public Criteria andDevSnIn(List<String> values) {
            addCriterion("dev_sn in", values, "dev_sn");
            return (Criteria) this;
        }

        public Criteria andDevSnNotIn(List<String> values) {
            addCriterion("dev_sn not in", values, "dev_sn");
            return (Criteria) this;
        }

        public Criteria andDevSnBetween(String value1, String value2) {
            addCriterion("dev_sn between", value1, value2, "dev_sn");
            return (Criteria) this;
        }

        public Criteria andDevSnNotBetween(String value1, String value2) {
            addCriterion("dev_sn not between", value1, value2, "dev_sn");
            return (Criteria) this;
        }

        public Criteria andDevNoIsNull() {
            addCriterion("dev_no is null");
            return (Criteria) this;
        }

        public Criteria andDevNoIsNotNull() {
            addCriterion("dev_no is not null");
            return (Criteria) this;
        }

        public Criteria andDevNoEqualTo(Float value) {
            addCriterion("dev_no =", value, "dev_no");
            return (Criteria) this;
        }

        public Criteria andDevNoNotEqualTo(Float value) {
            addCriterion("dev_no <>", value, "dev_no");
            return (Criteria) this;
        }

        public Criteria andDevNoIn(List<Float> values) {
            addCriterion("dev_no in", values, "dev_no");
            return (Criteria) this;
        }

        public Criteria andDevNoNotIn(List<Float> values) {
            addCriterion("dev_no not in", values, "dev_no");
            return (Criteria) this;
        }

        public Criteria andDevNoBetween(Float value1, Float value2) {
            addCriterion("dev_no between", value1, value2, "dev_no");
            return (Criteria) this;
        }

        public Criteria andDevNoNotBetween(Float value1, Float value2) {
            addCriterion("dev_no not between", value1, value2, "dev_no");
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

        public Criteria andStatusLike(String value) {
            addCriterion("status like", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotLike(String value) {
            addCriterion("status not like", value, "status");
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

       


        public Criteria andOrdernumIsNull() {
            addCriterion("ordernum is null");
            return (Criteria) this;
        }

        public Criteria andOrdernumIsNotNull() {
            addCriterion("ordernum is not null");
            return (Criteria) this;
        }

        public Criteria andOrdernumEqualTo(Integer value) {
            addCriterion("ordernum =", value, "ordernum");
            return (Criteria) this;
        }

        public Criteria andOrdernumNotEqualTo(Integer value) {
            addCriterion("ordernum <>", value, "ordernum");
            return (Criteria) this;
        }

        public Criteria andOrdernumIn(List<Integer> values) {
            addCriterion("ordernum in", values, "ordernum");
            return (Criteria) this;
        }

        public Criteria andOrdernumNotIn(List<Integer> values) {
            addCriterion("ordernum not in", values, "ordernum");
            return (Criteria) this;
        }

        public Criteria andOrdernumBetween(Integer value1, Integer value2) {
            addCriterion("ordernum between", value1, value2, "ordernum");
            return (Criteria) this;
        }

        public Criteria andOrdernumNotBetween(Integer value1, Integer value2) {
            addCriterion("ordernum not between", value1, value2, "ordernum");
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