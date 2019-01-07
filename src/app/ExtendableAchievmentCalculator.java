package app;

import Achievements.*;

import java.util.ArrayList;
import java.util.List;

public class ExtendableAchievmentCalculator {

    public List<Achievement> achievements;

    public ExtendableAchievmentCalculator() {
        init();
    }

    public void init() {
        //FIXME: make them singleton
        achievements = new ArrayList<>();
        achievements.add(new Bruiser());
        achievements.add(new BigWinner());
        achievements.add(new SharpShooter());
        achievements.add(new Veteran());

    }

    public List<Achievement> calculateAchievemntsForPlayer(GameStats gameStats, PlayerStats playerStats) {
        List<Achievement> awardedAchievements = new ArrayList<>();
        for (Achievement achievement : achievements) {
            if (achievement.isAwarded(gameStats, playerStats)) {
                awardedAchievements.add(achievement);
            }
        }
        return awardedAchievements;
    }


}
