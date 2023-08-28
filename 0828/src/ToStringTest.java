class Person{
	String name; 
	int age;
	Person(String name, int age){
		this.name = name;
		this.age = age;
	}
	@Override
	public String toString() {
		return "이름:"+name+",나이:"+age;
	}
//	public String info() {
//		return "이름:"+name+",나이:"+age;
//	}
	
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Person == false) return false;
		Person p = (Person)obj; 
		return name.equals(p.name) && age == p.age;
	}
}


public class ToStringTest {
	public static void main(String[] args) {
		Person p1 = new Person("hong", 30);
		Person p2 = new Person("hong", 30);
		System.out.println(p1==p2);//false
		System.out.println(p1.equals(p2)); //true
		
//		String str = "!!!"+p;
//		//System.out.println(p.info());
//		//System.out.println(p); //toString은 . 해서 메소드 안불러와도 된다.
//		System.out.println(str);
	}

}
