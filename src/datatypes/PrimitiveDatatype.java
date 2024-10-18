package datatypes;

public class PrimitiveDatatype {

	public static void main(String[] args) {
		//********
		//primitive datatypes takes the space in memory, without object creation 
		//EX: boolean, char, int , float, double , short , long , Byte
		//********
		
		 // 1 Byte = 8 bits 
		
		// size ~1 bit not even a byte 
		boolean b = true;
		boolean c = false;
		
		System.out.println(b);
		
		// 2 bytes for char
		char ch = 'b'; // a-z or A-Z allowed
		char ch1 = '2'; // 0-9 numbers only allowed, no -ve numbers 
		char ch2 = '#' ; // single special chars allowed
		
		byte by = 10; // 1 byte memory 	
		// ASCII Values : A-Z = 65- 90 , a-z = 97 -122 , 0-9 = 48 -57
		
		short sh = 10 ; // 2 bytes memory
		int i = 20; //  4 bytes number range = -2^31 to 2^31-1
		long l = 20; // 8 bytes 
		long l1 = 99267634823L; // if it give error give L/l at end to specify its long number 
		
		
		float f = 12.33f;  // 4 bytes , after . 7 digits allowed 
		float f1 = (float)12.33;
		float f2 = 100;
		// float f3 =12.5678; gives error
		System.out.println(f1);
		System.out.println(100); // o/p - 100
		
		double d = 12.65; // 8 bytes, after . 15 digits
		double d1 = 12.56d; 
		

	}

}
