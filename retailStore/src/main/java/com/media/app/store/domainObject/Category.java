package com.media.app.store.domainObject;

public class Category {
    private int id;
    private String type;
    private double salesTax;

    public Category(int id, String type, double salesTax) {
        super();
        this.id = id;
        this.type = type;
        this.salesTax = salesTax;
    }

    /**
     * <p>
     * See {@link #setid(int)}
     * </p>
     * 
     * @return Returns the id.
     */
    public int getId() {
        return id;
    }

    /**
     * <p>
     * Set the value of <code>id</code>.
     * </p>
     * 
     * @param id
     *            The id to set.
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * <p>
     * See {@link #settype(String)}
     * </p>
     * 
     * @return Returns the type.
     */
    public String getType() {
        return type;
    }

    /**
     * <p>
     * Set the value of <code>type</code>.
     * </p>
     * 
     * @param type
     *            The type to set.
     */
    public void setType(String type) {
        this.type = type;
    }

    /**
     * <p>
     * See {@link #setsalesTax(double)}
     * </p>
     * 
     * @return Returns the salesTax.
     */
    public double getSalesTax() {
        return salesTax;
    }

    /**
     * <p>
     * Set the value of <code>salesTax</code>.
     * </p>
     * 
     * @param salesTax
     *            The salesTax to set.
     */
    public void setSalesTax(double salesTax) {
        this.salesTax = salesTax;
    }
}
