package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.HRPayroll;

public class HR {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner (System.in);
		
		System.out.print("How many employees will be registered? - ");
		int n=sc.nextInt();
		
		int id;
		String name;
		double salary;
		
		List<HRPayroll> list=new ArrayList<>();
		
		
		for (int i=0; i<n; i++) {
			sc.nextLine();
			System.out.print("Full Name: ");
			name=sc.nextLine();
			System.out.print("id : ");
			id=sc.nextInt();
			System.out.print("Salary: ");
			salary=sc.nextInt();
			list.add(new HRPayroll(id,name,salary));
			System.out.println();
		}

		System.out.println("Enter the employee id that will have salary increase");
		int id1=sc.nextInt();
		
		HRPayroll emp = list.stream().filter(x -> x.getId() == id1).findFirst().orElse(null);
		if (emp == null) {
			System.out.println("This id does not exist!");
		}
		else {
			System.out.print("Enter the percentage: ");
			double percentage = sc.nextDouble();
			emp.increaseSalary(percentage);
		}
		
		// PART 3 - LISTING EMPLOYEES:
		
		System.out.println();
		System.out.println("List of employees:");
		for (HRPayroll obj : list) {
			System.out.println(obj);
		}
				
		sc.close(); 
	}

}
