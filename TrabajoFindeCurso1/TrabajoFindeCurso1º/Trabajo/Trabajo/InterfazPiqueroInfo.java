package Trabajo;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class InterfazPiqueroInfo extends JFrame {//este frame se usa para proporcionar datos sobre la unidadad predeterminadas

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					InterfazPiqueroInfo frame = new InterfazPiqueroInfo();
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
	public InterfazPiqueroInfo() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 699, 677);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblPiquero = new JLabel("Piquero");
		lblPiquero.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblPiquero.setBounds(293, 26, 80, 25);
		contentPane.add(lblPiquero);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\josem\\OneDrive\\Desktop\\PiqueroInfo.jpg"));
		lblNewLabel.setBounds(113, 94, 405, 263);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Descripcion:");
		lblNewLabel_1.setBounds(46, 420, 70, 16);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("poder:");
		lblNewLabel_2.setBounds(46, 463, 56, 16);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("N\u00BAunidades:");
		lblNewLabel_3.setBounds(46, 515, 70, 16);
		contentPane.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("Coste:");
		lblNewLabel_4.setBounds(46, 572, 56, 16);
		contentPane.add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("Unidad equipada con una pika, Esta unidad es puramente defensiva ");
		lblNewLabel_5.setBounds(176, 420, 390, 16);
		contentPane.add(lblNewLabel_5);
		
		Datos datopoder = new Datos();
		int poder= datopoder.getPoderPiquero();
		JLabel lblNewLabel_6 = new JLabel(poder+"");
		lblNewLabel_6.setBounds(176, 463, 56, 16);
		contentPane.add(lblNewLabel_6);
		
		Datos datonumero = new Datos();
		int numero= datonumero.getNunidadesPiquero();
		JLabel lblNewLabel_7 = new JLabel("100");
		lblNewLabel_7.setBounds(176, 515, 56, 16);
		contentPane.add(lblNewLabel_7);
		
		JLabel lblNewLabel_8 = new JLabel("no implementado");
		lblNewLabel_8.setBounds(176, 572, 56, 16);
		contentPane.add(lblNewLabel_8);
		
		JButton btnAtras = new JButton("Atras");
		btnAtras.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				dispose();
			}
		});
		btnAtras.setBounds(19, 29, 97, 25);
		contentPane.add(btnAtras);
	}

}
