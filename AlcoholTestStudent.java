import static org.junit.Assert.*;
import org.junit.Test;

public class AlcoholTestStudent {

    @Test
    public void testCalcPrice() {
        // Test for small alcohol on a weekday
        Alcohol alcohol1 = new Alcohol("Beer", Size.SMALL, false);
        assertEquals(4.0, alcohol1.calcPrice(), 0.01);

        // Test for medium alcohol on a weekend
        Alcohol alcohol2 = new Alcohol("Wine", Size.MEDIUM, true);
        assertEquals(7.5, alcohol2.calcPrice(), 0.01);

        // Test for large alcohol on a weekday
        Alcohol alcohol3 = new Alcohol("Whiskey", Size.LARGE, false);
        assertEquals(9.0, alcohol3.calcPrice(), 0.01);
    }

    @Test
    public void testEquals() {
        Alcohol alcohol1 = new Alcohol("Beer", Size.SMALL, false);
        Alcohol alcohol2 = new Alcohol("Beer", Size.SMALL, false);
        Alcohol alcohol3 = new Alcohol("Wine", Size.MEDIUM, true);

        // Test for equality between two alcohols with same attributes
        assertTrue(alcohol1.equals(alcohol2));

        // Test for equality between two alcohols with different attributes
        assertFalse(alcohol1.equals(alcohol3));
    }

    @Test
    public void testToString() {
        // Test for alcohol on a weekday
        Alcohol alcohol1 = new Alcohol("Beer", Size.SMALL, false);
        String expected1 = "Beer, SMALL, $4.0";
        assertEquals(expected1, alcohol1.toString());

        // Test for alcohol on a weekend
        Alcohol alcohol2 = new Alcohol("Wine", Size.MEDIUM, true);
        String expected2 = "Wine, MEDIUM Weekend, $7.5";
        assertEquals(expected2, alcohol2.toString());
    }

    
}
