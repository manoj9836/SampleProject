package com.media.app.store.service;

import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.media.app.store.domainObject.Cart;
import com.media.app.store.domainObject.CartItem;
import com.media.app.store.domainObject.Category;
import com.media.app.store.domainObject.Product;

public class BillerServiceTest {
	private static BillerService billerService;

	@BeforeClass
	public static void initialize() {
		ApplicationContext context = new ClassPathXmlApplicationContext(
				"SpringBeans.xml");

		billerService = (BillerService) context.getBean("billerService");
	}

	@Test
	public void testPrintBill() {
		Category c1 = new Category(1, "A", 20);
		Category c2 = new Category(2, "B", 10);
		Category c3 = new Category(3, "C", 0);
		Product p1 = new Product(1, "Mobile", 10000, c1);
		Product p2 = new Product(2, "Memory card", 1000, c2);
		Product p3 = new Product(3, "Cover", 100, c3);
		CartItem pi1 = new CartItem(1, p1, 1);
		CartItem pi2 = new CartItem(2, p2, 1);
		CartItem pi3 = new CartItem(3, p3, 1);
		Cart c = new Cart();
		c.addCartItem(pi1);
		c.addCartItem(pi2);
		c.addCartItem(pi3);

		billerService.printBill(c);

		Assert.assertTrue(true);
	}

}
