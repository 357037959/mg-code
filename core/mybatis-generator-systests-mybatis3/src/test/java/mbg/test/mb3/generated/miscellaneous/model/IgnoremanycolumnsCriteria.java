package mbg.test.mb3.generated.miscellaneous.model;

import java.util.ArrayList;
import java.util.List;

public class IgnoremanycolumnsCriteria {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table IGNOREMANYCOLUMNS
     *
     * @mbg.generated
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table IGNOREMANYCOLUMNS
     *
     * @mbg.generated
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table IGNOREMANYCOLUMNS
     *
     * @mbg.generated
     */
    protected List<Criteria> oredCriteria;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table IGNOREMANYCOLUMNS
     *
     * @mbg.generated
     */
    public IgnoremanycolumnsCriteria() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table IGNOREMANYCOLUMNS
     *
     * @mbg.generated
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table IGNOREMANYCOLUMNS
     *
     * @mbg.generated
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table IGNOREMANYCOLUMNS
     *
     * @mbg.generated
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table IGNOREMANYCOLUMNS
     *
     * @mbg.generated
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table IGNOREMANYCOLUMNS
     *
     * @mbg.generated
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table IGNOREMANYCOLUMNS
     *
     * @mbg.generated
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table IGNOREMANYCOLUMNS
     *
     * @mbg.generated
     */
    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table IGNOREMANYCOLUMNS
     *
     * @mbg.generated
     */
    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table IGNOREMANYCOLUMNS
     *
     * @mbg.generated
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table IGNOREMANYCOLUMNS
     *
     * @mbg.generated
     */
    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table IGNOREMANYCOLUMNS
     *
     * @mbg.generated
     */
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

        public Criteria andCol01IsNull() {
            addCriterion("COL01 is null");
            return (Criteria) this;
        }

        public Criteria andCol01IsNotNull() {
            addCriterion("COL01 is not null");
            return (Criteria) this;
        }

        public Criteria andCol01EqualTo(Integer value) {
            addCriterion("COL01 =", value, "col01");
            return (Criteria) this;
        }

        public Criteria andCol01NotEqualTo(Integer value) {
            addCriterion("COL01 <>", value, "col01");
            return (Criteria) this;
        }

        public Criteria andCol01GreaterThan(Integer value) {
            addCriterion("COL01 >", value, "col01");
            return (Criteria) this;
        }

        public Criteria andCol01GreaterThanOrEqualTo(Integer value) {
            addCriterion("COL01 >=", value, "col01");
            return (Criteria) this;
        }

        public Criteria andCol01LessThan(Integer value) {
            addCriterion("COL01 <", value, "col01");
            return (Criteria) this;
        }

        public Criteria andCol01LessThanOrEqualTo(Integer value) {
            addCriterion("COL01 <=", value, "col01");
            return (Criteria) this;
        }

        public Criteria andCol01In(List<Integer> values) {
            addCriterion("COL01 in", values, "col01");
            return (Criteria) this;
        }

        public Criteria andCol01NotIn(List<Integer> values) {
            addCriterion("COL01 not in", values, "col01");
            return (Criteria) this;
        }

        public Criteria andCol01Between(Integer value1, Integer value2) {
            addCriterion("COL01 between", value1, value2, "col01");
            return (Criteria) this;
        }

        public Criteria andCol01NotBetween(Integer value1, Integer value2) {
            addCriterion("COL01 not between", value1, value2, "col01");
            return (Criteria) this;
        }

        public Criteria andCol13IsNull() {
            addCriterion("COL13 is null");
            return (Criteria) this;
        }

        public Criteria andCol13IsNotNull() {
            addCriterion("COL13 is not null");
            return (Criteria) this;
        }

        public Criteria andCol13EqualTo(Integer value) {
            addCriterion("COL13 =", value, "col13");
            return (Criteria) this;
        }

        public Criteria andCol13NotEqualTo(Integer value) {
            addCriterion("COL13 <>", value, "col13");
            return (Criteria) this;
        }

        public Criteria andCol13GreaterThan(Integer value) {
            addCriterion("COL13 >", value, "col13");
            return (Criteria) this;
        }

        public Criteria andCol13GreaterThanOrEqualTo(Integer value) {
            addCriterion("COL13 >=", value, "col13");
            return (Criteria) this;
        }

        public Criteria andCol13LessThan(Integer value) {
            addCriterion("COL13 <", value, "col13");
            return (Criteria) this;
        }

        public Criteria andCol13LessThanOrEqualTo(Integer value) {
            addCriterion("COL13 <=", value, "col13");
            return (Criteria) this;
        }

        public Criteria andCol13In(List<Integer> values) {
            addCriterion("COL13 in", values, "col13");
            return (Criteria) this;
        }

        public Criteria andCol13NotIn(List<Integer> values) {
            addCriterion("COL13 not in", values, "col13");
            return (Criteria) this;
        }

        public Criteria andCol13Between(Integer value1, Integer value2) {
            addCriterion("COL13 between", value1, value2, "col13");
            return (Criteria) this;
        }

        public Criteria andCol13NotBetween(Integer value1, Integer value2) {
            addCriterion("COL13 not between", value1, value2, "col13");
            return (Criteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table IGNOREMANYCOLUMNS
     *
     * @mbg.generated do_not_delete_during_merge
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table IGNOREMANYCOLUMNS
     *
     * @mbg.generated
     */
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