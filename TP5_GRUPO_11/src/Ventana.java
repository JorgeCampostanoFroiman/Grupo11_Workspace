import java.awt.BorderLayout;
import java.awt.EventQueue;

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
	
	
	public Ventana() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		
		menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		mnPeliculas = new JMenu("Peliculas");
		menuBar.add(mnPeliculas);
		
		JMenuItem btnAgregar = new JMenuItem("Agregar");
		btnAgregar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				AgregarPelicula addMovie = new AgregarPelicula();
				getContentPane().add(addMovie);
				getContentPane().repaint();
				getContentPane().revalidate();
			}
		});
		mnPeliculas.add(btnAgregar);
		
		JMenuItem btnListar = new JMenuItem("Listar");
		mnPeliculas.add(btnListar);
	}

}
