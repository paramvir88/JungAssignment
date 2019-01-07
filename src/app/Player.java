package app;

import Achievements.Achievement;

import java.util.Map;
import java.util.Objects;

public class Player {

    private String playerId;
    private Map<String, GameStats> gameStats;
    private Map<Achievement, Integer> achievements;
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

    public Map<Achievement, Integer> getAchievements() {
        return achievements;
    }

    public void setAchievements(Map<Achievement, Integer> achievements) {
        this.achievements = achievements;
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
                ", gameStats=" + gameStats +
                ", achievements=" + achievements +
                ", playerStats=" + playerStats +
                '}';
    }

}
