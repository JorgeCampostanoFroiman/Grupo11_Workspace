package presentacion.vista;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;

public class VentanaPrincipal extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	JMenuItem btnAgregar;
	private AgregarPersona addperson = new AgregarPersona();
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					VentanaPrincipal frame = new VentanaPrincipal();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public VentanaPrincipal() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 455, 300);
		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		JMenu mnPersona = new JMenu("Persona");
		menuBar.add(mnPersona);
		
		btnAgregar = new JMenuItem("Agregar");
		mnPersona.add(btnAgregar);
		
		JMenuItem mntmNewMenuItem_1 = new JMenuItem("Modificar");
		mnPersona.add(mntmNewMenuItem_1);
		
		JMenuItem mntmEliminar = new JMenuItem("Eliminar");
		mnPersona.add(mntmEliminar);
		
		JMenuItem mntmNewMenuItem_2 = new JMenuItem("Listar");
		mnPersona.add(mntmNewMenuItem_2);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
	
	}

	public AgregarPersona getAddperson() {
		return addperson;
	}

	public JMenuItem getBtnAgregar() {
		return btnAgregar;
	}
}
