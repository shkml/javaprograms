//Komal Sharma 19200503

package example_19200503;

public class Q3 {

	public static void main(String[] args) {
		// Test case 1
		char[] c1 = {}; // i.e. an array with zero elements
		char[] d1 = getDistinctLCLetters(c1);
		System.out.println("test case 1:");
		printArray(c1); // should print: {}, i.e. an array with zero elements
		printArray(d1); // should print: {}, i.e. an array with zero elements
		System.out.println();

		// Test case 2
		char[] c2 = {'B', 'E', 'E'};
		char[] d2 = getDistinctLCLetters(c2);
		System.out.println("test case 2:");
		printArray(c2); // should print: {B, E, E}
		printArray(d2); // should print: {}, i.e. an array with zero elements
		System.out.println();

		// Test case 3
		char[] c3 = {'B', 'e', 'e'};
		char[] d3 = getDistinctLCLetters(c3);
		System.out.println("test case 3:");
		printArray(c3); // should print: {B, e, e}
		printArray(d3); // should print: {e}
		System.out.println();

		// Test case 4
		char[] c4 = {'a', 'b', 'b', 'a'};
		char[] d4 = getDistinctLCLetters(c4);
		System.out.println("test case 4:");
		printArray(c4); // should print: {a, b, b, a}
		printArray(d4); // should print: {a, b}
		System.out.println();
	}

	// This method prints the values in arr
	public static void printArray(char[] arr) {
		System.out.print("{");

		for (int i = 0; i < arr.length - 1; i++)
			System.out.print(arr[i] + ", ");

		if (arr.length > 0)
			System.out.print(arr[arr.length - 1]);

		System.out.println("}");		
	}

	// Referenced from solutions uploaded by Professor
	public static char[] getDistinctLCLetters(char[] arr) {
		boolean[] chars = new boolean[26];
		
		for (int i=0;i<arr.length;i++) {
			if(arr[i]>='a' && arr[i]<='z')
				chars[arr[i]-'a']=true;
		}
		
		int count =0;
		for (boolean b:chars)
			if(b)
				count++;
		
		char[] distinctLetters = new char[count];
		
		int countNew = 0;
		for(int i=0;i<chars.length;i++) {
			if(chars[i])
				distinctLetters[countNew++] = (char)('a' + i);
		}
		return distinctLetters;
	}

}
