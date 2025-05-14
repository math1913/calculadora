import javax.swing.*;
import java.awt.*;

public class ComboBoxEjemplo {
    public static void main(String[] args) {
        JFrame frame = new JFrame("ComboBox Example");
        frame.setSize(350, 200);
        frame.setLayout(null);

        JLabel label = new JLabel("Programming language Selected: Java");
        label.setBounds(50, 20, 250, 20);
        frame.add(label);
        String[] lenguajes = { "C", "C++", "C#", "Java", "PHP" };
        JComboBox<String> comboBox = new JComboBox<>(lenguajes);
        comboBox.setBounds(50, 60, 100, 25);
        frame.add(comboBox);

        JButton boton = new JButton("Show");
        boton.setBounds(170, 60, 80, 25);
        frame.add(boton);
        frame.setVisible(true);
    }
}
