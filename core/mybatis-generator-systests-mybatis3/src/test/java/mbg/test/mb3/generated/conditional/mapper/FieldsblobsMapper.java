package mbg.test.mb3.generated.conditional.mapper;

import java.util.List;
import mbg.test.mb3.generated.conditional.model.Fieldsblobs;
import mbg.test.mb3.generated.conditional.model.FieldsblobsExample;
import mbg.test.mb3.generated.conditional.model.FieldsblobsWithBLOBs;
import org.apache.ibatis.annotations.Param;

public interface FieldsblobsMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table FIELDSBLOBS
     *
     * @mbg.generated Sat Mar 25 03:24:58 CST 2017
     */
    long countByExample(FieldsblobsExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table FIELDSBLOBS
     *
     * @mbg.generated Sat Mar 25 03:24:58 CST 2017
     */
    int deleteByExample(FieldsblobsExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table FIELDSBLOBS
     *
     * @mbg.generated Sat Mar 25 03:24:58 CST 2017
     */
    int insert(FieldsblobsWithBLOBs record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table FIELDSBLOBS
     *
     * @mbg.generated Sat Mar 25 03:24:58 CST 2017
     */
    int insertSelective(FieldsblobsWithBLOBs record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table FIELDSBLOBS
     *
     * @mbg.generated Sat Mar 25 03:24:58 CST 2017
     */
    List<FieldsblobsWithBLOBs> selectByExampleWithBLOBs(FieldsblobsExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table FIELDSBLOBS
     *
     * @mbg.generated Sat Mar 25 03:24:58 CST 2017
     */
    List<Fieldsblobs> selectByExample(FieldsblobsExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table FIELDSBLOBS
     *
     * @mbg.generated Sat Mar 25 03:24:58 CST 2017
     */
    int updateByExampleSelective(@Param("record") FieldsblobsWithBLOBs record, @Param("example") FieldsblobsExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table FIELDSBLOBS
     *
     * @mbg.generated Sat Mar 25 03:24:58 CST 2017
     */
    int updateByExampleWithBLOBs(@Param("record") FieldsblobsWithBLOBs record, @Param("example") FieldsblobsExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table FIELDSBLOBS
     *
     * @mbg.generated Sat Mar 25 03:24:58 CST 2017
     */
    int updateByExample(@Param("record") Fieldsblobs record, @Param("example") FieldsblobsExample example);
}