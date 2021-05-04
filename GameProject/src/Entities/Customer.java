package Entities;

public class Customer {
	int id;
	String firstName;
	String lastName;
	int birthDay;
	long nationalityNo;
	
	








	public Customer(int id, String firstName, String lastName, int birthDay, long nationalityNo) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.birthDay = birthDay;
		this.nationalityNo = nationalityNo;
	}

	
	
	




	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getFirstName() {
		return firstName;
	}


	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}


	public String getLastName() {
		return lastName;
	}


	public void setLastName(String lastName) {
		this.lastName = lastName;
	}


	public int getBirthDay() {
		return birthDay;
	}


	public void setBirthDay(int birthDay) {
		this.birthDay = birthDay;
	}








	public long getNationalityNo() {
		return nationalityNo;
	}








	public void setNationalityNo(long nationalityNo) {
		this.nationalityNo = nationalityNo;
	}










}
