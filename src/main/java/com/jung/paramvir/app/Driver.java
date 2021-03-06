package com.jung.paramvir.app;

import test.DummyDataProvider;

/**
 * Create a driver class that sets up sample data and calls the achievements
 * system, printing out achievements to the console. Don’t worry about
 * persistence, and use any method of creating/loading sample data that you
 * are familiar with. Also, you can combine/integrate this into your unit tests
 * if you prefer – we’re just looking for you to demonstrate that the code runs
 * with your sample data.
 */
public class Driver {

    public static void main(String[] args) {
        DummyDataProvider provider = new DummyDataProvider();
        System.out.println("DRIVER initiating...");
        Game game = provider.generateGame();
        System.out.println("\n-------- Game = " + game.getGameId() + " ---------");
        System.out.println("\n###Game details: \n" + game);
        System.out.println("\n\n\n###############################################\n");
        game.execute();
        System.out.println("############### Achievement System ########################\n\n\n");
        AchievementSystem system = new AchievementSystem();
        calculateAchievements(game.getGameId(), system, game.getTeams().get(0));
        calculateAchievements(game.getGameId(), system, game.getTeams().get(1));
        System.out.println("\n\n\n############### Achievements calculated ########################\n\n\n");
    }

    private static void calculateAchievements(String gameId, AchievementSystem system, Team team) {
        for (Player player : team.getPlayers()) {
            player.getAchievements().addAll(system.calculateAchievemntsForPlayer(player.getPlayerId(), player.getGameStats().get(gameId), player.getPlayerStats()));
            System.out.println(player.getPlayerId() + " now has these achievements: " + player.getAchievements());
        }
    }
}
