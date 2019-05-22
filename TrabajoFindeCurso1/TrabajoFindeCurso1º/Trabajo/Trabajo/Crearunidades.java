package Trabajo;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.JButton;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Crearunidades extends JFrame {// esta es la interfaz que se usa para crear unidades nuevas

	private JPanel contentPane;
	private JTextField idtxt;
	private JTextField podertxt;
	private JTextField nunidadestxt;
	private JTextField nombretxt;
	private int id;
	private String nombre;
	private int poder;
	private int nunidades;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Crearunidades frame = new Crearunidades();
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
	public Crearunidades() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 559, 498);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblCreacionDeUnidades = new JLabel("Creacion de unidades");
		lblCreacionDeUnidades.setFont(new Font("Tahoma", Font.PLAIN, 22));
		lblCreacionDeUnidades.setBounds(158, 13, 242, 77);
		contentPane.add(lblCreacionDeUnidades);
		
		JButton btnCrear = new JButton("Crear");
		btnCrear.addActionListener(new ActionListener() {//boton que sirve para poner en funcionamiento la clase para crear unidades
			public void actionPerformed(ActionEvent arg0) {
				crear(idtxt.getText(),nombretxt.getText(),nunidadestxt.getText(),podertxt.getText());//con esta linea se activa la funcion para crear unidades
				setVisible(false);
			}
		});
		btnCrear.setBounds(124, 346, 97, 25);
		contentPane.add(btnCrear);
		
		JButton btnAtras = new JButton("atras");
		btnAtras.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) { //boton para cerrar pestaña
				setVisible(false);
			}
		});
		btnAtras.setBounds(303, 346, 97, 25);
		contentPane.add(btnAtras);
		
		idtxt = new JTextField();
		idtxt.setBounds(264, 115, 116, 22);
		contentPane.add(idtxt);
		idtxt.setColumns(10);
		
		podertxt = new JTextField();
		podertxt.setBounds(264, 212, 116, 22);
		contentPane.add(podertxt);
		podertxt.setColumns(10);
		
		nunidadestxt = new JTextField();
		nunidadestxt.setBounds(264, 259, 116, 22);
		contentPane.add(nunidadestxt);
		nunidadestxt.setColumns(10);
		
		JLabel lblId = new JLabel("id"); 
		lblId.setBounds(139, 118, 56, 16);
		contentPane.add(lblId);
		
		JLabel lblPoder = new JLabel("Poder");
		lblPoder.setBounds(139, 215, 56, 16);
		contentPane.add(lblPoder);
		
		JLabel lblNunidades = new JLabel("Nunidades");
		lblNunidades.setBounds(139, 262, 82, 16);
		contentPane.add(lblNunidades);
		
		JLabel lblNombreUnidad = new JLabel("Nombre Unidad");
		lblNombreUnidad.setBounds(124, 169, 97, 16);
		contentPane.add(lblNombreUnidad);
		
		nombretxt = new JTextField();
		nombretxt.setBounds(264, 166, 116, 22);
		contentPane.add(nombretxt);
		nombretxt.setColumns(10);

	}
	

	public void crear(String id , String nombre, String nunidades, String poder ) { //funcion que efectua un insert para añadir unidades nuevas
		Conexion.Conectar();

		
		 Conexion.EjecutarUpdate("INSERT INTO unidades VALUES("+ id + ",\""+ nombre + "\","+ nunidades+"," + poder+"); " );
		
		/*try {
	    	// getNombreEspadachin();
				while(Crear.next()){
					"DELETE FROM UNIDADES WHERE Nombre_unidad = \""+ nombre + "\";"
					"Update unidades set poder = " + poder + " where Nombre_unidad = \""+ nombre + "\"; "
				}
			}catch(SQLException e){
				e.printStackTrace();
			}*/
		
	}
}
	

