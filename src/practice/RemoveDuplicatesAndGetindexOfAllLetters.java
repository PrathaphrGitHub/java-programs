package practice;

import java.util.LinkedHashSet;
import java.util.Scanner;

import org.testng.annotations.Test;
//program to find remove the duplicates and find the index of of all the elements
public class RemoveDuplicatesAndGetindexOfAllLetters {

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
				if (ch==(s.charAt(i))) {
					System.out.print(ch + ":" + (i) + " ");
//					System.out.println(ch + "=" + (i) + " ");
				}
			}

		}

	}
}
