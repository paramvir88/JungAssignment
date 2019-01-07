package com.jung.paramvir.app;

public class PlayerStats {

    private int totalGamesPlayed;
    private long totalDurationPlayed;
    private long totalKills;
    private long totalWins;

    public int getTotalGamesPlayed() {
        return totalGamesPlayed;
    }

    public void setTotalGamesPlayed(int totalGamesPlayed) {
        this.totalGamesPlayed = totalGamesPlayed;
    }

    public long getTotalDurationPlayed() {
        return totalDurationPlayed;
    }

    public void setTotalDurationPlayed(long totalDurationPlayed) {
        this.totalDurationPlayed = totalDurationPlayed;
    }

    public long getTotalKills() {
        return totalKills;
    }

    public void setTotalKills(long totalKills) {
        this.totalKills = totalKills;
    }

    public long getTotalWins() {
        return totalWins;
    }

    public void setTotalWins(long totalWins) {
        this.totalWins = totalWins;
    }

    @Override
    public String toString() {
        return "PlayerStats{" +
                "totalGamesPlayed=" + totalGamesPlayed +
                ", totalDurationPlayed=" + totalDurationPlayed +
                ", totalKills=" + totalKills +
                ", totalWins=" + totalWins +
                '}';
    }
}
