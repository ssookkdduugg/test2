package item;

public class Unit {
	int healthPoint;
	final int MAX_HP;
	//final int MAX_HP=60; 이렇게 초기화못하는게 다른클래스들이 상속받아서 
	//쓰면서 종족당 맥스힘을 다르게 줄려고 그래서 생성자 만들기 
	
	Unit(int hp){
		MAX_HP = hp;
		healthPoint = MAX_HP;
	}
	
}
