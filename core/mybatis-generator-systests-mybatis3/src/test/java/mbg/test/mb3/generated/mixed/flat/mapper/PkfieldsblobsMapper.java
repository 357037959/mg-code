package mbg.test.mb3.generated.mixed.flat.mapper;

import java.util.List;
import mbg.test.mb3.generated.mixed.flat.model.Pkfieldsblobs;
import mbg.test.mb3.generated.mixed.flat.model.PkfieldsblobsExample;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.ResultMap;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.apache.ibatis.session.RowBounds;

public interface PkfieldsblobsMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table PKFIELDSBLOBS
     *
     * @mbg.generated Sat Mar 25 03:24:58 CST 2017
     */
    long countByExample(PkfieldsblobsExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table PKFIELDSBLOBS
     *
     * @mbg.generated Sat Mar 25 03:24:58 CST 2017
     */
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
    int insertSelective(Pkfieldsblobs record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table PKFIELDSBLOBS
     *
     * @mbg.generated Sat Mar 25 03:24:58 CST 2017
     */
    List<Pkfieldsblobs> selectByExampleWithBLOBsWithRowbounds(PkfieldsblobsExample example, RowBounds rowBounds);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table PKFIELDSBLOBS
     *
     * @mbg.generated Sat Mar 25 03:24:58 CST 2017
     */
    List<Pkfieldsblobs> selectByExampleWithBLOBs(PkfieldsblobsExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table PKFIELDSBLOBS
     *
     * @mbg.generated Sat Mar 25 03:24:58 CST 2017
     */
    List<Pkfieldsblobs> selectByExampleWithRowbounds(PkfieldsblobsExample example, RowBounds rowBounds);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table PKFIELDSBLOBS
     *
     * @mbg.generated Sat Mar 25 03:24:58 CST 2017
     */
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
    @ResultMap("mbg.test.mb3.generated.mixed.flat.mapper.PkfieldsblobsMapper.ResultMapWithBLOBs")
    Pkfieldsblobs selectByPrimaryKey(@Param("id1") Integer id1, @Param("id2") Integer id2);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table PKFIELDSBLOBS
     *
     * @mbg.generated Sat Mar 25 03:24:58 CST 2017
     */
    int updateByExampleSelective(@Param("record") Pkfieldsblobs record, @Param("example") PkfieldsblobsExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table PKFIELDSBLOBS
     *
     * @mbg.generated Sat Mar 25 03:24:58 CST 2017
     */
    int updateByExampleWithBLOBs(@Param("record") Pkfieldsblobs record, @Param("example") PkfieldsblobsExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table PKFIELDSBLOBS
     *
     * @mbg.generated Sat Mar 25 03:24:58 CST 2017
     */
    int updateByExample(@Param("record") Pkfieldsblobs record, @Param("example") PkfieldsblobsExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table PKFIELDSBLOBS
     *
     * @mbg.generated Sat Mar 25 03:24:58 CST 2017
     */
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