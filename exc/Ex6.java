package exc;

public class Ex6 {

	public static void main(String[] args) {
		//2개의 주사위를 던졌을때, 눈의 합이 6이 되는 경우의 수를 출력하는 프로그램 
		int sum = 0;
		for(int i=1; i<=6; i++) {
			for(int j=1; j<=6; j++) {
				if(i+j==6) {
					System.out.println(String.format("(%d,%d)",i,j));
					//System.out.println(i,j);
					//변수 2개있을때는 String.format형태로 쓰기 
					
					
				}
			}
		}

	}

}
