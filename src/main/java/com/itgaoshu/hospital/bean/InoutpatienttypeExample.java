package com.itgaoshu.hospital.bean;

import java.util.ArrayList;
import java.util.List;

public class InoutpatienttypeExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public InoutpatienttypeExample() {
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

        public Criteria andInoutpatientidIsNull() {
            addCriterion("inoutpatientId is null");
            return (Criteria) this;
        }

        public Criteria andInoutpatientidIsNotNull() {
            addCriterion("inoutpatientId is not null");
            return (Criteria) this;
        }

        public Criteria andInoutpatientidEqualTo(Integer value) {
            addCriterion("inoutpatientId =", value, "inoutpatientid");
            return (Criteria) this;
        }

        public Criteria andInoutpatientidNotEqualTo(Integer value) {
            addCriterion("inoutpatientId <>", value, "inoutpatientid");
            return (Criteria) this;
        }

        public Criteria andInoutpatientidGreaterThan(Integer value) {
            addCriterion("inoutpatientId >", value, "inoutpatientid");
            return (Criteria) this;
        }

        public Criteria andInoutpatientidGreaterThanOrEqualTo(Integer value) {
            addCriterion("inoutpatientId >=", value, "inoutpatientid");
            return (Criteria) this;
        }

        public Criteria andInoutpatientidLessThan(Integer value) {
            addCriterion("inoutpatientId <", value, "inoutpatientid");
            return (Criteria) this;
        }

        public Criteria andInoutpatientidLessThanOrEqualTo(Integer value) {
            addCriterion("inoutpatientId <=", value, "inoutpatientid");
            return (Criteria) this;
        }

        public Criteria andInoutpatientidIn(List<Integer> values) {
            addCriterion("inoutpatientId in", values, "inoutpatientid");
            return (Criteria) this;
        }

        public Criteria andInoutpatientidNotIn(List<Integer> values) {
            addCriterion("inoutpatientId not in", values, "inoutpatientid");
            return (Criteria) this;
        }

        public Criteria andInoutpatientidBetween(Integer value1, Integer value2) {
            addCriterion("inoutpatientId between", value1, value2, "inoutpatientid");
            return (Criteria) this;
        }

        public Criteria andInoutpatientidNotBetween(Integer value1, Integer value2) {
            addCriterion("inoutpatientId not between", value1, value2, "inoutpatientid");
            return (Criteria) this;
        }

        public Criteria andProjectnameIsNull() {
            addCriterion("projectName is null");
            return (Criteria) this;
        }

        public Criteria andProjectnameIsNotNull() {
            addCriterion("projectName is not null");
            return (Criteria) this;
        }

        public Criteria andProjectnameEqualTo(String value) {
            addCriterion("projectName =", value, "projectname");
            return (Criteria) this;
        }

        public Criteria andProjectnameNotEqualTo(String value) {
            addCriterion("projectName <>", value, "projectname");
            return (Criteria) this;
        }

        public Criteria andProjectnameGreaterThan(String value) {
            addCriterion("projectName >", value, "projectname");
            return (Criteria) this;
        }

        public Criteria andProjectnameGreaterThanOrEqualTo(String value) {
            addCriterion("projectName >=", value, "projectname");
            return (Criteria) this;
        }

        public Criteria andProjectnameLessThan(String value) {
            addCriterion("projectName <", value, "projectname");
            return (Criteria) this;
        }

        public Criteria andProjectnameLessThanOrEqualTo(String value) {
            addCriterion("projectName <=", value, "projectname");
            return (Criteria) this;
        }

        public Criteria andProjectnameLike(String value) {
            addCriterion("projectName like", value, "projectname");
            return (Criteria) this;
        }

        public Criteria andProjectnameNotLike(String value) {
            addCriterion("projectName not like", value, "projectname");
            return (Criteria) this;
        }

        public Criteria andProjectnameIn(List<String> values) {
            addCriterion("projectName in", values, "projectname");
            return (Criteria) this;
        }

        public Criteria andProjectnameNotIn(List<String> values) {
            addCriterion("projectName not in", values, "projectname");
            return (Criteria) this;
        }

        public Criteria andProjectnameBetween(String value1, String value2) {
            addCriterion("projectName between", value1, value2, "projectname");
            return (Criteria) this;
        }

        public Criteria andProjectnameNotBetween(String value1, String value2) {
            addCriterion("projectName not between", value1, value2, "projectname");
            return (Criteria) this;
        }

        public Criteria andUnitIsNull() {
            addCriterion("unit is null");
            return (Criteria) this;
        }

        public Criteria andUnitIsNotNull() {
            addCriterion("unit is not null");
            return (Criteria) this;
        }

