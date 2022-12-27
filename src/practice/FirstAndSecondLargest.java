package practice;

import java.util.Scanner;

//program for find first and second largest using else if conditional statement
public class FirstAndSecondLargest {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the size of the array");
		int s = sc.nextInt();
		int[] a = new int[s];
		
		System.out.println("Enter the values for array");
		for (int i = 0; i < a.length; i++) {
			a[i]=sc.nextInt();
		}
		int fBig = a[0];
		int sBig = a[1];

		for (int i = 1; i < a.length; i++) {
			if (a[i] > fBig) {
				sBig = fBig;
				fBig = a[i];
			} else if (a[i] > sBig) {
				sBig = a[i];
			}
		}

		System.out.println("first big number is " + fBig);
		System.out.println("second big number is " + sBig);
	}
}
