package app;

/**
 * ● Number of attempted attacks
 * ● Number of hits
 * ● Total Amount of damage done
 * ● Number of kills
 * ● Number of “first hit” kills
 * ● Number of assists
 * ● Total number of spells cast
 * ● Total spell damage done
 * ● Total time played
 */
public class GameStats {

    private int noOfAttacks;
    private int noOfHits;
    private int damageDone;
    private int noOfKills;
    private int noOfFirstHitKills;
    private int noOfAssists;
    private int noOfSpellsCast;
    private int spellDamageDone;
    private int timePlayed;
    private int newStatistic;//added statistic

    public int getNoOfAttacks() {
        return noOfAttacks;
    }

    public void setNoOfAttacks(int noOfAttacks) {
        this.noOfAttacks = noOfAttacks;
    }

    public int getNoOfHits() {
        return noOfHits;
    }

    public void setNoOfHits(int noOfHits) {
        this.noOfHits = noOfHits;
    }

    public int getDamageDone() {
        return damageDone;
    }

    public void setDamageDone(int damageDone) {
        this.damageDone = damageDone;
    }

    public int getNoOfKills() {
        return noOfKills;
    }

    public void setNoOfKills(int noOfKills) {
        this.noOfKills = noOfKills;
    }

    public int getNoOfFirstHitKills() {
        return noOfFirstHitKills;
    }

    public void setNoOfFirstHitKills(int noOfFirstHitKills) {
        this.noOfFirstHitKills = noOfFirstHitKills;
    }

    public int getNoOfAssists() {
        return noOfAssists;
    }

    public void setNoOfAssists(int noOfAssists) {
        this.noOfAssists = noOfAssists;
    }

    public int getNoOfSpellsCast() {
        return noOfSpellsCast;
    }

    public void setNoOfSpellsCast(int noOfSpellsCast) {
        this.noOfSpellsCast = noOfSpellsCast;
    }

    public int getSpellDamageDone() {
        return spellDamageDone;
    }

    public void setSpellDamageDone(int spellDamageDone) {
        this.spellDamageDone = spellDamageDone;
    }

    public int getTimePlayed() {
        return timePlayed;
    }

    public void setTimePlayed(int timePlayed) {
        this.timePlayed = timePlayed;
    }

    public int getNewStatistic() {
        return newStatistic;
    }

    public void setNewStatistic(int newStatistic) {
        this.newStatistic = newStatistic;
    }
}
