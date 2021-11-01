package com.xiexin.bean;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class FoodsExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    private Integer limit;

    private Long offset;

    public FoodsExample() {
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

    public void setLimit(Integer limit) {
        this.limit = limit;
    }

    public Integer getLimit() {
        return limit;
    }

    public void setOffset(Long offset) {
        this.offset = offset;
    }

    public Long getOffset() {
        return offset;
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

        protected void addCriterionForJDBCDate(String condition, Date value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value.getTime()), property);
        }

        protected void addCriterionForJDBCDate(String condition, List<Date> values, String property) {
            if (values == null || values.size() == 0) {
                throw new RuntimeException("Value list for " + property + " cannot be null or empty");
            }
            List<java.sql.Date> dateList = new ArrayList<java.sql.Date>();
            Iterator<Date> iter = values.iterator();
            while (iter.hasNext()) {
                dateList.add(new java.sql.Date(iter.next().getTime()));
            }
            addCriterion(condition, dateList, property);
        }

        protected void addCriterionForJDBCDate(String condition, Date value1, Date value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value1.getTime()), new java.sql.Date(value2.getTime()), property);
        }

        public Criteria andFoodIdIsNull() {
            addCriterion("food_id is null");
            return (Criteria) this;
        }

        public Criteria andFoodIdIsNotNull() {
            addCriterion("food_id is not null");
            return (Criteria) this;
        }

        public Criteria andFoodIdEqualTo(Integer value) {
            addCriterion("food_id =", value, "foodId");
            return (Criteria) this;
        }

        public Criteria andFoodIdNotEqualTo(Integer value) {
            addCriterion("food_id <>", value, "foodId");
            return (Criteria) this;
        }

        public Criteria andFoodIdGreaterThan(Integer value) {
            addCriterion("food_id >", value, "foodId");
            return (Criteria) this;
        }

        public Criteria andFoodIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("food_id >=", value, "foodId");
            return (Criteria) this;
        }

        public Criteria andFoodIdLessThan(Integer value) {
            addCriterion("food_id <", value, "foodId");
            return (Criteria) this;
        }

        public Criteria andFoodIdLessThanOrEqualTo(Integer value) {
            addCriterion("food_id <=", value, "foodId");
            return (Criteria) this;
        }

        public Criteria andFoodIdIn(List<Integer> values) {
            addCriterion("food_id in", values, "foodId");
            return (Criteria) this;
        }

        public Criteria andFoodIdNotIn(List<Integer> values) {
            addCriterion("food_id not in", values, "foodId");
            return (Criteria) this;
        }

        public Criteria andFoodIdBetween(Integer value1, Integer value2) {
            addCriterion("food_id between", value1, value2, "foodId");
            return (Criteria) this;
        }

        public Criteria andFoodIdNotBetween(Integer value1, Integer value2) {
            addCriterion("food_id not between", value1, value2, "foodId");
            return (Criteria) this;
        }

        public Criteria andFoodNameIsNull() {
            addCriterion("food_name is null");
            return (Criteria) this;
        }

        public Criteria andFoodNameIsNotNull() {
            addCriterion("food_name is not null");
            return (Criteria) this;
        }

        public Criteria andFoodNameEqualTo(String value) {
            addCriterion("food_name =", value, "foodName");
            return (Criteria) this;
        }

        public Criteria andFoodNameNotEqualTo(String value) {
            addCriterion("food_name <>", value, "foodName");
            return (Criteria) this;
        }

        public Criteria andFoodNameGreaterThan(String value) {
            addCriterion("food_name >", value, "foodName");
            return (Criteria) this;
        }

        public Criteria andFoodNameGreaterThanOrEqualTo(String value) {
            addCriterion("food_name >=", value, "foodName");
            return (Criteria) this;
        }

        public Criteria andFoodNameLessThan(String value) {
            addCriterion("food_name <", value, "foodName");
            return (Criteria) this;
        }

        public Criteria andFoodNameLessThanOrEqualTo(String value) {
            addCriterion("food_name <=", value, "foodName");
            return (Criteria) this;
        }

        public Criteria andFoodNameLike(String value) {
            addCriterion("food_name like", value, "foodName");
            return (Criteria) this;
        }

        public Criteria andFoodNameNotLike(String value) {
            addCriterion("food_name not like", value, "foodName");
            return (Criteria) this;
        }

        public Criteria andFoodNameIn(List<String> values) {
            addCriterion("food_name in", values, "foodName");
            return (Criteria) this;
        }

        public Criteria andFoodNameNotIn(List<String> values) {
            addCriterion("food_name not in", values, "foodName");
            return (Criteria) this;
        }

        public Criteria andFoodNameBetween(String value1, String value2) {
            addCriterion("food_name between", value1, value2, "foodName");
            return (Criteria) this;
        }

        public Criteria andFoodNameNotBetween(String value1, String value2) {
            addCriterion("food_name not between", value1, value2, "foodName");
            return (Criteria) this;
        }

        public Criteria andFoodPriceIsNull() {
            addCriterion("food_price is null");
            return (Criteria) this;
        }

        public Criteria andFoodPriceIsNotNull() {
            addCriterion("food_price is not null");
            return (Criteria) this;
        }

        public Criteria andFoodPriceEqualTo(Integer value) {
            addCriterion("food_price =", value, "foodPrice");
            return (Criteria) this;
        }

        public Criteria andFoodPriceNotEqualTo(Integer value) {
            addCriterion("food_price <>", value, "foodPrice");
            return (Criteria) this;
        }

        public Criteria andFoodPriceGreaterThan(Integer value) {
            addCriterion("food_price >", value, "foodPrice");
            return (Criteria) this;
        }

        public Criteria andFoodPriceGreaterThanOrEqualTo(Integer value) {
            addCriterion("food_price >=", value, "foodPrice");
            return (Criteria) this;
        }

        public Criteria andFoodPriceLessThan(Integer value) {
            addCriterion("food_price <", value, "foodPrice");
            return (Criteria) this;
        }

        public Criteria andFoodPriceLessThanOrEqualTo(Integer value) {
            addCriterion("food_price <=", value, "foodPrice");
            return (Criteria) this;
        }

        public Criteria andFoodPriceIn(List<Integer> values) {
            addCriterion("food_price in", values, "foodPrice");
            return (Criteria) this;
        }

        public Criteria andFoodPriceNotIn(List<Integer> values) {
            addCriterion("food_price not in", values, "foodPrice");
            return (Criteria) this;
        }

        public Criteria andFoodPriceBetween(Integer value1, Integer value2) {
            addCriterion("food_price between", value1, value2, "foodPrice");
            return (Criteria) this;
        }

        public Criteria andFoodPriceNotBetween(Integer value1, Integer value2) {
            addCriterion("food_price not between", value1, value2, "foodPrice");
            return (Criteria) this;
        }

        public Criteria andFoodCountIsNull() {
            addCriterion("food_count is null");
            return (Criteria) this;
        }

        public Criteria andFoodCountIsNotNull() {
            addCriterion("food_count is not null");
            return (Criteria) this;
        }

        public Criteria andFoodCountEqualTo(Integer value) {
            addCriterion("food_count =", value, "foodCount");
            return (Criteria) this;
        }

        public Criteria andFoodCountNotEqualTo(Integer value) {
            addCriterion("food_count <>", value, "foodCount");
            return (Criteria) this;
        }

        public Criteria andFoodCountGreaterThan(Integer value) {
            addCriterion("food_count >", value, "foodCount");
            return (Criteria) this;
        }

        public Criteria andFoodCountGreaterThanOrEqualTo(Integer value) {
            addCriterion("food_count >=", value, "foodCount");
            return (Criteria) this;
        }

        public Criteria andFoodCountLessThan(Integer value) {
            addCriterion("food_count <", value, "foodCount");
            return (Criteria) this;
        }

        public Criteria andFoodCountLessThanOrEqualTo(Integer value) {
            addCriterion("food_count <=", value, "foodCount");
            return (Criteria) this;
        }

        public Criteria andFoodCountIn(List<Integer> values) {
            addCriterion("food_count in", values, "foodCount");
            return (Criteria) this;
        }

        public Criteria andFoodCountNotIn(List<Integer> values) {
            addCriterion("food_count not in", values, "foodCount");
            return (Criteria) this;
        }

        public Criteria andFoodCountBetween(Integer value1, Integer value2) {
            addCriterion("food_count between", value1, value2, "foodCount");
            return (Criteria) this;
        }

        public Criteria andFoodCountNotBetween(Integer value1, Integer value2) {
            addCriterion("food_count not between", value1, value2, "foodCount");
            return (Criteria) this;
        }

        public Criteria andFoodStartDateIsNull() {
            addCriterion("food_start_date is null");
            return (Criteria) this;
        }

        public Criteria andFoodStartDateIsNotNull() {
            addCriterion("food_start_date is not null");
            return (Criteria) this;
        }

        public Criteria andFoodStartDateEqualTo(Date value) {
            addCriterionForJDBCDate("food_start_date =", value, "foodStartDate");
            return (Criteria) this;
        }

        public Criteria andFoodStartDateNotEqualTo(Date value) {
            addCriterionForJDBCDate("food_start_date <>", value, "foodStartDate");
            return (Criteria) this;
        }

        public Criteria andFoodStartDateGreaterThan(Date value) {
            addCriterionForJDBCDate("food_start_date >", value, "foodStartDate");
            return (Criteria) this;
        }

        public Criteria andFoodStartDateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("food_start_date >=", value, "foodStartDate");
            return (Criteria) this;
        }

        public Criteria andFoodStartDateLessThan(Date value) {
            addCriterionForJDBCDate("food_start_date <", value, "foodStartDate");
            return (Criteria) this;
        }

        public Criteria andFoodStartDateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("food_start_date <=", value, "foodStartDate");
            return (Criteria) this;
        }

        public Criteria andFoodStartDateIn(List<Date> values) {
            addCriterionForJDBCDate("food_start_date in", values, "foodStartDate");
            return (Criteria) this;
        }

        public Criteria andFoodStartDateNotIn(List<Date> values) {
            addCriterionForJDBCDate("food_start_date not in", values, "foodStartDate");
            return (Criteria) this;
        }

        public Criteria andFoodStartDateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("food_start_date between", value1, value2, "foodStartDate");
            return (Criteria) this;
        }

        public Criteria andFoodStartDateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("food_start_date not between", value1, value2, "foodStartDate");
            return (Criteria) this;
        }

        public Criteria andFoodEndDateIsNull() {
            addCriterion("food_end_date is null");
            return (Criteria) this;
        }

        public Criteria andFoodEndDateIsNotNull() {
            addCriterion("food_end_date is not null");
            return (Criteria) this;
        }

        public Criteria andFoodEndDateEqualTo(Date value) {
            addCriterionForJDBCDate("food_end_date =", value, "foodEndDate");
            return (Criteria) this;
        }

        public Criteria andFoodEndDateNotEqualTo(Date value) {
            addCriterionForJDBCDate("food_end_date <>", value, "foodEndDate");
            return (Criteria) this;
        }

        public Criteria andFoodEndDateGreaterThan(Date value) {
            addCriterionForJDBCDate("food_end_date >", value, "foodEndDate");
            return (Criteria) this;
        }

        public Criteria andFoodEndDateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("food_end_date >=", value, "foodEndDate");
            return (Criteria) this;
        }

        public Criteria andFoodEndDateLessThan(Date value) {
            addCriterionForJDBCDate("food_end_date <", value, "foodEndDate");
            return (Criteria) this;
        }

        public Criteria andFoodEndDateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("food_end_date <=", value, "foodEndDate");
            return (Criteria) this;
        }

        public Criteria andFoodEndDateIn(List<Date> values) {
            addCriterionForJDBCDate("food_end_date in", values, "foodEndDate");
            return (Criteria) this;
        }

        public Criteria andFoodEndDateNotIn(List<Date> values) {
            addCriterionForJDBCDate("food_end_date not in", values, "foodEndDate");
            return (Criteria) this;
        }

        public Criteria andFoodEndDateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("food_end_date between", value1, value2, "foodEndDate");
            return (Criteria) this;
        }

        public Criteria andFoodEndDateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("food_end_date not between", value1, value2, "foodEndDate");
            return (Criteria) this;
        }

        public Criteria andFoodPicIsNull() {
            addCriterion("food_pic is null");
            return (Criteria) this;
        }

        public Criteria andFoodPicIsNotNull() {
            addCriterion("food_pic is not null");
            return (Criteria) this;
        }

        public Criteria andFoodPicEqualTo(String value) {
            addCriterion("food_pic =", value, "foodPic");
            return (Criteria) this;
        }

        public Criteria andFoodPicNotEqualTo(String value) {
            addCriterion("food_pic <>", value, "foodPic");
            return (Criteria) this;
        }

        public Criteria andFoodPicGreaterThan(String value) {
            addCriterion("food_pic >", value, "foodPic");
            return (Criteria) this;
        }

        public Criteria andFoodPicGreaterThanOrEqualTo(String value) {
            addCriterion("food_pic >=", value, "foodPic");
            return (Criteria) this;
        }

        public Criteria andFoodPicLessThan(String value) {
            addCriterion("food_pic <", value, "foodPic");
            return (Criteria) this;
        }

        public Criteria andFoodPicLessThanOrEqualTo(String value) {
            addCriterion("food_pic <=", value, "foodPic");
            return (Criteria) this;
        }

        public Criteria andFoodPicLike(String value) {
            addCriterion("food_pic like", value, "foodPic");
            return (Criteria) this;
        }

        public Criteria andFoodPicNotLike(String value) {
            addCriterion("food_pic not like", value, "foodPic");
            return (Criteria) this;
        }

        public Criteria andFoodPicIn(List<String> values) {
            addCriterion("food_pic in", values, "foodPic");
            return (Criteria) this;
        }

        public Criteria andFoodPicNotIn(List<String> values) {
            addCriterion("food_pic not in", values, "foodPic");
            return (Criteria) this;
        }

        public Criteria andFoodPicBetween(String value1, String value2) {
            addCriterion("food_pic between", value1, value2, "foodPic");
            return (Criteria) this;
        }

        public Criteria andFoodPicNotBetween(String value1, String value2) {
            addCriterion("food_pic not between", value1, value2, "foodPic");
            return (Criteria) this;
        }
    }

    /**
     */
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