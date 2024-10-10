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



public class ListarPersona extends JPanel {

	private static final long serialVersionUID = 1L;

	
	public ListarPersona() {
		
	  
	       
		ArrayList<Persona> ListaPersona = new ArrayList<>();
	// listar personas
		JLabel lblNombre;
		JLabel lblApellido ;
		JLabel lblDni;
		
		PersonaNegocioImpl personaNegocioImp = new PersonaNegocioImpl();
		
		ListaPersona = personaNegocioImp.GetListAll();
	    
		 setLayout(new GridLayout(0, 3, 0, 0));
		 
		// Borde general para la tabla
        Border generalBorder = BorderFactory.createTitledBorder("Lista de Personas"); // 
        setBorder(generalBorder); // Agregar el borde general al panel
        
	    // Borne para los atributos columnas
        Border cellBorder = BorderFactory.createLineBorder(Color.BLACK, 1);
 
	    
        lblNombre = new JLabel("Nombre");
        lblNombre.setBorder(cellBorder); // Agregar borde
        lblNombre.setHorizontalAlignment(JLabel.CENTER); 
        add(lblNombre);
        
        lblApellido = new JLabel("Apellido");
        lblApellido.setBorder(cellBorder); // Agregar borde
        lblApellido.setHorizontalAlignment(JLabel.CENTER); 
        add(lblApellido);
        
        lblDni = new JLabel("DNI");
        lblDni.setBorder(cellBorder); // Agregar borde
        lblDni.setHorizontalAlignment(JLabel.CENTER); 
        add(lblDni);
        
		for (Persona persona : ListaPersona) {
			lblNombre = new JLabel(persona.getNombre());
			//lblNombre.setBounds(124, 33, 46, 14);
			lblNombre.setHorizontalAlignment(JLabel.CENTER);
			add(lblNombre);
			
			
			lblApellido = new JLabel(persona.getApellido());
			//lblApellido.setBounds(124, 79, 46, 14);
            lblApellido.setHorizontalAlignment(JLabel.CENTER); 
			add(lblApellido);
			
			lblDni = new JLabel(Integer.toString(persona.getDni()));
			//lblDni.setBounds(124, 127, 46, 14);
	         lblDni.setHorizontalAlignment(JLabel.CENTER); 
			add(lblDni);
			
		}
	}

}
