package com.itgaoshu.hospital.bean;

import java.util.ArrayList;
import java.util.List;

public class HomeExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public HomeExample() {
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

        public Criteria andHomeidIsNull() {
            addCriterion("homeId is null");
            return (Criteria) this;
        }

        public Criteria andHomeidIsNotNull() {
            addCriterion("homeId is not null");
            return (Criteria) this;
        }

        public Criteria andHomeidEqualTo(Integer value) {
            addCriterion("homeId =", value, "homeid");
            return (Criteria) this;
        }

        public Criteria andHomeidNotEqualTo(Integer value) {
            addCriterion("homeId <>", value, "homeid");
            return (Criteria) this;
        }

        public Criteria andHomeidGreaterThan(Integer value) {
            addCriterion("homeId >", value, "homeid");
            return (Criteria) this;
        }

        public Criteria andHomeidGreaterThanOrEqualTo(Integer value) {
            addCriterion("homeId >=", value, "homeid");
            return (Criteria) this;
        }

        public Criteria andHomeidLessThan(Integer value) {
            addCriterion("homeId <", value, "homeid");
            return (Criteria) this;
        }

        public Criteria andHomeidLessThanOrEqualTo(Integer value) {
            addCriterion("homeId <=", value, "homeid");
            return (Criteria) this;
        }

        public Criteria andHomeidIn(List<Integer> values) {
            addCriterion("homeId in", values, "homeid");
            return (Criteria) this;
        }

        public Criteria andHomeidNotIn(List<Integer> values) {
            addCriterion("homeId not in", values, "homeid");
            return (Criteria) this;
        }

        public Criteria andHomeidBetween(Integer value1, Integer value2) {
            addCriterion("homeId between", value1, value2, "homeid");
            return (Criteria) this;
        }

        public Criteria andHomeidNotBetween(Integer value1, Integer value2) {
            addCriterion("homeId not between", value1, value2, "homeid");
            return (Criteria) this;
        }

        public Criteria andHomenameIsNull() {
            addCriterion("homeName is null");
            return (Criteria) this;
        }

        public Criteria andHomenameIsNotNull() {
            addCriterion("homeName is not null");
            return (Criteria) this;
        }

        public Criteria andHomenameEqualTo(String value) {
            addCriterion("homeName =", value, "homename");
            return (Criteria) this;
        }

        public Criteria andHomenameNotEqualTo(String value) {
            addCriterion("homeName <>", value, "homename");
            return (Criteria) this;
        }

        public Criteria andHomenameGreaterThan(String value) {
            addCriterion("homeName >", value, "homename");
            return (Criteria) this;
        }

        public Criteria andHomenameGreaterThanOrEqualTo(String value) {
            addCriterion("homeName >=", value, "homename");
            return (Criteria) this;
        }

        public Criteria andHomenameLessThan(String value) {
            addCriterion("homeName <", value, "homename");
            return (Criteria) this;
        }

        public Criteria andHomenameLessThanOrEqualTo(String value) {
            addCriterion("homeName <=", value, "homename");
            return (Criteria) this;
        }

        public Criteria andHomenameLike(String value) {
            addCriterion("homeName like", value, "homename");
            return (Criteria) this;
        }

        public Criteria andHomenameNotLike(String value) {
            addCriterion("homeName not like", value, "homename");
            return (Criteria) this;
        }

        public Criteria andHomenameIn(List<String> values) {
            addCriterion("homeName in", values, "homename");
            return (Criteria) this;
        }

        public Criteria andHomenameNotIn(List<String> values) {
            addCriterion("homeName not in", values, "homename");
            return (Criteria) this;
        }

        public Criteria andHomenameBetween(String value1, String value2) {
            addCriterion("homeName between", value1, value2, "homename");
            return (Criteria) this;
        }

        public Criteria andHomenameNotBetween(String value1, String value2) {
            addCriterion("homeName not between", value1, value2, "homename");
            return (Criteria) this;
        }

        public Criteria andSexIsNull() {
            addCriterion("sex is null");
            return (Criteria) this;
        }

        public Criteria andSexIsNotNull() {
            addCriterion("sex is not null");
            return (Criteria) this;
        }

