package ejemplo_gui1;

import java.awt.*;
import javax.swing.*;


public class Layouts {
    JFrame marco;
    JPanel panel;
    JButton boton1, boton2, boton3, boton4, boton5;
    JLabel etiqueta;
    
    
    public void disFlowLayout(){
        marco = new JFrame("Layouts");
        panel = new JPanel();
        boton1 = new JButton("boton1");
        boton2 = new JButton("boton2");
        boton3 = new JButton("boton3");
        boton4 = new JButton("boton4");
        boton5 = new JButton("boton5");
        marco.setSize(600, 300);
        FlowLayout flow = new FlowLayout(FlowLayout.RIGHT);
        
        panel.setLayout(flow);
        panel.setLayout(new FlowLayout(FlowLayout.RIGHT));
        panel.add(boton1);
        panel.add(boton2);
        panel.add(boton3);
        panel.add(boton4);
        panel.add(boton5);
        marco.add(panel);
        
        marco.setVisible(true);
        marco.setDefaultCloseOperation(3);
                
    }
    public void iniciarComponentes(){
        marco = new JFrame("Layouts");
        panel = new JPanel();
        boton1 = new JButton("boton1");
        boton2 = new JButton("boton2");
        boton3 = new JButton("boton3");
        boton4 = new JButton("boton4");
        boton5 = new JButton("boton5");
        marco.setSize(600, 300);
                
    }
    
    public void disBoxLayout(){
        iniciarComponentes();
        panel.setLayout(new BoxLayout(panel,BoxLayout.Y_AXIS));
        
        panel.add(boton1);
        panel.add(boton2);
        panel.add(boton3);
        panel.add(boton4);
        panel.add(boton5);
        marco.add(panel);
        
        marco.setVisible(true);
        marco.setDefaultCloseOperation(3);
    }
    
    public void disBorderLayout(){
        iniciarComponentes();
        panel.setLayout(new BorderLayout());
        
        panel.add(boton1,BorderLayout.NORTH);
        panel.add(boton2,BorderLayout.CENTER);
        panel.add(boton3,BorderLayout.EAST);
        panel.add(boton4,BorderLayout.SOUTH);
        panel.add(boton5,BorderLayout.WEST);
        marco.add(panel);
        
        marco.setVisible(true);
        marco.setDefaultCloseOperation(3);

        
    }
    
    public void disGridLayout(){
         iniciarComponentes();
        panel.setLayout(new GridLayout(2,3,2,5));
        
        panel.add(boton1);
        panel.add(boton2);
        panel.add(boton3);
        panel.add(boton4);
        panel.add(boton5);
        marco.add(panel);
        
        marco.setVisible(true);
        marco.setDefaultCloseOperation(3);
        
        
    }
    //El CardLayout no lo vamos a usar por lo que no hacemos ejemplos
   /* public void disCardLayout(){
         iniciarComponentes();
        panel.setLayout(new CardLayout());
        
        panel.add(boton1);
        panel.add(boton2);
        panel.add(boton3);
        panel.add(boton4);
        panel.add(boton5);
        marco.add(panel);
        
        marco.setVisible(true);
        marco.setDefaultCloseOperation(3);
        
        
    }*/
}
