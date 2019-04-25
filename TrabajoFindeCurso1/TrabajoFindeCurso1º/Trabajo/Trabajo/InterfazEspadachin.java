package Trabajo;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class InterfazEspadachin extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					InterfazEspadachin frame = new InterfazEspadachin();
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
	public InterfazEspadachin() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 762, 694);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblEspadero = new JLabel("Espadero");
		lblEspadero.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblEspadero.setBounds(332, 24, 97, 16);
		contentPane.add(lblEspadero);
		
		JLabel lblDescripcion = new JLabel("Descripcion:");
		lblDescripcion.setBounds(226, 536, 82, 16);
		contentPane.add(lblDescripcion);
		
		JLabel lblPoder = new JLabel("Poder:");
		lblPoder.setBounds(226, 565, 56, 16);
		contentPane.add(lblPoder);
		
		JLabel lblNDeUnidades = new JLabel("N\u00BA de unidades:");
		lblNDeUnidades.setBounds(226, 594, 97, 16);
		contentPane.add(lblNDeUnidades);
		
		JLabel lblUnidadEquipadaCon = new JLabel("Unidad equipada con espada de gran versatilidad");
		lblUnidadEquipadaCon.setBounds(322, 523, 305, 42);
		contentPane.add(lblUnidadEquipadaCon);
		
		JLabel lblNewLabel = new JLabel("350");
		lblNewLabel.setBounds(332, 565, 56, 16);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("120");
		lblNewLabel_1.setBounds(342, 594, 56, 16);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setIcon(new ImageIcon("C:\\Users\\josem\\OneDrive\\Desktop\\Grandes_Espaderos_info.jpg"));
		lblNewLabel_2.setBounds(264, 74, 273, 396);
		contentPane.add(lblNewLabel_2);
		
		JButton btnAtras = new JButton("Atras");
		btnAtras.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				dispose();
			}
		});
		btnAtras.setBounds(26, 36, 97, 25);
		contentPane.add(btnAtras);
	}
}
