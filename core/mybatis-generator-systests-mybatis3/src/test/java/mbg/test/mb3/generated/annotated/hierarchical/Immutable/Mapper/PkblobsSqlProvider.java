package mbg.test.mb3.generated.annotated.hierarchical.Immutable.Mapper;

import java.util.List;
import java.util.Map;
import mbg.test.mb3.generated.annotated.hierarchical.Immutable.Model.PkblobsExample.Criteria;
import mbg.test.mb3.generated.annotated.hierarchical.Immutable.Model.PkblobsExample.Criterion;
import mbg.test.mb3.generated.annotated.hierarchical.Immutable.Model.PkblobsExample;
import mbg.test.mb3.generated.annotated.hierarchical.Immutable.Model.PkblobsWithBLOBs;
import org.apache.ibatis.jdbc.SQL;

public class PkblobsSqlProvider {

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table PKBLOBS
     *
     * @mbg.generated Sat Mar 25 03:24:58 CST 2017
     */
    public String countByExample(PkblobsExample example) {
        SQL sql = new SQL();
        sql.SELECT("count(*)").FROM("PKBLOBS");
        applyWhere(sql, example, false);
        return sql.toString();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table PKBLOBS
     *
     * @mbg.generated Sat Mar 25 03:24:58 CST 2017
     */
    public String deleteByExample(PkblobsExample example) {
        SQL sql = new SQL();
        sql.DELETE_FROM("PKBLOBS");
        applyWhere(sql, example, false);
        return sql.toString();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table PKBLOBS
     *
     * @mbg.generated Sat Mar 25 03:24:58 CST 2017
     */
    public String insertSelective(PkblobsWithBLOBs record) {
        SQL sql = new SQL();
        sql.INSERT_INTO("PKBLOBS");
        
        if (record.getId() != null) {
            sql.VALUES("ID", "#{id,jdbcType=INTEGER}");
        }
        
        if (record.getBlob1() != null) {
            sql.VALUES("BLOB1", "#{blob1,jdbcType=VARBINARY}");
        }
        
        if (record.getBlob2() != null) {
            sql.VALUES("BLOB2", "#{blob2,jdbcType=VARBINARY}");
        }
        
        if (record.getCharacterlob() != null) {
            sql.VALUES("CHARACTERLOB", "#{characterlob,jdbcType=CLOB}");
        }
        
        return sql.toString();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table PKBLOBS
     *
     * @mbg.generated Sat Mar 25 03:24:58 CST 2017
     */
    public String selectByExampleWithBLOBs(PkblobsExample example) {
        SQL sql = new SQL();
        if (example != null && example.isDistinct()) {
            sql.SELECT_DISTINCT("ID");
        } else {
            sql.SELECT("ID");
        }
        sql.SELECT("BLOB1");
        sql.SELECT("BLOB2");
        sql.SELECT("CHARACTERLOB");
        sql.FROM("PKBLOBS");
        applyWhere(sql, example, false);
        
        if (example != null && example.getOrderByClause() != null) {
            sql.ORDER_BY(example.getOrderByClause());
        }
        
        return sql.toString();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table PKBLOBS
     *
     * @mbg.generated Sat Mar 25 03:24:58 CST 2017
     */
    public String selectByExample(PkblobsExample example) {
        SQL sql = new SQL();
        if (example != null && example.isDistinct()) {
            sql.SELECT_DISTINCT("ID");
        } else {
            sql.SELECT("ID");
        }
        sql.FROM("PKBLOBS");
        applyWhere(sql, example, false);
        
        if (example != null && example.getOrderByClause() != null) {
            sql.ORDER_BY(example.getOrderByClause());
        }
        
        return sql.toString();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table PKBLOBS
     *
     * @mbg.generated Sat Mar 25 03:24:58 CST 2017
     */
    public String updateByExampleSelective(Map<String, Object> parameter) {
        PkblobsWithBLOBs record = (PkblobsWithBLOBs) parameter.get("record");
        PkblobsExample example = (PkblobsExample) parameter.get("example");
        
        SQL sql = new SQL();
        sql.UPDATE("PKBLOBS");
        
        if (record.getId() != null) {
            sql.SET("ID = #{record.id,jdbcType=INTEGER}");
        }
        
        if (record.getBlob1() != null) {
            sql.SET("BLOB1 = #{record.blob1,jdbcType=VARBINARY}");
        }
        
        if (record.getBlob2() != null) {
            sql.SET("BLOB2 = #{record.blob2,jdbcType=VARBINARY}");
        }
        
        if (record.getCharacterlob() != null) {
            sql.SET("CHARACTERLOB = #{record.characterlob,jdbcType=CLOB}");
        }
        
        applyWhere(sql, example, true);
        return sql.toString();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table PKBLOBS
     *
     * @mbg.generated Sat Mar 25 03:24:58 CST 2017
     */
    public String updateByExampleWithBLOBs(Map<String, Object> parameter) {
        SQL sql = new SQL();
        sql.UPDATE("PKBLOBS");
        
        sql.SET("ID = #{record.id,jdbcType=INTEGER}");
        sql.SET("BLOB1 = #{record.blob1,jdbcType=VARBINARY}");
        sql.SET("BLOB2 = #{record.blob2,jdbcType=VARBINARY}");
        sql.SET("CHARACTERLOB = #{record.characterlob,jdbcType=CLOB}");
        
        PkblobsExample example = (PkblobsExample) parameter.get("example");
        applyWhere(sql, example, true);
        return sql.toString();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table PKBLOBS
     *
     * @mbg.generated Sat Mar 25 03:24:58 CST 2017
     */
    public String updateByExample(Map<String, Object> parameter) {
        SQL sql = new SQL();
        sql.UPDATE("PKBLOBS");
        
        sql.SET("ID = #{record.id,jdbcType=INTEGER}");
        
        PkblobsExample example = (PkblobsExample) parameter.get("example");
        applyWhere(sql, example, true);
        return sql.toString();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table PKBLOBS
     *
     * @mbg.generated Sat Mar 25 03:24:58 CST 2017
     */
    public String updateByPrimaryKeySelective(PkblobsWithBLOBs record) {
        SQL sql = new SQL();
        sql.UPDATE("PKBLOBS");
        
        if (record.getBlob1() != null) {
            sql.SET("BLOB1 = #{blob1,jdbcType=VARBINARY}");
        }
        
        if (record.getBlob2() != null) {
            sql.SET("BLOB2 = #{blob2,jdbcType=VARBINARY}");
        }
        
        if (record.getCharacterlob() != null) {
            sql.SET("CHARACTERLOB = #{characterlob,jdbcType=CLOB}");
        }
        
        sql.WHERE("ID = #{id,jdbcType=INTEGER}");
        
        return sql.toString();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table PKBLOBS
     *
     * @mbg.generated Sat Mar 25 03:24:58 CST 2017
     */
    protected void applyWhere(SQL sql, PkblobsExample example, boolean includeExamplePhrase) {
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