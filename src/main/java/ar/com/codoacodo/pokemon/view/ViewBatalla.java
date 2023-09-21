package ar.com.codoacodo.pokemon.view;


import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.SwingConstants;
import javax.swing.SwingUtilities;

import ar.com.codoacodo.util.UtilVentana;



public class ViewBatalla extends JFrame implements MouseListener{
	
	private JPanel panelAbuelo, panelPadre, panelSuperior,panelSuperiorIzquierdo,panelSuperMedio,
	panelMedio,panelInferior,panelCerrar;
     private JLabel btnSalir,batalla,items,cambioDePokemon;
	
 
	public ViewBatalla() {
		
	

		/**
		 * <p> Creando las ventanas de la batalla y agregando el panel abuelo base y
		 * padre como fondo</p>
		 * <p> primer panel divivdido en 2: hp pokemon1, label vacio y img pokemon2</p>
		 */
	
		//panel padre
		this.panelPadre = new JPanel (new GridLayout(3,0) );
		UtilVentana.pintarImagenEnVentana(this.panelPadre,"C:/Users/Lucia/Documents/lionel/spring/git/pokemon/-api-pokemon/src/main/java/ar/com/codoacodo/pokemon/img/fondoBatalla1.jpeg");
	    
		//panel abuelo
		this.panelAbuelo = new JPanel(new BorderLayout());
		JPanel botonCerrar = new JPanel(new GridLayout(0,4));
		botonCerrar.setBackground(Color.blue);
		 this.btnSalir = new JLabel("x");
		 this.btnSalir.setFont(new Font("Verdana", Font.PLAIN, 30));
		 this.btnSalir.setOpaque(false);
		 this.btnSalir.setHorizontalAlignment(SwingConstants.CENTER);
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
	    this.panelSuperMedio = UtilVentana.ventanaCentrada(new ImageIcon("C:/Users/Lucia/Documents/lionel/spring/git/pokemon/-api-pokemon/src/test/java/img/pikachu.jpg"));
		this.panelSuperior.add(this.panelSuperMedio);
		
		
		
		
		
		
		/**
		 * <p> setear segundo panel </p>
		 * <p>segundo panel dividido en 3: imp pokemon1, label vacio y hp pokemon2</p>
		 */
		this.panelMedio.add(UtilVentana.ventanaCentrada(new ImageIcon("C:/Users/Lucia/Documents/lionel/spring/git/pokemon/-api-pokemon/src/test/java/img/pikachu.jpg")));
		this.panelMedio.add(UtilVentana.ventanaVacia());
		this.panelMedio.add(UtilVentana.ventanaNombreHp("hp pokemon2", "pikachu 2"));
	
		
		
		
		
		/**
		 * <p> setear tercer panel </p>
		 * <p>tercer panel dividido en 3: button batalla, button items y button cambio de pokemon </p>
		 */
		this.batalla = UtilVentana.crearLavelCentrado("batalla");
	    this.batalla.addMouseListener(this);
		this.panelInferior.add(UtilVentana.ventanaCentrada(this.batalla));
		
		this.items = UtilVentana.crearLavelCentrado("Items");
		this.items.addMouseListener(this);
		this.panelInferior.add(UtilVentana.ventanaCentrada(this.items));
		
		this.cambioDePokemon = UtilVentana.crearLavelCentrado("Cambio de pokemon");
	    this.cambioDePokemon.addMouseListener(this);
		this.panelInferior.add(UtilVentana.ventanaCentrada(this.cambioDePokemon));
		this.panelInferior.setOpaque(false);
		
		
		
		
	
		
		SwingUtilities.invokeLater(()->{
		setSize(600,700);
		setLocationRelativeTo(null);
		setResizable(false);
		setUndecorated(true);
		setVisible(true);
		setContentPane(this.panelAbuelo);
		revalidate();
		repaint();
		});
		
	}
	
	//ventana que setea los 4 ataques de los pokemon
	public JPanel viewAtaques(String att1,String att2,String att3,String att4) {
		JPanel panelPrincipal = new JPanel(new BorderLayout());
	
		
		//crea un margin
		panelPrincipal.setBorder(BorderFactory.createLoweredBevelBorder());
		JPanel panelIzquierdo = new JPanel(new GridLayout(2,2,10,10));
		this.panelCerrar = UtilVentana.ventanaCentrada("x     ");
		this.panelCerrar.addMouseListener(this);
		this.panelCerrar.setBorder(BorderFactory.createLineBorder(Color.RED));
		
		
		panelIzquierdo.add(UtilVentana.crearLavelCentrado( att1) );
		panelIzquierdo.add(UtilVentana.crearLavelCentrado( att2) );
		panelIzquierdo.add(UtilVentana.crearLavelCentrado( att3) );
		panelIzquierdo.add(UtilVentana.crearLavelCentrado( att4) );
		
		panelPrincipal.add(UtilVentana.ventanaVacia(),BorderLayout.WEST);
		panelPrincipal.add(UtilVentana.ventanaVacia(),BorderLayout.SOUTH);
		panelPrincipal.add(UtilVentana.ventanaVacia(),BorderLayout.NORTH);
		panelPrincipal.add(panelIzquierdo,BorderLayout.CENTER);
		panelPrincipal.add(panelCerrar,BorderLayout.EAST );
		
		panelCerrar.setOpaque(false);
		panelIzquierdo.setOpaque(false);
		panelPrincipal.setOpaque(false);
		
		return panelPrincipal;
	}
	
