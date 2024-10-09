package presentacion.controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import negocio.PersonaNegocio;
import presentacion.vista.VentanaPrincipal;

public class Controlador implements ActionListener{

		private VentanaPrincipal _ventana; 
		private PersonaNegocio _personaNegocio;


		public Controlador(VentanaPrincipal ventana, PersonaNegocio _personaNegocio) {
			this._ventana = ventana;
			this._personaNegocio = _personaNegocio;
			this._ventana.getBtnAgregar().addActionListener(a -> AgregarVistaAgregar(a));
			this._ventana.getAddperson().getBtnAceptar().addActionListener(a -> AgregarPersona(a));
		}
		
	
		public void Inicializar() {
			this._ventana.setVisible(true);
		}
		
		public void AgregarVistaAgregar(ActionEvent a) {
			_ventana.getContentPane().removeAll(); 
			_ventana.getContentPane().add(_ventana.getAddperson());
			_ventana.getContentPane().repaint();
			_ventana.getContentPane().revalidate();
		}
		
		public void AgregarPersona(ActionEvent a) {
			//Logica para agregar una persona
		}

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			
		}
}
