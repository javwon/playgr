package object2;

public class Reviews {
	private int id;
	private String description;
	private byte rating;
	
	Reviews(int id, String description, byte rating){
		this.id = id;
		this.description = description;
		this.rating = rating;
		
	}
	public String toString() {
		return String.format(" id - %s, description - %s, rating - %s", this.id,this.description,this.rating);
	}
}
