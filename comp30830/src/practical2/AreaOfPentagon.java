package practical2;

import java.util.Scanner;

public class AreaOfPentagon {

	public static void main(String[] args) {

		System.out.println("Enter the radius from the center of a pentagon");
		Scanner input = new Scanner(System.in);
		
		int radius = input.nextInt();
		
		if (radius>0) {
			double sideOfPentagon = 2*radius*Math.sin(Math.PI/5.0);
			
			double areaOfPentagon = (5*Math.pow(sideOfPentagon,2))/(4.0*Math.tan(Math.PI/5.0));
			
			System.out.println(areaOfPentagon);
		}
		
		else System.out.println("Enter valid value of radius.");
		
		//close the scanner
		input.close();
	}

}
