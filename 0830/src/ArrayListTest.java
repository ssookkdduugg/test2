import java.util.ArrayList;

class Person implements Comparable<Person>{
	String name;
	int age;
	Person(){}
	Person(String name, int age){
		this.name= name;
		this.age  = age;
	}
	
	@Override
	public String toString() {
		return "("+name + "," +age+")";
	}
	
	@Override
	public int compareTo(Person o) {
		//return  age-o.age;
		return name.compareTo(o.name);
		
	}
	
	@Override
	public int hashCode() {
		return name.hashCode() + age ;
	}
	
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Person ==false)return false;
		Person p = (Person)obj;
		return name.equals(p.name) && age==p.age;
	}
	
	
}


public class ArrayListTest {

	public static void main(String[] args) {
		ArrayList al = new ArrayList();
		al.add(100); 
		int n = (Integer)al.get(0);
		
		
		Integer in = 200; 
		int in2  = in; 
		
		ArrayList al2 = new ArrayList();
		al2.add(new Person());  //arraylist안에 새로운 객체생성해도 object 클래스로 되기에
		Person p = (Person)al.get(0); //매번 다운캐스팅해야한다. 
		
		ArrayList<Person> al3 = new ArrayList<>(); //그래서 제네릭하게 써라 
		                                        //object타입말고 <> 안에 타입클래스 쓰기 
		al3.add(new Person());
		Person p2 = al3.get(0);
		
		
		
		
	}

}
