public class Game {

    Player player1, player2;
    Player winnner = player1;

    public Game(Player player1, Player player2)
    {
        this.player1 = player1;
        this.player2 = player2;
    }

    void setWinner(Player winner)
    {
        this.winnner = winner;
    }

    Player getWinner()
    {
        return this.winnner;
    }

    void simulateGame()
    {
        setWinner(Math.random() > 0.5 ? player1 : player2);
    }
}
