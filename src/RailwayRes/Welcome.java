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
import javax.swing.JButton;
import javax.swing.LayoutStyle.ComponentPlacement;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import javax.swing.UIManager;
import java.awt.Font;
import javax.swing.ImageIcon;
import javax.swing.SwingConstants;

public class Welcome extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Welcome frame = new Welcome();
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
	public Welcome() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		JPanel panel = new JPanel();
		panel.setBackground(UIManager.getColor("Button.highlight"));
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addComponent(panel, Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, 424, Short.MAX_VALUE)
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addComponent(panel, Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, 251, Short.MAX_VALUE)
		);
		
		JButton btnNewButton = new JButton("Administrator");
		btnNewButton.setBounds(50, 103, 113, 23);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Administrator admin=new Administrator();
				admin.setVisible(true);
				setVisible(false);
				dispose();
			}
		});
		
		JLabel lblWelcomeToRailway = new JLabel("WELCOME TO RAILWAY MANAGEMENT SYSTEM");
		lblWelcomeToRailway.setBounds(10, 11, 404, 63);
		lblWelcomeToRailway.setFont(new Font("Tahoma", Font.BOLD, 16));
		
		JButton btnUserLogin = new JButton("User Login");
		btnUserLogin.setBounds(201, 103, 105, 23);
		btnUserLogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				UserLogin user=new UserLogin();
				user.setVisible(true);
				setVisible(false);
				dispose();
			}
		});
		panel.setLayout(null);
		panel.add(btnNewButton);
		panel.add(btnUserLogin);
		panel.add(lblWelcomeToRailway);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\Admin\\Desktop\\train\\train11.jpg"));
		lblNewLabel.setBounds(0, -18, 424, 265);
		panel.add(lblNewLabel);
		contentPane.setLayout(gl_contentPane);
	}
}
