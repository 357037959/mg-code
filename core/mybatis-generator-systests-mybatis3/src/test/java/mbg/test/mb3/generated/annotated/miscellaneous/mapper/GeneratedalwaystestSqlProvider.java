package mbg.test.mb3.generated.annotated.miscellaneous.mapper;

import java.util.List;
import java.util.Map;
import mbg.test.mb3.generated.annotated.miscellaneous.model.Generatedalwaystest;
import mbg.test.mb3.generated.annotated.miscellaneous.model.GeneratedalwaystestCriteria.Criteria;
import mbg.test.mb3.generated.annotated.miscellaneous.model.GeneratedalwaystestCriteria.Criterion;
import mbg.test.mb3.generated.annotated.miscellaneous.model.GeneratedalwaystestCriteria;
import org.apache.ibatis.jdbc.SQL;

public class GeneratedalwaystestSqlProvider {

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table GENERATEDALWAYSTEST
     *
     * @mbg.generated
     */
    public String countByExample(GeneratedalwaystestCriteria example) {
        SQL sql = new SQL();
        sql.SELECT("count(*)").FROM("GENERATEDALWAYSTEST");
        applyWhere(sql, example, false);
        return sql.toString();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table GENERATEDALWAYSTEST
     *
     * @mbg.generated
     */
    public String deleteByExample(GeneratedalwaystestCriteria example) {
        SQL sql = new SQL();
        sql.DELETE_FROM("GENERATEDALWAYSTEST");
        applyWhere(sql, example, false);
        return sql.toString();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table GENERATEDALWAYSTEST
     *
     * @mbg.generated
     */
    public String insertSelective(Generatedalwaystest record) {
        SQL sql = new SQL();
        sql.INSERT_INTO("GENERATEDALWAYSTEST");
        
        if (record.getId() != null) {
            sql.VALUES("ID", "#{id,jdbcType=INTEGER}");
        }
        
        if (record.getName() != null) {
            sql.VALUES("NAME", "#{name,jdbcType=VARCHAR}");
        }
        
        if (record.getBlob1() != null) {
            sql.VALUES("BLOB1", "#{blob1,jdbcType=VARBINARY}");
        }
        
        return sql.toString();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table GENERATEDALWAYSTEST
     *
     * @mbg.generated
     */
    public String selectByExampleWithBLOBs(GeneratedalwaystestCriteria example) {
        SQL sql = new SQL();
        if (example != null && example.isDistinct()) {
            sql.SELECT_DISTINCT("ID");
        } else {
            sql.SELECT("ID");
        }
        sql.SELECT("NAME");
        sql.SELECT("ID_PLUS1");
        sql.SELECT("ID_PLUS2");
        sql.SELECT("BLOB1");
        sql.FROM("GENERATEDALWAYSTEST");
        applyWhere(sql, example, false);
        
        if (example != null && example.getOrderByClause() != null) {
            sql.ORDER_BY(example.getOrderByClause());
        }
        
        return sql.toString();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table GENERATEDALWAYSTEST
     *
     * @mbg.generated
     */
    public String selectByExample(GeneratedalwaystestCriteria example) {
        SQL sql = new SQL();
        if (example != null && example.isDistinct()) {
            sql.SELECT_DISTINCT("ID");
        } else {
            sql.SELECT("ID");
        }
        sql.SELECT("NAME");
        sql.SELECT("ID_PLUS1");
        sql.SELECT("ID_PLUS2");
        sql.FROM("GENERATEDALWAYSTEST");
        applyWhere(sql, example, false);
        
        if (example != null && example.getOrderByClause() != null) {
            sql.ORDER_BY(example.getOrderByClause());
        }
        
        return sql.toString();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table GENERATEDALWAYSTEST
     *
     * @mbg.generated
     */
    public String updateByExampleSelective(Map<String, Object> parameter) {
        Generatedalwaystest record = (Generatedalwaystest) parameter.get("record");
        GeneratedalwaystestCriteria example = (GeneratedalwaystestCriteria) parameter.get("example");
        
        SQL sql = new SQL();
        sql.UPDATE("GENERATEDALWAYSTEST");
        
        if (record.getId() != null) {
            sql.SET("ID = #{record.id,jdbcType=INTEGER}");
        }
        
        if (record.getName() != null) {
            sql.SET("NAME = #{record.name,jdbcType=VARCHAR}");
        }
        
        if (record.getBlob1() != null) {
            sql.SET("BLOB1 = #{record.blob1,jdbcType=VARBINARY}");
        }
        
        applyWhere(sql, example, true);
        return sql.toString();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table GENERATEDALWAYSTEST
     *
     * @mbg.generated
     */
    public String updateByExampleWithBLOBs(Map<String, Object> parameter) {
        SQL sql = new SQL();
        sql.UPDATE("GENERATEDALWAYSTEST");
        
        sql.SET("ID = #{record.id,jdbcType=INTEGER}");
        sql.SET("NAME = #{record.name,jdbcType=VARCHAR}");
        sql.SET("BLOB1 = #{record.blob1,jdbcType=VARBINARY}");
        
        GeneratedalwaystestCriteria example = (GeneratedalwaystestCriteria) parameter.get("example");
        applyWhere(sql, example, true);
        return sql.toString();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table GENERATEDALWAYSTEST
     *
     * @mbg.generated
     */
    public String updateByExample(Map<String, Object> parameter) {
        SQL sql = new SQL();
        sql.UPDATE("GENERATEDALWAYSTEST");
        
        sql.SET("ID = #{record.id,jdbcType=INTEGER}");
        sql.SET("NAME = #{record.name,jdbcType=VARCHAR}");
        
        GeneratedalwaystestCriteria example = (GeneratedalwaystestCriteria) parameter.get("example");
        applyWhere(sql, example, true);
        return sql.toString();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table GENERATEDALWAYSTEST
     *
     * @mbg.generated
     */
    public String updateByPrimaryKeySelective(Generatedalwaystest record) {
        SQL sql = new SQL();
        sql.UPDATE("GENERATEDALWAYSTEST");
        
        if (record.getName() != null) {
            sql.SET("NAME = #{name,jdbcType=VARCHAR}");
        }
        
        if (record.getBlob1() != null) {
            sql.SET("BLOB1 = #{blob1,jdbcType=VARBINARY}");
        }
        
        sql.WHERE("ID = #{id,jdbcType=INTEGER}");
        
        return sql.toString();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table GENERATEDALWAYSTEST
     *
     * @mbg.generated
     */
    protected void applyWhere(SQL sql, GeneratedalwaystestCriteria example, boolean includeExamplePhrase) {
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