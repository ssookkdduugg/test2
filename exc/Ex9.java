package exc;

public class Ex9 {

	public static void main(String[] args) {
		//숫자로 이루어진 문자열 str이 있을 때, 각 자리의 합을 더한 결과를 출력하는 코
		//드를 완성하라. 만일 문자열이 "12345"라면, ‘1+2+3+4+5’의 결과인 15를 출력이 출력되
		//어야 한다. (1)에 알맞은 코드를 넣으시오
		//특정 char를 숫자로 바꾸는방법 아스키코드값 - '0'
		
		String str = "12345";
		int sum = 0;
		for(int i=0; i < str.length(); i++) {
//			char ch = str.charAt(i);
//			sum += ch-'0'; 
			sum += str.charAt(i)-'0'; //'0'의 아스키 코드값 48
		}
		System.out.println("sum="+sum); //sum=15

	}

}
