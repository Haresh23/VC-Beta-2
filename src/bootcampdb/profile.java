package bootcampdb;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

public class profile extends JFrame {

	private JPanel contentPane;
	private JTextField t_name;
	private JTextField t_rno;
	private JTextField t_phone;
	private JTextField tdept;
	private JTextField tdob;
	private JTextField tyear;
	private JLabel t_email;

	/**
	 * Launch the application.
	 */


	/**
	 * Create the frame.
	 */
	public profile(String email,String Desig) {
//		profile frame = new profile(email,Desig);
//		frame.setVisible(true);
//		frame.setLocationRelativeTo(null);
		setFont(new Font("Times New Roman", Font.PLAIN, 14));
		setTitle("Profile");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 720, 420);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 255, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);



		t_name = new JTextField();
		t_name.setBounds(301, 66, 179, 19);
		contentPane.add(t_name);
		t_name.setColumns(10);

		tyear = new JTextField();
		tyear.setBounds(584, 247, 96, 19);
		contentPane.add(tyear);
		tyear.setColumns(10);

		t_rno = new JTextField();
		t_rno.setBounds(247, 132, 96, 19);
		contentPane.add(t_rno);
		t_rno.setColumns(10);

		t_phone = new JTextField();
		t_phone.setBounds(247, 261, 96, 19);
		contentPane.add(t_phone);
		t_phone.setColumns(10);

		t_email = new JLabel("");
		t_email.setBackground(Color.WHITE);
		t_email.setBounds(247, 190, 186, 16);
		contentPane.add(t_email);

		tdob = new JTextField();
		tdob.setBounds(584, 132, 96, 19);
		contentPane.add(tdob);
		tdob.setColumns(10);

		tdept = new JTextField();
		tdept.setBounds(584, 190, 96, 19);
		contentPane.add(tdept);
		tdept.setColumns(10);


		JLabel lblNewLabel = new JLabel("Name");
		lblNewLabel.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		lblNewLabel.setBounds(234, 68, 67, 13);
		contentPane.add(lblNewLabel);

		JLabel lblNewLabel_1 = new JLabel("Email");
		lblNewLabel_1.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		lblNewLabel_1.setBounds(141, 192, 45, 13);
		contentPane.add(lblNewLabel_1);

		JLabel lblNewLabel_2 = new JLabel("Mobile number");
		lblNewLabel_2.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		lblNewLabel_2.setBounds(141, 263, 96, 13);
		contentPane.add(lblNewLabel_2);

		JLabel lblNewLabel_3 = new JLabel("Date of Birth");
		lblNewLabel_3.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		lblNewLabel_3.setBounds(498, 134, 76, 13);
		contentPane.add(lblNewLabel_3);

		JLabel lblNewLabel_4 = new JLabel("Department");
		lblNewLabel_4.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		lblNewLabel_4.setBounds(498, 192, 76, 13);
		contentPane.add(lblNewLabel_4);

		JLabel lblNewLabel_5 = new JLabel("Year of study");
		lblNewLabel_5.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		lblNewLabel_5.setBounds(498, 249, 90, 13);
		contentPane.add(lblNewLabel_5);

		JLabel lblNewLabel_6 = new JLabel("Register Number");
		lblNewLabel_6.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		lblNewLabel_6.setBounds(141, 134, 107, 13);
		contentPane.add(lblNewLabel_6);

		Panel panel = new Panel();
		panel.setBackground(new Color(0, 0, 0));
		panel.setBounds(-14, 0, 90, 383);
		contentPane.add(panel);

		JLabel lbldash = new JLabel("");
		lbldash.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				Dashboard d1=new Dashboard(email, Desig);
				d1.setVisible(true);
				d1.setLocationRelativeTo(null);
				dispose();
			}
		});
		lbldash.setIcon(new ImageIcon("C:\\Users\\HARESHVAR A R\\Downloads\\icons8-home-64.png"));
		lbldash.setBounds(22, 144, 68, 64);
		panel.add(lbldash);

		JLabel lblNewLabel_7 = new JLabel("");
		lblNewLabel_7.setIcon(new ImageIcon("/Users/Hareshvar A R/Desktop/Access Camera and Microphone/imgs/icons8-name-50.png"));
		lblNewLabel_7.setBounds(366, 14, 50, 42);
		contentPane.add(lblNewLabel_7);

		JLabel lblNewLabel_8 = new JLabel("");
		lblNewLabel_8.setIcon(new ImageIcon("/Users/Hareshvar A R/Desktop/Access Camera and Microphone/imgs/icons8-id-card-32.png"));
		lblNewLabel_8.setBounds(90, 116, 32, 35);
		contentPane.add(lblNewLabel_8);

		JLabel lblNewLabel_9 = new JLabel("");
		lblNewLabel_9.setIcon(new ImageIcon("/Users/Hareshvar A R/Desktop/Access Camera and Microphone/imgs/icons8-email-32.png"));
		lblNewLabel_9.setBounds(90, 171, 37, 38);
		contentPane.add(lblNewLabel_9);

		JLabel lblNewLabel_10 = new JLabel("");
		lblNewLabel_10.setIcon(new ImageIcon("/Users/Hareshvar A R/Desktop/Access Camera and Microphone/imgs/icons8-iphone-32.png"));
		lblNewLabel_10.setBounds(90, 245, 32, 35);
		contentPane.add(lblNewLabel_10);

		JLabel lblNewLabel_11 = new JLabel("");
		lblNewLabel_11.setIcon(new ImageIcon("/Users/Hareshvar A R/Desktop/Access Camera and Microphone/imgs/icons8-age-32.png"));
		lblNewLabel_11.setBounds(443, 120, 32, 41);
		contentPane.add(lblNewLabel_11);

		JLabel lblNewLabel_12 = new JLabel("");
		lblNewLabel_12.setIcon(new ImageIcon("/Users/Hareshvar A R/Desktop/Access Camera and Microphone/imgs/icons8-department-32.png"));
		lblNewLabel_12.setBounds(443, 179, 32, 44);
		contentPane.add(lblNewLabel_12);

		JLabel lblNewLabel_13 = new JLabel("");
		lblNewLabel_13.setIcon(new ImageIcon("/Users/Hareshvar A R/Desktop/Access Camera and Microphone/imgs/icons8-study-50.png"));
		lblNewLabel_13.setBounds(438, 233, 50, 47);
		contentPane.add(lblNewLabel_13);

		try{
			Connection con = dbOperations.getConnection();
			PreparedStatement ps1= con.prepareStatement("select * from "+Desig+"_details where email = ?");
			ps1.setString(1,email);
			ResultSet rs= ps1.executeQuery();
			if(rs.next()){
				t_email.setText(rs.getString(1));
				t_name.setText(rs.getString(2));
				t_rno.setText(rs.getString(4));
				t_phone.setText(rs.getString(3));
				tyear.setText(rs.getString(6));
				tdept.setText(rs.getString(5));
				tdob.setText(rs.getString(9));
			}

		}
		catch (Exception ee){
			System.out.println(ee);

		}
		JButton btndelAc = new JButton("Delete Account");
		btndelAc.setBackground(Color.WHITE);
		btndelAc.setFont(new Font("Tahoma", Font.BOLD, 17));
		btndelAc.setBounds(335, 334, 159, 21);
		contentPane.add(btndelAc);
		btndelAc.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				boolean bo1=false;

				try{
					Connection con = dbOperations.getConnection();
					Statement st3 = con.createStatement();
					PreparedStatement ps1 = con.prepareStatement("select * from "+Desig+"_details where reg_no = ?");
					ps1.setString(1, email);
					ResultSet rs = ps1.executeQuery();
					String query = String.format("delete from "+Desig+"_details where email='%s'", email);
					int rd=st3.executeUpdate(query);
					con.setAutoCommit(true);
					con.close();
					if(rd>0){
						JOptionPane.showMessageDialog(btndelAc,"Account Deleted");
						Login l1=new Login();
						l1.setVisible(true);
						l1.setLocationRelativeTo(null);
					}
					else{
						JOptionPane.showMessageDialog(btndelAc,"Error!!");
					}


				}
				catch (Exception ee){
					System.out.println(ee);

				}

			}
		});
	}
}
