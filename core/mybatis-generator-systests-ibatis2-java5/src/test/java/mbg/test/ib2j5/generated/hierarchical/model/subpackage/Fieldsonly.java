package mbg.test.ib2j5.generated.hierarchical.model.subpackage;

public class Fieldsonly {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column FIELDSONLY.INTEGERFIELD
     *
     * @mbg.generated Sat Mar 25 03:24:02 CST 2017
     */
    private Integer integerfield;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column FIELDSONLY.DOUBLEFIELD
     *
     * @mbg.generated Sat Mar 25 03:24:02 CST 2017
     */
    private Double doublefield;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column FIELDSONLY.FLOATFIELD
     *
     * @mbg.generated Sat Mar 25 03:24:02 CST 2017
     */
    private Double floatfield;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column FIELDSONLY.INTEGERFIELD
     *
     * @return the value of FIELDSONLY.INTEGERFIELD
     *
     * @mbg.generated Sat Mar 25 03:24:02 CST 2017
     */
    public Integer getIntegerfield() {
        return integerfield;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column FIELDSONLY.INTEGERFIELD
     *
     * @param integerfield the value for FIELDSONLY.INTEGERFIELD
     *
     * @mbg.generated Sat Mar 25 03:24:02 CST 2017
     */
    public void setIntegerfield(Integer integerfield) {
        this.integerfield = integerfield;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column FIELDSONLY.DOUBLEFIELD
     *
     * @return the value of FIELDSONLY.DOUBLEFIELD
     *
     * @mbg.generated Sat Mar 25 03:24:02 CST 2017
     */
    public Double getDoublefield() {
        return doublefield;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column FIELDSONLY.DOUBLEFIELD
     *
     * @param doublefield the value for FIELDSONLY.DOUBLEFIELD
     *
     * @mbg.generated Sat Mar 25 03:24:02 CST 2017
     */
    public void setDoublefield(Double doublefield) {
        this.doublefield = doublefield;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column FIELDSONLY.FLOATFIELD
     *
     * @return the value of FIELDSONLY.FLOATFIELD
     *
     * @mbg.generated Sat Mar 25 03:24:02 CST 2017
     */
    public Double getFloatfield() {
        return floatfield;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column FIELDSONLY.FLOATFIELD
     *
     * @param floatfield the value for FIELDSONLY.FLOATFIELD
     *
     * @mbg.generated Sat Mar 25 03:24:02 CST 2017
     */
    public void setFloatfield(Double floatfield) {
        this.floatfield = floatfield;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table FIELDSONLY
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
        Fieldsonly other = (Fieldsonly) that;
        return (this.getIntegerfield() == null ? other.getIntegerfield() == null : this.getIntegerfield().equals(other.getIntegerfield()))
            && (this.getDoublefield() == null ? other.getDoublefield() == null : this.getDoublefield().equals(other.getDoublefield()))
            && (this.getFloatfield() == null ? other.getFloatfield() == null : this.getFloatfield().equals(other.getFloatfield()));
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table FIELDSONLY
     *
     * @mbg.generated Sat Mar 25 03:24:02 CST 2017
     */
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getIntegerfield() == null) ? 0 : getIntegerfield().hashCode());
        result = prime * result + ((getDoublefield() == null) ? 0 : getDoublefield().hashCode());
        result = prime * result + ((getFloatfield() == null) ? 0 : getFloatfield().hashCode());
        return result;
    }
}