class Base {
	int bnum; 
	void method1() {} //1
	void method2() {} //2
	
}

class Drived extends Base { //상속받아서 
	int dnum;
	void method1(int n) {} //5  이름만같고 매개변수있으니까 오버로드 
	
	void method2(){ //6   //부모에 있는 메소드명,매개변수 같으니까 오버라이딩으로 재정의 
		method1();//1    // 매개변수 없는 method1은 1번 
		super.method2(); //2 super썼으니까 부모거 
		method2(); //잘못 사용 확률 매우높음. 
	} 
	void method2(int n) { //3 매개변수있으니까 메소드명만같은 오버로드 
		method2(); //6  가까운 method2() 
	} //3 매개변수있는 오버로딩 
	void method3() {} //4 그냥 내가 추가한 메소드 
	
}

public class InheritTest2 {
	public static void main(String[] args) {
		Base b = new Base(); 
		b.bnum = 10; 
		b.method1();//1
		b.method2();//2
		
		Drived d = new Drived();
		d.bnum = 20 ; 
		d.dnum = 30 ; 
		d.method1();//1
		d.method2();//6
		d.method3(); //4
		
		
		
		
		
	}
}
