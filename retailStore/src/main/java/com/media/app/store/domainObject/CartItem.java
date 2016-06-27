package com.media.app.store.domainObject;

public class CartItem {
	public CartItem(int id, Product product, int quantity) {
		super();
		this.id = id;
		this.product = product;
		this.quantity = quantity;
	}

	private int id;
	private Product product;
	private int quantity;

	public String getName() {
		return getProduct().getName();
	}

	public double getUnitPrice() {
		return getProduct().getPrice();
	}

	public String getCategoryType() {
		return getProduct().getCategory().getType();
	}

	public double getSalesTax() {
		return (getProduct().getPrice() * (getProduct().getCategory()
				.getSalesTax() / 100)) * getQuantity();
	}

	public double getTotalPrice() {
		return getProduct().getPrice() * getQuantity();
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
	 * See {@link #setproduct(Product)}
	 * </p>
	 * 
	 * @return Returns the product.
	 */
	public Product getProduct() {
		return product;
	}

	/**
	 * <p>
	 * Set the value of <code>product</code>.
	 * </p>
	 * 
	 * @param product
	 *            The product to set.
	 */
	public void setProduct(Product product) {
		this.product = product;
	}

	/**
	 * <p>
	 * See {@link #setquantity(int)}
	 * </p>
	 * 
	 * @return Returns the quantity.
	 */
	public int getQuantity() {
		return quantity;
	}

	/**
	 * <p>
	 * Set the value of <code>quantity</code>.
	 * </p>
	 * 
	 * @param quantity
	 *            The quantity to set.
	 */
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
}