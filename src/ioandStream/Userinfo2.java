package ioandStream;
import java.io.*;
class SuperUserinfo{
	String name;
	String password;
	
	SuperUserinfo(){
		this("unknown","1111");
	}
	SuperUserinfo(String name, String password){
		this.name = name;
		this.password = password;
	}
	
	
}



public class Userinfo2 extends SuperUserinfo implements java.io.Serializable {
int age;
public Userinfo2() {
	this("unknown","1111",0);
	
}
public Userinfo2(String name, String password, int age) {
	super(name,password);
	this.age=age;
	
}

public String toString() {
	return "("+name+","+password+","+age+")";
}

private void writeObject(ObjectOutputStream out) 
	throws IOException{
		out.writeUTF(name);
		out.writeUTF(password);
		out.defaultWriteObject();
	}

private void readObject(ObjectInputStream in) throws IOException, ClassNotFoundException 
	{	name = in.readUTF();
		password = in.readUTF();
		in.defaultReadObject();
	
}
}
