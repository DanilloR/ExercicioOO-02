package exercicio_02;

import java.util.Locale;
import java.util.Scanner;

import actors.Employee;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);
		Employee ep = new Employee();
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter employee data");
		System.out.print("Employee name: ");
		ep.name = sc.nextLine();
		System.out.print("Gross Salary: ");
		ep.grossSalary = sc.nextDouble();
		System.out.print("Discount tax: ");
		ep.tax = sc.nextDouble();
		System.out.println();		
		System.out.println(ep);
		System.out.println();
		System.out.println("Which percentage to increase salary? ");
		double percentage = sc.nextDouble();
		ep.increaseSalary(percentage);
		System.out.println();
		System.out.println("Updated data: "+ep);
		
		sc.close();

	}

}
