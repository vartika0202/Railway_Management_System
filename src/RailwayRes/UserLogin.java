package RailwayRes;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.net.URI;
import java.net.URISyntaxException;
import java.awt.Desktop;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.FlowLayout;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JScrollPane;
import javax.swing.JScrollBar;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.awt.event.ActionEvent;
import javax.swing.JPasswordField;
import javax.swing.ImageIcon;
import java.awt.Font;
import java.awt.Color;
import java.awt.SystemColor;

public class UserLogin extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					UserLogin frame = new UserLogin();
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
	public UserLogin() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 541, 433);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		JPanel panel = new JPanel();
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.TRAILING)
				.addGroup(Alignment.LEADING, gl_contentPane.createSequentialGroup()
					.addComponent(panel, GroupLayout.PREFERRED_SIZE, 578, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addComponent(panel, GroupLayout.PREFERRED_SIZE, 460, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
		);
		
		JLabel lblNewLabel_2 = new JLabel("User Guide");
		lblNewLabel_2.setBackground(Color.WHITE);
		lblNewLabel_2.setForeground(new Color(0, 0, 0));
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_2.setBounds(70, 74, 90, 36);
		
		JLabel lblNewLabel_3 = new JLabel("General Info");
		lblNewLabel_3.setForeground(new Color(0, 0, 0));
		lblNewLabel_3.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_3.setBounds(70, 121, 90, 36);
		
		JLabel lblNewLabel_4 = new JLabel("Refund Rule");
		lblNewLabel_4.setForeground(new Color(0, 0, 0));
		lblNewLabel_4.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_4.setBounds(70, 171, 90, 36);
		
		JLabel lblNewLabel_5 = new JLabel("Enquiries");
		lblNewLabel_5.setForeground(new Color(0, 0, 0));
		lblNewLabel_5.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_5.setBounds(70, 227, 90, 32);
		
		JButton btnNewButton_1 = new JButton("Go");
		btnNewButton_1.setBackground(SystemColor.scrollbar);
		btnNewButton_1.setForeground(Color.BLACK);
		btnNewButton_1.setBounds(212, 68, 99, 36);
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				UserGuide1 user=new UserGuide1();
				user.setVisible(true);
				setVisible(false);
				dispose();
			}
		});
		
		JButton btnNewButton_2 = new JButton("About_IRCTC");
		btnNewButton_2.setBackground(SystemColor.scrollbar);
		btnNewButton_2.setBounds(212, 122, 99, 36);
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				Desktop d=Desktop.getDesktop();
				try {
					d.browse(new URI("https://www.mapsofindia.com/railway-timetable/"));
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (URISyntaxException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		});
		
		JButton btnNewButton_3 = new JButton("Refund");
		btnNewButton_3.setBackground(SystemColor.scrollbar);
		btnNewButton_3.setBounds(212, 169, 99, 43);
		
		JButton btnNewButton_4 = new JButton("Enquiry");
		btnNewButton_4.setBackground(SystemColor.scrollbar);
		btnNewButton_4.setBounds(212, 223, 99, 42);
		btnNewButton_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Enquiry en=new Enquiry();
				en.setVisible(true);
				setVisible(false);
				dispose();
			}
		});
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(257, 11, 2, 2);
		
		JButton btnGoBack = new JButton("Go Back");
		btnGoBack.setForeground(Color.BLACK);
		btnGoBack.setBackground(new Color(255, 0, 0));
		btnGoBack.setBounds(212, 276, 99, 50);
		btnGoBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Welcome wel=new Welcome();
				wel.setVisible(true);
				setVisible(false);
				dispose();
				
				
			}
		});
		panel.setLayout(null);
		panel.add(lblNewLabel_2);
		panel.add(lblNewLabel_3);
		panel.add(scrollPane);
		panel.add(btnNewButton_2);
		panel.add(btnNewButton_1);
		panel.add(btnNewButton_3);
		panel.add(btnNewButton_4);
		panel.add(lblNewLabel_5);
		panel.add(lblNewLabel_4);
		panel.add(btnGoBack);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\Admin\\Desktop\\train\\train12.jpg"));
		lblNewLabel.setBounds(0, -11, 568, 460);
		panel.add(lblNewLabel);
		contentPane.setLayout(gl_contentPane);
	}
}
