package exc;

public class Ex15 {

	public static void main(String[] args) {
//		다음은 회문수를 구하는 프로그램이다. 회문수(palindrome)란, 숫자를 거꾸로 읽
//		어도 앞으로 읽는 것과 같은 수를 말한다. 예를 들면 ‘12321’이나 ‘13531’같은 수를 말한
//		다. (1)에 알맞은 코드를 넣어서 프로그램을 완성하시오.

		int number = 12321;
		int tmp = number;
		int result = 0; // 변수 number를 거꾸로 변환해서 담을 변수

		// 1*10(0)+ 2*10(1)+ 3*10(2) + 2*10(3)+ 1*10(4)
		// = 1+20+300+2000+10000
		// 12321

		int sq = 0;
		while (tmp != 0) {
			result += tmp%10*(int)(Math.pow(10, sq));
			tmp /= 10;
			sq++;
		}
	
		if (number == result)
			System.out.println(number + "는 회문수 입니다.");
		else
			System.out.println(number + "는 회문수가 아닙니다.");

	}

}
