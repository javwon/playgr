package object2;

public class Customer {
	private String name;
	private Address homeaddress;
	private Address workaddress;
	
	 Customer(String name, Address homeaddres){
		this.name = name;
		this.homeaddress = homeaddres;
	}

	public Address getHomeaddress() {
		return homeaddress;
	}

	public void setHomeaddress(Address homeaddress) {
		this.homeaddress = homeaddress;
	}

	public Address getWorkaddress() {
		return workaddress;
	}

	public void setWorkaddress(Address workaddress) {
		this.workaddress = workaddress;
	}
	
	public String toString() {
		return String.format("name - [%s], homeaddress - [%s], workaddress - [%s]", this.name,this.homeaddress,this.workaddress);
	}
	//toString 메서드는 참조변수(클래스)들이 String의 전달인자로 사용될때 반응하는 친구들임! 혹은 String에 값 넣어줄때.
	//포함관계일대 toString 적용
		
}
