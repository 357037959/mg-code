package mbg.test.mb3.generated.hierarchical.model;

/**
 *
 * This class was generated by MyBatis Generator.
 * This class corresponds to the database table PKFIELDSBLOBS
 *
 * @mbg.generated do_not_delete_during_merge 2017-03-25
 */
public class Pkfieldsblobs extends PkfieldsblobsKey {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column PKFIELDSBLOBS.FIRSTNAME
     *
     * @mbg.generated 2017-03-25
     */
    private String firstname;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column PKFIELDSBLOBS.LASTNAME
     *
     * @mbg.generated 2017-03-25
     */
    private String lastname;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column PKFIELDSBLOBS.FIRSTNAME
     *
     * @return the value of PKFIELDSBLOBS.FIRSTNAME
     *
     * @mbg.generated 2017-03-25
     */
    public String getFirstname() {
        return firstname;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column PKFIELDSBLOBS.FIRSTNAME
     *
     * @param firstname the value for PKFIELDSBLOBS.FIRSTNAME
     *
     * @mbg.generated 2017-03-25
     */
    public void setFirstname(String firstname) {
        this.firstname = firstname == null ? null : firstname.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column PKFIELDSBLOBS.LASTNAME
     *
     * @return the value of PKFIELDSBLOBS.LASTNAME
     *
     * @mbg.generated 2017-03-25
     */
    public String getLastname() {
        return lastname;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column PKFIELDSBLOBS.LASTNAME
     *
     * @param lastname the value for PKFIELDSBLOBS.LASTNAME
     *
     * @mbg.generated 2017-03-25
     */
    public void setLastname(String lastname) {
        this.lastname = lastname == null ? null : lastname.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table PKFIELDSBLOBS
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
        Pkfieldsblobs other = (Pkfieldsblobs) that;
        return (this.getId1() == null ? other.getId1() == null : this.getId1().equals(other.getId1()))
            && (this.getId2() == null ? other.getId2() == null : this.getId2().equals(other.getId2()))
            && (this.getFirstname() == null ? other.getFirstname() == null : this.getFirstname().equals(other.getFirstname()))
            && (this.getLastname() == null ? other.getLastname() == null : this.getLastname().equals(other.getLastname()));
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table PKFIELDSBLOBS
     *
     * @mbg.generated 2017-03-25
     */
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId1() == null) ? 0 : getId1().hashCode());
        result = prime * result + ((getId2() == null) ? 0 : getId2().hashCode());
        result = prime * result + ((getFirstname() == null) ? 0 : getFirstname().hashCode());
        result = prime * result + ((getLastname() == null) ? 0 : getLastname().hashCode());
        return result;
    }
}