import javax.swing.*;
import java.awt.*;

public class WildRootsGUI {
    private JFrame frame;
    private GameEngine gameArea;

    public WildRootsGUI() {
        frame = new JFrame("YogiBear");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        frame.setExtendedState(JFrame.MAXIMIZED_BOTH);
        frame.setUndecorated(true);

        gameArea = new GameEngine();
        frame.getContentPane().add(gameArea);
        frame.setVisible(true);
    }
}