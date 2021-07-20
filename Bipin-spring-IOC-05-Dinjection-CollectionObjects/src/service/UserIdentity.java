package service;

import java.util.Map;
import java.util.Properties;
import java.util.Set;

import model.Address;

public class UserIdentity {

  private String[] usernames ;
  private Address[] address;
  private Set phonenumber ;
  private Map colour ;
  
  Properties dbproperties ;

  
  public String[] getUsernames() {
	return usernames;
}
public void setUsernames(String[] usernames) {
	this.usernames = usernames;
}
public Address[] getAddress() {
	return address;
}
public void setAddress(Address[] address) {
	this.address = address;
}

public Set getPhonenumber() {
	return phonenumber;
}
public void setPhonenumber(Set phonenumber) {
	this.phonenumber = phonenumber;
}
public Map getColour() {
	return colour;
}
public void setColour(Map colour) {
	this.colour = colour;
}
public Properties getDbproperties() {
	return dbproperties;
}
public void setDbproperties(Properties dbproperties) {
	this.dbproperties = dbproperties;
}

public void printUseridentity() {
	
	for(String username : usernames) {
		System.out.println(username);
	}
	
	for(Object phonenumber : phonenumber) {
		System.out.println(phonenumber);
	}
	
	for(Address address : address) {
		System.out.println(address);
	}
	
	Set keys = colour.keySet();
	
	for( Object key:keys) {
		System.out.println(" Username : " + key + " Value : " + colour.get(key));
		
	}
	
	
	Set propKeys = dbproperties.keySet();
	for (Object propkey : propKeys ) {
		
		System.out.println(propkey + ":" + dbproperties.getProperty(propkey.toString()));
	}
}

}
