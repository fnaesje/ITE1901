import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.List;

import org.junit.Test;
import org.junit.runner.*;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

@RunWith(Parameterized.class)
public class ParameterizedPalindromeIntegerTest {
	private boolean expected;
	private int input;

	@Parameters
	public static List<Object[]> init() {
		return Arrays.asList(new Object[][] {
			{121, true},
			{12321, true},
			{123, false}});
	}
	
	public ParameterizedPalindromeIntegerTest(int input, boolean expected) {
		this.input = input;
		this.expected = expected;
	}
	
	@Test
	public void test() {
		assertEquals(expected, PalindromeInteger.isPalindrome(input));
	}
}