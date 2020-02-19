package comp30830;

import java.util.Scanner;

public class CostOfTrip {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int distance = input.nextInt();
		double fuelEfficancy = input.nextInt();
		int price = input.nextInt();
		
		double cost = distance*(1/fuelEfficancy)*price;
		System.out.print(cost);
		
		//close the scanner
		input.close();
	}

}
