package ERM;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.awt.event.ActionEvent;

public class AddApparel extends JFrame {

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
					AddApparel frame = new AddApparel();
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
	public AddApparel() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 497, 488);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setLayout(null);
		panel.setBorder(new EmptyBorder(5, 5, 5, 5));
		panel.setBounds(25, 11, 435, 418);
		contentPane.add(panel);
		
		JLabel label = new JLabel("Add Apparel");
		label.setBounds(180, 11, 80, 14);
		panel.add(label);
		
		JLabel label_1 = new JLabel("");
		label_1.setBounds(10, 45, 46, 14);
		panel.add(label_1);
		
		JLabel label_2 = new JLabel("Product");
		label_2.setBounds(31, 70, 80, 14);
		panel.add(label_2);
		
		JLabel label_3 = new JLabel("Quantity Sold");
		label_3.setBounds(31, 130, 80, 14);
		panel.add(label_3);
		
		JLabel label_4 = new JLabel("Balance");
		label_4.setBounds(31, 158, 80, 14);
		panel.add(label_4);
		
		JLabel label_5 = new JLabel("Price");
		label_5.setBounds(31, 186, 80, 14);
		panel.add(label_5);
		
		JLabel label_6 = new JLabel("Total Sold");
		label_6.setBounds(31, 214, 80, 14);
		panel.add(label_6);
		
		JLabel label_7 = new JLabel("Entry Made By");
		label_7.setBounds(31, 287, 80, 14);
		panel.add(label_7);
		
		JLabel label_8 = new JLabel("Date");
		label_8.setBounds(31, 250, 80, 14);
		panel.add(label_8);
		
		final JButton button = new JButton("Add Data");
		button.addActionListener(new ActionListener() {
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
				String str = "insert into Apparel value(?,?,?,?,?,?,?,?)";
				
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
					ps.setString(7,s8);
					ps.setString(8,s7);
					
					flag =ps.executeUpdate();
					
				}
				
				catch(SQLException q)
				{
					q.printStackTrace();
					
				}
				
				if (flag ==0)
				{
					JOptionPane.showMessageDialog(button,this,"Data Not Added",JOptionPane.ERROR_MESSAGE);
					
				}
				if (flag ==1)
				{
					if(s1.length()==0||s2.length()==0||s3.length()==0||s4.length()==0||s5.length()==0||s6.length()==0||s7.length()==0||s8.length()==0)
					{
						JOptionPane.showMessageDialog(button,this,"Data Not Added",JOptionPane.ERROR_MESSAGE);
					}
					else
					{
					JOptionPane.showMessageDialog(button,this,"Data Added",JOptionPane.INFORMATION_MESSAGE);
					
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
		button.setBounds(145, 343, 89, 23);
		panel.add(button);
		
		textField = new JTextField();
		textField.setColumns(10);
		textField.setBounds(145, 67, 182, 20);
		panel.add(textField);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(145, 96, 182, 20);
		panel.add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(145, 127, 182, 20);
		panel.add(textField_2);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(145, 155, 182, 20);
		panel.add(textField_3);
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		textField_4.setBounds(145, 183, 182, 20);
		panel.add(textField_4);
		
		textField_5 = new JTextField();
		textField_5.setColumns(10);
		textField_5.setBounds(145, 211, 182, 20);
		panel.add(textField_5);
		
		textField_6 = new JTextField();
		textField_6.setColumns(10);
		textField_6.setBounds(145, 247, 182, 20);
		panel.add(textField_6);
		
		textField_7 = new JTextField();
		textField_7.setColumns(10);
		textField_7.setBounds(145, 284, 182, 20);
		panel.add(textField_7);
		
		JLabel label_9 = new JLabel("Quantity Available");
		label_9.setBounds(31, 95, 89, 14);
		panel.add(label_9);
		
		JButton button_1 = new JButton("Back");
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Retail rt=new Retail();
				rt.setVisible(true);
			}
		});
		button_1.setBounds(22, 343, 89, 23);
		panel.add(button_1);
		
		JButton button_2 = new JButton("Home");
		button_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Home hm=new Home();
				hm.setVisible(true);
			}
		});
		button_2.setBounds(279, 343, 89, 23);
		panel.add(button_2);
	}
}
