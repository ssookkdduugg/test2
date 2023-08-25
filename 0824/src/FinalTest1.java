
class TempClass{
	final int x; //객체들이 각각 다른값으로 생성자로 초기화 
	static final int sx = 100; // 모든 객체들이 동일한 값 가질려면 
							//static final 
	TempClass(int x){
		this.x = x ;  //instance final은 생성자에서 초기화한다. 
		//sx = x; static final은 생성자에서 초기화 할수 없다. 
	}
	
	void method(int x) {
		//this.x = x;  final 변수라 수정안됨 
	}
}

public class FinalTest1 {
	public static void main(String[] args) {
		final int n ; 
		n = 10; 
		//n=20;//final이라 수정안됨
		System.out.println(n);
		
		new TempClass(20);
		new TempClass(30);
	}

}
