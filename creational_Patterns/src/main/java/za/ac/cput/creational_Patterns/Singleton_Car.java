package za.ac.cput.creational_Patterns;

/**
 * Created by student on 2015/03/05.
 */
public class Singleton_Car {
    private static Singleton_Car car = null;

    private Singleton_Car(){
    }

    public static Singleton_Car getInstance(){
        if(car == null){
            car = new Singleton_Car();
        }
        return car;
    }

    public String Accelerate(){
        return "Acceleration";
    }

    public String Shift(){
        return "Change Gears";
    }

    public String Brake(){
        return "Apply Brakes";
    }
}
