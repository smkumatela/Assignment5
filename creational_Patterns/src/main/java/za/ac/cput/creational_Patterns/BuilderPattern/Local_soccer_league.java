package za.ac.cput.creational_Patterns.BuilderPattern;

/**
 * Created by student on 2015/03/10.
 */
public class Local_soccer_league {
    private String kaizer_chiefs;
    private String olarndo_pirates;
    private String sundowns;
    private String celtics;

    public String getKaizer_chiefs(){
        return kaizer_chiefs;
    }
    public void setKaizer_chiefs(String kaizer_chiefs){
        this .kaizer_chiefs = kaizer_chiefs;
    }

    public String getOlarndo_pirates(){
        return olarndo_pirates;
    }
    public void setOlarndo_pirates(String olarndo_pirates){
        this.olarndo_pirates = olarndo_pirates;
    }

    public String getSundowns(){
        return sundowns;
    }
    public void setSundowns(String sundowns){
        this.sundowns = sundowns;
    }

    public String getCeltics(){
        return celtics;
    }
    public void setCeltics(String celtics){
        this.celtics = celtics;
    }

    @Override
    public String toString() {
        return "Local_soccer_league{" +
                "kaizer_chiefs='" + kaizer_chiefs + '\'' +
                ", olarndo_pirates='" + olarndo_pirates + '\'' +
                ", sundowns='" + sundowns + '\'' +
                ", celtics='" + celtics + '\'' +
                '}';
    }
}


