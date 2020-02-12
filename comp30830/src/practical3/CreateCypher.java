package practical3;

import java.util.Scanner;

public class CreateCypher {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter the string: ");
		String s1 = input.nextLine();
		
		//Declare an empty string
		String cypher = "";
		
		for (int i=0;i<s1.length();i++) {	
			char cha = s1.charAt(i);
			if (Character.isLowerCase(cha)) 
			{
				if (cha == 'z') 
					cypher+='a';
				else
					cypher+= (char)(cha+ 1);
			}
			else
				cypher+=cha;
		}
		
		System.out.println(cypher);
		
		//close the scanner
		input.close();
	}

}
