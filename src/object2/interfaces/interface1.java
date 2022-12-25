package object2.interfaces;

public class interface1 {

	public static void main(String[] args) {
		tvcr t1 = new tvcr();
		t1.play();
		t1.stop();

	}

}
class Tv{
	protected boolean power;
	protected int channel;
	protected int volume;
	
	Tv(){
		this.power=true;
		this.volume=1;
		this.channel=2;
	}
}

class Vcr {
	void play() {
		System.out.println("hio");
	}
	void stop() {
		System.out.println("stop");
	}
}
interface ivcr{
	abstract void play();
	abstract void stop();
}
class tvcr extends Tv implements ivcr{
	Vcr v1 = new Vcr();
	public void play() {
		v1.play();
	}
	public void stop() {
		v1.stop();
	}
}