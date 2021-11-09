package com.sonata;

public abstract class Employeee {
	int empId;
	String empName;
	Address obj;
	double basicPay;
	int NofLeavesAvail;
	Employeee(int id,String name, Address obj,double pay,int leaves)
	{
		this.empId=id;
		this.empName=name;
		this.obj=obj;
		this.basicPay=pay;
		this.NofLeavesAvail=leaves;
	}
	Employeee()
	{
		
	}
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
	public Address getObj() {
		return obj;
	}
	public void setObj(Address obj) {
		this.obj = obj;
	}
	public double getBasicPay() {
		return basicPay;
	}
	public void setBasicPay(double basicPay) {
		this.basicPay = basicPay;
	}
	public int getNofLeavesAvail() {
		return NofLeavesAvail;
	}
	public void setNofLeavesAvail(int nofLeavesAvail) {
		NofLeavesAvail = nofLeavesAvail;
	}
	@Override
	public String toString() {
		return "Employee1 [empId=" + empId + ", empName=" + empName + ", obj=" + obj + ", basicPay=" + basicPay
				+ ", NofLeavesAvail=" + NofLeavesAvail + "]";
	}
//abstract method
	public abstract void CalSal() throws CustomException;

}
