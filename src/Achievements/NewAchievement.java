package Achievements;

import app.GameStats;
import app.PlayerStats;

/**
 * New achievement added as per assignment problem statment, The name is intentionally given so as to differentiate easily.
 */
public class NewAchievement extends Achievement {


    @Override
    public boolean isAwarded(GameStats gameStats, PlayerStats playerStats) {
        /*
        The achievement is added if the 'newStatistic + noOfKills > 100'
         */

        return gameStats.getNewStatistic() + gameStats.getNoOfKills() > 100;
    }
}
