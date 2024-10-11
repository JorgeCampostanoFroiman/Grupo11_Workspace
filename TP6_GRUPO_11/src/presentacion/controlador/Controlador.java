package presentacion.controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;

import negocio.PersonaNegocio;
import presentacion.vista.VentanaPrincipal;
import presentacion.vista.ModificarPersona;
import presentacion.vista.EliminarPersona;
import entidad.Persona;

public class Controlador implements ActionListener{

		private VentanaPrincipal _ventana; 
		private PersonaNegocio _personaNegocio;
	    private ModificarPersona _modificarPersona;
	    private EliminarPersona _eliminarPersona;

		public Controlador(VentanaPrincipal ventana, PersonaNegocio personaNegocio) {
	        this._ventana = ventana;
	        this._personaNegocio = personaNegocio;
	        this._modificarPersona = new ModificarPersona();
	        this._eliminarPersona = new EliminarPersona();


	        this._ventana.getBtnAgregar().addActionListener(a -> AgregarVistaAgregar(a));
	        this._ventana.getAddperson().getBtnAceptar().addActionListener(a -> AgregarPersona(a));

	        this._ventana.getBtnModificar().addActionListener(a -> MostrarVistaModificar(a));
	        this._ventana.getBtnEliminar().addActionListener(a -> MostrarVistaEliminar(a));

	        this._ventana.getBtnListar().addActionListener(a -> AgregarVistaListar(a));
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
	        try {
	            String nombre = _ventana.getAddperson().getTxtNombre().getText();
	            String apellido = _ventana.getAddperson().getTxtApllido().getText();
	            int dni = Integer.parseInt(_ventana.getAddperson().getTxtDni().getText());

	            if (nombre.isEmpty() || apellido.isEmpty()) {
	                throw new IllegalArgumentException("Debe completar todos los campos.");
	            }

	            Persona nuevaPersona = new Persona(apellido, nombre, dni);
	            if (_personaNegocio.Insert(nuevaPersona)) {
	                JOptionPane.showMessageDialog(null, "Persona agregada correctamente.");
	                limpiarCamposAgregar();
	            } else {
	                throw new Exception("Error al agregar persona.");
	            }
	        } catch (NumberFormatException e) {
	            JOptionPane.showMessageDialog(null, "El DNI debe ser numérico.", "Error",
	            							  JOptionPane.ERROR_MESSAGE);
	        } catch (IllegalArgumentException e) {
	            JOptionPane.showMessageDialog(null, e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
	        } catch (Exception e) {
	            JOptionPane.showMessageDialog(null, e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
	        }
		}
		
		public void AgregarVistaListar(ActionEvent a) {
			_ventana.getListperson().RecargarLista();
			_ventana.getContentPane().removeAll(); 
			_ventana.getContentPane().add(_ventana.getListperson());
			_ventana.getContentPane().repaint();
			_ventana.getContentPane().revalidate();
		}
		
	    public void MostrarVistaEliminar(ActionEvent a) {
	    	_eliminarPersona.cargarListaPersonas();
	        _ventana.getContentPane().removeAll();
	        _ventana.getContentPane().add(_eliminarPersona);
	        _ventana.getContentPane().repaint();
	        _ventana.getContentPane().revalidate();
	    }
	    
	    public void MostrarVistaModificar(ActionEvent a) {
	    	_modificarPersona.cargarListaPersonas();
	        _ventana.getContentPane().removeAll();
	        _ventana.getContentPane().add(_modificarPersona);
	        _ventana.getContentPane().repaint();
	        _ventana.getContentPane().revalidate();
	    }

	    public void limpiarCamposAgregar() {
	        _ventana.getAddperson().getTxtNombre().setText("");
	        _ventana.getAddperson().getTxtApllido().setText("");
	        _ventana.getAddperson().getTxtDni().setText("");
	    }

	    @Override
	    public void actionPerformed(ActionEvent e) {
	        // Acción general
	    }
		
}
