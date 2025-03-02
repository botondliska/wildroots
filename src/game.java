import javax.swing.*;
import java.awt.*;

public class game extends JFrame {

    private Image backgroundImage;

    public game() {
        // Load the background image
        backgroundImage = new ImageIcon("resources/background.png").getImage();

        // Set window size
        setSize(800, 450);
        setTitle("Wild Roots - Start Screen");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Create a custom panel to draw the background
        JPanel panel = new JPanel() {
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                // Draw the background image
                g.drawImage(backgroundImage, 0, 0, getWidth(), getHeight(), this);
            }
        };
        panel.setLayout(null); // absolute positioning

        // Title label
        JLabel title = new JLabel("WILD ROOTS");
        title.setFont(new Font("Serif", Font.BOLD, 48));
        title.setForeground(new Color(0,100,0)); // dark green
        title.setBounds(220, 60, 400, 50);
        panel.add(title);

        // Subtitle label
        JLabel subtitle = new JLabel("Peaceful • Starting");
        subtitle.setFont(new Font("Serif", Font.PLAIN, 20));
        subtitle.setForeground(new Color(85,107,47)); // dark olive green
        subtitle.setBounds(320, 120, 200, 30);
        panel.add(subtitle);

        // Buttons
        JButton startBtn = new JButton("START GAME");
        startBtn.setBounds(340, 180, 120, 40);

        // NEW CONTINUE BUTTON
        JButton continueBtn = new JButton("CONTINUE");
        continueBtn.setBounds(340, 240, 120, 40);

        JButton settingsBtn = new JButton("SETTINGS");
        settingsBtn.setBounds(340, 300, 120, 40);

        JButton exitBtn = new JButton("EXIT");
        exitBtn.setBounds(340, 360, 120, 40);

        // Add buttons to panel
        panel.add(startBtn);
        panel.add(continueBtn);  // <--- Add the new button
        panel.add(settingsBtn);
        panel.add(exitBtn);

        // Add action listeners (example)
        startBtn.addActionListener(e -> System.out.println("Start Game clicked!"));
        continueBtn.addActionListener(e -> System.out.println("Continue clicked!"));
        settingsBtn.addActionListener(e -> System.out.println("Settings clicked!"));
        exitBtn.addActionListener(e -> dispose());

        add(panel);
        setLocationRelativeTo(null);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            new game().setVisible(true);
        });
    }
}
