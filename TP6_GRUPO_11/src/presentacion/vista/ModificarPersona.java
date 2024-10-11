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
        listaPersonas = new JList<>(modeloLista);
        JScrollPane scrollPane = new JScrollPane(listaPersonas);
        scrollPane.setBounds(50, 50, 200, 150);
        add(scrollPane);
 
        txtNombre = new JTextField();
        txtNombre.setBounds(300, 50, 150, 25);
        add(txtNombre);
 
        txtApellido = new JTextField();
        txtApellido.setBounds(300, 100, 150, 25);
        add(txtApellido);
 
        txtDni = new JTextField();
        txtDni.setBounds(300, 150, 150, 25);
        txtDni.setEditable(false);
        add(txtDni);
 
        JLabel lblNombre = new JLabel("Nombre:");
        lblNombre.setBounds(250, 50, 50, 25);
        add(lblNombre);
 
        JLabel lblApellido = new JLabel("Apellido:");
        lblApellido.setBounds(250, 100, 50, 25);
        add(lblApellido);
 
        JLabel lblDni = new JLabel("DNI:");
        lblDni.setBounds(250, 150, 50, 25);
        add(lblDni);
 
        btnModificar = new JButton("Modificar");
        btnModificar.setBounds(350, 200, 100, 30);
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
                        limpiarCampos();
                    } else {
                        JOptionPane.showMessageDialog(null, "Error al modificar la persona.");
                    }
                }
            }
        });
 
 
        listaPersonas.addListSelectionListener(e -> {
            Persona personaSeleccionada = listaPersonas.getSelectedValue();
            if (personaSeleccionada != null) {
                txtNombre.setText(personaSeleccionada.getNombre());
                txtApellido.setText(personaSeleccionada.getApellido());
                txtDni.setText(String.valueOf(personaSeleccionada.getDni()));
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
 
    private void limpiarCampos() {
        txtNombre.setText("");
        txtApellido.setText("");
        txtDni.setText("");
    }
}