import java.awt.*;
import javax.swing.*;

public class GUI
{
    JFrame mainFrame;
    int frameWidth, frameHeight;
    public static void main(String[] args)
    {
        GUI gui = new GUI();
        gui.createGUI();
        gui.mainFrame.setVisible(true);
    }

    void createGUI()
    {
        mainFrame = createMainFrame();
        mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        frameWidth = mainFrame.getWidth();
        frameHeight = mainFrame.getHeight();

        mainFrame.add(createOptionsPanel());
    }

    JFrame createMainFrame()
    {
        JFrame mainFrame = new JFrame("Chess Tournament Management");
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();   
         
        mainFrame.setExtendedState(JFrame.MAXIMIZED_BOTH);     
        mainFrame.setSize(screenSize);  
        mainFrame.setLayout(null);
        return mainFrame;
    }

    JPanel createOptionsPanel()
    {
        int Xpos = 0;
        int Ypos = 0;

        int width = (int) ((double) 20/100 * frameWidth);
        int height = frameHeight;

        JPanel optionsPanel = new JPanel();
        optionsPanel.setBounds(Xpos, Ypos, width, height);
        optionsPanel.setBackground(Color.RED);
        return optionsPanel;
    }

}