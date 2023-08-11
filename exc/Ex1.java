package exc;

public class Ex1 {

	public static void main(String[] args) {
		//1. int형 변수 x가 10보다 크고 20보다 작을때 true조건식
		
		int x = 10;
		if(x>10 && x<20) {}
		
		//2. char형 변수 ch가 공백이나 탭이 아닐때 true인조건식
		char ch = 'A';
		if(ch!=' ' && ch!='\t') {}
		
		//3. char형 변수 ch가 'x' 또는 'X'일때 true인 조건식 
		if(ch=='x' || ch=='X') {}
		
		//4. char형 변수 ch가 숫자 ('0'~'9'일때) true인 조건식 
		if(ch>='0' &&  ch<='9') {}
		
		//5. char형 변수 ch가 영문자(대문자 또는 소문자)일때 true인 조건식 
		if(ch>='A' && ch<='Z' || ch>='a' && ch<= 'z') {}
		
		//6. int형 변수 year가 400으로 나눠떨어지거나 또는 4로 나눠떨어지고
		// 100으로 나눠떨어지지 않을때 true인 조건식 
		int year = 2023;
		if(year%400==0 || year%4==0 && year%100!=0) {}
		
		//7. boolean 변수 powerOn가 false일때 true인조건식
		boolean powerOn = false;
		if(!powerOn) {}
		
		//8. 문자열 참조변수 str이 "yes"일때 true인 조건식
		// 문자열 비교는 .equals 로 
		String str = "no";
		if(str.equals("yes")) {} 
		
		
		
		

	}

}
