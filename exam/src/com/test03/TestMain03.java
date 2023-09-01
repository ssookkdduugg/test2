package com.test03;

import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class TestMain03 {

	public static void main(String[] args) {
		
		//합 계: 29.320
		//평 균: 5.864

		String str = "1.22,4.12,5.93,8.71,9.34"; 
		 //StringTokenizer 이용하여 List에 저장한다.
		 //List에 저장된 데이터의 합과 평균을 구한다.
		
		List<String> list = new ArrayList<>();
		double sum= 0;
		int cnt =0; 
		
		StringTokenizer st = new StringTokenizer(str,",");
		while(st.hasMoreElements()) {
			list.add(st.nextToken());
			cnt++;
		}
		
		for(String ss: list) {
			sum += Double.parseDouble(ss);
			System.out.println(ss);
		}
		System.out.println(String.format("합계: %.3f", sum));
		//System.out.println("cnt:" +cnt);
		System.out.println(String.format("평균: %.3f", sum/cnt));
	}

}
