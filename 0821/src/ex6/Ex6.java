package ex6;

public class Ex6 { //1.4142135623730951
	
	// 두 점 (x,y)와 (x1,y1)간의 거리를 구한다.
	//제곱근 계산은 Math.sqrt(double a)를 사용하면 된다
	static double getDistance(int x, int y, int x1, int y1) {
	
		return Math.sqrt((x1-x)*(x1-x)+(y1-y)*(y1-y));
		
	}
	public static void main(String args[]) {
	System.out.println(getDistance(1,1,2,2));
	}

}
