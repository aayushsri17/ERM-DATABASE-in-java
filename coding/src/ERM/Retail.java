package ERM;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

public class Retail extends JFrame {

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
					Retail frame = new Retail();
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
	public Retail() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 350);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblRetail = new JLabel("Retail");
		lblRetail.setBounds(184, 11, 46, 14);
		contentPane.add(lblRetail);
		
		JButton btnBack = new JButton("Back");
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Home hm= new Home();
				hm.setVisible(true);
			}
		});
		btnBack.setBounds(34, 257, 89, 23);
		contentPane.add(btnBack);
		
		JButton btnAdd = new JButton("Add");
		btnAdd.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				AddApparel adap=new AddApparel();
				adap.setVisible(true);
			}
		});
		btnAdd.setBounds(184, 52, 89, 23);
		contentPane.add(btnAdd);
		
		JButton btnAdd_1 = new JButton("Add");
		btnAdd_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				AddHomeTextile adhm =new AddHomeTextile();
				adhm.setVisible(true);
			}
		});
		btnAdd_1.setBounds(184, 94, 89, 23);
		contentPane.add(btnAdd_1);
		
		JButton btnAdd_2 = new JButton("Add");
		btnAdd_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				AddAcce adac =new AddAcce();
				adac.setVisible(true);
			}
		});
		btnAdd_2.setBounds(184, 138, 89, 23);
		contentPane.add(btnAdd_2);
		
		JButton btnView = new JButton("View");
		btnView.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ViewApparel va=new ViewApparel();
				va.setVisible(true);
			}
		});
		btnView.setBounds(297, 52, 89, 23);
		contentPane.add(btnView);
		
		JButton btnView_1 = new JButton("View");
		btnView_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ViewHomeTextile vh=new ViewHomeTextile();
				vh.setVisible(true);
			}
		});
		btnView_1.setBounds(297, 94, 89, 23);
		contentPane.add(btnView_1);
		
		JButton btnView_2 = new JButton("View");
		btnView_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ViewAccessories vas=new ViewAccessories();
				vas.setVisible(true);
			}
		});
		btnView_2.setBounds(297, 138, 89, 23);
		contentPane.add(btnView_2);
		
		JLabel lblApparel = new JLabel("Apparel");
		lblApparel.setBounds(34, 56, 46, 14);
		contentPane.add(lblApparel);
		
		JLabel lblHomeTextile = new JLabel("Home Textile");
		lblHomeTextile.setBounds(34, 98, 77, 14);
		contentPane.add(lblHomeTextile);
		
		JLabel lblAccessories = new JLabel("Accessories");
		lblAccessories.setBounds(34, 142, 89, 14);
		contentPane.add(lblAccessories);
	}
}
