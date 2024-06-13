package dataserver;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JButton;
import java.awt.Font;
import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.awt.event.ActionEvent;

public class studentregi {

	private JFrame frame;
	private JTextField tb1;
	private JTextField tb2;
	private JTextField tb3;
	private JComboBox cb1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					studentregi window = new studentregi();
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
	public studentregi() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("STUDENT RESGISTRATION");
		lblNewLabel.setBounds(74, 32, 241, 14);
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 16));
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("ROLLNO");
		lblNewLabel_1.setBounds(33, 72, 59, 14);
		lblNewLabel_1.setFont(new Font("Sitka Text", Font.BOLD, 12));
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("NAME");
		lblNewLabel_2.setBounds(33, 124, 46, 14);
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 12));
		frame.getContentPane().add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("BRANCH");
		lblNewLabel_3.setBounds(33, 168, 72, 14);
		lblNewLabel_3.setFont(new Font("Tahoma", Font.BOLD, 12));
		frame.getContentPane().add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("MARKS");
		lblNewLabel_4.setBounds(33, 212, 46, 14);
		lblNewLabel_4.setFont(new Font("Tahoma", Font.BOLD, 12));
		frame.getContentPane().add(lblNewLabel_4);
		
		JButton btnNewButton = new JButton("SUBMIT");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String rno=tb1.getText();
				int rollno=Integer.parseInt(rno);
				String name=tb2.getText();
				String branch=(String) cb1.getSelectedItem();
				String m=tb3.getText();
				int marks=Integer.parseInt(m);
				try
				{
					Connection con=DriverManager.getConnection
							("jdbc:mysql://localhost:3306/dinesh","root","mrec");
					String q="insert into student values('"+rollno+"','"+name+"','"+branch+"','"+marks+"')";
		Statement stn=con.createStatement();
					stn.executeUpdate(q);
					con.close();
					JOptionPane.showMessageDialog(btnNewButton, "inserted successfully");
		}
				catch(SQLException e1)
				{
					e1.printStackTrace();
				}
			}
		});
		btnNewButton.setBounds(151, 238, 89, 23);
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 14));
		frame.getContentPane().add(btnNewButton);
		
		tb1 = new JTextField();
		tb1.setBounds(204, 69, 86, 20);
		frame.getContentPane().add(tb1);
		tb1.setColumns(10);
		
		tb2 = new JTextField();
		tb2.setBounds(204, 121, 86, 20);
		frame.getContentPane().add(tb2);
		tb2.setColumns(10);
		
		cb1 = new JComboBox();
		cb1.setBounds(211, 164, 79, 22);
		cb1.setModel(new DefaultComboBoxModel(new String[] {"SELECT", "EEE", "ECE", "CSE"}));
		frame.getContentPane().add(cb1);
		
		tb3 = new JTextField();
		tb3.setBounds(204, 209, 86, 20);
		frame.getContentPane().add(tb3);
		tb3.setColumns(10);
		
		JLabel lblNewLabel_5 = new JLabel("");
		lblNewLabel_5.setIcon(new ImageIcon("C:\\Users\\admin\\Downloads\\school-students.png"));
		lblNewLabel_5.setBounds(-48, 0, 495, 261);
		frame.getContentPane().add(lblNewLabel_5);
	}
}
