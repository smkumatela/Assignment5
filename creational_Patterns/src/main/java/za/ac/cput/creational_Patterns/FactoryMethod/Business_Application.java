package za.ac.cput.creational_Patterns;

import za.ac.cput.creational_Patterns.FactoryMethod.IT_Department;

/**
 * Created by student on 2015/03/06.
 */
public class Business_Application implements IT_Department {

    @Override
    public String Stream() {
        return "Business Analysts";
    }
}
