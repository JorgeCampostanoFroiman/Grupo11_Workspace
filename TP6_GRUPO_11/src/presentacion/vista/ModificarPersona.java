package presentacion.vista;
 
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import negocio.PersonaNegocio;
import negocioImpl.PersonaNegocioImpl;
import entidad.Persona;
 
public class ModificarPersona extends JPanel {
    private JList<Persona> listaPersonas;
    private DefaultListModel<Persona> modeloLista;
    private JTextField txtNombre;
    private JTextField txtApellido;
    private JTextField txtDni;
    private JButton btnModificar;
    private PersonaNegocio personaNegocio;
 
    public ModificarPersona() {
        setLayout(null);
        personaNegocio = new PersonaNegocioImpl();
 
 
        modeloLista = new DefaultListModel<>();
        JScrollPane scrollPane = new JScrollPane();
        scrollPane.setBounds(21, 26, 440, 150);
        add(scrollPane);
        listaPersonas = new JList<>(modeloLista);
        scrollPane.setViewportView(listaPersonas);
        
        
               listaPersonas.addListSelectionListener(e -> {
                   Persona personaSeleccionada = listaPersonas.getSelectedValue();
                   if (personaSeleccionada != null) {
                       txtNombre.setText(personaSeleccionada.getNombre());
                       txtApellido.setText(personaSeleccionada.getApellido());
                       txtDni.setText(String.valueOf(personaSeleccionada.getDni()));
                   }
               });
 
        txtNombre = new JTextField();
        txtNombre.setBounds(21, 196, 100, 25);
        add(txtNombre);
 
        txtApellido = new JTextField();
        txtApellido.setBounds(139, 196, 100, 25);
        add(txtApellido);
 
        txtDni = new JTextField();
        txtDni.setBounds(249, 196, 100, 25);
        txtDni.setEditable(false);
        add(txtDni);
 
        JLabel lblNombre = new JLabel("Nombre:");
        lblNombre.setBounds(21, 177, 50, 25);
        add(lblNombre);
 
        JLabel lblApellido = new JLabel("Apellido:");
        lblApellido.setBounds(139, 177, 50, 25);
        add(lblApellido);
 
        JLabel lblDni = new JLabel("DNI:");
        lblDni.setBounds(252, 177, 50, 25);
        add(lblDni);
 
        btnModificar = new JButton("Modificar");
        btnModificar.setBounds(361, 193, 100, 30);
        add(btnModificar);
 
 
        btnModificar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Persona personaSeleccionada = listaPersonas.getSelectedValue();
                if (personaSeleccionada != null) {
                    personaSeleccionada.setNombre(txtNombre.getText());
                    personaSeleccionada.setApellido(txtApellido.getText());
 
                    boolean actualizado = personaNegocio.Update(personaSeleccionada);
                    if (actualizado) {
                        JOptionPane.showMessageDialog(null, "Persona modificada correctamente.");
                        cargarListaPersonas();
                        limpiarCampos();
                    } else {
                        JOptionPane.showMessageDialog(null, "Error al modificar la persona.");
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
 
    private void limpiarCampos() {
        txtNombre.setText("");
        txtApellido.setText("");
        txtDni.setText("");
    }
}