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
	private JLabel lbl_ID1;
	private JLabel lblNombre;
	private JLabel lblGenero;
	private JButton btnAceptar;
	private JComboBox<String> cbGenero;
	private JLabel lbl_ID2;
	private static DefaultListModel<Pelicula> listModel;
	static int cantidadPeliculas = 1;

	public AgregarPelicula() {
		setLayout(null);
		listModel = new DefaultListModel<>();
		
		
		lbl_ID1 = new JLabel("ID");
		lbl_ID1.setFont(new Font("Segoe UI", Font.BOLD, 12));
		lbl_ID1.setBounds(169, 82, 46, 14);
		add(lbl_ID1);

		lblNombre = new JLabel("Nombre");
		lblNombre.setFont(new Font("Segoe UI", Font.BOLD, 12));
		lblNombre.setBounds(169, 116, 46, 14);
		add(lblNombre);

		lblGenero = new JLabel("Genero");
		lblGenero.setFont(new Font("Segoe UI", Font.BOLD, 12));
		lblGenero.setBounds(169, 153, 46, 14);
		add(lblGenero);

		textField = new JTextField();
		textField.setBounds(261, 114, 133, 20);
		add(textField);
		textField.setColumns(10);

		btnAceptar = new JButton("Aceptar");
		btnAceptar.setBounds(169, 188, 92, 20);
		add(btnAceptar);

		cbGenero = new JComboBox<String>();
		cbGenero.setBounds(261, 151, 133, 20);
		cbGenero.addItem("Seleccione un genero");
		cbGenero.addItem("Terror");
		cbGenero.addItem("Accion");
		cbGenero.addItem("Suspenso");
		cbGenero.addItem("Romantica");
		add(cbGenero);
		
		lbl_ID2 = new JLabel("");
		lbl_ID2.setFont(new Font("Segoe UI", Font.BOLD, 12));
		lbl_ID2.setBounds(261, 82, 46, 14);
		lbl_ID2.setText(String.valueOf(cantidadPeliculas));
		add(lbl_ID2);

		btnAceptar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if (textField.getText() == null || textField.getText().isEmpty()) {
					JOptionPane.showMessageDialog(null, "El nombre no puede estar vacío.");
				} else {

					Categoria cat = null;
					if (cbGenero.getSelectedItem() == null || cbGenero.getSelectedItem() == "Seleccione un genero") {
						JOptionPane.showMessageDialog(null, "Debe seleccionar un genero");
					} else {
						cat = new Categoria(cbGenero.getSelectedItem().toString());
						Pelicula pel = new Pelicula();
						pel.setId(cantidadPeliculas);
						pel.setNombre(textField.getText());
						pel.setCategoria(cat);
						listModel.addElement(pel);
						
						cantidadPeliculas++;
						lbl_ID2.setText(String.valueOf(cantidadPeliculas));
					}				
				}
			}
		});

	}

	public static DefaultListModel<Pelicula> getDefaultListModel() {
		return listModel;
	}
}
