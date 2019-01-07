package test;

import Achievements.*;
import app.*;
import test.DummyGameLogic;

import java.nio.charset.Charset;
import java.util.*;
import java.util.concurrent.ThreadLocalRandom;

public class DummyDataProvider {

    private List<Achievement> achievements = new ArrayList<>();
    private List<String> gameIds = new ArrayList<>();

    public DummyDataProvider() {
        achievements.add(new BigWinner());
        achievements.add(new Bruiser());
        achievements.add(new SharpShooter());
        achievements.add(new Veteran());
        achievements.add(new NewAchievement());


        gameIds.add("Game 1");
        gameIds.add("Game 2");
        gameIds.add("Game 3");
        gameIds.add("Game 4");
        gameIds.add("Game 5");


    }


    public Game generateGame() {
        Game game = new Game();
        game.setGameId(getRandomString(6));
        List<Team> teams = new ArrayList<>();
        teams.add(generateTeam());
        teams.add(generateTeam());
        game.setTeams(teams);
        game.setGameLogic(new DummyGameLogic());
        return game;
    }

    public Team generateTeam() {
        Team team = new Team();
        team.setTeamId(getRandomString(8));
        List<Player> players = new ArrayList<>();
        players.add(getPlayer());
        players.add(getPlayer());
        players.add(getPlayer());
        players.add(getPlayer());
        team.setPlayers(players);
        return team;

    }

    Player getPlayer() {

        Player player = new Player();
        player.setPlayerId(getRandomString(8));
        LinkedHashSet<Achievement> achievements = new LinkedHashSet<>();
        player.setAchievements(achievements);
        for (int i = 0; i < getRandomNumber(0, 6); i++) {
            achievements.add(getRandomAchievement(i));
        }

        Map<String, GameStats> gameStats = new HashMap<>();

        for (String gameId : gameIds) {
            gameStats.put(gameId, getRandomGameStats());
        }
        player.setGameStats(gameStats);
        player.setPlayerStats(generateInitialPlayerStats());
        return player;

    }


    public String getRandomString(int length) {
        byte[] array = new byte[length];
        new Random().nextBytes(array);
        String generatedString = new String(array, Charset.forName("UTF-8"));
        return generatedString;
    }

    public int getRandomNumber(int min, int max) {
        int randomNum = ThreadLocalRandom.current().nextInt(min, max + 1);
        return randomNum;
    }


    public Achievement getRandomAchievement(int i) {
        return achievements.get(i);
    }

    public GameStats getRandomGameStats() {
        GameStats gameStats = new GameStats();
        gameStats.setDamageDone(getRandomNumber(500, 800));
        gameStats.setNoOfAttacks(getRandomNumber(500, 800));
        gameStats.setNoOfAssists(getRandomNumber(50, 100));
        gameStats.setNoOfKills(getRandomNumber(200, 600));
        gameStats.setNoOfHits(getRandomNumber(200, 600));
        gameStats.setNoOfSpellsCast(getRandomNumber(1, 10));
        gameStats.setTimePlayed(getRandomNumber(40, 100));
        gameStats.setNewStatistic(getRandomNumber(100, 200));
        return gameStats;
    }

    public PlayerStats generateInitialPlayerStats() {
        PlayerStats playerStats = new PlayerStats();
        playerStats.setTotalDurationPlayed(getRandomNumber(100, 30000));
        playerStats.setTotalGamesPlayed(getRandomNumber(1, 10));
        playerStats.setTotalKills(getRandomNumber(100, 900));
        playerStats.setTotalWins(getRandomNumber(5, 50));
        return playerStats;
    }


}
