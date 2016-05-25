import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Toolkit;
import javax.swing.JButton;
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Vocabulary2 extends JFrame {

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
	public Vocabulary2() {
		setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\LEONARDO\\Pictures\\WISE\\Logo.png"));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(300, 2, 699, 730);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		final Vocabulary3 window21 = new Vocabulary3();
		
		JButton button = new JButton("NEXT");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				window21.setVisible(true);
				dispose();
			}
		});
		button.setFont(new Font("Tahoma", Font.PLAIN, 40));
		button.setBounds(450, 0, 233, 230);
		contentPane.add(button);
		
		JButton btnMenu = new JButton("MENU");
		btnMenu.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				Ventana2 window2=new Ventana2();
				window2.setVisible(true);
			}
		});
		btnMenu.setFont(new Font("Tahoma", Font.PLAIN, 40));
		btnMenu.setBounds(450, 230, 233, 230);
		contentPane.add(btnMenu);
		
		JButton btnPrevious = new JButton("PREV");
		btnPrevious.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				Vocabulary1 window19=new Vocabulary1();
				window19.setVisible(true);
			}
		});
		btnPrevious.setFont(new Font("Tahoma", Font.PLAIN, 40));
		btnPrevious.setBounds(450, 458, 233, 233);
		contentPane.add(btnPrevious);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\LEONARDO\\Pictures\\WISE\\bloggif_574511b211d2e.png"));
		lblNewLabel.setBounds(0, 0, 683, 691);
		contentPane.add(lblNewLabel);
	}

}
