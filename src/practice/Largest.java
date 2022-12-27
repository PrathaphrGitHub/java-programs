package practice;

import java.util.Scanner;

public class Largest {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the size of the array");
		int s = sc.nextInt();
		//int[] a = new int[s];
		int a[] = {5,6,7,3,2,1,9,10,56,15};
		
		System.out.println("Enter the values for array");
		for (int i = 0; i < a.length; i++) {
			a[i]=sc.nextInt();
		}
	}
}
