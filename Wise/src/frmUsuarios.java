import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import claseTest.Usuariios;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;
import java.awt.Toolkit;

public class frmUsuarios extends JFrame {

	private JPanel contentPane;
	private JTextField txtPast;
	private JTextField txtFuture;
	private JTextField txtPresent;

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
	public frmUsuarios() {
		setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\LEONARDO\\Pictures\\WISE\\Logo.png"));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(10, 6, 1280, 720);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblUsuario = new JLabel("                      ORGANICE LA FRASE");
		lblUsuario.setFont(new Font("Tahoma", Font.PLAIN, 40));
		lblUsuario.setBounds(107, 11, 1157, 79);
		contentPane.add(lblUsuario);
		
		txtPast = new JTextField();
		txtPast.setFont(new Font("Tahoma", Font.PLAIN, 30));
		txtPast.setBounds(27, 195, 673, 50);
		contentPane.add(txtPast);
		txtPast.setColumns(10);
		
		JButton btnNewButton = new JButton("COMPROBAR");
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 35));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Usuariios usu=new Usuariios();
				if(!usu.ValidarPast(txtPast.getText())) {
					JOptionPane.showMessageDialog(null, "NO ES CORRECTO");
					txtPast.setText("");
					txtPast.requestFocusInWindow();
					return;			
				}
				FrmPrincipal principal=new FrmPrincipal();
				principal.setVisible(true);
				dispose();
				
			}
		});
		btnNewButton.setBounds(813, 207, 300, 40);
		contentPane.add(btnNewButton);
		
		JButton btnEntrar = new JButton("COMPROBAR");
		btnEntrar.setFont(new Font("Tahoma", Font.PLAIN, 35));
		btnEntrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Usuariios usu=new Usuariios();
				if(!usu.ValidarPresent(txtPresent.getText())) {
					JOptionPane.showMessageDialog(null, "NO ES CORRECTO");
					txtPresent.setText("");
					txtPresent.requestFocusInWindow();
					return;			
				}
				FrmPrincipal principal=new FrmPrincipal();
				principal.setVisible(true);
				dispose();
				
			}
		});
		btnEntrar.setBounds(813, 375, 300, 40);
		contentPane.add(btnEntrar);
		
		txtFuture = new JTextField();
		txtFuture.setFont(new Font("Tahoma", Font.PLAIN, 30));
		txtFuture.setColumns(10);
		txtFuture.setBounds(27, 516, 673, 50);
		contentPane.add(txtFuture);
		
		JButton btnEntrar_1 = new JButton("COMPROBAR");
		btnEntrar_1.setFont(new Font("Tahoma", Font.PLAIN, 35));
		btnEntrar_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Usuariios usu=new Usuariios();
				if(!usu.ValidarFuture(txtFuture.getText())) {
					JOptionPane.showMessageDialog(null, "NO ES CORRECTO");
					txtFuture.setText("");
					txtFuture.requestFocusInWindow();
					return;			
				}
				FrmPrincipal principal=new FrmPrincipal();
				principal.setVisible(true);
				dispose();
			}
		});
		btnEntrar_1.setBounds(813, 528, 300, 40);
		contentPane.add(btnEntrar_1);
		
		txtPresent = new JTextField();
		txtPresent.setFont(new Font("Tahoma", Font.PLAIN, 30));
		txtPresent.setBounds(27, 363, 673, 50);
		contentPane.add(txtPresent);
		txtPresent.setColumns(10);
		
		JButton btnNewButton_1 = new JButton("MENU");
		btnNewButton_1.setFont(new Font("Tahoma", Font.PLAIN, 40));
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				Ventana2 window2=new Ventana2();
				window2.setVisible(true);
			}
		});
		btnNewButton_1.setBounds(486, 618, 300, 40);
		contentPane.add(btnNewButton_1);
	}
}
