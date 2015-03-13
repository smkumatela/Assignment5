package za.ac.cput.creational_Patterns.FactoryMethod;

import za.ac.cput.creational_Patterns.Business_Application;

/**
 * Created by student on 2015/03/06.
 */
public class IT_Department_Factory {
    private static IT_Department_Factory choose = null;

    public IT_Department_Factory(){
    }

    public static IT_Department_Factory getInstance() {
        if (choose == null){
            return new IT_Department_Factory();
    }
        return choose;
    }

    public IT_Department getIT_Department_Stream(String choice){
        if("Software_Development".equalsIgnoreCase(choice)){
            return new Software_Develoment();
        }
        else
        {
            return new Business_Application();
        }
    }
}

