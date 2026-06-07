import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Menu {
    public static void main(String args[]) {
        Frame frame = new Frame();
        frame.setLayout(null);

        JLabel diceLabel = new JLabel();
        diceLabel.setBounds(0, 0, 525, 540);
        diceLabel.setHorizontalAlignment(JLabel.CENTER);
        diceLabel.setVerticalAlignment(JLabel.CENTER);

        // Style helper
        JButton rollButton = createStyledButton("Roll the Dice");
        JButton exitButton = createStyledButton("Exit");

        // Vertically centred, horizontally centred and aligned
        rollButton.setBounds(187, 220, 150, 50);
        exitButton.setBounds(187, 290, 150, 50);

        frame.add(diceLabel);
        frame.add(rollButton);
        frame.add(exitButton);

        JOptionPane.showMessageDialog(frame, "Welcome to the Dice Game!", "Dice Game", JOptionPane.INFORMATION_MESSAGE);

        rollButton.addActionListener((ActionEvent e) -> {
            // Hide buttons, show dice result
            rollButton.setVisible(false);
            exitButton.setVisible(false);

            Dice dice = new Dice();
            dice.rollDice(diceLabel);

            // After 5 seconds, hide dice and show buttons again
            Timer timer = new Timer(5000, (ActionEvent evt) -> {
                diceLabel.setIcon(null);
                diceLabel.setText(null);
                rollButton.setVisible(true);
                exitButton.setVisible(true);
            });
            timer.setRepeats(false);
            timer.start();
        });

        exitButton.addActionListener((ActionEvent e) -> {
            System.exit(0);
        });
    }

    private static JButton createStyledButton(String text) {
        JButton btn = new JButton(text);
        btn.setBackground(Color.BLACK);
        btn.setForeground(Color.RED);
        btn.setFont(new Font("MV Boli", Font.BOLD, 16));
        btn.setBorder(BorderFactory.createLineBorder(Color.RED, 2));
        btn.setFocusPainted(false);
        return btn;
    }
}