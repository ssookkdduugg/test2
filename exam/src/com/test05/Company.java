package com.test05;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class Company {

	public static void main(String[] args) {
		HashMap<Integer, Employee> info = new HashMap<>();
		
		//홍길동 1 Secretary 800
		//이순신 2 Sales 1200
		//key값은 각 객체의 Number로 한다. 
		
		info.put(1, new Secretary("홍길동", 1, "Secretary", 800)); 
		info.put(2, new Sales("이순신", 2, "Sales", 1200));
		
//		System.out.println(info.keySet()); //key값 가져오기
//		System.out.println(info.values());
		
//		for(Integer key: info.keySet()) {
//			System.out.println(key);
//		}
		
		System.out.println("name\tdepartment\tsalary");
		System.out.println("--------------------------------------");
		for (Employee emp: info.values()) {
			System.out.println(emp);
			
//			System.out.println( entry.getKey()+ "이름:"+entry.getValue());
		}
		
		
		System.out.println();
		System.out.println("인센티브 100 지급");
		System.out.println("name\tdepartment\tsalary\ttax");
		System.out.println("--------------------------------------");
		
		
		for(Employee emp: info.values()) {
			if(emp instanceof Secretary) {
				Secretary secretary = (Secretary)emp;
				secretary.incentive(100);
				//secretary.tax();
//				System.out.println(secretary);
				System.out.println(secretary + String.format(" %.2f", secretary.tax()));
			}
			if(emp instanceof Sales) {
				Sales sales = (Sales)emp;
				sales.incentive(100);
//				System.out.println(sales.toString() + sales.tax());
				System.out.println(sales + String.format(" %.2f", sales.tax()));
			}
			
		}
		

	}

}
