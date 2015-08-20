import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;
import static org.junit.matchers.JUnitMatchers.*;
import org.junit.*;

public class FormatIntegerTest {
	
	@Test
	public void zeroWidthShouldReturnNoLeadingZeros() {
		assertEquals("1",FormatInteger.format(1,0));
		//assertThat(FormatInteger.format(1,0),is(equalTo("1")));
		assertEquals("999",FormatInteger.format(999,0));
		//assertThat(FormatInteger.format(999,0),is(equalTo("999")));
	}
	
	@Test
	public void negativeNumbersShouldReturnNoLeadingZeroes() {
		assertEquals("-1",FormatInteger.format(-1,5));
		assertEquals("-999",FormatInteger.format(-999,5));
	}
	
	@Test
	public void sunnyDayScenarios() {
		assertEquals("01",FormatInteger.format(1,2));
		assertEquals("00999",FormatInteger.format(999,5));
	}
	
	@Test
	public void maxIntWithoutWidthShouldReturnNoLeadingZeros() {
		// Arrange
		String stringWithMAX_VALUE = "" + Integer.MAX_VALUE;
		// Act + Assert
		assertEquals(stringWithMAX_VALUE,FormatInteger.format(Integer.MAX_VALUE,0));
		// assertThat(FormatInteger.format(Integer.MAX_VALUE,0), is(equalTo(stringWithMAX_VALUE)));
    }
	@Test
	
	public void maxIntWithWidthShouldReturnLeadingZeros() {
		// Arrange
		String stringWithMAX_VALUE = "" + Integer.MAX_VALUE;
		// Act + Assert
		assertEquals("00"+stringWithMAX_VALUE,FormatInteger.format(Integer.MAX_VALUE,stringWithMAX_VALUE.length()+2));
		// assertThat(FormatInteger.format(Integer.MAX_VALUE,stringWithMAX_VALUE.length()+2), is(equalTo("00"+stringWithMAX_VALUE)));
    }
}
