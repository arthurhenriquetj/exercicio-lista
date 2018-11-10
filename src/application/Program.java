package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Employee;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		List<Employee> list = new ArrayList<>(); //instancia��o da lista usando a classe Employee criada
		
		System.out.println("Hoy many employees will be added?");
		int numE = sc.nextInt();
		
		for(int i=0;i<numE;i++) {
			System.out.println("Employee #:" + (i+1));
			System.out.print("ID: ");
			int id = sc.nextInt();
			System.out.print("Name: ");
			sc.nextLine(); // next line necess�rio para que vari�vel name receba o proximo nextline
			String name = sc.nextLine();
			System.out.print("Salary: ");
			double salary = sc.nextDouble();
			list.add(new Employee(id, name, salary)); // adicionando os dados colhidos � lista referenciada na classe employee		
		}
		
		

		sc.close();
	}

}
