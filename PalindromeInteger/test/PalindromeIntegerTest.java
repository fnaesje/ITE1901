import static org.junit.Assert.*;

import org.junit.*;
import org.junit.experimental.categories.Category;


public class PalindromeIntegerTest {

	@Test
	@Category(GoodTestsCategory.class)
	public void aSingleIntegerShouldBePalindrome() {
		assertTrue(PalindromeInteger.isPalindrome(1));
	}
	
	@Test
	public void TwoIntegersCannotBePalindrome() {
		assertFalse(PalindromeInteger.isPalindrome(12));
	}
	
	@Test
	@Category(GoodTestsCategory.class)
	public void sameNumberRepeatedShouldBePalindrome() {
		assertTrue(PalindromeInteger.isPalindrome(99999));
	}
	
	@Test
	@Category(GoodTestsCategory.class)
	public void legalPalindromeShouldReturnTrue() {
		assertTrue(PalindromeInteger.isPalindrome(12321));
	}
	
	@Test
	public void illeLegalPalindromeShouldReturnFalse() {
		assertFalse(PalindromeInteger.isPalindrome(123456));
	}
}
