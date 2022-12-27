package practice;

import org.testng.annotations.Test;

public class P2 {
	
	@Test
	public static void creat() {
	
		System.out.println("hi");
		System.out.println("hello");
		P2 a=new P2();
		a.update();
		System.out.println("chalo");
		System.out.println("how are you");
	}
	
	@Test
	static public void update() {
	
		System.out.println("bye");
		System.out.println("tata");
		System.out.println("gaya");
		System.out.println("khatam");
	}

}
