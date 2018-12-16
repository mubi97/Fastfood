package pkg.Views;

import java.awt.Color;
import java.awt.Component;
import java.awt.Font;
import java.awt.Frame;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.Border;

import java.awt.event.ActionListener;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.swing.JPasswordField;
import pkg.Controllers.*;
import org.eclipse.wb.swing.FocusTraversalOnArray;
import java.awt.event.ActionEvent;

public class LoginView extends JFrame {
	private JTextField emailBox;
	private JButton btnClose;
	private JPasswordField passwordBox;
	//private LoginController cont;
	private JButton btnLogin;
	private JTextField emailbox;
	private JTextField passwordbox;
	/*
	public void setController(LoginController cont) {
		this.cont = cont;
	}
*/
	/**
	 * Create the frame.
	 */
	public LoginView() {
		
		setFont(new Font("Comic Sans MS", Font.PLAIN, 12));
		setForeground(Color.WHITE);
		setTitle("Best Fast Food Restaurant");
		getContentPane().setBackground(Color.WHITE);
		getContentPane().setLayout(null);
		Border border = BorderFactory.createLineBorder(Color.WHITE);
		JPanel emailPanel = new JPanel();
		emailPanel.setBackground(Color.WHITE);
		emailPanel.setBounds(10, 256, 459, 78);
		getContentPane().add(emailPanel);
		emailPanel.setLayout(null);
		
		emailBox = new JTextField();
		emailBox.setText("mubashirasaad@hotmail.com");
		
		emailBox.setFont(new Font("Century Gothic", Font.PLAIN, 12));
		emailBox.setBounds(62, 26, 387, 36);
		emailPanel.add(emailBox);
		emailBox.setColumns(10);
		
		JLabel lblEmail_1 = new JLabel("Email");
		lblEmail_1.setFont(new Font("Century Gothic", Font.BOLD, 12));
		lblEmail_1.setBounds(62, 11, 79, 14);
		emailPanel.add(lblEmail_1);
		
		btnLogin = new JButton("Login");
//		btnLogin.addActionListener(new ActionListener() {
//			public void actionPerformed(ActionEvent e) {
//			}
//		});
//		btnLogin.addMouseListener(new MouseAdapter() {
//			@Override
//			public void mousePressed(MouseEvent e) {
//			}
//		});
		btnLogin.setForeground(Color.WHITE);
		btnLogin.setBackground(Color.RED);
		btnLogin.setFont(new Font("Century Gothic", Font.BOLD, 14));
		btnLogin.setIcon(new ImageIcon(LoginView.class.getResource("/pkg/images/icons8-enter-32.png")));
		btnLogin.setBounds(306, 426, 130, 33);
		getContentPane().add(btnLogin);
		
		btnClose = new JButton("");
		btnClose.addMouseListener(new MouseAdapter() {
			
			@Override
			public void mousePressed(MouseEvent e) {
				System.exit(0);
			}
		});
		btnClose.setIcon(new ImageIcon(LoginView.class.getResource("/pkg/images/closeImage.png")));
		btnClose.setBackground(Color.WHITE);
		btnClose.setBounds(436, 11, 33, 26);
		getContentPane().add(btnClose);
		btnClose.setBorder(BorderFactory.createCompoundBorder(border, 
	            BorderFactory.createEmptyBorder(5, 5, 5, 5)));
		JButton btnMinimize = new JButton("");
		btnMinimize.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				setState(Frame.ICONIFIED);
			}
			
		});
		btnMinimize.setIcon(new ImageIcon(LoginView.class.getResource("/pkg/images/minmizeImage.png")));
		btnMinimize.setBackground(Color.WHITE);
		btnMinimize.setBounds(403, 11, 33, 26);
		getContentPane().add(btnMinimize);
		btnMinimize.setBorder(BorderFactory.createCompoundBorder(border, 
	            BorderFactory.createEmptyBorder(5, 5, 5, 5)));
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(Color.RED);
		panel_1.setBounds(0, 0, 469, 10);
		getContentPane().add(panel_1);
		
		JPanel passwordPanel = new JPanel();
		passwordPanel.setBackground(Color.WHITE);
		passwordPanel.setBounds(10, 334, 459, 78);
		getContentPane().add(passwordPanel);
		passwordPanel.setLayout(null);
		
		JLabel lblPassword = new JLabel("Password");
		lblPassword.setFont(new Font("Century Gothic", Font.BOLD, 12));
		lblPassword.setBounds(62, 11, 79, 14);
		passwordPanel.add(lblPassword);
		
		passwordBox = new JPasswordField();
		
		passwordBox.setBounds(62, 29, 387, 36);
		passwordPanel.add(passwordBox);
		
		JPanel sliderPanel = new JPanel();
		sliderPanel.setBackground(Color.RED);
		sliderPanel.setBounds(0, 256, 10, 78);
		getContentPane().add(sliderPanel);
		
		JLabel lblEmail = new JLabel("Email");
		lblEmail.setBounds(72, 256, 46, 14);
		getContentPane().add(lblEmail);
		
		JLabel label = new JLabel("");
		label.setIcon(new ImageIcon(LoginView.class.getResource("/pkg/images/logo.png")));
		label.setBounds(132, 32, 202, 199);
		getContentPane().add(label);
		setBounds(100, 100, 469, 494);
		setUndecorated(true);
		setFocusTraversalPolicy(new FocusTraversalOnArray(new Component[]{emailBox, passwordBox}));
		getRootPane().setWindowDecorationStyle(JFrame.DO_NOTHING_ON_CLOSE);
		emailBox.addFocusListener(new FocusAdapter() {
			@Override
			public void focusGained(FocusEvent e) {
				emailPanel.setBackground(new Color(255, 204, 204));
				sliderPanel.setLocation(0, 256);
				sliderPanel.setBackground(new Color(255, 0, 0));
			}
			@Override
			public void focusLost(FocusEvent e) {
				emailPanel.setBackground(new Color(255, 255, 255));
				sliderPanel.setBackground(new Color(255, 255, 255));
				sliderPanel.setBackground(new Color(255, 255, 255));
			}
		});
		passwordBox.addFocusListener(new FocusAdapter() {
			@Override
			public void focusGained(FocusEvent e) {
				passwordPanel.setBackground(new Color(255, 204, 204));
				
				sliderPanel.setLocation(0, 334);
				sliderPanel.setBackground(new Color(255, 0, 0));
			}
			@Override
			public void focusLost(FocusEvent e) {
				passwordPanel.setBackground(new Color(255, 255, 255));
				sliderPanel.setBackground(new Color(255, 255, 255));
			}
		});
		addWindowListener(new WindowAdapter() {
			@Override
			public void windowOpened(WindowEvent e) {
				emailBox.grabFocus();
			}
		});
		
		
	}
	
	public void setActionListener(ActionListener a) {
		btnLogin.addActionListener(a);
	}
	
	public JTextField getEmailBox() {
		return emailBox;
	}
	
	public JTextField getPasswordBox() {
		return passwordBox;
	}
}
