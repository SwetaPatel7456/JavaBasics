package Javabasics;
import java.util.*;

public class assignment7 {
	   public int factorial(int x) {
		   if(x == 1) {
			   return x;
		   }
		   else 
			   return x * factorial(x-1);
	   }
	 

		public static void main(String arg[])	{
			
			Scanner sc = new Scanner(System.in);
			
			System.out.println("Enter the number");
			int num = sc.nextInt();
			assignment7 a = new assignment7();
			
			int fact = a.factorial(num);
			System.out.println(fact);
		}
		
	  	        	 
	}
	
	 
	