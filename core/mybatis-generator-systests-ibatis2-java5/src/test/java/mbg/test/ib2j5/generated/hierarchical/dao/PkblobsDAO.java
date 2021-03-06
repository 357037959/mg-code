package mbg.test.ib2j5.generated.hierarchical.dao;

import java.util.List;
import mbg.test.ib2j5.generated.hierarchical.model.PkblobsExample;
import mbg.test.ib2j5.generated.hierarchical.model.PkblobsKey;
import mbg.test.ib2j5.generated.hierarchical.model.PkblobsWithBLOBs;

public interface PkblobsDAO {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table PKBLOBS
     *
     * @mbg.generated Sat Mar 25 03:24:02 CST 2017
     */
    long countByExample(PkblobsExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table PKBLOBS
     *
     * @mbg.generated Sat Mar 25 03:24:02 CST 2017
     */
    int deleteByExample(PkblobsExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table PKBLOBS
     *
     * @mbg.generated Sat Mar 25 03:24:02 CST 2017
     */
    int deleteByPrimaryKey(PkblobsKey _key);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table PKBLOBS
     *
     * @mbg.generated Sat Mar 25 03:24:02 CST 2017
     */
    void insert(PkblobsWithBLOBs record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table PKBLOBS
     *
     * @mbg.generated Sat Mar 25 03:24:02 CST 2017
     */
    void insertSelective(PkblobsWithBLOBs record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table PKBLOBS
     *
     * @mbg.generated Sat Mar 25 03:24:02 CST 2017
     */
    List<PkblobsWithBLOBs> selectByExampleWithBLOBs(PkblobsExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table PKBLOBS
     *
     * @mbg.generated Sat Mar 25 03:24:02 CST 2017
     */
    List<PkblobsKey> selectByExampleWithoutBLOBs(PkblobsExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table PKBLOBS
     *
     * @mbg.generated Sat Mar 25 03:24:02 CST 2017
     */
    PkblobsWithBLOBs selectByPrimaryKey(PkblobsKey _key);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table PKBLOBS
     *
     * @mbg.generated Sat Mar 25 03:24:02 CST 2017
     */
    int updateByExampleSelective(PkblobsWithBLOBs record, PkblobsExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table PKBLOBS
     *
     * @mbg.generated Sat Mar 25 03:24:02 CST 2017
     */
    int updateByExample(PkblobsWithBLOBs record, PkblobsExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table PKBLOBS
     *
     * @mbg.generated Sat Mar 25 03:24:02 CST 2017
     */
    int updateByExample(PkblobsKey record, PkblobsExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table PKBLOBS
     *
     * @mbg.generated Sat Mar 25 03:24:02 CST 2017
     */
    int updateByPrimaryKeySelective(PkblobsWithBLOBs record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table PKBLOBS
     *
     * @mbg.generated Sat Mar 25 03:24:02 CST 2017
     */
    int updateByPrimaryKey(PkblobsWithBLOBs record);
}