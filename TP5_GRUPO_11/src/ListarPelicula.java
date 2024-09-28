import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.DefaultListModel;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JComboBox;
import java.awt.FlowLayout;
import javax.swing.JList;
public class ListarPelicula extends JPanel  {
	private JList list;
	private DefaultListModel <Pelicula> dlPeliculas;
	
	public ListarPelicula() {
		
		setLayout(null);
		
		list = new JList();
		list.setBounds(105, 57, 362, 261);
		dlPeliculas = new DefaultListModel<Pelicula>();
		list.setModel(dlPeliculas);
		add(list);
		
		JLabel lblPeliculas = new JLabel("Peliculas");
		lblPeliculas.setBounds(23, 165, 55, 28);
		add(lblPeliculas);
		
	}
	
	public void Listar(DefaultListModel<Pelicula> dlPel) {
	    this.dlPeliculas.clear(); 
	    this.dlPeliculas = dlPel;
	    list.setModel(dlPeliculas); 
	}
}
