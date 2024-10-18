package datatypes;

public class StringConcat {
	
	public static void main(String[] args) {
		
		int i = 10;
		int j = 20;
		System.out.println(i+j);
		String a = "Hello";
		String b = "World";
				
		System.out.println(a+ b);
		
		System.out.println(a+b+i+j);
		System.out.println(i+j+a+b);
		System.out.println(a+b+ (i+j));
		
		char ch = 'n'; char ch1 = 'm'; 
		
		 System.out.println(a+b+ch+ch1);
		 System.out.println(ch+ch1+a+b);
		 
		 System.out.println(ch+ch1); // o/p = 219 cause ascii value of n = 110 and m = 109
		 System.out.println(ch+ch1);
		 System.out.println("*******"); 
		 System.out.println(ch);// o/p = n 
		 System.out.println((byte)(ch)); // O/P = 110
		
		//A-Z = 65- 90 , a-z = 97 -122 , 0-9 = 48 -57
		 
		 
		 
	}
	
}
