package ar.com.codoacodo.pokemon.view;

import java.awt.Color;
import java.awt.GridLayout;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import ar.com.codoacodo.util.AdaptadorDeImg;

public class ViewBatalla extends JFrame {
	
	private JPanel panelSuperior,panelMedio,panelInferior;
	private JLabel labelPanelSuperior1;

	

	public ViewBatalla() {
		
		
	
		/**
		 * <p> Creando las ventanas de la batalla </p>
		 * <p> primer panel divivdido en 2: hp pokemon1, label vacio y img pokemon2</p>
		 */
		setSize(400,600);
		setLayout(new GridLayout(3, 0));
		setVisible(true);
		this.panelSuperior = new JPanel(new GridLayout(0, 3) );
		add( this.panelSuperior);
		this.panelMedio = new JPanel(new GridLayout(0, 3) );
		add(this.panelMedio);
		this.panelInferior = new JPanel(new GridLayout(0, 3) );
		add(panelInferior);
		setBackground(Color.CYAN);
		setIconImage(new ImageIcon("C:\\Users\\Lucia\\Documents\\lionel\\spring\\git\\pokemon\\-api-pokemon\\src\\main\\java\\ar\\com\\codoacodo\\img\\fondo1.jpg").getImage());
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		
		
		
		/**
		 * <p> setear  panel superior</p>
		 * <p> primer panel divivdido en 2: hp pokemon1, label vacio y img pokemon2</p>
		 */
		this.labelPanelSuperior1 = new JLabel("hp pokemon1");
		this.labelPanelSuperior1.setIcon(new ImageIcon("C:\\Users\\Lucia\\Documents\\lionel\\spring\\git\\pokemon\\-api-pokemon\\src\\main\\java\\ar\\com\\codoacodo\\img\\fondo1.jpg"));
		 AdaptadorDeImg.setImageScale(labelPanelSuperior1, labelPanelSuperior1.getIcon().toString());
		
		
		this.panelSuperior.add(this.labelPanelSuperior1);
		this.panelSuperior.add(new JLabel());
		this.panelSuperior.add(new JLabel("img pokemon2"));
		this.panelSuperior.setOpaque(false);
		this.panelSuperior.setBackground(Color.CYAN);
		
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
		
		
		
		
		 //icon = new ImageIcon("C:\\Users\\Eber\\git\\Api-Poke\\-api-pokemon\\src\\main\\java\\ar\\com\\codoacodo\\img\\fondoBatalla1.png");
			
		
		
	}
	
	public static void main(String[] args) {
		new ViewBatalla(); 
	}
	

	
}
