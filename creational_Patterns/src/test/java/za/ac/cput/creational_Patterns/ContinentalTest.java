package za.ac.cput.creational_Patterns;

import junit.framework.Assert;
import junit.framework.TestCase;
import org.junit.Test;
import za.ac.cput.creational_Patterns.PrototypeMethod.Country;
import za.ac.cput.creational_Patterns.PrototypeMethod.Province;

/**
 * Created by student on 2015/03/11.
 */
public class ContinentalTest extends TestCase {
    @Test
    public void testContinentalTest() throws Exception{
        Country country1 = new Country("SA");
        Country country2 = (Country) country1.weCopy();
        Country country3 = (Country) country1.weCopy();

        Province prov1 = new Province("CPT");
        Province prov2 = (Province) prov1.weCopy();

        Assert.assertEquals(country2.toString(), country1.toString());
        Assert.assertEquals(country3.toString(), country2.toString());

        Assert.assertEquals(prov2.toString(), prov1.toString());
    }
}
