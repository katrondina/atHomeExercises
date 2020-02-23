package com.ibm.training.HrMain;


public class Employee {
	private String firstName;
	private String lastName;
	private String address;
	private String birthDate;
	private int age;
	private char maritalStatus;
	private char gender;
	private int pagibig;
	private int sss;
	private double salary;
	private double dailyRate;
	private double projectedSalary;
	private double bonus;
	private int remainingLeaves;
	
	Employee(String firstName, String lastName, String address, String birthday, int age, char status, char gender,
			double salary, int remainingLeaves){
		this.firstName = firstName;
		this.lastName = lastName;
		this.address = address;
		this.birthDate = birthday;
		this.age = age;
		this.maritalStatus = status;
		this.gender = gender;
		this.salary = salary;
		this.remainingLeaves = remainingLeaves;
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
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getBirthDate() {
		return birthDate;
	}
	public void setBirthDate(String birthDate) {
		this.birthDate = birthDate;
	}
	public int getAge() {
	//	this.age = this.currentDate - this.birthDate;
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public char getMaritalStatus() {
		return maritalStatus;
	}
	public void setMaritalStatus(char maritalStatus) {
		this.maritalStatus = maritalStatus;
	}
	public char getGender() {
		return gender;
	}
	public void setGender(char gender) {
		this.gender = gender;
	}
	public int getPagibig() {
		
		if (this.maritalStatus == 'S'){
			this.pagibig = 200;
			} else if (this.maritalStatus == 'M'){
			this.pagibig = 100;
			}
		
		return pagibig;
	}
	public int getSss() {
		
		if (this.maritalStatus == 'S'){
			this.sss = 200;
		} else if (this.maritalStatus == 'M'){
			this.sss = 100;
		} 
		
		return sss;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public double getDailyRate() {
		this.dailyRate = this.salary / 20;
		return dailyRate;
	}
	public void setDailyRate() {
		this.dailyRate = this.salary / 20;
	}
	public double getProjectedSalary() {
		this.projectedSalary = (this.salary * 0.75) - this.pagibig - this.sss;
		return projectedSalary;
	}
	public void setProjectedSalary() {
		this.projectedSalary = (this.salary * 0.75) - this.pagibig - this.sss;
	}
	public double getBonus() {
		
		if (this.remainingLeaves == 15){
			bonus = 15000;
		} else {
			bonus = this.remainingLeaves * this.dailyRate;
		}
		
		return bonus;
	}
//	public void setBonus() {
//		if (this.remainingLeaves == 15){
//			this.bonus = 15000;
//		} else {
//			this.bonus = this.remainingLeaves * this.dailyRate;
//		}
//	}
	public int getRemainingLeaves() {
		return remainingLeaves;
	}
	public void setRemainingLeaves(int remainingLeaves) {
		this.remainingLeaves = remainingLeaves;
	}
	
	public String getBonusMessage(){
		String message = "";
		String salutation;
		
		if (this.gender == 'F' & this.maritalStatus == 'M'){
			salutation = "Mrs";
		} else if (this.gender == 'F') {
			salutation = "Ms";
		} else {salutation="Mr";}
		
		if (this.remainingLeaves == 15){
			message = "Good day, " + salutation + " " + this.firstName + " " + this.lastName;
			message += ". You have received an extra bonus of 15,000.\n";
		}
		return message;
	}
}
