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

public class ResEnquiry extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ResEnquiry frame = new ResEnquiry();
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
	public ResEnquiry() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 570, 372);
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
		
		JLabel lblNewLabel = new JLabel("Steps To Follow:");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 16));
		
		JLabel lbldearUserfirstYou = new JLabel(" 1)Dear user,first you have to go to the user guide and need to click on user registration ");
		
		JLabel lblForRegisteringYourself = new JLabel(" for registering yourself in Railway Management System");
		
		JLabel lblifYouHave = new JLabel(" 2)If you have done that already,than ignore the above step and click on the Booking");
		
		JLabel lblTicketMenu = new JLabel(" ticket menu");
		
		JLabel lblafterThatChoose = new JLabel(" 3)After that choose the destinations in plan my journey menu and than pay the ");
		
		JLabel lblRegionalAmountFor = new JLabel(" regional amount for your tickets.");
		
		JLabel lblthisIsAll = new JLabel(" 4)This is all you neend to do and if you want to canncel your tickets than just use your ");
		
		JLabel lblPnrnoForCancelling = new JLabel(" PNRNo. for cancelling your tickets in the cancelling tickets menu");
		
		JButton btnGoBack = new JButton("Go Back");
		btnGoBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Enquiry e=new Enquiry();
				e.setVisible(true);
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
							.addGap(19)
							.addComponent(lblNewLabel))
						.addComponent(lbldearUserfirstYou)
						.addComponent(lblForRegisteringYourself)
						.addComponent(lblifYouHave)
						.addComponent(lblTicketMenu)
						.addComponent(lblafterThatChoose)
						.addComponent(lblRegionalAmountFor)
						.addComponent(lblthisIsAll)
						.addComponent(lblPnrnoForCancelling)
						.addGroup(gl_panel.createSequentialGroup()
							.addGap(162)
							.addComponent(btnGoBack)))
					.addContainerGap(10, Short.MAX_VALUE))
		);
		gl_panel.setVerticalGroup(
			gl_panel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel.createSequentialGroup()
					.addContainerGap()
					.addComponent(lblNewLabel)
					.addGap(18)
					.addComponent(lbldearUserfirstYou)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(lblForRegisteringYourself)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(lblifYouHave)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(lblTicketMenu)
					.addGap(18)
					.addComponent(lblafterThatChoose)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(lblRegionalAmountFor)
					.addGap(18)
					.addComponent(lblthisIsAll)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(lblPnrnoForCancelling)
					.addGap(18)
					.addComponent(btnGoBack)
					.addContainerGap(19, Short.MAX_VALUE))
		);
		panel.setLayout(gl_panel);
		contentPane.setLayout(gl_contentPane);
	}
}
