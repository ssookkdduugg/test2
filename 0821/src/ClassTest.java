
public class ClassTest {

	public static void main(String[] args) {
		Student2 stu1 = new Student2();
		
		stu1.name = "홍길동";
		stu1.address = "서울시 금천구";
		stu1.grade = 4;
		stu1.num = 10001;
		
//		System.out.println(String.format("이름:%s, 주소:%s,"
//				+ "학년:%d, 학번:%d",stu1.name,stu1.address,
//				stu1.grade, stu1.num));
		
		System.out.println(stu1.info());
		
		
		
	}
}
