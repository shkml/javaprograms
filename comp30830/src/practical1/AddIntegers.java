package comp30830;

import java.util.Scanner;

public class AddIntegers {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("please input a number: ");
		int integer = input.nextInt();
		
		int x;
		int count = 0;
		if (integer<0 || integer > 999) 
			System.out.println("Enter value of integer between 0 and 999");
		
		else {
			while(integer>0)
			{
				x= integer%10;
				count=count+x;
				integer= integer/10;
			}

			System.out.println(count);
		}
		
		//Closing the scanner
		input.close();
	}
	
}
