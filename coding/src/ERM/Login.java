package ERM;

import java.awt.EventQueue;
import java.awt.GraphicsConfiguration;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.awt.event.ActionEvent;


public class Login extends JFrame{

	
	private static final long serialVersionUID = 1L;
	protected static final GraphicsConfiguration Home = null;
	private JPanel contentPane;
	private JTextField textField;
	private JPasswordField passwordField;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Login frame = new Login(null);
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
	public Login(String title) {
		super(title);
		setTitle("Login");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 415);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblLogin = new JLabel("Login");
		lblLogin.setBounds(184, 11, 77, 14);
		contentPane.add(lblLogin);
		
		JLabel lblUsername = new JLabel("Username");
		lblUsername.setBounds(37, 77, 77, 14);
		contentPane.add(lblUsername);
		
		JLabel lblPassword = new JLabel("Password");
		lblPassword.setBounds(37, 134, 98, 14);
		contentPane.add(lblPassword);
		
		textField = new JTextField();
		textField.setBounds(145, 74, 186, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JButton b = new JButton("Login");
		b.addActionListener(new ActionListener() {
		

			@SuppressWarnings("deprecation")
			public void actionPerformed(ActionEvent e) {
				try
				{
					Connection con=DBInfo.getConnection();
					String query= "select * from Login where UserName=? and Password=?";
					
					PreparedStatement ps=con.prepareStatement(query);
					ps.setString(1,textField.getText());
					ps.setString(2,passwordField.getText());
					
					ResultSet res=ps.executeQuery();
					
					int count=0;
					while (res.next())
						
					{ count = count+1;
					}
					
					if (count==1)
					{
						
			  
							JOptionPane.showMessageDialog(null,"Username and password is correct");
							Home hm=new Home();
							hm.setVisible(true);
						}
				
					else
					{
					JOptionPane.showMessageDialog(null,"Incorrect password or username");
					}
					
					res.close();
					ps.close();
				}
				catch (Exception e1)
				
				{
					e1.printStackTrace();
				}
					
					
					
				}
			
			
		});
		b.setBounds(46, 249, 89, 23);
		contentPane.add(b);
		
		JButton btnReset = new JButton("Reset");
		btnReset.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				textField.setText(null);
	    		passwordField.setText(null);
			}
		});
		btnReset.setBounds(218, 249, 89, 23);
		contentPane.add(btnReset);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(145, 131, 186, 20);
		contentPane.add(passwordField);
	}
}
