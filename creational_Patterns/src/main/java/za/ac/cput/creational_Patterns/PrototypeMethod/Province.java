package za.ac.cput.creational_Patterns.PrototypeMethod;

/**
 * Created by student on 2015/03/11.
 */
public class Province implements Continent {

    private String provinceName;

    public Province(String provinceName){
        this.provinceName = provinceName;
    }

    @Override
    public Continent weCopy() {
        return new Province(provinceName);
    }

    @Override
    public String toString() {
        return "Province{" +
                "provinceName='" + provinceName + '\'' +
                '}';
    }
}
