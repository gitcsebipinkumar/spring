package service;

import java.util.Map;
import java.util.Properties;
import java.util.Set;


public class BasicDataSource {

	
	  private String driverClassName;
	 
	  private String url;
	  
	  private String userName;
	  
	  private String pwd;
 
 
public void printUseridentity() {

		System.out.println("driverClassName**** : " + driverClassName+ "\n" + "url****:"+ url +" \nuserName"+ userName +" \n pwd" + pwd);
	
}


public String getDriverClassName() {
	return driverClassName;
}


public void setDriverClassName(String driverClassName) {
	this.driverClassName = driverClassName;
}


public String getUrl() {
	return url;
}


public void setUrl(String url) {
	this.url = url;
}


public String getUserName() {
	return userName;
}


public void setUserName(String userName) {
	this.userName = userName;
}


public String getPwd() {
	return pwd;
}


public void setPwd(String pwd) {
	this.pwd = pwd;
}




}
