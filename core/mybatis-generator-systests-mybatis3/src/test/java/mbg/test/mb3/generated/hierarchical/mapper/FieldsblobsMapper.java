package mbg.test.mb3.generated.hierarchical.mapper;

import java.util.List;
import mbg.test.mb3.generated.hierarchical.model.Fieldsblobs;
import mbg.test.mb3.generated.hierarchical.model.FieldsblobsExample;
import mbg.test.mb3.generated.hierarchical.model.FieldsblobsWithBLOBs;
import org.apache.ibatis.annotations.Param;

public interface FieldsblobsMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table FIELDSBLOBS
     *
     * @mbg.generated 2017-03-25
     */
    long countByExample(FieldsblobsExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table FIELDSBLOBS
     *
     * @mbg.generated 2017-03-25
     */
    int deleteByExample(FieldsblobsExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table FIELDSBLOBS
     *
     * @mbg.generated 2017-03-25
     */
    int insert(FieldsblobsWithBLOBs record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table FIELDSBLOBS
     *
     * @mbg.generated 2017-03-25
     */
    int insertSelective(FieldsblobsWithBLOBs record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table FIELDSBLOBS
     *
     * @mbg.generated 2017-03-25
     */
    List<FieldsblobsWithBLOBs> selectByExampleWithBLOBs(FieldsblobsExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table FIELDSBLOBS
     *
     * @mbg.generated 2017-03-25
     */
    List<Fieldsblobs> selectByExample(FieldsblobsExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table FIELDSBLOBS
     *
     * @mbg.generated 2017-03-25
     */
    int updateByExampleSelective(@Param("record") FieldsblobsWithBLOBs record, @Param("example") FieldsblobsExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table FIELDSBLOBS
     *
     * @mbg.generated 2017-03-25
     */
    int updateByExampleWithBLOBs(@Param("record") FieldsblobsWithBLOBs record, @Param("example") FieldsblobsExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table FIELDSBLOBS
     *
     * @mbg.generated 2017-03-25
     */
    int updateByExample(@Param("record") Fieldsblobs record, @Param("example") FieldsblobsExample example);
}