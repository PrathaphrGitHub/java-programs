package practice;

import java.util.Scanner;

import org.testng.annotations.Test;

//fibonacci series value less range number
public class FibonacciSeriesLessThanRange {

	@Test
	public void fibonacci() {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the range");
		int n = sc.nextInt();

		int a = 0;
		int b = 1;
		System.out.println(a);
		System.out.println(b);
		int sum = 0;
		while (sum < n) {

			sum = a + b;
			a = b;
			b = sum;
			if (sum < n) {
				System.out.println(sum);
			}
		}
	}
}
