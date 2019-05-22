package Trabajo;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextArea;
import javax.swing.JTextPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.HeadlessException;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JPasswordField;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.awt.Color;
import javax.swing.JLayeredPane;

public class InterfazJuego extends JFrame {//este es la interfaz del loguin , actualmente en desuso

	private JPanel contentPane;
	static JTextField Intusuario;
	static JPasswordField Intcontaseña;

	/**
	 * Launch the application.
	 */


	/**
	 * Create the frame.
	 */
	public InterfazJuego() {
		getContentPane().setLayout(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(700,300,500,300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		contentPane.setLayout(null);
		
		Intusuario = new JTextField();
		Intusuario.setBounds(177, 55, 150, 22);
		contentPane.add(Intusuario);
		Intusuario.setColumns(10);
		
		
	/*	btnLoguear.addActionListener(new ActionListener() {
			
			 public void actionPerformed(ActionEvent arg0) {
				Metodosloguin metodoslogin = new Metodosloguin();

				if(metodoslogin.validar_ingreso()==1){
				                 
				        this.dispose();
				       /* SelecciondeEjercitos selecciondeejercitos = new SelecciondeEjercitos();
				        selecciondeejercitos.setVisible(true);

				        JOptionPane.showMessageDialog(null, "Bienvenido\n Has ingresado "
				        + "satisfactoriamente al sistema", "Mensaje de bienvenida",
				        JOptionPane.INFORMATION_MESSAGE);

				        SelecciondeEjercitos formformulario1 = new SelecciondeEjercitos();          
				        formformulario1.setVisible(true);

				}else {
				                    
				        JOptionPane.showMessageDialog(null, "Acceso denegado:\n"
				        + "Por favor ingrese un usuario y/o contraseña correctos", "Acceso denegado",
				        JOptionPane.ERROR_MESSAGE);
				            
				}
			}

			private void dispose() {
				// TODO Auto-generated method stub
				
			}
		});*/
		JButton btnLoguear = new JButton("Login");
		btnLoguear.setFont(new Font("Tahoma", Font.PLAIN, 18));

			
		
		btnLoguear.setBounds(112, 179, 116, 39);
		contentPane.add(btnLoguear);
		
		JLabel lblUsuario = new JLabel("Usuario");
		lblUsuario.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblUsuario.setBounds(71, 46, 83, 39);
		contentPane.add(lblUsuario);
		
		JLabel lblContrasea = new JLabel("Contrase\u00F1a");
		lblContrasea.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblContrasea.setBounds(53, 114, 101, 20);
		contentPane.add(lblContrasea);
		
		JButton btnRegistrarse = new JButton("Registrarse");
		btnRegistrarse.setFont(new Font("Tahoma", Font.PLAIN, 21));
		btnRegistrarse.setBounds(280, 179, 156, 39);
		contentPane.add(btnRegistrarse);
		
		JLabel lblAccesoNoPermitido = new JLabel("Acceso no permitido");
		lblAccesoNoPermitido.setVisible(false);
		lblAccesoNoPermitido.setForeground(Color.RED);
		lblAccesoNoPermitido.setBounds(169, 151, 158, 16);
		contentPane.add(lblAccesoNoPermitido);
		
		Intcontaseña = new JPasswordField();
		Intcontaseña.setBounds(177, 116, 150, 22);
		contentPane.add(Intcontaseña);
		
		btnLoguear.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {//esto era usado para comparar el usuario y contraseña introducidos con la base de datos
				Login login = new Login();
				String usuario = Intusuario.getText();
				String clave = String.valueOf(Intcontaseña.getPassword());
				boolean iniciosesion =login.comprobar(usuario, clave);
				if(iniciosesion==true) {
					SelecciondeEjercitos accesopermitido = new SelecciondeEjercitos();
					accesopermitido.setVisible(true);
				}else {
					lblAccesoNoPermitido.setVisible(true);
				}
				/*SelecciondeEjercitos accesopermitido = new SelecciondeEjercitos();
			if(comprobar(Intusuario.getText(),textField.getText())) {
				System.out.println("ya");
				
				accesopermitido.setVisible(true);
			}else {
				accesopermitido.setVisible(false);
			}*/
				
			}
				
		});
	}

	public JPanel getContentPane() {
		return contentPane;
	}

	public void setContentPane(JPanel contentPane) {
		this.contentPane = contentPane;
	}

	public static JTextField getIntusuario() {
		return Intusuario;
	}

	public static void setIntusuario(JTextField intusuario) {
		Intusuario = intusuario;
	}

	public JPasswordField getPasswordField() {
		return Intcontaseña;
	}

	public void setPasswordField(JPasswordField passwordField) {
		this.Intcontaseña = passwordField;
	}

	public InterfazJuego(JPanel contentPane, JPasswordField passwordField) throws HeadlessException {
		super();
		this.contentPane = contentPane;
		this.Intcontaseña = passwordField;
	}
}
