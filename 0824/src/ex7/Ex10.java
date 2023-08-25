package ex7;

class MyTv2 {
	private boolean isPowerOn;
	private int channel;
	private int volume;
	private int prevChaanel=0;
	
	
	public boolean isPowerOn() {
		return isPowerOn;
	}
	public void setPowerOn(boolean isPowerOn) {
		this.isPowerOn = isPowerOn;
	}
	public int getChannel() {
		return channel;
	}
	public void setChannel(int channel) {
		prevChaanel = this.channel; //이전채널에 현재채널보관
		this.channel = channel; //채널 재설정
	}
	public int getVolume() {
		return volume;
	}
	public void setVolume(int volume) {
		this.volume = volume;
	}
	
	
	final int MAX_VOLUME = 100;
	final int MIN_VOLUME = 0;
	final int MAX_CHANNEL = 100;
	final int MIN_CHANNEL = 1;
	
	void gotoPrevChannel() {
		int tmepChannel = this.channel;
		this.channel = prevChaanel; 
		prevChaanel = tmepChannel;
	}
	
	
	
}

public class Ex10 {
	public static void main(String args[]) {
		MyTv2 t = new MyTv2();
		t.setChannel(10);
		System.out.println("CH:" + t.getChannel());
		t.setVolume(20);
		System.out.println("VOL:" + t.getVolume());
	}

}
