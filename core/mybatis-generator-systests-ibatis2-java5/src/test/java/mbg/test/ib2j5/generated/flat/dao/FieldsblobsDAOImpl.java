package mbg.test.ib2j5.generated.flat.dao;

import com.ibatis.sqlmap.client.SqlMapClient;
import java.sql.SQLException;
import java.util.List;
import mbg.test.ib2j5.generated.flat.model.Fieldsblobs;
import mbg.test.ib2j5.generated.flat.model.FieldsblobsExample;

public class FieldsblobsDAOImpl implements FieldsblobsDAO {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table FIELDSBLOBS
     *
     * @mbg.generated Sat Mar 25 03:24:02 CST 2017
     */
    private SqlMapClient sqlMapClient;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table FIELDSBLOBS
     *
     * @mbg.generated Sat Mar 25 03:24:02 CST 2017
     */
    public FieldsblobsDAOImpl(SqlMapClient sqlMapClient) {
        super();
        this.sqlMapClient = sqlMapClient;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table FIELDSBLOBS
     *
     * @mbg.generated Sat Mar 25 03:24:02 CST 2017
     */
    public long countByExample(FieldsblobsExample example) throws SQLException {
        Long count = (Long)  sqlMapClient.queryForObject("FIELDSBLOBS.countByExample", example);
        return count;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table FIELDSBLOBS
     *
     * @mbg.generated Sat Mar 25 03:24:02 CST 2017
     */
    public int deleteByExample(FieldsblobsExample example) throws SQLException {
        int rows = sqlMapClient.delete("FIELDSBLOBS.deleteByExample", example);
        return rows;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table FIELDSBLOBS
     *
     * @mbg.generated Sat Mar 25 03:24:02 CST 2017
     */
    public void insert(Fieldsblobs record) throws SQLException {
        sqlMapClient.insert("FIELDSBLOBS.insert", record);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table FIELDSBLOBS
     *
     * @mbg.generated Sat Mar 25 03:24:02 CST 2017
     */
    public void insertSelective(Fieldsblobs record) throws SQLException {
        sqlMapClient.insert("FIELDSBLOBS.insertSelective", record);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table FIELDSBLOBS
     *
     * @mbg.generated Sat Mar 25 03:24:02 CST 2017
     */
    @SuppressWarnings("unchecked")
    public List<Fieldsblobs> selectByExampleWithBLOBs(FieldsblobsExample example) throws SQLException {
        List<Fieldsblobs> list = sqlMapClient.queryForList("FIELDSBLOBS.selectByExampleWithBLOBs", example);
        return list;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table FIELDSBLOBS
     *
     * @mbg.generated Sat Mar 25 03:24:02 CST 2017
     */
    @SuppressWarnings("unchecked")
    public List<Fieldsblobs> selectByExampleWithoutBLOBs(FieldsblobsExample example) throws SQLException {
        List<Fieldsblobs> list = sqlMapClient.queryForList("FIELDSBLOBS.selectByExample", example);
        return list;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table FIELDSBLOBS
     *
     * @mbg.generated Sat Mar 25 03:24:02 CST 2017
     */
    public int updateByExampleSelective(Fieldsblobs record, FieldsblobsExample example) throws SQLException {
        UpdateByExampleParms parms = new UpdateByExampleParms(record, example);
        int rows = sqlMapClient.update("FIELDSBLOBS.updateByExampleSelective", parms);
        return rows;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table FIELDSBLOBS
     *
     * @mbg.generated Sat Mar 25 03:24:02 CST 2017
     */
    public int updateByExampleWithBLOBs(Fieldsblobs record, FieldsblobsExample example) throws SQLException {
        UpdateByExampleParms parms = new UpdateByExampleParms(record, example);
        int rows = sqlMapClient.update("FIELDSBLOBS.updateByExampleWithBLOBs", parms);
        return rows;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table FIELDSBLOBS
     *
     * @mbg.generated Sat Mar 25 03:24:02 CST 2017
     */
    public int updateByExampleWithoutBLOBs(Fieldsblobs record, FieldsblobsExample example) throws SQLException {
        UpdateByExampleParms parms = new UpdateByExampleParms(record, example);
        int rows = sqlMapClient.update("FIELDSBLOBS.updateByExample", parms);
        return rows;
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table FIELDSBLOBS
     *
     * @mbg.generated Sat Mar 25 03:24:02 CST 2017
     */
    protected static class UpdateByExampleParms extends FieldsblobsExample {
        private Object record;

        public UpdateByExampleParms(Object record, FieldsblobsExample example) {
            super(example);
            this.record = record;
        }

        public Object getRecord() {
            return record;
        }
    }
}