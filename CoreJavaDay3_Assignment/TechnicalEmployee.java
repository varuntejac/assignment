package com.sonata;

public class TechnicalEmployee extends Employeee{
	String skill1;
	String skill2;
	double salary;
		TechnicalEmployee() {
		// TODO Auto-generated constructor stub
	}

	public String getSkill1() {
		return skill1;
	}
	public void setSkill1(String skill1) {
		this.skill1 = skill1;
	}
	public String getSkill2() {
		return skill2;
	}
	public void setSkill2(String skill2) {
		this.skill2 = skill2;
	}
	public double CalSal()
	{
		salary=getBasicPay()+getBasicPay()*0.12;
		return salary;
	}
	
	
	
	@Override
	public String toString() {
		return "TechnicalEmployee [empId=" + empId + ", empName=" + empName + "]";
	}

	/*public static void main(String args[])
	{
		//TechnicalEmployee tn=new TechnicalEmployee(2,"varun","1-54",345673.77,45,"C","Java");

		TechnicalEmployee te=new TechnicalEmployee();
		te.setEmpId(2);
		te.setEmpName("varun");
		te.setBasicPay(345566.66);
		te.setNofLeavesAvail(45);
		te.setSkill1("C");
		te.setSkill2("Java");
		System.out.println(te.toString());
		System.out.println(te.CalSal());
		
		
	}*/
}
