package com.maps;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

import model.Employee;
import model.Manager;

public class DeepInMaps {

	public static void main(String[] args) {
		
		Employee employee=new Employee(121,"Raju",15000);
		Employee employee2=new Employee(131, "Sudha", 17000);
		Employee employee3=new Employee(141, "Roja",30000);
		Employee employee4=new Employee(142, "Roja",28000);
		Employee employee5=new Employee(132, "Ramu",28000);
		Employee employee6=new Employee(111, "Samule",18000);
		ArrayList<Employee> list=new ArrayList<Employee>();
		list.add(employee);
		list.add(employee6);
		ArrayList list2=new ArrayList();
		list2.add(employee2);
		list2.add(employee5);
		ArrayList list3=new ArrayList();
		list3.add(employee3);
		list3.add(employee4);
		Manager manager=new Manager("assitant HRmanager",141234);
		Manager manager2=new Manager("HR Manager",123456);
		Manager manager3=new Manager("Floor Manager",45723);
		LinkedHashMap<Manager,ArrayList<Employee>> map=new LinkedHashMap<Manager,ArrayList<Employee>>();
		map.put(manager, list);
		map.put(manager2, list2);
		map.put(manager3, list3);
		Set set=map.entrySet();
		for (Object object : set) 
		{
			
			
			    Map.Entry<Manager,ArrayList> entry=(Map.Entry<Manager,ArrayList>)object;
				Manager m=entry.getKey();
				System.out.println("Position of the manager : "+m.getManagerPosition());
				System.out.println("Manager Id : "+m.getManagerId());
				System.out.println("list of employees under this manager:-");
			    ArrayList ak=entry.getValue();
			    for (Object object2 : ak) 
			    {
			    	Employee emp= (Employee) object2;
			    	
			    	System.out.println("Employee Id : "+emp.getEmpId());
			    	System.out.println("Employee Name :"+emp.getEmpName());
			    	System.out.println("Employee Salary : "+emp.getEmpSalary());
			    	System.out.println(" ");
				}
		}

	}

}
