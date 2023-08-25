class Base {
	int x=1;

	void method() {
		System.out.println("Base method");
	}
}

class Derived extends Base {
	int x=2;
	int y=3;

	void method() { // 오버라이딩
		System.out.println("Drived method");
	}
}

public class PolinoTest3 {

	public static void main(String[] args) {
		Base base1 = new Derived(); // upcasting
		base1.method(); // Drived method 다형성
		// 오버라이드한 자식메소드들불러올수있고 자식변수는 못불러옴.
		base1.x = 10;
		// base1.y = 20; 에러 변수는 오버라이드안됨

		Base base2 = new Base();
		base2.method(); // Base method
		
		if(base1 instanceof Derived) { //다운캐스팅할때마다 체크하기
			//Derived클래스로 생성된 객체야? 
			//true	
			Derived derived = (Derived) base1; //downcasting 
			derived.y = 20; 
			//다운캐스팅하고 그때서 y에 접근가능 
		}
		
		if(base2 instanceof Derived) { //false
			Derived  derived2 = (Derived) base2;
			derived2.y = 30 ; 
		}

		
		Base base3 = new Derived();
		base3.method(); //Derived method호출
		System.out.println(base3.x); //base의 x값 출력 
		
		
		

	}

}
