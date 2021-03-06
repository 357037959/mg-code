package mbg.test.ib2j5.generated.miscellaneous.model;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class AnotherawfultableExample {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table MBGTEST.ANOTHERAWFULTABLE
     *
     * @mbg.generated Sat Mar 25 03:24:02 CST 2017
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table MBGTEST.ANOTHERAWFULTABLE
     *
     * @mbg.generated Sat Mar 25 03:24:02 CST 2017
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table MBGTEST.ANOTHERAWFULTABLE
     *
     * @mbg.generated Sat Mar 25 03:24:02 CST 2017
     */
    protected List<Criteria> oredCriteria;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table MBGTEST.ANOTHERAWFULTABLE
     *
     * @mbg.generated Sat Mar 25 03:24:02 CST 2017
     */
    public AnotherawfultableExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table MBGTEST.ANOTHERAWFULTABLE
     *
     * @mbg.generated Sat Mar 25 03:24:02 CST 2017
     */
    protected AnotherawfultableExample(AnotherawfultableExample example) {
        this.orderByClause = example.orderByClause;
        this.oredCriteria = example.oredCriteria;
        this.distinct = example.distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table MBGTEST.ANOTHERAWFULTABLE
     *
     * @mbg.generated Sat Mar 25 03:24:02 CST 2017
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table MBGTEST.ANOTHERAWFULTABLE
     *
     * @mbg.generated Sat Mar 25 03:24:02 CST 2017
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table MBGTEST.ANOTHERAWFULTABLE
     *
     * @mbg.generated Sat Mar 25 03:24:02 CST 2017
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table MBGTEST.ANOTHERAWFULTABLE
     *
     * @mbg.generated Sat Mar 25 03:24:02 CST 2017
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table MBGTEST.ANOTHERAWFULTABLE
     *
     * @mbg.generated Sat Mar 25 03:24:02 CST 2017
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table MBGTEST.ANOTHERAWFULTABLE
     *
     * @mbg.generated Sat Mar 25 03:24:02 CST 2017
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table MBGTEST.ANOTHERAWFULTABLE
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
     * This method corresponds to the database table MBGTEST.ANOTHERAWFULTABLE
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
     * This method corresponds to the database table MBGTEST.ANOTHERAWFULTABLE
     *
     * @mbg.generated Sat Mar 25 03:24:02 CST 2017
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table MBGTEST.ANOTHERAWFULTABLE
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
     * This class corresponds to the database table MBGTEST.ANOTHERAWFULTABLE
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

        public Criteria andIdIsNull() {
            addCriterion("ID is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("ID is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Integer value) {
            addCriterion("ID =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Integer value) {
            addCriterion("ID <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Integer value) {
            addCriterion("ID >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("ID >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Integer value) {
            addCriterion("ID <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Integer value) {
            addCriterion("ID <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Integer> values) {
            addCriterion("ID in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Integer> values) {
            addCriterion("ID not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Integer value1, Integer value2) {
            addCriterion("ID between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Integer value1, Integer value2) {
            addCriterion("ID not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andSelectIsNull() {
            addCriterion("\"select\" is null");
            return (Criteria) this;
        }

        public Criteria andSelectIsNotNull() {
            addCriterion("\"select\" is not null");
            return (Criteria) this;
        }

        public Criteria andSelectEqualTo(String value) {
            addCriterion("\"select\" =", value, "select");
            return (Criteria) this;
        }

        public Criteria andSelectNotEqualTo(String value) {
            addCriterion("\"select\" <>", value, "select");
            return (Criteria) this;
        }

        public Criteria andSelectGreaterThan(String value) {
            addCriterion("\"select\" >", value, "select");
            return (Criteria) this;
        }

        public Criteria andSelectGreaterThanOrEqualTo(String value) {
            addCriterion("\"select\" >=", value, "select");
            return (Criteria) this;
        }

        public Criteria andSelectLessThan(String value) {
            addCriterion("\"select\" <", value, "select");
            return (Criteria) this;
        }

        public Criteria andSelectLessThanOrEqualTo(String value) {
            addCriterion("\"select\" <=", value, "select");
            return (Criteria) this;
        }

        public Criteria andSelectLike(String value) {
            addCriterion("\"select\" like", value, "select");
            return (Criteria) this;
        }

        public Criteria andSelectNotLike(String value) {
            addCriterion("\"select\" not like", value, "select");
            return (Criteria) this;
        }

        public Criteria andSelectIn(List<String> values) {
            addCriterion("\"select\" in", values, "select");
            return (Criteria) this;
        }

        public Criteria andSelectNotIn(List<String> values) {
            addCriterion("\"select\" not in", values, "select");
            return (Criteria) this;
        }

        public Criteria andSelectBetween(String value1, String value2) {
            addCriterion("\"select\" between", value1, value2, "select");
            return (Criteria) this;
        }

        public Criteria andSelectNotBetween(String value1, String value2) {
            addCriterion("\"select\" not between", value1, value2, "select");
            return (Criteria) this;
        }

        public Criteria andInsertIsNull() {
            addCriterion("\"insert\" is null");
            return (Criteria) this;
        }

        public Criteria andInsertIsNotNull() {
            addCriterion("\"insert\" is not null");
            return (Criteria) this;
        }

        public Criteria andInsertEqualTo(String value) {
            addCriterion("\"insert\" =", value, "insert");
            return (Criteria) this;
        }

        public Criteria andInsertNotEqualTo(String value) {
            addCriterion("\"insert\" <>", value, "insert");
            return (Criteria) this;
        }

        public Criteria andInsertGreaterThan(String value) {
            addCriterion("\"insert\" >", value, "insert");
            return (Criteria) this;
        }

        public Criteria andInsertGreaterThanOrEqualTo(String value) {
            addCriterion("\"insert\" >=", value, "insert");
            return (Criteria) this;
        }

        public Criteria andInsertLessThan(String value) {
            addCriterion("\"insert\" <", value, "insert");
            return (Criteria) this;
        }

        public Criteria andInsertLessThanOrEqualTo(String value) {
            addCriterion("\"insert\" <=", value, "insert");
            return (Criteria) this;
        }

        public Criteria andInsertLike(String value) {
            addCriterion("\"insert\" like", value, "insert");
            return (Criteria) this;
        }

        public Criteria andInsertNotLike(String value) {
            addCriterion("\"insert\" not like", value, "insert");
            return (Criteria) this;
        }

        public Criteria andInsertIn(List<String> values) {
            addCriterion("\"insert\" in", values, "insert");
            return (Criteria) this;
        }

        public Criteria andInsertNotIn(List<String> values) {
            addCriterion("\"insert\" not in", values, "insert");
            return (Criteria) this;
        }

        public Criteria andInsertBetween(String value1, String value2) {
            addCriterion("\"insert\" between", value1, value2, "insert");
            return (Criteria) this;
        }

        public Criteria andInsertNotBetween(String value1, String value2) {
            addCriterion("\"insert\" not between", value1, value2, "insert");
            return (Criteria) this;
        }

        public Criteria andUpdateIsNull() {
            addCriterion("\"update\" is null");
            return (Criteria) this;
        }

        public Criteria andUpdateIsNotNull() {
            addCriterion("\"update\" is not null");
            return (Criteria) this;
        }

        public Criteria andUpdateEqualTo(String value) {
            addCriterion("\"update\" =", value, "update");
            return (Criteria) this;
        }

        public Criteria andUpdateNotEqualTo(String value) {
            addCriterion("\"update\" <>", value, "update");
            return (Criteria) this;
        }

        public Criteria andUpdateGreaterThan(String value) {
            addCriterion("\"update\" >", value, "update");
            return (Criteria) this;
        }

        public Criteria andUpdateGreaterThanOrEqualTo(String value) {
            addCriterion("\"update\" >=", value, "update");
            return (Criteria) this;
        }

        public Criteria andUpdateLessThan(String value) {
            addCriterion("\"update\" <", value, "update");
            return (Criteria) this;
        }

        public Criteria andUpdateLessThanOrEqualTo(String value) {
            addCriterion("\"update\" <=", value, "update");
            return (Criteria) this;
        }

        public Criteria andUpdateLike(String value) {
            addCriterion("\"update\" like", value, "update");
            return (Criteria) this;
        }

        public Criteria andUpdateNotLike(String value) {
            addCriterion("\"update\" not like", value, "update");
            return (Criteria) this;
        }

        public Criteria andUpdateIn(List<String> values) {
            addCriterion("\"update\" in", values, "update");
            return (Criteria) this;
        }

        public Criteria andUpdateNotIn(List<String> values) {
            addCriterion("\"update\" not in", values, "update");
            return (Criteria) this;
        }

        public Criteria andUpdateBetween(String value1, String value2) {
            addCriterion("\"update\" between", value1, value2, "update");
            return (Criteria) this;
        }

        public Criteria andUpdateNotBetween(String value1, String value2) {
            addCriterion("\"update\" not between", value1, value2, "update");
            return (Criteria) this;
        }

        public Criteria andDeleteIsNull() {
            addCriterion("\"delete\" is null");
            return (Criteria) this;
        }

        public Criteria andDeleteIsNotNull() {
            addCriterion("\"delete\" is not null");
            return (Criteria) this;
        }

        public Criteria andDeleteEqualTo(String value) {
            addCriterion("\"delete\" =", value, "delete");
            return (Criteria) this;
        }

        public Criteria andDeleteNotEqualTo(String value) {
            addCriterion("\"delete\" <>", value, "delete");
            return (Criteria) this;
        }

        public Criteria andDeleteGreaterThan(String value) {
            addCriterion("\"delete\" >", value, "delete");
            return (Criteria) this;
        }

        public Criteria andDeleteGreaterThanOrEqualTo(String value) {
            addCriterion("\"delete\" >=", value, "delete");
            return (Criteria) this;
        }

        public Criteria andDeleteLessThan(String value) {
            addCriterion("\"delete\" <", value, "delete");
            return (Criteria) this;
        }

        public Criteria andDeleteLessThanOrEqualTo(String value) {
            addCriterion("\"delete\" <=", value, "delete");
            return (Criteria) this;
        }

        public Criteria andDeleteLike(String value) {
            addCriterion("\"delete\" like", value, "delete");
            return (Criteria) this;
        }

        public Criteria andDeleteNotLike(String value) {
            addCriterion("\"delete\" not like", value, "delete");
            return (Criteria) this;
        }

        public Criteria andDeleteIn(List<String> values) {
            addCriterion("\"delete\" in", values, "delete");
            return (Criteria) this;
        }

        public Criteria andDeleteNotIn(List<String> values) {
            addCriterion("\"delete\" not in", values, "delete");
            return (Criteria) this;
        }

        public Criteria andDeleteBetween(String value1, String value2) {
            addCriterion("\"delete\" between", value1, value2, "delete");
            return (Criteria) this;
        }

        public Criteria andDeleteNotBetween(String value1, String value2) {
            addCriterion("\"delete\" not between", value1, value2, "delete");
            return (Criteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table MBGTEST.ANOTHERAWFULTABLE
     *
     * @mbg.generated do_not_delete_during_merge Sat Mar 25 03:24:02 CST 2017
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }
}