//Komal Sharma 19200503

package example_19200503;

public class Q2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// test cases

		// Should print: true
		System.out.println("test case 1: " + contains("be", "be"));

		// Should print: false
		System.out.println("test case 2: " + contains("b", "be"));

		// Should print: false
		System.out.println("test case 3: " + contains("1234", "45"));

		// Should print: true
		System.out.println("test case 4: " + contains("sheep", "he"));		
	}

	// write this method
	public static boolean contains(String s1, String s2) {
		if(s1.length()<1 || s2.length()<1)
			return false;
		else {
			if (s1.contains(s2)) return true;
			else return false;
		}
		//return true;
	}
}
