package pattern_programs_stars;

public class B11 {

	public static void main(String[] args) {
		int row=5;
		int col=5;
		int num=5;
		
		for (int i = 0; i < row; i++) {
		
			for (int j = 0; j < col; j++) {
			
				if (i>=j)
				{
					System.out.print(num+" ");
					
				}
				else
				      System.out.print("");
			}
			System.out.println();
		}
	}
}
