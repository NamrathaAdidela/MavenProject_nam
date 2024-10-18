package datatypes;

public class MathematicalOperations {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(9/2); // 4 - quotient
		System.out.println(9%2); // 1 - remainder
		System.out.println(8/2); // 4 - quotient 
		System.out.println(9.0/2); // 4.5 
		System.out.println(9.0/2.0); // 4.5
		System.out.println(9/2.0); //4.5
		
		//System.out.println(9/0); // ArithmeticException: / by zero		
		//System.out.println(0/0); // ArithmeticException: / by zero
		
		
		System.out.println(0.0/0.0);// NaN - Not a number
		System.out.println(0.0/0);// NaN - Not a number
		
		
		System.out.println(9/0.0);// Infinity		
		System.out.println(9.0/0); //Infinity
		System.out.println((float)9/0); //Infinity
		
		System.out.println(0/9); //0
		System.out.println(0.0/9);//0.0
		System.out.println(0/9.0);//0.0
		System.out.println(0.0/9.0); //0.0
		
		System.out.println('a'/2);// 48
		System.out.println('a'%2);// 1
		
	}

}
