package mbg.test.ib2j2.generated.hierarchical.dao;

import com.ibatis.sqlmap.client.SqlMapClient;
import java.sql.SQLException;
import java.util.List;
import mbg.test.ib2j2.generated.hierarchical.model.PkonlyExample;
import mbg.test.ib2j2.generated.hierarchical.model.PkonlyKey;

public class PkonlyDAOImpl implements PkonlyDAO {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table PKONLY
     *
     * @mbg.generated Sat Mar 25 03:13:53 CST 2017
     */
    private SqlMapClient sqlMapClient;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table PKONLY
     *
     * @mbg.generated Sat Mar 25 03:13:53 CST 2017
     */
    public PkonlyDAOImpl(SqlMapClient sqlMapClient) {
        super();
        this.sqlMapClient = sqlMapClient;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table PKONLY
     *
     * @mbg.generated Sat Mar 25 03:13:53 CST 2017
     */
    public long countByExample(PkonlyExample example) throws SQLException {
        Long count = (Long)  sqlMapClient.queryForObject("PKONLY.countByExample", example);
        return count.longValue();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table PKONLY
     *
     * @mbg.generated Sat Mar 25 03:13:53 CST 2017
     */
    public int deleteByExample(PkonlyExample example) throws SQLException {
        int rows = sqlMapClient.delete("PKONLY.deleteByExample", example);
        return rows;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table PKONLY
     *
     * @mbg.generated Sat Mar 25 03:13:53 CST 2017
     */
    public int deleteByPrimaryKey(PkonlyKey _key) throws SQLException {
        int rows = sqlMapClient.delete("PKONLY.deleteByPrimaryKey", _key);
        return rows;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table PKONLY
     *
     * @mbg.generated Sat Mar 25 03:13:53 CST 2017
     */
    public void insert(PkonlyKey record) throws SQLException {
        sqlMapClient.insert("PKONLY.insert", record);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table PKONLY
     *
     * @mbg.generated Sat Mar 25 03:13:53 CST 2017
     */
    public void insertSelective(PkonlyKey record) throws SQLException {
        sqlMapClient.insert("PKONLY.insertSelective", record);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table PKONLY
     *
     * @mbg.generated Sat Mar 25 03:13:53 CST 2017
     */
    public List selectByExample(PkonlyExample example) throws SQLException {
        List list = sqlMapClient.queryForList("PKONLY.selectByExample", example);
        return list;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table PKONLY
     *
     * @mbg.generated Sat Mar 25 03:13:53 CST 2017
     */
    public int updateByExampleSelective(PkonlyKey record, PkonlyExample example) throws SQLException {
        UpdateByExampleParms parms = new UpdateByExampleParms(record, example);
        int rows = sqlMapClient.update("PKONLY.updateByExampleSelective", parms);
        return rows;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table PKONLY
     *
     * @mbg.generated Sat Mar 25 03:13:53 CST 2017
     */
    public int updateByExample(PkonlyKey record, PkonlyExample example) throws SQLException {
        UpdateByExampleParms parms = new UpdateByExampleParms(record, example);
        int rows = sqlMapClient.update("PKONLY.updateByExample", parms);
        return rows;
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table PKONLY
     *
     * @mbg.generated Sat Mar 25 03:13:53 CST 2017
     */
    protected static class UpdateByExampleParms extends PkonlyExample {
        private Object record;

        public UpdateByExampleParms(Object record, PkonlyExample example) {
            super(example);
            this.record = record;
        }

        public Object getRecord() {
            return record;
        }
    }
}