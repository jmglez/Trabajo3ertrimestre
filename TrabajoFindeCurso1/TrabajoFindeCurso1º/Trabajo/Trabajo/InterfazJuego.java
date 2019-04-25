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

public class InterfazJuego extends JFrame {

	private JPanel contentPane;
	static JTextField Intusuario;
	static JPasswordField Intcontaseña;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					InterfazJuego frame = new InterfazJuego();
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
	public InterfazJuego() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(700,300,500,300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		Intusuario = new JTextField();
		Intusuario.setBounds(177, 55, 150, 22);
		contentPane.add(Intusuario);
		Intusuario.setColumns(10);
		
		JButton btnLoguear = new JButton("Login");
		btnLoguear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Metodosloguin metodoslogin = new Metodosloguin();

				if(metodoslogin.validar_ingreso()==1){
				                 
				        this.dispose();
				       /* SelecciondeEjercitos selecciondeejercitos = new SelecciondeEjercitos();
				        selecciondeejercitos.setVisible(true);*/

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
		});
		btnLoguear.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				
			}
		});
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
		
		Intcontaseña = new JPasswordField();
		Intcontaseña.setBounds(177, 116, 150, 22);
		contentPane.add(Intcontaseña);
		
		JButton btnRegistrarse = new JButton("Registrarse");
		btnRegistrarse.setFont(new Font("Tahoma", Font.PLAIN, 21));
		btnRegistrarse.setBounds(280, 179, 156, 39);
		contentPane.add(btnRegistrarse);
		
		
	}


	public InterfazJuego(JTextField intusuario, JPasswordField intcontaseña) throws HeadlessException {
		super();
		Intusuario = intusuario;
		Intcontaseña = intcontaseña;
	}

	public JTextField getIntusuario() {
		return Intusuario;
	}

	public void setIntusuario(JTextField intusuario) {
		Intusuario = intusuario;
	}

	public JPasswordField getIntcontaseña() {
		return Intcontaseña;
	}

	public void setIntcontaseña(JPasswordField intcontaseña) {
		Intcontaseña = intcontaseña;
	}

	@Override
	public String toString() {
		return "InterfazJuego [Intusuario=" + Intusuario + ", Intcontaseña=" + Intcontaseña + "]";
	}
}
