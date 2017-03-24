package mbg.test.ib2j5.generated.flat.dao;

import java.sql.SQLException;
import java.util.List;
import mbg.test.ib2j5.generated.flat.model.Pkonly;
import mbg.test.ib2j5.generated.flat.model.PkonlyExample;

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
    int deleteByPrimaryKey(Integer id, Integer seqNum) throws SQLException;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table PKONLY
     *
     * @mbg.generated Sat Mar 25 03:24:02 CST 2017
     */
    void insert(Pkonly record) throws SQLException;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table PKONLY
     *
     * @mbg.generated Sat Mar 25 03:24:02 CST 2017
     */
    void insertSelective(Pkonly record) throws SQLException;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table PKONLY
     *
     * @mbg.generated Sat Mar 25 03:24:02 CST 2017
     */
    List<Pkonly> selectByExample(PkonlyExample example) throws SQLException;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table PKONLY
     *
     * @mbg.generated Sat Mar 25 03:24:02 CST 2017
     */
    int updateByExampleSelective(Pkonly record, PkonlyExample example) throws SQLException;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table PKONLY
     *
     * @mbg.generated Sat Mar 25 03:24:02 CST 2017
     */
    int updateByExample(Pkonly record, PkonlyExample example) throws SQLException;
}