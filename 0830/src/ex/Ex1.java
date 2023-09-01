package ex;

import java.util.ArrayList;
import java.util.List;

public class Ex1 {
	static void print(List<Integer> list) {
		for(Integer n : list) {
			System.out.println(n);
		}
	}
	public static void main(String[] args) {
//		다음은 정수집합 1,2,3,4와 3,4,5,6의 교집합, 차집합, 합집합을 구하는 코드이
//		다. 코드를 완성하여 실행결과와 같은 결과를 출력하시오.
//		[Hint] ArrayList클래스의 addAll(), removeAll(), retainAll()을 사용하라
		
		ArrayList<Integer> list1 = new ArrayList<>(); //1,2,3,4
		ArrayList<Integer> list2 = new ArrayList<>(); //3,4,5,6
		ArrayList<Integer> kyo = new ArrayList<>(); // 교집합
		ArrayList<Integer> cha = new ArrayList<>(); // 차집합
		ArrayList<Integer> hap = new ArrayList<>(); // 합집합
		list1.add(1);
		list1.add(2);
		list1.add(3);
		list1.add(4);
		
		list2.add(3);
		list2.add(4);
		list2.add(5);
		list2.add(6);
		/*
		 (1) 알맞은 코드를 넣어 완성하시오. */
			//합집합
			hap.addAll(list1);//1,2,3,4
			hap.removeAll(list2);//1,2
			hap.addAll(list2);//1,2,3,4,5,6
			
			//교집합 
			kyo.addAll(list1);//1,2,3,4
			kyo.retainAll(list2);//list2에있는거만 남겨라 //3,4
			
			//차집합
			cha.addAll(list1);
			cha.removeAll(list2);
			
		

	
		System.out.println("list1="+list1);
		System.out.println("list2="+list2);
		System.out.println("kyo="+kyo);
		System.out.println("cha="+cha);
		System.out.println("hap="+hap);
		}
	}


