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

public class Solution_Future extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Solution_Future frame = new Solution_Future();
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
	public Solution_Future() {
		setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\LEONARDO\\Pictures\\WISE\\Logo.png"));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(10, 6, 1280, 720);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton button = new JButton("RETURN");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				frmUsuarios window14=new frmUsuarios();
				window14.setVisible(true);
			}
		});
		button.setFont(new Font("Tahoma", Font.PLAIN, 35));
		button.setBounds(490, 590, 250, 40);
		contentPane.add(button);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\LEONARDO\\Pictures\\WISE\\SOLUTION_FUTURE.png"));
		lblNewLabel.setBounds(0, 0, 1264, 681);
		contentPane.add(lblNewLabel);
	}

}
