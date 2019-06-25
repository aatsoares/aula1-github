package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Product;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner (System.in); 
		
		// Product product = new Product();
		// teste para verificar o valor default atribuido os atributos 
		
		
		
		System.out.println("Enter product name: ");
		System.out.print("Name: ");
		String name=sc.nextLine();
		
		System.out.print("Price: ");
		double price=sc.nextDouble();
		
		//System.out.print("Quantity in stock: ");
		//int quantity=sc.nextInt();
		
		Product product = new Product(name, price);
		product.setName("Notebook");
		System.out.println("Data product: "+product.getName());
		product.setPrice(1203.223);
		System.out.println("Data product: "+product.getPrice());

		
		
		System.out.println();		
		System.out.println("Data product: "+product);
		
		System.out.println();
		System.out.println("Enter the number os products to be added in stock: ");
		int quantity=sc.nextInt();
		product.addProducts(quantity);
		
		System.out.println();		
		System.out.println("Updated data: "+product);
		
		System.out.println();
		System.out.println("Enter the number os products to be remove from stock: ");
	    quantity=sc.nextInt();
		product.removeProducts(quantity);
		
		System.out.println();		
		System.out.println("Updated data: "+product);
		
		sc.close();

	}

}
