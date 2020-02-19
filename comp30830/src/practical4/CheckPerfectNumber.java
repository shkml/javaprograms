package practical4;

public class CheckPerfectNumber {

	public static void main(String[] args) {

		System.out.println("Program is getting started!");
		int count = 0;
		int variable = 1;
		while(count<=4) {
			if(isPerfectNumber(variable)) {
				System.out.println(variable);
				count+=1;
			}
			variable++;
		}
	}

	public static boolean isPerfectNumber(int number) {
		int i = number - 1;
		int sum = 0;
		while (i>=1) {
			if (number%i==0) 
				sum+=i;
			i--;
		}
		return number ==sum	;
	}
}
