package practical2;

import java.util.Scanner;

public class CheckLowercaseUppercase {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.print("Enter a character: ");

		char ch = input.next().charAt(0);

		if (Character.isLetter(ch)) {
			if (ch == 'A' || ch == 'a' || ch == 'E' || ch == 'e' || 
					ch == 'I'|| ch == 'i'|| ch == 'o'|| ch == 'O' || ch == 'U'|| ch == 'u' ) 
				System.out.println("Entered character is a vowel");

			else System.out.println("Entered character is a consonant");
		}

			/*		if (Character.isLowerCase(ch) || Character.isUpperCase(ch)) {
			char lower = Character.toLowerCase(ch);
			boolean isVowel = lower == 'a' || lower == 'e' || lower == 'i' || lower == 'o' || lower == 'i';
			System.out.println(ch + "is a "+ (isVowel?"vowel":"consonant"));	
		}*/

			else System.out.println("Entered character is not a letter!");

			//close the scanner
			input.close();
		}

	}
