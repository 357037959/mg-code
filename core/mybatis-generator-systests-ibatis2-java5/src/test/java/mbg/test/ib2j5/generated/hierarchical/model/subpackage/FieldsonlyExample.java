package mbg.test.ib2j5.generated.hierarchical.model.subpackage;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FieldsonlyExample {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table FIELDSONLY
     *
     * @mbg.generated Sat Mar 25 03:24:02 CST 2017
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table FIELDSONLY
     *
     * @mbg.generated Sat Mar 25 03:24:02 CST 2017
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table FIELDSONLY
     *
     * @mbg.generated Sat Mar 25 03:24:02 CST 2017
     */
    protected List<Criteria> oredCriteria;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table FIELDSONLY
     *
     * @mbg.generated Sat Mar 25 03:24:02 CST 2017
     */
    public FieldsonlyExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table FIELDSONLY
     *
     * @mbg.generated Sat Mar 25 03:24:02 CST 2017
     */
    protected FieldsonlyExample(FieldsonlyExample example) {
        this.orderByClause = example.orderByClause;
        this.oredCriteria = example.oredCriteria;
        this.distinct = example.distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table FIELDSONLY
     *
     * @mbg.generated Sat Mar 25 03:24:02 CST 2017
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table FIELDSONLY
     *
     * @mbg.generated Sat Mar 25 03:24:02 CST 2017
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table FIELDSONLY
     *
     * @mbg.generated Sat Mar 25 03:24:02 CST 2017
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table FIELDSONLY
     *
     * @mbg.generated Sat Mar 25 03:24:02 CST 2017
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table FIELDSONLY
     *
     * @mbg.generated Sat Mar 25 03:24:02 CST 2017
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table FIELDSONLY
     *
     * @mbg.generated Sat Mar 25 03:24:02 CST 2017
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table FIELDSONLY
     *
     * @mbg.generated Sat Mar 25 03:24:02 CST 2017
     */
    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table FIELDSONLY
     *
     * @mbg.generated Sat Mar 25 03:24:02 CST 2017
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
     * This method corresponds to the database table FIELDSONLY
     *
     * @mbg.generated Sat Mar 25 03:24:02 CST 2017
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table FIELDSONLY
     *
     * @mbg.generated Sat Mar 25 03:24:02 CST 2017
     */
    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table FIELDSONLY
     *
     * @mbg.generated Sat Mar 25 03:24:02 CST 2017
     */
    protected abstract static class GeneratedCriteria {
        protected List<String> criteriaWithoutValue;

        protected List<Map<String, Object>> criteriaWithSingleValue;

        protected List<Map<String, Object>> criteriaWithListValue;

        protected List<Map<String, Object>> criteriaWithBetweenValue;

        protected GeneratedCriteria() {
            super();
            criteriaWithoutValue = new ArrayList<String>();
            criteriaWithSingleValue = new ArrayList<Map<String, Object>>();
            criteriaWithListValue = new ArrayList<Map<String, Object>>();
            criteriaWithBetweenValue = new ArrayList<Map<String, Object>>();
        }

        public boolean isValid() {
            return criteriaWithoutValue.size() > 0
                || criteriaWithSingleValue.size() > 0
                || criteriaWithListValue.size() > 0
                || criteriaWithBetweenValue.size() > 0;
        }

        public List<String> getCriteriaWithoutValue() {
            return criteriaWithoutValue;
        }

        public List<Map<String, Object>> getCriteriaWithSingleValue() {
            return criteriaWithSingleValue;
        }

        public List<Map<String, Object>> getCriteriaWithListValue() {
            return criteriaWithListValue;
        }

        public List<Map<String, Object>> getCriteriaWithBetweenValue() {
            return criteriaWithBetweenValue;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteriaWithoutValue.add(condition);
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            Map<String, Object> map = new HashMap<String, Object>();
            map.put("condition", condition);
            map.put("value", value);
            criteriaWithSingleValue.add(map);
        }

        protected void addCriterion(String condition, List<? extends Object> values, String property) {
            if (values == null || values.size() == 0) {
                throw new RuntimeException("Value list for " + property + " cannot be null or empty");
            }
            Map<String, Object> map = new HashMap<String, Object>();
            map.put("condition", condition);
            map.put("values", values);
            criteriaWithListValue.add(map);
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            List<Object> list = new ArrayList<Object>();
            list.add(value1);
            list.add(value2);
            Map<String, Object> map = new HashMap<String, Object>();
            map.put("condition", condition);
            map.put("values", list);
            criteriaWithBetweenValue.add(map);
        }

        public Criteria andIntegerfieldIsNull() {
            addCriterion("INTEGERFIELD is null");
            return (Criteria) this;
        }

        public Criteria andIntegerfieldIsNotNull() {
            addCriterion("INTEGERFIELD is not null");
            return (Criteria) this;
        }

        public Criteria andIntegerfieldEqualTo(Integer value) {
            addCriterion("INTEGERFIELD =", value, "integerfield");
            return (Criteria) this;
        }

        public Criteria andIntegerfieldNotEqualTo(Integer value) {
            addCriterion("INTEGERFIELD <>", value, "integerfield");
            return (Criteria) this;
        }

        public Criteria andIntegerfieldGreaterThan(Integer value) {
            addCriterion("INTEGERFIELD >", value, "integerfield");
            return (Criteria) this;
        }

        public Criteria andIntegerfieldGreaterThanOrEqualTo(Integer value) {
            addCriterion("INTEGERFIELD >=", value, "integerfield");
            return (Criteria) this;
        }

        public Criteria andIntegerfieldLessThan(Integer value) {
            addCriterion("INTEGERFIELD <", value, "integerfield");
            return (Criteria) this;
        }

        public Criteria andIntegerfieldLessThanOrEqualTo(Integer value) {
            addCriterion("INTEGERFIELD <=", value, "integerfield");
            return (Criteria) this;
        }

        public Criteria andIntegerfieldIn(List<Integer> values) {
            addCriterion("INTEGERFIELD in", values, "integerfield");
            return (Criteria) this;
        }

        public Criteria andIntegerfieldNotIn(List<Integer> values) {
            addCriterion("INTEGERFIELD not in", values, "integerfield");
            return (Criteria) this;
        }

        public Criteria andIntegerfieldBetween(Integer value1, Integer value2) {
            addCriterion("INTEGERFIELD between", value1, value2, "integerfield");
            return (Criteria) this;
        }

        public Criteria andIntegerfieldNotBetween(Integer value1, Integer value2) {
            addCriterion("INTEGERFIELD not between", value1, value2, "integerfield");
            return (Criteria) this;
        }

        public Criteria andDoublefieldIsNull() {
            addCriterion("DOUBLEFIELD is null");
            return (Criteria) this;
        }

        public Criteria andDoublefieldIsNotNull() {
            addCriterion("DOUBLEFIELD is not null");
            return (Criteria) this;
        }

        public Criteria andDoublefieldEqualTo(Double value) {
            addCriterion("DOUBLEFIELD =", value, "doublefield");
            return (Criteria) this;
        }

        public Criteria andDoublefieldNotEqualTo(Double value) {
            addCriterion("DOUBLEFIELD <>", value, "doublefield");
            return (Criteria) this;
        }

        public Criteria andDoublefieldGreaterThan(Double value) {
            addCriterion("DOUBLEFIELD >", value, "doublefield");
            return (Criteria) this;
        }

        public Criteria andDoublefieldGreaterThanOrEqualTo(Double value) {
            addCriterion("DOUBLEFIELD >=", value, "doublefield");
            return (Criteria) this;
        }

        public Criteria andDoublefieldLessThan(Double value) {
            addCriterion("DOUBLEFIELD <", value, "doublefield");
            return (Criteria) this;
        }

        public Criteria andDoublefieldLessThanOrEqualTo(Double value) {
            addCriterion("DOUBLEFIELD <=", value, "doublefield");
            return (Criteria) this;
        }

        public Criteria andDoublefieldIn(List<Double> values) {
            addCriterion("DOUBLEFIELD in", values, "doublefield");
            return (Criteria) this;
        }

        public Criteria andDoublefieldNotIn(List<Double> values) {
            addCriterion("DOUBLEFIELD not in", values, "doublefield");
            return (Criteria) this;
        }

        public Criteria andDoublefieldBetween(Double value1, Double value2) {
            addCriterion("DOUBLEFIELD between", value1, value2, "doublefield");
            return (Criteria) this;
        }

        public Criteria andDoublefieldNotBetween(Double value1, Double value2) {
            addCriterion("DOUBLEFIELD not between", value1, value2, "doublefield");
            return (Criteria) this;
        }

        public Criteria andFloatfieldIsNull() {
            addCriterion("FLOATFIELD is null");
            return (Criteria) this;
        }

        public Criteria andFloatfieldIsNotNull() {
            addCriterion("FLOATFIELD is not null");
            return (Criteria) this;
        }

        public Criteria andFloatfieldEqualTo(Double value) {
            addCriterion("FLOATFIELD =", value, "floatfield");
            return (Criteria) this;
        }

        public Criteria andFloatfieldNotEqualTo(Double value) {
            addCriterion("FLOATFIELD <>", value, "floatfield");
            return (Criteria) this;
        }

        public Criteria andFloatfieldGreaterThan(Double value) {
            addCriterion("FLOATFIELD >", value, "floatfield");
            return (Criteria) this;
        }

        public Criteria andFloatfieldGreaterThanOrEqualTo(Double value) {
            addCriterion("FLOATFIELD >=", value, "floatfield");
            return (Criteria) this;
        }

        public Criteria andFloatfieldLessThan(Double value) {
            addCriterion("FLOATFIELD <", value, "floatfield");
            return (Criteria) this;
        }

        public Criteria andFloatfieldLessThanOrEqualTo(Double value) {
            addCriterion("FLOATFIELD <=", value, "floatfield");
            return (Criteria) this;
        }

        public Criteria andFloatfieldIn(List<Double> values) {
            addCriterion("FLOATFIELD in", values, "floatfield");
            return (Criteria) this;
        }

        public Criteria andFloatfieldNotIn(List<Double> values) {
            addCriterion("FLOATFIELD not in", values, "floatfield");
            return (Criteria) this;
        }

        public Criteria andFloatfieldBetween(Double value1, Double value2) {
            addCriterion("FLOATFIELD between", value1, value2, "floatfield");
            return (Criteria) this;
        }

        public Criteria andFloatfieldNotBetween(Double value1, Double value2) {
            addCriterion("FLOATFIELD not between", value1, value2, "floatfield");
            return (Criteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table FIELDSONLY
     *
     * @mbg.generated do_not_delete_during_merge Sat Mar 25 03:24:02 CST 2017
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }
}