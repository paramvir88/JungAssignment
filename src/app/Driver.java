package app;

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
        Game game = provider.generateGame();
        game.execute();
        ExtendableAchievmentCalculator achievmentCalculator = new ExtendableAchievmentCalculator();
        calculateAchievements(game.getGameId(), achievmentCalculator, game.getTeams().get(0));
        calculateAchievements(game.getGameId(), achievmentCalculator, game.getTeams().get(1));
    }

    private static void calculateAchievements(String gameId, ExtendableAchievmentCalculator achievmentCalculator, Team team) {
        for (Player player : team.getPlayers()) {
            player.getAchievements().addAll(achievmentCalculator.calculateAchievemntsForPlayer(player.getGameStats().get(gameId), player.getPlayerStats()));
            System.out.println(player.getPlayerId() + " now has these achievements: " + player.getAchievements());
        }
    }
}
