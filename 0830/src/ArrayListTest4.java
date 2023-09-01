import java.util.ArrayList;
import java.util.List;

public class ArrayListTest4 {
	static void print(List<Integer> list) {
		for(Integer n: list) {
			System.out.print(n+",");
		}
		System.out.println();
	}
	public static void main(String[] args) {
		ArrayList<Integer> list1 = new ArrayList<>(10);
		list1.add(5);
		list1.add(4);
		list1.add(2);
		list1.add(0);
		list1.add(1);
		list1.add(3);
		
		List<Integer> list2 = list1.subList(1, 4);
		print(list1);
		print(list2);
		System.out.println(list1.containsAll(list2));
		System.out.println("======================");
		list1.retainAll(list2); //list1에서 list2만 남기고 다 삭제하기 
		print(list1);
		list1.add(0,6); //0번째 자리에 6을 넣기 
		print(list1);
		System.out.println("======================");
		list1.set(0, 7); //0번째 자리에있는 값을 7로 바꾸기 set 
		print(list1);
		list1.add(7);
		print(list1);
		list1.remove(new Integer(7)); //앞에 7만 지워짐 (특정데이터 앞에것만 삭제)
		print(list1);
		
		
	}

}
