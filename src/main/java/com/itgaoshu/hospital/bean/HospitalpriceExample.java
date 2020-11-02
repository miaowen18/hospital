package com.itgaoshu.hospital.bean;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class HospitalpriceExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public HospitalpriceExample() {
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

        public Criteria andHospitalpriceidIsNull() {
            addCriterion("hospitalpriceid is null");
            return (Criteria) this;
        }

        public Criteria andHospitalpriceidIsNotNull() {
            addCriterion("hospitalpriceid is not null");
            return (Criteria) this;
        }

        public Criteria andHospitalpriceidEqualTo(Integer value) {
            addCriterion("hospitalpriceid =", value, "hospitalpriceid");
            return (Criteria) this;
        }

        public Criteria andHospitalpriceidNotEqualTo(Integer value) {
            addCriterion("hospitalpriceid <>", value, "hospitalpriceid");
            return (Criteria) this;
        }

        public Criteria andHospitalpriceidGreaterThan(Integer value) {
            addCriterion("hospitalpriceid >", value, "hospitalpriceid");
            return (Criteria) this;
        }

        public Criteria andHospitalpriceidGreaterThanOrEqualTo(Integer value) {
            addCriterion("hospitalpriceid >=", value, "hospitalpriceid");
            return (Criteria) this;
        }

        public Criteria andHospitalpriceidLessThan(Integer value) {
            addCriterion("hospitalpriceid <", value, "hospitalpriceid");
            return (Criteria) this;
        }

        public Criteria andHospitalpriceidLessThanOrEqualTo(Integer value) {
            addCriterion("hospitalpriceid <=", value, "hospitalpriceid");
            return (Criteria) this;
        }

        public Criteria andHospitalpriceidIn(List<Integer> values) {
            addCriterion("hospitalpriceid in", values, "hospitalpriceid");
            return (Criteria) this;
        }

        public Criteria andHospitalpriceidNotIn(List<Integer> values) {
            addCriterion("hospitalpriceid not in", values, "hospitalpriceid");
            return (Criteria) this;
        }

        public Criteria andHospitalpriceidBetween(Integer value1, Integer value2) {
            addCriterion("hospitalpriceid between", value1, value2, "hospitalpriceid");
            return (Criteria) this;
        }

        public Criteria andHospitalpriceidNotBetween(Integer value1, Integer value2) {
            addCriterion("hospitalpriceid not between", value1, value2, "hospitalpriceid");
            return (Criteria) this;
        }

        public Criteria andRegisteridIsNull() {
            addCriterion("registerId is null");
            return (Criteria) this;
        }

        public Criteria andRegisteridIsNotNull() {
            addCriterion("registerId is not null");
            return (Criteria) this;
        }

        public Criteria andRegisteridEqualTo(Integer value) {
            addCriterion("registerId =", value, "registerid");
            return (Criteria) this;
        }

        public Criteria andRegisteridNotEqualTo(Integer value) {
            addCriterion("registerId <>", value, "registerid");
            return (Criteria) this;
        }

        public Criteria andRegisteridGreaterThan(Integer value) {
            addCriterion("registerId >", value, "registerid");
            return (Criteria) this;
        }

        public Criteria andRegisteridGreaterThanOrEqualTo(Integer value) {
            addCriterion("registerId >=", value, "registerid");
            return (Criteria) this;
        }

        public Criteria andRegisteridLessThan(Integer value) {
            addCriterion("registerId <", value, "registerid");
            return (Criteria) this;
        }

        public Criteria andRegisteridLessThanOrEqualTo(Integer value) {
            addCriterion("registerId <=", value, "registerid");
            return (Criteria) this;
        }

        public Criteria andRegisteridIn(List<Integer> values) {
            addCriterion("registerId in", values, "registerid");
            return (Criteria) this;
        }

        public Criteria andRegisteridNotIn(List<Integer> values) {
            addCriterion("registerId not in", values, "registerid");
            return (Criteria) this;
        }

        public Criteria andRegisteridBetween(Integer value1, Integer value2) {
            addCriterion("registerId between", value1, value2, "registerid");
            return (Criteria) this;
        }

        public Criteria andRegisteridNotBetween(Integer value1, Integer value2) {
            addCriterion("registerId not between", value1, value2, "registerid");
            return (Criteria) this;
        }

        public Criteria andDurgnameIsNull() {
            addCriterion("durgname is null");
            return (Criteria) this;
        }

        public Criteria andDurgnameIsNotNull() {
            addCriterion("durgname is not null");
            return (Criteria) this;
        }

        public Criteria andDurgnameEqualTo(String value) {
            addCriterion("durgname =", value, "durgname");
            return (Criteria) this;
        }

        public Criteria andDurgnameNotEqualTo(String value) {
            addCriterion("durgname <>", value, "durgname");
            return (Criteria) this;
        }

        public Criteria andDurgnameGreaterThan(String value) {
            addCriterion("durgname >", value, "durgname");
            return (Criteria) this;
        }

        public Criteria andDurgnameGreaterThanOrEqualTo(String value) {
            addCriterion("durgname >=", value, "durgname");
            return (Criteria) this;
        }

        public Criteria andDurgnameLessThan(String value) {
            addCriterion("durgname <", value, "durgname");
            return (Criteria) this;
        }

        public Criteria andDurgnameLessThanOrEqualTo(String value) {
            addCriterion("durgname <=", value, "durgname");
            return (Criteria) this;
        }

        public Criteria andDurgnameLike(String value) {
            addCriterion("durgname like", value, "durgname");
            return (Criteria) this;
        }

        public Criteria andDurgnameNotLike(String value) {
            addCriterion("durgname not like", value, "durgname");
            return (Criteria) this;
        }

        public Criteria andDurgnameIn(List<String> values) {
            addCriterion("durgname in", values, "durgname");
            return (Criteria) this;
        }

        public Criteria andDurgnameNotIn(List<String> values) {
            addCriterion("durgname not in", values, "durgname");
            return (Criteria) this;
        }

        public Criteria andDurgnameBetween(String value1, String value2) {
            addCriterion("durgname between", value1, value2, "durgname");
            return (Criteria) this;
        }

        public Criteria andDurgnameNotBetween(String value1, String value2) {
            addCriterion("durgname not between", value1, value2, "durgname");
            return (Criteria) this;
        }

        public Criteria andDurgnumIsNull() {
            addCriterion("durgnum is null");
            return (Criteria) this;
        }

        public Criteria andDurgnumIsNotNull() {
            addCriterion("durgnum is not null");
            return (Criteria) this;
        }

        public Criteria andDurgnumEqualTo(Integer value) {
            addCriterion("durgnum =", value, "durgnum");
            return (Criteria) this;
        }

        public Criteria andDurgnumNotEqualTo(Integer value) {
            addCriterion("durgnum <>", value, "durgnum");
            return (Criteria) this;
        }

        public Criteria andDurgnumGreaterThan(Integer value) {
            addCriterion("durgnum >", value, "durgnum");
            return (Criteria) this;
        }

        public Criteria andDurgnumGreaterThanOrEqualTo(Integer value) {
            addCriterion("durgnum >=", value, "durgnum");
            return (Criteria) this;
        }

        public Criteria andDurgnumLessThan(Integer value) {
            addCriterion("durgnum <", value, "durgnum");
            return (Criteria) this;
        }

        public Criteria andDurgnumLessThanOrEqualTo(Integer value) {
            addCriterion("durgnum <=", value, "durgnum");
            return (Criteria) this;
        }

        public Criteria andDurgnumIn(List<Integer> values) {
            addCriterion("durgnum in", values, "durgnum");
            return (Criteria) this;
        }

        public Criteria andDurgnumNotIn(List<Integer> values) {
            addCriterion("durgnum not in", values, "durgnum");
            return (Criteria) this;
        }

        public Criteria andDurgnumBetween(Integer value1, Integer value2) {
            addCriterion("durgnum between", value1, value2, "durgnum");
            return (Criteria) this;
        }

        public Criteria andDurgnumNotBetween(Integer value1, Integer value2) {
            addCriterion("durgnum not between", value1, value2, "durgnum");
            return (Criteria) this;
        }

        public Criteria andRepicepriceIsNull() {
            addCriterion("repiceprice is null");
            return (Criteria) this;
        }

        public Criteria andRepicepriceIsNotNull() {
            addCriterion("repiceprice is not null");
            return (Criteria) this;
        }

        public Criteria andRepicepriceEqualTo(Double value) {
            addCriterion("repiceprice =", value, "repiceprice");
            return (Criteria) this;
        }

        public Criteria andRepicepriceNotEqualTo(Double value) {
            addCriterion("repiceprice <>", value, "repiceprice");
            return (Criteria) this;
        }

        public Criteria andRepicepriceGreaterThan(Double value) {
            addCriterion("repiceprice >", value, "repiceprice");
            return (Criteria) this;
        }

        public Criteria andRepicepriceGreaterThanOrEqualTo(Double value) {
            addCriterion("repiceprice >=", value, "repiceprice");
            return (Criteria) this;
        }

        public Criteria andRepicepriceLessThan(Double value) {
            addCriterion("repiceprice <", value, "repiceprice");
            return (Criteria) this;
        }

        public Criteria andRepicepriceLessThanOrEqualTo(Double value) {
            addCriterion("repiceprice <=", value, "repiceprice");
            return (Criteria) this;
        }

        public Criteria andRepicepriceIn(List<Double> values) {
            addCriterion("repiceprice in", values, "repiceprice");
            return (Criteria) this;
        }

        public Criteria andRepicepriceNotIn(List<Double> values) {
            addCriterion("repiceprice not in", values, "repiceprice");
            return (Criteria) this;
        }

        public Criteria andRepicepriceBetween(Double value1, Double value2) {
            addCriterion("repiceprice between", value1, value2, "repiceprice");
            return (Criteria) this;
        }

        public Criteria andRepicepriceNotBetween(Double value1, Double value2) {
            addCriterion("repiceprice not between", value1, value2, "repiceprice");
            return (Criteria) this;
        }

        public Criteria andRepicetotalIsNull() {
            addCriterion("repicetotal is null");
            return (Criteria) this;
        }

        public Criteria andRepicetotalIsNotNull() {
            addCriterion("repicetotal is not null");
            return (Criteria) this;
        }

        public Criteria andRepicetotalEqualTo(Double value) {
            addCriterion("repicetotal =", value, "repicetotal");
            return (Criteria) this;
        }

        public Criteria andRepicetotalNotEqualTo(Double value) {
            addCriterion("repicetotal <>", value, "repicetotal");
            return (Criteria) this;
        }

        public Criteria andRepicetotalGreaterThan(Double value) {
            addCriterion("repicetotal >", value, "repicetotal");
            return (Criteria) this;
        }

        public Criteria andRepicetotalGreaterThanOrEqualTo(Double value) {
            addCriterion("repicetotal >=", value, "repicetotal");
            return (Criteria) this;
        }

        public Criteria andRepicetotalLessThan(Double value) {
            addCriterion("repicetotal <", value, "repicetotal");
            return (Criteria) this;
        }

        public Criteria andRepicetotalLessThanOrEqualTo(Double value) {
            addCriterion("repicetotal <=", value, "repicetotal");
            return (Criteria) this;
        }

        public Criteria andRepicetotalIn(List<Double> values) {
            addCriterion("repicetotal in", values, "repicetotal");
            return (Criteria) this;
        }

        public Criteria andRepicetotalNotIn(List<Double> values) {
            addCriterion("repicetotal not in", values, "repicetotal");
            return (Criteria) this;
        }

        public Criteria andRepicetotalBetween(Double value1, Double value2) {
            addCriterion("repicetotal between", value1, value2, "repicetotal");
            return (Criteria) this;
        }

        public Criteria andRepicetotalNotBetween(Double value1, Double value2) {
            addCriterion("repicetotal not between", value1, value2, "repicetotal");
            return (Criteria) this;
        }

        public Criteria andHtimeIsNull() {
            addCriterion("htime is null");
            return (Criteria) this;
        }

        public Criteria andHtimeIsNotNull() {
            addCriterion("htime is not null");
            return (Criteria) this;
        }

        public Criteria andHtimeEqualTo(Date value) {
            addCriterion("htime =", value, "htime");
            return (Criteria) this;
        }

        public Criteria andHtimeNotEqualTo(Date value) {
            addCriterion("htime <>", value, "htime");
            return (Criteria) this;
        }

        public Criteria andHtimeGreaterThan(Date value) {
            addCriterion("htime >", value, "htime");
            return (Criteria) this;
        }

        public Criteria andHtimeGreaterThanOrEqualTo(Date value) {
            addCriterion("htime >=", value, "htime");
            return (Criteria) this;
        }

        public Criteria andHtimeLessThan(Date value) {
            addCriterion("htime <", value, "htime");
            return (Criteria) this;
        }

        public Criteria andHtimeLessThanOrEqualTo(Date value) {
            addCriterion("htime <=", value, "htime");
            return (Criteria) this;
        }

        public Criteria andHtimeIn(List<Date> values) {
            addCriterion("htime in", values, "htime");
            return (Criteria) this;
        }

        public Criteria andHtimeNotIn(List<Date> values) {
            addCriterion("htime not in", values, "htime");
            return (Criteria) this;
        }

        public Criteria andHtimeBetween(Date value1, Date value2) {
            addCriterion("htime between", value1, value2, "htime");
            return (Criteria) this;
        }

        public Criteria andHtimeNotBetween(Date value1, Date value2) {
            addCriterion("htime not between", value1, value2, "htime");
            return (Criteria) this;
        }

        public Criteria andStateIsNull() {
            addCriterion("state is null");
            return (Criteria) this;
        }

        public Criteria andStateIsNotNull() {
            addCriterion("state is not null");
            return (Criteria) this;
        }

        public Criteria andStateEqualTo(Integer value) {
            addCriterion("state =", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateNotEqualTo(Integer value) {
            addCriterion("state <>", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateGreaterThan(Integer value) {
            addCriterion("state >", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateGreaterThanOrEqualTo(Integer value) {
            addCriterion("state >=", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateLessThan(Integer value) {
            addCriterion("state <", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateLessThanOrEqualTo(Integer value) {
            addCriterion("state <=", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateIn(List<Integer> values) {
            addCriterion("state in", values, "state");
            return (Criteria) this;
        }

        public Criteria andStateNotIn(List<Integer> values) {
            addCriterion("state not in", values, "state");
            return (Criteria) this;
        }

        public Criteria andStateBetween(Integer value1, Integer value2) {
            addCriterion("state between", value1, value2, "state");
            return (Criteria) this;
        }

        public Criteria andStateNotBetween(Integer value1, Integer value2) {
            addCriterion("state not between", value1, value2, "state");
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