	public JPanel viewCambioPokemon() {
		JPanel panelPrincipal = new JPanel(new BorderLayout());
		panelPrincipal.setOpaque(false);
		
		// verificar cantidad de pokemon y si es par cambiar el grid 2,2
		JPanel panelPokemon = new JPanel(new GridLayout());
		panelPokemon.setOpaque(false);
		panelPokemon.add(UtilVentana.crearLavelCentrado("poke1"));
		panelPokemon.add(UtilVentana.crearLavelCentrado("poke2"));
		panelPokemon.add(UtilVentana.crearLavelCentrado("poke3"));
		panelPokemon.add(UtilVentana.crearLavelCentrado("poke4"));
		panelPokemon.add(UtilVentana.crearLavelCentrado("poke5"));
		panelPokemon.add(UtilVentana.crearLavelCentrado("poke6"));
		
	
		this.panelCerrar = UtilVentana.ventanaCentrada("x     ");
		this.panelCerrar.addMouseListener(this);
		this.panelCerrar.setOpaque(false);
		this.panelCerrar.setBorder(BorderFactory.createLineBorder(Color.RED));
		
		panelPrincipal.add(panelPokemon,BorderLayout.CENTER);
		panelPrincipal.add(this.panelCerrar,BorderLayout.EAST);
		
		return panelPrincipal;
	}
	
	
	@Override
	public void mouseClicked(MouseEvent e) {
		if(	e.getSource() == btnSalir) System.exit(0);
		if(e.getSource() == batalla) {
			SwingUtilities.invokeLater(()->{
			this.panelInferior.removeAll(); 
			this.panelInferior.setLayout(new GridLayout(0, 1));
			this.panelInferior.add(this.viewAtaques("1","2","3","4"));
			this.panelInferior.revalidate();
			this.panelInferior.repaint();
			});
		}
		if(e.getSource() == items) {
			
			SwingUtilities.invokeLater(()->{
				this.panelInferior.removeAll(); 
				this.panelInferior.setLayout(new GridLayout(0, 1));
				this.panelInferior.add(this.vewItems());
				this.panelInferior.revalidate();
				this.panelInferior.repaint();
				});
		}
		if(e.getSource() == cambioDePokemon) {
			SwingUtilities.invokeLater(()->{
				this.panelInferior.removeAll(); 
				this.panelInferior.setLayout(new GridLayout(0, 1));
				this.panelInferior.add(this.viewCambioPokemon());
				this.panelInferior.revalidate();
				this.panelInferior.repaint();
			});
		}
		if(e.getSource() == this.panelCerrar) {
			SwingUtilities.invokeLater(()->{
			this.panelInferior.removeAll(); 
			this.panelInferior.setLayout(new GridLayout(0, 3));
			this.panelInferior.add(UtilVentana.ventanaCentrada(this.batalla));
			this.panelInferior.add(UtilVentana.ventanaCentrada(this.items));
			this.panelInferior.add(UtilVentana.ventanaCentrada(this.cambioDePokemon));
			this.panelInferior.revalidate();
			this.panelInferior.repaint();
			});
		}
		
	}

	private JPanel vewItems() {
		JPanel panelPrincipal = new JPanel(new BorderLayout());
		panelPrincipal.setOpaque(false);
		

		this.panelCerrar = UtilVentana.ventanaCentrada(" X    ");
		this.panelCerrar.addMouseListener(this);
		this.panelCerrar.setOpaque(false);
		this.panelCerrar.setBorder(BorderFactory.createLineBorder(Color.RED));
		
		
		JPanel panelItems = new JPanel(new GridLayout(3,3));
		panelItems.setOpaque(false);
		  JScrollPane scrollPane = new JScrollPane(panelItems);
		  scrollPane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED); 
		  scrollPane.setOpaque(false);

	        // Agregar los JLabels al JPanel
	        for (int i = 1; i <= 80; i++) {
	            JLabel label = UtilVentana.crearLavelCentrado("Etiqueta " + i);
	          
	            panelItems.add(label);
	        }
	        
	        
	        panelPrincipal.add(this.panelCerrar,BorderLayout.EAST);
	        panelPrincipal.add(scrollPane,BorderLayout.CENTER);
	        return panelPrincipal;
	}

	@Override
	public void mousePressed(MouseEvent e) {
		
		
	}


	@Override
	public void mouseReleased(MouseEvent e) {
		
		
	}


	//hover
	public void mouseEntered(MouseEvent e) {
		if(e.getSource() == batalla) {
			this.batalla.setForeground(Color.BLUE);
			this.batalla.setBorder(BorderFactory.createLineBorder(Color.BLUE));	
		}
		if(e.getSource() == items) {
			this.items.setForeground(Color.BLUE);
			this.items.setBorder(BorderFactory.createLineBorder(Color.BLUE));	
		}
		
		if(e.getSource() == cambioDePokemon) {
			this.cambioDePokemon.setForeground(Color.BLUE);
			this.cambioDePokemon.setBorder(BorderFactory.createLineBorder(Color.BLUE));	
		}
		
		
	}


	@Override
	public void mouseExited(MouseEvent e) {
		if(e.getSource() == batalla) {
			this.batalla.setForeground(Color.RED);
			this.batalla.setBorder(BorderFactory.createLineBorder(Color.RED));
		}
		if(e.getSource() == items) {
			this.items.setForeground(Color.RED);
			this.items.setBorder(BorderFactory.createLineBorder(Color.RED));
		}
		if(e.getSource() == cambioDePokemon) {
			this.cambioDePokemon.setForeground(Color.RED);
			this.cambioDePokemon.setBorder(BorderFactory.createLineBorder(Color.RED));
		}
	}


	public static void main(String[] args) {

		new ViewBatalla(); 


	}
}
