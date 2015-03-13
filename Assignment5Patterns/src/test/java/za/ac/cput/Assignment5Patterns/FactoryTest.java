package za.ac.cput.Assignment5Patterns;

import junit.framework.Assert;
import junit.framework.TestCase;
import org.junit.Test;
import za.ac.cput.Assignment5Patterns.CreationalPatterns.FactoryMethod.Employee;
import za.ac.cput.Assignment5Patterns.CreationalPatterns.FactoryMethod.EmployeeFactory;

/**
 * Created by student on 2015/03/13.
 */
public class FactoryTest extends TestCase {
    @Test
    public void testEmployee() throws Exception {
        EmployeeFactory employeeFactory = new EmployeeFactory();

        Employee emp1 = employeeFactory.getEmployeeRole("Lecturer");
        Employee emp2 = employeeFactory.getEmployeeRole("Lecturer");

        Assert.assertEquals(emp2.role(), emp1.role());
    }
}
