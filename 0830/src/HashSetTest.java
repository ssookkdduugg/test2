import java.util.Arrays;
import java.util.HashSet;

public class HashSetTest {//중복허용 x, 순서유지 x
	public static void main(String[] args) {
		HashSet<Integer> hs = new HashSet<>();
		hs.add(234);
		hs.add(14);
		hs.add(45);
		hs.add(8);
		hs.add(11);
		hs.add(45); //중복 데이터 안들어감 
		for(Integer n: hs) {
			System.out.println(n);
		}
		
		HashSet<Person> ahs = new HashSet<>();
		ahs.add(new Person("홍길동",23));
		ahs.add(new Person("홍길동",30));
		ahs.add(new Person("고길동",33));
		ahs.add(new Person("하길동",40));
		ahs.add(new Person("고길동",33));
		
		for(Person p : ahs) {
			System.out.println(p);
		}
		
	}

}
