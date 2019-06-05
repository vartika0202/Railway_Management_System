package RailwayRes;

import java.io.*;
import java.sql.*;
import java.awt.*;
import javax.swing.*;
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
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JPasswordField;

public class CreditCard extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_3;
	private JPasswordField passwordField;
	private JPasswordField passwordField_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CreditCard frame = new CreditCard();
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
	public CreditCard() throws SQLException {
		conn=DriverManager.getConnection("jdbc:mysql://localhost/railway","root","root");
		System.out.println("connected");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 327);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		JPanel panel = new JPanel();
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(Alignment.TRAILING, gl_contentPane.createSequentialGroup()
					.addComponent(panel, GroupLayout.DEFAULT_SIZE, 414, Short.MAX_VALUE)
					.addContainerGap())
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addComponent(panel, GroupLayout.DEFAULT_SIZE, 251, Short.MAX_VALUE)
		);
		
		JLabel lblNewLabel = new JLabel("Card Number");
		
		JLabel lblCardNo = new JLabel("Card Pin");
		
		JLabel lblCvvNo = new JLabel("Cvv No");
		
		JLabel lblEnterAmount = new JLabel("Enter Amount");
		
		textField = new JTextField();
		textField.setColumns(10);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		
		JButton btnSubmit = new JButton("Submit");
		btnSubmit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
if(textField.getText().equals("")||textField_3.getText().equals("")||passwordField.getPassword().length==0||passwordField_1.getPassword().length==0) {
					
					JOptionPane.showMessageDialog(null, "Field is Empty");
				}
				else {
					
					int flag=0;
					try {
						
						String query="insert into CreditCard(CardNumber,CardPin,CvvNo,EnterAmount)values(?,?,?,?)";
						PreparedStatement pst=conn.prepareStatement(query);
						pst.setString(1,textField.getText());
						pst.setString(2,passwordField.getText());
						pst.setString(3,textField_3.getText());
						pst.setString(4,passwordField_1.getText());
						pst.execute();
						
						JOptionPane.showMessageDialog(null, "Payment Successfully Done");
						
						//int dialogButton=JOptionPane.YES_NO_OPTION;
						//JOptionPane.showConfirmDialog(null,"Are You Sure You Want To Submit");
					//	if(dialogButton==JOptionPane.YES_OPTION) {
							CongoSubmit c=new CongoSubmit();
							c.setVisible(true);
							setVisible(false);
							dispose();
							
					//	}
						
						pst.close();
					}
					catch(Exception e) {
						//System.out.println("Data Not Inserted");
						e.printStackTrace();
					}
				}
				
			}
		});
		
		passwordField = new JPasswordField();
		
		passwordField_1 = new JPasswordField();
		GroupLayout gl_panel = new GroupLayout(panel);
		gl_panel.setHorizontalGroup(
			gl_panel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel.createSequentialGroup()
					.addGap(32)
					.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
						.addComponent(btnSubmit)
						.addGroup(gl_panel.createParallelGroup(Alignment.LEADING, false)
							.addGroup(gl_panel.createSequentialGroup()
								.addComponent(lblEnterAmount)
								.addPreferredGap(ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
								.addComponent(textField_3, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
							.addGroup(gl_panel.createSequentialGroup()
								.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
									.addComponent(lblNewLabel)
									.addComponent(lblCardNo)
									.addComponent(lblCvvNo))
								.addGap(26)
								.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
									.addComponent(passwordField_1)
									.addGroup(gl_panel.createParallelGroup(Alignment.LEADING, false)
										.addComponent(textField)
										.addComponent(passwordField))))))
					.addContainerGap(207, Short.MAX_VALUE))
		);
		gl_panel.setVerticalGroup(
			gl_panel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel.createSequentialGroup()
					.addGap(50)
					.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblNewLabel)
						.addComponent(textField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(30)
					.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblCardNo)
						.addComponent(passwordField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(30)
					.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblCvvNo)
						.addComponent(passwordField_1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(27)
					.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblEnterAmount)
						.addComponent(textField_3, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.RELATED, 27, Short.MAX_VALUE)
					.addComponent(btnSubmit)
					.addContainerGap())
		);
		panel.setLayout(gl_panel);
		contentPane.setLayout(gl_contentPane);
	}
}
