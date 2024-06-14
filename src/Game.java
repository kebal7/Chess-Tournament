public class Game {

    Player player1, player2;
    Player winnner = player1;
    Player loser = player2;

    public Game(Player player1, Player player2)
    {
        this.player1 = player1;
        this.player2 = player2;
    }

    public Player getPlayer1()
    {
        return this.player1;
    }

    public Player getPlayer2()
    {
        return this.player2;
    }

    public Player getWinner()
    {
        return this.winnner;
    }

    public Player getLoser()
    {
        return this.loser;
    }

    public void setWinner(Player winner)
    {
        this.winnner = winner;
    }

    public void setLoser(Player loser)
    {
        this.loser = loser;
    }

    void simulateGame()
    {
        if(player1.getPlayerName().equals("Bye"))
        {
            setWinner(player2);
            setLoser(player1);
        }
        else if(player2.getPlayerName().equals("Bye"))
        {
            setWinner(player1);
            setLoser(player2);
        }
        else
        {
            //setWinner(Math.random() > 0.5 ? player1 : player2);
            boolean isPlayer1Winner = Math.random() > 0.5;
            if(isPlayer1Winner == true)
            {
                setWinner(player1);
                setLoser(player2);
            }
            else
            {
                setWinner(player2);
                setLoser(player1);
            }
        }
    }
}
