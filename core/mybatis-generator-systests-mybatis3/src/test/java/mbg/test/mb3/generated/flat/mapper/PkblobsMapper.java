package mbg.test.mb3.generated.flat.mapper;

import java.util.List;
import mbg.test.mb3.generated.flat.model.Pkblobs;
import mbg.test.mb3.generated.flat.model.PkblobsExample;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

public interface PkblobsMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table PKBLOBS
     *
     * @mbg.generated Sat Mar 25 03:24:58 CST 2017
     */
    long countByExample(PkblobsExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table PKBLOBS
     *
     * @mbg.generated Sat Mar 25 03:24:58 CST 2017
     */
    int deleteByExample(PkblobsExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table PKBLOBS
     *
     * @mbg.generated Sat Mar 25 03:24:58 CST 2017
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table PKBLOBS
     *
     * @mbg.generated Sat Mar 25 03:24:58 CST 2017
     */
    int insert(Pkblobs record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table PKBLOBS
     *
     * @mbg.generated Sat Mar 25 03:24:58 CST 2017
     */
    int insertSelective(Pkblobs record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table PKBLOBS
     *
     * @mbg.generated Sat Mar 25 03:24:58 CST 2017
     */
    List<Pkblobs> selectByExampleWithBLOBsWithRowbounds(PkblobsExample example, RowBounds rowBounds);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table PKBLOBS
     *
     * @mbg.generated Sat Mar 25 03:24:58 CST 2017
     */
    List<Pkblobs> selectByExampleWithBLOBs(PkblobsExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table PKBLOBS
     *
     * @mbg.generated Sat Mar 25 03:24:58 CST 2017
     */
    List<Pkblobs> selectByExampleWithRowbounds(PkblobsExample example, RowBounds rowBounds);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table PKBLOBS
     *
     * @mbg.generated Sat Mar 25 03:24:58 CST 2017
     */
    List<Pkblobs> selectByExample(PkblobsExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table PKBLOBS
     *
     * @mbg.generated Sat Mar 25 03:24:58 CST 2017
     */
    Pkblobs selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table PKBLOBS
     *
     * @mbg.generated Sat Mar 25 03:24:58 CST 2017
     */
    int updateByExampleSelective(@Param("record") Pkblobs record, @Param("example") PkblobsExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table PKBLOBS
     *
     * @mbg.generated Sat Mar 25 03:24:58 CST 2017
     */
    int updateByExampleWithBLOBs(@Param("record") Pkblobs record, @Param("example") PkblobsExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table PKBLOBS
     *
     * @mbg.generated Sat Mar 25 03:24:58 CST 2017
     */
    int updateByExample(@Param("record") Pkblobs record, @Param("example") PkblobsExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table PKBLOBS
     *
     * @mbg.generated Sat Mar 25 03:24:58 CST 2017
     */
    int updateByPrimaryKeySelective(Pkblobs record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table PKBLOBS
     *
     * @mbg.generated Sat Mar 25 03:24:58 CST 2017
     */
    int updateByPrimaryKeyWithBLOBs(Pkblobs record);
}