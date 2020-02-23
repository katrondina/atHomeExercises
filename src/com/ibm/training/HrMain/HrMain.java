package com.ibm.training.HrMain;

import java.util.ArrayList;
import java.util.Iterator;

public class HrMain {

	public static void main(String[] args) {
		System.out.println("This is the main class.");
		ArrayList<Employee> empList = new ArrayList<Employee>();
		
		empList.add(new Employee("Katrina","Rondina","2503 Juan Luna","Aug 15, 1988",31,'S','F',60200,14));
		empList.add(new Employee("Carole","Rondina","2503 Juan Luna","Aug 15, 1988",31,'M','F',90000,15));
		empList.add(new Employee("Jophe","Geralin","Batasan","Feb 24, 1936",36,'S','M',112000,1));
		
		//List<Employee> pl = Employee.createShortList();
		
		//empList.forEach(p -> System.out.println(p));
		
		for (Employee a : empList){
			printInfo(a);
		}
		
		Iterator<Employee> employees = empList.iterator();
		int employeeNumber = 1;
		while(employees.hasNext()){
			System.out.println("Employee: "+employeeNumber);
			printInfo(employees.next());
			employeeNumber++;
		}

	}
	
	public static void printInfo(Employee emp){
		System.out.println(emp.getFirstName()+" "+emp.getLastName()+" "+emp.getBirthDate()+" "+emp.getAge());
		System.out.println("Daily Rate: " + emp.getDailyRate());
		System.out.println("Salary: " + emp.getProjectedSalary());
		System.out.println("Bonus: "+emp.getBonus());
		System.out.println(emp.getBonusMessage());
	}

}
