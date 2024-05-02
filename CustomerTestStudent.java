import static org.junit.Assert.*;
import org.junit.Test;

public class CustomerTestStudent {

    @Test
    public void testToString() {
        Customer customer = new Customer("John Doe", 30);
        String expected = "Customer [name=John Doe, age=30]";
        assertEquals(expected, customer.toString());
    }

    @Test
    public void testGettersAndSetters() {
        Customer customer = new Customer("John Doe", 30);

        // Test getters
        assertEquals("John Doe", customer.getName());
        assertEquals(30, customer.getAge());

        // Test setters
        customer.setName("Jane Doe");
        customer.setAge(35);
        assertEquals("Jane Doe", customer.getName());
        assertEquals(35, customer.getAge());
    }

    @Test
    public void testCopyConstructor() {
        Customer originalCustomer = new Customer("John Doe", 30);
        Customer copiedCustomer = new Customer(originalCustomer);

        
    }
}
