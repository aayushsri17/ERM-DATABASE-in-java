package ERM;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class equi extends JFrame {

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
					equi frame = new equi();
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
	public equi() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblEquipments = new JLabel("Equipments");
		lblEquipments.setBounds(196, 11, 78, 14);
		contentPane.add(lblEquipments);
		
		JButton btnNewButton = new JButton("Add Equipments");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				equiadd eqad=new equiadd();
				eqad.setVisible(true);
			}
		});
		btnNewButton.setBounds(35, 72, 200, 23);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("View Equipments");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
				viewequi ss= new viewequi();
				ss.setVisible(true);	
			}
		});
		btnNewButton_1.setBounds(35, 124, 200, 23);
		contentPane.add(btnNewButton_1);
		
		JButton btnBack = new JButton("Back");
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Home hm= new Home();
				hm.setVisible(true);}
		});
		btnBack.setBounds(35, 216, 89, 23);
		contentPane.add(btnBack);
	}

}
