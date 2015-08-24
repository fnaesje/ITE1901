import static org.junit.Assert.*;

import org.junit.Test;

public class PalindromeIntegerTest {

	@Test
	public void aSingleIntegerShouldBePalindrome() {
		assertTrue(PalindromeInteger.isPalindrome(1));
	}
	
	@Test
	public void TwoIntegersCannotBePalindrome() {
		assertFalse(PalindromeInteger.isPalindrome(12));
	}
	
	@Test
	public void sameNumberRepeatedShouldBePalindrome() {
		assertTrue(PalindromeInteger.isPalindrome(99999));
	}
	
	@Test
	public void legalPalindromeShouldReturnTrue() {
		assertTrue(PalindromeInteger.isPalindrome(12321));
	}
	
	@Test
	public void illeLegalPalindromeShouldReturnFalse() {
		assertFalse(PalindromeInteger.isPalindrome(123456));
	}
}
