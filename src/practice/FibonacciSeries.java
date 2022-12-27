package practice;

import java.util.Scanner;

import org.testng.annotations.Test;

//program for fibonacci series
public class FibonacciSeries {

	@Test
	public void fibonacci() {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the range");
		int n = sc.nextInt();
		
		int a=0;
		int b=1;
		System.out.println(a);
		System.out.println(b);
		for (int i = 2; i <n; i++) {
			
			int sum=a+b;
			System.out.println(sum);
			a=b;
			b=sum;
			
			
		}
	}
}
