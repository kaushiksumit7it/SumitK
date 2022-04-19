package com.java.array.example;

import java.util.Scanner;

public class ArrayMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Single Dimantion Array
//		int [] numbers = new int[3];
//		Scanner scan = new Scanner(System.in);
//		System.out.println("Lenth of the Array"+numbers.length);
//		for(int a=0;a<=2;a++) {
//			System.out.println("Enter your number");
//			numbers[a] = scan.nextInt();
//		}
//		for(int a=0;a<=2;a++) {
//			System.out.println("The array elements are :-"+numbers[a]);
//		}
		
		int a[][] = new int[3][3];
		Scanner scan = new Scanner(System.in);
		for(int i=0;i<=2;i++) {
			for(int j = 0;j<=2;j++) {
				System.out.println("Enter your number");
				a[i][j] = scan.nextInt();			
			}
		}
		System.out.println("The array is");
		for(int i=0;i<=2;i++) {
			for(int j = 0;j<=2;j++) {
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}

	}

}
