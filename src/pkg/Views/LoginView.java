package pkg.Views;

import java.awt.Color;
import java.awt.Component;
import java.awt.Font;
import java.awt.Frame;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.swing.JPasswordField;
import org.eclipse.wb.swing.FocusTraversalOnArray;

public class LoginView extends JFrame {
	private JTextField emailBox;
	private JButton btnClose;
	private JPasswordField passwordBox;
	private LoginController cont;

	
	public void setController(LoginController cont) {
		this.cont = cont;
	}

	/**
	 * Create the frame.
	 */
	public LoginView() {
		
		setFont(new Font("Comic Sans MS", Font.PLAIN, 12));
		setForeground(Color.WHITE);
		setTitle("Best Fast Food Restaurant");
		getContentPane().setBackground(Color.WHITE);
		getContentPane().setLayout(null);
		
		JPanel emailPanel = new JPanel();
		emailPanel.setBackground(Color.WHITE);
		emailPanel.setBounds(10, 256, 459, 78);
		getContentPane().add(emailPanel);
		emailPanel.setLayout(null);
		
		emailBox = new JTextField();
		
		emailBox.setFont(new Font("Century Gothic", Font.PLAIN, 12));
		emailBox.setBounds(62, 26, 387, 36);
		emailPanel.add(emailBox);
		emailBox.setColumns(10);
		
		JLabel lblEmail_1 = new JLabel("Email");
		lblEmail_1.setFont(new Font("Century Gothic", Font.BOLD, 12));
		lblEmail_1.setBounds(62, 11, 79, 14);
		emailPanel.add(lblEmail_1);
		
		JButton btnLogin = new JButton("Login");
		btnLogin.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				String email = emailBox.getText();
				String pass = passwordBox.getText();
				int flagError = 0;
				String msg = "Please Enter ";
				if (email.equals("")) {
					msg += "Email";
					flagError = 1;
				}
				if (pass.equals("")) {
					if(flagError == 1) {
						msg += " And ";
					}
					msg += "Password";
					
					flagError = 1;
				}
				if(flagError == 0) {
					
					String type = cont.checkType(email, pass);
					int id;
					String name  = "";
					String address = "";
					String email = "";
					String phoneNo = "";
					if(type.equals("Error")) {
						JOptionPane.showMessageDialog(new JFrame(), "Wrong Email or Password Entered", "Error", JOptionPane.ERROR_MESSAGE );
						return;
					}else if(type.equals("Admin")){
						id = cont.adminGetId();
						name = cont.adminGetName();
						address = cont.adminGetAddress();
						email = cont.adminGetEmail();
						phoneNo = cont.adminGetPhoneNo();
					}else {
						id = cont.OperatorGetId();
						name = cont.OperatorGetName();
						address = cont.OperatorGetAddress();
						email = cont.OperatorGetEmail();
						phoneNo = cont.OperatorGetPhoneNo();
					}
					JOptionPane.showMessageDialog(new JFrame(), "Welcome " + name + "\nYour ID: " + Integer.toString(id) + "\nYour Address: " + address + "\nYour Phone No: " + phoneNo + "\nYour Email: " + email + "\nYour Type: " + type, "Login Details", messageType);
					
					
				}else {
					JOptionPane.showMessageDialog(new JFrame(), msg, "Error", JOptionPane.ERROR_MESSAGE );
				}
			}
		});
		btnLogin.setForeground(Color.WHITE);
		btnLogin.setBackground(Color.RED);
		btnLogin.setFont(new Font("Century Gothic", Font.BOLD, 14));
		btnLogin.setIcon(new ImageIcon("C:\\Users\\mubas\\Downloads\\icons8-enter-32.png"));
		btnLogin.setBounds(306, 426, 130, 33);
		getContentPane().add(btnLogin);
		
		btnClose = new JButton("");
		btnClose.addMouseListener(new MouseAdapter() {
			
			@Override
			public void mousePressed(MouseEvent e) {
				System.exit(0);
			}
		});
		btnClose.setIcon(new ImageIcon("C:\\Users\\mubas\\Downloads\\icons8-shutdown-32.png"));
		btnClose.setBackground(Color.WHITE);
		btnClose.setBounds(436, 11, 33, 26);
		getContentPane().add(btnClose);
		
		JButton btnMinimize = new JButton("");
		btnMinimize.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				setState(Frame.ICONIFIED);
			}
			
		});
		btnMinimize.setIcon(new ImageIcon("C:\\Users\\mubas\\Downloads\\icons8-minimize-window-32.png"));
		btnMinimize.setBackground(Color.WHITE);
		btnMinimize.setBounds(403, 11, 33, 26);
		getContentPane().add(btnMinimize);
		
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
		
		JButton btnNewButton = new JButton("");
		btnNewButton.setBackground(Color.WHITE);
		btnNewButton.setIcon(new ImageIcon("D:\\fastFood\\logo.png"));
		btnNewButton.setBounds(85, 37, 288, 201);
		
		getContentPane().add(btnNewButton);
		
		JLabel lblEmail = new JLabel("Email");
		lblEmail.setBounds(72, 256, 46, 14);
		getContentPane().add(lblEmail);
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
}
