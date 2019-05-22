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

public class InterfazEjercitoAzul extends JFrame {//esta clase esta diseñada para seleccionar las unidades y reunir todo el poder en la clase principal
	private JLabel LblNewLabel_2;
	private JPanel contentPane;
	int poderespadachin,poderarquero,poderhondero,poderlancero,poderpiquero,podercaballero,podertotalactualazul;


	/**
	 * Create the frame.
	 */
	Ejercitoazul ejercitoazul = new Ejercitoazul(0,0,0,0,0,0);
	
	
	
	public InterfazEjercitoAzul() {
		setTitle("");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 616, 523);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		SelecciondeEjercitos ejercitoazul2 = new SelecciondeEjercitos();
		ejercitoazul2.setVisible(true);
		
		JButton btnNewButton_1 = new JButton("");
		btnNewButton_1.setIcon(new ImageIcon("C:\\Users\\josem\\OneDrive\\Desktop\\Espadachin.jpg"));
		btnNewButton_1.setBounds(105, 106, 97, 93);
		contentPane.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("");
		btnNewButton_2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
			}
		});
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
			public void mouseClicked(MouseEvent e) {//esto habre el marco para mostrar la info de la unidad predeterminada
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
		
		JLabel lblNewLabel_1 = new JLabel("0");
		lblNewLabel_1.setBounds(214, 152, 56, 16);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("0");
		lblNewLabel_2.setBounds(214, 262, 56, 16);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("0");
		lblNewLabel_3.setBounds(214, 373, 56, 16);
		contentPane.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("0");
		lblNewLabel_4.setBounds(517, 152, 56, 16);
		contentPane.add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("0");
		lblNewLabel_5.setBounds(517, 262, 56, 16);
		contentPane.add(lblNewLabel_5);
		
		JLabel lblNewLabel_6 = new JLabel("0");
		lblNewLabel_6.setBounds(517, 391, 56, 16);
		contentPane.add(lblNewLabel_6);
		
		JButton btnCrearUnidades = new JButton("Crear unidades");
		btnCrearUnidades.setBounds(83, 438, 119, 25);
		contentPane.add(btnCrearUnidades);
		
		
		Datos dato1 = new Datos();
	btnNewButton_1.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent arg0 ) {//esta funcion hace el recuento de unidades y las suma a un contador
			ejercitoazul.setContadorespadachinazul(ejercitoazul.getContadorespadachinazul()+1);
			lblNewLabel_1.setText(Integer.toString(ejercitoazul.getContadorespadachinazul()));
		
		 poderespadachin=dato1.getPoderEspadachin();//esta linea de abajo recoje el int con toda la informacion y la tronsforma en un jtxt		
		 podertotalactualazul= Integer.parseInt(ejercitoazul2.getLblNewLabel_2().getText());
		
		podertotalactualazul +=poderespadachin;
		String poderespadachintxt = Integer.toString(podertotalactualazul);//en desuso
		ejercitoazul2.setTextLblNewLabel_2(podertotalactualazul +"");;//esta linea te añade el poder al main
		System.out.println(podertotalactualazul);
		
			}
		});
	btnNewButton_2.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent arg0) {
				ejercitoazul.setContadorarqueroazul(ejercitoazul.getContadorarqueroazul()+1);
				lblNewLabel_2.setText(Integer.toString(ejercitoazul.getContadorarqueroazul()));
				
				 poderarquero=dato1.getPoderArquero();		
				 podertotalactualazul= Integer.parseInt(ejercitoazul2.getLblNewLabel_2().getText());
				
				podertotalactualazul +=poderarquero;
				String poderespadachintxt = Integer.toString(podertotalactualazul);
				ejercitoazul2.setTextLblNewLabel_2(podertotalactualazul +"");;
				System.out.println(podertotalactualazul);
			}
		});
	btnNewButton_3.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				ejercitoazul.setContadorhonderoazul(ejercitoazul.getContadorhonderoazul()+1);
				lblNewLabel_3.setText(Integer.toString(ejercitoazul.getContadorhonderoazul()));
				
				poderhondero=dato1.getPoderHondero();		
				 podertotalactualazul= Integer.parseInt(ejercitoazul2.getLblNewLabel_2().getText());
				
				podertotalactualazul +=poderhondero;
				String poderespadachintxt = Integer.toString(podertotalactualazul);
				ejercitoazul2.setTextLblNewLabel_2(podertotalactualazul +"");;
				System.out.println(podertotalactualazul);
				
			}
		});
	btnNewButton_4.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				ejercitoazul.setContadorlanceroazul(ejercitoazul.getContadorlanceroazul()+1);
				lblNewLabel_4.setText(Integer.toString(ejercitoazul.getContadorlanceroazul()));
				

				 poderlancero=dato1.getPoderLancero();		
				 podertotalactualazul= Integer.parseInt(ejercitoazul2.getLblNewLabel_2().getText());
				
				podertotalactualazul +=poderlancero;
				String poderespadachintxt = Integer.toString(podertotalactualazul);
				ejercitoazul2.setTextLblNewLabel_2(podertotalactualazul +"");;
				System.out.println(podertotalactualazul);
			}
		});
	btnNewButton_5.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				ejercitoazul.setContadorpiqueroazul(ejercitoazul.getContadorpiqueroazul()+1);
				lblNewLabel_5.setText(Integer.toString(ejercitoazul.getContadorpiqueroazul()));
				
				poderpiquero=dato1.getPoderPiquero();		
				 podertotalactualazul= Integer.parseInt(ejercitoazul2.getLblNewLabel_2().getText());
				
				podertotalactualazul +=poderpiquero;
				String poderespadachintxt = Integer.toString(podertotalactualazul);
				ejercitoazul2.setTextLblNewLabel_2(podertotalactualazul +"");;
				System.out.println(podertotalactualazul);
			}
		});
	btnNewButton_6.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				ejercitoazul.setContadorcaballeriaazul(ejercitoazul.getContadorcaballeriaazul()+1);
				lblNewLabel_6.setText(Integer.toString(ejercitoazul.getContadorcaballeriaazul()));
				
				podercaballero=dato1.getPoderCaballero();		
				 podertotalactualazul= Integer.parseInt(ejercitoazul2.getLblNewLabel_2().getText());
				
				podertotalactualazul +=podercaballero;
				String poderespadachintxt = Integer.toString(podertotalactualazul);
				ejercitoazul2.setTextLblNewLabel_2(podertotalactualazul +"");;
				System.out.println(podertotalactualazul);
			}
		});
	}
}
