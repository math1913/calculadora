import javax.swing.*;
import java.awt.*;

public class LenguajesUI {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Lenguajes");
        frame.setSize(200, 220);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new FlowLayout(FlowLayout.LEFT, 15, 15));

        JLabel label = new JLabel("Lenguajes:");
        frame.add(label);

        JRadioButton java = new JRadioButton("Java");
        JRadioButton php = new JRadioButton("Php");
        JRadioButton cpp = new JRadioButton("C++");
        JButton validar = new JButton("Validar");

        frame.add(java);
        frame.add(php);
        frame.add(cpp);
        frame.add(validar);
        frame.setVisible(true);
    }
}
