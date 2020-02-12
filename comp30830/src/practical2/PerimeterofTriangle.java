package practical2;

import java.util.Scanner;

public class PerimeterofTriangle {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the sides of Triangle");
		
		//Read 3 inputs
		double s1 = input.nextDouble();
		double s2 = input.nextDouble();
		double s3 = input.nextDouble();
		
		if(s1+s2>s3 || s2+s3>s1|| s1+s3>s2)
		{
			double perimeter = s1+s2+s3;
			System.out.println("Perimeter of Triangle is:");
			System.out.print(perimeter);
		}
		
		else 
			System.out.print("Please enter valid values");
		
		//close the scanner
		input.close();
	}

}
