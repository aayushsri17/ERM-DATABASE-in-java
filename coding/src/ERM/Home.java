package ERM;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.GridLayout;

public class Home extends JFrame {

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
					Home frame = new Home();
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
	public Home() {
		setTitle("Home");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 350);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		JButton btnNewButton = new JButton("Production");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Prod pd=new Prod();
				pd.setVisible(true);
				
			}
		});
		contentPane.setLayout(new GridLayout(0, 3, 0, 0));
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_3 = new JButton("Retail");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Retail re=new Retail();
				re.setVisible(true);
				
			}
		});
		contentPane.add(btnNewButton_3);
		
		JButton btnNewButton_4 = new JButton("Students");
		btnNewButton_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			 Student st=new Student();
				st.setVisible(true);
			}
		});
		
		JButton btnNewButton_1 = new JButton("Equipment");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				equi eq=new equi();
				eq.setVisible(true);
			}
		});
		
		JButton btnNewButton_2 = new JButton("Design Studio");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				design1 d=new design1();
				d.setVisible(true);
			}
		});
		contentPane.add(btnNewButton_2);
		contentPane.add(btnNewButton_1);
		contentPane.add(btnNewButton_4);
		
		JButton btnNewButton_5 = new JButton("Contact ");
		btnNewButton_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				contact cc=new contact();
				cc.setVisible(true);
			}
		});
		contentPane.add(btnNewButton_5);
		
		
	
	}
}
