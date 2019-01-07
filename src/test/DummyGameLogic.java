package test;

import app.*;

public class DummyGameLogic implements IGameLogic {

    DummyDataProvider dataProvider = new DummyDataProvider();

    @Override
    public void execute(Game game) {

        System.out.println("Game logic executing for Game = " + game.getGameId());

        for (Team team : game.getTeams()) {
            for (Player player : team.getPlayers()) {
                PlayerStats playerStats = new PlayerStats();
                playerStats.setTotalKills(playerStats.getTotalKills() + 8);
                player.setPlayerStats(playerStats);
                playerStats.setTotalGamesPlayed(playerStats.getTotalGamesPlayed() + 1);

                GameStats gameStats = dataProvider.getRandomGameStats();
                player.getGameStats().put(game.getGameId(), gameStats);

            }
        }
    }
}
