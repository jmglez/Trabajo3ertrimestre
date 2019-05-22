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

public class InterfazEjercitoRojo extends JFrame {//interfaz ya explicada en la anterior

	private JPanel contentPane;
	int poderespadachin,poderarquero,poderhondero,poderlancero,poderpiquero,podercaballero,podertotalactualrojo;
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
	
	Ejercitorojo ejercitorojo = new Ejercitorojo(0,0,0,0,0,0);
	public InterfazEjercitoRojo() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 614, 523);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		SelecciondeEjercitos ejercitorojo2 = new SelecciondeEjercitos();
		ejercitorojo2.setVisible(true);
		
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
		
		JLabel label = new JLabel("0");
		label.setBounds(235, 164, 35, 16);
		contentPane.add(label);
		
		JLabel label_1 = new JLabel("0");
		label_1.setBounds(235, 263, 35, 16);
		contentPane.add(label_1);
		
		JLabel label_2 = new JLabel("0");
		label_2.setBounds(235, 379, 35, 16);
		contentPane.add(label_2);
		
		JLabel label_3 = new JLabel("0");
		label_3.setBounds(528, 164, 35, 16);
		contentPane.add(label_3);
		
		JLabel label_4 = new JLabel("0");
		label_4.setBounds(528, 263, 35, 16);
		contentPane.add(label_4);
		
		JLabel label_5 = new JLabel("0");
		label_5.setBounds(524, 379, 56, 16);
		contentPane.add(label_5);
		
		Datos dato2 = new Datos();
		button.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				ejercitorojo.setContadorespadachinrojo(ejercitorojo.getContadorespadachinrojo()+1);
				label.setText(Integer.toString(ejercitorojo.getContadorespadachinrojo()));
				
				poderespadachin=dato2.getPoderEspadachin();		
				 podertotalactualrojo= Integer.parseInt(ejercitorojo2.getLblNewLabel_3().getText());
				
				podertotalactualrojo +=poderespadachin;
				String poderespadachintxt = Integer.toString(podertotalactualrojo);
				ejercitorojo2.setTextLblNewLabel_3(podertotalactualrojo +"");;
				System.out.println(podertotalactualrojo);
	}
		});
		button_1.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				ejercitorojo.setContadorarquerorojo(ejercitorojo.getContadorarquerorojo()+1);
				label_1.setText(Integer.toString(ejercitorojo.getContadorarquerorojo()));
				
				 poderarquero=dato2.getPoderArquero();		
				 podertotalactualrojo= Integer.parseInt(ejercitorojo2.getLblNewLabel_3().getText());
				
				podertotalactualrojo +=poderarquero;
				String poderespadachintxt = Integer.toString(podertotalactualrojo);
				ejercitorojo2.setTextLblNewLabel_3(podertotalactualrojo +"");;
				System.out.println(podertotalactualrojo);
				
			}
		});
		btnNewButton_1.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				ejercitorojo.setContadorhonderorojo(ejercitorojo.getContadorhonderorojo()+1);
				label_2.setText(Integer.toString(ejercitorojo.getContadorhonderorojo()));
				
				 poderhondero=dato2.getPoderHondero();		
				 podertotalactualrojo= Integer.parseInt(ejercitorojo2.getLblNewLabel_3().getText());
				
				podertotalactualrojo +=poderhondero;
				String poderespadachintxt = Integer.toString(podertotalactualrojo);
				ejercitorojo2.setTextLblNewLabel_3(podertotalactualrojo +"");;
				System.out.println(podertotalactualrojo);
				
			}
		});
		button_2.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				ejercitorojo.setContadorlancerorojo(ejercitorojo.getContadorlancerorojo()+1);
				label_3.setText(Integer.toString(ejercitorojo.getContadorlancerorojo()));
				
				 poderlancero=dato2.getPoderLancero();		
				 podertotalactualrojo= Integer.parseInt(ejercitorojo2.getLblNewLabel_3().getText());
				
				podertotalactualrojo +=poderlancero;
				String poderespadachintxt = Integer.toString(podertotalactualrojo);
				ejercitorojo2.setTextLblNewLabel_3(podertotalactualrojo +"");;
				System.out.println(podertotalactualrojo);
				
			}
		});
		button_3.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				ejercitorojo.setContadorpiquerorojo(ejercitorojo.getContadorpiquerorojo()+1);
				label_4.setText(Integer.toString(ejercitorojo.getContadorpiquerorojo()));
				
				 poderpiquero=dato2.getPoderPiquero();		
				 podertotalactualrojo= Integer.parseInt(ejercitorojo2.getLblNewLabel_3().getText());
				
				podertotalactualrojo +=poderpiquero;
				String poderesrojotxt = Integer.toString(podertotalactualrojo);
				ejercitorojo2.setTextLblNewLabel_3(podertotalactualrojo +"");;
				System.out.println(podertotalactualrojo);
				
			}
		});
		button_4.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent arg0) {
				ejercitorojo.setContadorcaballeriarojo(ejercitorojo.getContadorcaballeriarojo()+1);
				label_5.setText(Integer.toString(ejercitorojo.getContadorcaballeriarojo()));
				
				 podercaballero=dato2.getPoderCaballero();		
				 podertotalactualrojo= Integer.parseInt(ejercitorojo2.getLblNewLabel_3().getText());
				
				podertotalactualrojo +=podercaballero;
				String poderespadachintxt = Integer.toString(podertotalactualrojo);
				ejercitorojo2.setTextLblNewLabel_3(podertotalactualrojo +"");;
				System.out.println(podertotalactualrojo);
				
			}
		});
	}
}
