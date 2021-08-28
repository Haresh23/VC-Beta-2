package bootcampdb;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class createclass extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;

	/**
	 * Launch the application.
	 */


	/**
	 * Create the frame.
	 */
	public  createclass(String email,String Desig) {
		setBounds(100, 100, 720, 420);
		contentPane = new JPanel();
		contentPane.setForeground(Color.BLACK);
		contentPane.setBackground(new Color(255, 255, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Classroom Name");
		lblNewLabel.setBounds(230, 70, 124, 20);
		lblNewLabel.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Class Section");
		lblNewLabel_1.setBounds(230, 154, 111, 25);
		lblNewLabel_1.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setBounds(161, 45, 59, 66);
		lblNewLabel_2.setIcon(new ImageIcon("/Users/Hareshvar A R/Desktop/Access Camera and Microphone/imgs/icons8-classroom-50.png"));
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("");
		lblNewLabel_3.setIcon(new ImageIcon("/Users/Hareshvar A R/Desktop/Access Camera and Microphone/imgs/icons8-class-50.png"));
		lblNewLabel_3.setBounds(161, 136, 59, 55);
		contentPane.add(lblNewLabel_3);
		
		textField = new JTextField();
		textField.setBounds(420, 72, 96, 19);
		contentPane.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(420, 158, 96, 19);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		textField_2 = new JTextField();
		textField_2.setBounds(420, 236, 96, 19);
		contentPane.add(textField_2);
		textField_2.setColumns(10);
		
		JButton btncreate = new JButton("Create Classroom");
		btncreate.setIcon(new ImageIcon("/Users/Hareshvar A R/Desktop/Access Camera and Microphone/imgs/icons8-plus-+-50.png"));
		btncreate.setBackground(Color.WHITE);
		btncreate.setForeground(Color.BLACK);
		btncreate.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		btncreate.setBounds(264, 296, 224, 59);
		contentPane.add(btncreate);

		btncreate.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if(textField.getText().equals("") || textField_1.getText().equals("") || textField_2.getText().equals("")){
					JOptionPane.showMessageDialog(btncreate,"Enter Details Correctly");
				}
				else{
					String cname =textField.getText();
					System.out.println(cname);
					String ccode=new CodeGeneration().CodeGen();

					boolean res=new dbFunction("VIP").tableCreateClass(ccode);
					if(res){
						JOptionPane.showMessageDialog(btncreate,"Classroom Created");
						Dashboard d1=new Dashboard(email, Desig);
						d1.setVisible(true);
						d1.setLocationRelativeTo(null);
						d1.panel_1details(cname);
						dispose();
					}


				}
			}
		});
		
		JLabel lblNewLabel_4 = new JLabel("");
		lblNewLabel_4.setIcon(new ImageIcon("/Users/Hareshvar A R/Desktop/Access Camera and Microphone/imgs/icons8-study-50 (1).png"));
		lblNewLabel_4.setBounds(164, 224, 50, 55);
		contentPane.add(lblNewLabel_4);
		

		
		JLabel lblNewLabel_5 = new JLabel("Year of Study");
		lblNewLabel_5.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		lblNewLabel_5.setBounds(230, 229, 101, 31);
		contentPane.add(lblNewLabel_5);

	}

}
