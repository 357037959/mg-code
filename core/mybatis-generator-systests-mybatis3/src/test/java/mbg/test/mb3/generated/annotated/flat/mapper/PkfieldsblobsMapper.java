package mbg.test.mb3.generated.annotated.flat.mapper;

import java.util.List;
import mbg.test.mb3.generated.annotated.flat.model.Pkfieldsblobs;
import mbg.test.mb3.generated.annotated.flat.model.PkfieldsblobsExample;
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
import org.apache.ibatis.session.RowBounds;
import org.apache.ibatis.type.JdbcType;

public interface PkfieldsblobsMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table PKFIELDSBLOBS
     *
     * @mbg.generated Sat Mar 25 03:24:58 CST 2017
     */
    @SelectProvider(type=PkfieldsblobsSqlProvider.class, method="countByExample")
    long countByExample(PkfieldsblobsExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table PKFIELDSBLOBS
     *
     * @mbg.generated Sat Mar 25 03:24:58 CST 2017
     */
    @DeleteProvider(type=PkfieldsblobsSqlProvider.class, method="deleteByExample")
    int deleteByExample(PkfieldsblobsExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table PKFIELDSBLOBS
     *
     * @mbg.generated Sat Mar 25 03:24:58 CST 2017
     */
    @Delete({
        "delete from PKFIELDSBLOBS",
        "where ID1 = #{id1,jdbcType=INTEGER}",
          "and ID2 = #{id2,jdbcType=INTEGER}"
    })
    int deleteByPrimaryKey(@Param("id1") Integer id1, @Param("id2") Integer id2);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table PKFIELDSBLOBS
     *
     * @mbg.generated Sat Mar 25 03:24:58 CST 2017
     */
    @Insert({
        "insert into PKFIELDSBLOBS (ID1, ID2, ",
        "FIRSTNAME, LASTNAME, ",
        "BLOB1)",
        "values (#{id1,jdbcType=INTEGER}, #{id2,jdbcType=INTEGER}, ",
        "#{firstname,jdbcType=VARCHAR}, #{lastname,jdbcType=VARCHAR}, ",
        "#{blob1,jdbcType=VARBINARY})"
    })
    int insert(Pkfieldsblobs record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table PKFIELDSBLOBS
     *
     * @mbg.generated Sat Mar 25 03:24:58 CST 2017
     */
    @InsertProvider(type=PkfieldsblobsSqlProvider.class, method="insertSelective")
    int insertSelective(Pkfieldsblobs record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table PKFIELDSBLOBS
     *
     * @mbg.generated Sat Mar 25 03:24:58 CST 2017
     */
    @SelectProvider(type=PkfieldsblobsSqlProvider.class, method="selectByExampleWithBLOBs")
    @Results({
        @Result(column="ID1", property="id1", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="ID2", property="id2", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="FIRSTNAME", property="firstname", jdbcType=JdbcType.VARCHAR),
        @Result(column="LASTNAME", property="lastname", jdbcType=JdbcType.VARCHAR),
        @Result(column="BLOB1", property="blob1", jdbcType=JdbcType.VARBINARY)
    })
    List<Pkfieldsblobs> selectByExampleWithBLOBsWithRowbounds(PkfieldsblobsExample example, RowBounds rowBounds);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table PKFIELDSBLOBS
     *
     * @mbg.generated Sat Mar 25 03:24:58 CST 2017
     */
    @SelectProvider(type=PkfieldsblobsSqlProvider.class, method="selectByExampleWithBLOBs")
    @Results({
        @Result(column="ID1", property="id1", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="ID2", property="id2", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="FIRSTNAME", property="firstname", jdbcType=JdbcType.VARCHAR),
        @Result(column="LASTNAME", property="lastname", jdbcType=JdbcType.VARCHAR),
        @Result(column="BLOB1", property="blob1", jdbcType=JdbcType.VARBINARY)
    })
    List<Pkfieldsblobs> selectByExampleWithBLOBs(PkfieldsblobsExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table PKFIELDSBLOBS
     *
     * @mbg.generated Sat Mar 25 03:24:58 CST 2017
     */
    @SelectProvider(type=PkfieldsblobsSqlProvider.class, method="selectByExample")
    @Results({
        @Result(column="ID1", property="id1", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="ID2", property="id2", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="FIRSTNAME", property="firstname", jdbcType=JdbcType.VARCHAR),
        @Result(column="LASTNAME", property="lastname", jdbcType=JdbcType.VARCHAR)
    })
    List<Pkfieldsblobs> selectByExampleWithRowbounds(PkfieldsblobsExample example, RowBounds rowBounds);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table PKFIELDSBLOBS
     *
     * @mbg.generated Sat Mar 25 03:24:58 CST 2017
     */
    @SelectProvider(type=PkfieldsblobsSqlProvider.class, method="selectByExample")
    @Results({
        @Result(column="ID1", property="id1", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="ID2", property="id2", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="FIRSTNAME", property="firstname", jdbcType=JdbcType.VARCHAR),
        @Result(column="LASTNAME", property="lastname", jdbcType=JdbcType.VARCHAR)
    })
    List<Pkfieldsblobs> selectByExample(PkfieldsblobsExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table PKFIELDSBLOBS
     *
     * @mbg.generated Sat Mar 25 03:24:58 CST 2017
     */
    @Select({
        "select",
        "ID1, ID2, FIRSTNAME, LASTNAME, BLOB1",
        "from PKFIELDSBLOBS",
        "where ID1 = #{id1,jdbcType=INTEGER}",
          "and ID2 = #{id2,jdbcType=INTEGER}"
    })
    @Results({
        @Result(column="ID1", property="id1", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="ID2", property="id2", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="FIRSTNAME", property="firstname", jdbcType=JdbcType.VARCHAR),
        @Result(column="LASTNAME", property="lastname", jdbcType=JdbcType.VARCHAR),
        @Result(column="BLOB1", property="blob1", jdbcType=JdbcType.VARBINARY)
    })
    Pkfieldsblobs selectByPrimaryKey(@Param("id1") Integer id1, @Param("id2") Integer id2);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table PKFIELDSBLOBS
     *
     * @mbg.generated Sat Mar 25 03:24:58 CST 2017
     */
    @UpdateProvider(type=PkfieldsblobsSqlProvider.class, method="updateByExampleSelective")
    int updateByExampleSelective(@Param("record") Pkfieldsblobs record, @Param("example") PkfieldsblobsExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table PKFIELDSBLOBS
     *
     * @mbg.generated Sat Mar 25 03:24:58 CST 2017
     */
    @UpdateProvider(type=PkfieldsblobsSqlProvider.class, method="updateByExampleWithBLOBs")
    int updateByExampleWithBLOBs(@Param("record") Pkfieldsblobs record, @Param("example") PkfieldsblobsExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table PKFIELDSBLOBS
     *
     * @mbg.generated Sat Mar 25 03:24:58 CST 2017
     */
    @UpdateProvider(type=PkfieldsblobsSqlProvider.class, method="updateByExample")
    int updateByExample(@Param("record") Pkfieldsblobs record, @Param("example") PkfieldsblobsExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table PKFIELDSBLOBS
     *
     * @mbg.generated Sat Mar 25 03:24:58 CST 2017
     */
    @UpdateProvider(type=PkfieldsblobsSqlProvider.class, method="updateByPrimaryKeySelective")
    int updateByPrimaryKeySelective(Pkfieldsblobs record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table PKFIELDSBLOBS
     *
     * @mbg.generated Sat Mar 25 03:24:58 CST 2017
     */
    @Update({
        "update PKFIELDSBLOBS",
        "set FIRSTNAME = #{firstname,jdbcType=VARCHAR},",
          "LASTNAME = #{lastname,jdbcType=VARCHAR},",
          "BLOB1 = #{blob1,jdbcType=VARBINARY}",
        "where ID1 = #{id1,jdbcType=INTEGER}",
          "and ID2 = #{id2,jdbcType=INTEGER}"
    })
    int updateByPrimaryKeyWithBLOBs(Pkfieldsblobs record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table PKFIELDSBLOBS
     *
     * @mbg.generated Sat Mar 25 03:24:58 CST 2017
     */
    @Update({
        "update PKFIELDSBLOBS",
        "set FIRSTNAME = #{firstname,jdbcType=VARCHAR},",
          "LASTNAME = #{lastname,jdbcType=VARCHAR}",
        "where ID1 = #{id1,jdbcType=INTEGER}",
          "and ID2 = #{id2,jdbcType=INTEGER}"
    })
    int updateByPrimaryKey(Pkfieldsblobs record);
}