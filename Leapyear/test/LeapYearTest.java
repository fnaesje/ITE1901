import static org.junit.Assert.*;

import org.junit.Test;

public class LeapYearTest {

	@Test
	public void OddYearShouldAlwaysFail() {
		assertFalse(LeapYear.isLeapyear(1));
	}
	
	@Test
	public void dividableWith100ShouldNotBeLeapyear() {
		assertFalse(LeapYear.isLeapyear(100));
	}
	
	@Test
	public void dividableWith400ShouldBeLeapyear() {
		assertTrue(LeapYear.isLeapyear(400));
	}
	
	@Test
	public void dividableWith4ShouldBeLeapyear() {
		assertTrue(LeapYear.isLeapyear(2016));
	}
}
