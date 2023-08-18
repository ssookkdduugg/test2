package arrayex;

import java.util.Scanner;

public class ArrayTest12 {

	public static void main(String[] args) {
		// 100 미만의 양의정수들이 있다.
		// 입력받다가 0이 입력되면 마지막에 입력된 0을 제외하고
		// 그때까지 입력된 정수의 십의자리 숫자가 각각 몇개인지
		// 작은 수 부터 출력하는 프로그램을 작성하시오 (0개인 숫자는 출력하지않음)
		// 입력: 10 55 3 63 85 61 85 0
		// 출력:
		// 0: 1
		// 1: 1
		// 5: 1
		// 6: 2
		// 8: 2

		
		Scanner sc = new Scanner(System.in);
		int[] cnt = new int[10];
		
	
		while(true) {
			int input = sc.nextInt();
			if(input==0) break;
			cnt[input/10]++;  //cnt[0]자리에 0들어가고
		}
		
		for(int i=0; i<cnt.length;i++) {
			if(cnt[i]>0) {
				System.out.println(String.format("%d,%d",i,cnt[i]));
			}
		}
	}

}
