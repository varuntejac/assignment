package com.sonata;

public class Staff extends Employeee{
	String title1;
	String title2;
	double salary;
	Staff(int id,String name, Address obj,double pay,int leaves,String tit1,String tit2)
	{
		super(id,name,obj,pay,leaves);
		this.title1=tit1;
		this.title2=tit2;
	}
	Staff()
	{
		
	}
	public String getTitle1() {
		return title1;
	}
	public void setTitle1(String title1) {
		this.title1 = title1;
	}
	public String getTitle2() {
		return title2;
	}
	public void setTitle2(String title2) {
		this.title2 = title2;
	}
	@Override
	public double CalSal()
	{
		salary=getBasicPay()+getBasicPay()*0.18;
		return salary;
	}
		
	@Override
	public String toString() {
		return "Staff [empId=" + empId + ", empName=" + empName + "]";
	}
	/*public static void main(String args[])
	{
		Staff t=new Staff();
		t.setEmpId(4);
		t.setEmpName("veera");
		t.setBasicPay(345566.66);
		t.setNofLeavesAvail(43);
		t.setTitle1("HousKeeping");
		t.setTitle2("Security");
		System.out.println(t.toString());
		System.out.println(t.CalSal());
		
		
	}
*/
}
