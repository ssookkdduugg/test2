
class Number{
	int inum;
	static int snum;
	
	void imethod() {
		inum = 10; 
		snum++; //instance 메소드에는 static 변수 사용가능 
		imethod2();//instance 메소드에는 instance 메소드 사용가능 
		smethod();//instance 메소드에는 static 메소드 사용가능
	}
	
	void imethod2() {
		
	}
	
	static void smethod() { //static안에는 static만 사용 
		snum = 100; 
	//	inum =10; static 메소드안에는 instance 변수 사용할수없다. 
		smethod2();
	//	imethod(); static 메소드에서는 instance 메서드 호출불가 
	}
	
	static void smethod2() {
		
	}
	
}

public class StaticTest1 {
	public static void main(String[] args) {
		System.out.println(Number.snum);
		Number.smethod();
		//static 변수는 객체 생성안하고 클래스명.변수명해서 부를수 있음. 
		//프로그램 시작시 이미 변수가 생성되었기 때문이다.
		
		
		Number n = new Number();
		System.out.println(n.inum); 
		n.imethod();
		n.smethod();
		System.out.println(n.snum); //static은 둘다 접근가능.
		//인스턴스 변수는 객체 생성해야만 사용 가능.
		
	}

}
