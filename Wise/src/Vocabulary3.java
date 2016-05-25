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

public class Vocabulary3 extends JFrame {

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
	public Vocabulary3() {
		setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\LEONARDO\\Pictures\\WISE\\Logo.png"));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(300, 2, 699, 730);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnMenu = new JButton("MENU");
		btnMenu.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				Ventana2 window2=new Ventana2();
				window2.setVisible(true);
			}
		});
		btnMenu.setFont(new Font("Tahoma", Font.PLAIN, 40));
		btnMenu.setBounds(439, 0, 244, 350);
		contentPane.add(btnMenu);
		
		JButton btnPrev = new JButton("PREV");
		btnPrev.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				Vocabulary2 window20=new Vocabulary2();
				window20.setVisible(true);
			}
		});
		btnPrev.setFont(new Font("Tahoma", Font.PLAIN, 40));
		btnPrev.setBounds(439, 351, 244, 350);
		contentPane.add(btnPrev);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\LEONARDO\\Pictures\\WISE\\bloggif_574515ffd52a3.png"));
		lblNewLabel.setBounds(0, 0, 683, 701);
		contentPane.add(lblNewLabel);
	}

}
