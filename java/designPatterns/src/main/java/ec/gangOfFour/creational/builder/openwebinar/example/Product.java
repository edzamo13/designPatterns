package ec.gangOfFour.creational.builder.openwebinar.example;

import java.util.ArrayList;
import java.util.List;


public class Product {

	private List<String> parts = new ArrayList<String>();

	public void add(String part) {
		parts.add(part);
	}

	public void show() {
		System.out.println("\n Product Parts------");
		for (String p : parts) {
			System.out.println(p);
		}
	}
}
