package mbg.test.ib2j5.generated.conditional.dao;

import java.sql.SQLException;
import java.util.List;
import mbg.test.ib2j5.generated.conditional.model.Fieldsblobs;
import mbg.test.ib2j5.generated.conditional.model.FieldsblobsExample;
import mbg.test.ib2j5.generated.conditional.model.FieldsblobsWithBLOBs;

public interface FieldsblobsDAO {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table FIELDSBLOBS
     *
     * @mbg.generated Sat Mar 25 03:24:02 CST 2017
     */
    long countByExample(FieldsblobsExample example) throws SQLException;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table FIELDSBLOBS
     *
     * @mbg.generated Sat Mar 25 03:24:02 CST 2017
     */
    int deleteByExample(FieldsblobsExample example) throws SQLException;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table FIELDSBLOBS
     *
     * @mbg.generated Sat Mar 25 03:24:02 CST 2017
     */
    void insert(FieldsblobsWithBLOBs record) throws SQLException;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table FIELDSBLOBS
     *
     * @mbg.generated Sat Mar 25 03:24:02 CST 2017
     */
    void insertSelective(FieldsblobsWithBLOBs record) throws SQLException;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table FIELDSBLOBS
     *
     * @mbg.generated Sat Mar 25 03:24:02 CST 2017
     */
    List<FieldsblobsWithBLOBs> selectByExampleWithBLOBs(FieldsblobsExample example) throws SQLException;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table FIELDSBLOBS
     *
     * @mbg.generated Sat Mar 25 03:24:02 CST 2017
     */
    List<Fieldsblobs> selectByExampleWithoutBLOBs(FieldsblobsExample example) throws SQLException;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table FIELDSBLOBS
     *
     * @mbg.generated Sat Mar 25 03:24:02 CST 2017
     */
    int updateByExampleSelective(FieldsblobsWithBLOBs record, FieldsblobsExample example) throws SQLException;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table FIELDSBLOBS
     *
     * @mbg.generated Sat Mar 25 03:24:02 CST 2017
     */
    int updateByExample(FieldsblobsWithBLOBs record, FieldsblobsExample example) throws SQLException;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table FIELDSBLOBS
     *
     * @mbg.generated Sat Mar 25 03:24:02 CST 2017
     */
    int updateByExample(Fieldsblobs record, FieldsblobsExample example) throws SQLException;
}