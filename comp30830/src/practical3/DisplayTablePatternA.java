package practical3;

import java.util.Scanner;

public class DisplayTablePatternA {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter the integer: ");
		
		int integer = input.nextInt();
		
		for (int i=1;i<=integer;i++) {
			for (int j=1;j<=i;j++)
				System.out.print(j + " ");
			System.out.println();
			
		}

	}

}
