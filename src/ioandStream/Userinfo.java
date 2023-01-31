package ioandStream;

public class Userinfo implements java.io.Serializable{
	String name;
	String password;
	int age;
	
	public Userinfo() {
		this("unknown","1111",0);
	}
	public Userinfo(String name,String password,int age) {
		this.name = name;
		this.password = password;
		this.age = age;
	}
	public String toString() {
		return "("+name+","+password+","+age+")";
	}
	
}
