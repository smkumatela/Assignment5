package za.ac.cput.creational_Patterns;

import junit.framework.Assert;
import junit.framework.TestCase;
import org.junit.Test;
import za.ac.cput.creational_Patterns.BuilderPattern.*;

/**
 * Created by student on 2015/03/10.
 */
public class Local_soccer_leagueTest  extends TestCase{
    @Test
    public void testLocal_soccer_league() throws Exception {
        Local_soccer_leagueBuilder localSoccerLeagueBuilder = new PSL_Local_soccer_leagueBuilder();
        Local_soccer_leagueDirector localSoccerLeagueDirector = new Local_soccer_leagueDirector(localSoccerLeagueBuilder);
        localSoccerLeagueDirector.constructLocal_soccer_league();
        Local_soccer_league localSoccerLeague = localSoccerLeagueDirector.getLocal_soccer_league();

        Local_soccer_leagueBuilder local_soccer_leagueBuilder = new PSL_Local_soccer_leagueBuilder();
        localSoccerLeagueDirector =  new Local_soccer_leagueDirector(localSoccerLeagueBuilder);
        localSoccerLeagueDirector.constructLocal_soccer_league();
        Local_soccer_league localSoccerLeague1 = localSoccerLeagueDirector.getLocal_soccer_league();



        Assert.assertEquals(localSoccerLeague, localSoccerLeague1);

    }
}
