package practical3;

import java.util.Scanner;

public class ReverseString {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the string: ");
		
		String s1 = input.nextLine();
		
		//initializing an empty string
		String revers="";
		
		for(int i= s1.length()-1;i>=0;i--) {
			//Storing the reversed string into the 'revers' variable
			revers+=s1.charAt(i);		
		}
		
		System.out.print(revers);
		//close the Scanner
		input.close();
	}

}
