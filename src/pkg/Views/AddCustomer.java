package pkg.Views;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextArea;
import javax.swing.border.Border;
import javax.swing.border.EmptyBorder;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;

import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;

public class AddCustomer extends JPanel {
	private JTextField emailBox;
	private JTextField nameBox;
	
	private JTextField addressBox;
	private JTextField phoneNumber;

	/**
	 * Create the panel.
	 */
	public AddCustomer() {
		setFont(new Font("Comic Sans MS", Font.PLAIN, 12));
		setForeground(Color.BLACK);
		setBackground(Color.WHITE);
		
		setLayout(null);
		
		
//		JPanel panel_1 = new JPanel();
//		panel_1.setBackground(Color.RED);
//		panel_1.setBounds(0, 0, 469, 10);
//		add(panel_1);
		
		JPanel namePanel = new JPanel();
		namePanel.setBackground(Color.WHITE);
		namePanel.setBounds(10, 80, 787, 53);
		add(namePanel);
		namePanel.setLayout(null);
		
		nameBox = new JTextField();
		nameBox.setBounds(85, 11, 692, 28);
		namePanel.add(nameBox);
		
		JLabel lblPassword = new JLabel("Name");
		lblPassword.setBounds(10, 17, 65, 14);
		namePanel.add(lblPassword);
		lblPassword.setFont(new Font("Century Gothic", Font.BOLD, 12));
		JPanel phonePanel = new JPanel();
		phonePanel.setLayout(null);
		phonePanel.setBackground(Color.WHITE);
		phonePanel.setBounds(10, 144, 787, 53);
		add(phonePanel);
		phoneNumber= new JTextField();
		phoneNumber.setBounds(85, 11, 692, 28);
		
		phonePanel.add(phoneNumber);
		
		
		
		
		
		
		JLabel lblPhone = new JLabel("Phone#");
		lblPhone.setFont(new Font("Century Gothic", Font.BOLD, 12));
		lblPhone.setBounds(10, 17, 65, 14);
		phonePanel.add(lblPhone);
		
		phoneNumber = new JPasswordField();
		phoneNumber.setBounds(85, 11, 692, 28);
		phonePanel.add(phoneNumber);
		
		JPanel addressPanel = new JPanel();
		addressPanel.setLayout(null);
		addressPanel.setBackground(Color.WHITE);
		addressPanel.setBounds(10, 218, 787, 153);
		add(addressPanel);
		
		JLabel lblAddress = new JLabel("Address");
		lblAddress.setFont(new Font("Century Gothic", Font.BOLD, 12));
		lblAddress.setBounds(10, 17, 65, 14);
		addressPanel.add(lblAddress);
		JTextArea addressBox = new JTextArea();
		addressBox.setBounds(85, 13, 692, 129);
		addressPanel.add(addressBox);
		Border border = BorderFactory.createLineBorder(Color.GRAY);
		addressBox.setBorder(BorderFactory.createCompoundBorder(border, 
		            BorderFactory.createEmptyBorder(5, 5, 5, 5)));
		
		JPanel emailPanel = new JPanel();
		emailPanel.setLayout(null);
		emailPanel.setBackground(new Color(255, 204, 204));
		emailPanel.setBounds(10, 15, 787, 53);
		add(emailPanel);
		
		emailBox = new JPasswordField();
		emailBox.setBounds(85, 11, 692, 28);
		emailPanel.add(emailBox);
		
		JLabel lblEmail = new JLabel("Email");
		lblEmail.setFont(new Font("Century Gothic", Font.BOLD, 12));
		lblEmail.setBounds(10, 17, 65, 14);
		emailPanel.add(lblEmail);
		
		JButton btnAddCustomer = new JButton("Add Customer");
		btnAddCustomer.setIcon(new ImageIcon(AddCustomer.class.getResource("/pkg/images/addcus.png")));
		btnAddCustomer.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		btnAddCustomer.setForeground(Color.WHITE);
		btnAddCustomer.setFont(new Font("Century Gothic", Font.BOLD, 14));
		btnAddCustomer.setBackground(Color.RED);
		btnAddCustomer.setBounds(192, 396, 346, 47);
		add(btnAddCustomer);
			
	}
}
