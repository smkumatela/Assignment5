package za.ac.cput.creational_Patterns.BuilderPattern;

/**
 * Created by student on 2015/03/10.
 */
public class PSL_Local_soccer_leagueBuilder implements Local_soccer_leagueBuilder {

    private Local_soccer_league local_soccer_league;

    public PSL_Local_soccer_leagueBuilder(){
        local_soccer_league = new Local_soccer_league();
    }


    @Override
    public void buildKaizer_chiefs() {
        local_soccer_league.setKaizer_chiefs("Kaizer_chiefs");
    }

    @Override
    public void buildOlarndo_pirates() {
        local_soccer_league.setOlarndo_pirates("Orlando_pirates");
    }

    @Override
    public void buildSundowns() {
        local_soccer_league.setSundowns("sundowns");
    }

    @Override
    public void buildCeltics() {
        local_soccer_league.setCeltics("celtics");
    }

    @Override
    public Local_soccer_league getLocal_soccer_league() {
        return local_soccer_league;
    }
}
