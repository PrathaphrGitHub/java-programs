package practice;

public class MainOverLoading {

	public static void main(String[] args) {
		System.out.println("hi main");
		MainOverLoading.main(100);
		MainOverLoading.main();
	}
	
	public static void main() {
		System.out.println("hi no argument main");
	}
	
	public static void main(int a) {
		System.out.println(a);
	}
}
