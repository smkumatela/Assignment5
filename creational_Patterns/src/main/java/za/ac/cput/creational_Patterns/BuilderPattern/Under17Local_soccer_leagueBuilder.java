package za.ac.cput.creational_Patterns.BuilderPattern;

/**
 * Created by student on 2015/03/10.
 */
public class Under17Local_soccer_leagueBuilder implements Local_soccer_leagueBuilder {
    private Local_soccer_league local_soccer_league;

    public Under17Local_soccer_leagueBuilder(){
        local_soccer_league = new Local_soccer_league();
    }

    @Override
    public void buildKaizer_chiefs() {
        local_soccer_league.setKaizer_chiefs("Kaizer Chiefs Development");
    }

    @Override
    public void buildOlarndo_pirates() {
        local_soccer_league.setOlarndo_pirates("Olarndo Pirates Development");
    }

    @Override
    public void buildSundowns() {
        local_soccer_league.setSundowns("Mamelodi Sundowns Development");
    }

    @Override
    public void buildCeltics() {
        local_soccer_league.setCeltics("Bloemfontein Celtics Development");
    }

    @Override
    public Local_soccer_league getLocal_soccer_league() {
        return local_soccer_league;
    }
}
