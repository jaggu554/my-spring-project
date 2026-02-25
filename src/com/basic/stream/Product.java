package com.basic.stream;

import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import java.io.FileInputStream;
public class Product implements Serializable {
	
	private static final long serialVersionUID=1L;

	int id;
	String name;
	float price;

	public Product(int id, String name, float price) {
		this.id = id;
		this.name = name;
		this.price = price;
	}
	 @Override
	    public String toString() {
	        return "Product{name='" + name + "', price=" + price + "}";
	    }

	public static void main(String[] args) {

		List<Product> productsList = new ArrayList<>();
		productsList.add(new Product(1, "HP Laptop", 25000f));
		productsList.add(new Product(2, "Dell Laptop", 30000f));
		productsList.add(new Product(3, "Lenevo Laptop", 28000f));
		productsList.add(new Product(4, "Sony Laptop", 28000f));
		productsList.add(new Product(5, "Apple Laptop", 90000f));

		List<Float> ListPrice = productsList.stream().filter(p -> p.price > 200.0f).map(p -> p.price)
				.collect(Collectors.toList());
		System.out.println(ListPrice);

////		 Serialization process
//		try {
//			ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("p.txt"));
//			out.writeObject(productsList);
//			out.flush();
//			out.close();
//		} catch (Exception e) {
//			System.out.println(e);
//		}
//		
//		try {
//			ObjectInputStream in=new ObjectInputStream(new FileInputStream("p.txt"));
//			
//			List<Product> product=(List<Product>)in.readObject();
//			System.out.println(product.toString());
//			in.close();
//		}catch(Exception e) {
//			System.out.println(e);
//		}
		
		List<Product> apple=productsList.stream()
				.filter(p-> p.name.equals("Apple Laptop")).collect(Collectors.toList());
		
		System.out.println(apple);
		
//		Stream.iterate(1, element->element+1).filter(element-> element%5==0).limit(5).forEach(System.out::println);
		
		Float price=productsList.stream().map(p->p.price).reduce(0.0f,Float::sum);
		System.out.println(price);
		
	float pp=	productsList.stream().map(p->p.price).reduce(0.0f,(sum,ff)-> sum+ff);
	System.out.println(pp);
	
	}
}
