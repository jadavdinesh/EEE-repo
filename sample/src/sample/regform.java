package sample;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JRadioButton;
import javax.swing.JCheckBox;
import java.awt.Font;
import javax.swing.JComboBox;
import javax.swing.JButton;
import javax.swing.ButtonGroup;
import javax.swing.DefaultComboBoxModel;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;

public class regform {

	private JFrame frame;
	private JTextField tb1;
	private JTextField tb2;
	private JLabel lblNewLabel_4;
	protected Object JOptionpane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					regform window = new regform();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public regform() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 465, 345);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("NAME");
		lblNewLabel.setBackground(new Color(128, 128, 255));
		lblNewLabel.setBounds(28, 78, 46, 14);
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 11));
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("ROLL NO");
		lblNewLabel_1.setBounds(28, 124, 46, 14);
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 11));
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("BRANCH");
		lblNewLabel_2.setBounds(28, 174, 46, 14);
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 11));
		frame.getContentPane().add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("GENDER");
		lblNewLabel_3.setBounds(28, 220, 46, 14);
		lblNewLabel_3.setFont(new Font("Tahoma", Font.BOLD, 11));
		frame.getContentPane().add(lblNewLabel_3);
		
		lblNewLabel_4 = new JLabel("PROG LANGS");
		lblNewLabel_4.setBounds(28, 263, 86, 19);
		lblNewLabel_4.setFont(new Font("Tahoma", Font.BOLD, 11));
		frame.getContentPane().add(lblNewLabel_4);
		
		tb1 = new JTextField();
		tb1.setBounds(206, 60, 86, 20);
		frame.getContentPane().add(tb1);
		tb1.setColumns(10);
		
		tb2 = new JTextField();
		tb2.setBounds(206, 121, 86, 20);
		frame.getContentPane().add(tb2);
		tb2.setColumns(10);
		
		JRadioButton r1 = new JRadioButton("MALE");
		r1.setBounds(162, 216, 86, 23);
		r1.setFont(new Font("Tahoma", Font.BOLD, 11));
		frame.getContentPane().add(r1);
		
		JRadioButton r2 = new JRadioButton("FEMALE");
		r2.setBounds(275, 216, 109, 23);
		r2.setFont(new Font("Tahoma", Font.BOLD, 11));
		frame.getContentPane().add(r2);
		
		JCheckBox c1 = new JCheckBox("C");
		c1.setBounds(151, 259, 66, 23);
		c1.setFont(new Font("Tahoma", Font.BOLD, 11));
		frame.getContentPane().add(c1);
		
		
		JCheckBox c3 = new JCheckBox("PYTHON");
		c3.setBounds(298, 261, 86, 23);
		c3.setFont(new Font("Tahoma", Font.BOLD, 11));
		frame.getContentPane().add(c3);
		
		JCheckBox c2 = new JCheckBox("JAVA");
		c2.setBounds(231, 259, 86, 23);
		c2.setFont(new Font("Tahoma", Font.BOLD, 11));
		frame.getContentPane().add(c2);
		
		JLabel lblNewLabel_5 = new JLabel("STUDENT REGISTRATION FORM");
		lblNewLabel_5.setBounds(71, 11, 277, 14);
		lblNewLabel_5.setFont(new Font("Tahoma", Font.BOLD, 15));
		frame.getContentPane().add(lblNewLabel_5);
		
		
		JComboBox cb1 = new JComboBox();
		cb1.setBounds(206, 170, 86, 22);
		cb1.setModel(new DefaultComboBoxModel(new String[] {"SELECT", "EEE", "ECE", "CSE"}));
		frame.getContentPane().add(cb1);
		
		ButtonGroup bg=new ButtonGroup();
		bg.add(r1);
		bg.add(r2);
		
		
		JButton btnNewButton = new JButton("SUBMIT");
		btnNewButton.setBounds(159, 283, 89, 23);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
			String name=tb1.getText();
			String rollno=tb2.getText();
			String branch=(String) cb1.getSelectedItem();
			String gender="";
			String langs=" "; 
			if(r1.isSelected())
			{
				gender="male";
			}
			if(r2.isSelected())
			{
				gender="female";
			}
			if(c1.isSelected())
			{
				langs=langs+"C";
			}
			if(c2.isSelected())
			{
				langs=langs+"JAVA";
			}
			if(c3.isSelected())
			{
				langs=langs+"PYTHON";
			}
			
		     JOptionPane.showMessageDialog(btnNewButton, "NAME :"+name+" \n ROLLNO :"+rollno+"\n BRANCH :"+branch+"\nGENDER :"+gender+"\nPROG LANGS :"+langs);    
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 13));
		frame.getContentPane().add(btnNewButton);
		
		JLabel lblNewLabel_6 = new JLabel("");
		lblNewLabel_6.setIcon(new ImageIcon("C:\\Users\\admin\\Pictures\\i6.jpg"));
		lblNewLabel_6.setBounds(0, 0, 449, 306);
		frame.getContentPane().add(lblNewLabel_6);
		
		
	}
}
