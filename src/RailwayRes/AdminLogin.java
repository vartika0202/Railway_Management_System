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
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.sql.SQLException;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;

public class AdminLogin extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AdminLogin frame = new AdminLogin();
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
	public AdminLogin() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 523, 393);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		JPanel panel = new JPanel();
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addComponent(panel, GroupLayout.DEFAULT_SIZE, 424, Short.MAX_VALUE)
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addComponent(panel, GroupLayout.DEFAULT_SIZE, 251, Short.MAX_VALUE)
		);
		
		JLabel lblNewLabel = new JLabel("Welcome Admin!!!");
		lblNewLabel.setBounds(177, 11, 193, 36);
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 17));
		
		JButton btnTrainUpdate = new JButton("Train Update");
		btnTrainUpdate.setBounds(185, 58, 137, 45);
		btnTrainUpdate.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				TrainUpdate t = null;
				try {
					t = new TrainUpdate();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				t.setVisible(true);
				setVisible(false);
				dispose();
				
			}
		});
		
		JButton btnTrainDelete = new JButton("Train Delete");
		btnTrainDelete.setBounds(185, 114, 137, 49);
		btnTrainDelete.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				AdminTrainDel a = null;
				try {
					a = new AdminTrainDel();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				a.setVisible(true);
				setVisible(false);
				dispose();
				
			}
		});
		
		JButton btnUserUpdate = new JButton("User Update");
		btnUserUpdate.setBounds(185, 174, 137, 42);
		
		JButton btnUserDelete = new JButton("User Delete");
		btnUserDelete.setBounds(185, 227, 137, 42);
		btnUserDelete.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				AdminUserDel d=new AdminUserDel();
				d.setVisible(true);
				setVisible(false);
				dispose();
			}
		});
		
		JButton btnLogout = new JButton("Logout");
		btnLogout.setBounds(185, 288, 137, 45);
		btnLogout.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Welcome w=new Welcome();
				w.setVisible(true);
				setVisible(false);
				dispose();
				
			}
		});
		panel.setLayout(null);
		panel.add(lblNewLabel);
		panel.add(btnTrainUpdate);
		panel.add(btnUserUpdate);
		panel.add(btnTrainDelete);
		panel.add(btnUserDelete);
		panel.add(btnLogout);
		
		JLabel lblNewLabel_1 = new JLabel("New label");
		lblNewLabel_1.setIcon(new ImageIcon("C:\\Users\\Admin\\Desktop\\train\\t3.jpg"));
		lblNewLabel_1.setBounds(0, 0, 497, 359);
		panel.add(lblNewLabel_1);
		contentPane.setLayout(gl_contentPane);
	}
}
