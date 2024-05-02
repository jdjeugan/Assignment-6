import static org.junit.Assert.*;
import org.junit.Test;
import java.util.ArrayList;

public class OrderTestStudent {
    
    @Test
    public void testIsWeekend() {
        // Test for Saturday
        Order order1 = new Order(12, Day.SATURDAY, new Customer("John", 17));
        assertTrue(order1.isWeekend());
        
        // Test for Monday
        Order order2 = new Order(12, Day.MONDAY, new Customer("John", 11));
        assertFalse(order2.isWeekend());
    }
    
    @Test
    public void testAddNewBeverage() {
        Order order = new Order(12, Day.MONDAY, new Customer("John", 12));
        
        // Adding a coffee
        order.addNewBeverage("Latte", Size.MEDIUM, true, false);
        assertEquals(1, order.getTotalItems());
        
        // Adding an alcohol
        order.addNewBeverage("Beer", Size.LARGE);
        assertEquals(2, order.getTotalItems());
        
        // Adding a smoothie
        order.addNewBeverage("Fruit Smoothie", Size.SMALL, 3, true);
        assertEquals(3, order.getTotalItems());
    }
    
    @Test
    public void testCalcOrderTotal() {
        Order order = new Order(12, Day.MONDAY, new Customer("John", 12));
        
        // Adding beverages
        order.addNewBeverage("Latte", Size.MEDIUM, true, false);
        order.addNewBeverage("Beer", Size.LARGE);
        order.addNewBeverage("Fruit Smoothie", Size.SMALL, 3, true);
        
        // Expected total: 5.5 (Latte) + 8.0 (Beer) + 7.5 (Smoothie) = 21.0
        assertEquals(21.0, order.calcOrderTotal(), 0.01);
    }
    
    @Test
    public void testFindNumOfBeveType() {
        Order order = new Order(12, Day.MONDAY, new Customer("John", 12));
        
        // Adding beverages
        order.addNewBeverage("Latte", Size.MEDIUM, true, false);
        order.addNewBeverage("Beer", Size.LARGE);
        order.addNewBeverage("Fruit Smoothie", Size.SMALL, 3, true);
        
        // Expected number of alcoholic beverages: 1
        assertEquals(1, order.findNumOfBeveType(Type.ALCOHOL));
        
        // Expected number of coffee beverages: 1
        assertEquals(1, order.findNumOfBeveType(Type.COFFEE));
        
        // Expected number of smoothie beverages: 1
        assertEquals(1, order.findNumOfBeveType(Type.SMOOTHIE));
    }
    
    @Test
    public void testCompareTo() {
        Order order1 = new Order(12, Day.MONDAY, new Customer("John", 32));
        Order order2 = new Order(12, Day.MONDAY, new Customer("Jane", 12));
        Order order3 = new Order(13, Day.MONDAY, new Customer("John", 13));
        
    }
}

