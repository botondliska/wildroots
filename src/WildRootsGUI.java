import javax.swing.*;
import java.awt.*;

public class WildRootsGUI {
    private JFrame frame;
    private GameEngine gameArea;
    private JPanel menuPanel;

    public WildRootsGUI() {
        frame = new JFrame("WildRoots");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        frame.setExtendedState(JFrame.MAXIMIZED_BOTH);
        frame.setUndecorated(true);

        gameArea = new GameEngine();
        frame.getContentPane().add(gameArea);
        createMenu();
        frame.setVisible(true);
    }

    private void createMenu() {
        menuPanel = new JPanel();
        menuPanel.setLayout(new GridLayout(3, 1, 10, 10)); // Középre rendezett gombok
        menuPanel.setOpaque(false);

        JButton newGameButton = createImageButton("resources/start_game.png");
        JButton settingsButton = createImageButton("resources/settings.png");
        //JButton exitButton = createImageButton("resources/exit.png");

        // Gombok eseménykezelője
        newGameButton.addActionListener(e -> startNewGame());
        settingsButton.addActionListener(e -> settings());
        //exitButton.addActionListener(e -> System.exit(0));

        menuPanel.add(newGameButton);
        menuPanel.add(settingsButton);
        //menuPanel.add(exitButton);

        frame.getContentPane().add(menuPanel, BorderLayout.SOUTH); // Gombokat a képernyő aljára helyezzük
    }

    private JButton createImageButton(String imagePath) {
        ImageIcon icon = new ImageIcon(getClass().getResource(imagePath));
        Image img = icon.getImage().getScaledInstance(360, 110, Image.SCALE_SMOOTH);
        ImageIcon scaledIcon = new ImageIcon(img);

        // Gomb létrehozása az ikon alapján
        JButton button = new JButton(scaledIcon);
        button.setPreferredSize(new Dimension(360, 110)); // Gomb mérete pontosan akkora, mint a kép
        button.setBorderPainted(false);
        button.setContentAreaFilled(false);
        button.setFocusPainted(false);
        button.setOpaque(false);
        button.setBackground(new Color(0, 0, 0, 0));

        return button;
    }


    private void startNewGame() {
        System.out.println("New Game started!");
        // Itt lehet majd a játék kezdéséhez szükséges funkciókat hozzáadni
    }

    private void settings() {
        System.out.println("Settings selected!");
        // Itt lehet majd a betöltési funkciót hozzáadni
    }
}