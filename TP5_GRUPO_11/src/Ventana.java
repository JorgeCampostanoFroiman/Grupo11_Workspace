import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.DefaultListModel;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Ventana extends JFrame {

	private JMenu mnPeliculas; 
	private JMenuBar menuBar;
	private AgregarPelicula addMovie = new AgregarPelicula();

	public Ventana() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 550, 430);
		
		menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		mnPeliculas = new JMenu("Peliculas");
		menuBar.add(mnPeliculas);
		
		
		
		JMenuItem btnAgregar = new JMenuItem("Agregar");
		btnAgregar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				getContentPane().removeAll(); 
				getContentPane().add(addMovie);
				getContentPane().repaint();
				getContentPane().revalidate();
			}
			
		});
		mnPeliculas.add(btnAgregar);
		
		JMenuItem btnListar = new JMenuItem("Listar");
		btnListar.addActionListener(new ActionListener() {
		    public void actionPerformed(ActionEvent e) {
		        ListarPelicula listar = new ListarPelicula();
		        listar.Listar(addMovie.getDefaultListModel());
		        getContentPane().removeAll(); 
		        getContentPane().add(listar);
		        getContentPane().repaint();
		        getContentPane().revalidate();
		    }
		});
		mnPeliculas.add(btnListar);
	}

}
