package com.media.app.store.domainObject;

import java.util.ArrayList;
import java.util.List;

public class Cart {
	private double price = 0.0;
	private double salesTax = 0.0;
	private double totalBillAmount = 0.0;

	private List<CartItem> cartItems = new ArrayList<CartItem>();

	public boolean addCartItem(final CartItem cartItem) {
		if (cartItems.add(cartItem)) {
			setPrice(getPrice() + cartItem.getTotalPrice());
			setSalesTax(getSalesTax() + cartItem.getSalesTax());
			setTotalBillAmount(getTotalBillAmount() + cartItem.getTotalPrice()
					+ cartItem.getSalesTax());
			return true;
		}
		return false;
	}

	public void removeCartItem(final int index) {
		CartItem cartItem = cartItems.remove(index);
		setPrice(getPrice() - cartItem.getTotalPrice());
		setSalesTax(getSalesTax() - cartItem.getSalesTax());
		setTotalBillAmount(getTotalBillAmount()
				- (cartItem.getTotalPrice() + cartItem.getSalesTax()));
	}

	public void showCartItems() {
		int count = 1;
		for (CartItem cartItem : getCartItems()) {
			System.out.println("#" + count + " " + cartItem.getName() + " "
					+ cartItem.getQuantity() + " " + cartItem.getUnitPrice()
					+ " " + cartItem.getTotalPrice());
			count++;
		}
	}

	/**
	 * @return the cartItems
	 */
	public List<CartItem> getCartItems() {
		return cartItems;
	}

	/**
	 * @param cartItems
	 *            the cartItems to set
	 */
	public void setCartItems(List<CartItem> cartItems) {
		this.cartItems = cartItems;
	}

	/**
	 * @return the price
	 */
	public double getPrice() {
		return price;
	}

	/**
	 * @param price
	 *            the price to set
	 */
	public void setPrice(double price) {
		this.price = price;
	}

	/**
	 * @return the totalBillAmount
	 */
	public double getTotalBillAmount() {
		return totalBillAmount;
	}

	/**
	 * @param totalBillAmount
	 *            the totalBillAmount to set
	 */
	public void setTotalBillAmount(double totalBillAmount) {
		this.totalBillAmount = totalBillAmount;
	}

	/**
	 * @return the salesTax
	 */
	public double getSalesTax() {
		return salesTax;
	}

	/**
	 * @param salesTax
	 *            the salesTax to set
	 */
	public void setSalesTax(double salesTax) {
		this.salesTax = salesTax;
	}

}
