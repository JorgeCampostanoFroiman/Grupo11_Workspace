package appEscritorio;

import javax.swing.*;


public class Ejercicio3 extends JFrame {


    public Ejercicio3() {
    	// Configuración de la ventana
        setTitle("Seleccion multiple");
        setSize(350, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        // Panel principal con un BoxLayout
        JPanel mainPanel = new JPanel();
        mainPanel.setLayout(new BoxLayout(mainPanel, BoxLayout.Y_AXIS));
        
        // Panel para el sistema operativo
        JRadioButton windowsButton = new JRadioButton("Windows");
        JRadioButton macButton = new JRadioButton("Mac");
        JRadioButton linuxButton = new JRadioButton("Linux");
        
        ButtonGroup osGroup = new ButtonGroup();
        osGroup.add(windowsButton);
        osGroup.add(macButton);
        osGroup.add(linuxButton);
        
        JPanel osPanel = new JPanel();
        osPanel.setBorder(BorderFactory.createTitledBorder("Elije un sistema operativo"));
        osPanel.add(windowsButton);
        osPanel.add(macButton);
        osPanel.add(linuxButton);

        // Panel para la especialidad
        JCheckBox programmingCheck = new JCheckBox("Programación");
        JCheckBox adminCheck = new JCheckBox("Administración");
        JCheckBox designCheck = new JCheckBox("Diseño Gráfico");
        
        JPanel specialityPanel = new JPanel();
        specialityPanel.setBorder(BorderFactory.createTitledBorder("Elije una especialidad"));
        specialityPanel.add(programmingCheck);
        specialityPanel.add(adminCheck);
        specialityPanel.add(designCheck);

        // Panel para la cantidad de horas
        JPanel hoursPanel = new JPanel();
        JLabel hoursLabel = new JLabel("Cantidad de horas en el computador:");
        JTextField hoursField = new JTextField(10);
        
        hoursPanel.add(hoursLabel);
        hoursPanel.add(hoursField);

        // Botón de aceptar
        JButton acceptButton = new JButton("Aceptar");
        acceptButton.addActionListener(e -> {

            // Mostrar mensaje con la información seleccionada
            String message = "";

            JOptionPane.showMessageDialog(this, message, "Información Seleccionada",
            							  JOptionPane.INFORMATION_MESSAGE);
        });

        // Añadir todos los paneles al panel principal
        mainPanel.add(osPanel);
        mainPanel.add(specialityPanel);
        mainPanel.add(hoursPanel);
        mainPanel.add(acceptButton);

        // Configurar el panel principal
        setContentPane(mainPanel);
    }
}