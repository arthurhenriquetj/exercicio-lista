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

		List<Employee> list = new ArrayList<>(); // instanciação da lista usando a classe Employee criada

		System.out.println("Hoy many employees will be added?");
		int numE = sc.nextInt();

		for (int i = 0; i < numE; i++) {
			System.out.println("Employee #:" + (i + 1));
			System.out.print("ID: ");
			int id = sc.nextInt();
			System.out.print("Name: ");
			sc.nextLine(); // next line necessário para que variável name receba o proximo nextline
			String name = sc.nextLine();
			System.out.print("Salary: ");
			double salary = sc.nextDouble();
			list.add(new Employee(id, name, salary)); // adicionando os dados colhidos à lista referenciada na classe
														// employee
		}

		// increasing salary

		System.out.println();
		System.out.println("Enter the employee id that will have salary increased:");
		int id = sc.nextInt();
		Employee emp = list.stream().filter(x -> x.getId() == id).findFirst().orElse(null);

		/*
		 * a variável emp da classe employee recebe a lista filtrada, tal qual o id
		 * digitado seja igual ao id contido na lista, caso o id digitado nao esteja na
		 * lista, a variavel emp recebe null
		 */

		if (emp == null)
			System.out.println("This id does not exist!");
		else {
			System.out.println("Enter the percentage: ");
			double percentage = sc.nextDouble();
			emp.increaseSalary(percentage);
			/*
			 * o objeto emp da classe Employee chama o método increaseSalary contido na
			 * classe, para acrescentar a porcentagem no salário
			 */

		}
		
		// listing employees
		
		System.out.println();
		System.out.println("List of employees:");
		for (Employee obj : list) {
			System.out.println(obj);
		}

		sc.close();
	}

}
