package com.gsccs.cmcc.info.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.gsccs.plat.bass.BaseExample;

public class TerminalHisExample extends BaseExample{
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TerminalHisExample() {
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


        public Criteria andParidIsNull() {
            addCriterion("parid is null");
            return (Criteria) this;
        }

        public Criteria andParidIsNotNull() {
            addCriterion("parid is not null");
            return (Criteria) this;
        }

        public Criteria andParidEqualTo(String value) {
            addCriterion("parid =", value, "parid");
            return (Criteria) this;
        }

        public Criteria andParidNotEqualTo(String value) {
            addCriterion("parid <>", value, "parid");
            return (Criteria) this;
        }

        public Criteria andParidGreaterThan(String value) {
            addCriterion("parid >", value, "parid");
            return (Criteria) this;
        }

        public Criteria andParidGreaterThanOrEqualTo(String value) {
            addCriterion("parid >=", value, "parid");
            return (Criteria) this;
        }

        public Criteria andParidLessThan(String value) {
            addCriterion("parid <", value, "parid");
            return (Criteria) this;
        }

        public Criteria andParidLessThanOrEqualTo(String value) {
            addCriterion("parid <=", value, "parid");
            return (Criteria) this;
        }

        public Criteria andParidLike(String value) {
            addCriterion("parid like", value, "parid");
            return (Criteria) this;
        }

        public Criteria andParidNotLike(String value) {
            addCriterion("parid not like", value, "parid");
            return (Criteria) this;
        }

        public Criteria andParidIn(List<String> values) {
            addCriterion("parid in", values, "parid");
            return (Criteria) this;
        }

        public Criteria andParidNotIn(List<String> values) {
            addCriterion("parid not in", values, "parid");
            return (Criteria) this;
        }

        public Criteria andParidBetween(String value1, String value2) {
            addCriterion("parid between", value1, value2, "parid");
            return (Criteria) this;
        }

        public Criteria andParidNotBetween(String value1, String value2) {
            addCriterion("parid not between", value1, value2, "parid");
            return (Criteria) this;
        }

        public Criteria andEdittimeIsNull() {
            addCriterion("edittime is null");
            return (Criteria) this;
        }

        public Criteria andEdittimeIsNotNull() {
            addCriterion("edittime is not null");
            return (Criteria) this;
        }

        public Criteria andEdittimeEqualTo(Date value) {
            addCriterion("edittime =", value, "edittime");
            return (Criteria) this;
        }

        public Criteria andEdittimeIn(List<Date> values) {
            addCriterion("edittime in", values, "edittime");
            return (Criteria) this;
        }

        public Criteria andEdittimeNotIn(List<Date> values) {
            addCriterion("edittime not in", values, "edittime");
            return (Criteria) this;
        }

        public Criteria andEdittimeBetween(Date value1, Date value2) {
            addCriterion("edittime between", value1, value2, "edittime");
            return (Criteria) this;
        }

        public Criteria andEdittimeNotBetween(Date value1, Date value2) {
            addCriterion("edittime not between", value1, value2, "edittime");
            return (Criteria) this;
        }

        public Criteria andMchnoIsNull() {
            addCriterion("mchno is null");
            return (Criteria) this;
        }

        public Criteria andMchnoIsNotNull() {
            addCriterion("mchno is not null");
            return (Criteria) this;
        }

        public Criteria andMchnoEqualTo(String value) {
            addCriterion("mchno =", value, "mchno");
            return (Criteria) this;
        }
        
        
        public Criteria andMchnoNotEqualTo(String value) {
            addCriterion("mchno <>", value, "mchno");
            return (Criteria) this;
        }

        public Criteria andMchnoLike(String value) {
            addCriterion("mchno like", value, "mchno");
            return (Criteria) this;
        }

        public Criteria andMchnoNotLike(String value) {
            addCriterion("mchno not like", value, "mchno");
            return (Criteria) this;
        }

        public Criteria andMchnoIn(List<String> values) {
            addCriterion("mchno in", values, "mchno");
            return (Criteria) this;
        }

        public Criteria andMchnoNotIn(List<String> values) {
            addCriterion("mchno not in", values, "mchno");
            return (Criteria) this;
        }
        
        public Criteria andTernoEqualTo(String value) {
            addCriterion("terno =", value, "terno");
            return (Criteria) this;
        }

        public Criteria andPgmvEqualTo(String value) {
            addCriterion("pgmv =", value, "pgmv");
            return (Criteria) this;
        }
        
        public Criteria andUseridEqualTo(String value) {
            addCriterion("userid =", value, "userid");
            return (Criteria) this;
        }
        
        public Criteria andEdittypeEqualTo(String value) {
            addCriterion("edittype =", value, "edittype");
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



        public Criteria andRemarkLike(String value) {
            addCriterion("remark like", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotLike(String value) {
            addCriterion("remark not like", value, "remark");
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