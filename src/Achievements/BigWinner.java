package Achievements;

import app.GameStats;
import app.PlayerStats;

public class BigWinner extends Achievement {

    public BigWinner() {
        id = "BigWinner";
    }


    @Override
    public boolean isAwarded(GameStats gameStats, PlayerStats playerStats) {
        return playerStats.getTotalWins() >= 200;
    }
}
