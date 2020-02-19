package practical1;

import java.util.Scanner;

public class DistanceBetween2Points {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		int x1 = input.nextInt();
		int y1 = input.nextInt();
		int x2 = input.nextInt();
		int y2 = input.nextInt();

		double sqrt = Math.pow(x2-x1,2) + Math.pow(y2-y1,2);

		double distance = Math.sqrt(sqrt);

		System.out.print(distance);

		//close the scanner
		input.close();
	}
}
