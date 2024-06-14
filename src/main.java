import java.util.ArrayList;

public class main {
    public static void main(String[] args)
    {
        ArrayList<Player> playerList = new ArrayList<Player>();
        // GUI gui = new GUI();
        // gui.createGUI();
        // gui.mainFrame.setVisible(true);

        Player player1 = new Player("Magnus");
        playerList.add(player1);

        Player player2 = new Player("Hikaru");
        playerList.add(player2);

        Player player3 = new Player("Fabiano");
        playerList.add(player3);

        Player player4 = new Player("Nepo");
        playerList.add(player4);
        
        Player player5 = new Player("Levy");
        playerList.add(player5);
        
        Player player6 = new Player("Vidit");
        playerList.add(player6);

        Player player7 = new Player("Anish");
        playerList.add(player7);
        
        Player player8 = new Player("Prag");
        playerList.add(player8);
        
        Player player9 = new Player("Nihal");
        playerList.add(player9);

        KnockoutPool knockoutPool = new KnockoutPool(playerList);
        // knockoutPool.setInitialPairing();
        // knockoutPool.showPairing();
        knockoutPool.simulateTournament();
    }
}
