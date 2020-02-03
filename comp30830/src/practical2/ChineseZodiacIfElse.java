package practical2;

import java.util.Scanner;

public class ChineseZodiacIfElse {

	public static void main(String[] args) {
		
		System.out.println("Enter the year: ");
		
		Scanner input = new Scanner(System.in);
		
		int year = input.nextInt();
		
		int remainder = year%12;
		if (remainder==0) System.out.println("Monkey");
		else if (remainder==1) System.out.println("Rooster");
		else if (remainder==2) System.out.println("Dog");
		else if (remainder==3) System.out.println("Pit");
		else if (remainder==4) System.out.println("Rat");
		else if (remainder==5) System.out.println("Ox");
		else if (remainder==6) System.out.println("Tiger");
		else if (remainder==7) System.out.println("Rabbit");
		else if (remainder==8) System.out.println("Dragon");
		else if (remainder==9) System.out.println("Snake");
		else if (remainder==10) System.out.println("Horse");
		else System.out.println("Sheep");
		
		//close the scanner
		input.close();
	}

}
