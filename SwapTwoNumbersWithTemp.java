package com.summer;

import java.util.Scanner;

public class SwapTwoNumbersWithTemp {
	public static void main(String [] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a :");
		int a= sc.nextInt();
		
		System.out.println("Enter b : ");
		int b= sc.nextInt();
		
		int temp;
		temp=a;
		a=b;
		b=temp;
		
		System.out.println("a : "+ a);
		System.out.println("b : "+ b);
		
		sc.close();
	}
}
