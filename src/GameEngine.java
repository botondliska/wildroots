import javax.swing.*;
import java.awt.*;

public class GameEngine extends JPanel{

    private final Image background = new ImageIcon(getClass().getResource("resources/background.png")).getImage();

    public GameEngine() {
        super();
        setFocusable(true);
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.drawImage(background, 0, 0, 1920, 1080, null);
    }
}