package practical5;

import java.util.Scanner;

public class IsArraySorted {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter the number of values");
		
		int value = input.nextInt();
		int[] ArrayList = new int[value]; 
		
		for (int i=0;i<value;i++) {
			int val = input.nextInt();
			ArrayList[i] = val;
		}
		
		System.out.println(isSorted(ArrayList));
	}
	
	public static boolean isSorted(int[] arr) {
		
		boolean result=true;
		for(int i=1;i<arr.length;i++) {
			if (arr[i]<arr[i-1])
				result = false;
			else
				result = true;
		}
		
		return result;
	}

}
