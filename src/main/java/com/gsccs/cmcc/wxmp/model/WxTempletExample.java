package com.gsccs.cmcc.wxmp.model;

import java.util.ArrayList;
import java.util.List;

import com.gsccs.plat.bass.BaseExample;

public class WxTempletExample extends BaseExample {

	protected String orderByClause;
	protected boolean distinct;

	protected List<Criteria> oredCriteria;

	public WxTempletExample() {
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

		protected void addCriterion(String condition, Object value,
				String property) {
			if (value == null) {
				throw new RuntimeException("Value for " + property
						+ " cannot be null");
			}
			criteria.add(new Criterion(condition, value));
		}

		protected void addCriterion(String condition, Object value1,
				Object value2, String property) {
			if (value1 == null || value2 == null) {
				throw new RuntimeException("Between values for " + property
						+ " cannot be null");
			}
			criteria.add(new Criterion(condition, value1, value2));
		}

		
		public Criteria andNameIsNull() {
			addCriterion("name is null");
			return (Criteria) this;
		}

		public Criteria andNameIsNotNull() {
			addCriterion("name is not null");
			return (Criteria) this;
		}

		public Criteria andNameEqualTo(String value) {
			addCriterion("name =", value, "name");
			return (Criteria) this;
		}

		public Criteria andNameNotEqualTo(String value) {
			addCriterion("name <>", value, "name");
			return (Criteria) this;
		}

		public Criteria andNameLike(String value) {
			addCriterion("name like", value, "name");
			return (Criteria) this;
		}

		public Criteria andNameNotLike(String value) {
			addCriterion("name not like", value, "name");
			return (Criteria) this;
		}

		public Criteria andWxappidIsNull() {
			addCriterion("wxappid is null");
			return (Criteria) this;
		}

		public Criteria andWxappidIsNotNull() {
			addCriterion("wxappid is not null");
			return (Criteria) this;
		}

		public Criteria andWxappidEqualTo(String value) {
			addCriterion("wxappid =", value, "wxappid");
			return (Criteria) this;
		}

		public Criteria andWxappidNotEqualTo(String value) {
			addCriterion("wxappid <>", value, "wxappid");
			return (Criteria) this;
		}

		public Criteria andWxappidLike(String value) {
			addCriterion("wxappid like", value, "wxappid");
			return (Criteria) this;
		}

		public Criteria andWxappidNotLike(String value) {
			addCriterion("wxappid not like", value, "wxappid");
			return (Criteria) this;
		}

		public Criteria andWxappidIn(List<String> values) {
			addCriterion("wxappid in", values, "wxappid");
			return (Criteria) this;
		}

		public Criteria andWxappidNotIn(List<String> values) {
			addCriterion("wxappid not in", values, "wxappid");
			return (Criteria) this;
		}

		public Criteria andShortidIsNull() {
			addCriterion("shortid is null");
			return (Criteria) this;
		}

		public Criteria andShortidIsNotNull() {
			addCriterion("shortid is not null");
			return (Criteria) this;
		}

		public Criteria andShortidEqualTo(String value) {
			addCriterion("shortid =", value, "shortid");
			return (Criteria) this;
		}

		public Criteria andShortidNotEqualTo(String value) {
			addCriterion("shortid <>", value, "shortid");
			return (Criteria) this;
		}

		public Criteria andShortidIn(List<String> values) {
			addCriterion("shortid in", values, "shortid");
			return (Criteria) this;
		}

		public Criteria andShortidNotIn(List<String> values) {
			addCriterion("shortid not in", values, "shortid");
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

		protected Criterion(String condition, Object value, Object secondValue,
				String typeHandler) {
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