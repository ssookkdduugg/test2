package arrayex;

public class Ex8 {

	public static void main(String[] args) {
//		다음은 배열 answer에 담긴 데이터를읽고 각 숫자의 개수를 세어서 개수만큼 ‘*’
//		서 그래프를 그리는 프로그램이다. (1)~(2)에 알맞은 코드를 넣어서 완성하시오
		int[] answer = { 1,4,4,3,1,4,4,2,1,3,2 };
		int[] counter = new int[4];
		int cnt = 0;
		for(int i=0; i < answer.length;i++) {
		/* (1) 알맞은 코드를 넣어 완성하시오. */
//			if(answer[i]==1) counter[0]++;
//			else if(answer[i]==2) counter[1]++;
//			else if(answer[i]==3) counter[2]++;
//			else if(answer[i]==4) counter[3]++;
			counter[answer[i]-1]++;
				
		}
		for(int i=0; i < counter.length;i++) {
			System.out.print(counter[i]);
			for(int j=0; j<counter[i]; j++) {
				System.out.print("*");
			}
			
			
		System.out.println();
		}
		
		
	}

}
