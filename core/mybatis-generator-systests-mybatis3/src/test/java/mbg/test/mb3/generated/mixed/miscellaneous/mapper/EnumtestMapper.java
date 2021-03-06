package mbg.test.mb3.generated.mixed.miscellaneous.mapper;

import java.util.List;
import mbg.test.common.BaseInterface;
import mbg.test.mb3.generated.mixed.miscellaneous.model.Enumtest;
import mbg.test.mb3.generated.mixed.miscellaneous.model.EnumtestCriteria;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.ResultMap;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

public interface EnumtestMapper extends BaseInterface {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ENUMTEST
     *
     * @mbg.generated
     */
    long countByExample(EnumtestCriteria example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ENUMTEST
     *
     * @mbg.generated
     */
    int deleteByExample(EnumtestCriteria example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ENUMTEST
     *
     * @mbg.generated
     */
    @Delete({
        "delete from ENUMTEST",
        "where ID = #{id,jdbcType=INTEGER}"
    })
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ENUMTEST
     *
     * @mbg.generated
     */
    @Insert({
        "insert into ENUMTEST (ID, NAME)",
        "values (#{id,jdbcType=INTEGER}, #{name,jdbcType=VARCHAR})"
    })
    int insert(Enumtest record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ENUMTEST
     *
     * @mbg.generated
     */
    int insertSelective(Enumtest record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ENUMTEST
     *
     * @mbg.generated
     */
    List<Enumtest> selectByExample(EnumtestCriteria example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ENUMTEST
     *
     * @mbg.generated
     */
    @Select({
        "select",
        "ID, NAME",
        "from ENUMTEST",
        "where ID = #{id,jdbcType=INTEGER}"
    })
    @ResultMap("mbg.test.mb3.generated.mixed.miscellaneous.mapper.EnumtestMapper.BaseResultMap")
    Enumtest selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ENUMTEST
     *
     * @mbg.generated
     */
    int updateByExampleSelective(@Param("record") Enumtest record, @Param("example") EnumtestCriteria example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ENUMTEST
     *
     * @mbg.generated
     */
    int updateByExample(@Param("record") Enumtest record, @Param("example") EnumtestCriteria example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ENUMTEST
     *
     * @mbg.generated
     */
    int updateByPrimaryKeySelective(Enumtest record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ENUMTEST
     *
     * @mbg.generated
     */
    @Update({
        "update ENUMTEST",
        "set NAME = #{name,jdbcType=VARCHAR}",
        "where ID = #{id,jdbcType=INTEGER}"
    })
    int updateByPrimaryKey(Enumtest record);
}