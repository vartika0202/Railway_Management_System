package RailwayRes;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.FlowLayout;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.sql.SQLException;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.SystemColor;
import java.awt.Color;

public class UserGuide1 extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					UserGuide1 frame = new UserGuide1();
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
	public UserGuide1() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 550, 391);
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
				.addComponent(panel, Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, 251, Short.MAX_VALUE)
		);
		
		JButton btnNewButton = new JButton("User Registration");
		btnNewButton.setBounds(163, 40, 176, 47);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				UserRegistration user = null;
				try {
					user = new UserRegistration();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				user.setVisible(true);
				setVisible(false);
				dispose();
			}
		});
		
		JButton btnNewButton_1 = new JButton("Booking E-Ticket");
		btnNewButton_1.setBounds(163, 98, 176, 47);
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				EBooking book = null;
				try {
					book = new EBooking();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				book.setVisible(true);
				setVisible(false);
				dispose();
			}
		});
		
		JButton btnNewButton_2 = new JButton("Bank Transaction");
		btnNewButton_2.setBounds(163, 156, 176, 47);
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Banktransaction b=new Banktransaction();
				b.setVisible(true);
				setVisible(false);
				dispose();
			}
		});
		
		JButton btnNewButton_3 = new JButton("Cancelling E-Ticket");
		btnNewButton_3.setBounds(163, 214, 176, 47);
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				CancelTicket t = null;
				try {
					t = new CancelTicket();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				t.setVisible(true);
				setVisible(false);
				dispose();
			}
		});
		
		JButton btnNewButton_4 = new JButton("Logout");
		btnNewButton_4.setBounds(163, 272, 176, 47);
		btnNewButton_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				UserLogin u=new UserLogin();
				u.setVisible(true);
				setVisible(false);
				dispose();
			}
		});
		panel.setLayout(null);
		panel.add(btnNewButton_3);
		panel.add(btnNewButton_4);
		panel.add(btnNewButton_2);
		panel.add(btnNewButton_1);
		panel.add(btnNewButton);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\Admin\\Desktop\\train\\t1.jpg"));
		lblNewLabel.setBounds(0, 0, 524, 365);
		panel.add(lblNewLabel);
		
		/*JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\Admin\\Desktop\\t1.jpg"));
		lblNewLabel.setBounds(0, 0, 539, 356);
		panel.add(lblNewLabel);*/
		contentPane.setLayout(gl_contentPane);
	}
}
