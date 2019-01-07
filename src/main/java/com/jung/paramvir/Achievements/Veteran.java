package com.jung.paramvir.Achievements;


import com.jung.paramvir.app.GameStats;
import com.jung.paramvir.app.PlayerStats;

public class Veteran extends Achievement {
    public Veteran() {
        id = "Veteran";
    }

    @Override
    public boolean isAwarded(GameStats gameStats, PlayerStats playerStats) {
        return playerStats.getTotalGamesPlayed() > 1000;
    }
}
