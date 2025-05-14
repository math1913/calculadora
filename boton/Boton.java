import javax.swing.JButton;
import javax.swing.JFrame;
import java.awt.FlowLayout;
import java.awt.Color;

public class Boton {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Ejemplo de Botón"); //marco
        frame.setSize(500, 500);

        frame.setLayout(new FlowLayout(FlowLayout.CENTER, 0, 80));// centrar el boton

        JButton boton1 = new JButton("Click");
        frame.add(boton1);
        boton1.setForeground(Color.BLUE);

        JButton boton2 = new JButton("Clic aquí");
        boton2.setBackground(Color.RED);
        frame.add(boton2);
        
        frame.setVisible(true);
    }
}
