package datatypes;

public class IncrementDecrementOp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x = 10;
		int y = x++;
		
		System.out.println(x); //11
		System.out.println(y); //10
		
		int a = 10;
		int b = ++a;

		System.out.println(a); //11
		System.out.println(b);//11
		
		int l = 10;
		int m = --l;

		System.out.println(l); //9
		System.out.println(m);//9
		
		int p = 10;
		int q = p--;

		System.out.println(p); //9
		System.out.println(q);//10
		
		
		

	}

}
