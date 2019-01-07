package com.jung.paramvir.Achievements;

import com.jung.paramvir.app.GameStats;
import com.jung.paramvir.app.PlayerStats;

public class BigWinner extends Achievement {

    public BigWinner() {
        id = "BigWinner";
    }


    @Override
    public boolean isAwarded(GameStats gameStats, PlayerStats playerStats) {
        return playerStats.getTotalWins() >= 200;
    }
}
