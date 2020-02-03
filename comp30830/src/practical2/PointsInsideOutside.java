package practical2;

import java.util.Scanner;

public class PointsInsideOutside {

	public static void main(String[] args) {
		
		System.out.println("Enter the x and y coordinates: ");
		
		Scanner input = new Scanner(System.in);
		
		int x = input.nextInt();
		int y = input.nextInt();
		
		if ((Math.abs(x)<5) && (Math.abs(y)<2.5))
			System.out.println("Points are inside the rectangle");
		else if ((Math.abs(x)==5) && (Math.abs(y)==2.5))
			System.out.println("Points are on the edge");
		else 
			System.out.println("Points are outside the edge");
		
		//close the scanner
		input.close();
	}

}
