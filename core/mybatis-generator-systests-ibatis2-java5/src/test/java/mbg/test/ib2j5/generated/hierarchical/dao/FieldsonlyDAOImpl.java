package mbg.test.ib2j5.generated.hierarchical.dao;

import java.util.List;
import mbg.test.ib2j5.generated.hierarchical.model.subpackage.Fieldsonly;
import mbg.test.ib2j5.generated.hierarchical.model.subpackage.FieldsonlyExample;
import org.springframework.orm.ibatis.support.SqlMapClientDaoSupport;

public class FieldsonlyDAOImpl extends SqlMapClientDaoSupport implements FieldsonlyDAO {

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table FIELDSONLY
     *
     * @mbg.generated Sat Mar 25 03:24:02 CST 2017
     */
    public FieldsonlyDAOImpl() {
        super();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table FIELDSONLY
     *
     * @mbg.generated Sat Mar 25 03:24:02 CST 2017
     */
    public long countByExample(FieldsonlyExample example) {
        Long count = (Long)  getSqlMapClientTemplate().queryForObject("FIELDSONLY.countByExample", example);
        return count;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table FIELDSONLY
     *
     * @mbg.generated Sat Mar 25 03:24:02 CST 2017
     */
    public int deleteByExample(FieldsonlyExample example) {
        int rows = getSqlMapClientTemplate().delete("FIELDSONLY.deleteByExample", example);
        return rows;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table FIELDSONLY
     *
     * @mbg.generated Sat Mar 25 03:24:02 CST 2017
     */
    public void insert(Fieldsonly record) {
        getSqlMapClientTemplate().insert("FIELDSONLY.insert", record);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table FIELDSONLY
     *
     * @mbg.generated Sat Mar 25 03:24:02 CST 2017
     */
    public void insertSelective(Fieldsonly record) {
        getSqlMapClientTemplate().insert("FIELDSONLY.insertSelective", record);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table FIELDSONLY
     *
     * @mbg.generated Sat Mar 25 03:24:02 CST 2017
     */
    @SuppressWarnings("unchecked")
    public List<Fieldsonly> selectByExample(FieldsonlyExample example) {
        List<Fieldsonly> list = getSqlMapClientTemplate().queryForList("FIELDSONLY.selectByExample", example);
        return list;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table FIELDSONLY
     *
     * @mbg.generated Sat Mar 25 03:24:02 CST 2017
     */
    public int updateByExampleSelective(Fieldsonly record, FieldsonlyExample example) {
        UpdateByExampleParms parms = new UpdateByExampleParms(record, example);
        int rows = getSqlMapClientTemplate().update("FIELDSONLY.updateByExampleSelective", parms);
        return rows;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table FIELDSONLY
     *
     * @mbg.generated Sat Mar 25 03:24:02 CST 2017
     */
    public int updateByExample(Fieldsonly record, FieldsonlyExample example) {
        UpdateByExampleParms parms = new UpdateByExampleParms(record, example);
        int rows = getSqlMapClientTemplate().update("FIELDSONLY.updateByExample", parms);
        return rows;
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table FIELDSONLY
     *
     * @mbg.generated Sat Mar 25 03:24:02 CST 2017
     */
    protected static class UpdateByExampleParms extends FieldsonlyExample {
        private Object record;

        public UpdateByExampleParms(Object record, FieldsonlyExample example) {
            super(example);
            this.record = record;
        }

        public Object getRecord() {
            return record;
        }
    }
}