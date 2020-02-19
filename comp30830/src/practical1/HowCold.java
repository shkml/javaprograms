package practical1;

import java.text.DecimalFormat;
import java.util.Scanner;

public class HowCold {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("#.##"); //Formatting number upto 2 decimal places

		int temperature = input.nextInt();
		int windSpeed = input.nextInt();

		if (temperature < -58 || temperature > 41) 
			System.out.print("Enter temperature between -58 and 41");

		else if (windSpeed<2)
			System.out.print("Enter wind speed greater than equal to 2");

		else {
			double cold = 35.74 + 0.6215*temperature-35.75*Math.pow(windSpeed,0.16)+
					0.4275*temperature*Math.pow(windSpeed,0.16);

			System.out.print(df.format(cold));
		}

		//close the scanner
		input.close();

	}
}
