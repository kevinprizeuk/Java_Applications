import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class Craps extends JFrame {
    private JTextField die1Field, die2Field, sumField, pointField;
    private JButton rollButton;
    private Random random;

    public Craps() {
        setTitle("Craps Game");
        setSize(300, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new GridLayout(5, 2));

        die1Field = new JTextField(10);
        die2Field = new JTextField(10);
        sumField = new JTextField(10);
        pointField = new JTextField(10);
        pointField.setEditable(false);

        rollButton = new JButton("Roll Dice");
        rollButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                rollDice();
            }
        });

        add(new JLabel("Die 1: "));
        add(die1Field);
        add(new JLabel("Die 2: "));
        add(die2Field);
        add(new JLabel("Sum: "));
        add(sumField);
        add(new JLabel("Point: "));
        add(pointField);
        add(rollButton);
    }

    private void rollDice() {
        random = new Random();
        int die1 = random.nextInt(6) + 1;
        int die2 = random.nextInt(6) + 1;
        int sum = die1 + die2;

        die1Field.setText(String.valueOf(die1));
        die2Field.setText(String.valueOf(die2));
        sumField.setText(String.valueOf(sum));

        // Implement game logic here...
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            Craps game = new Craps();
            game.setVisible(true);
        });
    }
}