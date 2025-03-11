import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TemperatureConverter extends JFrame {
    private JTextField fahrenheitField;
    private JLabel celsiusLabel;

    public TemperatureConverter() {
        setTitle("Temperature Converter");
        setSize(300, 150);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new FlowLayout());

        fahrenheitField = new JTextField(10);
        JButton convertButton = new JButton("Convert");
        celsiusLabel = new JLabel("Celsius: ");

        convertButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                double fahrenheit = Double.parseDouble(fahrenheitField.getText());
                double celsius = convertFahrenheitToCelsius(fahrenheit);
                celsiusLabel.setText("Celsius: " + celsius);
            }
        });

        add(new JLabel("Fahrenheit: "));
        add(fahrenheitField);
        add(convertButton);
        add(celsiusLabel);
    }

    private double convertFahrenheitToCelsius(double fahrenheit) {
        return (fahrenheit - 32) * 5 / 9;
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            TemperatureConverter converter = new TemperatureConverter();
            converter.setVisible(true);
        });
    }
}