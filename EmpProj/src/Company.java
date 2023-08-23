import emp.Employee;

public class Company {
	static Employee[] emps = new Employee[100];
	static int empCnt = 0; 
	public static void enter(Employee emp) { //함수의 파라미터는 
		//Employee emp = emp1 (Permanent자식) upcasting 
		
		emps[empCnt++] = emp;
		
	}
	public static void allEmployeeInfo() {
		for(int i=0; i<empCnt; i++) {
			System.out.println(emps[i].info());
			//Employee안에 있는 info를 자식객체들이 오버라드이 했었으면
			//오버라이드한 메소드가호출됨.
		}
	}
	
	public static int getTotalPay() {
		int tot = 0;
		for(int i=0; i<empCnt; i++) {
			tot+= emps[i].getPay(); //자식객체에서 오버라이드한 메소드들 getPay불러옴. 
		}
		return tot;
	}
	
}
