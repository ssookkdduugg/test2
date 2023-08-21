class Tv{ //클래스 내 속성(power, channel, size)는 
	// 클래스 내 메소드들이 공유한다. 
	
	boolean power;
	int channel;
	int size = 50;
	
	void onOff() {
		power = !power;
	}
	
	void channelUp() {
		channel ++;
	}
	
	void channelDown() {
		channel--;
	}
	
	String info() {
		return String.format("size:%d, channel:%d, power:%s",size,channel,
				(power)?"on":"off");
	}

}

public class ClassTest3 {

	public static void main(String[] args) {
		Tv tv = new Tv();
		System.out.println(tv.info());
		tv.onOff();
		System.out.println(tv.info());
		tv.channelUp();
		tv.channelUp();
		System.out.println(tv.info());
		tv.channelDown();
		System.out.println(tv.info());
	}

}
