package mbg.test.mb3.generated.hierarchical.immutable.mapper;

import java.util.List;
import mbg.test.mb3.generated.hierarchical.immutable.model.Pkfields;
import mbg.test.mb3.generated.hierarchical.immutable.model.PkfieldsExample;
import mbg.test.mb3.generated.hierarchical.immutable.model.PkfieldsKey;
import org.apache.ibatis.annotations.Param;

public interface PkfieldsMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table PKFIELDS
     *
     * @mbg.generated Sat Mar 25 03:24:58 CST 2017
     */
    long countByExample(PkfieldsExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table PKFIELDS
     *
     * @mbg.generated Sat Mar 25 03:24:58 CST 2017
     */
    int deleteByExample(PkfieldsExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table PKFIELDS
     *
     * @mbg.generated Sat Mar 25 03:24:58 CST 2017
     */
    int deleteByPrimaryKey(PkfieldsKey key);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table PKFIELDS
     *
     * @mbg.generated Sat Mar 25 03:24:58 CST 2017
     */
    int insert(Pkfields record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table PKFIELDS
     *
     * @mbg.generated Sat Mar 25 03:24:58 CST 2017
     */
    int insertSelective(Pkfields record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table PKFIELDS
     *
     * @mbg.generated Sat Mar 25 03:24:58 CST 2017
     */
    List<Pkfields> selectByExample(PkfieldsExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table PKFIELDS
     *
     * @mbg.generated Sat Mar 25 03:24:58 CST 2017
     */
    Pkfields selectByPrimaryKey(PkfieldsKey key);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table PKFIELDS
     *
     * @mbg.generated Sat Mar 25 03:24:58 CST 2017
     */
    int updateByExampleSelective(@Param("record") Pkfields record, @Param("example") PkfieldsExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table PKFIELDS
     *
     * @mbg.generated Sat Mar 25 03:24:58 CST 2017
     */
    int updateByExample(@Param("record") Pkfields record, @Param("example") PkfieldsExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table PKFIELDS
     *
     * @mbg.generated Sat Mar 25 03:24:58 CST 2017
     */
    int updateByPrimaryKeySelective(Pkfields record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table PKFIELDS
     *
     * @mbg.generated Sat Mar 25 03:24:58 CST 2017
     */
    int updateByPrimaryKey(Pkfields record);
}