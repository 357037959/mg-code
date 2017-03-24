package mbg.test.mb3.generated.mixed.miscellaneous.mapper;

import java.util.List;
import mbg.test.common.BaseInterface;
import mbg.test.mb3.generated.mixed.miscellaneous.model.Regexrename;
import mbg.test.mb3.generated.mixed.miscellaneous.model.RegexrenameCriteria;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.ResultMap;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.SelectKey;
import org.apache.ibatis.annotations.Update;

public interface RegexrenameMapper extends BaseInterface {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table REGEXRENAME
     *
     * @mbg.generated
     */
    long countByExample(RegexrenameCriteria example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table REGEXRENAME
     *
     * @mbg.generated
     */
    int deleteByExample(RegexrenameCriteria example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table REGEXRENAME
     *
     * @mbg.generated
     */
    @Delete({
        "delete from REGEXRENAME",
        "where CUST_ID = #{id,jdbcType=INTEGER}"
    })
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table REGEXRENAME
     *
     * @mbg.generated
     */
    @Insert({
        "insert into REGEXRENAME (CUST_ID, CUST_NAME, ",
        "CUST_ADDRESS, ZIP_CODE)",
        "values (#{id,jdbcType=INTEGER}, #{name,jdbcType=VARCHAR}, ",
        "#{address,jdbcType=VARCHAR}, #{zipCode,jdbcType=CHAR})"
    })
    @SelectKey(statement="call next value for TestSequence", keyProperty="id", before=true, resultType=Integer.class)
    int insert(Regexrename record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table REGEXRENAME
     *
     * @mbg.generated
     */
    int insertSelective(Regexrename record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table REGEXRENAME
     *
     * @mbg.generated
     */
    List<Regexrename> selectByExample(RegexrenameCriteria example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table REGEXRENAME
     *
     * @mbg.generated
     */
    @Select({
        "select",
        "CUST_ID, CUST_NAME, CUST_ADDRESS, ZIP_CODE",
        "from REGEXRENAME",
        "where CUST_ID = #{id,jdbcType=INTEGER}"
    })
    @ResultMap("mbg.test.mb3.generated.mixed.miscellaneous.mapper.RegexrenameMapper.BaseResultMap")
    Regexrename selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table REGEXRENAME
     *
     * @mbg.generated
     */
    int updateByExampleSelective(@Param("record") Regexrename record, @Param("example") RegexrenameCriteria example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table REGEXRENAME
     *
     * @mbg.generated
     */
    int updateByExample(@Param("record") Regexrename record, @Param("example") RegexrenameCriteria example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table REGEXRENAME
     *
     * @mbg.generated
     */
    int updateByPrimaryKeySelective(Regexrename record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table REGEXRENAME
     *
     * @mbg.generated
     */
    @Update({
        "update REGEXRENAME",
        "set CUST_NAME = #{name,jdbcType=VARCHAR},",
          "CUST_ADDRESS = #{address,jdbcType=VARCHAR},",
          "ZIP_CODE = #{zipCode,jdbcType=CHAR}",
        "where CUST_ID = #{id,jdbcType=INTEGER}"
    })
    int updateByPrimaryKey(Regexrename record);
}