package ERM;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Prod extends JFrame {

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
					Prod frame = new Prod();
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
	public Prod() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblProduction = new JLabel("Production");
		lblProduction.setBounds(177, 11, 83, 21);
		contentPane.add(lblProduction);
		
		JLabel lblRawMaterial = new JLabel("Raw Material");
		lblRawMaterial.setBounds(245, 14, 102, 14);
		contentPane.add(lblRawMaterial);
		
		JButton btnNewButton_2 = new JButton("Add");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Addfabric adf=new Addfabric();
				adf.setVisible(true);
			}
		});
		btnNewButton_2.setBounds(274, 105, 60, 23);
		contentPane.add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("View");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ViewFabric vf=new ViewFabric();
				vf.setVisible(true);
				
				
		    	 
			}
		});
		btnNewButton_3.setBounds(344, 105, 71, 23);
		contentPane.add(btnNewButton_3);
		
		JButton button = new JButton("Add");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Addfinished adfd=new Addfinished();
				adfd.setVisible(true);
			}
		});
				button.setBounds(274, 153, 60, 23);
		contentPane.add(button);
		
		JButton button_1 = new JButton("View");
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ViewFinished vff=new ViewFinished();
				vff.setVisible(true);
			}
		});
		button_1.setBounds(344, 153, 71, 23);
		contentPane.add(button_1);
		
		JButton btnBack = new JButton("Back");
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Home hm= new Home();
				hm.setVisible(true);}
		});
		btnBack.setBounds(10, 216, 89, 23);
		contentPane.add(btnBack);
		
		JLabel lblFabrivTrimsAccessories = new JLabel("Fabric Trims Accessories");
		lblFabrivTrimsAccessories.setBounds(24, 109, 180, 14);
		contentPane.add(lblFabrivTrimsAccessories);
		
		JLabel lblFinishedGoods = new JLabel("Finished Goods");
		lblFinishedGoods.setBounds(24, 157, 167, 14);
		contentPane.add(lblFinishedGoods);
	}
}
