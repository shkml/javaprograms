package practical2;

import java.util.Scanner;

public class ConvertToHex {

	public static void main(String[] args) {
		
		System.out.print("Enter the integer between 0-15(inclusive) : ");
		
		Scanner input= new Scanner(System.in);
		
		int integer = input.nextInt();
		
		if ((integer>=0) && (integer<=15)){
			char c= (char)('A' + integer - 10);
			//String c = Integer.toHexString(integer);
			System.out.println(c);
		}
		
		else System.out.println("Enter a valid integer!");

		/*
		 * int a= 'A'+integer; System.out.println(a);
		 */
		//close the scanner
		input.close();
	}

}
