package mbg.test.mb3.generated.mixed.hierarchical.Immutable.Model;

public class Pkfieldsblobs extends PkfieldsblobsKey {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column PKFIELDSBLOBS.FIRSTNAME
     *
     * @mbg.generated Sat Mar 25 03:24:58 CST 2017
     */
    private String firstname;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column PKFIELDSBLOBS.LASTNAME
     *
     * @mbg.generated Sat Mar 25 03:24:58 CST 2017
     */
    private String lastname;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table PKFIELDSBLOBS
     *
     * @mbg.generated Sat Mar 25 03:24:58 CST 2017
     */
    public Pkfieldsblobs(Integer id1, Integer id2, String firstname, String lastname) {
        super(id1, id2);
        this.firstname = firstname;
        this.lastname = lastname;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column PKFIELDSBLOBS.FIRSTNAME
     *
     * @return the value of PKFIELDSBLOBS.FIRSTNAME
     *
     * @mbg.generated Sat Mar 25 03:24:58 CST 2017
     */
    public String getFirstname() {
        return firstname;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column PKFIELDSBLOBS.LASTNAME
     *
     * @return the value of PKFIELDSBLOBS.LASTNAME
     *
     * @mbg.generated Sat Mar 25 03:24:58 CST 2017
     */
    public String getLastname() {
        return lastname;
    }
}