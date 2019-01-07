package com.jung.paramvir.app;

import com.jung.paramvir.Achievements.Achievement;

import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Objects;

public class Player {

    private String playerId;
    private Map<String, GameStats> gameStats;
    private LinkedHashSet<Achievement> achievements;
    private PlayerStats playerStats;

    public String getPlayerId() {
        return playerId;
    }

    public void setPlayerId(String playerId) {
        this.playerId = playerId;
    }

    public Map<String, GameStats> getGameStats() {
        return gameStats;
    }

    public void setGameStats(Map<String, GameStats> gameStats) {
        this.gameStats = gameStats;
    }

    public LinkedHashSet<Achievement> getAchievements() {
        return achievements;
    }

    public void setAchievements(LinkedHashSet<Achievement> achievements) {
        this.achievements = achievements;
    }

    public PlayerStats getPlayerStats() {
        return playerStats;
    }

    public void setPlayerStats(PlayerStats playerStats) {
        this.playerStats = playerStats;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Player player = (Player) o;
        return Objects.equals(playerId, player.playerId);
    }

    @Override
    public int hashCode() {

        return Objects.hash(playerId);
    }

    @Override
    public String toString() {
        return "Player{" +
                "playerId='" + playerId + '\'' +
               // ", gameStats=" + gameStats +
                ", achievements=" + achievements +
                ", playerStats=" + playerStats +
                '}';
    }
}
