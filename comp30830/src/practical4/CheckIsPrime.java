package practical4;

import java.util.Scanner;

public class CheckIsPrime {

	public static void main(String[] args) {

		int count = 0;
		int variable = 0;
		while(count<=10) {
			if(isPrime(variable)) {
				count+=1;
				System.out.println(variable);}
			variable++;
		}
	}

	public static boolean isPrime(int number) {

		int i =2;
		boolean value = true;
		while (i<number/2+1) {
			if (number%i==0)
				return false;
			else
				i++;
		}
		return value;
	}

}
