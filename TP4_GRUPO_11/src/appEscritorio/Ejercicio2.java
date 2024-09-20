package appEscritorio;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class Ejercicio2 extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public Ejercicio2() {
		// Configuración de la ventana
		setTitle("Promedio");
		setSize(400, 300);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocationRelativeTo(null);

		// Panel principal
		JPanel mainPanel = new JPanel();

		// Panel para las entradas de notas
		JPanel inputPanel = new JPanel(new BorderLayout());
		inputPanel.setBounds(0, 0, 384, 118);
		JPanel notasPanel = new JPanel(new GridLayout(4, 2, 5, 5));
		notasPanel.setBorder(BorderFactory.createTitledBorder("Notas del estudiante"));

		// Etiquetas y campos de texto para las notas
		JLabel nota1Label = new JLabel("Nota 1:");
		notasPanel.add(nota1Label);

		JTextField nota1Field = new JTextField();
		nota1Field.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent arg0) {
				char c = arg0.getKeyChar();

                // Permitir solo numeros, puntos y eliminar
                if (!Character.isDigit(c) && c != '.' && c != KeyEvent.VK_BACK_SPACE) {
                	arg0.consume();
                }

                // Permitir solo un punto decimal
                if (c == '.' && nota1Field.getText().contains(".")) {
                	arg0.consume();
                }
			}
		});
		notasPanel.add(nota1Field);

		JLabel nota2Label = new JLabel("Nota 2:");
		notasPanel.add(nota2Label);

		JTextField nota2Field = new JTextField();
		nota2Field.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent arg0) {
				char c = arg0.getKeyChar();

                // Permitir solo dígitos, puntos y eliminar
                if (!Character.isDigit(c) && c != '.' && c != KeyEvent.VK_BACK_SPACE) {
                	arg0.consume();
                }

                // Permitir solo un punto decimal
                if (c == '.' && nota2Field.getText().contains(".")) {
                	arg0.consume();
                }
			}
		});
		notasPanel.add(nota2Field);

		JLabel nota3Label = new JLabel("Nota 3:");
		notasPanel.add(nota3Label);

		JTextField nota3Field = new JTextField();
		nota3Field.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent arg0) {
				char c = arg0.getKeyChar();

                // Permitir solo dígitos, puntos y eliminar
                if (!Character.isDigit(c) && c != '.' && c != KeyEvent.VK_BACK_SPACE) {
                	arg0.consume();
                }

                // Permitir solo un punto decimal
                if (c == '.' && nota3Field.getText().contains(".")) {
                	arg0.consume();
                }
			}
		});
		notasPanel.add(nota3Field);

		JLabel tpsLabel = new JLabel("TPS:");
		notasPanel.add(tpsLabel);

		// JComboBox<String> tpsComboBox = new JComboBox<>(new String[]{"Aprobado",
		// "Desaprobado"});
		// notasPanel.add(tpsComboBox);

		JComboBox<String> tpsComboBox = new JComboBox<String>();
		notasPanel.add(tpsComboBox);
		tpsComboBox.addItem("Aprobado");
		tpsComboBox.addItem("Desaprobado");

		//
		JLabel lblResultadosCalculados = new JLabel("");
		lblResultadosCalculados.setBounds(0, 261, 384, 0);
		lblResultadosCalculados.setHorizontalAlignment(SwingConstants.CENTER); // centro horizontalmente

		// Panel de abajo

		JPanel secondPanel = new JPanel();
		secondPanel.setBounds(10, 129, 256, 110);
		mainPanel.add(secondPanel);
		secondPanel.setBorder(BorderFactory.createTitledBorder("Notas del estudiante"));
		secondPanel.setLayout(null);

		JLabel lblPromedio = new JLabel("Promedio:");
		lblPromedio.setBounds(28, 43, 65, 14);
		secondPanel.add(lblPromedio);

		JLabel lblCondicion = new JLabel("Condicion");
		lblCondicion.setBounds(28, 68, 65, 14);
		secondPanel.add(lblCondicion);

		JTextField condicionField = new JTextField();
		condicionField.setEditable(false);
		condicionField.setBounds(110, 65, 113, 20);
		secondPanel.add(condicionField);

		JTextField promedioField = new JTextField();
		promedioField.setEditable(false);
		promedioField.setBounds(110, 40, 113, 20);
		secondPanel.add(promedioField);

		// Panel para botones
		JPanel buttonPanel = new JPanel(new GridLayout(3, 1, 5, 5));

		JButton calcularButton = new JButton("CALCULAR");
		calcularButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// Calculo promedio
				float promedio = calcularPromedio(nota1Field, nota2Field, nota3Field);
				// Determino condicion
				String condicion = calcularCondicion(promedio, tpsComboBox);

				// esto tiene que ir en un JLabel y mostrarse SIMIL notas del estudiante
				// lblResultadosCalculados.setText("El promedio fue de: " + promedio + " y la
				// condicion es: " + condicion + " ." ) ;
				promedioField.setText(Float.toString(promedio));
				condicionField.setText(condicion);
			}
		});
		mainPanel.setLayout(null);
		buttonPanel.add(calcularButton);

		JButton nuevoButton = new JButton("NUEVO");
		nuevoButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				LimpiarCajasDeTexto(nota1Field, nota2Field, nota3Field, promedioField, condicionField);
			}
		});
		buttonPanel.add(nuevoButton);

		JButton salirButton = new JButton("SALIR");
		salirButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
		buttonPanel.add(salirButton);

		// Añadir los paneles al panel principal
		inputPanel.add(notasPanel, BorderLayout.CENTER);

		inputPanel.add(buttonPanel, BorderLayout.EAST);

		mainPanel.add(inputPanel);

		mainPanel.add(lblResultadosCalculados);

		// Configuración del panel principal
		setContentPane(mainPanel);

	}
	private void LimpiarCajasDeTexto(JTextField nota1, JTextField nota2, JTextField nota3, JTextField promedio, JTextField condicion)
	{
		nota1.setText("");
		nota2.setText("");
		nota3.setText("");
		promedio.setText("");
		condicion.setText("");
	}
	

	private float calcularPromedio(JTextField nota1, JTextField nota2, JTextField nota3) {
		float promedio = (Float.parseFloat(nota1.getText().trim()) + Float.parseFloat(nota2.getText().trim())
				+ Float.parseFloat(nota3.getText().trim())) / 3;
		return promedio;
	}

	private String calcularCondicion(float promedio, JComboBox tpsComboBox) {

		String condicion = new String();

		if (tpsComboBox.getSelectedItem().toString() == "Aprobado" && promedio >= 8) {
			condicion = "Promocionado";
		} else {
			if (tpsComboBox.getSelectedItem().toString() == "Aprobado" && promedio >= 6) {
				condicion = "Regular";
			} else {
				condicion = "Libre";
			}
		}

		return condicion;
	}
	
}