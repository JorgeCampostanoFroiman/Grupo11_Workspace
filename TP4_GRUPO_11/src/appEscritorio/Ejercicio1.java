package appEscritorio;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Ejercicio1 extends JFrame {
	private static final long serialVersionUID = 1L;

	private JTextField txtNombre, txtApellido, txtTelefono;
	private JTextField txtFechaNac;

	public Ejercicio1() {
		setTitle("Ejercicio 1 - Datos de Contacto");
		setSize(450, 400);
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

		// Codigo para responsivamente centrar la ventana en cualquier resolucion

		// Obtener las dimensiones de la pantalla
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();

		// Obtener el tamaño de la ventana
		Dimension frameSize = getSize();

		// Calcular la posición para centrar la ventana
		int x = (screenSize.width - frameSize.width) / 2;
		int y = (screenSize.height - frameSize.height) / 2;

		setLocation(x, y);

		// Campos de texto
		txtNombre = new JTextField();
		txtNombre.setBounds(142, 43, 217, 25);
		txtApellido = new JTextField();
		txtApellido.setBounds(142, 89, 217, 25);
		txtTelefono = new JTextField();
		txtTelefono.setBounds(142, 135, 217, 25);
		getContentPane().setLayout(null);

		// Etiquetas
		JLabel label = new JLabel("Nombre:");
		label.setBounds(64, 45, 68, 20);
		getContentPane().add(label);
		getContentPane().add(txtNombre);
		JLabel lblApellido = new JLabel("Apellido:");
		lblApellido.setBounds(64, 91, 68, 20);
		getContentPane().add(lblApellido);
		getContentPane().add(txtApellido);
		JLabel lblTelefono = new JLabel("Telefono:");
		lblTelefono.setBounds(64, 135, 46, 25);
		getContentPane().add(lblTelefono);
		getContentPane().add(txtTelefono);

		// Botón Mostrar
		JButton btnMostrar = new JButton("Mostrar");
		btnMostrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if (txtApellido.getText().trim() == "" || txtNombre.getText().trim() == ""
						|| txtTelefono.getText().trim() == "" || txtFechaNac.getText().trim() == "") {
					PintarTxtBoxIncompletos();
				} else {

				}
			}
		});
		btnMostrar.setBounds(154, 230, 122, 34);
		getContentPane().add(btnMostrar);

		txtFechaNac = new JTextField();
		txtFechaNac.setBounds(142, 179, 217, 25);
		getContentPane().add(txtFechaNac);

		JLabel lblFechaNac = new JLabel("Fecha Nac:");
		lblFechaNac.setBounds(64, 179, 76, 25);
		getContentPane().add(lblFechaNac);

		JLabel lblLosDatosIngresados = new JLabel("Los datos ingresados fueron: ");
		lblLosDatosIngresados.setBounds(23, 325, 401, 14);
		getContentPane().add(lblLosDatosIngresados);
	}

	private void PintarTxtBoxIncompletos() {
		if (txtNombre.getText().trim() == "") {

		}

		if (txtApellido.getText().trim() == "") {

		}

		if (txtTelefono.getText().trim() == "") {

		}

		if (txtFechaNac.getText().trim() == "") {

		}
	}
}
