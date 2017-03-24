package mbg.test.mb3.generated.hierarchical.mapper;

import java.util.List;
import mbg.test.mb3.generated.hierarchical.model.Pkfieldsblobs;
import mbg.test.mb3.generated.hierarchical.model.PkfieldsblobsExample;
import mbg.test.mb3.generated.hierarchical.model.PkfieldsblobsKey;
import mbg.test.mb3.generated.hierarchical.model.PkfieldsblobsWithBLOBs;
import org.apache.ibatis.annotations.Param;

public interface PkfieldsblobsMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table PKFIELDSBLOBS
     *
     * @mbg.generated 2017-03-25
     */
    long countByExample(PkfieldsblobsExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table PKFIELDSBLOBS
     *
     * @mbg.generated 2017-03-25
     */
    int deleteByExample(PkfieldsblobsExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table PKFIELDSBLOBS
     *
     * @mbg.generated 2017-03-25
     */
    int deleteByPrimaryKey(PkfieldsblobsKey key);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table PKFIELDSBLOBS
     *
     * @mbg.generated 2017-03-25
     */
    int insert(PkfieldsblobsWithBLOBs record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table PKFIELDSBLOBS
     *
     * @mbg.generated 2017-03-25
     */
    int insertSelective(PkfieldsblobsWithBLOBs record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table PKFIELDSBLOBS
     *
     * @mbg.generated 2017-03-25
     */
    List<PkfieldsblobsWithBLOBs> selectByExampleWithBLOBs(PkfieldsblobsExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table PKFIELDSBLOBS
     *
     * @mbg.generated 2017-03-25
     */
    List<Pkfieldsblobs> selectByExample(PkfieldsblobsExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table PKFIELDSBLOBS
     *
     * @mbg.generated 2017-03-25
     */
    PkfieldsblobsWithBLOBs selectByPrimaryKey(PkfieldsblobsKey key);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table PKFIELDSBLOBS
     *
     * @mbg.generated 2017-03-25
     */
    int updateByExampleSelective(@Param("record") PkfieldsblobsWithBLOBs record, @Param("example") PkfieldsblobsExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table PKFIELDSBLOBS
     *
     * @mbg.generated 2017-03-25
     */
    int updateByExampleWithBLOBs(@Param("record") PkfieldsblobsWithBLOBs record, @Param("example") PkfieldsblobsExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table PKFIELDSBLOBS
     *
     * @mbg.generated 2017-03-25
     */
    int updateByExample(@Param("record") Pkfieldsblobs record, @Param("example") PkfieldsblobsExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table PKFIELDSBLOBS
     *
     * @mbg.generated 2017-03-25
     */
    int updateByPrimaryKeySelective(PkfieldsblobsWithBLOBs record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table PKFIELDSBLOBS
     *
     * @mbg.generated 2017-03-25
     */
    int updateByPrimaryKeyWithBLOBs(PkfieldsblobsWithBLOBs record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table PKFIELDSBLOBS
     *
     * @mbg.generated 2017-03-25
     */
    int updateByPrimaryKey(Pkfieldsblobs record);
}