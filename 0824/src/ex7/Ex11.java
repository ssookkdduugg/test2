package ex7;

public class Ex11 {

	public static void main(String[] args) {
		MyTv2 t = new MyTv2();
		t.setChannel(10);
		System.out.println("CH:"+t.getChannel());
		t.setChannel(20);
		System.out.println("CH:"+t.getChannel());
		t.gotoPrevChannel(); //10
		System.out.println("CH:"+t.getChannel());
		t.gotoPrevChannel(); //20
		System.out.println("CH:"+t.getChannel());
	}

}
