package ex;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Stack;
import java.util.TreeSet;

public class Ex2 {
	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<>();
		list.add(3);
		list.add(6);
		list.add(2);
		list.add(2);
		list.add(2);
		list.add(7);
		
		//HashSet 중복제거하면, 3,6,2,7남음 
		HashSet<Integer> set = new HashSet<>(list);
		//TreeSet  정렬 2,3,6,7
		TreeSet<Integer> tset = new TreeSet<>(set);
		//Stack 내림차순 7,6,3,2
		Stack<Integer> stack = new Stack<>();
		stack.addAll(tset);
		while(!stack.empty())
		System.out.println(stack.pop());
		}

}
