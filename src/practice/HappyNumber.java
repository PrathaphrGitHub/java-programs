package practice;

import java.util.Scanner;

//program for happy number

public class HappyNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the number");
		int num = sc.nextInt();
		int result=num;
		
		while (result!=1 && result!=4) {
			result = happy(result);
		}
		if (result==1) {
			System.out.println(num+"  is happy number");
		} else {
			System.out.println(num+"  is  unhappy number");
		}
		
		}
		
	
	public static int happy(int b) {
		int sum=0;
		while (b>0) {
			int rem=b%10;
			sum=sum+(rem*rem);
			b/=10;
		}
		return sum;
	}
}
