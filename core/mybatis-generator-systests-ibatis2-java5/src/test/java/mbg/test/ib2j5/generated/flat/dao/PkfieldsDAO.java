package mbg.test.ib2j5.generated.flat.dao;

import java.sql.SQLException;
import java.util.List;
import mbg.test.ib2j5.generated.flat.model.Pkfields;
import mbg.test.ib2j5.generated.flat.model.PkfieldsExample;

public interface PkfieldsDAO {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table PKFIELDS
     *
     * @mbg.generated Sat Mar 25 03:24:02 CST 2017
     */
    long countByExample(PkfieldsExample example) throws SQLException;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table PKFIELDS
     *
     * @mbg.generated Sat Mar 25 03:24:02 CST 2017
     */
    int deleteByExample(PkfieldsExample example) throws SQLException;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table PKFIELDS
     *
     * @mbg.generated Sat Mar 25 03:24:02 CST 2017
     */
    int deleteByPrimaryKey(Integer id2, Integer id1) throws SQLException;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table PKFIELDS
     *
     * @mbg.generated Sat Mar 25 03:24:02 CST 2017
     */
    void insert(Pkfields record) throws SQLException;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table PKFIELDS
     *
     * @mbg.generated Sat Mar 25 03:24:02 CST 2017
     */
    void insertSelective(Pkfields record) throws SQLException;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table PKFIELDS
     *
     * @mbg.generated Sat Mar 25 03:24:02 CST 2017
     */
    List<Pkfields> selectByExample(PkfieldsExample example) throws SQLException;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table PKFIELDS
     *
     * @mbg.generated Sat Mar 25 03:24:02 CST 2017
     */
    Pkfields selectByPrimaryKey(Integer id2, Integer id1) throws SQLException;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table PKFIELDS
     *
     * @mbg.generated Sat Mar 25 03:24:02 CST 2017
     */
    int updateByExampleSelective(Pkfields record, PkfieldsExample example) throws SQLException;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table PKFIELDS
     *
     * @mbg.generated Sat Mar 25 03:24:02 CST 2017
     */
    int updateByExample(Pkfields record, PkfieldsExample example) throws SQLException;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table PKFIELDS
     *
     * @mbg.generated Sat Mar 25 03:24:02 CST 2017
     */
    int updateByPrimaryKeySelective(Pkfields record) throws SQLException;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table PKFIELDS
     *
     * @mbg.generated Sat Mar 25 03:24:02 CST 2017
     */
    int updateByPrimaryKey(Pkfields record) throws SQLException;
}