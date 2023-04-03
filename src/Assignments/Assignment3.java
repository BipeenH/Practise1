package Assignments;

public class Assignment3 {

	public static void main(String[] arg) {
		
		int i = 10;
		int j = i++ + ++i;
		
		System.out.println(i);
		System.out.println(j);
		
		int k = 10;

		int l = ++k; 

		System.out.println(k); 

		System.out.println(l);

		
		int m = 10;

		int n = m++ + m++ + --m + ++m + ++m; 
			//	10  + 11  + 11  +  12 + 13
		System.out.println(m); //13

		System.out.println(n);  //57
		
		
		
	}
	
}
