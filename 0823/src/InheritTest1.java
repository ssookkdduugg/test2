import java.lang.ProcessHandle.Info;

class Person{
	int age;
	String name;
	Person(){
		
	}
	
	Person(String name, int age){
		this.name = name;
		this.age = age;
	}
	String info() {
		return "이름:" + name +",나이:"+age;
	}
}
class Student extends Person{
	//기본 생성자 있어야함.
	// 자식이 부모보다 크다. 부모속성 다 가지고 추가로 자기속성도 있어서 
	
	String major; 
	int grade; 
	
	@Override     //부모의 메서드를 다시 재정의 한다. 
	String info() {
		return super.info()+" 전공:"+major+" 학년:"+grade;
	}
	
	Student(String name, int age,String major,int grade){
		super(name,age);
		this.major = major;
		this.grade = grade;
		
	}
	
	Student(){
		
	}
	
	

	
}


public class InheritTest1 {

	public static void main(String[] args) {
		Student stu1 = new Student(); //자식 객체를 통해 부모클래스의 
									//속성과 메소드를 사용할수있다. 
		stu1.name = "열심히";
		stu1.age = 20;
		stu1.major = "산업공학";
		stu1.grade = 2; 
		System.out.println(stu1.info());
		
		Student stu2 = new Student("돈많은",40,"금융",3);
		
		Person per1 = new Person();
		per1.name = "내로남불";
		per1.age = 30; 
//		per1.major = "체육과";
//		per1.grade = 3;      에러. 부모객체는 자식의 속성과 메서드를 사용할수없다. 
		
		System.out.println(per1.info());
		System.out.println(stu2.info());
		
	}

}
