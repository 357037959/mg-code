package mbg.test.mb3.generated.miscellaneous.mapper;

import java.util.List;
import mbg.test.common.BaseInterface;
import mbg.test.mb3.generated.miscellaneous.model.Generatedalwaystestnoupdates;
import mbg.test.mb3.generated.miscellaneous.model.GeneratedalwaystestnoupdatesCriteria;
import org.apache.ibatis.annotations.Param;

public interface GeneratedalwaystestnoupdatesMapper extends BaseInterface {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table GENERATEDALWAYSTESTNOUPDATES
     *
     * @mbg.generated
     */
    long countByExample(GeneratedalwaystestnoupdatesCriteria example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table GENERATEDALWAYSTESTNOUPDATES
     *
     * @mbg.generated
     */
    int deleteByExample(GeneratedalwaystestnoupdatesCriteria example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table GENERATEDALWAYSTESTNOUPDATES
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table GENERATEDALWAYSTESTNOUPDATES
     *
     * @mbg.generated
     */
    int insert(Generatedalwaystestnoupdates record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table GENERATEDALWAYSTESTNOUPDATES
     *
     * @mbg.generated
     */
    int insertSelective(Generatedalwaystestnoupdates record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table GENERATEDALWAYSTESTNOUPDATES
     *
     * @mbg.generated
     */
    List<Generatedalwaystestnoupdates> selectByExample(GeneratedalwaystestnoupdatesCriteria example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table GENERATEDALWAYSTESTNOUPDATES
     *
     * @mbg.generated
     */
    Generatedalwaystestnoupdates selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table GENERATEDALWAYSTESTNOUPDATES
     *
     * @mbg.generated
     */
    int updateByExampleSelective(@Param("record") Generatedalwaystestnoupdates record, @Param("example") GeneratedalwaystestnoupdatesCriteria example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table GENERATEDALWAYSTESTNOUPDATES
     *
     * @mbg.generated
     */
    int updateByExample(@Param("record") Generatedalwaystestnoupdates record, @Param("example") GeneratedalwaystestnoupdatesCriteria example);
}