package app;

import java.util.List;
import java.util.Objects;
import java.util.concurrent.ThreadLocalRandom;

public class Game {

    private String gameId;
    private List<Team> teams;
    private Team winnerTeam;
    private IGameLogic gameLogic;

    public void execute(){

        //game execution logic

        System.out.println("Game executing......");
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        gameLogic.execute(this);


        System.out.println("################ GAME FINISHED ####################");
    }

    public String getGameId() {
        return gameId;
    }

    public void setGameId(String gameId) {
        this.gameId = gameId;
    }

    public List<Team> getTeams() {
        return teams;
    }

    public void setTeams(List<Team> teams) {
        this.teams = teams;
    }

    public Team getWinnerTeam() {
        return winnerTeam;
    }

    public void setWinnerTeam(Team winnerTeam) {
        this.winnerTeam = winnerTeam;
    }

    public IGameLogic getGameLogic() {
        return gameLogic;
    }

    public void setGameLogic(IGameLogic gameLogic) {
        this.gameLogic = gameLogic;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Game game = (Game) o;
        return gameId.equals(game.gameId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(gameId);
    }

    @Override
    public String toString() {
        return "Game{" +
                "gameId='" + gameId + '\'' +
                ", teams=" + teams +
                ", winnerTeam=" + winnerTeam +
                '}';
    }
}
