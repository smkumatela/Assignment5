package za.ac.cput.creational_Patterns;

import junit.framework.Assert;
import junit.framework.TestCase;
import org.junit.Test;
import za.ac.cput.creational_Patterns.FactoryMethod.IT_Department;
import za.ac.cput.creational_Patterns.FactoryMethod.IT_Department_Factory;

/**
 * Created by student on 2015/03/06.
 */
public class IT_Department_Factory_Test extends TestCase {
    @Test
    public void testIT_Department_Factory_Test() throws Exception {
        IT_Department_Factory it_department_factory = new IT_Department_Factory();

        IT_Department choose = it_department_factory.getIT_Department_Stream("Software Development");

        IT_Department chest = it_department_factory.getIT_Department_Stream("Software Development");

     /*   IT_Department_Factory choose;// = IT_Department_Factory.getInstance();
        choose = IT_Department_Factory.getInstance();
        IT_Department_Factory chest;// = IT_Department_Factory.getInstance();
        chest = IT_Department_Factory.getInstance(); */

        //choose.getIT_Department_Stream("Programmer");

        //Assert.assertEquals(chest.getIT_Department_Stream("Software_Development"), choose.getIT_Department_Stream("Software_Development"));

        Assert.assertEquals(chest.Stream(), choose.Stream());
        System.out.println(chest.Stream());
    }
}
