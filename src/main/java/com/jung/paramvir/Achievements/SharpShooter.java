package com.jung.paramvir.Achievements;

import com.jung.paramvir.app.GameStats;
import com.jung.paramvir.app.PlayerStats;

public class SharpShooter extends Achievement {

    public SharpShooter(){
        id = "SharpShooter";
    }


    @Override
    public boolean isAwarded(GameStats gameStats, PlayerStats playerStats) {
        return (float) gameStats.getNoOfHits() / gameStats.getNoOfAttacks() > 0.75;
    }
}
