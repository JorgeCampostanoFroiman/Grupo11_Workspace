package appEscritorio;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Ejercicio2 extends JFrame {

    public Ejercicio2() {
        // Configuración de la ventana
        setTitle("Promedio");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        
        // Panel principal
        JPanel mainPanel = new JPanel(new BorderLayout());
        
        // Panel para las entradas de notas
        JPanel inputPanel = new JPanel(new BorderLayout());
        JPanel notasPanel = new JPanel(new GridLayout(4, 2, 5, 5));
        notasPanel.setBorder(BorderFactory.createTitledBorder("Notas del estudiante"));

        // Etiquetas y campos de texto para las notas
        JLabel nota1Label = new JLabel("Nota 1:");
        notasPanel.add(nota1Label);
        
        JTextField nota1Field = new JTextField();
        notasPanel.add(nota1Field);
        
        JLabel nota2Label = new JLabel("Nota 2:");
        notasPanel.add(nota2Label);
        
        JTextField nota2Field = new JTextField();
        notasPanel.add(nota2Field);
        
        JLabel nota3Label = new JLabel("Nota 3:");
        notasPanel.add(nota3Label);
        
        JTextField nota3Field = new JTextField();
        notasPanel.add(nota3Field);
        
        JLabel tpsLabel = new JLabel("TPS:");
        notasPanel.add(tpsLabel);
        
        JComboBox<String> tpsComboBox = new JComboBox<>(new String[]{"Aprobado", "Desaprobado"});
        notasPanel.add(tpsComboBox);
        
        // Panel para botones
        JPanel buttonPanel = new JPanel(new GridLayout(3, 1, 5, 5));
        
        JButton calcularButton = new JButton("CALCULAR");
        calcularButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                //Aca manejariamos el calculo, lo ideal seria una funcion
            }
        });
        buttonPanel.add(calcularButton);
        
        JButton nuevoButton = new JButton("NUEVO");
        buttonPanel.add(nuevoButton);
        
        JButton salirButton = new JButton("SALIR");
        buttonPanel.add(salirButton);
        
       
        // Añadir los paneles al panel principal
        inputPanel.add(notasPanel, BorderLayout.CENTER);
        inputPanel.add(buttonPanel, BorderLayout.EAST);
        
        mainPanel.add(inputPanel, BorderLayout.NORTH);

        // Configuración del panel principal
        setContentPane(mainPanel);
    }
}