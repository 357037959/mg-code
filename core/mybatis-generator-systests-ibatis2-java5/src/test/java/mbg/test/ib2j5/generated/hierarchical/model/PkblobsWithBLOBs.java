package mbg.test.ib2j5.generated.hierarchical.model;

import java.util.Arrays;

public class PkblobsWithBLOBs extends PkblobsKey {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column PKBLOBS.BLOB1
     *
     * @mbg.generated Sat Mar 25 03:24:02 CST 2017
     */
    private byte[] blob1;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column PKBLOBS.BLOB2
     *
     * @mbg.generated Sat Mar 25 03:24:02 CST 2017
     */
    private byte[] blob2;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column PKBLOBS.CHARACTERLOB
     *
     * @mbg.generated Sat Mar 25 03:24:02 CST 2017
     */
    private String characterlob;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column PKBLOBS.BLOB1
     *
     * @return the value of PKBLOBS.BLOB1
     *
     * @mbg.generated Sat Mar 25 03:24:02 CST 2017
     */
    public byte[] getBlob1() {
        return blob1;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column PKBLOBS.BLOB1
     *
     * @param blob1 the value for PKBLOBS.BLOB1
     *
     * @mbg.generated Sat Mar 25 03:24:02 CST 2017
     */
    public void setBlob1(byte[] blob1) {
        this.blob1 = blob1;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column PKBLOBS.BLOB2
     *
     * @return the value of PKBLOBS.BLOB2
     *
     * @mbg.generated Sat Mar 25 03:24:02 CST 2017
     */
    public byte[] getBlob2() {
        return blob2;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column PKBLOBS.BLOB2
     *
     * @param blob2 the value for PKBLOBS.BLOB2
     *
     * @mbg.generated Sat Mar 25 03:24:02 CST 2017
     */
    public void setBlob2(byte[] blob2) {
        this.blob2 = blob2;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column PKBLOBS.CHARACTERLOB
     *
     * @return the value of PKBLOBS.CHARACTERLOB
     *
     * @mbg.generated Sat Mar 25 03:24:02 CST 2017
     */
    public String getCharacterlob() {
        return characterlob;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column PKBLOBS.CHARACTERLOB
     *
     * @param characterlob the value for PKBLOBS.CHARACTERLOB
     *
     * @mbg.generated Sat Mar 25 03:24:02 CST 2017
     */
    public void setCharacterlob(String characterlob) {
        this.characterlob = characterlob == null ? null : characterlob.trim();
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
        PkblobsWithBLOBs other = (PkblobsWithBLOBs) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (Arrays.equals(this.getBlob1(), other.getBlob1()))
            && (Arrays.equals(this.getBlob2(), other.getBlob2()))
            && (this.getCharacterlob() == null ? other.getCharacterlob() == null : this.getCharacterlob().equals(other.getCharacterlob()));
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
        result = prime * result + (Arrays.hashCode(getBlob1()));
        result = prime * result + (Arrays.hashCode(getBlob2()));
        result = prime * result + ((getCharacterlob() == null) ? 0 : getCharacterlob().hashCode());
        return result;
    }
}