        public Criteria andSexEqualTo(String value) {
            addCriterion("sex =", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexNotEqualTo(String value) {
            addCriterion("sex <>", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexGreaterThan(String value) {
            addCriterion("sex >", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexGreaterThanOrEqualTo(String value) {
            addCriterion("sex >=", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexLessThan(String value) {
            addCriterion("sex <", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexLessThanOrEqualTo(String value) {
            addCriterion("sex <=", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexLike(String value) {
            addCriterion("sex like", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexNotLike(String value) {
            addCriterion("sex not like", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexIn(List<String> values) {
            addCriterion("sex in", values, "sex");
            return (Criteria) this;
        }

        public Criteria andSexNotIn(List<String> values) {
            addCriterion("sex not in", values, "sex");
            return (Criteria) this;
        }

        public Criteria andSexBetween(String value1, String value2) {
            addCriterion("sex between", value1, value2, "sex");
            return (Criteria) this;
        }

        public Criteria andSexNotBetween(String value1, String value2) {
            addCriterion("sex not between", value1, value2, "sex");
            return (Criteria) this;
        }

        public Criteria andAgeIsNull() {
            addCriterion("age is null");
            return (Criteria) this;
        }

        public Criteria andAgeIsNotNull() {
            addCriterion("age is not null");
            return (Criteria) this;
        }

        public Criteria andAgeEqualTo(Integer value) {
            addCriterion("age =", value, "age");
            return (Criteria) this;
        }

        public Criteria andAgeNotEqualTo(Integer value) {
            addCriterion("age <>", value, "age");
            return (Criteria) this;
        }

        public Criteria andAgeGreaterThan(Integer value) {
            addCriterion("age >", value, "age");
            return (Criteria) this;
        }

        public Criteria andAgeGreaterThanOrEqualTo(Integer value) {
            addCriterion("age >=", value, "age");
            return (Criteria) this;
        }

        public Criteria andAgeLessThan(Integer value) {
            addCriterion("age <", value, "age");
            return (Criteria) this;
        }

        public Criteria andAgeLessThanOrEqualTo(Integer value) {
            addCriterion("age <=", value, "age");
            return (Criteria) this;
        }

        public Criteria andAgeIn(List<Integer> values) {
            addCriterion("age in", values, "age");
            return (Criteria) this;
        }

        public Criteria andAgeNotIn(List<Integer> values) {
            addCriterion("age not in", values, "age");
            return (Criteria) this;
        }

        public Criteria andAgeBetween(Integer value1, Integer value2) {
            addCriterion("age between", value1, value2, "age");
            return (Criteria) this;
        }

        public Criteria andAgeNotBetween(Integer value1, Integer value2) {
            addCriterion("age not between", value1, value2, "age");
            return (Criteria) this;
        }

        public Criteria andCaridIsNull() {
            addCriterion("carId is null");
            return (Criteria) this;
        }

        public Criteria andCaridIsNotNull() {
            addCriterion("carId is not null");
            return (Criteria) this;
        }

        public Criteria andCaridEqualTo(String value) {
            addCriterion("carId =", value, "carid");
            return (Criteria) this;
        }

        public Criteria andCaridNotEqualTo(String value) {
            addCriterion("carId <>", value, "carid");
            return (Criteria) this;
        }

        public Criteria andCaridGreaterThan(String value) {
            addCriterion("carId >", value, "carid");
            return (Criteria) this;
        }

        public Criteria andCaridGreaterThanOrEqualTo(String value) {
            addCriterion("carId >=", value, "carid");
            return (Criteria) this;
        }

        public Criteria andCaridLessThan(String value) {
            addCriterion("carId <", value, "carid");
            return (Criteria) this;
        }

        public Criteria andCaridLessThanOrEqualTo(String value) {
            addCriterion("carId <=", value, "carid");
            return (Criteria) this;
        }

        public Criteria andCaridLike(String value) {
            addCriterion("carId like", value, "carid");
            return (Criteria) this;
        }

        public Criteria andCaridNotLike(String value) {
            addCriterion("carId not like", value, "carid");
            return (Criteria) this;
        }

        public Criteria andCaridIn(List<String> values) {
            addCriterion("carId in", values, "carid");
            return (Criteria) this;
        }

        public Criteria andCaridNotIn(List<String> values) {
            addCriterion("carId not in", values, "carid");
            return (Criteria) this;
        }

        public Criteria andCaridBetween(String value1, String value2) {
            addCriterion("carId between", value1, value2, "carid");
            return (Criteria) this;
        }

        public Criteria andCaridNotBetween(String value1, String value2) {
            addCriterion("carId not between", value1, value2, "carid");
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

        public Criteria andPhoneGreaterThan(String value) {
            addCriterion("phone >", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneGreaterThanOrEqualTo(String value) {
            addCriterion("phone >=", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneLessThan(String value) {
            addCriterion("phone <", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneLessThanOrEqualTo(String value) {
            addCriterion("phone <=", value, "phone");
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

        public Criteria andPhoneBetween(String value1, String value2) {
            addCriterion("phone between", value1, value2, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneNotBetween(String value1, String value2) {
            addCriterion("phone not between", value1, value2, "phone");
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