package ar.com.codoacodo.util;

import java.awt.Component;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.Insets;

import javax.imageio.ImageIO;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class UtilVentana extends JFrame {
	
	
	/**
	 * clase estatica para centrar componenetes dentro de ventanas
	 * @param objeto de component
	 * @return JPanel centrado
	 */
	public static JPanel ventanaCentrada(Object objeto) {
		
		JPanel panelCentrado = new JPanel(new GridLayout(3,3));
   
		panelCentrado.add(new JLabel(""));
		panelCentrado.add(new JLabel(""));
		panelCentrado.add(new JLabel(""));
		panelCentrado.add(new JLabel(""));
		panelCentrado.add((Component) objeto);
		panelCentrado.add(new JLabel(""));
		panelCentrado.add(new JLabel(""));
		panelCentrado.add(new JLabel(""));
		panelCentrado.add(new JLabel(""));
		
		//crea transparencia al fondo
		panelCentrado.setOpaque(false);
		
		return panelCentrado;
	}
	
	public static JPanel ventanaVacia() {
		JPanel panel = new JPanel(new FlowLayout());
		panel.setOpaque(false);
		return panel;
	}

	public static void pintarImagen() {

try {
     BgBorder borde = new BgBorder(ImageIO.read("/recursos/miImagenFondo.png")) );            
      jPanel1.setBorder(borde);            
} catch (IOException e) {
      System.out.println(e.getMessage());
}

//.......Y la clase mágica que hace el resto por nosotros....

public class BgBorder implements Border {

    private BufferedImage mImagen = null;

    public BgBorder(BufferedImage pImagen) {
        mImagen = pImagen;      
    }
    public void paintBorder(Component c, Graphics g, int x, int y, int width, int height) {
        if (mImagen != null) {
            g.drawImage(mImagen, 0, 0, width, height, null);
        }
    }
    public Insets getBorderInsets(Component c) {
        return new Insets(0, 0, 0, 0);
    }
    public boolean isBorderOpaque() {
        return true;
    }
}

	}
}
