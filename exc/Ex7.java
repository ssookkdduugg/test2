package exc;

public class Ex7 {
	public static void main(String[] args) {
		//Math.random()을 이용해서 1부터 6사이의 임이의정수를
		//변수 vlaue에 저장하는 코드를 완성
		//0.0*6 <= Math.random()*6 <1.0*6 
		//0.0 <= Math.random()*6 < 6.0
		//0+1 <= (int)(Math.random()*6)+1 < 6.0+1
		
		
		int value =(int)(Math.random()*6)+1;
		System.out.println("value:" +value);
		
	}

}
