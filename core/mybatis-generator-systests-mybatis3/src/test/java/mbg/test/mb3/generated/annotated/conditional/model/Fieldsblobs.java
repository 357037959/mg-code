package mbg.test.mb3.generated.annotated.conditional.model;

import java.io.Serializable;

public class Fieldsblobs implements Serializable {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column FIELDSBLOBS.FIRSTNAME
     *
     * @mbg.generated Sat Mar 25 03:24:58 CST 2017
     */
    private String firstname;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column FIELDSBLOBS.LASTNAME
     *
     * @mbg.generated Sat Mar 25 03:24:58 CST 2017
     */
    private String lastname;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table FIELDSBLOBS
     *
     * @mbg.generated Sat Mar 25 03:24:58 CST 2017
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column FIELDSBLOBS.FIRSTNAME
     *
     * @return the value of FIELDSBLOBS.FIRSTNAME
     *
     * @mbg.generated Sat Mar 25 03:24:58 CST 2017
     */
    public String getFirstname() {
        return firstname;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column FIELDSBLOBS.FIRSTNAME
     *
     * @param firstname the value for FIELDSBLOBS.FIRSTNAME
     *
     * @mbg.generated Sat Mar 25 03:24:58 CST 2017
     */
    public void setFirstname(String firstname) {
        this.firstname = firstname == null ? null : firstname.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column FIELDSBLOBS.LASTNAME
     *
     * @return the value of FIELDSBLOBS.LASTNAME
     *
     * @mbg.generated Sat Mar 25 03:24:58 CST 2017
     */
    public String getLastname() {
        return lastname;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column FIELDSBLOBS.LASTNAME
     *
     * @param lastname the value for FIELDSBLOBS.LASTNAME
     *
     * @mbg.generated Sat Mar 25 03:24:58 CST 2017
     */
    public void setLastname(String lastname) {
        this.lastname = lastname == null ? null : lastname.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table FIELDSBLOBS
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
        Fieldsblobs other = (Fieldsblobs) that;
        return (this.getFirstname() == null ? other.getFirstname() == null : this.getFirstname().equals(other.getFirstname()))
            && (this.getLastname() == null ? other.getLastname() == null : this.getLastname().equals(other.getLastname()));
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table FIELDSBLOBS
     *
     * @mbg.generated Sat Mar 25 03:24:58 CST 2017
     */
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getFirstname() == null) ? 0 : getFirstname().hashCode());
        result = prime * result + ((getLastname() == null) ? 0 : getLastname().hashCode());
        return result;
    }
}