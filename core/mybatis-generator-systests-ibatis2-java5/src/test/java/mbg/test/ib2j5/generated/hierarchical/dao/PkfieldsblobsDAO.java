package mbg.test.ib2j5.generated.hierarchical.dao;

import java.util.List;
import mbg.test.ib2j5.generated.hierarchical.model.Pkfieldsblobs;
import mbg.test.ib2j5.generated.hierarchical.model.PkfieldsblobsExample;
import mbg.test.ib2j5.generated.hierarchical.model.PkfieldsblobsKey;
import mbg.test.ib2j5.generated.hierarchical.model.PkfieldsblobsWithBLOBs;

public interface PkfieldsblobsDAO {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table PKFIELDSBLOBS
     *
     * @mbg.generated Sat Mar 25 03:24:02 CST 2017
     */
    long countByExample(PkfieldsblobsExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table PKFIELDSBLOBS
     *
     * @mbg.generated Sat Mar 25 03:24:02 CST 2017
     */
    int deleteByExample(PkfieldsblobsExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table PKFIELDSBLOBS
     *
     * @mbg.generated Sat Mar 25 03:24:02 CST 2017
     */
    int deleteByPrimaryKey(PkfieldsblobsKey _key);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table PKFIELDSBLOBS
     *
     * @mbg.generated Sat Mar 25 03:24:02 CST 2017
     */
    void insert(PkfieldsblobsWithBLOBs record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table PKFIELDSBLOBS
     *
     * @mbg.generated Sat Mar 25 03:24:02 CST 2017
     */
    void insertSelective(PkfieldsblobsWithBLOBs record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table PKFIELDSBLOBS
     *
     * @mbg.generated Sat Mar 25 03:24:02 CST 2017
     */
    List<PkfieldsblobsWithBLOBs> selectByExampleWithBLOBs(PkfieldsblobsExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table PKFIELDSBLOBS
     *
     * @mbg.generated Sat Mar 25 03:24:02 CST 2017
     */
    List<Pkfieldsblobs> selectByExampleWithoutBLOBs(PkfieldsblobsExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table PKFIELDSBLOBS
     *
     * @mbg.generated Sat Mar 25 03:24:02 CST 2017
     */
    PkfieldsblobsWithBLOBs selectByPrimaryKey(PkfieldsblobsKey _key);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table PKFIELDSBLOBS
     *
     * @mbg.generated Sat Mar 25 03:24:02 CST 2017
     */
    int updateByExampleSelective(PkfieldsblobsWithBLOBs record, PkfieldsblobsExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table PKFIELDSBLOBS
     *
     * @mbg.generated Sat Mar 25 03:24:02 CST 2017
     */
    int updateByExample(PkfieldsblobsWithBLOBs record, PkfieldsblobsExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table PKFIELDSBLOBS
     *
     * @mbg.generated Sat Mar 25 03:24:02 CST 2017
     */
    int updateByExample(Pkfieldsblobs record, PkfieldsblobsExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table PKFIELDSBLOBS
     *
     * @mbg.generated Sat Mar 25 03:24:02 CST 2017
     */
    int updateByPrimaryKeySelective(PkfieldsblobsWithBLOBs record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table PKFIELDSBLOBS
     *
     * @mbg.generated Sat Mar 25 03:24:02 CST 2017
     */
    int updateByPrimaryKey(PkfieldsblobsWithBLOBs record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table PKFIELDSBLOBS
     *
     * @mbg.generated Sat Mar 25 03:24:02 CST 2017
     */
    int updateByPrimaryKey(Pkfieldsblobs record);
}