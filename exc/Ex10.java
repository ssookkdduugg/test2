package exc;

public class Ex10 {

	public static void main(String[] args) {
		// int 타입의 변수 num 이 있을 때, 각 자리의 합을 더한 결과를 출력하는 코드를 
		int num = 12345;
		int sum = 0;
		//String snum = num + ""; //숫자가 문자열로 바뀜.
		
//		sum += num%10; //5
//		num /= 10; //1234
//		sum  += num%10; //4
//		num /= 10; //123
//		sum += num%10; //3
//		num /= 10; //12
//		sum += num%10; //2
//		num /= 10; //1
//		sum += num%10; //1
//		num /= 10; //0
//		
		
		while(true) {
			if(num ==0) break;
			sum += num%10; 
			num /= 10; 
		}
		
				
		
		System.out.println("sum="+sum);
	}

}
