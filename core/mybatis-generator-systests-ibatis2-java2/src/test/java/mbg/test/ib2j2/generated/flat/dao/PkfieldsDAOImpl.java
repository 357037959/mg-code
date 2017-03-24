package mbg.test.ib2j2.generated.flat.dao;

import com.ibatis.sqlmap.client.SqlMapClient;
import java.sql.SQLException;
import java.util.List;
import mbg.test.ib2j2.generated.flat.model.Pkfields;
import mbg.test.ib2j2.generated.flat.model.PkfieldsExample;

public class PkfieldsDAOImpl implements PkfieldsDAO {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table PKFIELDS
     *
     * @mbg.generated Sat Mar 25 03:13:53 CST 2017
     */
    private SqlMapClient sqlMapClient;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table PKFIELDS
     *
     * @mbg.generated Sat Mar 25 03:13:53 CST 2017
     */
    public PkfieldsDAOImpl() {
        super();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table PKFIELDS
     *
     * @mbg.generated Sat Mar 25 03:13:53 CST 2017
     */
    public void setSqlMapClient(SqlMapClient sqlMapClient) {
        this.sqlMapClient = sqlMapClient;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table PKFIELDS
     *
     * @mbg.generated Sat Mar 25 03:13:53 CST 2017
     */
    public SqlMapClient getSqlMapClient() {
        return sqlMapClient;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table PKFIELDS
     *
     * @mbg.generated Sat Mar 25 03:13:53 CST 2017
     */
    public long countByExample(PkfieldsExample example) throws SQLException {
        Long count = (Long)  sqlMapClient.queryForObject("PKFIELDS.countByExample", example);
        return count.longValue();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table PKFIELDS
     *
     * @mbg.generated Sat Mar 25 03:13:53 CST 2017
     */
    public int deleteByExample(PkfieldsExample example) throws SQLException {
        int rows = sqlMapClient.delete("PKFIELDS.deleteByExample", example);
        return rows;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table PKFIELDS
     *
     * @mbg.generated Sat Mar 25 03:13:53 CST 2017
     */
    public int deleteByPrimaryKey(Integer id2, Integer id1) throws SQLException {
        Pkfields _key = new Pkfields();
        _key.setId2(id2);
        _key.setId1(id1);
        int rows = sqlMapClient.delete("PKFIELDS.deleteByPrimaryKey", _key);
        return rows;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table PKFIELDS
     *
     * @mbg.generated Sat Mar 25 03:13:53 CST 2017
     */
    public void insert(Pkfields record) throws SQLException {
        sqlMapClient.insert("PKFIELDS.insert", record);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table PKFIELDS
     *
     * @mbg.generated Sat Mar 25 03:13:53 CST 2017
     */
    public void insertSelective(Pkfields record) throws SQLException {
        sqlMapClient.insert("PKFIELDS.insertSelective", record);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table PKFIELDS
     *
     * @mbg.generated Sat Mar 25 03:13:53 CST 2017
     */
    public List selectByExample(PkfieldsExample example) throws SQLException {
        List list = sqlMapClient.queryForList("PKFIELDS.selectByExample", example);
        return list;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table PKFIELDS
     *
     * @mbg.generated Sat Mar 25 03:13:53 CST 2017
     */
    public Pkfields selectByPrimaryKey(Integer id2, Integer id1) throws SQLException {
        Pkfields _key = new Pkfields();
        _key.setId2(id2);
        _key.setId1(id1);
        Pkfields record = (Pkfields) sqlMapClient.queryForObject("PKFIELDS.selectByPrimaryKey", _key);
        return record;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table PKFIELDS
     *
     * @mbg.generated Sat Mar 25 03:13:53 CST 2017
     */
    public int updateByExampleSelective(Pkfields record, PkfieldsExample example) throws SQLException {
        UpdateByExampleParms parms = new UpdateByExampleParms(record, example);
        int rows = sqlMapClient.update("PKFIELDS.updateByExampleSelective", parms);
        return rows;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table PKFIELDS
     *
     * @mbg.generated Sat Mar 25 03:13:53 CST 2017
     */
    public int updateByExample(Pkfields record, PkfieldsExample example) throws SQLException {
        UpdateByExampleParms parms = new UpdateByExampleParms(record, example);
        int rows = sqlMapClient.update("PKFIELDS.updateByExample", parms);
        return rows;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table PKFIELDS
     *
     * @mbg.generated Sat Mar 25 03:13:53 CST 2017
     */
    public int updateByPrimaryKeySelective(Pkfields record) throws SQLException {
        int rows = sqlMapClient.update("PKFIELDS.updateByPrimaryKeySelective", record);
        return rows;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table PKFIELDS
     *
     * @mbg.generated Sat Mar 25 03:13:53 CST 2017
     */
    public int updateByPrimaryKey(Pkfields record) throws SQLException {
        int rows = sqlMapClient.update("PKFIELDS.updateByPrimaryKey", record);
        return rows;
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table PKFIELDS
     *
     * @mbg.generated Sat Mar 25 03:13:53 CST 2017
     */
    protected static class UpdateByExampleParms extends PkfieldsExample {
        private Object record;

        public UpdateByExampleParms(Object record, PkfieldsExample example) {
            super(example);
            this.record = record;
        }

        public Object getRecord() {
            return record;
        }
    }
}