package Achievements;

import app.GameStats;
import app.PlayerStats;

public class Bruiser extends Achievement {

    public Bruiser() {
        id = "Bruiser";
    }

    @Override
    public boolean isAwarded(GameStats gameStats, PlayerStats playerStats) {
        return gameStats.getDamageDone() > 500;
    }
}
