package mbg.test.mb3.generated.mixed.flat.model;

public class Pkonly {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column PKONLY.ID
     *
     * @mbg.generated Sat Mar 25 03:24:58 CST 2017
     */
    private Integer id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column PKONLY.SEQ_NUM
     *
     * @mbg.generated Sat Mar 25 03:24:58 CST 2017
     */
    private Integer seqNum;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column PKONLY.ID
     *
     * @return the value of PKONLY.ID
     *
     * @mbg.generated Sat Mar 25 03:24:58 CST 2017
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
     * @mbg.generated Sat Mar 25 03:24:58 CST 2017
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
     * @mbg.generated Sat Mar 25 03:24:58 CST 2017
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
     * @mbg.generated Sat Mar 25 03:24:58 CST 2017
     */
    public void setSeqNum(Integer seqNum) {
        this.seqNum = seqNum;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table PKONLY
     *
     * @mbg.generated Sat Mar 25 03:24:58 CST 2017
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
        Pkonly other = (Pkonly) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getSeqNum() == null ? other.getSeqNum() == null : this.getSeqNum().equals(other.getSeqNum()));
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table PKONLY
     *
     * @mbg.generated Sat Mar 25 03:24:58 CST 2017
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