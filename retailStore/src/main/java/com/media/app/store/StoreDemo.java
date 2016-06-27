package com.media.app.store;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.media.app.store.service.BillerService;

/**
 * Store app
 * 
 */
public class StoreDemo {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext(
				"SpringBeans.xml");

		BillerService billerService = (BillerService) context.getBean("billerService");
		billerService.printBill(billerService.prepareCart());

	}

}