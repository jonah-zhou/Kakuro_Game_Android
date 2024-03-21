package model;

public class Player {
    private Account account;
    private String playerName;
    private int playerId;
    private GamePlay previousGame;

    public Player(Account account, String playerName, int playerId, GamePlay previousGame) {
        this.account = account;
        this.playerName = playerName;
        this.playerId = playerId;
        this.previousGame = previousGame;
    }

    public Account getAccount() {
        return account;
    }

    public void setAccount(Account account) {
        this.account = account;
    }

    public String getPlayerName() {
        return playerName;
    }

    public void setPlayerName(String playerName) {
        this.playerName = playerName;
    }

    public int getPlayerId() {
        return playerId;
    }

    public void setPlayerId(int playerId) {
        this.playerId = playerId;
    }

    public GamePlay getPreviousGame() {
        return previousGame;
    }

    public void setPreviousGame(GamePlay previousGame) {
        this.previousGame = previousGame;
    }
}
