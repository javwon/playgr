package object2.interfaces;

public class Abstract_1 {

	public static void main(String[] args) {
		Cdplayer p1 = new Cdplayer();
		p1.play(1);
		Unit[] u1 = {new Marine(),new Tank()};
		u1[0].move(1, 2);
		u1[1].move(2, 3);
		
	}

}

abstract class Player{
	boolean pause;
	int currentPos;
	Player(){
		this.pause=false;
		this.currentPos=0;
	}
//	abstract void play (int pos);
	abstract void stop();
	void play(int pos) {
	System.out.println("부모 play");
//		play(currentPos);
	}
	void pause() {
		if(pause) {
			pause = false;
//			play(currentPos);
		}
		else {
			pause=true;
			stop();
		}
	}
}
class Cdplayer extends Player{
	void play(int currentPos) {
		System.out.println("자손 play"+currentPos);
	}
	void stop() {
		System.out.println("stop");
	}
	int currentTrack;
	void nextTrack() {
		this.currentTrack++;
	}
}
abstract class Unit{
	int x,y;
	abstract void move(int x, int y);
	void stop() {};
}
class Marine extends Unit{
	void move(int x, int y) {System.out.println("마린"+x+y+"위치");}
	
}
class Tank extends Unit{
	void move(int x, int y) {System.out.println("탱크"+x+y+"위치");}
}