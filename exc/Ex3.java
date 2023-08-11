package exc;

public class Ex3 {

	public static void main(String[] args) {
		// 1+(1+2)+(1+2+3)+(1+2+3+4)...(1+2+3+...10)의 결과를 계산하세요. 
		
		int sum = 0;
		for(int i=1; i<=10; i++) {
			for(int j=1;j<=i; j++) { //1일때 1, 2일때 1,2 3일떄 1,2,3
				//sum += j;
				System.out.print("*");
			}
			System.out.println();
		}
		//System.out.println(sum);

	}

}
