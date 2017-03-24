package mbg.test.mb3.generated.miscellaneous.model;

import mbg.test.common.BaseClass;

public class Regexrename extends BaseClass {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column REGEXRENAME.CUST_ID
     *
     * @mbg.generated
     */
    private Integer id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column REGEXRENAME.CUST_NAME
     *
     * @mbg.generated
     */
    private String name;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column REGEXRENAME.CUST_ADDRESS
     *
     * @mbg.generated
     */
    private String address;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column REGEXRENAME.ZIP_CODE
     *
     * @mbg.generated
     */
    private String zipCode;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column REGEXRENAME.CUST_ID
     *
     * @return the value of REGEXRENAME.CUST_ID
     *
     * @mbg.generated
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table REGEXRENAME
     *
     * @mbg.generated
     */
    public Regexrename withId(Integer id) {
        this.setId(id);
        return this;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column REGEXRENAME.CUST_ID
     *
     * @param id the value for REGEXRENAME.CUST_ID
     *
     * @mbg.generated
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column REGEXRENAME.CUST_NAME
     *
     * @return the value of REGEXRENAME.CUST_NAME
     *
     * @mbg.generated
     */
    public String getName() {
        return name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table REGEXRENAME
     *
     * @mbg.generated
     */
    public Regexrename withName(String name) {
        this.setName(name);
        return this;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column REGEXRENAME.CUST_NAME
     *
     * @param name the value for REGEXRENAME.CUST_NAME
     *
     * @mbg.generated
     */
    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column REGEXRENAME.CUST_ADDRESS
     *
     * @return the value of REGEXRENAME.CUST_ADDRESS
     *
     * @mbg.generated
     */
    public String getAddress() {
        return address;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table REGEXRENAME
     *
     * @mbg.generated
     */
    public Regexrename withAddress(String address) {
        this.setAddress(address);
        return this;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column REGEXRENAME.CUST_ADDRESS
     *
     * @param address the value for REGEXRENAME.CUST_ADDRESS
     *
     * @mbg.generated
     */
    public void setAddress(String address) {
        this.address = address == null ? null : address.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column REGEXRENAME.ZIP_CODE
     *
     * @return the value of REGEXRENAME.ZIP_CODE
     *
     * @mbg.generated
     */
    public String getZipCode() {
        return zipCode;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table REGEXRENAME
     *
     * @mbg.generated
     */
    public Regexrename withZipCode(String zipCode) {
        this.setZipCode(zipCode);
        return this;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column REGEXRENAME.ZIP_CODE
     *
     * @param zipCode the value for REGEXRENAME.ZIP_CODE
     *
     * @mbg.generated
     */
    public void setZipCode(String zipCode) {
        this.zipCode = zipCode == null ? null : zipCode.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table REGEXRENAME
     *
     * @mbg.generated
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
        Regexrename other = (Regexrename) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getName() == null ? other.getName() == null : this.getName().equals(other.getName()))
            && (this.getAddress() == null ? other.getAddress() == null : this.getAddress().equals(other.getAddress()))
            && (this.getZipCode() == null ? other.getZipCode() == null : this.getZipCode().equals(other.getZipCode()));
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table REGEXRENAME
     *
     * @mbg.generated
     */
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getName() == null) ? 0 : getName().hashCode());
        result = prime * result + ((getAddress() == null) ? 0 : getAddress().hashCode());
        result = prime * result + ((getZipCode() == null) ? 0 : getZipCode().hashCode());
        return result;
    }
}