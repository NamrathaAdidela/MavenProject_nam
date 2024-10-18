package conditionsandloops;

public class SHortCircuitOperator {

	public static void main(String[] args) {
		
		int x = 120;
		int y = 90;
		int z = 300; 
		int w= 100;
		
		// && operator is short circuit operator
		if(x>y && x>z && x>w) {
			System.out.println("x is greatest number");
		}
		else if (y>z && y>w) {
			System.out.println("y is greatest number");
		} else if(z>w){
			System.out.println("z is greatest number");
		} else {
			System.out.println("w is greatest number");
		}
		 
		
		
	} 

}
