package Trabajo;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Inteditar extends JFrame {//este frame sirve para editar los poderes de las unidades

	private JPanel contentPane;
	private JTextField podertxt;
	private JTextField nombretxt;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Inteditar frame = new Inteditar();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Inteditar() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 462, 386);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblEditar = new JLabel("Editar");
		lblEditar.setBounds(169, 40, 56, 16);
		contentPane.add(lblEditar);
		
		JLabel lblPoderNuevo = new JLabel("poder nuevo");
		lblPoderNuevo.setBounds(36, 119, 82, 16);
		contentPane.add(lblPoderNuevo);
		
		podertxt = new JTextField();
		podertxt.setBounds(146, 116, 116, 22);
		contentPane.add(podertxt);
		podertxt.setColumns(10);
		
		JButton btnEditar = new JButton("Editar");//esta clase acciona la funcion de editar las unidades
		btnEditar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				editar(podertxt.getText(),nombretxt.getText());
				setVisible(false);
				
			}
		});
		btnEditar.setBounds(74, 257, 97, 25);
		contentPane.add(btnEditar);
		
		JLabel lblNombre = new JLabel("nombre");
		lblNombre.setBounds(36, 178, 56, 16);
		contentPane.add(lblNombre);
		
		nombretxt = new JTextField();
		nombretxt.setBounds(146, 175, 116, 22);
		contentPane.add(nombretxt);
		nombretxt.setColumns(10);
		
		JButton btnAtras = new JButton("atras");
		btnAtras.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
			}
		});
		btnAtras.setBounds(230, 257, 97, 25);
		contentPane.add(btnAtras);
	}
	public void editar(String poder,String nombre ) {//esta clase usa el nombre que le demos para editar el poder de la unidad seleccionada
		Conexion.Conectar();

		
		 Conexion.EjecutarUpdate("Update unidades SET Poder = " + poder + " where Nombre_unidad = \""+ nombre + "\";");
		
	
		
	}

}
