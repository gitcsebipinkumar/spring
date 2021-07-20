package service;

import org.springframework.beans.factory.annotation.Required;

import model.Address;

public class UserIdentity {


	//private fields 
	private String name ;
	
	
	private int age ;
	private String email;
	
	private Address address;
	
	

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	
	@Required
	public void setAge(int age) {
		this.age = age;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	public Address getAddress() {
		return address;
	}
	@Required
	public void setAddress(Address address) {
		this.address = address;
	}

	
public void printuserIdentityVlaues() {
	
	System.out.println("Name is :" + name + " age is : " + age + " email is : "+ email  + " Address is :- " + address  );
}



	

}
