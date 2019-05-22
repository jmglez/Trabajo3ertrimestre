package Trabajo;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.event.MouseEvent;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import java.awt.event.MouseAdapter;

public class Interfazloguin extends JFrame {//interfaz usada para el login de prueba

	private JPanel contentPane;
	private JTextField campousuario;
	private JPasswordField Intcontasena;

	public JPanel getContentPane() {
		return contentPane;
	}

	public void setContentPane(JPanel contentPane) {
		this.contentPane = contentPane;
	}

	public JTextField getCampousuario() {
		return campousuario;
	}

	public void setCampousuario(JTextField campousuario) {
		this.campousuario = campousuario;
	}

	public JPasswordField getIntcontasena() {
		return Intcontasena;
	}

	public void setIntcontasena(JPasswordField intcontasena) {
		Intcontasena = intcontasena;
	}


	/**
	 * Create the frame.
	 */
	public Interfazloguin() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 496, 382);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblLogin = new JLabel("Login");
		lblLogin.setBounds(188, 39, 56, 16);
		contentPane.add(lblLogin);
		
		JLabel Intusuario = new JLabel("usuario");
		Intusuario.setBounds(67, 107, 56, 16);
		contentPane.add(Intusuario);
		
		JLabel Intcontaseña = new JLabel("contrase\u00F1a");
		Intcontaseña.setBounds(67, 163, 70, 16);
		contentPane.add(Intcontaseña);
		
		campousuario = new JTextField();
		campousuario.setBounds(188, 104, 116, 22);
		contentPane.add(campousuario);
		campousuario.setColumns(10);
		
		Intcontasena = new JPasswordField();
		Intcontasena.setBounds(185, 160, 119, 22);
		contentPane.add(Intcontasena);
		
		JButton btnLogin = new JButton("login");
		
		btnLogin.setBounds(86, 264, 97, 25);
		contentPane.add(btnLogin);
		
		JButton btnRegister = new JButton("register");
		btnRegister.setBounds(269, 264, 97, 25);
		contentPane.add(btnRegister);
		
		JLabel lblAccesoNoPermitido = new JLabel("Acceso no permitido");
		lblAccesoNoPermitido.setBounds(158, 203, 141, 16);
		contentPane.add(lblAccesoNoPermitido);
		
		btnLogin.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {//prueba de comparacion del usuario y la contraseña con la base de datos
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
			}
		});
		
			
		
		
	}



	
	
	
}
