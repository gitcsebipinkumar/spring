package service;

import java.util.Map;
import java.util.Properties;
import java.util.Set;

import model.Address;

public class UserIdentity {

  
  Properties dbproperties ;
  
  private String osname;

 
public void printUseridentity() {
	
	
	Set propKeys = dbproperties.keySet();
	for (Object propkey : propKeys ) {
		
		System.out.println(propkey + ":" + dbproperties.getProperty(propkey.toString()));
	}
}


public Properties getDbproperties() {
	return dbproperties;
}


public void setDbproperties(Properties dbproperties) {
	this.dbproperties = dbproperties;
}


public String getOsname() {
	return osname;
}


public void setOsname(String osname) {
	this.osname = osname;
}

}
