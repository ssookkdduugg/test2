
public class ContinueTest1 {
	public static void main(String[] args) {
		int sum = 0;
//		for(int i=1; i<=100; i++) {
//			if( i%2 == 0) sum +=i;
//		}
		
		for(int i=1; i<=100; i++) {
			if( i%2!=0) continue; //홀수면은 다시 증감식으로 가기 
			sum += i;
		}
		System.out.println(sum);
	}

}
