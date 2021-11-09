package com.sonata;

public class UsingPeople {
	public static void main(String args[])
	{
		Address a1=new Address();
		a1.setDoorNo("1-54");
		a1.setStreet("Ramalayam Street");
		a1.setPinCode(523273);	
		
		TechnicalEmployee te=new TechnicalEmployee();
		te.setEmpId(2);
		te.setEmpName("varun");
		te.setBasicPay(345566.66);
		te.setNofLeavesAvail(45);
		te.setSkill1("C");
		te.setSkill2("Java");
		System.out.println(te.toString());
		System.out.println(te.CalSal());
		
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
}
