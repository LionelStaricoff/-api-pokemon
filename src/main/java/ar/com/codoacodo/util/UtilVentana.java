package ar.com.codoacodo.util;

import java.awt.Color;
import java.awt.Component;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class UtilVentana  {

	/**
	 * <p>clase estatica para centrar componenetes dentro de ventanas</p>
	 * 
	 * @param objeto de component
	 * @return JPanel centrado
	 */
	public static JPanel ventanaCentrada(Object objeto) {

		JPanel panelCentrado = new JPanel(new GridLayout(3, 3));

		panelCentrado.add(new JLabel(""));
		panelCentrado.add(new JLabel(""));
		panelCentrado.add(new JLabel(""));
		panelCentrado.add(new JLabel(""));
		panelCentrado.add((Component) objeto);
		panelCentrado.add(new JLabel(""));
		panelCentrado.add(new JLabel(""));
		panelCentrado.add(new JLabel(""));
		panelCentrado.add(new JLabel(""));

		// crea transparencia al fondo
		panelCentrado.setOpaque(false);

		return panelCentrado;
	}
	
	
	/**
	 * <p> agregando un new ImageIcon("ruta de la imagen"); se carga al panel la imagen escalada</p>
	 * @param icon
	 * @return JPanel centrado y con la imagen escalada
	 */
	public static JPanel ventanaCentrada(ImageIcon icon) {
		JPanel label = new JPanel();
		try {
			BgBorder borde = new BgBorder(ImageIO.read(new File(icon.getDescription())));
			label.setBorder(borde);
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}
		return ventanaCentrada(label);
	}
	
	/**
	 * <p> setea una string con  las modificaciones del metodo crearLavelText()</p>
	 * @param nombre del la etiqueta
	 * @return JPanel
	 */
	public static JPanel ventanaCentrada(String nombre) {
		return ventanaCentrada(crearLavelText( nombre));
	}

	
	
	/**
	 * <p>Crea una ventana vacia para dar espacio entre los frames</p>
	 * @return JPanel
	 */
	public static JPanel ventanaVacia() {
		JPanel panel = new JPanel(new FlowLayout());
		panel.setOpaque(false);
		return panel;
	}

	
	/**
	 * <p>setea una imagen a la ventana sin perder dimencines</p>
	 * @param JPanel ventana
	 * @param url direccion del la  imagen
	 */
	public static void pintarImagenEnVentana(JPanel jPanel1, String url) {

		try {
			BgBorder borde = new BgBorder(ImageIO.read(new File(url)));
			jPanel1.setBorder(borde);
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}

	}
	
	public static JLabel crearLavelText(String nombre) {
		JLabel lavel = new JLabel(nombre);
		lavel.setForeground(Color.RED);
		lavel.setFont(new Font("Tahoma", Font.BOLD, 20));
		return lavel;
	}
}
