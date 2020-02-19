package practical4;

import java.util.Scanner;

public class CheckPalindrome {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter the string");
		String word = input.nextLine();
		
		System.out.println(isPalindrome(word));
	}

	public static boolean isPalindrome(String str) {
		int i;
		int j;
		for(i=0,j=str.length()-1;i<(str.length()/2);i++,j--) {
			if (str.charAt(i)==str.charAt(j)) {
				continue;
			}
			else
				return false;
		}
		return true;
	}
}
