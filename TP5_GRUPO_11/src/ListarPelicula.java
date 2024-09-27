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
		list.setBounds(29, 35, 398, 242);
		dlPeliculas = new DefaultListModel<Pelicula>();
		list.setModel(dlPeliculas);
		add(list);
		
	}
	
	public void Listar(DefaultListModel<Pelicula> dlPel) {
	    this.dlPeliculas.clear(); 
	    this.dlPeliculas = dlPel;
	    list.setModel(dlPeliculas); 
	}
}
