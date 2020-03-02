package model;

public class Employee {
	
	private int empId;
	private String empName;
	private int empSalary;
	public Employee(int empId,String empName,int empSalary)
	{
		this.empId=empId;
		this.empName=empName;
		this.empSalary=empSalary;
	}
	public int getEmpId() {
		return empId;
	}
	public String getEmpName() {
		return empName;
	}
	public int getEmpSalary() {
		return empSalary;
	}
	
}
