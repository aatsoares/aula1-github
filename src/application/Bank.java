package application;

import java.util.Locale;

import java.util.Scanner;
import entities.BankAccount;
public class Bank {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner (System.in);
		double deposit;
		double withdrawal;
		
		BankAccount bankAccount; 	
		System.out.println("Enter  name: ");
		String name=sc.nextLine();
		
		
		System.out.println("Enter account number: ");
		int accountNumber=sc.nextInt();
		
		
		
		System.out.println("Deposito inicial (s/n) ");
		char depInit=sc.next().charAt(0);
		
		if  (depInit=='s' || depInit=='S') {
			System.out.println("Qual o valor");
			deposit=sc.nextDouble();
			bankAccount=new BankAccount(name,accountNumber, deposit);
		}
		
		else {
			bankAccount=new BankAccount(name,accountNumber); 
		}
		
		System.out.println("bank account data:");
		System.out.println(bankAccount);
		System.out.println();
		
		System.out.println("Enter deposite value:");
		deposit=sc.nextDouble();
		bankAccount.getCreditAccount(deposit);
		System.out.println();
		System.out.println(bankAccount);
		
		System.out.println("Enter withdrawal value:");
		withdrawal=sc.nextDouble();
		bankAccount.debitAccount(withdrawal);
		System.out.println();
		System.out.println(bankAccount);

		sc.close();
		
		
		

	}

}
