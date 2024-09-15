package appEscritorio;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.Font;


public class Ventana extends JFrame{

	private static final long serialVersionUID = 1L; 
	
	private JButton botonEjercicio1 = new JButton();
	private JButton botonEjercicio2 = new JButton();
	private JButton botonEjercicio3 = new JButton();

	public Ventana(){
		 setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		 setBounds(350,350,500,400);
		 setTitle(" ");
		 getContentPane().setLayout(null);
		 
		 botonEjercicio1.setText("Ejercicio1");
		 botonEjercicio1.setBounds(164, 113,  128,33);
		 getContentPane().add(botonEjercicio1);
		 
		 botonEjercicio2.setText("Ejercicio2");
		 botonEjercicio2.setBounds(164, 169,  128,33);
		 getContentPane().add(botonEjercicio2);
		 
		 botonEjercicio3.setText("Ejercicio3");
		 botonEjercicio3.setBounds(164, 224, 128, 33);
		 getContentPane().add(botonEjercicio3);
		 
		 JLabel lblGrupo = new JLabel("GRUPO NRO: 11");
		 lblGrupo.setFont(new Font("Tahoma", Font.BOLD, 16));
		 lblGrupo.setBounds(53, 44, 138, 24);
		 getContentPane().add(lblGrupo);
		 
		 
	}
	public void cambiarVisibilidad(boolean estado) {
		if (estado == true) {  
		 setVisible(true);
		} else {  setVisible(false);}
			;
	}	
}	