package mbg.test.mb3.generated.annotated.conditional.mapper;

import java.util.List;
import java.util.Map;
import mbg.test.mb3.generated.annotated.conditional.model.Pkfieldsblobs;
import mbg.test.mb3.generated.annotated.conditional.model.PkfieldsblobsExample.Criteria;
import mbg.test.mb3.generated.annotated.conditional.model.PkfieldsblobsExample.Criterion;
import mbg.test.mb3.generated.annotated.conditional.model.PkfieldsblobsExample;
import org.apache.ibatis.jdbc.SQL;

public class PkfieldsblobsSqlProvider {

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table PKFIELDSBLOBS
     *
     * @mbg.generated Sat Mar 25 03:24:58 CST 2017
     */
    public String countByExample(PkfieldsblobsExample example) {
        SQL sql = new SQL();
        sql.SELECT("count(*)").FROM("PKFIELDSBLOBS");
        applyWhere(sql, example, false);
        return sql.toString();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table PKFIELDSBLOBS
     *
     * @mbg.generated Sat Mar 25 03:24:58 CST 2017
     */
    public String deleteByExample(PkfieldsblobsExample example) {
        SQL sql = new SQL();
        sql.DELETE_FROM("PKFIELDSBLOBS");
        applyWhere(sql, example, false);
        return sql.toString();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table PKFIELDSBLOBS
     *
     * @mbg.generated Sat Mar 25 03:24:58 CST 2017
     */
    public String insertSelective(Pkfieldsblobs record) {
        SQL sql = new SQL();
        sql.INSERT_INTO("PKFIELDSBLOBS");
        
        if (record.getId1() != null) {
            sql.VALUES("ID1", "#{id1,jdbcType=INTEGER}");
        }
        
        if (record.getId2() != null) {
            sql.VALUES("ID2", "#{id2,jdbcType=INTEGER}");
        }
        
        if (record.getFirstname() != null) {
            sql.VALUES("FIRSTNAME", "#{firstname,jdbcType=VARCHAR}");
        }
        
        if (record.getLastname() != null) {
            sql.VALUES("LASTNAME", "#{lastname,jdbcType=VARCHAR}");
        }
        
        if (record.getBlob1() != null) {
            sql.VALUES("BLOB1", "#{blob1,jdbcType=VARBINARY}");
        }
        
        return sql.toString();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table PKFIELDSBLOBS
     *
     * @mbg.generated Sat Mar 25 03:24:58 CST 2017
     */
    public String selectByExampleWithBLOBs(PkfieldsblobsExample example) {
        SQL sql = new SQL();
        if (example != null && example.isDistinct()) {
            sql.SELECT_DISTINCT("ID1");
        } else {
            sql.SELECT("ID1");
        }
        sql.SELECT("ID2");
        sql.SELECT("FIRSTNAME");
        sql.SELECT("LASTNAME");
        sql.SELECT("BLOB1");
        sql.FROM("PKFIELDSBLOBS");
        applyWhere(sql, example, false);
        
        if (example != null && example.getOrderByClause() != null) {
            sql.ORDER_BY(example.getOrderByClause());
        }
        
        return sql.toString();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table PKFIELDSBLOBS
     *
     * @mbg.generated Sat Mar 25 03:24:58 CST 2017
     */
    public String selectByExample(PkfieldsblobsExample example) {
        SQL sql = new SQL();
        if (example != null && example.isDistinct()) {
            sql.SELECT_DISTINCT("ID1");
        } else {
            sql.SELECT("ID1");
        }
        sql.SELECT("ID2");
        sql.SELECT("FIRSTNAME");
        sql.SELECT("LASTNAME");
        sql.FROM("PKFIELDSBLOBS");
        applyWhere(sql, example, false);
        
        if (example != null && example.getOrderByClause() != null) {
            sql.ORDER_BY(example.getOrderByClause());
        }
        
        return sql.toString();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table PKFIELDSBLOBS
     *
     * @mbg.generated Sat Mar 25 03:24:58 CST 2017
     */
    public String updateByExampleSelective(Map<String, Object> parameter) {
        Pkfieldsblobs record = (Pkfieldsblobs) parameter.get("record");
        PkfieldsblobsExample example = (PkfieldsblobsExample) parameter.get("example");
        
        SQL sql = new SQL();
        sql.UPDATE("PKFIELDSBLOBS");
        
        if (record.getId1() != null) {
            sql.SET("ID1 = #{record.id1,jdbcType=INTEGER}");
        }
        
        if (record.getId2() != null) {
            sql.SET("ID2 = #{record.id2,jdbcType=INTEGER}");
        }
        
        if (record.getFirstname() != null) {
            sql.SET("FIRSTNAME = #{record.firstname,jdbcType=VARCHAR}");
        }
        
        if (record.getLastname() != null) {
            sql.SET("LASTNAME = #{record.lastname,jdbcType=VARCHAR}");
        }
        
        if (record.getBlob1() != null) {
            sql.SET("BLOB1 = #{record.blob1,jdbcType=VARBINARY}");
        }
        
        applyWhere(sql, example, true);
        return sql.toString();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table PKFIELDSBLOBS
     *
     * @mbg.generated Sat Mar 25 03:24:58 CST 2017
     */
    public String updateByExampleWithBLOBs(Map<String, Object> parameter) {
        SQL sql = new SQL();
        sql.UPDATE("PKFIELDSBLOBS");
        
        sql.SET("ID1 = #{record.id1,jdbcType=INTEGER}");
        sql.SET("ID2 = #{record.id2,jdbcType=INTEGER}");
        sql.SET("FIRSTNAME = #{record.firstname,jdbcType=VARCHAR}");
        sql.SET("LASTNAME = #{record.lastname,jdbcType=VARCHAR}");
        sql.SET("BLOB1 = #{record.blob1,jdbcType=VARBINARY}");
        
        PkfieldsblobsExample example = (PkfieldsblobsExample) parameter.get("example");
        applyWhere(sql, example, true);
        return sql.toString();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table PKFIELDSBLOBS
     *
     * @mbg.generated Sat Mar 25 03:24:58 CST 2017
     */
    public String updateByExample(Map<String, Object> parameter) {
        SQL sql = new SQL();
        sql.UPDATE("PKFIELDSBLOBS");
        
        sql.SET("ID1 = #{record.id1,jdbcType=INTEGER}");
        sql.SET("ID2 = #{record.id2,jdbcType=INTEGER}");
        sql.SET("FIRSTNAME = #{record.firstname,jdbcType=VARCHAR}");
        sql.SET("LASTNAME = #{record.lastname,jdbcType=VARCHAR}");
        
        PkfieldsblobsExample example = (PkfieldsblobsExample) parameter.get("example");
        applyWhere(sql, example, true);
        return sql.toString();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table PKFIELDSBLOBS
     *
     * @mbg.generated Sat Mar 25 03:24:58 CST 2017
     */
    public String updateByPrimaryKeySelective(Pkfieldsblobs record) {
        SQL sql = new SQL();
        sql.UPDATE("PKFIELDSBLOBS");
        
        if (record.getFirstname() != null) {
            sql.SET("FIRSTNAME = #{firstname,jdbcType=VARCHAR}");
        }
        
        if (record.getLastname() != null) {
            sql.SET("LASTNAME = #{lastname,jdbcType=VARCHAR}");
        }
        
        if (record.getBlob1() != null) {
            sql.SET("BLOB1 = #{blob1,jdbcType=VARBINARY}");
        }
        
        sql.WHERE("ID1 = #{id1,jdbcType=INTEGER}");
        sql.WHERE("ID2 = #{id2,jdbcType=INTEGER}");
        
        return sql.toString();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table PKFIELDSBLOBS
     *
     * @mbg.generated Sat Mar 25 03:24:58 CST 2017
     */
    protected void applyWhere(SQL sql, PkfieldsblobsExample example, boolean includeExamplePhrase) {
        if (example == null) {
            return;
        }
        
        String parmPhrase1;
        String parmPhrase1_th;
        String parmPhrase2;
        String parmPhrase2_th;
        String parmPhrase3;
        String parmPhrase3_th;
        if (includeExamplePhrase) {
            parmPhrase1 = "%s #{example.oredCriteria[%d].allCriteria[%d].value}";
            parmPhrase1_th = "%s #{example.oredCriteria[%d].allCriteria[%d].value,typeHandler=%s}";
            parmPhrase2 = "%s #{example.oredCriteria[%d].allCriteria[%d].value} and #{example.oredCriteria[%d].criteria[%d].secondValue}";
            parmPhrase2_th = "%s #{example.oredCriteria[%d].allCriteria[%d].value,typeHandler=%s} and #{example.oredCriteria[%d].criteria[%d].secondValue,typeHandler=%s}";
            parmPhrase3 = "#{example.oredCriteria[%d].allCriteria[%d].value[%d]}";
            parmPhrase3_th = "#{example.oredCriteria[%d].allCriteria[%d].value[%d],typeHandler=%s}";
        } else {
            parmPhrase1 = "%s #{oredCriteria[%d].allCriteria[%d].value}";
            parmPhrase1_th = "%s #{oredCriteria[%d].allCriteria[%d].value,typeHandler=%s}";
            parmPhrase2 = "%s #{oredCriteria[%d].allCriteria[%d].value} and #{oredCriteria[%d].criteria[%d].secondValue}";
            parmPhrase2_th = "%s #{oredCriteria[%d].allCriteria[%d].value,typeHandler=%s} and #{oredCriteria[%d].criteria[%d].secondValue,typeHandler=%s}";
            parmPhrase3 = "#{oredCriteria[%d].allCriteria[%d].value[%d]}";
            parmPhrase3_th = "#{oredCriteria[%d].allCriteria[%d].value[%d],typeHandler=%s}";
        }
        
        StringBuilder sb = new StringBuilder();
        List<Criteria> oredCriteria = example.getOredCriteria();
        boolean firstCriteria = true;
        for (int i = 0; i < oredCriteria.size(); i++) {
            Criteria criteria = oredCriteria.get(i);
            if (criteria.isValid()) {
                if (firstCriteria) {
                    firstCriteria = false;
                } else {
                    sb.append(" or ");
                }
                
                sb.append('(');
                List<Criterion> criterions = criteria.getAllCriteria();
                boolean firstCriterion = true;
                for (int j = 0; j < criterions.size(); j++) {
                    Criterion criterion = criterions.get(j);
                    if (firstCriterion) {
                        firstCriterion = false;
                    } else {
                        sb.append(" and ");
                    }
                    
                    if (criterion.isNoValue()) {
                        sb.append(criterion.getCondition());
                    } else if (criterion.isSingleValue()) {
                        if (criterion.getTypeHandler() == null) {
                            sb.append(String.format(parmPhrase1, criterion.getCondition(), i, j));
                        } else {
                            sb.append(String.format(parmPhrase1_th, criterion.getCondition(), i, j,criterion.getTypeHandler()));
                        }
                    } else if (criterion.isBetweenValue()) {
                        if (criterion.getTypeHandler() == null) {
                            sb.append(String.format(parmPhrase2, criterion.getCondition(), i, j, i, j));
                        } else {
                            sb.append(String.format(parmPhrase2_th, criterion.getCondition(), i, j, criterion.getTypeHandler(), i, j, criterion.getTypeHandler()));
                        }
                    } else if (criterion.isListValue()) {
                        sb.append(criterion.getCondition());
                        sb.append(" (");
                        List<?> listItems = (List<?>) criterion.getValue();
                        boolean comma = false;
                        for (int k = 0; k < listItems.size(); k++) {
                            if (comma) {
                                sb.append(", ");
                            } else {
                                comma = true;
                            }
                            if (criterion.getTypeHandler() == null) {
                                sb.append(String.format(parmPhrase3, i, j, k));
                            } else {
                                sb.append(String.format(parmPhrase3_th, i, j, k, criterion.getTypeHandler()));
                            }
                        }
                        sb.append(')');
                    }
                }
                sb.append(')');
            }
        }
        
        if (sb.length() > 0) {
            sql.WHERE(sb.toString());
        }
    }
}