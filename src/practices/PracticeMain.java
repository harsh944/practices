package practices;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class PracticeMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EmpInterfaceImpl emif = new EmpInterfaceImpl();
		
		List<Employee> emp = new ArrayList<>();
		emp.add(new Employee("harsh", 24, "boom@gmail.com", 100, "CSE"));
		emp.add(new Employee("tejas", 24, "tej@gmail.com", 200, "ME"));
		
		System.out.println("employee lsit "+emp);
		
		List<Integer> salaries = new ArrayList<>();		
		for(Employee ee : emp) {
			salaries.add(ee.getSalary());
		}
		
		int totalsal;
		
		totalsal = emif.employeeSalary(salaries);
		System.out.println();
		System.out.println("total of salaries "+ totalsal);
		
		
		List<Integer> sssa = emp.stream().map(sss->sss.getSalary()).collect(Collectors.toList());
		System.out.println("sasasad"+sssa);
		
		int sum = emp.stream().mapToInt(sss->sss.getSalary()).sum();
		
		
               
		
		
		System.out.println("stream sum "+ sum);
	}

}
