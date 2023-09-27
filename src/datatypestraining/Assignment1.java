package datatypestraining;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class Assignment1 {
	String str ;
	public static void main(String[] args) {
		//00 01 02 03 
		//10 11 12 13 
		//20 21 22 23 

		 
		 
		 HashMap<String, Integer> hm = new HashMap<String, Integer>();
		hm.put("A",100); 
		hm.put("B", 200);
		hm.put("C",300); 
		hm.put("D", 400);
		
		hm.forEach((k,v)-> System.out.println(k +":"+v));
		
		
		for(Map.Entry<String,Integer> m: hm.entrySet())
		{
			String b = m.getKey();
			int i = m.getValue();
			System.out.println(b+ ":" +i);	
			
		}	
		Assignment1 as1 = new Assignment1();
		System.out.println(as1.isPrime(28));
	}
	// Prime number or not 
	public static boolean isPrime(int number)
	{
		
		int i = 2;
		boolean flag = false; 
		
		while(i<= number/2)
		{
			if(number%2 ==0)
			{
				flag = true;
				break;
			}
			i++;
		}
		
		if(!flag)
		{
			System.out.println("Prime Number");
			return true;
		}
		else 
		{
			System.out.println("Non Prime Number");
			return false;
		}
	}

}
