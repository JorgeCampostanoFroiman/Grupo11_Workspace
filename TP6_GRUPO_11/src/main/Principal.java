package main;

import java.util.ArrayList;

import dao.PersonaDao;
import entidad.Persona;
import negocio.PersonaNegocio;
import negocioImpl.PersonaNegocioImpl;
import presentacion.controlador.Controlador;
import presentacion.vista.VentanaPrincipal;

public class Principal {

	public static void main(String[] args) {
		
		VentanaPrincipal ventanaPrincipal = new VentanaPrincipal();
		
		PersonaNegocio negocio = new PersonaNegocioImpl(); 
		
		Controlador controlador = new Controlador(ventanaPrincipal, negocio);	
		controlador.Inicializar();
		
	
	}

}
	