package ERM;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class design1 extends JFrame {

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
					design1 frame = new design1();
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
	public design1() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblDesignStudio = new JLabel("Design Studio");
		lblDesignStudio.setBounds(172, 11, 84, 14);
		contentPane.add(lblDesignStudio);
		
		JButton btnAddDesign = new JButton("Add Design");
		btnAddDesign.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				designadd dgad=new designadd();
				dgad.setVisible(true);
			}
		});
		btnAddDesign.setBounds(39, 66, 125, 23);
		contentPane.add(btnAddDesign);
		
		JButton btnNewButton = new JButton("View Design");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ViewDesign vd=new ViewDesign();
				vd.setVisible(true);
			}
		});
		btnNewButton.setBounds(38, 116, 126, 23);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Back");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Home hm=new Home();
				hm.setVisible(true);
			
			}
		});
		btnNewButton_1.setBounds(39, 206, 89, 23);
		contentPane.add(btnNewButton_1);
	}
}
