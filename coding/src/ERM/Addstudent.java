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

public class Addstudent extends JFrame {

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
					Addstudent frame = new Addstudent();
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
	public Addstudent() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 350);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblAddStudentData = new JLabel("Add Student Data");
		lblAddStudentData.setBounds(172, 23, 133, 14);
		contentPane.add(lblAddStudentData);
		
		JLabel lblNewLabel = new JLabel("Name");
		lblNewLabel.setBounds(31, 58, 95, 14);
		contentPane.add(lblNewLabel);
		
		JLabel label = new JLabel("Products Made");
		label.setBounds(31, 94, 95, 14);
		contentPane.add(label);
		
		JLabel label_1 = new JLabel("Description");
		label_1.setBounds(31, 132, 118, 14);
		contentPane.add(label_1);
		
		JLabel label_2 = new JLabel("Profit Given To Student");
		label_2.setBounds(31, 171, 131, 14);
		contentPane.add(label_2);
		
		JLabel label_3 = new JLabel("Entry Made By");
		label_3.setBounds(31, 209, 131, 14);
		contentPane.add(label_3);
		
		JLabel label_4 = new JLabel("Date");
		label_4.setBounds(31, 242, 69, 14);
		contentPane.add(label_4);
		
		textField = new JTextField();
		
		textField.setBounds(172, 55, 183, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(172, 91, 183, 20);
		contentPane.add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(172, 129, 183, 20);
		contentPane.add(textField_2);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(172, 168, 183, 20);
		contentPane.add(textField_3);
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		textField_4.setBounds(172, 206, 183, 20);
		contentPane.add(textField_4);
		
		textField_5 = new JTextField();
		textField_5.setColumns(10);
		textField_5.setBounds(172, 239, 183, 20);
		contentPane.add(textField_5);
		
		final JButton btnAdd = new JButton("Add");
		btnAdd.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String s1=textField.getText();
		    	 String s2=textField_1.getText();

		    	 String s3=textField_2.getText();

		    	 String s4=textField_3.getText();

		    	 String s5=textField_4.getText();

		    	 String s6=textField_5.getText();
		    	
		    	 
		    	 
		    	 java.sql.Connection con= DBInfo.getConnection();
		    	 String str="insert into addstudent values(?,?,?,?,?,?)";
		    	 int flag=0;
		    	 try 	
		    	 {
					PreparedStatement ps=con.prepareStatement(str);
					ps.setString(1, s1);
					ps.setString(2, s2);
					ps.setString(3, s3);
					ps.setString(4, s4);
					ps.setString(5, s5);
					ps.setString(6, s6);
					
					flag=ps.executeUpdate();
		    	 }
					
		    	 catch (SQLException e1) 
		    	 {
				
					e1.printStackTrace();
				}
		    	if(flag==0)
		    	{
		    		JOptionPane.showMessageDialog(btnAdd, this, "Not added", JOptionPane.ERROR_MESSAGE);
		    		
		    	}
		    	if(flag==1)
		    	{
		    		
		    		if(s1.length()==0||s2.length()==0||s3.length()==0||s4.length()==0||s5.length()==0||s6.length()==0)
					{
						JOptionPane.showMessageDialog(btnAdd,this,"Data Not Added",JOptionPane.ERROR_MESSAGE);
				//		JOptionPane.showMessageDialog(this,"Data Not Added","not added"JOptionPane.INFORMATION_MESSAGE);
					}
					else
					{
		    		JOptionPane.showMessageDialog(btnAdd, this, "Added", JOptionPane.INFORMATION_MESSAGE);
		    		
		    		
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
		
		btnAdd.setBounds(169, 277, 89, 23);
		contentPane.add(btnAdd);
		
		JButton btnNewButton = new JButton("Back");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Student st=new Student();
				st.setVisible(true);
			}
		});
		btnNewButton.setBounds(31, 277, 89, 23);
		contentPane.add(btnNewButton);
		
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
	
