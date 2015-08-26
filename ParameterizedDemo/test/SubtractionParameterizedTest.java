import static org.junit.Assert.assertEquals;
import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

@RunWith(Parameterized.class)
public class SubtractionParameterizedTest {

	private int expected;
	private int first;
	private int second;

	public SubtractionParameterizedTest(int expectedResult, int firstNumber,
			int secondNumber) {
		this.expected = expectedResult;
		this.first = firstNumber;
		this.second = secondNumber;
	}

	@Parameters
	// metodenavn under kan være hva som helst
	public static Collection<Integer[]> numbersToBeSubtracted() {
		return Arrays.asList(new Integer[][] { { 3, 5, 2 }, { 7, 10, 3 },
				{ 1, 3, 2 }, { 0, 4, 5 }
				});
	}

	@Test
	public void subtractWithVariousNormalInput() {
		assertEquals(expected, Subtraction.subtract(first, second));
	}
}