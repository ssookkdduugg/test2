package ex6;

class Student {
	String name;
	int ban;
	int no;
	int kor, eng, math;

	int getTotal() {
		int result = (kor + eng + math);
		return result;
	}

	float getAverage() {
		float avg = (float)getTotal() / 3;
		//75.545 => Math.round쓰면은 76됨 정수로 바꿔주는거 
		//75.545*10 => 755.45 => Math.round하면은 755나오는
		//다시 100으로 나눔 => 755(round)/10.0 => 75.5
		return Math.round(avg*10)/10.0f;
		
		//78.666664 *10 = 786.66664
		// 라운드하면 787
		//다시 10으로 나누기 787/10 => 78.7
		
	}
	
	String info() {
		return name+","+ban+","+"no"+","+"kor"+"eng"+","+"math"+","+
				getTotal()+","+getAverage();
	}
	
	
}

public class Ex3_4 {
	public static void main(String args[]) {
		Student s = new Student();
		s.name = "홍길동";
		s.ban = 1;
		s.no = 1;
		s.kor = 100;
		s.eng = 60;
		s.math = 76;
		System.out.println("이름:" + s.name);
		System.out.println("총점:" + s.getTotal());
		System.out.println("평균:" + s.getAverage());
		System.out.println(s.info());
	}
}
