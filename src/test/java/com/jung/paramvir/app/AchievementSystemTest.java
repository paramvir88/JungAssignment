package com.jung.paramvir.app;


import com.jung.paramvir.Achievements.Achievement;
import com.jung.paramvir.Achievements.Bruiser;
import com.jung.paramvir.Achievements.SharpShooter;
import com.jung.paramvir.Achievements.Veteran;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.List;

public class AchievementSystemTest {

    private AchievementSystem achievementSystem;

    @Before
    public void setup() {
        achievementSystem = new AchievementSystem();
    }

    @Test
    public void testCalculateAchievementForBruiser() {
        GameStats gameStats = new GameStats();
        gameStats.setDamageDone(501);
        List<Achievement> achievements = achievementSystem.calculateAchievemntsForPlayer("player", gameStats, new PlayerStats());
        Assert.assertTrue(achievements.contains(new Bruiser()));
    }

    @Test
    public void testCalculateAchievementForSharpShooterAwarded() {
        GameStats gameStats = new GameStats();
        gameStats.setNoOfAttacks(100);
        gameStats.setNoOfHits(80);
        List<Achievement> achievements = achievementSystem.calculateAchievemntsForPlayer("player", gameStats, new PlayerStats());
        Assert.assertTrue(achievements.contains(new SharpShooter()));
    }

    @Test
    public void testCalculateAchievementForSharpShooterNotAwarded() {
        GameStats gameStats = new GameStats();
        gameStats.setNoOfAttacks(100);
        gameStats.setNoOfHits(70);
        List<Achievement> achievements = achievementSystem.calculateAchievemntsForPlayer("player", gameStats, new PlayerStats());
        Assert.assertFalse(achievements.contains(new SharpShooter()));
    }

    @Test
    public void testCalculateAchievementForVeteran() {
        PlayerStats playerStats = new PlayerStats();
        playerStats.setTotalGamesPlayed(1110);
        List<Achievement> achievements = achievementSystem.calculateAchievemntsForPlayer("player", new GameStats(), playerStats);
        Assert.assertTrue(achievements.contains(new Veteran()));
    }

    @Test
    public void testCalculateAchievementForBigWinner() {
        GameStats gameStats = new GameStats();
        gameStats.setDamageDone(501);
        List<Achievement> achievements = achievementSystem.calculateAchievemntsForPlayer("player", gameStats, new PlayerStats());
        Assert.assertTrue(achievements.contains(new Bruiser()));
    }


}