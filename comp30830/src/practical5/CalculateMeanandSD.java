package practical5;

import java.util.Scanner;

public class CalculateMeanandSD {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter the number of values");
		
		int value = input.nextInt();
		
		int count = 0;
		double sumArray = 0;
		double sumSD = 0;
		
		double[] mylist = new double[value]; 
		
		//Assign values in array
		for (int i=0;i<value;i++) {
			double val = input.nextDouble();
			mylist[i] = val;
		}
		
		for (int j=0;j<value;j++)
			sumArray+=mylist[j];
		
		for (int k =0;k<value;k++)
			sumSD = Math.pow(mylist[k]-sumArray,2);
		
		double SD = Math.sqrt(sumSD/(value-1));
		System.out.println("Mean "+sumArray/value+" and SD "+SD);
	}

}
