package Trabajo;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.JMenu;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class InterfazEjercitoAzul extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					InterfazEjercitoAzul frame = new InterfazEjercitoAzul();
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
	public InterfazEjercitoAzul() {
		setTitle("TONTO QUIEM LO LEA");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 616, 523);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnNewButton_1 = new JButton("");
		btnNewButton_1.setIcon(new ImageIcon("C:\\Users\\josem\\OneDrive\\Desktop\\Espadachin.jpg"));
		btnNewButton_1.setBounds(105, 106, 97, 93);
		contentPane.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("");
		btnNewButton_2.setIcon(new ImageIcon("C:\\Users\\josem\\OneDrive\\Desktop\\arquero.jpg"));
		btnNewButton_2.setBounds(105, 228, 97, 85);
		contentPane.add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("");
		btnNewButton_3.setIcon(new ImageIcon("C:\\Users\\josem\\OneDrive\\Desktop\\Hondero.jpg"));
		btnNewButton_3.setBounds(105, 338, 97, 83);
		contentPane.add(btnNewButton_3);
		
		JButton btnNewButton_4 = new JButton("");
		btnNewButton_4.setIcon(new ImageIcon("C:\\Users\\josem\\OneDrive\\Desktop\\Lancero.jpg"));
		btnNewButton_4.setBounds(398, 106, 97, 93);
		contentPane.add(btnNewButton_4);
		
		JButton btnNewButton_5 = new JButton("");
		btnNewButton_5.setIcon(new ImageIcon("C:\\Users\\josem\\OneDrive\\Desktop\\Piquero.jpg"));
		btnNewButton_5.setBounds(398, 228, 97, 85);
		contentPane.add(btnNewButton_5);
		
		JButton btnNewButton_6 = new JButton("");
		btnNewButton_6.setIcon(new ImageIcon("C:\\Users\\josem\\OneDrive\\Desktop\\Caballeria.jpg"));
		btnNewButton_6.setBounds(398, 338, 102, 83);
		contentPane.add(btnNewButton_6);
		
		JButton btnGuardar = new JButton("Guardar");
		btnGuardar.setBounds(92, 438, 97, 25);
		contentPane.add(btnGuardar);
		
		JButton btnCancelar = new JButton("Cancelar");
		btnCancelar.setBounds(246, 438, 97, 25);
		contentPane.add(btnCancelar);
		
		JButton btnSalir = new JButton("Atras");
		btnSalir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				dispose();
			}
		});
		btnSalir.setBounds(398, 438, 97, 25);
		contentPane.add(btnSalir);
		
		JLabel lblEjercitoAzul = new JLabel("Ejercito Azul");
		lblEjercitoAzul.setBounds(260, 13, 83, 16);
		contentPane.add(lblEjercitoAzul);
		
		JLabel lblEspadachin = new JLabel("Espadachin");
		lblEspadachin.setBounds(12, 115, 68, 16);
		contentPane.add(lblEspadachin);
		
		JLabel lblArquero = new JLabel("Arquero");
		lblArquero.setBounds(24, 246, 56, 16);
		contentPane.add(lblArquero);
		
		JLabel lblHondero = new JLabel("Hondero");
		lblHondero.setBounds(24, 358, 56, 16);
		contentPane.add(lblHondero);
		
		JLabel lblLancero = new JLabel("Lancero");
		lblLancero.setBounds(307, 115, 56, 16);
		contentPane.add(lblLancero);
		
		JLabel lblPiquero = new JLabel("Piquero");
		lblPiquero.setBounds(307, 246, 56, 16);
		contentPane.add(lblPiquero);
		
		JLabel lblCaballero = new JLabel("Caballero");
		lblCaballero.setBounds(307, 358, 56, 16);
		contentPane.add(lblCaballero);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\josem\\OneDrive\\Desktop\\ejercito Azul.jpg"));
		lblNewLabel.setBounds(270, 42, 37, 42);
		contentPane.add(lblNewLabel);
		
		JButton btnInfo = new JButton("info");
		btnInfo.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				InterfazEspadachin interfazespadachin = new InterfazEspadachin();
				interfazespadachin.setVisible(true);
			}
		});
		btnInfo.setBounds(0, 148, 97, 25);
		contentPane.add(btnInfo);
		
		JButton button = new JButton("info");
		button.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				InterfazInfoArquero interfazInfoArquero = new InterfazInfoArquero();
				interfazInfoArquero.setVisible(true);
			}
		});
		button.setBounds(0, 275, 97, 25);
		contentPane.add(button);
		
		JButton button_1 = new JButton("info");
		button_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				InterfazinfoHondero interfazinfohondero = new InterfazinfoHondero();
				interfazinfohondero.setVisible(true);
			}
		});
		button_1.setBounds(0, 387, 97, 25);
		contentPane.add(button_1);
		
		JButton button_2 = new JButton("info");
		button_2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				InterfazLanceroInfo interfazinfolancero = new InterfazLanceroInfo();
				 interfazinfolancero.setVisible(true);
			}
		});
		button_2.setBounds(289, 148, 97, 25);
		contentPane.add(button_2);
		
		JButton button_3 = new JButton("info");
		button_3.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				InterfazPiqueroInfo interfazpiqueroinfo = new InterfazPiqueroInfo();
				interfazpiqueroinfo.setVisible(true);
			}
		});
		button_3.setBounds(289, 275, 97, 25);
		contentPane.add(button_3);
		
		JButton button_4 = new JButton("info");
		button_4.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				InterfazCaballeroInfo interfazcaballeroinfo = new InterfazCaballeroInfo();
				interfazcaballeroinfo.setVisible(true);
			}
		});
		button_4.setBounds(289, 387, 97, 25);
		contentPane.add(button_4);
		
		textField = new JTextField();
		textField.setBounds(214, 149, 56, 22);
		contentPane.add(textField);
		textField.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(214, 276, 56, 22);
		contentPane.add(textField_2);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(214, 370, 56, 22);
		contentPane.add(textField_3);
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		textField_4.setBounds(507, 275, 56, 22);
		contentPane.add(textField_4);
		
		textField_5 = new JTextField();
		textField_5.setColumns(10);
		textField_5.setBounds(509, 370, 56, 22);
		contentPane.add(textField_5);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(507, 149, 56, 22);
		contentPane.add(textField_1);
	}
}
