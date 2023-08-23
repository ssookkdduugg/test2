import pac.Number;

public class AccessTest1 {
	public static void main(String[] args) {
		Number n1 = new Number();
	//	n1.pnum = 100;  private라 오류남 
		//n1.pmethod();
		
		
		//n1.dnum = 100; //같은 패키지에 있는 클래스의 default 멤버 접근가능.
		n1.setDnum(100);
		System.out.println(n1.getDnum());
		
		n1.dmethod();
		
		n1.ppnum = 100; //다른 클래스의 public멤버는 어디서든 접근가능.
		n1.ppmethod();
		
		//p1.prnum = 100;
		//같은패키지도아니고 자식클래스아니니가안됨.
		
		
		
		

	}

}
