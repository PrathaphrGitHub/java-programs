package practice;

import java.util.LinkedHashSet;
import java.util.Scanner;

import org.testng.annotations.Test;

public class RemoveAndPositionOfOneLetterFromStart {

	@Test
	public void simple() throws Throwable {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the string");
		String s = sc.next();

		LinkedHashSet<Character> lh = new LinkedHashSet<Character>();
		for (int i = 0; i < s.length(); i++) {
			lh.add(s.charAt(i));
		}
		System.out.println(lh);

		for (Character ch : lh) {

			for (int i = 0; i < s.length(); i++) {
				if (ch.equals(s.charAt(i))) {
					System.out.print(ch + ":" + (i + 1) + " ");
//					System.out.println(ch + "=" + (i + 1) + " ");
					break;
				}
			}

		}

	}
}
