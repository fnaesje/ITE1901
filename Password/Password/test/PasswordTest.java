import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;
import static org.junit.matchers.JUnitMatchers.*;


import org.junit.Test;

public class PasswordTest {

	@Test
	public void passwordWithOnlyDigitsShouldPass() {
		String passw = "1234567890";
		assertTrue(Password.checkPassword(passw));
	}
	@Test
	public void passwordWithLessThan3DigitsShouldFail() {
		String passw = "12abcDEFGH";
		assertFalse(Password.checkPassword(passw));
	}
	@Test
	public void passwordWithOnlyLettersShouldFail() {
		String passw = "abcdefghijklm";
		assertFalse(Password.checkPassword(passw));
	}
	@Test
	public void tooShortPasswordShouldFail() {
		String passw = "abc123";
		assertFalse(Password.checkPassword(passw));
	}
	@Test
	public void passwordWithOtherThanLettersORDigitsShouldFail() {
		String passw = "abc123#+";
		assertFalse(Password.checkPassword(passw));
		//assertThat(Password.checkPassword(passw),is(true));
	}
}