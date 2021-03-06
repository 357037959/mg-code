package mbg.test.mb3.generated.miscellaneous.mapper;

import java.util.List;
import mbg.test.common.BaseInterface;
import mbg.test.mb3.generated.miscellaneous.model.Generatedalwaystest;
import mbg.test.mb3.generated.miscellaneous.model.GeneratedalwaystestCriteria;
import org.apache.ibatis.annotations.Param;

public interface GeneratedalwaystestMapper extends BaseInterface {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table GENERATEDALWAYSTEST
     *
     * @mbg.generated
     */
    long countByExample(GeneratedalwaystestCriteria example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table GENERATEDALWAYSTEST
     *
     * @mbg.generated
     */
    int deleteByExample(GeneratedalwaystestCriteria example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table GENERATEDALWAYSTEST
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table GENERATEDALWAYSTEST
     *
     * @mbg.generated
     */
    int insert(Generatedalwaystest record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table GENERATEDALWAYSTEST
     *
     * @mbg.generated
     */
    int insertSelective(Generatedalwaystest record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table GENERATEDALWAYSTEST
     *
     * @mbg.generated
     */
    List<Generatedalwaystest> selectByExampleWithBLOBs(GeneratedalwaystestCriteria example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table GENERATEDALWAYSTEST
     *
     * @mbg.generated
     */
    List<Generatedalwaystest> selectByExample(GeneratedalwaystestCriteria example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table GENERATEDALWAYSTEST
     *
     * @mbg.generated
     */
    Generatedalwaystest selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table GENERATEDALWAYSTEST
     *
     * @mbg.generated
     */
    int updateByExampleSelective(@Param("record") Generatedalwaystest record, @Param("example") GeneratedalwaystestCriteria example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table GENERATEDALWAYSTEST
     *
     * @mbg.generated
     */
    int updateByExampleWithBLOBs(@Param("record") Generatedalwaystest record, @Param("example") GeneratedalwaystestCriteria example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table GENERATEDALWAYSTEST
     *
     * @mbg.generated
     */
    int updateByExample(@Param("record") Generatedalwaystest record, @Param("example") GeneratedalwaystestCriteria example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table GENERATEDALWAYSTEST
     *
     * @mbg.generated
     */
    int updateByPrimaryKeySelective(Generatedalwaystest record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table GENERATEDALWAYSTEST
     *
     * @mbg.generated
     */
    int updateByPrimaryKeyWithBLOBs(Generatedalwaystest record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table GENERATEDALWAYSTEST
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(Generatedalwaystest record);
}