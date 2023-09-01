package com.test01;

import java.lang.reflect.Array;

public class TestMain01 {
	
	static int avg(int[][] arr) { //평균
		int sum =0;
		int cnt = 0;
		
		for(int i=0; i<arr.length;i++) {
			for(int j=0; j<arr[i].length;j++) {
				 sum += arr[i][j];
			}
			cnt += arr[i].length;
		}
		return sum;
		
	}
	
	public static void main(String[] args) {
		int[][] array = { { 12, 41, 36, 56, 21 },
						{ 82, 10, 12, 61, 45 }, 
						{ 14, 16, 18, 78, 65 },
						{ 45, 26, 72, 23, 34 }, };
		
		double total = (double)avg(array);
		System.out.println("합계:"+ total);
		System.out.println("평균:");
	}

}
