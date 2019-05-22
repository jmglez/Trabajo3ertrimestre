package Trabajo;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class InterfazinfoHondero extends JFrame {//este frame se usa para proporcionar datos sobre la unidadad predeterminadas

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					InterfazinfoHondero frame = new InterfazinfoHondero();
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
	public InterfazinfoHondero() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 739, 735);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\josem\\OneDrive\\Desktop\\honderoinfo.png"));
		lblNewLabel.setBounds(89, 44, 511, 344);
		contentPane.add(lblNewLabel);
		
		JLabel lblDescripcion = new JLabel("Descripcion:");
		lblDescripcion.setBounds(75, 443, 75, 16);
		contentPane.add(lblDescripcion);
		
		JLabel lblPoder = new JLabel("Poder:");
		lblPoder.setBounds(75, 490, 56, 16);
		contentPane.add(lblPoder);
		
		JLabel lblNunidades = new JLabel("N\u00BAUnidades:");
		lblNunidades.setBounds(75, 545, 75, 16);
		contentPane.add(lblNunidades);
		
		JLabel lblUnidadEquipadaCon = new JLabel("Unidad equipada con una honda , de mayor alcance que el arquero");
		lblUnidadEquipadaCon.setBounds(169, 443, 390, 16);
		contentPane.add(lblUnidadEquipadaCon);
		
		Datos datopoder = new Datos();
		int poder= datopoder.getPoderHondero();
		JLabel lblNewLabel_1 = new JLabel(poder+"");
		lblNewLabel_1.setBounds(174, 490, 56, 16);
		contentPane.add(lblNewLabel_1);
		
		Datos datonumero = new Datos();
		int numero= datonumero.getNunidadesHondero();
		JLabel label = new JLabel(numero+"");
		label.setBounds(169, 545, 56, 16);
		contentPane.add(label);
		
		JLabel lblCosto = new JLabel("Costo:");
		lblCosto.setBounds(75, 599, 56, 16);
		contentPane.add(lblCosto);
		
		JLabel label_1 = new JLabel("no definido");
		label_1.setBounds(169, 599, 56, 16);
		contentPane.add(label_1);
		
		JButton btnAtras = new JButton("Atras");
		btnAtras.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				dispose();
			}
		});
		btnAtras.setBounds(12, 13, 97, 25);
		contentPane.add(btnAtras);
	}

}
