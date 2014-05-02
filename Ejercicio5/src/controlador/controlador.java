package controlador;
import modelo.Modelo;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import vista.Ventana;

public class controlador implements ActionListener {

    private Ventana vista;
    private Modelo juego;
    private String titulo = "Tres en Raya";

    //Constructor con parámetros
    public controlador( Ventana vista , Modelo modelo){
        this.vista = vista;
        this.juego = modelo;  
    }

    public void iniciar_vista(){
        vista.setTitle( this.titulo );
        vista.setLocationRelativeTo(null);
        this.vista.casilla1.addActionListener(this);
        this.vista.casilla2.addActionListener(this);
        this.vista.casilla3.addActionListener(this);
        this.vista.casilla4.addActionListener(this);
        this.vista.casilla5.addActionListener(this);
        this.vista.casilla6.addActionListener(this);
        this.vista.casilla7.addActionListener(this);
        this.vista.casilla8.addActionListener(this);
        this.vista.casilla9.addActionListener(this);
    }

    //Tratamientos de eventos actionPerformed
    public void actionPerformed(ActionEvent e) {
       
        }
    }

