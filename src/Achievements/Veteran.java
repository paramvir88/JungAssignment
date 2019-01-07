package Achievements;


import app.GameStats;
import app.PlayerStats;

public class Veteran extends Achievement {
    public Veteran() {
        id = "Veteran";
    }

    @Override
    public boolean isAwarded(GameStats gameStats, PlayerStats playerStats) {
        return playerStats.getTotalGamesPlayed() > 1000;
    }
}
