package appEscritorio;

import java.awt.Color;

import javax.swing.*;
import java.awt.Component;
import java.awt.FlowLayout;
import javax.swing.border.TitledBorder;
import javax.swing.border.LineBorder;

public class Ejercicio3 extends JFrame {

	public Ejercicio3() {
		// Configuración de la ventana
		setTitle("Seleccion multiple");
		setSize(350, 308);
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setLocationRelativeTo(null);

		// Panel principal con un BoxLayout
		JPanel mainPanel = new JPanel();

		// Panel para el sistema operativo
		JRadioButton windowsButton = new JRadioButton("Windows");
		JRadioButton macButton = new JRadioButton("Mac");
		JRadioButton linuxButton = new JRadioButton("Linux");

		ButtonGroup osGroup = new ButtonGroup(); // Solo se puede seleccionar 1 radio button
		osGroup.add(windowsButton);
		osGroup.add(macButton);
		osGroup.add(linuxButton);

		//
		JLabel tituloPanel1 = new JLabel();
		tituloPanel1.setText("Elije una sistema operativo");

		//
		JPanel osPanel = new JPanel();
		osPanel.setBounds(24, 30, 288, 54);
		osPanel.setBorder(BorderFactory.createTitledBorder(BorderFactory.createLineBorder(Color.BLACK),
				"Elije un sistema operativo"));
		osPanel.add(windowsButton);
		osPanel.add(macButton);
		osPanel.add(linuxButton);

		// Panel para la cantidad de horas
		JPanel hoursPanel = new JPanel();
		hoursPanel.setBounds(0, 201, 334, 36);
		JLabel hoursLabel = new JLabel("Cantidad de horas en el computador:");
		JTextField hoursField = new JTextField(10);

		hoursPanel.add(hoursLabel);
		hoursPanel.add(hoursField);
		//

		// Panel para la especialidad
		JCheckBox programmingCheck = new JCheckBox("Programación");
		JCheckBox adminCheck = new JCheckBox("Administración");
		JCheckBox designCheck = new JCheckBox("Diseño Gráfico");

		// Botón de aceptar
		JButton acceptButton = new JButton("Aceptar");
		acceptButton.setBounds(210, 241, 102, 23);
		acceptButton.addActionListener(e -> {
			// Valores seleccionados
			String osSeleccionado = "Ningun OS Seleccionado";
			String EspecialidadSeleccionada = null;

			if (windowsButton.isSelected()) {
				osSeleccionado = "OS: Windows";
			} else if (macButton.isSelected()) {
				osSeleccionado = "OS: Mac";
			} else if (linuxButton.isSelected()) {
				osSeleccionado = "OS: Linux";
			}

			if (programmingCheck.isSelected()) {
				if (EspecialidadSeleccionada == null)
					EspecialidadSeleccionada = " - Programación";
				else
					EspecialidadSeleccionada += " - Programación";
			}

			if (adminCheck.isSelected()) {
				if (EspecialidadSeleccionada == null)
					EspecialidadSeleccionada = " - Administración";
				else
					EspecialidadSeleccionada += " - Administración";
			}

			if (designCheck.isSelected()) {
				if (EspecialidadSeleccionada == null)
					EspecialidadSeleccionada = " - Diseño Gráfico";
				else
					EspecialidadSeleccionada += " - Diseño Gráfico";
			}

			if (EspecialidadSeleccionada == null) {
				EspecialidadSeleccionada = " - Ninguna Especilidad Seleccionada";
			}

			// Mostrar mensaje con la información seleccionada
			String message = osSeleccionado + "\nEspecialidad/es: " + EspecialidadSeleccionada + "\nHoras en la PC: " + hoursField.getText();

			JOptionPane.showMessageDialog(this, message, "Información Seleccionada", JOptionPane.INFORMATION_MESSAGE);
		});
		mainPanel.setLayout(null);

		// Añadir todos los paneles al panel principal
		mainPanel.add(osPanel);
		mainPanel.add(hoursPanel);
		mainPanel.add(acceptButton);

		// Configurar el panel principal
		setContentPane(mainPanel);

		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new TitledBorder(new LineBorder(new Color(0, 0, 0)), "Elije una especilidad",
				TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		panel_1.setBounds(24, 95, 288, 95);
		mainPanel.add(panel_1);
		panel_1.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));

		panel_1.add(programmingCheck);
		panel_1.add(adminCheck);
		panel_1.add(designCheck);
	}
}