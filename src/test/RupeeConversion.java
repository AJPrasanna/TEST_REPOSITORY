package test;

import java.util.Scanner;

public class RupeeConversion {
	public int usd;
	public int inr;
	public int getUsd()
	{
		return this.usd;
	}
	public void setUsd(int usd)
	{
		this.usd = usd;
	}
	public static int convertFunction(int usd)
	{	
		int inr = 0;
		inr = usd * 75;
		return inr;
		
	}

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner obj = new Scanner(System.in);
		RupeeConversion rc = new RupeeConversion();
		rc.setUsd(obj.nextInt());
		int inr = convertFunction(rc.getUsd());
		System.out.println("INR : "+ inr);
		System.out.println("NEW BRANCH");
		System.out.println("TESTING");

	}

}
