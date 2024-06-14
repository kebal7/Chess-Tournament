import java.util.ArrayList;
import java.util.Collections;

public class KnockoutPool {
    ArrayList<Player> playerList = new ArrayList<Player>();
    ArrayList<Game> gameList = new ArrayList<Game>();

    public KnockoutPool(ArrayList<Player> newPlayerList) {
        this.playerList = newPlayerList;
    }

    void setInitialPairing() {

        // Add "bye" players if needed
        addByePlayers();

        // Shuffle the player list for random order
        Collections.shuffle(playerList);

        // Create game pairings
        for (int i = 0; i < playerList.size(); i += 2) {
            if (i + 1 < playerList.size()) {
                Game newGame = new Game(playerList.get(i), playerList.get(i + 1));
                gameList.add(newGame);
            }
        }
    }

    int getAdjustedCount()
    {
        // Adjust player count to the nearest power of 2
        int adjustedCount = 1;
        while (adjustedCount < playerList.size()) {
            adjustedCount *= 2;
        }
        return adjustedCount;
    }

    void addByePlayers()
    {
        int byeCount = getAdjustedCount() - playerList.size();
        for (int i = 0; i < byeCount; i++) {
            Player byePlayer = new Player("Bye");
            playerList.add(byePlayer);
        }
    }

    void showPairing() {
        for (Game game : gameList) {
            System.out.println(game.player1.getPlayerName() + " vs " + game.player2.getPlayerName());
        }
    }
}
