
public class ContinueTest2 {

	public static void main(String[] args) {
		int sum = 0; 
		for( int i =1; i<=100; i++) {
			if(i%4==0 || i%7==0) continue; //4의배수이거나 7의배수이면은 continue
											// 4,7의배수들은 sum 하지 않는다.
			sum += i;
		}
		System.out.println(sum);

	}

}
