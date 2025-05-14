import javax.swing.JButton;
import javax.swing.JFrame;
import java.awt.FlowLayout;

public class Boton {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Ejemplo de Botón"); //marco
        frame.setSize(500, 500);

        frame.setLayout(new FlowLayout(FlowLayout.CENTER, 0, 80));// centrar el boton
        
        JButton boton = new JButton("Click");
        frame.add(boton);
        frame.setVisible(true);
    }
}
