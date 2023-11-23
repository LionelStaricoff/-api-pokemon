package ar.com.codoacodo.util;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;

import javax.imageio.ImageIO;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.SwingUtilities;
import javax.swing.border.Border;

import ar.com.codoacodo.pokemon.base.GestionaPokemon;
import ar.com.codoacodo.pokemon.view.Backend;
import ar.com.codoacodo.pokemon.view.ViewBatalla;


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
	 * <p> setea una string con  las modificaciones del metodo crearLavelText()</p>
	 * @param nombre del la etiqueta
	 * @return JPanel
	 */
	public static JPanel ventanaImagen(String icon) {
		JPanel label = new JPanel();
		label.setOpaque(false);
		try {
			BgBorder borde = new BgBorder(ImageIO.read(new URL(icon)));
			label.setBorder(borde);
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}
		return ventanaCentrada(label);
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
	
	
	public static JLabel crearLavelCentrado(String pokemon ) {
		JLabel LblBatalla = new JLabel(pokemon);
		  LblBatalla.setOpaque(false);
		 Border border = BorderFactory.createLineBorder(Color.RED);
		 LblBatalla.setForeground(Color.RED);
		LblBatalla.setBorder(border);
		
		
		LblBatalla.setHorizontalAlignment(SwingConstants.CENTER);
		LblBatalla.setFont(new Font("Tahoma", Font.BOLD, 20));
		return LblBatalla;
	}
	
	
	public static JLabel crearLavelCentrado(GestionaPokemon pokemon, ViewBatalla viewBatalla ) {
		JLabel LblBatalla = new JLabel(pokemon.getNombre());
		  LblBatalla.setOpaque(false);
		 Border border = BorderFactory.createLineBorder(Color.RED);
		 LblBatalla.setForeground(Color.RED);
		LblBatalla.setBorder(border);
		LblBatalla.addMouseListener(new MouseListener() {
			
			/**<h2>Creando linstener del cambio de pokemon </h2>*/
			@Override
			public void mouseReleased(MouseEvent e) {
				if(e.getSource() == LblBatalla) {
					
				
					viewBatalla.getBackend().elegirPokemonActivo(pokemon);
				CambioDeTurno(viewBatalla);
				}
			}
			
		
			@Override
			public void mousePressed(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void mouseExited(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void mouseEntered(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override //over
			public void mouseClicked(MouseEvent e) {
				if(e.getSource() == LblBatalla) {
					LblBatalla.setForeground(Color.BLUE);
					LblBatalla.setBorder(BorderFactory.createLineBorder(Color.BLUE));	
				}
				
			}
		});
		LblBatalla.setHorizontalAlignment(SwingConstants.CENTER);
		LblBatalla.setFont(new Font("Tahoma", Font.BOLD, 20));
		return LblBatalla;
	}

	public static Image traerImagenWeb(String imagenesFront) {
		BufferedImage image = null;
		URL url;
		try {
			url = new URL(imagenesFront);
			 image = ImageIO.read(url);
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println(image.getGraphics()); 
		return image;
	}
	
	
	
	private static void CambioDeTurno(ViewBatalla viewBatalla) {
		viewBatalla.getBackend().intercambiarEntrenadores();
		
		SwingUtilities.invokeLater(()->{
			viewBatalla.getPanelSuperior().removeAll(); 
			viewBatalla.getPanelSuperior().setLayout(new GridLayout(0, 3));
			/**<p>Cargando Hp y nombre del pokemon activo </p>*/
			viewBatalla.getPanelSuperior().add(ventanaNombreHp(String.valueOf(viewBatalla.getBackend().getPOkemonActivo().getHp()) , viewBatalla.getBackend().getPOkemonActivo().getNombre()));
			/**<p>Cargando ventana vacia </p>*/
			viewBatalla.getPanelSuperior().add( UtilVentana.ventanaVacia());
			/**<p>Cargando imagen pokeon pasivo </p>*/
		    viewBatalla.getPanelSuperior().add(UtilVentana.ventanaImagen(viewBatalla.getBackend().getPokemonPasivo().getImagenesFront(0)));
			
		    viewBatalla.getPanelMedio().removeAll(); 
		    viewBatalla.getPanelMedio().setLayout(new GridLayout(0, 3));
		    /**<p>Cargando imagen pokemon activo </p>*/
		    viewBatalla.getPanelMedio().add(UtilVentana.ventanaImagen(viewBatalla.getBackend().getPOkemonActivo().getImagenesBack(0) ));
		    /**<p>Cargando ventana vacia </p>*/
		    viewBatalla.getPanelMedio().add(UtilVentana.ventanaVacia());
		    /**<p>Cargando Hp y nombre del pokemon pasivo </p>*/
		    viewBatalla.getPanelMedio().add(UtilVentana.ventanaNombreHp(String.valueOf(viewBatalla.getBackend().getPokemonPasivo().getHp()), viewBatalla.getPokemonPasivo().getNombre()));
		
		    
			viewBatalla.getPanelInferior().removeAll(); 
			viewBatalla.getPanelInferior().setLayout(new GridLayout(0, 3));
			viewBatalla.getPanelInferior().add(UtilVentana.ventanaCentrada(viewBatalla.getBatalla()));
			viewBatalla.getPanelInferior().add(UtilVentana.ventanaCentrada(viewBatalla.getItems()));
			viewBatalla.getPanelInferior().add(UtilVentana.ventanaCentrada(viewBatalla.getCambioDePokemon()));
			viewBatalla.getPanelInferior().revalidate();
			viewBatalla.getPanelInferior().repaint();
			
			
		
		});
		
	}

	
	
}
