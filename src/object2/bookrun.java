package object2;

public class bookrun {

	public static void main(String[] args) {
		Book book = new Book(123,"Object","ranga");
		book.addReview(new Reviews(10,"great book",(byte)5));
		book.addReview(new Reviews(101,"awesome",(byte)5));
		System.out.println(book);
		book.addReview(new Reviews(1000,"jangwon",(byte)100));
		System.out.println(book);
	}

}
