import java.awt.*;
import java.util.Random;
import javax.swing.*;

public class Dice {
    private static final String[] names = { "", "One", "Two", "Three", "Four", "Five", "Six" };
    private static final String[] files = { "", "Images/one.png", "Images/two.png", "Images/three.png",
            "Images/four.png", "Images/five.png", "Images/six.png" };

    public void rollDice(JLabel label) {
        Random random = new Random();
        int number = random.nextInt(6) + 1;

        label.setIcon(new ImageIcon(files[number]));
        label.setText(names[number]);
        label.setHorizontalTextPosition(JLabel.CENTER);
        label.setVerticalTextPosition(JLabel.TOP);
        label.setForeground(Color.RED);
        label.setFont(new Font("MV Boli", Font.BOLD, 30));
        label.setVerticalAlignment(JLabel.CENTER);
        label.setHorizontalAlignment(JLabel.CENTER);
        label.setIconTextGap(-5);
    }
}