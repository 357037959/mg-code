package mbg.test.mb3.generated.hierarchical.immutable.mapper;

import java.util.List;
import mbg.test.mb3.generated.hierarchical.immutable.model.Pkfieldsblobs;
import mbg.test.mb3.generated.hierarchical.immutable.model.PkfieldsblobsExample;
import mbg.test.mb3.generated.hierarchical.immutable.model.PkfieldsblobsKey;
import mbg.test.mb3.generated.hierarchical.immutable.model.PkfieldsblobsWithBLOBs;
import org.apache.ibatis.annotations.Param;

public interface PkfieldsblobsMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table PKFIELDSBLOBS
     *
     * @mbg.generated Sat Mar 25 03:24:58 CST 2017
     */
    long countByExample(PkfieldsblobsExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table PKFIELDSBLOBS
     *
     * @mbg.generated Sat Mar 25 03:24:58 CST 2017
     */
    int deleteByExample(PkfieldsblobsExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table PKFIELDSBLOBS
     *
     * @mbg.generated Sat Mar 25 03:24:58 CST 2017
     */
    int deleteByPrimaryKey(PkfieldsblobsKey key);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table PKFIELDSBLOBS
     *
     * @mbg.generated Sat Mar 25 03:24:58 CST 2017
     */
    int insert(PkfieldsblobsWithBLOBs record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table PKFIELDSBLOBS
     *
     * @mbg.generated Sat Mar 25 03:24:58 CST 2017
     */
    int insertSelective(PkfieldsblobsWithBLOBs record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table PKFIELDSBLOBS
     *
     * @mbg.generated Sat Mar 25 03:24:58 CST 2017
     */
    List<PkfieldsblobsWithBLOBs> selectByExampleWithBLOBs(PkfieldsblobsExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table PKFIELDSBLOBS
     *
     * @mbg.generated Sat Mar 25 03:24:58 CST 2017
     */
    List<Pkfieldsblobs> selectByExample(PkfieldsblobsExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table PKFIELDSBLOBS
     *
     * @mbg.generated Sat Mar 25 03:24:58 CST 2017
     */
    PkfieldsblobsWithBLOBs selectByPrimaryKey(PkfieldsblobsKey key);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table PKFIELDSBLOBS
     *
     * @mbg.generated Sat Mar 25 03:24:58 CST 2017
     */
    int updateByExampleSelective(@Param("record") PkfieldsblobsWithBLOBs record, @Param("example") PkfieldsblobsExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table PKFIELDSBLOBS
     *
     * @mbg.generated Sat Mar 25 03:24:58 CST 2017
     */
    int updateByExampleWithBLOBs(@Param("record") PkfieldsblobsWithBLOBs record, @Param("example") PkfieldsblobsExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table PKFIELDSBLOBS
     *
     * @mbg.generated Sat Mar 25 03:24:58 CST 2017
     */
    int updateByExample(@Param("record") Pkfieldsblobs record, @Param("example") PkfieldsblobsExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table PKFIELDSBLOBS
     *
     * @mbg.generated Sat Mar 25 03:24:58 CST 2017
     */
    int updateByPrimaryKeySelective(PkfieldsblobsWithBLOBs record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table PKFIELDSBLOBS
     *
     * @mbg.generated Sat Mar 25 03:24:58 CST 2017
     */
    int updateByPrimaryKeyWithBLOBs(PkfieldsblobsWithBLOBs record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table PKFIELDSBLOBS
     *
     * @mbg.generated Sat Mar 25 03:24:58 CST 2017
     */
    int updateByPrimaryKey(Pkfieldsblobs record);
}