
class Person{
	int age;
	String name;
	Person() {
		this("none",0); //생성자에서 다른 생성자 호출, 
						//반드시 생성자 맨 처음에 호출해야함.
	}
	// 기본생성자 자동으로 만들어지는데, 밑에처럼 파라미터 있는 생성자 만들면
	// 기본생성자 사라진다.
	
	Person(String n,int a){
		age = a;
		name = n;
	}
	
	Person(String n){
		this(n,0);
//		name = n;
//		age = 0; 
	}
	
	Person(int a){
		this("none",a);
//		age = a; 
//		name = "none";
	}
	
	Person(Person p){ //복사 생성자 
		name = p.name;
		age = p.age; 
	}
	
//	String info(Person this) {
//		return "이름:"+"name"+"나이:"+age;
//	}
	String info() {
	return "이름:"+this.name+"나이:"+this.age;
}
}


public class ConstructorTest1 {

	public static void main(String[] args) {
		Person per1 = new Person("홍길동",20);
		per1.info(); // Person.info(per1)
		Person per2 = new Person();
		per2.name ="고길동";
		per2.age=30;
		per2.info(); //Person.info(per2)
		Person per3 = new Person("차길동");
		Person per4 = new Person(40);
		Person per5 = new Person(per1);
		
		
		
		

	}

}
