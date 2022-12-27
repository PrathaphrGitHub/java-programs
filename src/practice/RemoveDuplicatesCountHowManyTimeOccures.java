package practice;

import java.util.LinkedHashSet;
import java.util.Scanner;

import org.testng.annotations.Test;
//program to remove the duplicates and get the count how many times letter is occurs
public class RemoveDuplicatesCountHowManyTimeOccures {

	@Test
	public void simple() throws Throwable {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the string");
		String s = sc.next();

		System.out.println(s.length());
		LinkedHashSet<Character> lhs = new LinkedHashSet<Character>();

		for (int i = 0; i < s.length(); i++) {
			lhs.add(s.charAt(i));
		}
		System.out.println(lhs);
		
		System.out.println("-----------------");

		for (Character ch : lhs) {
			int count = 0;
			for (int i = 0; i < s.length(); i++) {

				if (ch==(s.charAt(i))) {
					count++;
				}

			}
			System.out.println(ch + "=" + count);
		}

	}
}
