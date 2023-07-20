package ar.com.codoacodo.util;

import java.awt.Image;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JLabel;

public class AdaptadorDeImg {

	/**
	 * <p> metodo para adaptar imagenes a los labels</p>
	 * @param label para adaptar la imagen
	 * @param root del img
	 */
	public static void setImageScale(JLabel label, String root) {
		ImageIcon img = new ImageIcon(root);
		ImageIcon icon = new ImageIcon(
				img.getImage().getScaledInstance(noWidthCero(label.getWidth()),noHeightCero( label.getHeight()), Image.SCALE_DEFAULT));
		
	}
	
	
	/**
	 * 
	 * @param with de la imagen
	 * @return si la ventana no tiene valor de ancho lo ajusta a 300 a la img
	 */
	public static int noWidthCero(int with) {
		return(with==0)? 300 : with ;
	}
	
	/**
	 * 
	 * @param height de la imagen
	 * @return si la ventana no tiene valor de alto lo ajusta a 300 a la img
	 */
	public static int noHeightCero(int height) {
		return(height==0)? 300 : height ;
	}
}
