//Komal Sharma 19200503

package example_19200503;

public class Q1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Should print: "M1ss2ss3pp4"
		System.out.println("test case 1: " + replace("Mississippi", 'i'));

		// Should print: "Hello World"
		System.out.println("test case 2: " + replace("Hello World", 'w'));

		// Should print: "1134"
		System.out.println("test case 3: " + replace("1234", '2'));
	}

	// write this method
	public static String replace(String str, char ch) {
		String newStr = "";
		int count = 1;
		for (int i =0;i<str.length();i++) {
			if(str.charAt(i)!=ch) 
				newStr+=str.charAt(i);
			else {
				newStr+=count;
				count++;
			}
		}
		return newStr;
	}

}
