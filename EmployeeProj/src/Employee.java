
public class Employee {
	int id;
	String name;
	String boo;
	int sal;
	
	Employee(int id,String name, String boo, int sal){
		this.id =id;
		this.name = name;
		this.boo = boo; 
		this.sal = sal;
	}
	
	Employee(){
		
	}

	String info() {
		return String.format("사번:%d, 이름:%s, 부서:%s, 급여:%d", id, name, boo,sal);
	}
	
}
