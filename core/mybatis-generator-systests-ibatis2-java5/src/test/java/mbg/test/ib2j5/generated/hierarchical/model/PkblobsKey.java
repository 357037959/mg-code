package mbg.test.ib2j5.generated.hierarchical.model;

public class PkblobsKey {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column PKBLOBS.ID
     *
     * @mbg.generated Sat Mar 25 03:24:02 CST 2017
     */
    private Integer id;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column PKBLOBS.ID
     *
     * @return the value of PKBLOBS.ID
     *
     * @mbg.generated Sat Mar 25 03:24:02 CST 2017
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column PKBLOBS.ID
     *
     * @param id the value for PKBLOBS.ID
     *
     * @mbg.generated Sat Mar 25 03:24:02 CST 2017
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table PKBLOBS
     *
     * @mbg.generated Sat Mar 25 03:24:02 CST 2017
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
        PkblobsKey other = (PkblobsKey) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()));
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table PKBLOBS
     *
     * @mbg.generated Sat Mar 25 03:24:02 CST 2017
     */
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        return result;
    }
}