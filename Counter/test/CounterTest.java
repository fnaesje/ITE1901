import static org.junit.Assert.*;
import org.junit.*;
import static org.hamcrest.CoreMatchers.*;

public class CounterTest {
    Counter counter1;

    @Before
    public void setUp() {
        counter1 = new Counter();
    } 

    @Test
    public void testIncrement() {
        assertTrue(counter1.increment() == 1);        
        assertThat(counter1.increment(), is(2)); // demo Hamcrest
     }

    @Test
    public void testDecrement() {
        assertTrue(counter1.decrement() == -1);
        assertEquals(-2, counter1.decrement());
    }
    @Test
    public void testMax() {
        counter1 = new Counter(Integer.MAX_VALUE);
    	assertTrue(counter1.increment() == Integer.MAX_VALUE);
       
    }
}

