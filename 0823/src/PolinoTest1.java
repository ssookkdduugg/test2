class Shape {
	String color;
	void draw() {
		System.out.println(color);
	}
}

class Circle extends Shape{
	int x;
	int y;
	int z; 
	
	@Override
	void draw() {
		System.out.println("circle");
	}
}

public class PolinoTest1 { //상속, upcasting, override 전제로함. 
	public static void main(String[] args) {
		Circle c = new Circle();
		Shape s = new Circle(); //upcasting 자식->부모 타입으로 가능 
		c.color = "green";
		c.x= c.y =10;
		c.z =20;
		c.draw();
		
		s.color = "red"; //타입이 부모라 부모에있는 변수만 사용가능.
		System.out.println(s.color);
	//	s.x = 10 ; 
		
		s.draw();
		//자식이 메소드를 오버라이드하면은 자식거 메소드 불러온다. = 다형성 
		
		
		
		
		
	}

}
