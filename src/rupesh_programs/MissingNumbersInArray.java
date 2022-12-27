package rupesh_programs;

public class MissingNumbersInArray {

	public static void main(String[] args) {
		int a[] = { 2, 4, 6, 10, 12, 14, 18, 20 };
		int b=a[0];
		
		for (int i = 1; i < a.length; i++) {
			 b=b+2;
			if(b!=a[i])
			{
				System.out.println(b);
			}
		}
	}
}
