package com.media.app.store.domainObject;

public class Product {
    private int id;
    private String name;
    private double price;
    private Category category;

    public Product(int id, String name, double price, Category category) {
        super();
        this.id = id;
        this.name = name;
        this.price = price;
        this.category = category;
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
     * See {@link #setname(String)}
     * </p>
     * 
     * @return Returns the name.
     */
    public String getName() {
        return name;
    }

    /**
     * <p>
     * Set the value of <code>name</code>.
     * </p>
     * 
     * @param name
     *            The name to set.
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * See {@link #setprice(double)}
     * </p>
     * 
     * @return Returns the price.
     */
    public double getPrice() {
        return price;
    }

    /**
     * <p>
     * Set the value of <code>price</code>.
     * </p>
     * 
     * @param price
     *            The price to set.
     */
    public void setPrice(double price) {
        this.price = price;
    }

    /**
     * <p>
     * See {@link #setcategory(Category)}
     * </p>
     * 
     * @return Returns the category.
     */
    public Category getCategory() {
        return category;
    }

    /**
     * <p>
     * Set the value of <code>category</code>.
     * </p>
     * 
     * @param category
     *            The category to set.
     */
    public void setCategory(Category category) {
        this.category = category;
    }
}
