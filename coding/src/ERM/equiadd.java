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

public class equiadd extends JFrame {

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
	private JTextField textField_6;
	private JTextField textField_7;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					equiadd frame = new equiadd();
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
	public equiadd() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 350);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblEquipment = new JLabel("Add Equipment ");
		lblEquipment.setBounds(192, 11, 106, 14);
		contentPane.add(lblEquipment);
		
		JLabel lblNewLabel = new JLabel("Type of Machine");
		lblNewLabel.setBounds(32, 49, 106, 14);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Make");
		lblNewLabel_1.setBounds(32, 74, 46, 14);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Cost");
		lblNewLabel_2.setBounds(32, 99, 46, 14);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Purpose");
		lblNewLabel_3.setBounds(32, 124, 86, 14);
		contentPane.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("AMC Held");
		lblNewLabel_4.setBounds(32, 149, 86, 14);
		contentPane.add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("AMC Due");
		lblNewLabel_5.setBounds(32, 174, 106, 14);
		contentPane.add(lblNewLabel_5);
		
		JLabel lblNewLabel_6 = new JLabel("Entry Made By");
		lblNewLabel_6.setBounds(32, 199, 118, 14);
		contentPane.add(lblNewLabel_6);
		
		JLabel lblNewLabel_7 = new JLabel("Date");
		lblNewLabel_7.setBounds(32, 224, 46, 14);
		contentPane.add(lblNewLabel_7);
		
		textField = new JTextField();
		textField.setBounds(160, 46, 188, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(160, 71, 188, 20);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setBounds(160, 96, 188, 20);
		contentPane.add(textField_2);
		textField_2.setColumns(10);
		
		textField_3 = new JTextField();
		textField_3.setBounds(160, 121, 188, 20);
		contentPane.add(textField_3);
		textField_3.setColumns(10);
		
		textField_4 = new JTextField();
		textField_4.setBounds(160, 146, 188, 20);
		contentPane.add(textField_4);
		textField_4.setColumns(10);
		
		textField_5 = new JTextField();
		textField_5.setBounds(160, 171, 188, 20);
		contentPane.add(textField_5);
		textField_5.setColumns(10);
		
		textField_6 = new JTextField();
		textField_6.setBounds(160, 196, 188, 20);
		contentPane.add(textField_6);
		textField_6.setColumns(10);
		
		textField_7 = new JTextField();
		textField_7.setBounds(160, 221, 188, 20);
		contentPane.add(textField_7);
		textField_7.setColumns(10);
		
		final JButton btnNewButton = new JButton("Add Equipment");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String s1 = textField.getText();
				String s2 = textField_1.getText();
				String s3 = textField_2.getText();
				String s4 = textField_3.getText();
				String s5 = textField_4.getText();
				String s6 = textField_5.getText();
				String s7 = textField_6.getText();
				String s8 = textField_7.getText();
				
				java.sql.Connection con =DBInfo.getConnection();
				String str = "insert into addequi value(?,?,?,?,?,?,?,?)";
				
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
					ps.setString(7,s7);
					ps.setString(8,s8);
					
					flag =ps.executeUpdate();
					
				}
				
				catch(SQLException q)
				{
					q.printStackTrace();
					
				}
				
				if (flag ==0)
				{
					JOptionPane.showMessageDialog(btnNewButton,this,"Data Not Added",JOptionPane.ERROR_MESSAGE);
					
				}
				if (flag ==1)
				{
					if(s1.length()==0||s2.length()==0||s3.length()==0||s4.length()==0||s5.length()==0||s6.length()==0||s7.length()==0||s8.length()==0)
					{
						JOptionPane.showMessageDialog(btnNewButton,this,"Data Not Added",JOptionPane.ERROR_MESSAGE);
					}
					else
					{
					JOptionPane.showMessageDialog(btnNewButton,this,"Data Added",JOptionPane.INFORMATION_MESSAGE);
					
					textField.setText(null);
		    		textField_1.setText(null);
		    		textField_2.setText(null);
		    		textField_3.setText(null);
		    		textField_4.setText(null);
		    		textField_5.setText(null);
		    		textField_6.setText(null);
		    		textField_7.setText(null);
				}
				}
			}
		});
		btnNewButton.setBounds(160, 277, 119, 23);
		contentPane.add(btnNewButton);
		
		JButton btnBack = new JButton("Back");
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			equi eq=new equi();
			eq.setVisible(true);}
		});
		btnBack.setBounds(29, 277, 89, 23);
		contentPane.add(btnBack);
		
		JButton btnHome = new JButton("Home");
		btnHome.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Home hm= new Home();
				hm.setVisible(true);}
		});
		btnHome.setBounds(316, 277, 89, 23);
		contentPane.add(btnHome);
	}

}
