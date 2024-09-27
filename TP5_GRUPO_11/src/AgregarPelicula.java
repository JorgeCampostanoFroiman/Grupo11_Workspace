import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.DefaultListModel;

import javax.swing.JComboBox;

public class AgregarPelicula extends JPanel {
	private JTextField textField;
	private DefaultListModel <Pelicula> listModel;
	private Pelicula pel = new Pelicula();
	static int cantidadPeliculas = 0;
	public AgregarPelicula() {
		setLayout(null);
		listModel = new DefaultListModel<>();
		
		JLabel lblId = new JLabel("ID");
		lblId.setFont(new Font("Segoe UI", Font.BOLD, 12));
		lblId.setBounds(103, 42, 46, 14);
		add(lblId);
		
		JLabel lblNombre = new JLabel("Nombre");
		lblNombre.setFont(new Font("Segoe UI", Font.BOLD, 12));
		lblNombre.setBounds(103, 76, 46, 14);
		add(lblNombre);
		
		JLabel lblGenero = new JLabel("Genero");
		lblGenero.setFont(new Font("Segoe UI", Font.BOLD, 12));
		lblGenero.setBounds(103, 113, 46, 14);
		add(lblGenero);
		
		textField = new JTextField();
		textField.setBounds(195, 74, 133, 20);
		add(textField);
		textField.setColumns(10);
		
		JButton btnAceptar = new JButton("Aceptar");
		btnAceptar.setBounds(103, 148, 92, 20);
		add(btnAceptar);
		
		JComboBox<String> cbGenero = new JComboBox<String>();
		cbGenero.setBounds(195, 111, 133, 20);
		cbGenero.addItem("Terror");
		cbGenero.addItem("Accion");
		cbGenero.addItem("Suspenso");
		cbGenero.addItem("Romantica");
		add(cbGenero);
		
		btnAceptar.addActionListener(new ActionListener() {
		    public void actionPerformed(ActionEvent arg0) {
		        if (textField.getText() == null || textField.getText().isEmpty()) {
		            JOptionPane.showMessageDialog(null, "El nombre no puede estar vacío.");
		        } else {
		            cantidadPeliculas++;
		            Categoria cat = null;
		            if (cbGenero.getSelectedItem() != null) {
		                cat = new Categoria(cbGenero.getSelectedItem().toString());
		            } else {
		            	 JOptionPane.showMessageDialog(null, "Debe seleccionar un genero");
		            }
		            lblId.setText("ID: " + cantidadPeliculas);
		            Pelicula pel = new Pelicula(); 
		            pel.setId(cantidadPeliculas);
		            pel.setNombre(textField.getText());
		            pel.setCategoria(cat);
		            listModel.addElement(pel);
		        }
		    }
		});
		
		
	
	}
	
	
	public DefaultListModel<Pelicula> getDefaultListModel() {
	    return listModel;
	}
	
	
}
