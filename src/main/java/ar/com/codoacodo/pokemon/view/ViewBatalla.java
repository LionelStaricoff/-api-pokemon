package ar.com.codoacodo.pokemon.view;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

import ar.com.codoacodo.util.UtilVentana;

public class ViewBatalla extends JFrame implements MouseListener{
	
	private JPanel panelAbuelo, panelPadre, panelSuperior,panelSuperiorIzquierdo,panelSuperMedio,
	panelMedio,panelInferior;
     private JLabel btnSalir,batalla,items,cambioDePokemon;
	

	public ViewBatalla() {
		
	
	
		/**
		 * <p> Creando las ventanas de la batalla y agregando el panel abuelo base y
		 * padre como fondo</p>
		 * <p> primer panel divivdido en 2: hp pokemon1, label vacio y img pokemon2</p>
		 */
	
		//panel padre
		this.panelPadre = new JPanel (new GridLayout(3,0) );
		UtilVentana.pintarImagenEnVentana(this.panelPadre,"C:\\Users\\Lucia\\Documents\\lionel\\spring\\git\\pokemon\\-api-pokemon\\src\\main\\java\\ar\\com\\codoacodo\\img\\fondo1.jpg");
	    
		//panel abuelo
		this.panelAbuelo = new JPanel(new BorderLayout());
		JPanel botonCerrar = new JPanel(new GridLayout(0,4));
		botonCerrar.setBackground(Color.blue);
		 this.btnSalir = new JLabel("x");
		 this.btnSalir.setFont(new Font("Verdana", Font.PLAIN, 20));
		 this.btnSalir.setOpaque(false);
		 this.btnSalir.setHorizontalAlignment(SwingConstants.RIGHT);
		 this.btnSalir.setAlignmentX(JLabel.RIGHT_ALIGNMENT);
		 this.btnSalir.addMouseListener(this);
		botonCerrar.add(UtilVentana.ventanaVacia());
		botonCerrar.add(UtilVentana.ventanaVacia());
		botonCerrar.add(UtilVentana.ventanaVacia());
		botonCerrar.add(btnSalir);
		
		this.panelAbuelo.add(botonCerrar,BorderLayout.NORTH);
		this.panelAbuelo.add(this.panelPadre,BorderLayout.CENTER);
		
		
		
		//iniciando panel superior
		this.panelSuperior = new JPanel(new GridLayout(0, 3) );
		this.panelSuperior.setOpaque(false);
		this.panelPadre.add( this.panelSuperior);
		//iniciando panel medio
		this.panelMedio = new JPanel(new GridLayout(0, 3) );
		this.panelMedio.setOpaque(false);
		this.panelPadre.add(this.panelMedio);
		//panel inferior
		this.panelInferior = new JPanel(new GridLayout(0, 3) );
		this.panelInferior.setOpaque(false);
		this.panelPadre.add(panelInferior);
		
		
		
		
	
		
		
		/**
		 * <p> setear  panel superior</p>
		 * <p> primer panel divivdido en 3: hp pokemon1, label vacio y img pokemon2</p>
		 */
		this.panelSuperiorIzquierdo = UtilVentana.ventanaNombreHp("80 HP", "pikachu");
		this.panelSuperior.add(this.panelSuperiorIzquierdo);
		
		
		
		//lb superior del medio vacio
		this.panelSuperior.add( UtilVentana.ventanaVacia());
		
		// agregando panel superior izquierdo con la imagen
	    this.panelSuperMedio = UtilVentana.ventanaCentrada(new ImageIcon("C:\\Users\\Lucia\\Documents\\lionel\\spring\\git\\pokemon\\-api-pokemon\\src\\test\\java\\img\\pikachu.png"));
		this.panelSuperior.add(this.panelSuperMedio);
		
		
		
		
		
		
		/**
		 * <p> setear segundo panel </p>
		 * <p>segundo panel dividido en 3: imp pokemon1, label vacio y hp pokemon2</p>
		 */
		this.panelMedio.add(UtilVentana.ventanaCentrada(new ImageIcon("C:\\Users\\Lucia\\Documents\\lionel\\spring\\git\\pokemon\\-api-pokemon\\src\\test\\java\\img\\pikachu.png")));
		this.panelMedio.add(UtilVentana.ventanaVacia());
		this.panelMedio.add(UtilVentana.ventanaNombreHp("hp pokemon2", "pikachu 2"));
	
		
		
		
		
		/**
		 * <p> setear tercer panel </p>
		 * <p>tercer panel dividido en 3: button batalla, button items y button cambio de pokemon </p>
		 */
		this.batalla = UtilVentana.crearLavelCentrado("batalla");
		this.panelInferior.add(UtilVentana.ventanaCentrada(this.batalla));
		
		this.items = UtilVentana.crearLavelCentrado("Items");
		this.panelInferior.add(UtilVentana.ventanaCentrada(this.items));
		
		this.cambioDePokemon = UtilVentana.crearLavelCentrado("Cambio de pokemon");
		this.panelInferior.add(UtilVentana.ventanaCentrada(this.cambioDePokemon));
		this.panelInferior.setOpaque(false);
		
		
		
		
		
		// frame principal
		setSize(600,800);
		setVisible(true);
		setLocationRelativeTo(null);
		setResizable(false);
		add(this.panelAbuelo);
			
		
		
	}
	
	  
   
	
	
	@Override
	public void mouseClicked(MouseEvent e) {
		if(	e.getSource() == btnSalir) System.exit(0);
		
	}

	@Override
	public void mousePressed(MouseEvent e) {
	 
		
	}


	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}




	public static void main(String[] args) {
		new ViewBatalla(); 
		
	}







	
	

	
}
