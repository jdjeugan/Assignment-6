import static org.junit.Assert.*;
import org.junit.Test;

public class BevShopTestStudent {

    @Test
    public void testIsValidTime() {
        BevShop bevShop = new BevShop();

        // Test for valid time
        assertTrue(bevShop.isValidTime(12));

        // Test for invalid time
        assertFalse(bevShop.isValidTime(8));
    }

    @Test
    public void testIsValidAge() {
        BevShop bevShop = new BevShop();

        // Test for valid age
        assertTrue(bevShop.isValidAge(25));

        // Test for invalid age
        assertFalse(bevShop.isValidAge(17));
    }

    @Test
    public void testIsEligibleForMore() {
        BevShop bevShop = new BevShop();

        // Test when the number of alcohol in order is less than 3
        bevShop.processAlcoholOrder("Beer", Size.MEDIUM);
        assertTrue(bevShop.isEligibleForMore());

        // Test when the number of alcohol in order is 3
        bevShop.processAlcoholOrder("Wine", Size.SMALL);
        bevShop.processAlcoholOrder("Whiskey", Size.LARGE);
        assertFalse(bevShop.isEligibleForMore());
    }

    @Test
    public void testIsMaxFruit() {
        BevShop bevShop = new BevShop();

        
    }

    
}

