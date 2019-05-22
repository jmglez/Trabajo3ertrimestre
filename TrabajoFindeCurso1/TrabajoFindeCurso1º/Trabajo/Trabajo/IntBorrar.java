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

public class IntBorrar extends JFrame {//esta interfaz es usada para borrar las unidades deseadas

	private JPanel contentPane;
	private JTextField nombretxt;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					IntBorrar frame = new IntBorrar();
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
	public IntBorrar() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblBorrarUnidades = new JLabel("Borrar unidades");
		lblBorrarUnidades.setBounds(161, 37, 114, 16);
		contentPane.add(lblBorrarUnidades);
		
		JLabel lblNombreDeLa = new JLabel("Nombre");
		lblNombreDeLa.setBounds(61, 111, 78, 16);
		contentPane.add(lblNombreDeLa);
		
		nombretxt = new JTextField();
		nombretxt.setBounds(159, 108, 116, 22);
		contentPane.add(nombretxt);
		nombretxt.setColumns(10);
		
		JButton btnBorrar = new JButton("Borrar"); //este boton ejecuta la funcion borrar
		btnBorrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				borrar(nombretxt.getText());
				setVisible(false);
			}
		});
		btnBorrar.setBounds(74, 197, 97, 25);
		contentPane.add(btnBorrar);
		
		JButton btnAtras = new JButton("atras");//este boton se usa para cerrar la pestaña
		btnAtras.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {		
				setVisible(false);
			}
		});
		btnAtras.setBounds(227, 197, 97, 25);
		contentPane.add(btnAtras);
	}

	
	public void borrar(String nombre ) {//esta funcion se usa para borrar escribiendo los datos necesarios
		Conexion.Conectar();

		
		 Conexion.EjecutarUpdate("DELETE FROM UNIDADES WHERE Nombre_unidad = \""+ nombre + "\";");
		
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
