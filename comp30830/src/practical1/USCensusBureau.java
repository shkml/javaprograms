package practical1;

import java.util.*;

class USCensusBureau {

	public static void main(String[] args) {
		final long population = 312032386;
		double birthsInDay= 3600*1/7.0; //to get the exact value we need to specify the type of the denominator.
		double deaths = 3600*1/13.0;
		double migrants = 3600*1/45.0;

		System.out.print(birthsInDay);

		Scanner input = new Scanner(System.in);
		int years = input.nextInt();

		double updatePop = population + (birthsInDay-deaths+migrants)*24*365*years; 

		System.out.print(updatePop);

		//close the scanner means closing a file as have used it
		input.close();
	}
}
