package mbg.test.ib2j5.generated.conditional.dao;

import java.sql.SQLException;
import java.util.List;
import mbg.test.ib2j5.generated.conditional.model.PkonlyExample;
import mbg.test.ib2j5.generated.conditional.model.PkonlyKey;

public interface PkonlyDAO {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table PKONLY
     *
     * @mbg.generated Sat Mar 25 03:24:02 CST 2017
     */
    long countByExample(PkonlyExample example) throws SQLException;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table PKONLY
     *
     * @mbg.generated Sat Mar 25 03:24:02 CST 2017
     */
    int deleteByExample(PkonlyExample example) throws SQLException;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table PKONLY
     *
     * @mbg.generated Sat Mar 25 03:24:02 CST 2017
     */
    int deleteByPrimaryKey(PkonlyKey _key) throws SQLException;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table PKONLY
     *
     * @mbg.generated Sat Mar 25 03:24:02 CST 2017
     */
    void insert(PkonlyKey record) throws SQLException;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table PKONLY
     *
     * @mbg.generated Sat Mar 25 03:24:02 CST 2017
     */
    void insertSelective(PkonlyKey record) throws SQLException;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table PKONLY
     *
     * @mbg.generated Sat Mar 25 03:24:02 CST 2017
     */
    List<PkonlyKey> selectByExample(PkonlyExample example) throws SQLException;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table PKONLY
     *
     * @mbg.generated Sat Mar 25 03:24:02 CST 2017
     */
    int updateByExampleSelective(PkonlyKey record, PkonlyExample example) throws SQLException;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table PKONLY
     *
     * @mbg.generated Sat Mar 25 03:24:02 CST 2017
     */
    int updateByExample(PkonlyKey record, PkonlyExample example) throws SQLException;
}