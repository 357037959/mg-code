package mbg.test.ib2j2.generated.miscellaneous.dao;

import java.sql.SQLException;
import java.util.List;
import mbg.test.common.BaseInterface;
import mbg.test.ib2j2.generated.miscellaneous.model.MyObject;
import mbg.test.ib2j2.generated.miscellaneous.model.MyObjectExample;
import mbg.test.ib2j2.generated.miscellaneous.model.MyObjectKey;

public interface MyObjectDAO extends BaseInterface {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table PKFIELDS
     *
     * @mbg.generated Sat Mar 25 03:13:53 CST 2017
     */
    long countMyObjectByExample(MyObjectExample example) throws SQLException;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table PKFIELDS
     *
     * @mbg.generated Sat Mar 25 03:13:53 CST 2017
     */
    int deleteMyObjectByExample(MyObjectExample example) throws SQLException;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table PKFIELDS
     *
     * @mbg.generated Sat Mar 25 03:13:53 CST 2017
     */
    int deleteMyObjectByPrimaryKey(MyObjectKey _key) throws SQLException;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table PKFIELDS
     *
     * @mbg.generated Sat Mar 25 03:13:53 CST 2017
     */
    void insertMyObject(MyObject record) throws SQLException;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table PKFIELDS
     *
     * @mbg.generated Sat Mar 25 03:13:53 CST 2017
     */
    void insertMyObjectSelective(MyObject record) throws SQLException;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table PKFIELDS
     *
     * @mbg.generated Sat Mar 25 03:13:53 CST 2017
     */
    List selectMyObjectByExample(MyObjectExample example) throws SQLException;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table PKFIELDS
     *
     * @mbg.generated Sat Mar 25 03:13:53 CST 2017
     */
    MyObject selectMyObjectByPrimaryKey(MyObjectKey _key) throws SQLException;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table PKFIELDS
     *
     * @mbg.generated Sat Mar 25 03:13:53 CST 2017
     */
    int updateMyObjectByExampleSelective(MyObject record, MyObjectExample example) throws SQLException;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table PKFIELDS
     *
     * @mbg.generated Sat Mar 25 03:13:53 CST 2017
     */
    int updateMyObjectByExample(MyObject record, MyObjectExample example) throws SQLException;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table PKFIELDS
     *
     * @mbg.generated Sat Mar 25 03:13:53 CST 2017
     */
    int updateMyObjectByPrimaryKeySelective(MyObject record) throws SQLException;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table PKFIELDS
     *
     * @mbg.generated Sat Mar 25 03:13:53 CST 2017
     */
    int updateMyObjectByPrimaryKey(MyObject record) throws SQLException;
}