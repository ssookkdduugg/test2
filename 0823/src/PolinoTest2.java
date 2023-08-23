class AA {
	int a; 
	void methodA() {}//1
	void method() {} //2
	void info() {
		System.out.println(getPay());
	}
	int getPay() {
		return 0;
	}
}

class BB extends AA{ //상속받아서 
	int b;
	void methodB() {}//2
	void method() {}//4 
	
	@Override
	int getPay() {
		return 100; 
	}
}



public class PolinoTest2 {
	public static void main(String[] args) {
		AA obj = new BB(); 
		obj.methodA(); //1
		//obj.methodB(); // 타입이 부모라 (오버라이드 안되어있어서 못불러옴)
		obj.method(); //4
		obj.a =10; 
		//obj.b = 10;  타입이 부모면은 자식에있는거 못불러옴 
		obj.info();
		//100 
		//자식에 info없어도 부모에 info메소드 사용하고 -> 자식에서 오버라이드된 getPay함수 호출
		
	}
	//자식 객체를 부모타입 변수에 넣을 경우 ,  부모에는없는 자식의 변수나 함수는 사용불가 
	//단, 오버라이드 한 함수는 자식객체를 부모타입에 넣어도 불러올수있음.
}
