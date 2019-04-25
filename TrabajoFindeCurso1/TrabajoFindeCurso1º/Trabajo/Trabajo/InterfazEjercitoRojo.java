package Trabajo;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class InterfazEjercitoRojo extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					InterfazEjercitoRojo frame = new InterfazEjercitoRojo();
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
	public InterfazEjercitoRojo() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 614, 523);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton button = new JButton("");
		button.setIcon(new ImageIcon("C:\\Users\\josem\\OneDrive\\Desktop\\Espadachin.jpg"));
		button.setBounds(114, 119, 98, 84);
		contentPane.add(button);
		
		JButton button_1 = new JButton("");
		button_1.setIcon(new ImageIcon("C:\\Users\\josem\\OneDrive\\Desktop\\arquero.jpg"));
		button_1.setBounds(114, 234, 98, 67);
		contentPane.add(button_1);
		
		JButton btnNewButton_1 = new JButton("");
		btnNewButton_1.setIcon(new ImageIcon("C:\\Users\\josem\\OneDrive\\Desktop\\Hondero.jpg"));
		btnNewButton_1.setBounds(115, 346, 97, 69);
		contentPane.add(btnNewButton_1);
		
		JButton button_2 = new JButton("");
		button_2.setIcon(new ImageIcon("C:\\Users\\josem\\OneDrive\\Desktop\\Lancero.jpg"));
		button_2.setBounds(402, 119, 97, 84);
		contentPane.add(button_2);
		
		JButton button_3 = new JButton("");
		button_3.setIcon(new ImageIcon("C:\\Users\\josem\\OneDrive\\Desktop\\Piquero.jpg"));
		button_3.setBounds(402, 233, 97, 78);
		contentPane.add(button_3);
		
		JButton button_4 = new JButton("");
		button_4.setIcon(new ImageIcon("C:\\Users\\josem\\OneDrive\\Desktop\\Caballeria.jpg"));
		button_4.setBounds(402, 346, 110, 69);
		contentPane.add(button_4);
		
		JLabel lblPiquero = new JLabel("Piquero");
		lblPiquero.setBounds(330, 245, 56, 16);
		contentPane.add(lblPiquero);
		
		JLabel lblCaballeria = new JLabel("Caballeria");
		lblCaballeria.setBounds(308, 346, 83, 16);
		contentPane.add(lblCaballeria);
		
		JLabel lblLancero = new JLabel("Lancero");
		lblLancero.setBounds(330, 131, 56, 16);
		contentPane.add(lblLancero);
		
		JLabel lblNewLabel = new JLabel("Espadachin");
		lblNewLabel.setBounds(25, 131, 69, 16);
		contentPane.add(lblNewLabel);
		
		JLabel lblArquero = new JLabel("Arquero");
		lblArquero.setBounds(25, 245, 56, 16);
		contentPane.add(lblArquero);
		
		JLabel lblHondero = new JLabel("Hondero");
		lblHondero.setBounds(25, 346, 56, 16);
		contentPane.add(lblHondero);
		
		JButton btnGuardar = new JButton("Guardar");
		btnGuardar.setBounds(93, 428, 97, 25);
		contentPane.add(btnGuardar);
		
		JButton btnCancelar = new JButton("Cancelar");
		btnCancelar.setBounds(235, 428, 97, 25);
		contentPane.add(btnCancelar);
		
		JButton btnAtras = new JButton("Atras");
		btnAtras.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				dispose();
			}
		});
		btnAtras.setBounds(412, 428, 97, 25);
		contentPane.add(btnAtras);
		
		JLabel lblEjercitoRojo = new JLabel("Ejercito Rojo");
		lblEjercitoRojo.setBounds(243, 19, 89, 16);
		contentPane.add(lblEjercitoRojo);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setIcon(new ImageIcon("C:\\Users\\josem\\OneDrive\\Desktop\\Ejercito Rojo.jpg"));
		lblNewLabel_1.setBounds(253, 55, 56, 38);
		contentPane.add(lblNewLabel_1);
		
		JButton button_5 = new JButton("info");
		button_5.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				InterfazEspadachin interfazespadachin = new InterfazEspadachin();
				interfazespadachin.setVisible(true);
			}
		});
		button_5.setBounds(12, 160, 97, 25);
		contentPane.add(button_5);
		
		JButton button_6 = new JButton("info");
		button_6.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				InterfazInfoArquero interfazInfoArquero = new InterfazInfoArquero();
				interfazInfoArquero.setVisible(true);
			}
		});
		button_6.setBounds(12, 274, 97, 25);
		contentPane.add(button_6);
		
		JButton button_7 = new JButton("info");
		button_7.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				InterfazinfoHondero interfazinfohondero = new InterfazinfoHondero();
				interfazinfohondero.setVisible(true);
			}
		});
		button_7.setBounds(12, 375, 97, 25);
		contentPane.add(button_7);
		
		JButton button_8 = new JButton("info");
		button_8.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				InterfazLanceroInfo interfazinfolancero = new InterfazLanceroInfo();
				 interfazinfolancero.setVisible(true);
			}
		});
		button_8.setBounds(293, 160, 97, 25);
		contentPane.add(button_8);
		
		JButton button_9 = new JButton("info");
		button_9.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				InterfazPiqueroInfo interfazpiqueroinfo = new InterfazPiqueroInfo();
				interfazpiqueroinfo.setVisible(true);
			}
		});
		button_9.setBounds(289, 274, 97, 25);
		contentPane.add(button_9);
		
		JButton button_10 = new JButton("info");
		button_10.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				InterfazCaballeroInfo interfazcaballeroinfo = new InterfazCaballeroInfo();
				interfazcaballeroinfo.setVisible(true);
			}
		});
		button_10.setBounds(289, 375, 97, 25);
		contentPane.add(button_10);
		
		textField = new JTextField();
		textField.setColumns(10);
		textField.setBounds(224, 161, 56, 22);
		contentPane.add(textField);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(224, 275, 56, 22);
		contentPane.add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(224, 376, 56, 22);
		contentPane.add(textField_2);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(511, 161, 56, 22);
		contentPane.add(textField_3);
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		textField_4.setBounds(528, 275, 56, 22);
		contentPane.add(textField_4);
		
		textField_5 = new JTextField();
		textField_5.setColumns(10);
		textField_5.setBounds(528, 376, 56, 22);
		contentPane.add(textField_5);
	}
}
