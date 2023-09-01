import java.util.Comparator;
import java.util.SortedSet;
import java.util.TreeSet;

public class TreeSetTest1 {
	public static void main(String[] args) {//integer자체는 comparable자동 implement되어있음
		TreeSet<Person> ts = new TreeSet<>(new Comparator<Person>() {

			@Override
			public int compare(Person o1, Person o2) {
				return o1.age-o2.age;
			}
			
			
		});
		ts.add(new Person("hong",20));
		ts.add(new Person("song",10));
		ts.add(new Person("gong",50));
		ts.add(new Person("aong",60));
		ts.add(new Person("tong",30));
		ts.add(new Person("hong",20));
		ts.add(new Person("pong",40));
		
		System.out.println(ts);
		
		
		SortedSet<Person> subList = ts.subSet(new Person("",20), new Person("",60));
		System.out.println(subList);
	}

}
