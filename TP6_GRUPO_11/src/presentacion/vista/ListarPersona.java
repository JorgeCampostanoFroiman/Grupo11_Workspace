package presentacion.vista;

import javax.swing.JPanel;
import javax.swing.JTextField;

import entidad.Persona;
import negocioImpl.PersonaNegocioImpl;

import javax.swing.JLabel;
import javax.swing.border.Border;
import javax.swing.border.LineBorder;
import javax.swing.*;
import java.awt.*;

import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.table.DefaultTableModel;

public class ListarPersona extends JPanel {

	private static final long serialVersionUID = 1L;
	private JTable tablePersonas;
	private ArrayList<Persona> ListaPersona;
	private PersonaNegocioImpl personaNegocioImp = new PersonaNegocioImpl();

	public ListarPersona() {

		// Borde general para la tabla
		Border generalBorder = BorderFactory.createTitledBorder("Lista de Personas"); //
		setBorder(generalBorder); // Agregar el borde general al panel
		setLayout(null);

		tablePersonas = new JTable();
		tablePersonas.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"Nombre", "Apellido", "Dni"
			}
		));
		tablePersonas.setBounds(20, 54, 440, 158);
		add(tablePersonas);

		// Borne para los atributos columnas
		Border cellBorder = BorderFactory.createLineBorder(Color.BLACK, 1);

	}

	public void RecargarLista() {
		ListaPersona = personaNegocioImp.GetListAll();
		Object[][] datos = new Object[ListaPersona.size()][3];

		for (int i = 0; i < ListaPersona.size(); i++) {
			datos[i][0] = ListaPersona.get(i).getNombre();
			datos[i][1] = ListaPersona.get(i).getApellido();
			datos[i][2] = ListaPersona.get(i).getDni();
		}
		String[] columnas = { "Nombre", "Apellido", "Dni" };

		DefaultTableModel modelo = new DefaultTableModel(datos, columnas);
		tablePersonas.setModel(modelo);
	}
}
