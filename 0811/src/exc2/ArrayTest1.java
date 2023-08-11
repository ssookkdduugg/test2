package exc2;

public class ArrayTest1 {

	public static void main(String[] args) {
		// 1. arr[3].length의 길이
		int[][] arr = { { 5, 5, 5, 5, 5 }, { 10, 10, 10 }, { 20, 20, 20, 20 }, { 30, 30 } };

		System.out.println(arr[3].length); // 2

		// 2. 배열 arr에 담긴 모든 값을 더하는 프로그램을 완성하시오.

		int[] arr2 = { 10, 20, 30, 40, 50 };
		int sum = 0;
		for (int i = 0; i < arr2.length; i++) {
			sum += arr2[i];
		}

		System.out.println("sum=" + sum); // 150

		// 3. 2차원 배열 arr3에 담긴 모든 값의 총합과 평균을 구하는 프로그램을 완성하시오.
		int[][] arr3 = { { 5, 5, 5, 5, 5 }, { 10, 10, 10, 10, 10 }, { 20, 20, 20, 20, 20 }, { 30, 30, 30, 30, 30 } };
		int total = 0;
		float average = 0;

		for (int i = 0; i < arr3.length; i++) {
			for (int j = 0; j < arr3[i].length; j++) {
				total += arr3[i][j];
			}

		}

		System.out.println("total=" + total);
		System.out.println("average=" + (double) total / (arr3.length * arr3[0].length));
		// arr3[0].length 가 열의개수가됨.
		// arr3.length * arr3[0].length 는 토탈 배열안에 몇개 있는지

		// 4. 다음은 1과 9사이의 중복되지 않은 숫자로 이루어진 3자리 숫자를 만들어내는 프
		// 로그램이다. (1)~(2)에 알맞은 코드를 넣어서 프로그램을 완성하시오.
		int[] ballArr = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
		int[] ball3 = new int[3];

		// 배열 ballArr의 임의의 요소 2개를 골라서 위치를 바꾼다. 20번 반복
		for (int x = 0; x < 20; x++) {
			int i = (int) (Math.random() * ballArr.length);
			int j = (int) (Math.random() * ballArr.length);
			int tmp = 0;

			tmp = ballArr[i]; // 스와핑 자리 값 바꿔주는거
			ballArr[i] = ballArr[j];
			ballArr[j] = tmp;

		}
		// 배열 ballArr의 앞에서 3개의 수를 배열 ball3로 복사한다.

		for (int i = 0; i < ball3.length; i++) {
			ball3[i] = ballArr[i];
		}
		for (int i = 0; i < ball3.length; i++) {
			System.out.print(ball3[i]);
		}

//		5. 다음은 거스름돈을 몇 개의 동전으로 지불할 수 있는지를 계산하는 문제이다. 변
//		수 money의 금액을 동전으로 바꾸었을 때 각각 몇 개의 동전이 필요한지 계산해서 출력하
//		라. 단, 가능한 한 적은 수의 동전으로 거슬러 주어야한다. (1)에 알맞은 코드를 넣어서 
//		프로그램을 완성하시오

		// 큰 금액의 동전을 우선적으로 거슬러 줘야한다.
		int[] coinUnit = { 500, 100, 50, 10 };
		int money = 2680;
		int coin = 0;
		
		System.out.println("money=" + money);
		for (int i = 0; i < coinUnit.length; i++) {
		coin = (money/coinUnit[i]);
		money -= (coin*coinUnit[i]);
			System.out.println(coinUnit[i]+"원:" + coin);
			
			
			
		
		}

	}
}
