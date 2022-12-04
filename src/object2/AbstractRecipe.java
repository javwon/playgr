package object2;

public abstract class AbstractRecipe {
	
	public void execute() {
		getReady();
		dotheDish();
		cleanup();
	}
	abstract void getReady();
	abstract void dotheDish();
	abstract void cleanup();
	
}
