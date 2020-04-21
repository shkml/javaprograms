package practical4;

import java.util.Scanner;

public class CheckCardNumberValidity {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter the card Number: ");
		int cardNumber = input.nextInt();
		
		String cardNumberString = Integer.toString(cardNumber);
		hasValidLength(cardNumberString);
	}

	// Return true if the card number has between 13 and 16 digits
	public static boolean hasValidLength(String number) {
		 if (number.length() >=13 || number.length()<=16)
			 return true;
		 return false;
	}
		
	// Return true if the card number has a valid prefix
	public static boolean hasValidPrefix(String number) {	
		return number.startsWith("4") || number.startsWith("5") || number.startsWith("6") || number.startsWith("37");
	}
//	
//	public static boolean satisfiesMod10Check(String number) {
//		
//	}
	
}
