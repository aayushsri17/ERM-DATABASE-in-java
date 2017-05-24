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

public class Addfabric extends JFrame {

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

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Addfabric frame = new Addfabric();
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
	public Addfabric() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 350);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblFabricTrims = new JLabel("FABRIC - TRIMS - ACCESSORIES");
		lblFabricTrims.setBounds(126, 11, 192, 14);
		contentPane.add(lblFabricTrims);
		
		JLabel lblNewLabel = new JLabel("Type");
		lblNewLabel.setBounds(24, 45, 46, 14);
		contentPane.add(lblNewLabel);
		
		JLabel label = new JLabel("Details");
		label.setBounds(24, 70, 46, 14);
		contentPane.add(label);
		
		JLabel label_1 = new JLabel("Quantity Available");
		label_1.setBounds(24, 95, 113, 14);
		contentPane.add(label_1);
		
		JLabel label_2 = new JLabel("Date Of Issue");
		label_2.setBounds(24, 120, 96, 14);
		contentPane.add(label_2);
		
		JLabel label_3 = new JLabel("Balance");
		label_3.setBounds(24, 145, 46, 14);
		contentPane.add(label_3);
		
		JLabel label_4 = new JLabel("Issued To");
		label_4.setBounds(24, 170, 96, 14);
		contentPane.add(label_4);
		
		JLabel label_5 = new JLabel("Purpose");
		label_5.setBounds(24, 195, 81, 14);
		contentPane.add(label_5);
		
		textField = new JTextField();
		textField.setBounds(147, 42, 199, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(147, 67, 199, 20);
		contentPane.add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(147, 92, 199, 20);
		contentPane.add(textField_2);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(147, 117, 199, 20);
		contentPane.add(textField_3);
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		textField_4.setBounds(147, 142, 199, 20);
		contentPane.add(textField_4);
		
		textField_5 = new JTextField();
		textField_5.setColumns(10);
		textField_5.setBounds(147, 167, 199, 20);
		contentPane.add(textField_5);
		
		textField_6 = new JTextField();
		textField_6.setColumns(10);
		textField_6.setBounds(147, 192, 199, 20);
		contentPane.add(textField_6);
		
		final JButton btnAdd = new JButton("Add");
		btnAdd.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
				String s1=textField.getText();
		    	 String s2=textField_1.getText();

		    	 String s3=textField_2.getText();

		    	 String s4=textField_3.getText();

		    	 String s5=textField_4.getText();

		    	 String s6=textField_5.getText();
		    	 String s7=textField_6.getText();
		    	
		    	 
		    	 
		    	 java.sql.Connection con= DBInfo.getConnection();
		    	 String str="insert into addfabric values(?,?,?,?,?,?,?)";
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
					ps.setString(7, s7);

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
		    		
		    		if(s1.length()==0||s2.length()==0||s3.length()==0||s4.length()==0||s5.length()==0||s6.length()==0||s7.length()==0)
					{
						JOptionPane.showMessageDialog(btnAdd,this,"Data Not Added",JOptionPane.ERROR_MESSAGE);
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
		    		textField_6.setText(null);
					}
		    	}
			}
		});
		btnAdd.setBounds(170, 238, 89, 23);
		contentPane.add(btnAdd);
		
		JButton btnBack = new JButton("Back");
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
				Prod pd=new Prod();
				pd.setVisible(true);}
		});
		btnBack.setBounds(24, 238, 89, 23);
		contentPane.add(btnBack);
		
		JButton btnHome = new JButton("Home");
		btnHome.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Home hm= new Home();
				hm.setVisible(true);}
		});
		btnHome.setBounds(313, 238, 89, 23);
		contentPane.add(btnHome);
	}
}
