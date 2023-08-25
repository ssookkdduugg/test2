package ex7;

abstract class Unit{
	 int x; //현재위치
	 int y; 
	abstract void move(int x, int y);

	void stop() {
		//현재위치에 멈춘다. 
	}
}

class Marine extends Unit{ //보병 
	void move(int x, int y) {}
	
	void stimPack() {
		
	}

}

class Tank extends Unit{ //탱크
	void move(int x, int y) {}
	
	void changeMode() {
		
	}
}


class Dropship{ //수송선
	 void move(int x, int y) {}
	 void load() { } //선택된 대상을 태운다.
	 void unload() { } 
	
}



public class Ex17 {
	public static void main(String[] args) {

	}
}
