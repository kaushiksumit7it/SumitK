package com.test.mypack;

public class Remote {
	
	public static void main(String args[])
	{
		int i=5;
		String name= "Kaushik";
		Remote r=new Remote();
		r.VoumeIncrease();
		r.VoumeDecrease();
		System.out.println(i);
		System.out.println(name);
	}

	/* This is the function to increase the volume  */
	public void VoumeIncrease()
	{
		System.out.println("Volume is increased");
	}
	/* This is the function to decrease the volume  */
	public void VoumeDecrease()
	{
		System.out.println("Volume is decreased");
	}


}
