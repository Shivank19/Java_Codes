import java.util.*;

public class GCD
{
	 static int gcd(int a, int b) 
	{ 
		// base case 
        	if (a == b) 
	            return a; 

        	// Everything divides 0  
        	if (a == 0) 
	          return b; 
	        if (b == 0) 
        	  return a;     
       
	        // a is greater 
        	if (a > b) 
	            return gcd(a-b, b); 
	        return gcd(a, b-a); 
	}
 
	public static void main(String[] srgs)
	{
		int n1, n2, gcd;
		
		Scanner in = new Scanner(System.in);
		
		System.out.println();
		System.out.print("Enter first no. : ");
		n1 = in.nextInt();
		System.out.print("Enter second no. : ");
		n2 = in.nextInt();
		
		System.out.println("G.C.D of " + n1 + " and " + n2 + " is = " + gcd(n1,n2));
		System.out.println();
	}
}
				



