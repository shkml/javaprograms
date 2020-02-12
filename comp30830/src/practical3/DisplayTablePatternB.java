package practical3;

import java.util.Scanner;

public class DisplayTablePatternB {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.println("Enter the integer: ");

		int integer = input.nextInt();

		for (int i=1;i<=integer;i++) {
			for (int j=1;j<=integer+1-i;j++)
				System.out.print(j + " ");
			System.out.println();
		}
		
		//close the scanner
		input.close();
	}
}