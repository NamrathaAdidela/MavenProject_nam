package datatypestraining;

import java.util.ArrayList;

public class methodOverloading {
	
	public void login(int r, String s)
	{
	System.out.println("Integer Function");
		
	}
	
	public void login(long r, String s)
	{
		System.out.println("Long Function");
				
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//methodOverloading m1 = new methodOverloading();
		
		
		//m1.login(1000000000,"nam");
		
		ArrayList<String> args1 = new ArrayList<String> (); 
		
		System.out.println(args1);
		
		//System.out.println(args1[0]);
		//System.out.println(args1[0]);
		System.out.println("----------------------");
		
	 String[] args2 = new String [5];
	 
		System.out.println(args2);
		System.out.println(args2[0]);
		
	}

}
