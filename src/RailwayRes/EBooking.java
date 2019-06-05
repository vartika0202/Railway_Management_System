package RailwayRes;

import java.io.*;
import java.sql.*;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
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
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class EBooking extends JFrame {

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
					EBooking frame = new EBooking();
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
	Connection conn=null;
	public EBooking() throws SQLException {
		conn=DriverManager.getConnection("jdbc:mysql://localhost/railway","root","root");
		System.out.println("connected");
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
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
		
		JLabel lblNewLabel = new JLabel("Username");
		
		JLabel lblNewLabel_1 = new JLabel("Password");
		
		JButton btnNewButton = new JButton("Login");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				//String pass=passwordField.getText();
				//String user=textField.getText();
				try {
				if(textField.getText().equals("")||passwordField.getPassword().length==0) {
				JOptionPane.showMessageDialog(null,"Enter Username and Password");
				
				}
				else {
					int flag=0;
					Statement st=conn.createStatement();
					ResultSet rec=st.executeQuery("select UserName,Password from l");
					while(rec.next()) {
						String x=textField.getText();
						String y=passwordField.getText();
						if(x.equals(rec.getString("UserName")) && y.equals(rec.getString("Password"))) {
								flag=1;
								break;
					}
				}
					if(flag==1) {
					JOptionPane.showMessageDialog(null,"Login Successful");
					BookingLogin b=new BookingLogin();
					b.setVisible(true);
					setVisible(false);
					dispose();
				}
					else {
						JOptionPane.showMessageDialog(null,"Login Failed");
					}
				}
				}
					
				/*if(textField.getText().equals(rs.getString("Password"))) {
					JOptionPane.showMessageDialog(null,"Login Successful");	
					BookingLogin book=new BookingLogin();
					book.setVisible(true);
					rs.close();
					pst.close();
				}
				else {
					JOptionPane.showMessageDialog(null,"Login Failed");	
					dispose();
				}
				}
			}*/
				catch(Exception e) {
					e.printStackTrace();
				}
			}
			
		});
		
		JButton btnNewButton_1 = new JButton("Back");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				UserGuide1 user=new UserGuide1();
				user.setVisible(true);
				setVisible(false);
				dispose();
				
			}
		});
		
		textField = new JTextField();
		textField.setColumns(10);
		
		passwordField = new JPasswordField();
		GroupLayout gl_panel = new GroupLayout(panel);
		gl_panel.setHorizontalGroup(
			gl_panel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel.createSequentialGroup()
					.addGap(18)
					.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
						.addComponent(btnNewButton)
						.addComponent(lblNewLabel_1)
						.addComponent(lblNewLabel))
					.addGap(26)
					.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
						.addComponent(passwordField)
						.addComponent(btnNewButton_1)
						.addComponent(textField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addContainerGap(237, GroupLayout.PREFERRED_SIZE))
		);
		gl_panel.setVerticalGroup(
			gl_panel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel.createSequentialGroup()
					.addGap(46)
					.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
						.addComponent(textField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblNewLabel))
					.addGap(28)
					.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblNewLabel_1)
						.addComponent(passwordField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(28)
					.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
						.addComponent(btnNewButton)
						.addComponent(btnNewButton_1))
					.addContainerGap(89, Short.MAX_VALUE))
		);
		panel.setLayout(gl_panel);
		contentPane.setLayout(gl_contentPane);
	}
}