        public Criteria andUnitEqualTo(Integer value) {
            addCriterion("unit =", value, "unit");
            return (Criteria) this;
        }

        public Criteria andUnitNotEqualTo(Integer value) {
            addCriterion("unit <>", value, "unit");
            return (Criteria) this;
        }

        public Criteria andUnitGreaterThan(Integer value) {
            addCriterion("unit >", value, "unit");
            return (Criteria) this;
        }

        public Criteria andUnitGreaterThanOrEqualTo(Integer value) {
            addCriterion("unit >=", value, "unit");
            return (Criteria) this;
        }

        public Criteria andUnitLessThan(Integer value) {
            addCriterion("unit <", value, "unit");
            return (Criteria) this;
        }

        public Criteria andUnitLessThanOrEqualTo(Integer value) {
            addCriterion("unit <=", value, "unit");
            return (Criteria) this;
        }

        public Criteria andUnitIn(List<Integer> values) {
            addCriterion("unit in", values, "unit");
            return (Criteria) this;
        }

        public Criteria andUnitNotIn(List<Integer> values) {
            addCriterion("unit not in", values, "unit");
            return (Criteria) this;
        }

        public Criteria andUnitBetween(Integer value1, Integer value2) {
            addCriterion("unit between", value1, value2, "unit");
            return (Criteria) this;
        }

        public Criteria andUnitNotBetween(Integer value1, Integer value2) {
            addCriterion("unit not between", value1, value2, "unit");
            return (Criteria) this;
        }

        public Criteria andBigprojectidIsNull() {
            addCriterion("bigproJectId is null");
            return (Criteria) this;
        }

        public Criteria andBigprojectidIsNotNull() {
            addCriterion("bigproJectId is not null");
            return (Criteria) this;
        }

        public Criteria andBigprojectidEqualTo(Integer value) {
            addCriterion("bigproJectId =", value, "bigprojectid");
            return (Criteria) this;
        }

        public Criteria andBigprojectidNotEqualTo(Integer value) {
            addCriterion("bigproJectId <>", value, "bigprojectid");
            return (Criteria) this;
        }

        public Criteria andBigprojectidGreaterThan(Integer value) {
            addCriterion("bigproJectId >", value, "bigprojectid");
            return (Criteria) this;
        }

        public Criteria andBigprojectidGreaterThanOrEqualTo(Integer value) {
            addCriterion("bigproJectId >=", value, "bigprojectid");
            return (Criteria) this;
        }

        public Criteria andBigprojectidLessThan(Integer value) {
            addCriterion("bigproJectId <", value, "bigprojectid");
            return (Criteria) this;
        }

        public Criteria andBigprojectidLessThanOrEqualTo(Integer value) {
            addCriterion("bigproJectId <=", value, "bigprojectid");
            return (Criteria) this;
        }

        public Criteria andBigprojectidIn(List<Integer> values) {
            addCriterion("bigproJectId in", values, "bigprojectid");
            return (Criteria) this;
        }

        public Criteria andBigprojectidNotIn(List<Integer> values) {
            addCriterion("bigproJectId not in", values, "bigprojectid");
            return (Criteria) this;
        }

        public Criteria andBigprojectidBetween(Integer value1, Integer value2) {
            addCriterion("bigproJectId between", value1, value2, "bigprojectid");
            return (Criteria) this;
        }

        public Criteria andBigprojectidNotBetween(Integer value1, Integer value2) {
            addCriterion("bigproJectId not between", value1, value2, "bigprojectid");
            return (Criteria) this;
        }

        public Criteria andPriceIsNull() {
            addCriterion("price is null");
            return (Criteria) this;
        }

        public Criteria andPriceIsNotNull() {
            addCriterion("price is not null");
            return (Criteria) this;
        }

        public Criteria andPriceEqualTo(Double value) {
            addCriterion("price =", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceNotEqualTo(Double value) {
            addCriterion("price <>", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceGreaterThan(Double value) {
            addCriterion("price >", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceGreaterThanOrEqualTo(Double value) {
            addCriterion("price >=", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceLessThan(Double value) {
            addCriterion("price <", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceLessThanOrEqualTo(Double value) {
            addCriterion("price <=", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceIn(List<Double> values) {
            addCriterion("price in", values, "price");
            return (Criteria) this;
        }

        public Criteria andPriceNotIn(List<Double> values) {
            addCriterion("price not in", values, "price");
            return (Criteria) this;
        }

        public Criteria andPriceBetween(Double value1, Double value2) {
            addCriterion("price between", value1, value2, "price");
            return (Criteria) this;
        }

        public Criteria andPriceNotBetween(Double value1, Double value2) {
            addCriterion("price not between", value1, value2, "price");
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