package za.ac.cput.Assignment5Patterns;

import junit.framework.Assert;
import junit.framework.TestCase;
import org.junit.Test;
import za.ac.cput.Assignment5Patterns.CreationalPatterns.Calculator;

/**
 * Created by student on 2015/03/12.
 */
public class SingletonTest extends TestCase {
   @Test
    public void testCalculator() throws Exception {
       Calculator cal =  Calculator.getInstance();
       Calculator cal2 =  Calculator.getInstance();

       cal.add(2, 3);
       cal2.add(2, 4);

       Assert.assertEquals(cal2.hashCode(), cal.hashCode());
    }
}
