package practical2;

import java.util.Scanner;

public class PerimeterofTriangle {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the sides of Triangle");
		
		//Read 3 inputs
		int s1 = input.nextInt();
		int s2=input.nextInt();
		int s3= input.nextInt();
		
		if((s1+s2>s3) ||(s2+s3>s1)||((s1+s3)>s2))
		{
			int perimeter = s1+s2+s3;
			System.out.println("Perimeter of Triangle is:");
			System.out.print(perimeter);
		}
		
		else 
			System.out.print("Please enter valid values");
		
		//close the scanner
		input.close();
	}

}
