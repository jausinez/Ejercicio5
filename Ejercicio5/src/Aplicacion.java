

import graficos.PosicionVentana;

import javax.swing.JFrame;

import vista.Ventana;

public class Aplicacion {
	//Atributos
	private Ventana ventana;

	//Constructor
	Aplicacion() {
		ventana = new Ventana();
		//Definir ventana	
		ventana.setSize(ventana.getContentPane().getWidth() + 20, ventana.getContentPane().getHeight() + 40);
		ventana.setTitle("Tres en raya");
		ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		PosicionVentana.centrarVentana(ventana);
		ventana.setVisible(true);
	}

	/*
	 * Método main para comenzar la ejecución creando un objeto de la propia
	 * clase. Termina la ejecución.
	 */
	public static void main(String[] args) {
		//Crear el objeto aplicacion
		new Aplicacion();
	}
}
