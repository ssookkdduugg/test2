class Person{
	String name;
	int age;
	
	String info() {
		return String.format("이름은:%s, 나이는:%d세입니다.",name,age);
	}
}

public class ClassTest2 {
	public static void main(String[] args) {
		Person per = new Person();
		per.name = "황서아";
		per.age = 30;
		
		System.out.println(per.info());
		
		Person[] parr = new Person[5]; //클래스 배열의 구조 
		// 자리가 5개인 parr 클래스배열이 생성된것.
		//밑에처럼 해줘야지 객체 5개 생성된거임. 
		parr[0] = new Person();
		parr[1] = new Person();
		parr[2] = new Person();
		parr[3] = new Person();
		parr[4] = new Person();
		

	}

}
