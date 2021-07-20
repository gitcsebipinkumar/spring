package service;

public class UserIdentity {

   //private fields 
	private String name ;
	private int age ;
	private String email;
	private String address;
	
	// overloaded constructors 
	public UserIdentity(int age) {
		this.age = age;
	}



	public UserIdentity(String name) {
		this.name = name;
	}



	public UserIdentity(String name, int age) {
		this.name = name;
		this.age = age;
	}



	public UserIdentity(String name, int age, String email, String address) {
		this.name = name;
		this.age = age;
		this.email = email;
		this.address = address;
	}
	
	public UserIdentity() {
		System.out.println("Default constructor : UserIdentity");
	}
	
	public void printDataValue() {
		
		System.out.println("Name is : " + name );
		System.out.println("Age is : " + age);
		System.out.println("email is : " + email);
		System.out.println("address is : " + address);
		
	}



	

}
