package com.jung.paramvir.Achievements;

import com.jung.paramvir.app.GameStats;
import com.jung.paramvir.app.PlayerStats;

public class Bruiser extends Achievement {

    public Bruiser() {
        id = "Bruiser";
    }

    @Override
    public boolean isAwarded(GameStats gameStats, PlayerStats playerStats) {
        return gameStats.getDamageDone() > 500;
    }
}
