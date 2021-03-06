package mbg.test.mb3.generated.simpleannotated.mapper;

import java.util.List;
import mbg.test.mb3.generated.simpleannotated.model.AwfulTable;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Options;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.apache.ibatis.type.JdbcType;

public interface AwfulTableMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table awful table
     *
     * @mbg.generated Sat Mar 25 03:24:58 CST 2017
     */
    @Delete({
        "delete from \"awful table\"",
        "where \"CuStOmEr iD\" = #{customerId,jdbcType=INTEGER}"
    })
    int deleteByPrimaryKey(Integer customerId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table awful table
     *
     * @mbg.generated Sat Mar 25 03:24:58 CST 2017
     */
    @Insert({
        "insert into \"awful table\" (\"first name\", FIRST_NAME, ",
        "FIRSTNAME, \"last name\", ",
        "E_MAIL, \"_id1\", \"$id2\", ",
        "\"id5_\", \"id6$\", \"id7$$\", ",
        "EMAILADDRESS, \"from\", ",
        "ACTIVE, ACTIVE1, ACTIVE2, ",
        "CLASS)",
        "values (#{firstFirstName,jdbcType=VARCHAR}, #{secondFirstName,jdbcType=VARCHAR}, ",
        "#{thirdFirstName,jdbcType=VARCHAR}, #{lastName,jdbcType=VARCHAR}, ",
        "#{eMail,jdbcType=VARCHAR}, #{id1,jdbcType=INTEGER}, #{id2,jdbcType=INTEGER}, ",
        "#{id5,jdbcType=INTEGER}, #{id6,jdbcType=INTEGER}, #{id7,jdbcType=INTEGER}, ",
        "#{emailaddress,jdbcType=VARCHAR}, #{from,jdbcType=VARCHAR}, ",
        "#{active,jdbcType=BIT}, #{active1,jdbcType=BOOLEAN}, #{active2,jdbcType=BIT}, ",
        "#{dbClass,jdbcType=VARCHAR})"
    })
    @Options(useGeneratedKeys=true,keyProperty="customerId")
    int insert(AwfulTable record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table awful table
     *
     * @mbg.generated Sat Mar 25 03:24:58 CST 2017
     */
    @Select({
        "select",
        "A.\"CuStOmEr iD\" as \"A_CuStOmEr iD\", A.\"first name\" as \"A_first name\", ",
        "A.FIRST_NAME as A_FIRST_NAME, A.FIRSTNAME as A_FIRSTNAME, A.\"last name\" as \"A_last name\", ",
        "A.E_MAIL as A_E_MAIL, A.\"_id1\" as \"A__id1\", A.\"$id2\" as \"A_$id2\", A.\"id5_\" as \"A_id5_\", ",
        "A.\"id6$\" as \"A_id6$\", A.\"id7$$\" as \"A_id7$$\", A.EMAILADDRESS as A_EMAILADDRESS, ",
        "A.\"from\" as \"A_from\", A.ACTIVE as A_ACTIVE, A.ACTIVE1 as A_ACTIVE1, A.ACTIVE2 as A_ACTIVE2, ",
        "A.CLASS as A_CLASS",
        "from \"awful table\" A",
        "where A.\"CuStOmEr iD\" = #{customerId,jdbcType=INTEGER}"
    })
    @Results({
        @Result(column="A_CuStOmEr iD", property="customerId", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="A_first name", property="firstFirstName", jdbcType=JdbcType.VARCHAR),
        @Result(column="A_FIRST_NAME", property="secondFirstName", jdbcType=JdbcType.VARCHAR),
        @Result(column="A_FIRSTNAME", property="thirdFirstName", jdbcType=JdbcType.VARCHAR),
        @Result(column="A_last name", property="lastName", jdbcType=JdbcType.VARCHAR),
        @Result(column="A_E_MAIL", property="eMail", jdbcType=JdbcType.VARCHAR),
        @Result(column="A__id1", property="id1", jdbcType=JdbcType.INTEGER),
        @Result(column="A_$id2", property="id2", jdbcType=JdbcType.INTEGER),
        @Result(column="A_id5_", property="id5", jdbcType=JdbcType.INTEGER),
        @Result(column="A_id6$", property="id6", jdbcType=JdbcType.INTEGER),
        @Result(column="A_id7$$", property="id7", jdbcType=JdbcType.INTEGER),
        @Result(column="A_EMAILADDRESS", property="emailaddress", jdbcType=JdbcType.VARCHAR),
        @Result(column="A_from", property="from", jdbcType=JdbcType.VARCHAR),
        @Result(column="A_ACTIVE", property="active", jdbcType=JdbcType.BIT),
        @Result(column="A_ACTIVE1", property="active1", jdbcType=JdbcType.BOOLEAN),
        @Result(column="A_ACTIVE2", property="active2", jdbcType=JdbcType.BIT),
        @Result(column="A_CLASS", property="dbClass", jdbcType=JdbcType.VARCHAR)
    })
    AwfulTable selectByPrimaryKey(Integer customerId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table awful table
     *
     * @mbg.generated Sat Mar 25 03:24:58 CST 2017
     */
    @Select({
        "select",
        "A.\"CuStOmEr iD\" as \"A_CuStOmEr iD\", A.\"first name\" as \"A_first name\", ",
        "A.FIRST_NAME as A_FIRST_NAME, A.FIRSTNAME as A_FIRSTNAME, A.\"last name\" as \"A_last name\", ",
        "A.E_MAIL as A_E_MAIL, A.\"_id1\" as \"A__id1\", A.\"$id2\" as \"A_$id2\", A.\"id5_\" as \"A_id5_\", ",
        "A.\"id6$\" as \"A_id6$\", A.\"id7$$\" as \"A_id7$$\", A.EMAILADDRESS as A_EMAILADDRESS, ",
        "A.\"from\" as \"A_from\", A.ACTIVE as A_ACTIVE, A.ACTIVE1 as A_ACTIVE1, A.ACTIVE2 as A_ACTIVE2, ",
        "A.CLASS as A_CLASS",
        "from \"awful table\" A"
    })
    @Results({
        @Result(column="A_CuStOmEr iD", property="customerId", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="A_first name", property="firstFirstName", jdbcType=JdbcType.VARCHAR),
        @Result(column="A_FIRST_NAME", property="secondFirstName", jdbcType=JdbcType.VARCHAR),
        @Result(column="A_FIRSTNAME", property="thirdFirstName", jdbcType=JdbcType.VARCHAR),
        @Result(column="A_last name", property="lastName", jdbcType=JdbcType.VARCHAR),
        @Result(column="A_E_MAIL", property="eMail", jdbcType=JdbcType.VARCHAR),
        @Result(column="A__id1", property="id1", jdbcType=JdbcType.INTEGER),
        @Result(column="A_$id2", property="id2", jdbcType=JdbcType.INTEGER),
        @Result(column="A_id5_", property="id5", jdbcType=JdbcType.INTEGER),
        @Result(column="A_id6$", property="id6", jdbcType=JdbcType.INTEGER),
        @Result(column="A_id7$$", property="id7", jdbcType=JdbcType.INTEGER),
        @Result(column="A_EMAILADDRESS", property="emailaddress", jdbcType=JdbcType.VARCHAR),
        @Result(column="A_from", property="from", jdbcType=JdbcType.VARCHAR),
        @Result(column="A_ACTIVE", property="active", jdbcType=JdbcType.BIT),
        @Result(column="A_ACTIVE1", property="active1", jdbcType=JdbcType.BOOLEAN),
        @Result(column="A_ACTIVE2", property="active2", jdbcType=JdbcType.BIT),
        @Result(column="A_CLASS", property="dbClass", jdbcType=JdbcType.VARCHAR)
    })
    List<AwfulTable> selectAll();

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table awful table
     *
     * @mbg.generated Sat Mar 25 03:24:58 CST 2017
     */
    @Update({
        "update \"awful table\"",
        "set \"first name\" = #{firstFirstName,jdbcType=VARCHAR},",
          "FIRST_NAME = #{secondFirstName,jdbcType=VARCHAR},",
          "FIRSTNAME = #{thirdFirstName,jdbcType=VARCHAR},",
          "\"last name\" = #{lastName,jdbcType=VARCHAR},",
          "E_MAIL = #{eMail,jdbcType=VARCHAR},",
          "\"_id1\" = #{id1,jdbcType=INTEGER},",
          "\"$id2\" = #{id2,jdbcType=INTEGER},",
          "\"id5_\" = #{id5,jdbcType=INTEGER},",
          "\"id6$\" = #{id6,jdbcType=INTEGER},",
          "\"id7$$\" = #{id7,jdbcType=INTEGER},",
          "EMAILADDRESS = #{emailaddress,jdbcType=VARCHAR},",
          "\"from\" = #{from,jdbcType=VARCHAR},",
          "ACTIVE = #{active,jdbcType=BIT},",
          "ACTIVE1 = #{active1,jdbcType=BOOLEAN},",
          "ACTIVE2 = #{active2,jdbcType=BIT},",
          "CLASS = #{dbClass,jdbcType=VARCHAR}",
        "where \"CuStOmEr iD\" = #{customerId,jdbcType=INTEGER}"
    })
    int updateByPrimaryKey(AwfulTable record);
}