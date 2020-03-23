package practical5;

import java.util.Scanner;

public class CheckFourConsecutive {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter the number of values");
		int value = input.nextInt();
		int[] ArrayList = new int[value]; 
		
		for (int i=0;i<value;i++) {
			int val = input.nextInt();
			ArrayList[i] = val;
		}
		
		boolean result = isConsecutiveFour(ArrayList);
		if (result==true)
			System.out.println("contains four consecutive integers");
		else
			System.out.println("does not contains four consecutive integers");
	}
	
	public static boolean isConsecutiveFour(int[] values) {
	
		boolean output = true;
		if (values.length<4)
			output = false;
		
		else {
			for(int j=0;j<values.length-3;j++) {
				if(values[j]==values[j+1] && values[j+1]==values[j+2] && values[j+2]==values[j+3]) {
					output = true;
					break;
				}
				else
					output = false;
			}
		}
		
		return output;
	}

}
