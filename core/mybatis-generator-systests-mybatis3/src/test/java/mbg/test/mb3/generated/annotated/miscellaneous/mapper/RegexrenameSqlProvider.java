package mbg.test.mb3.generated.annotated.miscellaneous.mapper;

import java.util.List;
import java.util.Map;
import mbg.test.mb3.generated.annotated.miscellaneous.model.Regexrename;
import mbg.test.mb3.generated.annotated.miscellaneous.model.RegexrenameCriteria.Criteria;
import mbg.test.mb3.generated.annotated.miscellaneous.model.RegexrenameCriteria.Criterion;
import mbg.test.mb3.generated.annotated.miscellaneous.model.RegexrenameCriteria;
import org.apache.ibatis.jdbc.SQL;

public class RegexrenameSqlProvider {

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table REGEXRENAME
     *
     * @mbg.generated
     */
    public String countByExample(RegexrenameCriteria example) {
        SQL sql = new SQL();
        sql.SELECT("count(*)").FROM("REGEXRENAME");
        applyWhere(sql, example, false);
        return sql.toString();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table REGEXRENAME
     *
     * @mbg.generated
     */
    public String deleteByExample(RegexrenameCriteria example) {
        SQL sql = new SQL();
        sql.DELETE_FROM("REGEXRENAME");
        applyWhere(sql, example, false);
        return sql.toString();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table REGEXRENAME
     *
     * @mbg.generated
     */
    public String insertSelective(Regexrename record) {
        SQL sql = new SQL();
        sql.INSERT_INTO("REGEXRENAME");
        
        sql.VALUES("CUST_ID", "#{id,jdbcType=INTEGER}");
        
        if (record.getName() != null) {
            sql.VALUES("CUST_NAME", "#{name,jdbcType=VARCHAR}");
        }
        
        if (record.getAddress() != null) {
            sql.VALUES("CUST_ADDRESS", "#{address,jdbcType=VARCHAR}");
        }
        
        if (record.getZipCode() != null) {
            sql.VALUES("ZIP_CODE", "#{zipCode,jdbcType=CHAR}");
        }
        
        return sql.toString();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table REGEXRENAME
     *
     * @mbg.generated
     */
    public String selectByExample(RegexrenameCriteria example) {
        SQL sql = new SQL();
        if (example != null && example.isDistinct()) {
            sql.SELECT_DISTINCT("CUST_ID");
        } else {
            sql.SELECT("CUST_ID");
        }
        sql.SELECT("CUST_NAME");
        sql.SELECT("CUST_ADDRESS");
        sql.SELECT("ZIP_CODE");
        sql.FROM("REGEXRENAME");
        applyWhere(sql, example, false);
        
        if (example != null && example.getOrderByClause() != null) {
            sql.ORDER_BY(example.getOrderByClause());
        }
        
        return sql.toString();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table REGEXRENAME
     *
     * @mbg.generated
     */
    public String updateByExampleSelective(Map<String, Object> parameter) {
        Regexrename record = (Regexrename) parameter.get("record");
        RegexrenameCriteria example = (RegexrenameCriteria) parameter.get("example");
        
        SQL sql = new SQL();
        sql.UPDATE("REGEXRENAME");
        
        if (record.getId() != null) {
            sql.SET("CUST_ID = #{record.id,jdbcType=INTEGER}");
        }
        
        if (record.getName() != null) {
            sql.SET("CUST_NAME = #{record.name,jdbcType=VARCHAR}");
        }
        
        if (record.getAddress() != null) {
            sql.SET("CUST_ADDRESS = #{record.address,jdbcType=VARCHAR}");
        }
        
        if (record.getZipCode() != null) {
            sql.SET("ZIP_CODE = #{record.zipCode,jdbcType=CHAR}");
        }
        
        applyWhere(sql, example, true);
        return sql.toString();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table REGEXRENAME
     *
     * @mbg.generated
     */
    public String updateByExample(Map<String, Object> parameter) {
        SQL sql = new SQL();
        sql.UPDATE("REGEXRENAME");
        
        sql.SET("CUST_ID = #{record.id,jdbcType=INTEGER}");
        sql.SET("CUST_NAME = #{record.name,jdbcType=VARCHAR}");
        sql.SET("CUST_ADDRESS = #{record.address,jdbcType=VARCHAR}");
        sql.SET("ZIP_CODE = #{record.zipCode,jdbcType=CHAR}");
        
        RegexrenameCriteria example = (RegexrenameCriteria) parameter.get("example");
        applyWhere(sql, example, true);
        return sql.toString();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table REGEXRENAME
     *
     * @mbg.generated
     */
    public String updateByPrimaryKeySelective(Regexrename record) {
        SQL sql = new SQL();
        sql.UPDATE("REGEXRENAME");
        
        if (record.getName() != null) {
            sql.SET("CUST_NAME = #{name,jdbcType=VARCHAR}");
        }
        
        if (record.getAddress() != null) {
            sql.SET("CUST_ADDRESS = #{address,jdbcType=VARCHAR}");
        }
        
        if (record.getZipCode() != null) {
            sql.SET("ZIP_CODE = #{zipCode,jdbcType=CHAR}");
        }
        
        sql.WHERE("CUST_ID = #{id,jdbcType=INTEGER}");
        
        return sql.toString();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table REGEXRENAME
     *
     * @mbg.generated
     */
    protected void applyWhere(SQL sql, RegexrenameCriteria example, boolean includeExamplePhrase) {
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