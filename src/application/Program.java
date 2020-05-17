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
		
		
		List<Employee> list = new ArrayList<>();
		
		System.out.print("Quantos funcionários serão registrados: ");
		int n = sc.nextInt();
		
		for(int i=1;i<=n;i++) {
			System.out.println("Funcionário # " + i + ":");
			System.out.print("Id:");
			int id = sc.nextInt();
			System.out.print("Name:");
			sc.nextLine();
			String name = sc.nextLine();
			System.out.print("Salary:");
			double salary = sc.nextDouble();			
			list.add(new Employee(id, name, salary));			
		}
		
		System.out.println("Identifique o funcionário pelo Id:");
		int id = sc.nextInt();
		Employee emp = list.stream().filter(x -> x.getId() == id).findFirst().orElse(null);
		if(emp == null) {
			System.out.println("This id does not exist!");
		}
		
		else{
			System.out.print("Valor do aumento: ");
			double percentage = sc.nextDouble();
			emp.Incrementsalary(percentage);
		}
		
		for(Employee obj: list) {
			System.out.println(obj);
		}
		
		sc.close();
	}

}
