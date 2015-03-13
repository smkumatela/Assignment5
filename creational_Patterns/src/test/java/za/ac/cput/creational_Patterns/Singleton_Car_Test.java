package za.ac.cput.creational_Patterns;

import junit.framework.Assert;
import junit.framework.TestCase;
import org.junit.Test;

/**
 * Created by student on 2015/03/05.
 */
public class Singleton_Car_Test extends TestCase {
   @Test
    public void test_Singleton_Car() throws Exception {
       Singleton_Car car = Singleton_Car.getInstance();
       Singleton_Car car2 = Singleton_Car.getInstance();

       car.Accelerate();
       car2.Accelerate();

       Assert.assertEquals(car.hashCode(), car2.hashCode());

    }
}
