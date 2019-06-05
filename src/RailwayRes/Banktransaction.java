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
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Banktransaction extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Banktransaction frame = new Banktransaction();
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
	public Banktransaction() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 351);
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
		
		JLabel lblNewLabel = new JLabel("Net Banking");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 16));
		
		JLabel lblStateBankOf = new JLabel("  State Bank Of India-Rs. 10/- per transaction+ Service Tax as applicable");
		
		JLabel lblStateBankOf_1 = new JLabel("  State Bank Of India and Associates-Rs. 10/- per transaction");
		
		JLabel lblIndianBankrsPer = new JLabel("  Indian Bank-Rs-10/- per transaction");
		
		JLabel lblUnionBankOf = new JLabel("  Union Bank Of India-Rs. 10/- per transaction");
		
		JLabel lblAndhraBankrs = new JLabel("  Andhra Bank-Rs. 10/- +Service Tax as applicable");
		
		JLabel lblPunjabNationalBankrs = new JLabel("  Punjab National Bank-Rs. 10/- per transaction");
		
		JLabel lblHdfcBankrs = new JLabel("  HDFC Bank-Rs. 10/-+ service tax as applicable");
		
		JLabel lblAxisBankrs = new JLabel("  AXIS Bank-Rs.10/- + Service Tax as applicable");
		
		JLabel lblVijayaBankrs = new JLabel("  Vijaya Bank-Rs. 10/-+ service tax as applicable");
		
		JButton btnGoBack = new JButton(" Go Back");
		btnGoBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				UserGuide1 u=new UserGuide1();
				u.setVisible(true);
				setVisible(false);
				dispose();
				
			}
		});
		GroupLayout gl_panel = new GroupLayout(panel);
		gl_panel.setHorizontalGroup(
			gl_panel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel.createSequentialGroup()
					.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panel.createSequentialGroup()
							.addGap(152)
							.addComponent(lblNewLabel))
						.addGroup(gl_panel.createSequentialGroup()
							.addContainerGap()
							.addComponent(lblStateBankOf, GroupLayout.PREFERRED_SIZE, 353, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_panel.createSequentialGroup()
							.addContainerGap()
							.addComponent(lblStateBankOf_1))
						.addGroup(gl_panel.createSequentialGroup()
							.addContainerGap()
							.addComponent(lblIndianBankrsPer))
						.addGroup(gl_panel.createSequentialGroup()
							.addContainerGap()
							.addComponent(lblUnionBankOf))
						.addGroup(gl_panel.createSequentialGroup()
							.addContainerGap()
							.addComponent(lblAndhraBankrs))
						.addGroup(gl_panel.createSequentialGroup()
							.addContainerGap()
							.addComponent(lblPunjabNationalBankrs))
						.addGroup(gl_panel.createSequentialGroup()
							.addContainerGap()
							.addComponent(lblHdfcBankrs))
						.addGroup(gl_panel.createSequentialGroup()
							.addContainerGap()
							.addComponent(lblAxisBankrs))
						.addGroup(gl_panel.createSequentialGroup()
							.addContainerGap()
							.addComponent(lblVijayaBankrs))
						.addGroup(gl_panel.createSequentialGroup()
							.addContainerGap()
							.addComponent(btnGoBack)))
					.addContainerGap(61, Short.MAX_VALUE))
		);
		gl_panel.setVerticalGroup(
			gl_panel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel.createSequentialGroup()
					.addContainerGap()
					.addComponent(lblNewLabel)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(lblStateBankOf, GroupLayout.PREFERRED_SIZE, 14, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(lblStateBankOf_1)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(lblIndianBankrsPer)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(lblUnionBankOf)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(lblAndhraBankrs)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(lblPunjabNationalBankrs)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(lblHdfcBankrs)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(lblAxisBankrs)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(lblVijayaBankrs)
					.addGap(18)
					.addComponent(btnGoBack)
					.addContainerGap(25, Short.MAX_VALUE))
		);
		panel.setLayout(gl_panel);
		contentPane.setLayout(gl_contentPane);
	}

}
