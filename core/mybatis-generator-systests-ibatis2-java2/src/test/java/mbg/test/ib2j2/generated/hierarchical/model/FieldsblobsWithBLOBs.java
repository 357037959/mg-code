package mbg.test.ib2j2.generated.hierarchical.model;

import java.util.Arrays;

public class FieldsblobsWithBLOBs extends Fieldsblobs {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column FIELDSBLOBS.BLOB1
     *
     * @mbg.generated Sat Mar 25 03:13:53 CST 2017
     */
    private byte[] blob1;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column FIELDSBLOBS.BLOB2
     *
     * @mbg.generated Sat Mar 25 03:13:53 CST 2017
     */
    private byte[] blob2;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column FIELDSBLOBS.BLOB3
     *
     * @mbg.generated Sat Mar 25 03:13:53 CST 2017
     */
    private byte[] blob3;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column FIELDSBLOBS.BLOB1
     *
     * @return the value of FIELDSBLOBS.BLOB1
     *
     * @mbg.generated Sat Mar 25 03:13:53 CST 2017
     */
    public byte[] getBlob1() {
        return blob1;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column FIELDSBLOBS.BLOB1
     *
     * @param blob1 the value for FIELDSBLOBS.BLOB1
     *
     * @mbg.generated Sat Mar 25 03:13:53 CST 2017
     */
    public void setBlob1(byte[] blob1) {
        this.blob1 = blob1;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column FIELDSBLOBS.BLOB2
     *
     * @return the value of FIELDSBLOBS.BLOB2
     *
     * @mbg.generated Sat Mar 25 03:13:53 CST 2017
     */
    public byte[] getBlob2() {
        return blob2;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column FIELDSBLOBS.BLOB2
     *
     * @param blob2 the value for FIELDSBLOBS.BLOB2
     *
     * @mbg.generated Sat Mar 25 03:13:53 CST 2017
     */
    public void setBlob2(byte[] blob2) {
        this.blob2 = blob2;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column FIELDSBLOBS.BLOB3
     *
     * @return the value of FIELDSBLOBS.BLOB3
     *
     * @mbg.generated Sat Mar 25 03:13:53 CST 2017
     */
    public byte[] getBlob3() {
        return blob3;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column FIELDSBLOBS.BLOB3
     *
     * @param blob3 the value for FIELDSBLOBS.BLOB3
     *
     * @mbg.generated Sat Mar 25 03:13:53 CST 2017
     */
    public void setBlob3(byte[] blob3) {
        this.blob3 = blob3;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table FIELDSBLOBS
     *
     * @mbg.generated Sat Mar 25 03:13:53 CST 2017
     */
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
        FieldsblobsWithBLOBs other = (FieldsblobsWithBLOBs) that;
        return (this.getFirstname() == null ? other.getFirstname() == null : this.getFirstname().equals(other.getFirstname()))
            && (this.getLastname() == null ? other.getLastname() == null : this.getLastname().equals(other.getLastname()))
            && (Arrays.equals(this.getBlob1(), other.getBlob1()))
            && (Arrays.equals(this.getBlob2(), other.getBlob2()))
            && (Arrays.equals(this.getBlob3(), other.getBlob3()));
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table FIELDSBLOBS
     *
     * @mbg.generated Sat Mar 25 03:13:53 CST 2017
     */
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getFirstname() == null) ? 0 : getFirstname().hashCode());
        result = prime * result + ((getLastname() == null) ? 0 : getLastname().hashCode());
        result = prime * result + (Arrays.hashCode(getBlob1()));
        result = prime * result + (Arrays.hashCode(getBlob2()));
        result = prime * result + (Arrays.hashCode(getBlob3()));
        return result;
    }
}