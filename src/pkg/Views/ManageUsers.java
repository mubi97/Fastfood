package pkg.Views;

import javax.swing.JPanel;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JPasswordField;
import javax.swing.JRadioButton;
import javax.swing.JButton;

public class ManageUsers extends JPanel {
	private JTextField textField;
	private JTextField nameBox;
	private JTextField emailBox;
	private JTextField phoneBox;
	private JPasswordField passwordBox;
	private JPasswordField cpassBox;

	/**
	 * Create the panel.
	 */
	public ManageUsers() {
		setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.WHITE);
		panel.setBounds(0, 0, 790, 400);
		add(panel);
		panel.setLayout(null);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(394, 5, 1, 1);
		panel_1.setLayout(null);
		panel_1.setBackground(new Color(255, 204, 204));
		panel.add(panel_1);
		
		textField = new JTextField();
		textField.setBounds(113, 11, 650, 28);
		panel_1.add(textField);
		JPanel slider = new JPanel();
		slider.setBounds(0, 11, 10, 53);
		panel.add(slider);
		slider.setBackground(Color.RED);
		
		JLabel label = new JLabel("Product Name");
		label.setFont(new Font("Century Gothic", Font.BOLD, 12));
		label.setBounds(10, 17, 93, 14);
		panel_1.add(label);
		
		JPanel namePanel = new JPanel();
		namePanel.setLayout(null);
		namePanel.setBackground(new Color(255, 204, 204));
		namePanel.setBounds(13, 11, 777, 53);
		panel.add(namePanel);
		
		nameBox = new JTextField();
		nameBox.setBounds(113, 11, 650, 28);
		namePanel.add(nameBox);
		
		JLabel lblName = new JLabel("Name");
		lblName.setFont(new Font("Century Gothic", Font.BOLD, 12));
		lblName.setBounds(10, 17, 93, 14);
		namePanel.add(lblName);
		
		JPanel emailPanel = new JPanel();
		emailPanel.setLayout(null);
		emailPanel.setBackground(Color.WHITE);
		emailPanel.setBounds(13, 75, 777, 53);
		panel.add(emailPanel);
		
		emailBox = new JTextField();
		emailBox.setBounds(113, 11, 650, 28);
		emailPanel.add(emailBox);
		
		JLabel lblEmail = new JLabel("Email");
		lblEmail.setFont(new Font("Century Gothic", Font.BOLD, 12));
		lblEmail.setBounds(10, 17, 93, 14);
		emailPanel.add(lblEmail);
		
		JPanel phonePanel = new JPanel();
		phonePanel.setLayout(null);
		phonePanel.setBackground(Color.WHITE);
		phonePanel.setBounds(13, 139, 777, 53);
		panel.add(phonePanel);
		
		phoneBox = new JTextField();
		phoneBox.setBounds(113, 11, 650, 28);
		phonePanel.add(phoneBox);
		
		JLabel lblPhoneNumber = new JLabel("Phone Number");
		lblPhoneNumber.setFont(new Font("Century Gothic", Font.BOLD, 12));
		lblPhoneNumber.setBounds(10, 17, 93, 14);
		phonePanel.add(lblPhoneNumber);
		
		JPanel passwordPanel = new JPanel();
		passwordPanel.setLayout(null);
		passwordPanel.setBackground(Color.WHITE);
		passwordPanel.setBounds(13, 203, 777, 53);
		panel.add(passwordPanel);
		
		passwordBox = new JPasswordField();
		passwordBox.setBounds(113, 11, 650, 28);
		passwordPanel.add(passwordBox);
		
		JLabel lblPassword = new JLabel("password");
		lblPassword.setFont(new Font("Century Gothic", Font.BOLD, 12));
		lblPassword.setBounds(10, 17, 93, 14);
		passwordPanel.add(lblPassword);
		
		JPanel cpassPanel = new JPanel();
		cpassPanel.setLayout(null);
		cpassPanel.setBackground(Color.WHITE);
		cpassPanel.setBounds(13, 267, 777, 53);
		panel.add(cpassPanel);
		
		cpassBox = new JPasswordField();
		cpassBox.setBounds(113, 11, 650, 28);
		cpassPanel.add(cpassBox);
		
		JLabel lblCpassword = new JLabel("CPassword");
		lblCpassword.setFont(new Font("Century Gothic", Font.BOLD, 12));
		lblCpassword.setBounds(10, 17, 93, 14);
		cpassPanel.add(lblCpassword);
		
		JPanel radioPanel = new JPanel();
		radioPanel.setLayout(null);
		radioPanel.setBackground(Color.WHITE);
		radioPanel.setBounds(13, 331, 777, 30);
		panel.add(radioPanel);
		
		JRadioButton rdbtnAdmin = new JRadioButton("Admin");
		rdbtnAdmin.setBackground(Color.WHITE);
		rdbtnAdmin.setSelected(true);
		rdbtnAdmin.setFont(new Font("Microsoft Sans Serif", Font.PLAIN, 13));
		rdbtnAdmin.setBounds(187, 7, 109, 16);
		radioPanel.add(rdbtnAdmin);
		
		JRadioButton rdbtnUser = new JRadioButton("Operator");
		rdbtnUser.setBackground(Color.WHITE);
		rdbtnUser.setFont(new Font("Microsoft Sans Serif", Font.PLAIN, 13));
		rdbtnUser.setBounds(367, 7, 109, 16);
		radioPanel.add(rdbtnUser);
		
		JLabel lblUserType = new JLabel("User Type");
		lblUserType.setFont(new Font("Century Gothic", Font.BOLD, 12));
		lblUserType.setBounds(10, 10, 93, 14);
		radioPanel.add(lblUserType);
		
		JButton btnSubmit = new JButton("Submit");
		btnSubmit.setForeground(Color.WHITE);
		btnSubmit.setFont(new Font("Century Gothic", Font.BOLD, 14));
		btnSubmit.setBackground(Color.RED);
		btnSubmit.setBounds(238, 372, 289, 28);
		panel.add(btnSubmit);
	

	}
}