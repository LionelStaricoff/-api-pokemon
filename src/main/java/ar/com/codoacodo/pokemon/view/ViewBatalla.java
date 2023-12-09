package ar.com.codoacodo.pokemon.view;


import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.Container;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.Point;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.Set;

import javax.swing.BorderFactory;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.SwingConstants;
import javax.swing.SwingUtilities;

import ar.com.codoacodo.enums.Fondos;
import ar.com.codoacodo.pokemon.base.GestionaPokemon;
import ar.com.codoacodo.util.UtilVentana;



public class ViewBatalla extends JFrame implements MouseListener{
	
	private JPanel panelAbuelo, panelPadre, panelSuperior,panelSuperiorIzquierdo,panelSuperMedio,
	panelMedio,panelInferior,panelCerrar,panelEntrenadorActivo;
     private JLabel btnSalir,batalla,items,cambioDePokemon;
	private Backend Backend;
	private Point initialClick;
 
	public ViewBatalla(Backend Backend ) {
		
	       this.Backend = Backend;

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
		JPanel botonCerrar = new JPanel(new GridLayout(0, 4));
		this.panelEntrenadorActivo = UtilVentana.ventanaCentrada(this.Backend.getEntrenadorActivo().getName());
		botonCerrar.setBackground(Color.BLACK);
		this.btnSalir = new JLabel("x");
		this.btnSalir.setForeground(Color.RED);
		this.btnSalir.setBorder(BorderFactory.createLineBorder(Color.RED));
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
		

		/**
		 * <p> Evento para mover la ventana</p>
		 */
		this.panelAbuelo.addMouseListener(new MouseAdapter() {
			public void mousePressed(MouseEvent e) {
				initialClick = e.getPoint();
				
			}	
		});
		
		this.panelAbuelo.addMouseMotionListener(new MouseAdapter() {
			public void mouseDragged(MouseEvent e) {
				int deltaX = e.getXOnScreen() - initialClick.x;
				int deltaY = e.getYOnScreen() - initialClick.y;
				setLocation(deltaX,deltaY);
			}
		});
		
		/**
		 * <p> setear  panel superior</p>
		 * <p> primer panel divivdido en 3: hp pokemon1, label vacio y img pokemon2</p>
		 */
		 setearPanelSuperior();
		
		
		
		
		
		/**
		 * <p> setear segundo panel </p>
		 * <p>segundo panel dividido en 3: imp pokemon1, label vacio y hp pokemon2</p>
		 */
	     setearSegndoPanel();
		
		
		
		/**
		 * <p> setear tercer panel </p>
		 * <p>tercer panel dividido en 3: button batalla, button items y button cambio de pokemon </p>
		 */
		setearTercerPanel();
		
		
		
		
	
		
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
	
	

	/**
	 * <p> setear tercer panel </p>
	 * <p>tercer panel dividido en 3: button batalla, button items y button cambio de pokemon </p>
	 */
	private void setearTercerPanel() {
		// panel inferior
		this.panelInferior = new JPanel(new GridLayout(0, 3));
		this.panelInferior.setOpaque(false);
		this.panelPadre.add(panelInferior);

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
		
	}



	/**
	 * <p> setear segundo panel </p>
	 * <p>segundo panel dividido en 3: imp pokemon1, label vacio y hp pokemon2</p>
	 */
	private void setearSegndoPanel() {
		//iniciando panel medio
		this.panelMedio = new JPanel(new GridLayout(0, 3) );
		this.panelMedio.setOpaque(false);
		this.panelPadre.add(this.panelMedio);
		
		
		this.panelMedio.add(UtilVentana.ventanaImagen(this.Backend.getPOkemonActivo().getImagenesBack(0) ));
		this.panelMedio.add(UtilVentana.ventanaVacia());
		this.panelMedio.add(UtilVentana.ventanaNombreHp(String.valueOf(this.Backend.getPokemonPasivo().getHp()), this.Backend.getPokemonPasivo().getNombre()));
	}



	/**
	 * <p>
	 * setear panel superior
	 * </p>
	 * <p>
	 * primer panel divivdido en 3: hp pokemon1, label vacio y img pokemon2
	 * </p>
	 */
	private void setearPanelSuperior() {
		// iniciando panel superior
		this.panelSuperior = new JPanel(new GridLayout(0, 3));
		this.panelSuperior.setOpaque(false);
		this.panelPadre.add(this.panelSuperior);

		this.panelSuperiorIzquierdo = UtilVentana.ventanaNombreHp(
				String.valueOf(this.Backend.getPOkemonActivo().getHp()), this.Backend.getPOkemonActivo().getNombre());
		this.panelSuperior.add(this.panelSuperiorIzquierdo);

		// lb superior del medio vacio
		this.panelSuperior.add(UtilVentana.ventanaVacia());

		// agregando panel superior izquierdo con la imagen
		this.panelSuperMedio = UtilVentana.ventanaImagen(this.Backend.getPokemonPasivo().getImagenesFront(0));
		this.panelSuperior.add(this.panelSuperMedio);

	}



	//ventana que setea los 4 ataques de los pokemon
	public JPanel viewAtaques() {
		JPanel panelPrincipal = new JPanel(new BorderLayout());
	var bk = this.Backend;
		
		//crea un margin
		panelPrincipal.setBorder(BorderFactory.createLoweredBevelBorder());
		JPanel panelIzquierdo = new JPanel(new GridLayout(2,2,10,10));
		
		this.panelCerrar = UtilVentana.ventanaCentrada("x     ");
		this.panelCerrar.addMouseListener(this);
		this.panelCerrar.setBorder(BorderFactory.createLineBorder(Color.RED));
		
		String pokes[] = new String [4];
		pokes[0] = ((this.Backend.getPOkemonActivo().getMoves(0).getClass() != null ))? this.Backend.getPOkemonActivo().getMoves(0) : "   ";
		pokes[1] = ((this.Backend.getPOkemonActivo().getMoves(1).getClass() != null) )? this.Backend.getPOkemonActivo().getMoves(1) : "   ";
		pokes[2] = ((this.Backend.getPOkemonActivo().getMoves(2).getClass() != null ) )? this.Backend.getPOkemonActivo().getMoves(2) : "   ";
		pokes[3] = ((this.Backend.getPOkemonActivo().getMoves(3).getClass() != null ) )? this.Backend.getPOkemonActivo().getMoves(3) : "   ";
		
		
		Set<JComponent> pokeLavel =  Set.of(UtilVentana.crearLavelCentrado( pokes[0]),
				UtilVentana.crearLavelCentrado( pokes[1]),UtilVentana.crearLavelCentrado( pokes[2]),
				UtilVentana.crearLavelCentrado( pokes[3]));
		
		//agregando efectos a los labels
		pokeLavel.forEach(l->{
			l.addMouseListener(new MouseAdapter() {
				
				
				@Override
				public void mouseEntered(MouseEvent e) {
				
						l.setForeground(Color.BLUE);
					    l.setBorder(BorderFactory.createLineBorder(Color.BLUE));	
					
					
				}
				
				@Override
				public void mouseExited(MouseEvent e) {
					l.setForeground(Color.RED);
				    l.setBorder(BorderFactory.createLineBorder(Color.RED));
				}
				
				@Override //over
				public void mouseClicked(MouseEvent e) {
					
						
												bk.getBatallaPokemon().atacar(bk.getPOkemonActivo(),bk.getPOkemonActivo().objtenerNUmeroDeAtaque( l.getName()), bk.getPokemonPasivo());
												if ( bk.getPokemonPasivo().estaMuerto() ) {
													
														
														}
												bk.intercambiarEntrenadores();
													repintarTodosLosPaneles();
													}
					
				
			});
			
			//agregar el list con los botones
			panelIzquierdo.add(( l) );
		});
		
		
	
	
		
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
		var bk = this.Backend;
		

		this.panelCerrar = UtilVentana.ventanaCentrada(" X    ");
		this.panelCerrar.addMouseListener(this);
		this.panelCerrar.setOpaque(false);
		this.panelCerrar.setBorder(BorderFactory.createLineBorder(Color.RED));
		
		 if(this.Backend.getEntrenadorActivo().getItems().size()< 13) {
	        	JPanel	panelItems =  new JPanel( new GridLayout(2,2));
	        	panelItems.setOpaque(false);
	        	panelItems.setBorder(BorderFactory.createLineBorder(Color.RED));
	        	
	        	 this.Backend.getEntrenadorActivo().getItems().forEach((i)->{
	        		var vi = UtilVentana.ventanaImagen(String.valueOf(i.getImg()));
	        		 vi.setBorder(BorderFactory.createLineBorder(Color.RED));
	        		 vi.addMouseListener(new MouseAdapter() {

	     				@Override
	     				public void mouseEntered(MouseEvent e) {
	     				
	     						vi.setForeground(Color.BLUE);
	     						vi.setBorder(BorderFactory.createLineBorder(Color.BLUE));	
	     					
	     					
	     				}
	     				
	     				@Override
	     				public void mouseExited(MouseEvent e) {
	     					vi.setForeground(Color.RED);
	     					vi.setBorder(BorderFactory.createLineBorder(Color.RED));
	     				}
	     				
	     				@Override //over
	     				public void mouseClicked(MouseEvent e) {
	     					bk.getEntrenadorActivo().utilizarItem(bk.keyItem(i), bk.getPOkemonActivo(),bk.itemUtilizado);
	     			        bk.intercambiarEntrenadores();
	     			        repintarTodosLosPaneles();
	     				}

						
					});
	        		 panelItems.add(vi);
	        			  
	        	 });
	        	
	        panelPrincipal.add(this.panelCerrar,BorderLayout.EAST);
	        panelPrincipal.add(panelItems,BorderLayout.CENTER);
	        return panelPrincipal;
	        }
		 
		 
		JPanel panelItems = new JPanel(new GridLayout(3,3));
		panelItems.setOpaque(false);
		  JScrollPane scrollPane = new JScrollPane(panelItems);
		  scrollPane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED); 
		  scrollPane.setOpaque(false);

	        // Agregar las imagenes al JPanel
	        this.Backend.getEntrenadorActivo().getItems().forEach((i)->{
	            panelItems.add(UtilVentana.ventanaImagen(String.valueOf(i.getImg())));
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
		
		this.Backend.getEntrenadorActivo().getPokemons().forEach((p)->{
			if(p.getHp()>0 && p != this.Backend.getPOkemonActivo()) {
			panelPokemon.add(UtilVentana.crearLavelCentrado(p,this));
			}
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
		
		if(	e.getSource() == btnSalir) {
			System.exit(0);
		}
		
		if(e.getSource() == batalla) {
			SwingUtilities.invokeLater(()->{
			this.panelInferior.removeAll(); 
			this.panelInferior.setLayout(new GridLayout(0, 1));
			this.panelInferior.add(this.viewAtaques());
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
		
		if(e.getSource() == this.panelCerrar) {
			this.panelCerrar.setForeground(Color.BLUE);
			this.panelCerrar.setBorder(BorderFactory.createLineBorder(Color.BLUE));	
		}
		
		if(e.getSource() == this.btnSalir) {
			this.btnSalir.setForeground(Color.BLUE);
			this.btnSalir.setBorder(BorderFactory.createLineBorder(Color.BLUE));	
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
		if(e.getSource() == this.panelCerrar) {
			this.panelCerrar.setForeground(Color.RED);
			this.panelCerrar.setBorder(BorderFactory.createLineBorder(Color.RED));	
		}
		
		if(e.getSource() == this.btnSalir) {
			this.btnSalir.setForeground(Color.RED);
			this.btnSalir.setBorder(BorderFactory.createLineBorder(Color.RED));	
		}
	}



	public ar.com.codoacodo.pokemon.view.Backend getBackend() {
		// TODO Auto-generated method stub
		return this.Backend;
	}



	public Container getPanelInferior() {
		return this.panelInferior;
	}



	public Component getBatalla() {
		return this.batalla;
	}



	public Component getItems() {
		return this.items;
	}



	public Component getCambioDePokemon() {
		return this.cambioDePokemon;
	}



	public Container getPanelSuperior() {
		return this.panelSuperior;
	}



	public GestionaPokemon getPokemonPasivo() {
		return this.getBackend().getPokemonPasivo();
	}



	public Container getPanelMedio() {
		return this.panelMedio;
	}



	public GestionaPokemon getPokemonActivo() {
		return this.Backend.getPOkemonActivo();
	}

	
	/**
	 * <p>
	 * funcion para volver a cargar todos los paneles
	 * </p>
	 */
	public void repintarTodosLosPaneles() {
		Set<JPanel> ventanas = Set.of(this.panelSuperior, this.panelMedio, this.panelInferior, this.panelPadre);
			
		
		
	
			SwingUtilities.invokeLater(() -> {
				this.panelPadre.removeAll();
				
				setearPanelSuperior();
				setearSegndoPanel();
				setearTercerPanel();
				
				this.panelPadre.revalidate();
				this.panelPadre.repaint();
			

			
		});
	
	}


}
