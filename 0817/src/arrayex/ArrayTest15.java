package arrayex;

import java.util.Scanner;

public class ArrayTest15 {
	/*
	 * 배열의 크기도 내가 잡아주는거 아님 입력값대로 잡아주기 입력 데이 터 수 : 5
	 *   95 100 85 77 60 
	 *  출력 60 75 85 95 100
	 * 
	 * 
	 * 
	 */
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("입력 데이터 수>");
		int cnt = sc.nextInt();
		int[] arr = new int[cnt];
		
		
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		
		for (int i = 0; i < arr.length-1; i++) {
			for (int j = 0; j < arr.length-1-i; j++) {
				int tmp;
				if(arr[j]>arr[j+1]) { //내림차순할때 부등호만 바꾸기 < 
					tmp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=tmp;
				}
				
			}
		}
		
//		0번째때 , 4-0=4번 비교해주기 
//		1번째때,  4-1 = 3번 비교해주기
//		2번째때, 4-2 = 2번 비교해주기 
//		3번째때, 4-3 = 1번 비교해주기 
		
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i] +",");
		}
		
		
	}

}
