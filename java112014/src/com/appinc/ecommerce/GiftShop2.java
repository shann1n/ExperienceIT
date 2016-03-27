package com.appinc.ecommerce;

public class GiftShop2 {
	public static void main(String[] args) {
		Storefront2 store = new Storefront2();
		store.addItem("C01", "MUG", "9.99", "150", "FALSE");
		store.addItem("C02", "LG MUG", "12.99", "82", "TRUE");
		store.addItem("C03", "MOUSEPAD", "10.49", "800", "TRUE");
		store.addItem("D01", "T SHIRT", "16.99", "90", "FALSE");
		store.sort();
		
		for (int i=0; i < store.getSize(); i++) {
			Item2 show = (Item2)store.getItem(i);
			System.out.println("\nItem ID: " + show.getId() +
			"\nRetail Price: $" + show.getRetail() +
			"\nPrice: $" + show.getPrice() +
			"\nQuantity: " + show.getQuantity() + "\nDiscount: " + show.getDiscount());
		}
		
	}
}