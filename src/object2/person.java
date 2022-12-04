package object2;

public class person {
	private String name;
	private String email;
	private String phonenumber;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPhonenumber() {
		return phonenumber;
	}
	public void setPhonenumber(String phonenumber) {
		this.phonenumber = phonenumber;
	}
}
class ppp extends per{
	
	public void bark() {
		System.out.println("hi");
	}
	public int harsh() {return 0;}
}