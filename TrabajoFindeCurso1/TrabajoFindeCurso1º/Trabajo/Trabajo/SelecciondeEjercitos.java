package Trabajo;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.FlowLayout;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextPane;
import java.awt.Font;
import javax.swing.ImageIcon;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JLabel;
import java.awt.Color;

public class SelecciondeEjercitos extends JFrame {//esta interfaz es el pilar del programa y la que conduce a las demas

	private JPanel contentPane;
	private JLabel lblNewLabel_2;
	private JLabel lblNewLabel_3;
	private int Poderejercitoazul;
	private int Poderejercitorojo;

	/**
	 * Launch the application.
	 */


	/**
	 * Create the frame.
	 */
	public SelecciondeEjercitos() {
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 478, 324);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnEjercito = new JButton("Ejercito Azul");
		btnEjercito.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
			}
		});
		btnEjercito.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				InterfazEjercitoAzul interfazejercitoazul = new InterfazEjercitoAzul();
				interfazejercitoazul.setVisible(true);
				disposeJFrame();
			}
		});
		btnEjercito.setIcon(new ImageIcon("C:\\Users\\josem\\OneDrive\\Desktop\\ejercito Azul.jpg"));
		btnEjercito.setBounds(12, 51, 163, 66);
		contentPane.add(btnEjercito);
		
	
		
		JButton btnNewButton_1 = new JButton("Cancelar");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
			}
		});
		btnNewButton_1.setBounds(174, 185, 97, 25);
		contentPane.add(btnNewButton_1);
		
		JButton btnNewButton = new JButton("Ejercito Rojo");
		btnNewButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				InterfazEjercitoRojo interfazejercitorojo = new InterfazEjercitoRojo();
				interfazejercitorojo.setVisible(true);
				//disposeJFrame();
			}
		});
		btnNewButton.setIcon(new ImageIcon("C:\\Users\\josem\\OneDrive\\Desktop\\Ejercito Rojo.jpg"));
		btnNewButton.setBounds(265, 51, 163, 66);
		contentPane.add(btnNewButton);
		
		JLabel lblNewLabel = new JLabel("Gana el ejercito azul");
		lblNewLabel.setForeground(Color.BLUE);
		lblNewLabel.setBackground(Color.BLACK);
		lblNewLabel.setBounds(42, 170, 120, 16);
		contentPane.add(lblNewLabel);
		lblNewLabel.setVisible(false);
		
		JLabel lblNewLabel_1 = new JLabel("Gana el ejercito rojo");
		lblNewLabel_1.setForeground(Color.RED);
		lblNewLabel_1.setBounds(293, 170, 135, 16);
		contentPane.add(lblNewLabel_1);
		lblNewLabel_1.setVisible(false);
		
		JButton btnComparar = new JButton("Comparar");
		btnComparar.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				
			
				Comparar comparar = new Comparar();//este boton se usa para comparar el poder de 2 ejercitos
				//Comparar.getcomparar;
				Poderejercitoazul=Integer.parseInt(getLblNewLabel_2().getText());
				 Poderejercitorojo=Integer.parseInt(getLblNewLabel_3().getText());
			//	boolean resultado = Comparar.comparacion(comparar.getEjercitoazul(),comparar.getEjercitorojo());
				if(Comparar.comparacion(Poderejercitoazul,Poderejercitorojo) == false) {
					lblNewLabel.setVisible(true);
				}else {
					lblNewLabel_1.setVisible(true);
				}
				
			}
		});
		btnComparar.setBounds(174, 145, 97, 25);
		contentPane.add(btnComparar);
		contadorpoderejercitoazul contadorazul = new contadorpoderejercitoazul();
		int poderazul= contadorazul.getSumapoderazul();//esto da fallos por una clase eliminada por error
		 lblNewLabel_2 = new JLabel("0");
		lblNewLabel_2.setBounds(73, 141, 56, 16);
		contentPane.add(lblNewLabel_2);
		//lblNewLabel_2.setText(Integer.toString(contadorpoderejercitoazul.getSumapoderazul()));
		
		lblNewLabel_3 = new JLabel("0");
		lblNewLabel_3.setBounds(327, 141, 56, 16);
		contentPane.add(lblNewLabel_3);
		
		JLabel lblEjercitoAzul = new JLabel("Ejercito Azul");
		lblEjercitoAzul.setBounds(73, 22, 78, 16);
		contentPane.add(lblEjercitoAzul);
		
		JLabel lblEjercitoRojo = new JLabel("Ejercito Rojo");
		lblEjercitoRojo.setBounds(315, 22, 78, 16);
		contentPane.add(lblEjercitoRojo);
		
		JButton crear = new JButton("Crear Und");
		crear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				Crearunidades crear = new Crearunidades();
				crear.setVisible(true);
				
			}
		});
		crear.setBounds(32, 226, 97, 25);
		contentPane.add(crear);
		
		JButton Borrar = new JButton("Borrar");
		Borrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				IntBorrar borrar = new IntBorrar();
				borrar.setVisible(true);
				
			}
		});
		Borrar.setBounds(174, 226, 97, 25);
		contentPane.add(Borrar);
		
		JButton Editar = new JButton("Editar");
		Editar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				Inteditar editar = new Inteditar();
				editar.setVisible(true);
				
			}
		});
		Editar.setBounds(327, 226, 97, 25);
		contentPane.add(Editar);
	}

	public JLabel getLblNewLabel_2() {
		return lblNewLabel_2;
	}

	public JLabel getLblNewLabel_3() {
		return lblNewLabel_3;
	}
	public void setTextLblNewLabel_2(String asdf) {
		System.out.println("****************");
		lblNewLabel_2.setText(asdf);
	} 
	
	public void setTextLblNewLabel_3(String asdfa) {
		System.out.println("****************");
		lblNewLabel_3.setText(asdfa);
	} 
	void disposeJFrame() {
		this.dispose();
	}
}
