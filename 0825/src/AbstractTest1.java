abstract class Player {
	int currentPos;

	public Player() {
		currentPos = 0;
	}

	abstract void play(int pos);

	abstract void stop();

	void play() {
		play(currentPos); //안에가 자식메소드 
	}
}

//abstract class를 상속받으면 
// abstract method를 반드시 오버라이드 하거나, 메소드를 구현하지않으면, 
//상속받은 자식클래스도 abstract여야한다. 
class DPlayer extends Player {

	@Override
	void play(int pos) {
		System.out.println("DPlayer play(int pos)");
	}

	@Override
	void stop() {
		System.out.println("Dplayer stop()");
	}

}

public class AbstractTest1 {
	public static void main(String[] args) {
		// Player player = new Player(); //추상클래스는 객체 생성불가능
		
		DPlayer dPlayer = new DPlayer();
		dPlayer.play(10);
		dPlayer.stop();
		
		Player player = new DPlayer(); // upcasting 자식객체 부모변수에담기
		player.play(); //자식 메소드 호출됨. 
		
		
		
		
		
		
		
		
		
	}
}
