package mbg.test.mb3.generated.simple.mapper;

import java.util.List;
import mbg.test.mb3.generated.simple.model.Pkonly;
import org.apache.ibatis.annotations.Param;

public interface PkonlyMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table PKONLY
     *
     * @mbg.generated Sat Mar 25 03:24:58 CST 2017
     */
    int deleteByPrimaryKey(@Param("id") Integer id, @Param("seqNum") Integer seqNum);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table PKONLY
     *
     * @mbg.generated Sat Mar 25 03:24:58 CST 2017
     */
    int insert(Pkonly record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table PKONLY
     *
     * @mbg.generated Sat Mar 25 03:24:58 CST 2017
     */
    List<Pkonly> selectAll();
}