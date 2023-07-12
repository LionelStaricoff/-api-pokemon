package ar.com.codoacodo.pokemon.view;

import java.awt.GridLayout;
import java.awt.Image;
import java.awt.Toolkit;
import java.io.File;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class ViewBatalla extends JFrame {

	private JFrame ventana;
	private JPanel panel;
	private JPanel panelSuperior = new JPanel(new GridLayout(0,2, 100,0));
	private JLabel jLabel;
	private JLabel imgPokemonEnemy = new JLabel();
	//private ImageIcon pokemonPng = new ImageIcon("/pokemon/src/main/java/ar/com/codoacodo/pokemon/img/fondoBatalla1.jpeg");

	public ViewBatalla() {
		this.ventana = new JFrame();
		this.ventana.setLayout(new GridLayout(3,0));
		this.ventana.setVisible(true);
		this.ventana.setDefaultCloseOperation(EXIT_ON_CLOSE);
		//this.ventana.setIconImage(new ImageIcon("C:\\Users\\Lucia\\Documents\\lionel\\spring\\git\\pokemon\\-api-pokemon\\src\\main\\java\\ar\\com\\codoacodo\\pokemon\\img\\fondoBatalla1.jpeg").getImage());
			
		Toolkit toolkit = Toolkit.getDefaultToolkit();
		this.ventana.setSize(toolkit.getScreenSize());
		
	
		
		this.panelSuperior.add(new JButton("vida pokemon 1"));
		this.imgPokemonEnemy.setIcon( new ImageIcon("C:\\Users\\Lucia\\Documents\\lionel\\spring\\git\\pokemon\\-api-pokemon\\src\\main\\java\\ar\\com\\codoacodo\\pokemon\\img\\fondoBatalla1.jpeg"));
			
		this.panelSuperior.add(this.imgPokemonEnemy);
		this.ventana.add( this.panelSuperior );
		this.ventana.add(new JButton("boton 2"));
		this.ventana.add(new JButton("boton 3"));
		
	
/*
		panel = new JPanel();
		this.ventana.add(panel);
		jLabel = new JLabel("Fondo");
		this.jLabel.setIcon(new ImageIcon("/-api-pokemon/src/main/java/ar/com/codoacodo/pokemon/img/fondoBatalla1.jpeg"));
	
		JButton button = new JButton();
		button.setText("Button");
		panel.add(jLabel);
		panel.add(button);
		this.ventana.add(panel);
		*/
	}

	public static void main(String[] args) {
		ViewBatalla vp = new ViewBatalla();
	}
}
