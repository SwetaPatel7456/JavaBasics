package Javabasics;

import java.util.Scanner;

public class assignment5 {
	public static void main( String[] args ) {
		int sum = 0;
		Scanner sc = new Scanner(System.in);
		int m = sc.nextInt();
		int n = m;
		int r;
		while(n!=0) {
			r = n%10;
			sum = sum + r;
			n = n/10;
			
		}
		System.out.println("The sum of all the digits entered is " + sum);
	}

}
