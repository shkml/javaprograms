package comp30830;

import java.util.*;

public class practicals {

	public static void main(String[] args) {
		
		//opening the scanner
		Scanner input = new Scanner(System.in);
		
		//input radius and length
		int radius = input.nextInt();
		int length = input.nextInt();
		
		//calculate the area and volume of the cylinder
		double area = Math.PI*Math.pow(radius, 2)*length;
		double volume = area*length;
		System.out.println(String.format("Area: %f, Volume: %f", area, volume));
		
		//close the scanner
		input.close();
	}

}
