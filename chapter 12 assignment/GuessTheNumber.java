import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class GuessTheNumber extends JFrame {
    private JTextField guessField;
    private JLabel feedbackLabel;
    private int randomNumber;

    public GuessTheNumber() {
        setTitle("Guess the Number Game");
        setSize(300, 150);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new FlowLayout());

        randomNumber = new Random().nextInt(100) + 1; // Random number between 1 and 100
        guessField = new JTextField(10);
        JButton guessButton = new JButton("Guess");
        feedbackLabel = new JLabel("Enter a number between 1 and 100");

        guessButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                checkGuess();
            }
        });

        add(new JLabel("Your Guess: "));
        add(guessField);
        add(guessButton);
        add(feedbackLabel);
    }

    private void checkGuess() {
        int userGuess = Integer.parseInt(guessField.getText());
        if (userGuess < randomNumber) {
            feedbackLabel.setText("Too low! Try again.");
        } else if (userGuess > randomNumber) {
            feedbackLabel.setText("Too high! Try again.");
        } else {
            feedbackLabel.setText("Correct! The number was " + randomNumber);
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            GuessTheNumber game = new GuessTheNumber();
            game.setVisible(true);
        });
    }
}