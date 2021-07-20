package service;

public class Name {
	private String gender ;
	
	private String id  ;
	private String salary ;
	private String phone ;
	private String url ;

	
	

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}
	
	private  Name() {
		System.out.println("I am form PUNE");
	}
	
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getSalary() {
		return salary;
	}

	public void setSalary(String salary) {
		this.salary = salary;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

public void printCompleteName(String inputname ) {
		
		System.out.println(" Name is :"+ inputname + " Gender is "  + gender + " id is : " +  id + " phone"+ phone + " URL is :"+ url);
		
	}


}
