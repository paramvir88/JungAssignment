package com.jung.paramvir.app;

import com.jung.paramvir.Achievements.*;

import java.util.ArrayList;
import java.util.List;

public class AchievementSystem {

    public List<Achievement> achievements;

    public AchievementSystem() {
        init();
    }

    public void init() {
        //FIXME: make them singleton
        achievements = new ArrayList<>();
        achievements.add(new Bruiser());
        achievements.add(new BigWinner());
        achievements.add(new SharpShooter());
        achievements.add(new Veteran());
        achievements.add(new NewAchievement());

    }

    public List<Achievement> calculateAchievemntsForPlayer(String playerId, GameStats gameStats, PlayerStats playerStats) {
        List<Achievement> awardedAchievements = new ArrayList<>();
        for (Achievement achievement : achievements) {
            if (achievement.isAwarded(gameStats, playerStats)) {
                awardedAchievements.add(achievement);
                System.out.println("Achievement = " + achievement.getId() + " is being awarded to " + playerId);
            }
        }
        return awardedAchievements;
    }


}
