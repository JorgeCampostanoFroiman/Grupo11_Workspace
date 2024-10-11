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
	private JMenuItem btnAgregar;
    private JMenuItem btnModificar;
    private JMenuItem btnEliminar; 
    private JMenuItem btnListar;
    private AgregarPersona addperson = new AgregarPersona();
    private ListarPersona listperson = new ListarPersona();
	
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
		setBounds(100, 100, 500, 330);
		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		JMenu mnPersona = new JMenu("Persona");
		menuBar.add(mnPersona);
		
		btnAgregar = new JMenuItem("Agregar");
		mnPersona.add(btnAgregar);
		
        btnModificar = new JMenuItem("Modificar");
        mnPersona.add(btnModificar);

        btnEliminar = new JMenuItem("Eliminar");
        mnPersona.add(btnEliminar);
        
		btnListar = new JMenuItem("Listar");
		mnPersona.add(btnListar);
		
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
	
	}
	
	public ListarPersona getListperson() {
		return listperson;
	}
	
    public AgregarPersona getAddperson() {
        return addperson;
    }

	public JMenuItem getBtnAgregar() {
		return btnAgregar;
	}
	
    public JMenuItem getBtnModificar() {
        return btnModificar;
    }

    public JMenuItem getBtnEliminar() {
        return btnEliminar;
    }
	
	public JMenuItem getBtnListar() {
		return btnListar;
	}
}
