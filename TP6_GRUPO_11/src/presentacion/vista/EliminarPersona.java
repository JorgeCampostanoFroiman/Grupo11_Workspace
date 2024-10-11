package presentacion.vista;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import negocio.PersonaNegocio;
import negocioImpl.PersonaNegocioImpl;
import entidad.Persona;
 
public class EliminarPersona extends JPanel {
    private JList<Persona> listaPersonas;
    private DefaultListModel<Persona> modeloLista;
    private JButton btnEliminar;
    private PersonaNegocio personaNegocio;
 
    public EliminarPersona() {
        setLayout(null);
        personaNegocio = new PersonaNegocioImpl();
 
 
        modeloLista = new DefaultListModel<>();
        listaPersonas = new JList<>(modeloLista);
        JScrollPane scrollPane = new JScrollPane(listaPersonas);
        scrollPane.setBounds(50, 50, 200, 150);
        add(scrollPane);
 
 
        btnEliminar = new JButton("Eliminar");
        btnEliminar.setBounds(100, 220, 100, 30);
        add(btnEliminar);
 
 
        btnEliminar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Persona personaSeleccionada = listaPersonas.getSelectedValue();
                if (personaSeleccionada != null) {
                    boolean eliminado = personaNegocio.Delete(personaSeleccionada);
                    if (eliminado) {
                        modeloLista.removeElement(personaSeleccionada);
                        JOptionPane.showMessageDialog(null, "Persona eliminada correctamente.");
                    } else {
                        JOptionPane.showMessageDialog(null, "Error al eliminar la persona.");
                    }
                }
            }
        });
 
 
        cargarListaPersonas();
    }
 
    private void cargarListaPersonas() {
        modeloLista.clear();
        for (Persona p : personaNegocio.GetListAll()) {
            modeloLista.addElement(p);
        }
    }
}