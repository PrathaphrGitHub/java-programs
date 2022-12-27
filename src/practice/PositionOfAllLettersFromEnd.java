package practice;

import java.util.LinkedHashSet;
import java.util.Scanner;

import org.testng.annotations.Test;
//program to find the position of the letter in a string from last 
public class PositionOfAllLettersFromEnd {

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

			for (int i = s.length()-1; i >=0 ; i--) {
				if (ch==(s.charAt(i))) {
					System.out.print(ch + "=" + (i + 1)+"  ");
				}
			}

		}

	}
}
