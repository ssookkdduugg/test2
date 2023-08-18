package arrayex;

public class Ex11_1 {

	public static void main(String[] args) {
		// 3m 짜리 우물 바닥에 달팽이가 있다. (300cm)
				// 달팽이는 낮동안 55cm 올라올 수 있다. 하지만 날이 지면 잠을 자야한다.
				//자는 동안 3cm 미끄러져 내려온다.
				// 달팽이가 우물 밖으로 나오는데 몇일이 걸릴까요?
				//반복문과 조건물을 이용하여 프로그램 작성 
		
		int depth = 3*100, height = 0;
		final int up = 55;
		final int down = 3;
		int days= 1; 
		
		while(true) {
			height+=up;
			if(depth<=height) break; 
			days++;
			height -= down;
		}
		System.out.println(days);
	}

}
