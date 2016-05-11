import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Toolkit;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JToggleButton;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;

public class Ventana2 extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Ventana1 frame = new Ventana1();
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
	public Ventana2() {
		setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\LEONARDO\\Pictures\\WISE\\Logo.png"));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(10, 6, 1280, 720);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		final Past window3 = new Past();
		final Present window6 = new Present();
		final Future window10 = new Future();
		
		JButton VOCABULARY = new JButton("VOCABULARY");
		VOCABULARY.setFont(new Font("Tahoma", Font.PLAIN, 40));
		VOCABULARY.setBounds(65, 514, 300, 110);
		contentPane.add(VOCABULARY);
		
		JButton PAST = new JButton("PAST");
		PAST.setFont(new Font("Tahoma", Font.PLAIN, 40));
		PAST.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
					window3.setVisible(true);
					dispose();
			}
		});
		PAST.setBounds(859, 48, 300, 110);
		contentPane.add(PAST);
		
		JButton PRESENT = new JButton("PRESENT");
		PRESENT.setFont(new Font("Tahoma", Font.PLAIN, 40));
		PRESENT.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				window6.setVisible(true);
				dispose();
				
			}
		});
		PRESENT.setBounds(859, 212, 300, 110);
		contentPane.add(PRESENT);
		
		JButton FUTURE = new JButton("FUTURE");
		FUTURE.setFont(new Font("Tahoma", Font.PLAIN, 40));
		FUTURE.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				window10.setVisible(true);
				dispose();
			}
		});
		FUTURE.setBounds(859, 373, 300, 110);
		contentPane.add(FUTURE);
		
		JButton btnProof = new JButton("TEST");
		btnProof.setFont(new Font("Tahoma", Font.PLAIN, 40));
		btnProof.setBounds(444, 514, 300, 110);
		contentPane.add(btnProof);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\LEONARDO\\Pictures\\WISE\\Fondo2.png"));
		lblNewLabel.setBounds(0, 0, 1334, 681);
		contentPane.add(lblNewLabel);
	}
}
