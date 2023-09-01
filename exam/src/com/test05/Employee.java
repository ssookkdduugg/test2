package com.test05;

abstract class Employee {
	private String name;
	private int number;
	private String department; // 부서
	private int salary; // 월급

	Employee() {
	}

	Employee(String name, int number, String department, int salary) {
		this.name = name;
		this.number = number;
		this.department = department;
		this.salary = salary;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	abstract double tax();
	
	@Override
	public String toString() {
		return String.format("%s\t%12s\t%d\t", name,department,salary);
	}
}

class Secretary extends Employee implements Bonus {

	Secretary() {
	}

	Secretary(String name, int number, String department, int salary) {
//		this.name = name;
//		this.number = number;
//		this.department = department;
//		this.salary = salary;
		super(name, number, department, salary);
	}

	@Override
	public void incentive(int pay) {
//		salary += (pay*0.8);
		setSalary((int)((double)getSalary() + pay*0.8));
	}

	@Override
	double tax() {
		// 세금 리턴
		// salary에 10% 징수
//		double temp;
//		this.salary /=10;
//		temp = Math.round(salary*1);
//		return temp;
		
		return getSalary() * 0.1;
	}
	
	
	
	
	

}


class Sales extends Employee implements Bonus{
	
	Sales(){}
	Sales(String name, int number, String department, int salary){
		super(name, number, department, salary);
	}
	
	

	@Override
	public void incentive(int pay) {
		// pay에 120%가 기존 salary에 더해진다.
//		salary += (pay*1.2);
		setSalary((int)((double)getSalary() + pay*1.2));
	}
		 
		

	@Override
	double tax() {
		// 세금 리턴
		// salary에 13% 징수
//		return salary/13;
		
		return getSalary() * 0.13;
	}
	
}