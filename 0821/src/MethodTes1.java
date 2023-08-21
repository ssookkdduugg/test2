class MyMath{
static	int add(int x, int y) { //x,y 파라미터,스택,지역변수
		//지역변수는 메소드내에 선언됨
		int result = x + y;
		return result; //메소드 정의 . 메소드 호출한곳으로 가라 
	}
	
}


public class MethodTes1 {

	public static void main(String[] args) {
		
		int res = MyMath.add(10, 20);
		System.out.println(res);
		

	}
	
	//new해서 생성된 변수는 변수지 함수가아니다. 
	

}
