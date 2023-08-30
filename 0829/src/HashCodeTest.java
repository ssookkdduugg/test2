import java.util.HashSet;

class Person{
	String name;
	int age;
	Person(String name,int age){
		this.name = name;
		this.age = age;
	}
	
	@Override
	public int hashCode() {
		return name.hashCode() + age; //int는 hashcode 안붙여도됨.
	}
	
	@Override
	public String toString() {
		
		return name + age;
	}
	
	@Override
	public boolean equals(Object obj) {
		if( obj instanceof Person ==false) return false;
		Person p = (Person)obj;
		return name.equals(p.name) && age == p.age;
	}
}


public class HashCodeTest {
	public static void main(String[] args) {
		String str1 = "hong";
		String str2 = "hong";
//		System.out.println(str1.hashCode());
//		System.out.println(str2.hashCode());
		
		Person p1 = new Person("hong", 23);
		Person p2 = new Person("hong", 23);
//		System.out.println(p1.hashCode()); //3208471
//		System.out.println(p2.hashCode()); //3208471
		
		
//		
		System.out.println(p1.equals(p2));//equals 오버라이드 해줘서 
										//true 나오고 내용이 같아서 hong23 
								// 동일한데이터 안나오고 한번만 나옴.
		
		
		HashSet hs = new HashSet(); //Set은 동일한 데이터가 안들어간다.
		//hs.add(10);
		//hs.add(10);
		//hs.add(20);
		
		hs.add(p1);
		hs.add(p2);
		for(Object o : hs) {
			System.out.println(o);
		}
		
		//동일한 데이터를 넣으면은 10 하나만출력됨. 집합형태
		//hs.add(10), hs.add(20) 하면 10,20 둘 다 나옴. 
		
		
		//객체 데이터내용이 같은지 확인하려면은 hashcode()랑 equals() 둘다 오버라이드 
	}
	

}
