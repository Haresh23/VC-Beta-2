package bootcampdb;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;

public class joinclass extends JFrame {

	private JPanel contentPane;
	private JTextField textField;

	public joinclass() {
		setBounds(100, 100, 559, 370);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(0, 0, 0));
		panel.setBounds(-15, -31, 740, 435);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel label = new JLabel("New label");
		label.setBounds(347, 5, 45, 13);
		panel.add(label);
		
		JLabel lblNewLabel = new JLabel("Enter Class Code");
		lblNewLabel.setBounds(91, 136, 190, 42);
		lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD, 22));
		lblNewLabel.setForeground(new Color(255, 255, 255));
		lblNewLabel.setBackground(new Color(255, 255, 255));
		panel.add(lblNewLabel);
		
		textField = new JTextField();
		textField.setBounds(291, 136, 173, 34);
		panel.add(textField);
		textField.setColumns(10);
		
		JButton btnNewButton = new JButton("Join");
		btnNewButton.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		btnNewButton.setBounds(233, 233, 101, 34);
		panel.add(btnNewButton);
	}
}
