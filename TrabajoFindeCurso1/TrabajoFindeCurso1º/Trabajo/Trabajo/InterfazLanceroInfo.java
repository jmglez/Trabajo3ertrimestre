package Trabajo;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class InterfazLanceroInfo extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					InterfazLanceroInfo frame = new InterfazLanceroInfo();
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
	public InterfazLanceroInfo() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 800, 744);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel label = new JLabel("");
		label.setIcon(new ImageIcon("C:\\Users\\josem\\OneDrive\\Desktop\\LanceroInfo.png"));
		label.setBounds(211, 55, 406, 314);
		contentPane.add(label);
		
		JLabel lblLancero = new JLabel("Lancero");
		lblLancero.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblLancero.setBounds(350, 23, 83, 16);
		contentPane.add(lblLancero);
		
		JLabel lblNewLabel = new JLabel("Descripcion:");
		lblNewLabel.setBounds(158, 430, 70, 16);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Poder:");
		lblNewLabel_1.setBounds(158, 493, 56, 16);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("N\u00BAunidades:");
		lblNewLabel_2.setBounds(158, 558, 70, 16);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Costo: ");
		lblNewLabel_3.setBounds(158, 622, 56, 16);
		contentPane.add(lblNewLabel_3);
		
		JLabel lblUnidadEquipadaCon = new JLabel("Unidad equipada con una lanza y un escudo, esta unidad es buena defendidendo ");
		lblUnidadEquipadaCon.setBounds(260, 430, 470, 16);
		contentPane.add(lblUnidadEquipadaCon);
		
		JLabel label_1 = new JLabel("330");
		label_1.setBounds(260, 493, 56, 16);
		contentPane.add(label_1);
		
		JLabel label_2 = new JLabel("120");
		label_2.setBounds(260, 558, 56, 16);
		contentPane.add(label_2);
		
		JLabel label_3 = new JLabel("200");
		label_3.setBounds(260, 622, 56, 16);
		contentPane.add(label_3);
		
		JButton btnAtras = new JButton("atras");
		btnAtras.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				dispose();
			}
		});
		btnAtras.setBounds(12, 22, 97, 25);
		contentPane.add(btnAtras);
	}
}
