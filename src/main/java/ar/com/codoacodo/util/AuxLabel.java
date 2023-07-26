package ar.com.codoacodo.util;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

public class AuxLabel {

		
		private SwingConstants label;
		
		
		public JLabel buildLabel(JLabel label) {
				this.label = label;
				return label;
		}
		
		public JLabel createLabel(String texto) {
			return new JLabel(texto);
		}
		
		
		
		public JLabel createImgLabel(String ruta) {
				
				ImageIcon icon = new ImageIcon(ruta);
				
				return new JLabel(icon);
				
			
		}
	}
}
