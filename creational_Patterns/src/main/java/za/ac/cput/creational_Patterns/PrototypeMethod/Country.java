package za.ac.cput.creational_Patterns.PrototypeMethod;

/**
 * Created by student on 2015/03/11.
 */
public class Country implements Continent{

    private String countryCode;

    public Country(String countryCode){
        this.countryCode = countryCode;
    }

    @Override
    public Continent weCopy() {
        return new Country(countryCode);
    }

    @Override
    public String toString() {
        return "Country{" +
                "countryCode='" + countryCode + '\'' +
                '}';
    }
}
