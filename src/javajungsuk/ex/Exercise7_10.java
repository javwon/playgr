package javajungsuk.ex;

public class Exercise7_10 {

	public static void main(String[] args) {
		MyTv2 t = new MyTv2();
		
		t.setChannel(10);
		System.out.println(t.getChannel());
		t.setChannel(20);
		System.out.println(t.getChannel());
		t.gotoPrevChannel();
		System.out.println(t.getChannel());
		t.gotoPrevChannel();
		System.out.println(t.getChannel());
		
		
	}

}

class MyTv2{
	private boolean isPowerOn;
	private int channel;
	private int volume;
	private int prevchannel;
	
	final int MAX_VOLUME =100;
	final int MIN_VOLUME = 0;
	final int MAX_CHANNEL =100;
	final int MIN_CHANNEL =1;
	
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
		prevchannel = this.channel; //순서만 바꿔주면된다.
		this.channel = channel;
		
	}
	public int getVolume() {
		return volume;
	}
	public void setVolume(int volume) {
		this.volume = volume;
	}
	public void gotoPrevChannel() {
		
		setChannel(prevchannel);
	}

	
}
