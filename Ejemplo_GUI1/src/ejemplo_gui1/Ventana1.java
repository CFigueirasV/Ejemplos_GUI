package ejemplo_gui1;

import java.awt.Color;
import java.awt.Image;
import java.awt.Toolkit;
import javax.swing.*;

/**
 *
 * @author cfigueirasvalverde
 */
public class Ventana1 {
    JFrame marco;
    JDialog ventanaSecun;
    JPanel panel;
    public void crearVentana1(){
        marco = new JFrame();
        marco.setBounds(100, 100, 800, 600);
       // marco.setResizable(false); //no deja modificar el tamaño
       // marco.setExtendedState(JFrame.MAXIMIZED_BOTH); //pantalla completa
        
       ventanaSecun = new JDialog(marco); //asocio al marco
       ventanaSecun.setBounds(150, 150, 200, 100);
       ventanaSecun.setVisible(true);
       
       panel = new JPanel();
       panel.setBackground(Color.red);
       marco.add(panel);
       
        marco.setVisible(true);
        marco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
       Toolkit pantalla = Toolkit.getDefaultToolkit();
        Image icono = pantalla.getImage("nome.jpg");
        marco.setIconImage(icono);

    }
    
}
