package mbg.test.mb3.generated.mixed.hierarchical.Immutable.Model;

public class FieldsblobsWithBLOBs extends Fieldsblobs {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column FIELDSBLOBS.BLOB1
     *
     * @mbg.generated Sat Mar 25 03:24:58 CST 2017
     */
    private byte[] blob1;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column FIELDSBLOBS.BLOB2
     *
     * @mbg.generated Sat Mar 25 03:24:58 CST 2017
     */
    private byte[] blob2;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column FIELDSBLOBS.BLOB3
     *
     * @mbg.generated Sat Mar 25 03:24:58 CST 2017
     */
    private byte[] blob3;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table FIELDSBLOBS
     *
     * @mbg.generated Sat Mar 25 03:24:58 CST 2017
     */
    public FieldsblobsWithBLOBs(String firstname, String lastname, byte[] blob1, byte[] blob2, byte[] blob3) {
        super(firstname, lastname);
        this.blob1 = blob1;
        this.blob2 = blob2;
        this.blob3 = blob3;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column FIELDSBLOBS.BLOB1
     *
     * @return the value of FIELDSBLOBS.BLOB1
     *
     * @mbg.generated Sat Mar 25 03:24:58 CST 2017
     */
    public byte[] getBlob1() {
        return blob1;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column FIELDSBLOBS.BLOB2
     *
     * @return the value of FIELDSBLOBS.BLOB2
     *
     * @mbg.generated Sat Mar 25 03:24:58 CST 2017
     */
    public byte[] getBlob2() {
        return blob2;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column FIELDSBLOBS.BLOB3
     *
     * @return the value of FIELDSBLOBS.BLOB3
     *
     * @mbg.generated Sat Mar 25 03:24:58 CST 2017
     */
    public byte[] getBlob3() {
        return blob3;
    }
}