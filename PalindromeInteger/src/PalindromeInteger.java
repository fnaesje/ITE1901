
public class PalindromeInteger {

	public static boolean isPalindrome(int number) {
		// TODO Auto-generated method stub
		return number == reverseNumber(number);
	}

	private static int reverseNumber(int number) {
		int result = 0;
	    while (number != 0) {
	      int remainder = number % 10;

	      result = result * 10 + remainder;

	      number = number / 10;
	    }

	    return result;
	}

}
