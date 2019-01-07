package Achievements;

import app.GameStats;
import app.PlayerStats;

public class SharpShooter extends Achievement {

    public SharpShooter(){
        id = "SharpShooter";
    }


    @Override
    public boolean isAwarded(GameStats gameStats, PlayerStats playerStats) {
        return (float) gameStats.getNoOfHits() / gameStats.getNoOfAttacks() > 0.75;
    }
}
