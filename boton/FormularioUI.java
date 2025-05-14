import javax.swing.*;
import java.awt.*;

public class FormularioUI {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Formulario");
        frame.setSize(400, 200);
        frame.setLayout(null);

        JTextField emailField = new JTextField("Escribe tu E-Mail");
        emailField.setBounds(80, 30, 220, 30);
        frame.add(emailField);

        JTextField nameField = new JTextField("First Name please");
        nameField.setBounds(80, 80, 220, 40);
        frame.add(nameField);
        frame.setVisible(true);
    }
}
