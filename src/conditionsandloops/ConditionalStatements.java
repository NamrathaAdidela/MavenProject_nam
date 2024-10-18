package conditionsandloops;

public class ConditionalStatements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		byte b1 = 065;
		
		System.out.println((int)b1);
		 
		// if condition 
		
		boolean flag = true; 
		
		if (flag) {
		      System.out.println("BYE"); 
		}
		else {
		System.out.println("Pass");
		}
		
		
		if(true) {
			System.out.println("If part will always be executed");
		}else {
			System.out.println("Else nerver be executed");
			System.out.println("This is example of Dead code");
		}
		
		//nested if
		//Break is only used in switch and loops 
		// break can't be used in conditions
		
		int num = 36;
		if(num<=100) {
			 if (num>=90) {
				 System.out.println("You got Grade A");
				 if (num==100) {
					 System.out.println("Eligible for full Scholarship");					 
				 } else {
					 System.out.println("Eligible for 50% scholarship");
				 }
				 
			 }
			 else if (num>=70){
				 System.out.println("You got Grade B");
				 System.out.println("Eligible for 20% scholarship");
				 
			 }else if(num>=37) {
				 
				 System.out.println("You got Grade C");
				 System.out.println("Not Eligible for scholarship"); 
				 
			 }else {
				 System.out.println("Failed in the Exams");
			 }
			
			
			
		}
		
		//Switch-Case
		String browser ="Chrome ";
		switch (browser.toLowerCase().trim()) {
		case "chrome":
			System.out.println("Launch Chrome browser");
			break;
		case "firefox":
			System.out.println("Launch Firefox browser");
			break;
		case "safari":
			System.out.println("Launch Safari browser");
			break;
		case "ie":
			System.out.println("Launch IE browser");
			break;
		default:
			System.out.println("Please provide valid browser");
			break;
		}
		
		//Switch-case limitations
		
		int i = 10; 
		switch (i) {
		case 10: // only int, byte, short, char,string.. types allowed
			// i data type should not be long, float, double, boolean. case doesn't support these data types
			System.out.println("Number is 10");
			break;

		default:
			System.out.println("Number is not 10");
			break;
		}
		
		
		
		
		// while
				
		int a = 3;
		
		while (a<10)
		{
			System.out.println(a);
			a++;
		}
		

	}

}
