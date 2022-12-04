package object2.interfaces;

public class gamerunner {

	public static void main(String[] args) {
		gamingConsole game = new mario();
		game.up();
		
		chess g = new chess();
		g.down();
	}

}
