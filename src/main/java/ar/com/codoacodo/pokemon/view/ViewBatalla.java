package ar.com.codoacodo.pokemon.view;


import java.awt.BorderLayout;
import java.awt.Color;
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

import ar.com.codoacodo.enums.Fondos;
import ar.com.codoacodo.pokemon.entrenador.EntrenadorBase;
import ar.com.codoacodo.util.UtilVentana;



public class ViewBatalla extends JFrame implements MouseListener{
	
	private JPanel panelAbuelo, panelPadre, panelSuperior,panelSuperiorIzquierdo,panelSuperMedio,
	panelMedio,panelInferior,panelCerrar,panelEntrenadorActivo;
     private JLabel btnSalir,batalla,items,cambioDePokemon;
	private backend backend;
 
	public ViewBatalla(backend backend ) {
		
	       this.backend = backend;

		/**
		 * <p> Creando las ventanas de la batalla y agregando el panel abuelo base y
		 * padre como fondo</p>
		 * <p> primer panel divivdido en 2: hp pokemon1, label vacio y img pokemon2</p>
		 */
	
		//panel padre
		this.panelPadre = new JPanel (new GridLayout(3,0) );
		UtilVentana.pintarImagenEnVentana(this.panelPadre,Fondos.CATACUMBA.fondo);
	    
		//panel abuelo
		this.panelAbuelo = new JPanel(new BorderLayout());
		JPanel botonCerrar = new JPanel(new GridLayout(0,4));
		this.panelEntrenadorActivo = UtilVentana.ventanaCentrada(this.backend.getEntrenadorActivo().getName());
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
		
		this.panelAbuelo.add(this.panelEntrenadorActivo,BorderLayout.SOUTH);
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
		this.panelSuperiorIzquierdo = UtilVentana.ventanaNombreHp(String.valueOf(this.backend.getPOkemonActivo().getHp()) , this.backend.getPOkemonActivo().getNombre());
		this.panelSuperior.add(this.panelSuperiorIzquierdo);
		
		
		
		//lb superior del medio vacio
		this.panelSuperior.add( UtilVentana.ventanaVacia());
		
		// agregando panel superior izquierdo con la imagen
	    this.panelSuperMedio = UtilVentana.ventanaImagen(this.backend.getPokemonPasivo().getImagenesFront(0));
		this.panelSuperior.add(this.panelSuperMedio);
		
		
		
		
		
		
		/**
		 * <p> setear segundo panel </p>
		 * <p>segundo panel dividido en 3: imp pokemon1, label vacio y hp pokemon2</p>
		 */
		this.panelMedio.add(UtilVentana.ventanaImagen(this.backend.getPOkemonActivo().getImagenesBack(0) ));
		this.panelMedio.add(UtilVentana.ventanaVacia());
		this.panelMedio.add(UtilVentana.ventanaNombreHp(String.valueOf(this.backend.getPokemonPasivo().getHp()), this.backend.getPokemonPasivo().getNombre()));
	
		
		
		
		
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
	public JPanel viewAtaques(EntrenadorBase entrenadorActivo) {
		JPanel panelPrincipal = new JPanel(new BorderLayout());
	
		
		//crea un margin
		panelPrincipal.setBorder(BorderFactory.createLoweredBevelBorder());
		JPanel panelIzquierdo = new JPanel(new GridLayout(2,2,10,10));
		
		this.panelCerrar = UtilVentana.ventanaCentrada("x     ");
		this.panelCerrar.addMouseListener(this);
		this.panelCerrar.setBorder(BorderFactory.createLineBorder(Color.RED));
		
		String pokes[] = new String [4];
		pokes[0] = ((this.backend.getPOkemonActivo().getMoves(0).getClass().isInstance(pokes.getClass()) ) )? this.backend.getPOkemonActivo().getMoves(0) : "";
		pokes[1] = ((this.backend.getPOkemonActivo().getMoves(1).getClass().isInstance(pokes.getClass()) ) )? this.backend.getPOkemonActivo().getMoves(1) : "";
		pokes[2] = ((this.backend.getPOkemonActivo().getMoves(2).getClass().isInstance(pokes.getClass()) ) )? this.backend.getPOkemonActivo().getMoves(2) : "";
		pokes[3] = ((this.backend.getPOkemonActivo().getMoves(3).getClass().isInstance(pokes.getClass()) ) )? this.backend.getPOkemonActivo().getMoves(3) : "";
		
		panelIzquierdo.add(UtilVentana.crearLavelCentrado( pokes[0]) );
		panelIzquierdo.add(UtilVentana.crearLavelCentrado( pokes[1]) );
		panelIzquierdo.add(UtilVentana.crearLavelCentrado( pokes[2]) );
		panelIzquierdo.add(UtilVentana.crearLavelCentrado( pokes[3]) );
		
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
	        this.backend.getEntrenadorActivo().getItems().forEach((i)->{
	            JLabel label = UtilVentana.crearLavelCentrado( String.valueOf(i));
	            panelItems.add(label);
	        });
	        
	        
	        panelPrincipal.add(this.panelCerrar,BorderLayout.EAST);
	        panelPrincipal.add(scrollPane,BorderLayout.CENTER);
	        return panelPrincipal;
	}
	
	public JPanel viewCambioPokemon() {
		JPanel panelPrincipal = new JPanel(new BorderLayout());
		panelPrincipal.setOpaque(false);
		
		// verificar cantidad de pokemon y si es par cambiar el grid 2,2
		JPanel panelPokemon = new JPanel(new GridLayout());
		panelPokemon.setOpaque(false);
		
		this.backend.getEntrenadorActivo().getPokemons().forEach((p)->{
			panelPokemon.add(UtilVentana.crearLavelCentrado(p.getNombre()));
		});
		
		
	
		
	
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
			this.panelInferior.add(this.viewAtaques(this.backend.getEntrenadorActivo()));
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



}
