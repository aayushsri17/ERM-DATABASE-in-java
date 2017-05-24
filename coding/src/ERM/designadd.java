package ERM;


import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.awt.event.ActionEvent;

public class designadd extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					designadd frame = new designadd();
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
	public designadd() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 350);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblAddDesign = new JLabel("Add Design");
		lblAddDesign.setBounds(189, 11, 78, 14);
		contentPane.add(lblAddDesign);
		
		JLabel lblNewLabel = new JLabel("Item");
		lblNewLabel.setBounds(31, 44, 78, 14);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Make");
		lblNewLabel_1.setBounds(31, 77, 78, 14);
		contentPane.add(lblNewLabel_1);
		
		JLabel label = new JLabel("Quantity");
		label.setBounds(31, 109, 78, 14);
		contentPane.add(label);
		
		JLabel label_1 = new JLabel("Time Worked");
		label_1.setBounds(31, 143, 78, 14);
		contentPane.add(label_1);
		
		JLabel label_2 = new JLabel("Purpose");
		label_2.setBounds(31, 176, 78, 14);
		contentPane.add(label_2);
		
		JLabel label_3 = new JLabel("Used By");
		label_3.setBounds(31, 209, 78, 14);
		contentPane.add(label_3);
		
		textField = new JTextField();
		textField.setBounds(157, 41, 180, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(157, 74, 180, 20);
		contentPane.add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(157, 106, 180, 20);
		contentPane.add(textField_2);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(157, 140, 180, 20);
		contentPane.add(textField_3);
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		textField_4.setBounds(157, 173, 180, 20);
		contentPane.add(textField_4);
		
		textField_5 = new JTextField();
		textField_5.setColumns(10);
		textField_5.setBounds(157, 206, 180, 20);
		contentPane.add(textField_5);
		
		final JButton btnAddDesign = new JButton("Add Design");
		btnAddDesign.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String s1 = textField.getText();
				String s2 = textField_1.getText();
				String s3 = textField_2.getText();
				String s4 = textField_3.getText();
				String s5 = textField_4.getText();
				String s6 = textField_5.getText();
				
				
				java.sql.Connection con =DBInfo.getConnection();
				String str = "insert into adddesign value(?,?,?,?,?,?)";
				
				int flag =0;
				try
				{
					PreparedStatement ps = con.prepareStatement(str);
					
					ps.setString(1,s1);
					ps.setString(2,s2);
					ps.setString(3,s3);
					ps.setString(4,s4);
					ps.setString(5,s5);
					ps.setString(6,s6);
					
					
					flag =ps.executeUpdate();
					
				}
				
				catch(SQLException q)
				{
					q.printStackTrace();
					
				}
				
				if (flag ==0)
				{
					JOptionPane.showMessageDialog(btnAddDesign,this,"Data Not Added",JOptionPane.ERROR_MESSAGE);
					
				}
				if (flag ==1)
				{
					if(s1.length()==0||s2.length()==0||s3.length()==0||s4.length()==0||s5.length()==0||s6.length()==0)
					{
						JOptionPane.showMessageDialog(btnAddDesign,this,"Data Not Added",JOptionPane.ERROR_MESSAGE);
					}
					else
					{
					JOptionPane.showMessageDialog(btnAddDesign,this,"Data Added",JOptionPane.INFORMATION_MESSAGE);
					
					textField.setText(null);
		    		textField_1.setText(null);
		    		textField_2.setText(null);
		    		textField_3.setText(null);
		    		textField_4.setText(null);
		    		textField_5.setText(null);
		    		
				}
				
				}
			}
		});
		btnAddDesign.setBounds(157, 265, 89, 23);
		contentPane.add(btnAddDesign);
		
		JButton btnBack = new JButton("Back");
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			design1 dg=new design1();
			dg.setVisible(true);}
		});
		btnBack.setBounds(20, 265, 89, 23);
		contentPane.add(btnBack);
		
		JButton btnHome = new JButton("Home");
		btnHome.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Home hm= new Home();
				hm.setVisible(true);}
		});
		btnHome.setBounds(301, 265, 89, 23);
		contentPane.add(btnHome);
	}

}
