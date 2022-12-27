package practice;

import org.testng.annotations.Test;

public class P3 {

	
	@Test
	public void create() {
	
		System.out.println("hi");
		System.out.println("hello");
		System.out.println("chalo");
		System.out.println("how are you");
	}
	
	@Test
	public void update() {
	
		System.out.println("bye");
		System.out.println("tata");
		create();
		System.out.println("gaya");
		System.out.println("khatam");
	}
}
