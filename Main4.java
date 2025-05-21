package com.summer;

import java.util.Scanner;

public class Main4 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Emter a : ");
		int a = sc.nextInt();
		
		System.out.println("Enter b : ");
		int b = sc.nextInt();
		
		if (a>b) {
			System.out.println("maximum element is a :"+a);
		}else {
			System.out.println("maximum element is b :"+b);
		}
		sc.close();
	}
}
