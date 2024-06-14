import java.awt.*;
import javax.swing.*;

public class GUI
{
    JFrame mainFrame;
    int frameWidth, frameHeight;
    int optionsPanelWidth, optionsPanelHeight;
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
        optionsPanel.setLayout(null);
        optionsPanel.setBounds(Xpos, Ypos, width, height);
        optionsPanel.setBackground(Color.RED);

        optionsPanelWidth = width;
        optionsPanelHeight = height;

        JButton button1 = createOptionsPanelButton("adsfa", 500);
        optionsPanel.add(button1);

        return optionsPanel;
    }

    JButton createOptionsPanelButton(String label, int newButtonY)
    {
        Color buttonColor = new Color(54,33,89);

        JButton optionButton = new JButton(label);

        int optionButtonHeight = (int) ((double) 20/100 * frameHeight);

        optionButton.setLayout(null);
        optionButton.setBorderPainted(false);
        optionButton.setBackground(buttonColor);
        optionButton.setBounds(0,newButtonY,optionsPanelWidth,optionButtonHeight);

        return optionButton;
    }

    // JButton createOptionsButtonPanel(ImageIcon icon,  String label,int newButtonY, int optionsPanelWidth)
    // {
    //     Color buttonColor = new Color(54,33,89);
        
    //     int buttonY = newButtonY;
    //     ImageIcon dashBoardIcon = icon;

    //     Image i = dashBoardIcon.getImage();
    //     Image new_img = i.getScaledInstance(25, 25, Image.SCALE_SMOOTH);
    //     dashBoardIcon = new ImageIcon(new_img);

    //     int optionButtonHeight = 40;
    //     JButton optionButton = new JButton();
    //     optionButton.setLayout(null);
    //     optionButton.setBorderPainted(false);
    //     optionButton.setBackground(buttonColor);
    //     optionButton.setBounds(0,buttonY,optionsPanelWidth,optionButtonHeight);

    //     int iconWidth = 25;
    //     int iconHeight = 25;
    //     int iconY = (optionButtonHeight - iconHeight)/2;
    //     int iconX = 20;

    //     JLabel dashBoardIconLabel = new JLabel(dashBoardIcon);
    //     dashBoardIconLabel.setBounds(iconX,iconY,iconWidth,iconHeight);
    //     optionButton.add(dashBoardIconLabel);
        
    //     int labelX = iconX + 80;
    //     int labelY = 0;

    //     Font labelFont= new Font("DIALOG", Font.BOLD, 15); 
    //     Color fontColor = new Color(245,245,245);

    //     JLabel optionButtonPanelLabel = new JLabel(label);
    //     optionButtonPanelLabel.setFont(labelFont);
    //     optionButtonPanelLabel.setForeground(fontColor);
    //     optionButtonPanelLabel.setBounds(labelX, labelY,optionsPanelWidth, optionButtonHeight);
    //     optionButton.add(optionButtonPanelLabel);

    //     return optionButton;
    // }

}