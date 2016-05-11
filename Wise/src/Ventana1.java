import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.Toolkit;
import java.awt.Font;

public class Ventana1 extends JFrame {

	private JPanel contentPane;

	public Ventana1() {
		setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\LEONARDO\\Pictures\\WISE\\Logo.png"));
		setTitle("WISE");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(40, 6, 1280, 720);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		final Ventana2 window2 = new Ventana2();
		
		
		
		JButton INICIO = new JButton("START");
		INICIO.setFont(new Font("Tahoma", Font.PLAIN, 40));
		INICIO.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				window2.setVisible(true);
				dispose();
			}
		});
		INICIO.setBounds(507, 336, 300, 110);
		contentPane.add(INICIO);
		
		JLabel lblNewLabel_3 = new JLabel("New label");
		lblNewLabel_3.setIcon(new ImageIcon("C:\\Users\\LEONARDO\\Pictures\\WISE\\Fondo.png"));
		lblNewLabel_3.setBounds(0, 0, 1334, 681);
		contentPane.add(lblNewLabel_3);
	}
}
