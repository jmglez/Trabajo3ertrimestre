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

public class SelecciondeEjercitos extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SelecciondeEjercitos frame = new SelecciondeEjercitos();
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
	public SelecciondeEjercitos() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
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
			}
		});
		btnEjercito.setIcon(new ImageIcon("C:\\Users\\josem\\OneDrive\\Desktop\\ejercito Azul.jpg"));
		btnEjercito.setBounds(47, 51, 139, 66);
		contentPane.add(btnEjercito);
		
	
		
		JButton btnNewButton_1 = new JButton("Cancelar");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton_1.setBounds(174, 183, 97, 25);
		contentPane.add(btnNewButton_1);
		
		JTextPane txtpnEjercito = new JTextPane();
		txtpnEjercito.setFont(new Font("Tahoma", Font.PLAIN, 16));
		txtpnEjercito.setText("Ejercito 1");
		txtpnEjercito.setBounds(76, 16, 81, 22);
		contentPane.add(txtpnEjercito);
		
		JTextPane txtpnEjercito_1 = new JTextPane();
		txtpnEjercito_1.setFont(new Font("Tahoma", Font.PLAIN, 16));
		txtpnEjercito_1.setText("Ejercito 2");
		txtpnEjercito_1.setBounds(308, 16, 73, 22);
		contentPane.add(txtpnEjercito_1);
		
		JButton btnNewButton = new JButton("Ejercito Rojo");
		btnNewButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				InterfazEjercitoRojo interfazejercitorojo = new InterfazEjercitoRojo();
				interfazejercitorojo.setVisible(true);
			}
		});
		btnNewButton.setIcon(new ImageIcon("C:\\Users\\josem\\OneDrive\\Desktop\\Ejercito Rojo.jpg"));
		btnNewButton.setBounds(265, 51, 139, 66);
		contentPane.add(btnNewButton);
		
		JLabel lblNewLabel = new JLabel("Gana el ejercito azul");
		lblNewLabel.setForeground(Color.BLUE);
		lblNewLabel.setBackground(Color.BLACK);
		lblNewLabel.setBounds(37, 149, 120, 16);
		contentPane.add(lblNewLabel);
		lblNewLabel.setVisible(false);
		
		JLabel lblNewLabel_1 = new JLabel("Gana el ejercito rojo");
		lblNewLabel_1.setForeground(Color.RED);
		lblNewLabel_1.setBounds(293, 149, 135, 16);
		contentPane.add(lblNewLabel_1);
		lblNewLabel_1.setVisible(false);
		
		JButton btnComparar = new JButton("Comparar");
		btnComparar.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				Comparar comparar = new Comparar();
				boolean resultado = Comparar.comparacion(Ejercitoazul, Ejercitorojo);
				if(resultado == true) {
					lblNewLabel.setVisible(true);
				}else {
					lblNewLabel_1.setVisible(true);
				}
				
			}
		});
		btnComparar.setBounds(174, 145, 97, 25);
		contentPane.add(btnComparar);
	}
}
