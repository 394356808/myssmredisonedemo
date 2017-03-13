package cn.ssm.po;

import java.util.ArrayList;
import java.util.List;

public class OrderitemsidExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public OrderitemsidExample() {
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

        public Criteria andOrderitemsidIsNull() {
            addCriterion("orderitemsid is null");
            return (Criteria) this;
        }

        public Criteria andOrderitemsidIsNotNull() {
            addCriterion("orderitemsid is not null");
            return (Criteria) this;
        }

        public Criteria andOrderitemsidEqualTo(Integer value) {
            addCriterion("orderitemsid =", value, "orderitemsid");
            return (Criteria) this;
        }

        public Criteria andOrderitemsidNotEqualTo(Integer value) {
            addCriterion("orderitemsid <>", value, "orderitemsid");
            return (Criteria) this;
        }

        public Criteria andOrderitemsidGreaterThan(Integer value) {
            addCriterion("orderitemsid >", value, "orderitemsid");
            return (Criteria) this;
        }

        public Criteria andOrderitemsidGreaterThanOrEqualTo(Integer value) {
            addCriterion("orderitemsid >=", value, "orderitemsid");
            return (Criteria) this;
        }

        public Criteria andOrderitemsidLessThan(Integer value) {
            addCriterion("orderitemsid <", value, "orderitemsid");
            return (Criteria) this;
        }

        public Criteria andOrderitemsidLessThanOrEqualTo(Integer value) {
            addCriterion("orderitemsid <=", value, "orderitemsid");
            return (Criteria) this;
        }

        public Criteria andOrderitemsidIn(List<Integer> values) {
            addCriterion("orderitemsid in", values, "orderitemsid");
            return (Criteria) this;
        }

        public Criteria andOrderitemsidNotIn(List<Integer> values) {
            addCriterion("orderitemsid not in", values, "orderitemsid");
            return (Criteria) this;
        }

        public Criteria andOrderitemsidBetween(Integer value1, Integer value2) {
            addCriterion("orderitemsid between", value1, value2, "orderitemsid");
            return (Criteria) this;
        }

        public Criteria andOrderitemsidNotBetween(Integer value1, Integer value2) {
            addCriterion("orderitemsid not between", value1, value2, "orderitemsid");
            return (Criteria) this;
        }

        public Criteria andItemsidIsNull() {
            addCriterion("itemsid is null");
            return (Criteria) this;
        }

        public Criteria andItemsidIsNotNull() {
            addCriterion("itemsid is not null");
            return (Criteria) this;
        }

        public Criteria andItemsidEqualTo(Integer value) {
            addCriterion("itemsid =", value, "itemsid");
            return (Criteria) this;
        }

        public Criteria andItemsidNotEqualTo(Integer value) {
            addCriterion("itemsid <>", value, "itemsid");
            return (Criteria) this;
        }

        public Criteria andItemsidGreaterThan(Integer value) {
            addCriterion("itemsid >", value, "itemsid");
            return (Criteria) this;
        }

        public Criteria andItemsidGreaterThanOrEqualTo(Integer value) {
            addCriterion("itemsid >=", value, "itemsid");
            return (Criteria) this;
        }

        public Criteria andItemsidLessThan(Integer value) {
            addCriterion("itemsid <", value, "itemsid");
            return (Criteria) this;
        }

        public Criteria andItemsidLessThanOrEqualTo(Integer value) {
            addCriterion("itemsid <=", value, "itemsid");
            return (Criteria) this;
        }

        public Criteria andItemsidIn(List<Integer> values) {
            addCriterion("itemsid in", values, "itemsid");
            return (Criteria) this;
        }

        public Criteria andItemsidNotIn(List<Integer> values) {
            addCriterion("itemsid not in", values, "itemsid");
            return (Criteria) this;
        }

        public Criteria andItemsidBetween(Integer value1, Integer value2) {
            addCriterion("itemsid between", value1, value2, "itemsid");
            return (Criteria) this;
        }

        public Criteria andItemsidNotBetween(Integer value1, Integer value2) {
            addCriterion("itemsid not between", value1, value2, "itemsid");
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