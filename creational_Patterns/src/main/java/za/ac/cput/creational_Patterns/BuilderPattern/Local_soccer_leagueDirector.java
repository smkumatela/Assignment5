package za.ac.cput.creational_Patterns.BuilderPattern;

/**
 * Created by student on 2015/03/10.
 */
public class Local_soccer_leagueDirector {
    private Local_soccer_leagueBuilder local_soccer_leagueBuilder = null;

    public Local_soccer_leagueDirector(Local_soccer_leagueBuilder local_soccer_leagueBuilder){
        this.local_soccer_leagueBuilder = local_soccer_leagueBuilder;
    }

    public void constructLocal_soccer_league(){
        local_soccer_leagueBuilder.buildKaizer_chiefs();
        local_soccer_leagueBuilder.buildOlarndo_pirates();
        local_soccer_leagueBuilder.buildSundowns();
        local_soccer_leagueBuilder.buildCeltics();
    }

    public Local_soccer_league getLocal_soccer_league(){
        return local_soccer_leagueBuilder.getLocal_soccer_league();
    }
}
