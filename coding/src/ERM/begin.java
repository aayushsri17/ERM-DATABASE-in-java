package ERM;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class begin extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					begin frame = new begin();
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
	public begin() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("DIGITIZED ERM SOLUTION");
		lblNewLabel.setFont(new Font("Calibri", Font.PLAIN, 24));
		lblNewLabel.setBounds(89, 26, 307, 33);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("New label");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 30));
		lblNewLabel_1.setBounds(149, 93, 46, 14);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("FOR");
		lblNewLabel_2.setFont(new Font("Calibri", Font.PLAIN, 24));
		lblNewLabel_2.setBounds(177, 58, 109, 40);
		contentPane.add(lblNewLabel_2);
		
		JButton btnProceed = new JButton("Proceed");
		btnProceed.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
			Login ln=new Login(null);
			ln.setVisible(true);
			
			}
			
			
		});
		btnProceed.setBounds(335, 227, 89, 23);
		contentPane.add(btnProceed);
		
		JLabel lblNewLabel_3 = new JLabel("EXPERIMENTAL LEARNING");
		lblNewLabel_3.setFont(new Font("Calibri", Font.PLAIN, 24));
		lblNewLabel_3.setBounds(89, 93, 307, 40);
		contentPane.add(lblNewLabel_3);
		
		JLabel lblDevelopedByaayush = new JLabel("Developed By  : Aayush Srivastava and Kanak Kumak Jain");
		lblDevelopedByaayush.setFont(new Font("Tahoma", Font.PLAIN, 9));
		lblDevelopedByaayush.setBounds(10, 236, 286, 14);
		contentPane.add(lblDevelopedByaayush);
	}
}
