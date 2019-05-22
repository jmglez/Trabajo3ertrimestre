package Trabajo;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class InterfazInfoArquero extends JFrame {//este frame se usa para proporcionar datos sobre la unidadad predeterminadas

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					InterfazInfoArquero frame = new InterfazInfoArquero();
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
	public InterfazInfoArquero() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 707, 631);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblArquero = new JLabel("Arquero");
		lblArquero.setFont(new Font("Tahoma", Font.PLAIN, 21));
		lblArquero.setBounds(276, 13, 87, 16);
		contentPane.add(lblArquero);
		
		JLabel lblDescripcion = new JLabel("Descripcion:");
		lblDescripcion.setBounds(90, 466, 71, 16);
		contentPane.add(lblDescripcion);
		
		JLabel lblPoder = new JLabel("Poder:");
		lblPoder.setBounds(123, 504, 38, 16);
		contentPane.add(lblPoder);
		
		JLabel lblNunidades = new JLabel("N\u00BAUnidades:");
		lblNunidades.setBounds(84, 533, 77, 16);
		contentPane.add(lblNunidades);
		
		JLabel lblUnidadEquipadaCon = new JLabel("Unidad equipada con un arco usada como unidad de ataque a distancia regular");
		lblUnidadEquipadaCon.setBounds(173, 466, 452, 16);
		contentPane.add(lblUnidadEquipadaCon);
		
		Datos datopoder = new Datos();
		int poder= datopoder.getPoderArquero();
		JLabel lblNewLabel = new JLabel(poder+"");
		lblNewLabel.setBounds(173, 504, 56, 16);
		contentPane.add(lblNewLabel);
		
		Datos datonumero = new Datos();
		int numero= datonumero.getNunidadesArquero();
		JLabel label = new JLabel(numero+"");
		label.setBounds(173, 533, 56, 16);
		contentPane.add(label);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setIcon(new ImageIcon("C:\\Users\\josem\\OneDrive\\Desktop\\Bretonnia_Peasant_Bowmen_(Art).jpg"));
		lblNewLabel_1.setBounds(123, 77, 446, 285);
		contentPane.add(lblNewLabel_1);
		
		JButton btnAtras = new JButton("Atras");
		btnAtras.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				dispose();
			}
		});
		btnAtras.setBounds(22, 24, 97, 25);
		contentPane.add(btnAtras);
	}
}
