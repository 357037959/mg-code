package mbg.test.mb3.generated.annotated.conditional.mapper;

import java.util.List;
import mbg.test.mb3.generated.annotated.conditional.model.Pkblobs;
import mbg.test.mb3.generated.annotated.conditional.model.PkblobsExample;
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

public interface PkblobsMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table PKBLOBS
     *
     * @mbg.generated Sat Mar 25 03:24:58 CST 2017
     */
    @SelectProvider(type=PkblobsSqlProvider.class, method="countByExample")
    long countByExample(PkblobsExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table PKBLOBS
     *
     * @mbg.generated Sat Mar 25 03:24:58 CST 2017
     */
    @DeleteProvider(type=PkblobsSqlProvider.class, method="deleteByExample")
    int deleteByExample(PkblobsExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table PKBLOBS
     *
     * @mbg.generated Sat Mar 25 03:24:58 CST 2017
     */
    @Delete({
        "delete from PKBLOBS",
        "where ID = #{id,jdbcType=INTEGER}"
    })
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table PKBLOBS
     *
     * @mbg.generated Sat Mar 25 03:24:58 CST 2017
     */
    @Insert({
        "insert into PKBLOBS (ID, BLOB1, ",
        "BLOB2, CHARACTERLOB)",
        "values (#{id,jdbcType=INTEGER}, #{blob1,jdbcType=VARBINARY}, ",
        "#{blob2,jdbcType=VARBINARY}, #{characterlob,jdbcType=CLOB})"
    })
    int insert(Pkblobs record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table PKBLOBS
     *
     * @mbg.generated Sat Mar 25 03:24:58 CST 2017
     */
    @InsertProvider(type=PkblobsSqlProvider.class, method="insertSelective")
    int insertSelective(Pkblobs record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table PKBLOBS
     *
     * @mbg.generated Sat Mar 25 03:24:58 CST 2017
     */
    @SelectProvider(type=PkblobsSqlProvider.class, method="selectByExampleWithBLOBs")
    @Results({
        @Result(column="ID", property="id", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="BLOB1", property="blob1", jdbcType=JdbcType.VARBINARY),
        @Result(column="BLOB2", property="blob2", jdbcType=JdbcType.VARBINARY),
        @Result(column="CHARACTERLOB", property="characterlob", jdbcType=JdbcType.CLOB)
    })
    List<Pkblobs> selectByExampleWithBLOBs(PkblobsExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table PKBLOBS
     *
     * @mbg.generated Sat Mar 25 03:24:58 CST 2017
     */
    @SelectProvider(type=PkblobsSqlProvider.class, method="selectByExample")
    @Results({
        @Result(column="ID", property="id", jdbcType=JdbcType.INTEGER, id=true)
    })
    List<Pkblobs> selectByExample(PkblobsExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table PKBLOBS
     *
     * @mbg.generated Sat Mar 25 03:24:58 CST 2017
     */
    @Select({
        "select",
        "ID, BLOB1, BLOB2, CHARACTERLOB",
        "from PKBLOBS",
        "where ID = #{id,jdbcType=INTEGER}"
    })
    @Results({
        @Result(column="ID", property="id", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="BLOB1", property="blob1", jdbcType=JdbcType.VARBINARY),
        @Result(column="BLOB2", property="blob2", jdbcType=JdbcType.VARBINARY),
        @Result(column="CHARACTERLOB", property="characterlob", jdbcType=JdbcType.CLOB)
    })
    Pkblobs selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table PKBLOBS
     *
     * @mbg.generated Sat Mar 25 03:24:58 CST 2017
     */
    @UpdateProvider(type=PkblobsSqlProvider.class, method="updateByExampleSelective")
    int updateByExampleSelective(@Param("record") Pkblobs record, @Param("example") PkblobsExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table PKBLOBS
     *
     * @mbg.generated Sat Mar 25 03:24:58 CST 2017
     */
    @UpdateProvider(type=PkblobsSqlProvider.class, method="updateByExampleWithBLOBs")
    int updateByExampleWithBLOBs(@Param("record") Pkblobs record, @Param("example") PkblobsExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table PKBLOBS
     *
     * @mbg.generated Sat Mar 25 03:24:58 CST 2017
     */
    @UpdateProvider(type=PkblobsSqlProvider.class, method="updateByExample")
    int updateByExample(@Param("record") Pkblobs record, @Param("example") PkblobsExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table PKBLOBS
     *
     * @mbg.generated Sat Mar 25 03:24:58 CST 2017
     */
    @UpdateProvider(type=PkblobsSqlProvider.class, method="updateByPrimaryKeySelective")
    int updateByPrimaryKeySelective(Pkblobs record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table PKBLOBS
     *
     * @mbg.generated Sat Mar 25 03:24:58 CST 2017
     */
    @Update({
        "update PKBLOBS",
        "set BLOB1 = #{blob1,jdbcType=VARBINARY},",
          "BLOB2 = #{blob2,jdbcType=VARBINARY},",
          "CHARACTERLOB = #{characterlob,jdbcType=CLOB}",
        "where ID = #{id,jdbcType=INTEGER}"
    })
    int updateByPrimaryKeyWithBLOBs(Pkblobs record);
}