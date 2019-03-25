package ejemplo_gui1;

import java.awt.Color;
import javax.swing.*;

/**
 *
 * @author cfigueirasvalverde
 */
public class Componentes {
    JFrame marco;
    JPanel panel;
    JButton boton1, boton2;
    JLabel etiqueta;
    JTextField liTexto; // linea de texto
    JComboBox lisDesp;
    
    public void crearVentana(){
        marco = new JFrame("marco");
        panel = new JPanel();
        boton1 = new JButton("boton1");
        boton2 = new JButton("boton2");
        etiqueta = new JLabel();
        liTexto = new JTextField(20);
        liTexto = new JTextField(20); // tamaño del espacio para escribir, ilimitacion de caracteres
        lisDesp = new JComboBox();
        
        // le damos características
        marco.setSize(800, 400);
        panel.setSize(800, 400);
        panel.setBackground(Color.BLUE);
        etiqueta.setText("NOME");
        etiqueta.setBounds(50, 100, 50, 10);
        liTexto.setBounds(100, 100, 300, 20);
        
        boton1.setBounds(200, 300, 100, 50);
        boton2.setBounds(400, 300, 100, 50);
        
        panel.setLayout(null);
        
        lisDesp.setBounds(50,100,50,20);
        
        //Añadimos los componentes
        panel.add(etiqueta);
        panel.add(liTexto);
        panel.add(boton1);
        panel.add(boton2);
        
        marco.add(panel);
        marco.setVisible(true);
        marco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
    }
}
