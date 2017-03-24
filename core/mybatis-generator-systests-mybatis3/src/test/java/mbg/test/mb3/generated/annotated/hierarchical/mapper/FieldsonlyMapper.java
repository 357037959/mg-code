package mbg.test.mb3.generated.annotated.hierarchical.mapper;

import java.util.List;
import mbg.test.mb3.generated.annotated.hierarchical.model.Fieldsonly;
import mbg.test.mb3.generated.annotated.hierarchical.model.FieldsonlyExample;
import org.apache.ibatis.annotations.DeleteProvider;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.InsertProvider;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.SelectProvider;
import org.apache.ibatis.annotations.UpdateProvider;
import org.apache.ibatis.type.JdbcType;

public interface FieldsonlyMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table FIELDSONLY
     *
     * @mbg.generated Sat Mar 25 03:24:58 CST 2017
     */
    @SelectProvider(type=FieldsonlySqlProvider.class, method="countByExample")
    long countByExample(FieldsonlyExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table FIELDSONLY
     *
     * @mbg.generated Sat Mar 25 03:24:58 CST 2017
     */
    @DeleteProvider(type=FieldsonlySqlProvider.class, method="deleteByExample")
    int deleteByExample(FieldsonlyExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table FIELDSONLY
     *
     * @mbg.generated Sat Mar 25 03:24:58 CST 2017
     */
    @Insert({
        "insert into FIELDSONLY (INTEGERFIELD, DOUBLEFIELD, ",
        "FLOATFIELD)",
        "values (#{integerfield,jdbcType=INTEGER}, #{doublefield,jdbcType=DOUBLE}, ",
        "#{floatfield,jdbcType=DOUBLE})"
    })
    int insert(Fieldsonly record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table FIELDSONLY
     *
     * @mbg.generated Sat Mar 25 03:24:58 CST 2017
     */
    @InsertProvider(type=FieldsonlySqlProvider.class, method="insertSelective")
    int insertSelective(Fieldsonly record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table FIELDSONLY
     *
     * @mbg.generated Sat Mar 25 03:24:58 CST 2017
     */
    @SelectProvider(type=FieldsonlySqlProvider.class, method="selectByExample")
    @Results({
        @Result(column="INTEGERFIELD", property="integerfield", jdbcType=JdbcType.INTEGER),
        @Result(column="DOUBLEFIELD", property="doublefield", jdbcType=JdbcType.DOUBLE),
        @Result(column="FLOATFIELD", property="floatfield", jdbcType=JdbcType.DOUBLE)
    })
    List<Fieldsonly> selectByExample(FieldsonlyExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table FIELDSONLY
     *
     * @mbg.generated Sat Mar 25 03:24:58 CST 2017
     */
    @UpdateProvider(type=FieldsonlySqlProvider.class, method="updateByExampleSelective")
    int updateByExampleSelective(@Param("record") Fieldsonly record, @Param("example") FieldsonlyExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table FIELDSONLY
     *
     * @mbg.generated Sat Mar 25 03:24:58 CST 2017
     */
    @UpdateProvider(type=FieldsonlySqlProvider.class, method="updateByExample")
    int updateByExample(@Param("record") Fieldsonly record, @Param("example") FieldsonlyExample example);
}