package com.media.app.store.service;

import com.media.app.store.domainObject.Cart;
import com.media.app.store.domainObject.Category;
import com.media.app.store.domainObject.Product;
import com.media.app.store.domainObject.CartItem;

public class BillerService {
	public Cart prepareCart() {
		Category c1 = new Category(1, "A", 20);
		Category c2 = new Category(2, "B", 10);
		Category c3 = new Category(3, "C", 0);
		Product p1 = new Product(1, "Mobile", 20, c1);
		Product p2 = new Product(2, "Memory card", 10, c2);
		Product p3 = new Product(3, "Cover", 5, c3);
		Product p4 = new Product(4, "Screen guard", 5, c3);
		CartItem pi1 = new CartItem(1, p1, 2);
		CartItem pi2 = new CartItem(2, p2, 2);
		CartItem pi3 = new CartItem(3, p3, 2);
		CartItem pi4 = new CartItem(4, p4, 2);
		Cart c = new Cart();
		c.addCartItem(pi1);
		c.addCartItem(pi2);
		c.addCartItem(pi3);
		c.addCartItem(pi4);
		c.removeCartItem(2);
		return c;
	}

	public void printBill(final Cart c) {
		c.showCartItems();
		System.out.println("==================================");
		System.out.println("Price Amount: " + c.getPrice());
		System.out.println("Sales Tax: " + c.getSalesTax());
		System.out.println("Bill Amount: " + c.getTotalBillAmount());
	}
}
