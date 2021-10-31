package array_pattern;

public class pattern {
	
	public static void main(String[] args) {
		String num1=args[0];
		int r=Integer.parseInt(num1);
		String num2=args[1];
		int c=Integer.parseInt(num2);
		
		for (int row = 1; row <= r; row++) {
			System.out.print("\n");
			for (int col = 1; col <= c; col++) {
				System.out.print(row + "" + col + "\t");
			}
		}
		System.out.println();
	}

}
