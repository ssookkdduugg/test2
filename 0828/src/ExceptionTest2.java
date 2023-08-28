
public class ExceptionTest2 {
	public static void main(String[] args) {
		int[] arr1 = { 10, 20, 30, 40, 50 };
		int[] arr2 = { 2, 4, 6, 0, 10 };
		int tot = 0;
		int cnt = arr1.length;
		

		for (int i = 0; i < arr1.length; i++) {
			try {
				tot += arr1[i] / arr2[i];
			} 
			catch (ArithmeticException e) {
				cnt--;
			} catch (ArrayIndexOutOfBoundsException e) {
				cnt--;
			}catch (Exception e) { //상속관계가 큰예외는 맨마지막에 			
			}
		}
		System.out.println(tot);
		System.out.println(tot / (double) cnt);
		System.out.println("프로그램 종료");
	}
}