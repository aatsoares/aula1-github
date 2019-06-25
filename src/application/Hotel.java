package application;

import java.util.Collections;
import java.util.Locale;
import java.util.Scanner;

import entities.Rent;

public class Hotel {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner (System.in);
		
		System.out.print("Quantos hospedes -");
		int n=sc.nextInt();
		 
		Rent[] vect= new Rent[10];
		 
		for (int i=0; i<n; i++) {
			sc.nextLine();
			System.out.print(" Full Name: ");
			String name=sc.nextLine();
			System.out.print("E-mail: ");
			String email=sc.nextLine();
			System.out.print("Room number: ");
			int nroom=sc.nextInt();
			vect[nroom]=new Rent(name,email,nroom);
			System.out.println();
		}
		
		for (int i=0;i<10;i++) {
			if (vect[i]!=null ) {
			System.out.println(i+": "+vect[i].toString());	
			}
		}		

		sc.close();
  }
}