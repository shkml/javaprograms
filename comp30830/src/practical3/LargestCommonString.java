package practical3;

import java.util.Scanner;

public class LargestCommonString {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter first string: ");
		String s1 = input.nextLine();
		
		System.out.print("Enter second string: ");
		String s2 = input.nextLine();
		
		String commonString= "";
		for (int i=0;i<Math.min(s1.length(),s2.length());i++) {
			if (s1.charAt(i)==s2.charAt(i))
				commonString+=s1.charAt(i);
			else
				break;
		}
		
		if (commonString.length()>=1)
			System.out.println("The common String is: "+commonString);
		else
			System.out.println("no common prefix!");
		
		//close the scanner
		input.close();	
	}
}
