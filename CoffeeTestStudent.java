import static org.junit.Assert.*;
import org.junit.Test;

public class CoffeeTestStudent {

    @Test
    public void testCalcPrice() {
        // Test for small coffee without extra shot and syrup
        Coffee coffee1 = new Coffee("Espresso", Size.SMALL, false, false);
        assertEquals(2.5, coffee1.calcPrice(), 0.01);

        // Test for medium coffee with extra shot and syrup
        Coffee coffee2 = new Coffee("Latte", Size.MEDIUM, true, true);
        assertEquals(5.0, coffee2.calcPrice(), 0.01);

        // Test for large coffee with extra syrup
        Coffee coffee3 = new Coffee("Cappuccino", Size.LARGE, false, true);
        assertEquals(4.5, coffee3.calcPrice(), 0.01);
    }

    @Test
    public void testEquals() {
        Coffee coffee1 = new Coffee("Espresso", Size.SMALL, false, false);
        Coffee coffee2 = new Coffee("Espresso", Size.SMALL, false, false);
        Coffee coffee3 = new Coffee("Latte", Size.MEDIUM, true, true);

        // Test for equality between two coffees with same attributes
        assertTrue(coffee1.equals(coffee2));

        // Test for equality between two coffees with different attributes
        assertFalse(coffee1.equals(coffee3));
    }

    @Test
    public void testToString() {
        // Test for coffee without extra shot and syrup
        Coffee coffee1 = new Coffee("Espresso", Size.SMALL, false, false);
        String expected1 = "Espresso, SMALL, $2.5";
        assertEquals(expected1, coffee1.toString());

        // Test for coffee with extra shot and syrup
        Coffee coffee2 = new Coffee("Latte", Size.MEDIUM, true, true);
        String expected2 = "Latte, MEDIUM Extra shot Extra syrup, $5.0";
        assertEquals(expected2, coffee2.toString());
    }

    @Test
    public void testGettersAndSetters() {
        Coffee coffee = new Coffee("Espresso", Size.SMALL, false, false);

        
    }
}
