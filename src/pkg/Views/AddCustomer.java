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
import org.eclipse.wb.swing.FocusTraversalOnArray;
import java.awt.Component;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class AddCustomer extends JPanel {
	private JTextField nameBox;
	private JButton btnAddCustomer;
	
	private JTextArea addressBox;
	private JTextField phoneNumber;

	/**
	 * Create the panel.
	 */
	public JButton getBtnAddCustomer() {
		return btnAddCustomer;
	}
	
	public void setFocus() {
		nameBox.grabFocus();
	}
	public JTextField getNameBox() {
		return nameBox;
	}
	public JTextField getPhoneNumber() {
		return phoneNumber;
	}
	public JTextArea getAddressBox() {
		return addressBox;
	}
	public AddCustomer() {
		setFont(new Font("Comic Sans MS", Font.PLAIN, 12));
		setForeground(Color.BLACK);
		setBackground(Color.WHITE);
		
		setLayout(null);
		
		JPanel slider = new JPanel();
		slider.setBackground(Color.RED);
		slider.setBounds(0, 15, 10, 53);
		add(slider);

		
		JPanel namePanel = new JPanel();
		
		namePanel.setBackground(Color.WHITE);
		namePanel.setBounds(10, 80, 787, 53);
		add(namePanel);
		namePanel.setLayout(null);
		
		nameBox = new JTextField();
		nameBox.addFocusListener(new FocusAdapter() {
			@Override
			public void focusGained(FocusEvent e) {
				slider.setVisible(true);
				slider.setBounds(0, 80, 10, 53);
				namePanel.setBackground(new Color(255, 204, 204));
			}
			@Override
			public void focusLost(FocusEvent e) {
				slider.setVisible(false);
				namePanel.setBackground(Color.WHITE);
			}
		});
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
		phoneNumber.addFocusListener(new FocusAdapter() {
			@Override
			public void focusGained(FocusEvent e) {
				slider.setVisible(true);
				slider.setBounds(0, 144, 10, 53);
				phonePanel.setBackground(new Color(255, 204, 204));
			}
			@Override
			public void focusLost(FocusEvent e) {
				slider.setVisible(false);
				phonePanel.setBackground(Color.WHITE);
			}
		});
		phoneNumber.setBounds(85, 11, 692, 28);
		
		phonePanel.add(phoneNumber);
		
		
		
		
		
		
		JLabel lblPhone = new JLabel("Phone#");
		lblPhone.setFont(new Font("Century Gothic", Font.BOLD, 12));
		lblPhone.setBounds(10, 17, 65, 14);
		phonePanel.add(lblPhone);
		
		JPanel addressPanel = new JPanel();
		addressPanel.setLayout(null);
		addressPanel.setBackground(Color.WHITE);
		addressPanel.setBounds(10, 218, 787, 153);
		add(addressPanel);
		
		JLabel lblAddress = new JLabel("Address");
		lblAddress.setFont(new Font("Century Gothic", Font.BOLD, 12));
		lblAddress.setBounds(10, 17, 65, 14);
		addressPanel.add(lblAddress);
		btnAddCustomer = new JButton("Add Customer");
		btnAddCustomer.setIcon(new ImageIcon(AddCustomer.class.getResource("/pkg/images/addcus.png")));
		btnAddCustomer.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		addressBox = new JTextArea();
		addressBox.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				 if (e.getKeyCode() == KeyEvent.VK_TAB) {
	                   nameBox.grabFocus();
	                    e.consume();
	                }
			}
		});
		addressBox.addFocusListener(new FocusAdapter() {
			@Override
			public void focusGained(FocusEvent e) {
				slider.setVisible(true);
				slider.setBounds(0, 218, 10, 153);
				addressPanel.setBackground(new Color(255, 204, 204));
			}
			@Override
			public void focusLost(FocusEvent e) {
				slider.setVisible(false);
				addressPanel.setBackground(Color.WHITE);
			}
		});
		addressBox.setBounds(85, 13, 692, 129);
		addressPanel.add(addressBox);
		Border border = BorderFactory.createLineBorder(Color.GRAY);
		addressBox.setBorder(BorderFactory.createCompoundBorder(border, 
		            BorderFactory.createEmptyBorder(5, 5, 5, 5)));
		
		
		btnAddCustomer.setForeground(Color.WHITE);
		btnAddCustomer.setFont(new Font("Century Gothic", Font.BOLD, 14));
		btnAddCustomer.setBackground(Color.RED);
		btnAddCustomer.setBounds(192, 396, 346, 47);
		add(btnAddCustomer);
		setFocusTraversalPolicy(new FocusTraversalOnArray(new Component[]{nameBox, phoneNumber, addressBox}));
		
		
			
	}
}
