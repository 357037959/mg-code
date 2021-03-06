package mbg.test.mb3.generated.hierarchical.mapper;

import java.util.List;
import mbg.test.mb3.generated.hierarchical.model.PkonlyExample;
import mbg.test.mb3.generated.hierarchical.model.PkonlyKey;
import org.apache.ibatis.annotations.Param;

public interface PkonlyMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table PKONLY
     *
     * @mbg.generated 2017-03-25
     */
    long countByExample(PkonlyExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table PKONLY
     *
     * @mbg.generated 2017-03-25
     */
    int deleteByExample(PkonlyExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table PKONLY
     *
     * @mbg.generated 2017-03-25
     */
    int deleteByPrimaryKey(PkonlyKey key);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table PKONLY
     *
     * @mbg.generated 2017-03-25
     */
    int insert(PkonlyKey record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table PKONLY
     *
     * @mbg.generated 2017-03-25
     */
    int insertSelective(PkonlyKey record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table PKONLY
     *
     * @mbg.generated 2017-03-25
     */
    List<PkonlyKey> selectByExample(PkonlyExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table PKONLY
     *
     * @mbg.generated 2017-03-25
     */
    int updateByExampleSelective(@Param("record") PkonlyKey record, @Param("example") PkonlyExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table PKONLY
     *
     * @mbg.generated 2017-03-25
     */
    int updateByExample(@Param("record") PkonlyKey record, @Param("example") PkonlyExample example);
}