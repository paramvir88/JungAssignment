package com.jung.paramvir.Achievements;

import com.jung.paramvir.app.GameStats;
import com.jung.paramvir.app.PlayerStats;

/**
 * New achievement added as per assignment problem statment, The name is intentionally given so as to differentiate easily.
 */
public class NewAchievement extends Achievement {


    public NewAchievement() {
        id = "New Achievement";
    }

    @Override
    public boolean isAwarded(GameStats gameStats, PlayerStats playerStats) {
        /*
        The achievement is added if the 'newStatistic + noOfKills > 100'
         */

        return gameStats.getNewStatistic() + gameStats.getNoOfKills() > 1000;
    }
}
