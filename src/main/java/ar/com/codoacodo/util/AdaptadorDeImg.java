package ar.com.codoacodo.util;

import java.awt.Image;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JLabel;

public class AdaptadorDeImg {

	public static void setImageScale(JLabel label, String root) {
		ImageIcon img = new ImageIcon(root);
		ImageIcon icon = new ImageIcon(
				img.getImage().getScaledInstance(noWidthCero(label.getWidth()),noHeightCero( label.getHeight()), Image.SCALE_DEFAULT));
		
	}
	
	public static int noWidthCero(int with) {
		return(with==0)? 16<<6 : with ;
	}
	
	public static int noHeightCero(int height) {
		return(height==0)? 16<<6 : height ;
	}
}
