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
        personaNegocio = new PersonaNegocioImpl();
 
 
        modeloLista = new DefaultListModel<>();
        setLayout(null);
        JScrollPane scrollPane = new JScrollPane();
        scrollPane.setBounds(154, 11, 198, 198);
        add(scrollPane);
        listaPersonas = new JList<>(modeloLista);
        scrollPane.setViewportView(listaPersonas);
 
 
        btnEliminar = new JButton("Eliminar");
        btnEliminar.setBounds(204, 209, 100, 30);
        add(btnEliminar);
 
 
        btnEliminar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Persona personaSeleccionada = listaPersonas.getSelectedValue();
                if (personaSeleccionada != null) {
                    boolean eliminado = personaNegocio.Delete(personaSeleccionada);
                    if (eliminado) {
                        modeloLista.removeElement(personaSeleccionada);
                        cargarListaPersonas();
                        JOptionPane.showMessageDialog(null, "Persona eliminada correctamente.");
                    } else {
                        JOptionPane.showMessageDialog(null, "Error al eliminar la persona.");
                    }
                }
            }
        });
 
 
        cargarListaPersonas();
    }
 
    public void cargarListaPersonas() {
        modeloLista.clear();
        for (Persona p : personaNegocio.GetListAll()) {
            modeloLista.addElement(p);
        }
    }
}