package object2;

public class customerrunner {

	public static void main(String[] args) {
		Address homeAddress = new Address("line1","Hyderabad","50035");
		Customer customer = new Customer("jang",homeAddress);
		Address workAddress = new Address("line2","dyderabad","60035");
		customer.setWorkaddress(workAddress);
		System.out.println(customer);
		
		
		
	}

}
