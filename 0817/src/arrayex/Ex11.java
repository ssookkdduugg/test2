package arrayex;

public class Ex11 {

	public static void main(String[] args) {
		// 3m 짜리 우물 바닥에 달팽이가 있다. (300cm)
		// 달팽이는 낮동안 55cm 올라올 수 있다. 하지만 날이 지면 잠을 자야한다.
		//자는 동안 3cm 미끄러져 내려온다.
		// 달팽이가 우물 밖으로 나오는데 몇일이 걸릴까요?
		//반복문과 조건물을 이용하여 프로그램 작성 
		
		  int woomul =300;
		   int day = 0;
		   int snail =52;
		   int cm = 0;
		   
		   while(true) {
		      if( cm<=woomul) {
		      
		      woomul -= snail;
		      day++;
		      
		   }else {
		      break;
		   }
		      
		   
		}
		   System.out.println(day);
	
		

	

}
}
