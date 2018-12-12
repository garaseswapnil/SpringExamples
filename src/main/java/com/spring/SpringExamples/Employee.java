package com.spring.SpringExamples;

public class Employee {
	
	int empId;
	String empName;
	Address address;
	
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", empName=" + empName + ", address=" + address + "]";
	}
	private Employee(int empId, String empName, Address address) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.address = address;
	}
	public Employee() {
		super();
		System.out.println("dafault constructor of Employee");
	}
	
}

class Address{
	String city;
	String zip;
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getZip() {
		return zip;
	}
	public void setZip(String zip) {
		this.zip = zip;
	}
	@Override
	public String toString() {
		return "Address [city=" + city + ", zip=" + zip + "]";
	}
	private Address(String city, String zip) {
		super();
		this.city = city;
		this.zip = zip;
	}
	public Address() {
		super();
		System.out.println("dafault constructor of Address");
	}
	
}