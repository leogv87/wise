import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.Toolkit;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Vocabulary1 extends JFrame {

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
	public Vocabulary1() {
		setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\LEONARDO\\Pictures\\WISE\\Logo.png"));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(300, 2, 699, 730);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		final Vocabulary2 window20 = new Vocabulary2();
		
		JButton btnNext_1 = new JButton("NEXT");
		btnNext_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				window20.setVisible(true);
				dispose();
				
			}
		});
		btnNext_1.setFont(new Font("Tahoma", Font.PLAIN, 40));
		btnNext_1.setBounds(475, 0, 208, 350);
		contentPane.add(btnNext_1);
		
		JButton btnNext = new JButton("MENU");
		btnNext.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				Ventana2 window2=new Ventana2();
				window2.setVisible(true);
			}
		});
		btnNext.setFont(new Font("Tahoma", Font.PLAIN, 40));
		btnNext.setBounds(475, 351, 208, 340);
		contentPane.add(btnNext);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\LEONARDO\\Pictures\\WISE\\bloggif_57450ce11b16c.png"));
		lblNewLabel.setBounds(0, 0, 683, 691);
		contentPane.add(lblNewLabel);
	}

}
