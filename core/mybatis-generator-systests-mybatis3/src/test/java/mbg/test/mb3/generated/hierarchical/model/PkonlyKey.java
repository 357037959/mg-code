package mbg.test.mb3.generated.hierarchical.model;

/**
 *
 * This class was generated by MyBatis Generator.
 * This class corresponds to the database table PKONLY
 *
 * @mbg.generated do_not_delete_during_merge 2017-03-25
 */
public class PkonlyKey {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column PKONLY.ID
     *
     * @mbg.generated 2017-03-25
     */
    private Integer id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column PKONLY.SEQ_NUM
     *
     * @mbg.generated 2017-03-25
     */
    private Integer seqNum;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column PKONLY.ID
     *
     * @return the value of PKONLY.ID
     *
     * @mbg.generated 2017-03-25
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column PKONLY.ID
     *
     * @param id the value for PKONLY.ID
     *
     * @mbg.generated 2017-03-25
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column PKONLY.SEQ_NUM
     *
     * @return the value of PKONLY.SEQ_NUM
     *
     * @mbg.generated 2017-03-25
     */
    public Integer getSeqNum() {
        return seqNum;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column PKONLY.SEQ_NUM
     *
     * @param seqNum the value for PKONLY.SEQ_NUM
     *
     * @mbg.generated 2017-03-25
     */
    public void setSeqNum(Integer seqNum) {
        this.seqNum = seqNum;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table PKONLY
     *
     * @mbg.generated 2017-03-25
     */
    @Override
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if (that == null) {
            return false;
        }
        if (getClass() != that.getClass()) {
            return false;
        }
        PkonlyKey other = (PkonlyKey) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getSeqNum() == null ? other.getSeqNum() == null : this.getSeqNum().equals(other.getSeqNum()));
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table PKONLY
     *
     * @mbg.generated 2017-03-25
     */
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getSeqNum() == null) ? 0 : getSeqNum().hashCode());
        return result;
    }
}