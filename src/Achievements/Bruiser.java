package Achievements;

import app.GameStats;
import app.Player;
import app.PlayerStats;

public class Bruiser extends Achievement {

    public Bruiser() {
        id = "Bruiser";
    }

    public boolean calculateEligibility(GameStats stats){
        return false;
    }

    @Override
    public boolean isAwarded(GameStats gameStats, PlayerStats playerStats) {
        return gameStats.getDamageDone() > 500;
    }
}
