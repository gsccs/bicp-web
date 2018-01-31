package com.gsccs.cmcc.info.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.gsccs.plat.bass.BaseExample;

public class MerchantExample extends BaseExample {
	protected String orderByClause;

	protected boolean distinct;

	protected List<Criteria> oredCriteria;

	public MerchantExample() {
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

		public Criteria andIdcodeNotIn(List<String> values) {
			addCriterion("id not in", values, "id");
			return (Criteria) this;
		}

		public Criteria andTitleIsNull() {
			addCriterion("title is null");
			return (Criteria) this;
		}

		public Criteria andTitleIsNotNull() {
			addCriterion("title is not null");
			return (Criteria) this;
		}

		public Criteria andTitleEqualTo(String value) {
			addCriterion("title =", value, "title");
			return (Criteria) this;
		}


		public Criteria andTitleLike(String value) {
			addCriterion("title like", value, "title");
			return (Criteria) this;
		}

		public Criteria andTitleNotLike(String value) {
			addCriterion("title not like", value, "title");
			return (Criteria) this;
		}

		public Criteria andOrgcodeIsNull() {
			addCriterion("orgcode is null");
			return (Criteria) this;
		}

		public Criteria andOrgcodeIsNotNull() {
			addCriterion("orgcode is not null");
			return (Criteria) this;
		}

		public Criteria andOrgcodeEqualTo(String value) {
			addCriterion("orgcode =", value, "orgcode");
			return (Criteria) this;
		}

		public Criteria andOrgcodeNotEqualTo(String value) {
			addCriterion("orgcode <>", value, "orgcode");
			return (Criteria) this;
		}

		public Criteria andOrgcodeLike(String value) {
			addCriterion("orgcode like", value, "orgcode");
			return (Criteria) this;
		}

		public Criteria andOrgcodeNotLike(String value) {
			addCriterion("orgcode not like", value, "orgcode");
			return (Criteria) this;
		}

		public Criteria andOrgcodeIn(List<String> values) {
			addCriterion("orgcode in", values, "orgcode");
			return (Criteria) this;
		}

		public Criteria andOrgcodeNotIn(List<String> values) {
			addCriterion("orgcode not in", values, "orgcode");
			return (Criteria) this;
		}

		public Criteria andRegcodeIsNull() {
			addCriterion("regcode is null");
			return (Criteria) this;
		}

		public Criteria andRegcodeIsNotNull() {
			addCriterion("regcode is not null");
			return (Criteria) this;
		}

		public Criteria andRegcodeEqualTo(String value) {
			addCriterion("regcode =", value, "regcode");
			return (Criteria) this;
		}

		public Criteria andRegcodeNotEqualTo(String value) {
			addCriterion("regcode <>", value, "regcode");
			return (Criteria) this;
		}

		

		public Criteria andRegcodeLike(String value) {
			addCriterion("regcode like", value, "regcode");
			return (Criteria) this;
		}

		public Criteria andRegcodeNotLike(String value) {
			addCriterion("regcode not like", value, "regcode");
			return (Criteria) this;
		}

		public Criteria andRegcodeIn(List<String> values) {
			addCriterion("regcode in", values, "regcode");
			return (Criteria) this;
		}

		public Criteria andRegcodeNotIn(List<String> values) {
			addCriterion("regcode not in", values, "regcode");
			return (Criteria) this;
		}

		
		public Criteria andPhoneIsNull() {
			addCriterion("phone is null");
			return (Criteria) this;
		}

		public Criteria andPhoneIsNotNull() {
			addCriterion("phone is not null");
			return (Criteria) this;
		}

		public Criteria andPhoneEqualTo(String value) {
			addCriterion("phone =", value, "phone");
			return (Criteria) this;
		}

		public Criteria andPhoneNotEqualTo(String value) {
			addCriterion("phone <>", value, "phone");
			return (Criteria) this;
		}

		
		public Criteria andPhoneLike(String value) {
			addCriterion("phone like", value, "phone");
			return (Criteria) this;
		}

		public Criteria andPhoneNotLike(String value) {
			addCriterion("phone not like", value, "phone");
			return (Criteria) this;
		}

		public Criteria andPhoneIn(List<String> values) {
			addCriterion("phone in", values, "phone");
			return (Criteria) this;
		}

		public Criteria andPhoneNotIn(List<String> values) {
			addCriterion("phone not in", values, "phone");
			return (Criteria) this;
		}

		public Criteria andAcodeIsNull() {
			addCriterion("acode is null");
			return (Criteria) this;
		}

		public Criteria andAcodeIsNotNull() {
			addCriterion("acode is not null");
			return (Criteria) this;
		}

		public Criteria andAcodeEqualTo(Integer value) {
			addCriterion("acode =", value, "acode");
			return (Criteria) this;
		}

		public Criteria andAcodeNotEqualTo(String value) {
			addCriterion("acode <>", value, "acode");
			return (Criteria) this;
		}

		
		public Criteria andAcodeIn(List<String> values) {
			addCriterion("acode in", values, "acode");
			return (Criteria) this;
		}

		public Criteria andAcodeIn(String ids) {
			addCriterion("acode in (" + ids + ")");
			return (Criteria) this;
		}

		public Criteria andAcodeNotIn(List<String> values) {
			addCriterion("acode not in", values, "acode");
			return (Criteria) this;
		}

		public Criteria andAcodeBetween(String value1, String value2) {
			addCriterion("acode between", value1, value2, "acode");
			return (Criteria) this;
		}

		public Criteria andAcodeNotBetween(String value1, String value2) {
			addCriterion("acode not between", value1, value2, "acode");
			return (Criteria) this;
		}


		public Criteria andCreatedIsNull() {
			addCriterion("created is null");
			return (Criteria) this;
		}

		public Criteria andCreatedIsNotNull() {
			addCriterion("created is not null");
			return (Criteria) this;
		}

		public Criteria andCreatedEqualTo(String value) {
			addCriterion("created =", value, "created");
			return (Criteria) this;
		}

		public Criteria andCreatedNotEqualTo(String value) {
			addCriterion("created <>", value, "created");
			return (Criteria) this;
		}

		public Criteria andSql(String sql) {
			addCriterion(sql);
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

		public Criteria andStatusGreaterThan(String value) {
			addCriterion("status >", value, "status");
			return (Criteria) this;
		}

		public Criteria andStatusGreaterThanOrEqualTo(String value) {
			addCriterion("status >=", value, "status");
			return (Criteria) this;
		}

		public Criteria andStatusLessThan(String value) {
			addCriterion("status <", value, "status");
			return (Criteria) this;
		}

		public Criteria andStatusLessThanOrEqualTo(String value) {
			addCriterion("status <=", value, "status");
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

		public Criteria andAmuseridIsNull() {
			addCriterion("amuserid is null");
			return (Criteria) this;
		}

		public Criteria andAmuseridIsNotNull() {
			addCriterion("amuserid is not null");
			return (Criteria) this;
		}

		public Criteria andAmuseridEqualTo(Long value) {
			addCriterion("amuserid =", value, "amuserid");
			return (Criteria) this;
		}

		public Criteria andAmuseridNotEqualTo(Long value) {
			addCriterion("amuserid <>", value, "amuserid");
			return (Criteria) this;
		}

		public Criteria andAmuseridGreaterThan(Long value) {
			addCriterion("amuserid >", value, "amuserid");
			return (Criteria) this;
		}

		public Criteria andAmuseridGreaterThanOrEqualTo(Long value) {
			addCriterion("amuserid >=", value, "amuserid");
			return (Criteria) this;
		}

		public Criteria andAmuseridLessThan(Long value) {
			addCriterion("amuserid <", value, "amuserid");
			return (Criteria) this;
		}

		public Criteria andAmuseridLessThanOrEqualTo(Long value) {
			addCriterion("amuserid <=", value, "amuserid");
			return (Criteria) this;
		}

		public Criteria andAmuseridIn(List<Long> values) {
			addCriterion("amuserid in", values, "amuserid");
			return (Criteria) this;
		}

		public Criteria andAmuseridNotIn(List<Long> values) {
			addCriterion("amuserid not in", values, "amuserid");
			return (Criteria) this;
		}

		public Criteria andAmuseridBetween(Long value1, Long value2) {
			addCriterion("amuserid between", value1, value2, "amuserid");
			return (Criteria) this;
		}

		public Criteria andAmuseridNotBetween(Long value1, Long value2) {
			addCriterion("amuserid not between", value1, value2, "amuserid");
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