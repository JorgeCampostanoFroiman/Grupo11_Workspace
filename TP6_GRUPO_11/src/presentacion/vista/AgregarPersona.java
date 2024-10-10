package presentacion.vista;

import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JButton;

public class AgregarPersona extends JPanel {
	private JTextField txtNombre;
	private JTextField txtApllido;
	private JTextField txtDni;
	private JButton btnAceptar;
	
	public AgregarPersona() {
		setLayout(null);
		
		txtNombre = new JTextField();
		txtNombre.setBounds(207, 30, 118, 20);
		add(txtNombre);
		txtNombre.setColumns(10);
		
		txtApllido = new JTextField();
		txtApllido.setBounds(207, 76, 118, 20);
		add(txtApllido);
		txtApllido.setColumns(10);
		
		txtDni = new JTextField();
		txtDni.setBounds(207, 124, 118, 20);
		add(txtDni);
		txtDni.setColumns(10);
		
		JLabel lblNombre = new JLabel("Nombre");
		lblNombre.setBounds(124, 33, 46, 14);
		add(lblNombre);
		
		JLabel lblApellido = new JLabel("Apellido");
		lblApellido.setBounds(124, 79, 46, 14);
		add(lblApellido);
		
		JLabel lblDni = new JLabel("Dni");
		lblDni.setBounds(124, 127, 46, 14);
		add(lblDni);
		
		btnAceptar = new JButton("Aceptar");
		btnAceptar.setBounds(158, 170, 104, 31);
		add(btnAceptar);

	}
	
	public JTextField getTxtNombre() {
		return txtNombre;
	}

	public JTextField getTxtApllido() {
		return txtApllido;
	}

	public JTextField getTxtDni() {
		return txtDni;
	}
	
	public JButton getBtnAceptar() {
		return btnAceptar;
	}
	
	

}
