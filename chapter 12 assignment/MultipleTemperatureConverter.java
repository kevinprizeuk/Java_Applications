import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MultipleTemperatureConverter extends JFrame {
    private JTextField fahrenheitField, celsiusField, kelvinField;

    public MultipleTemperatureConverter() {
        setTitle("Enhanced Temperature Converter");
        setSize(400, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new GridLayout(4, 2));

        fahrenheitField = new JTextField(10);
        celsiusField = new JTextField(10);
        kelvinField = new JTextField(10);

        JButton convertButton = new JButton("Convert");
        convertButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                double fahrenheit = Double.parseDouble(fahrenheitField.getText());
                celsiusField.setText(String.valueOf(convertFahrenheitToCelsius(fahrenheit)));
                kelvinField.setText(String.valueOf(convertCelsiusToKelvin(convertFahrenheitToCelsius(fahrenheit))));
            }
        });

        add(new JLabel("Fahrenheit: "));
        add(fahrenheitField);
        add(new JLabel("Celsius: "));
        add(celsiusField);
        add(new JLabel("Kelvin: "));
        add(kelvinField);
        add(convertButton);
    }

    private double convertFahrenheitToCelsius(double fahrenheit) {
        return (fahrenheit - 32) * 5 / 9;
    }

    private double convertCelsiusToKelvin(double celsius) {
        return celsius + 273.15;
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            MultipleTemperatureConverter converter = new MultipleTemperatureConverter();
            converter.setVisible(true);
        });
    }
}