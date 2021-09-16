package Javabasics;
import java.util.*;

public class assignment3 {
	public static void main( String[] args ) {
		double yearinminute = (60 * 24 *365);
		Scanner sc = new Scanner(System.in);
		double min = sc.nextDouble();
		long year = (long)(min/yearinminute);
		int days = (int)(min/60/24)%365;
		System.out.println( min + " minutes is approximately " + year + " year and " + days + " days");
		
		
	}
	
	
}
