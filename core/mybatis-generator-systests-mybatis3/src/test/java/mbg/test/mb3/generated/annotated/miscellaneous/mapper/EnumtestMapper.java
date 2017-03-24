package mbg.test.mb3.generated.annotated.miscellaneous.mapper;

import java.util.List;
import mbg.test.common.BaseInterface;
import mbg.test.mb3.generated.annotated.miscellaneous.model.Enumtest;
import mbg.test.mb3.generated.annotated.miscellaneous.model.EnumtestCriteria;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.DeleteProvider;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.InsertProvider;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.SelectProvider;
import org.apache.ibatis.annotations.Update;
import org.apache.ibatis.annotations.UpdateProvider;
import org.apache.ibatis.type.JdbcType;

public interface EnumtestMapper extends BaseInterface {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ENUMTEST
     *
     * @mbg.generated
     */
    @SelectProvider(type=EnumtestSqlProvider.class, method="countByExample")
    long countByExample(EnumtestCriteria example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ENUMTEST
     *
     * @mbg.generated
     */
    @DeleteProvider(type=EnumtestSqlProvider.class, method="deleteByExample")
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
    @InsertProvider(type=EnumtestSqlProvider.class, method="insertSelective")
    int insertSelective(Enumtest record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ENUMTEST
     *
     * @mbg.generated
     */
    @SelectProvider(type=EnumtestSqlProvider.class, method="selectByExample")
    @Results({
        @Result(column="ID", property="id", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="NAME", property="name", jdbcType=JdbcType.VARCHAR)
    })
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
    @Results({
        @Result(column="ID", property="id", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="NAME", property="name", jdbcType=JdbcType.VARCHAR)
    })
    Enumtest selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ENUMTEST
     *
     * @mbg.generated
     */
    @UpdateProvider(type=EnumtestSqlProvider.class, method="updateByExampleSelective")
    int updateByExampleSelective(@Param("record") Enumtest record, @Param("example") EnumtestCriteria example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ENUMTEST
     *
     * @mbg.generated
     */
    @UpdateProvider(type=EnumtestSqlProvider.class, method="updateByExample")
    int updateByExample(@Param("record") Enumtest record, @Param("example") EnumtestCriteria example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ENUMTEST
     *
     * @mbg.generated
     */
    @UpdateProvider(type=EnumtestSqlProvider.class, method="updateByPrimaryKeySelective")
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