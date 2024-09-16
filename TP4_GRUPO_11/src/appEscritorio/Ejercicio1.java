package appEscritorio;

import javax.swing.*;
import java.awt.*;

public class Ejercicio1 extends JFrame {
	private static final long serialVersionUID = 1L; 
	
    private JTextField txtNombre, txtTelefono, txtEmail;

    public Ejercicio1() {
        setTitle("Ejercicio 1 - Datos de Contacto");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setLayout(new GridLayout(5, 2));

        // Campos de texto
        txtNombre = new JTextField();
        txtTelefono = new JTextField();
        txtEmail = new JTextField();

        // Etiquetas
        add(new JLabel("Nombre:"));
        add(txtNombre);
        add(new JLabel("Teléfono:"));
        add(txtTelefono);
        add(new JLabel("Email:"));
        add(txtEmail);
        
     // Botón Mostrar
        JButton btnMostrar = new JButton("Mostrar");
        add(btnMostrar);
    }
        

}
