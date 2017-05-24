package ERM;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JLabel;
import java.awt.Font;

public class contact extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					contact frame = new contact();
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
	public contact() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 462, 367);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Developed By");
		lblNewLabel.setFont(new Font("Calibri", Font.BOLD, 20));
		lblNewLabel.setBounds(10, 11, 144, 27);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Aayush Srivastava");
		lblNewLabel_1.setBounds(88, 59, 126, 14);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("aayushsri17@gmail.com");
		lblNewLabel_2.setBounds(88, 78, 184, 27);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("+91 9828162643");
		lblNewLabel_3.setBounds(88, 109, 207, 14);
		contentPane.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("");
		lblNewLabel_4.setBounds(10, 123, 46, 14);
		contentPane.add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("Kanak Kumar Jain");
		lblNewLabel_5.setBounds(263, 59, 201, 14);
		contentPane.add(lblNewLabel_5);
		
		JLabel lblNewLabel_6 = new JLabel("ankitkanakjain@gmail.com");
		lblNewLabel_6.setBounds(263, 78, 193, 27);
		contentPane.add(lblNewLabel_6);
		
		JLabel lblNewLabel_7 = new JLabel("+91 9847944109");
		lblNewLabel_7.setBounds(263, 109, 201, 14);
		contentPane.add(lblNewLabel_7);
		
		JLabel lblEmail = new JLabel("Email      ->");
		lblEmail.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblEmail.setBounds(10, 84, 91, 14);
		contentPane.add(lblEmail);
		
		JLabel lblContact = new JLabel("Contact ->");
		lblContact.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblContact.setBounds(10, 109, 80, 14);
		contentPane.add(lblContact);
		
		JLabel lblNewLabel_8 = new JLabel("Developed For");
		lblNewLabel_8.setFont(new Font("Calibri", Font.BOLD, 20));
		lblNewLabel_8.setBounds(297, 161, 139, 27);
		contentPane.add(lblNewLabel_8);
		
		JLabel lblNewLabel_11 = new JLabel("Department of Textile and Apparel Designing");
		lblNewLabel_11.setBounds(108, 209, 310, 14);
		contentPane.add(lblNewLabel_11);
		
		JLabel lblNewLabel_12 = new JLabel("Home Science College");
		lblNewLabel_12.setBounds(163, 234, 241, 14);
		contentPane.add(lblNewLabel_12);
		
		JLabel lblNewLabel_13 = new JLabel("Maharana Pratap University of Agriculture and Technology");
		lblNewLabel_13.setBounds(83, 259, 324, 14);
		contentPane.add(lblNewLabel_13);
		
		JLabel lblUdaipurRajasthan = new JLabel("Udaipur - Rajasthan");
		lblUdaipurRajasthan.setBounds(167, 284, 126, 14);
		contentPane.add(lblUdaipurRajasthan);
	}
}
