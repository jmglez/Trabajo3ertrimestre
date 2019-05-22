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

public class InterfazCaballeroInfo extends JFrame {//este frame se usa para proporcionar datos sobre la unidadad predeterminadas

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					InterfazCaballeroInfo frame = new InterfazCaballeroInfo();
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
	public InterfazCaballeroInfo() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 925, 736);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Caballeria");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 22));
		lblNewLabel.setBounds(380, 33, 96, 20);
		contentPane.add(lblNewLabel);
		
		JLabel label = new JLabel("");
		label.setIcon(new ImageIcon("C:\\Users\\josem\\OneDrive\\Desktop\\CaballeriaInfo.jpg"));
		label.setBounds(160, 101, 583, 323);
		contentPane.add(label);
		
		JLabel lblDescripcion = new JLabel("Descripcion: ");
		lblDescripcion.setBounds(128, 473, 74, 16);
		contentPane.add(lblDescripcion);
		
		JLabel lblPoder = new JLabel("Poder: ");
		lblPoder.setBounds(128, 526, 56, 16);
		contentPane.add(lblPoder);
		
		JLabel lblNUnidades = new JLabel("N\u00BA Unidades: ");
		lblNUnidades.setBounds(128, 587, 79, 16);
		contentPane.add(lblNUnidades);
		
		JLabel lblCosto = new JLabel("Costo: ");
		lblCosto.setBounds(128, 642, 56, 16);
		contentPane.add(lblCosto);
		
		JLabel lblUnidadDeEspadachines = new JLabel("Unidad de espadachines montados a caballo , esta unidad es la mas versatil y efectiva y por talto la mas cara");
		lblUnidadDeEspadachines.setBounds(235, 473, 641, 16);
		contentPane.add(lblUnidadDeEspadachines);
		
		Datos datopoder = new Datos();
		int poder= datopoder.getPoderCaballero();
		JLabel label_1 = new JLabel(poder+"");
		label_1.setBounds(235, 526, 56, 16);
		contentPane.add(label_1);
		
		Datos datonumero = new Datos();
		int numero= datonumero.getNunidadesCaballero();
		JLabel label_2 = new JLabel(numero+"");
		label_2.setBounds(235, 587, 56, 16);
		contentPane.add(label_2);
		
		JLabel label_3 = new JLabel("no implementado");
		label_3.setBounds(235, 631, 56, 16);
		contentPane.add(label_3);
		
		JButton btnAtras = new JButton("Atras");
		btnAtras.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				dispose();
			}
		});
		btnAtras.setBounds(12, 33, 97, 25);
		contentPane.add(btnAtras);
	}
}
