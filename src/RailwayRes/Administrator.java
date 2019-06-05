package RailwayRes;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.FlowLayout;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import javax.swing.LayoutStyle.ComponentPlacement;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import javax.swing.ImageIcon;
import java.awt.Font;

public class Administrator extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JPasswordField passwordField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Administrator frame = new Administrator();
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
	public Administrator() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 767, 469);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		JPanel panel = new JPanel();
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addComponent(panel, Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, 424, Short.MAX_VALUE)
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addComponent(panel, Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, 251, Short.MAX_VALUE)
		);
		
		JLabel lblNewLabel = new JLabel("Username");
		lblNewLabel.setForeground(Color.WHITE);
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel.setBounds(227, 91, 86, 40);
		
		textField = new JTextField();
		textField.setBounds(368, 94, 86, 33);
		textField.setColumns(10);
		
		JLabel lblPassword = new JLabel("Password");
		lblPassword.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblPassword.setForeground(Color.WHITE);
		lblPassword.setBounds(227, 180, 84, 40);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(368, 187, 86, 33);
		
		JButton btnLogin = new JButton("Login");
		btnLogin.setBounds(227, 279, 86, 23);
		btnLogin.setBackground(Color.GREEN);
		btnLogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(textField.getText().equals("")||passwordField.getPassword().length==0) {
					JOptionPane.showMessageDialog(null,"Enter Username and Password");
				}
				else {
					if(textField.getText().equals("admin")&&passwordField.getText().equals("admin")) {
					JOptionPane.showMessageDialog(null,"Successfully Logged In");
					AdminLogin a=new AdminLogin();
					a.setVisible(true);
					setVisible(false);
					dispose();
					}
					else {
						JOptionPane.showMessageDialog(null,"Incorrect Username or Password");
						textField.setText("");
						passwordField.setText("");
					}
					
				}
			}
		});
		
		JButton btnCancel = new JButton("Cancel");
		btnCancel.setBounds(379, 279, 86, 23);
		btnCancel.setBackground(Color.RED);
		btnCancel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Welcome w=new Welcome();
				w.setVisible(true);
				setVisible(false);
				dispose();
				
			}
		});
		panel.setLayout(null);
		panel.add(lblNewLabel);
		panel.add(lblPassword);
		panel.add(passwordField);
		panel.add(textField);
		panel.add(btnLogin);
		panel.add(btnCancel);
		
		JLabel lblNewLabel_1 = new JLabel("New label");
		lblNewLabel_1.setIcon(new ImageIcon("C:\\Users\\Admin\\Desktop\\train\\t2.jpg"));
		lblNewLabel_1.setBounds(0, 0, 741, 447);
		panel.add(lblNewLabel_1);
		contentPane.setLayout(gl_contentPane);
	}
}
