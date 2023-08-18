package arrayex;

import java.util.Scanner;

public class ArrayTest16 {

	public static void main(String[] args) {
		/*
		 * 배열의 크기도 내가 잡아주는거 아님 입력값대로 잡아주기 입력 데이 터 수 : 5
		 *   95 100 85 77 60 
		 *  
		 *  출력
		 *  최소값:60
		 *  최대값:100
		 */
		
		Scanner sc = new Scanner(System.in);
		System.out.print("입력데이터수:");
		int cnt = sc.nextInt();
		int[] arr = new int[cnt];
		
		for(int i=0;i<arr.length;i++) {
			arr[i] = sc.nextInt();
		}
		
		
		
		int min = arr[0];
		int max = arr[0];
		
		for(int i=1;i<arr.length;i++) {
			if(arr[i]<min) min=arr[i];
			if(arr[i]>max) max=arr[i];
		}
		
		System.out.println("최솟값: " + min);
		System.out.println("최대값: " + max);

	}

}
