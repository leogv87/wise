import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Toolkit;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;

public class Present1 extends JFrame {

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
	public Present1() {
		setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\LEONARDO\\Pictures\\WISE\\Logo.png"));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(10, 6, 1280, 720);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		final Present2 window8 = new Present2();
		
		JButton btnPrevious = new JButton("PREVIOUS");
		btnPrevious.setFont(new Font("Tahoma", Font.PLAIN, 30));
		btnPrevious.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				dispose();
				Present window6=new Present();
				window6.setVisible(true);
			}
		});
		btnPrevious.setBounds(131, 630, 300, 40);
		contentPane.add(btnPrevious);
		
		JButton button_1 = new JButton("MENU");
		button_1.setFont(new Font("Tahoma", Font.PLAIN, 30));
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				dispose();
				Ventana2 window2=new Ventana2();
				window2.setVisible(true);
			}
		});
		button_1.setBounds(477, 630, 300, 40);
		contentPane.add(button_1);
		
		JButton btnNext = new JButton("NEXT");
		btnNext.setFont(new Font("Tahoma", Font.PLAIN, 30));
		btnNext.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				window8.setVisible(true);
				dispose();
			}
		});
		btnNext.setBounds(815, 630, 300, 40);
		contentPane.add(btnNext);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\LEONARDO\\Pictures\\WISE\\Present1.png"));
		lblNewLabel.setBounds(0, 0, 1264, 681);
		contentPane.add(lblNewLabel);
	}

}
