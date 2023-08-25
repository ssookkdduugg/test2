class Car{
	String color;
	int door;
	void drive() {
		System.out.println("drive, Brrrr!");
	}
	
	void stop() {
		System.out.println("stop!!");
	}
}

class FireEngine extends Car{
	void water() {
		System.out.println("Water!!!");
	}
}

class Ambulance extends Car{
	void siren() {
		System.out.println("siren~~~~");
	}
}




public class PolinoTest4 {
	public static void main(String[] args) {
	FireEngine fe = new FireEngine();
	fe.water();
	
	Car car = fe; //fireEngine타입을 Car타입에 넣은거 가능
	//car FireEngine()를 가리킴
	//car.water(); 에러 부모클래스에담으면 오버라이드 안해서 자식메소드 호출불가  
	
	if( car instanceof FireEngine) {
		FireEngine fe2 = (FireEngine)car; //downcasting 
		fe2.water();
	}
	}

}
