package ar.com.codoacodo.pokemon.view;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.FlowLayout;
import java.awt.Graphics;
import java.awt.GridLayout;
import java.awt.Insets;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.border.Border;

import ar.com.codoacodo.util.AdaptadorDeImg;
import ar.com.codoacodo.util.UtilVentana;

public class ViewBatalla extends JFrame {
	
	private JPanel panelPadre, panelSuperior,panelSuperiorIzquierdo,panelSuperMedio,
	panelMedio,panelInferior;
    private JLabel JLabelSuperiorFondo, JLabelSuperiorMedio;
	

	public ViewBatalla() {
		
		
	
		/**
		 * <p> Creando las ventanas de la batalla y agregando el panerl padre como
		 * fondo</p>
		 * <p> primer panel divivdido en 2: hp pokemon1, label vacio y img pokemon2</p>
		 */
	
		//panel padre
		this.panelPadre = new JPanel (new GridLayout(3,0) );
		this.panelPadre.setBackground(Color.CYAN);
		//this.panelPadre.setIconImage(new ImageIcon("C:\\Users\\Lucia\\Documents\\lionel\\spring\\git\\pokemon\\-api-pokemon\\src\\main\\java\\ar\\com\\codoacodo\\img\\fondo1.jpg").getImage());
		this.panelPadre.setBorder(new Border() {
			
			@Override
			public void paintBorder(Component c, Graphics g, int x, int y, int width, int height) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public boolean isBorderOpaque() {
				// TODO Auto-generated method stub
				return false;
			}
			
			@Override
			public Insets getBorderInsets(Component c) {
				// TODO Auto-generated method stub
				return null;
			}
		});
		
		
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
		this.panelSuperiorIzquierdo = UtilVentana.ventanaCentrada(new JLabel("80 HP"));
		this.panelSuperior.add(this.panelSuperiorIzquierdo);
		
		
		
		//lb superior del medio vacio
		this.panelSuperior.add( UtilVentana.ventanaVacia());
		
				
				//img panel superior derecho
		this.panelSuperMedio = new JPanel(new FlowLayout());
		this.panelSuperior.add(this.panelSuperMedio);
		this.JLabelSuperiorMedio = labelImg("C:\\Users\\Lucia\\Documents\\lionel\\spring\\git\\pokemon\\-api-pokemon\\src\\test\\java\\img\\pikachu.png");
		this.panelSuperMedio.add(this.JLabelSuperiorMedio);
		/**
		 * <p> setear segundo panel </p>
		 * <p>segundo panel dividido en 3: imp pokemon1, label vacio y hp pokemon2</p>
		 */
		this.panelMedio.add(new JLabel("imp pokemon1"));
		this.panelMedio.add(new JLabel());
		this.panelMedio.add(new JLabel("hp pokemon2"));
		this.panelMedio.setOpaque(false);
		//this.panelMedio.setIsetIconImage(new ImageIcon("C:\\Users\\Lucia\\Documents\\lionel\\spring\\git\\pokemon\\-api-pokemon\\src\\main\\java\\ar\\com\\codoacodo\\img\\fondo1.jpg").getImage());
		
		
		
		
		/**
		 * <p> setear tercer panel </p>
		 * <p>tercer panel dividido en 3: button batalla, button items y button cambio de pokemon </p>
		 */
		this.panelInferior.add(new JLabel("button batalla"));
		this.panelInferior.add(new JLabel("button items"));
		this.panelInferior.add(new JLabel("button cambio de pokemon"));
		this.panelInferior.setOpaque(false);
		
		
		// frame principal
		setSize(600,600);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		add(this.panelPadre);
		
		 //icon = new ImageIcon("C:\\Users\\Eber\\git\\Api-Poke\\-api-pokemon\\src\\main\\java\\ar\\com\\codoacodo\\img\\fondoBatalla1.png");
			
		
		
	}
	
	private JLabel labelImg(String img) {
		JLabel lbFondo =new JLabel();
		lbFondo.setOpaque(false);
		lbFondo.setSize(WIDTH, HEIGHT);
		
		JLabel lb =	new JLabel(new ImageIcon(img));
		lb.setBounds(300, 300, 50, 50);
		AdaptadorDeImg.setImageScale(lb,lb.getIcon().toString());
		 lbFondo.add(lb);
		return lbFondo;
	}

	private JLabel labelHp(String hp) {
		
		JLabel lbHp = new JLabel(hp);
		lbHp.setBounds(200, 100, 50, 100);
		
		return lbHp;
	}

	public static void main(String[] args) {
		new ViewBatalla(); 
	}
	

	
}
