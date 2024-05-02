import static org.junit.Assert.*;
import org.junit.Test;

public class SmoothieTestStudent {
    
    @Test
    public void testCalcPrice() {
        // Test for small smoothie without protein and fruits
        Smoothie smoothie1 = new Smoothie("Berry Blast", Size.SMALL, 0, false);
        assertEquals(3.5, smoothie1.calcPrice(), 0.01);
        
        // Test for medium smoothie with protein and 2 fruits
        Smoothie smoothie2 = new Smoothie("Protein Punch", Size.MEDIUM, 2, true);
        assertEquals(7.0, smoothie2.calcPrice(), 0.01);
        
        // Test for large smoothie without protein and 3 fruits
        Smoothie smoothie3 = new Smoothie("Tropical Tango", Size.LARGE, 3, false);
        assertEquals(10.5, smoothie3.calcPrice(), 0.01);
    }
    
    @Test
    public void testEquals() {
        Smoothie smoothie1 = new Smoothie("Berry Blast", Size.SMALL, 0, false);
        Smoothie smoothie2 = new Smoothie("Berry Blast", Size.SMALL, 0, false);
        Smoothie smoothie3 = new Smoothie("Protein Punch", Size.MEDIUM, 2, true);
        
        
    }
}