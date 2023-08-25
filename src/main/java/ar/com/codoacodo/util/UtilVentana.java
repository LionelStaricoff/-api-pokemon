package ar.com.codoacodo.util;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.Paint;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.border.Border;
import javax.swing.border.EmptyBorder;

import ar.com.codoacodo.item.Pokemon;
import ar.com.codoacodo.pokemon.base.GestionaPokemon;

public class UtilVentana  {

	/**
	 * <p>clase estatica para centrar componenetes dentro de ventanas BorderLayout
	 * para colocar en hp del pokemon y en  nombre</p>
	 * 
	 * @param objeto de component
	 * @return JPanel centrado
	 */
	public static JPanel ventanaNombreHp(String hp, String nombre) {

		JPanel panelCentrado = new JPanel(new BorderLayout());

		
		panelCentrado.add(panelCentrado(nombre),BorderLayout.NORTH);
		panelCentrado.add(new JLabel("    "),BorderLayout.EAST);
		panelCentrado.add(panelCentrado(hp), BorderLayout.CENTER);
		panelCentrado.add(new JLabel("     "),BorderLayout.SOUTH);
		panelCentrado.add(new JLabel("             "),BorderLayout.WEST);


		// crea transparencia al fondo
		panelCentrado.setOpaque(false);

		return panelCentrado;
	}

/**
 * <p>Se coloca un string para pintar en la pantalla el nombre o hp del pokemon
 * y que este centrado</p>
 * @param String 
 * @return JPanel
 */
	private static JPanel panelCentrado(String hp) {
		JPanel panelHp = new JPanel(new FlowLayout());
		panelHp.setAlignmentX(JPanel.CENTER_ALIGNMENT);
		panelHp.setOpaque(false);
		panelHp.add(crearLavelText(hp));
		return panelHp;
	}
	
	
	public static JPanel ventanaCentrada(Component objeto) {

		JPanel panelCentrado = new JPanel(new BorderLayout());

		panelCentrado.add(new JLabel("   "),BorderLayout.NORTH);
		panelCentrado.add(new JLabel("    "),BorderLayout.EAST);
		panelCentrado.add( objeto, BorderLayout.CENTER);
		panelCentrado.add(new JLabel("     "),BorderLayout.SOUTH);
		panelCentrado.add(new JLabel("             "),BorderLayout.WEST);


		// crea transparencia al fondo
		panelCentrado.setOpaque(false);

		return panelCentrado;
	}
	
	
	
	/**
	 * <p>clase estatica para centrar componenetes dentro de ventanas GridLayout</p>
	 * 
	 * @param objeto de component
	 * @return JPanel centrado
	 */
	public static JPanel ventanaCentradaGridLayout(Object objeto) {

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
	
	public static JLabel crearLavelCentrado(String nombre) {
		JLabel batalla = new JLabel(nombre);
		  batalla.setOpaque(false);
		 Border border = BorderFactory.createLineBorder(Color.RED);
		 batalla.setForeground(Color.RED);
		batalla.setBorder(border);
		batalla.setHorizontalAlignment(SwingConstants.CENTER);
		batalla.setFont(new Font("Tahoma", Font.BOLD, 20));
		return batalla;
	}
	
	//ventana que setea los 4 ataques de los pokemon
	public static JPanel viewAtaques() {
		JPanel panelPrincipar = new JPanel(new BorderLayout());
		//crea un margin
		panelPrincipar.setBorder(BorderFactory.createLoweredBevelBorder());
		JPanel panelIzquierdo = new JPanel(new GridLayout(2,2,10,10));
		JPanel panelCerrar = ventanaCentrada("x");
		panelCerrar.setBorder(BorderFactory.createLineBorder(Color.RED));
		
		
		panelIzquierdo.add(crearLavelCentrado( "1") );
		panelIzquierdo.add(crearLavelCentrado( "2") );
		panelIzquierdo.add(crearLavelCentrado( "3") );
		panelIzquierdo.add(crearLavelCentrado( "4") );
		
		panelPrincipar.add(ventanaVacia(),BorderLayout.WEST);
		panelPrincipar.add(ventanaVacia(),BorderLayout.SOUTH);
		panelPrincipar.add(ventanaVacia(),BorderLayout.NORTH);
		panelPrincipar.add(panelIzquierdo,BorderLayout.CENTER);
		panelPrincipar.add(panelCerrar,BorderLayout.EAST );
		
		panelCerrar.setOpaque(false);
		panelIzquierdo.setOpaque(false);
		panelPrincipar.setOpaque(false);
		
		return panelPrincipar;
	}
}
