package datatypes;

public class StaticBlock {
	 
	
	 
	 
	 
	public static void main(String[] args) {
		
		System.out.println("Static Block executed first"); 
		System.out.println("Static Block executed only if there is a main method"); 
		

	}
	
	static {
		 System.out.println("Hello World");
	 }
	static {
		 System.out.println("2nd static block executed after 1st in order");
	 }

}
