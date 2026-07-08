package pilarespoo.company;

import pilarespoo.company.domain.Employee;
import pilarespoo.company.domain.Manager;
import pilarespoo.company.domain.Salesman;

public class Main {
	public static void main(String[] args) {
		
		printEmployee(new Manager());
		printEmployee(new Salesman());
		
		//verifica se uma variavel é instância de uma classe
		//System.out.println(employee instanceof Salesman);
	}
	
	public static void printEmployee(Employee employee) {
		System.out.printf("===== %s =====\n", employee.getClass().getCanonicalName());
		switch (employee) {
			case Manager manager -> {
				manager.setCode("aiai");
				manager.setName("Ana");
				manager.setLogin("ana@email.com");
				manager.setSalary(7000);
				manager.setPassword("123456");
				manager.setCommission(1.0);
				
				System.out.println(manager.getCode());
				System.out.println(manager.getName());
				System.out.println(manager.getLogin());
				System.out.println(manager.getPassword());
				System.out.println(manager.getSalary());
				System.out.println(manager.getCommission());
				System.out.println(manager.getFullSalary(500));
			}
			case Salesman salesman -> {
				salesman.setCode("imalittlebutterfly");
				salesman.setName("Maria");
				salesman.setSalary(4500);
				salesman.setSoldAmount(1000);
				salesman.setPercentPerSold(10);
				
				System.out.println(salesman.getCode());
				System.out.println(salesman.getName());
				System.out.println(salesman.getSalary());
				System.out.println(salesman.getPercentPerSold()+"%");
			}
			//no caso do sealed não precisa
			default -> throw new IllegalArgumentException("Unexpected value: " + employee);
		}
		System.out.println(employee.getFullSalary());
		System.out.println();
	}
}
