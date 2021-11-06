package com.sonata;

public class Address {
	String doorNo;
	String street;
	int pinCode;
	Address(String dno,String street,int code)
	{
		this.doorNo=dno;
		this.street=street;
		this.pinCode=code;
	}
	Address()
	{
		
	}
	public String getDoorNo() {
		return doorNo;
	}
	public void setDoorNo(String doorNo) {
		this.doorNo = doorNo;
	}
	public String getStreet() {
		return street;
	}
	public void setStreet(String street) {
		this.street = street;
	}
	public int getPinCode() {
		return pinCode;
	}
	public void setPinCode(int pinCode) {
		this.pinCode = pinCode;
	}
	@Override
	public String toString() {
		return "Address [doorNo=" + doorNo + ", street=" + street + ", pinCode=" + pinCode + "]";
	}
	

}
