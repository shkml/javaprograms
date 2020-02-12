package practical3;

import java.util.Scanner;

public class CountVowelsAndConsonants {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.print("Enter the string: ");

		String s1 = input.nextLine();
		s1.toLowerCase();

		int vowels=0;
		int cons=0;
		
/*		for (int i=0; i<s1.length();i++){
			if (Character.isLetter(s1.charAt(i))){
				{
					if (s1.charAt(i) == 'a' || s1.charAt(i) == 'e' || s1.charAt(i) == 'i' || s1.charAt(i) == 'o' || s1.charAt(i) == 'u')
						vowels=vowels+1;

					else
						cons=cons+1;
				}
			}
		}*/
		
		String vowel ="aeiou";
		for (int i=0; i<s1.length();i++) {
		
			char ch=Character.toLowerCase(s1.charAt(i));
			
			if (vowel.indexOf(ch)!= -1)
				vowels++;
			else if(Character.isLetter(ch))
				cons++;
		}
		
		System.out.print(vowels+" "+cons);
		//close the scanner
		input.close();
	}

}
