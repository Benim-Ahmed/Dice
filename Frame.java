import java.awt.*;
import javax.swing.*;

public class Frame extends JFrame {
    ImageIcon image = new ImageIcon("Images/icon.jpg");

    public Frame() {
        this.setTitle("Dice");
        this.setSize(525, 570);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setResizable(false);
        this.setLocationRelativeTo(null);
        this.setIconImage(image.getImage());
        this.getContentPane().setBackground(Color.black);
        this.setVisible(true);
    }
}