package com.io;
import java.util.Scanner;
public class FactOfNumber {
	public static void main(String[]args) {
		Scanner s=new Scanner(System.in);
		System.out.print("Enter a number:");
		int n=s.nextInt();
		int f= fact(n);
		System.out.print("Factorial of the number is:");
		
	}
	static int fact(int n) {
		int f=1;
		for(int i=n;i>=1;i--)
			f=f*i;
		return f;
	}

}
