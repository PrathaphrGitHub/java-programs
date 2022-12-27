package practice;

import java.util.Scanner;
//program for minimum and maximum range
import org.testng.annotations.Test;

public class FibonacciSeriesBetweenRange {

	@Test
	public void fibonacci() {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the maximum range");
		int max = sc.nextInt();
		System.out.println("enter the minimum range");
		int min = sc.nextInt();

		int a = 0;
		int b = 1;
		if (max < min) {
			System.out.println(a);
			System.out.println(b);
		}

		for (int i = 2; i < max; i++) {

			int sum = a + b;
			a = b;
			b = sum;
			if (sum > min && sum < max) {
				System.out.println(sum);
			}
		}
	}
}
