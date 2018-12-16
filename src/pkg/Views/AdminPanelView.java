package pkg.Views;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.Border;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JButton;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.Frame;

import javax.swing.JTextField;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;


public class AdminPanelView extends JFrame {

	private JPanel contentPane;
	private JLabel txtMainHeading;
	private JPanel contentPanel;
	private JButton btnLogOut;
	private AddCustomer addCustomer;
	private ManageProduct manageProduct;
	private String userName;
	/**
	 * Create the frame.
	 */
	public void setName(String userName) {
		this.userName = userName;
		btnLogOut.setText(userName);
	}
	public void setAddCustomer() {
		
		contentPanel.removeAll();
		contentPanel.setVisible(false);
		txtMainHeading.setText("Add New Customer");
		contentPanel.add(addCustomer);
		contentPanel.setVisible(true);
		addCustomer.setFocus();
	}
	public void setManageProducts() {
		contentPanel.removeAll();
		contentPanel.setVisible(false);
		contentPanel.add(manageProduct);
		txtMainHeading.setText("Manage Products");
		contentPanel.setVisible(true);
		manageProduct.setFocus();

		
	}
	public AdminPanelView() {
		addCustomer = new AddCustomer();
		addCustomer.setBounds(0, 0, 797, 468);
		manageProduct = new ManageProduct();
		manageProduct.setBounds(0, 0, 797, 468);
		Border border2 = BorderFactory.createLineBorder(Color.WHITE);
		Border border = BorderFactory.createLineBorder(Color.RED);
		setBackground(Color.GREEN);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 999, 616);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		setUndecorated(true);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.RED);
		panel.setBounds(0, 0, 999, 10);
		contentPane.add(panel);
		
		JButton btnMinimize = new JButton("");
		btnMinimize.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				setState(Frame.ICONIFIED);
			}
		});
		btnMinimize.setIcon(new ImageIcon(AdminPanelView.class.getResource("/pkg/images/minmizeImage.png")));
		btnMinimize.setBackground(Color.WHITE);
		btnMinimize.setBounds(923, 15, 33, 26);
		contentPane.add(btnMinimize);
		btnMinimize.setBorder(BorderFactory.createCompoundBorder(border2, 
	            BorderFactory.createEmptyBorder(5, 5, 5, 5)));
		
		JButton btnClose = new JButton("");
		btnClose.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				System.exit(0);
			}
		});
		btnClose.setIcon(new ImageIcon(AdminPanelView.class.getResource("/pkg/images/closeImage.png")));
		btnClose.setBackground(Color.WHITE);
		btnClose.setBounds(956, 15, 33, 26);
		contentPane.add(btnClose);
		btnClose.setBorder(BorderFactory.createCompoundBorder(border2, 
	            BorderFactory.createEmptyBorder(5, 5, 5, 5)));
		JPanel sidePanel = new JPanel();
		sidePanel.setBackground(Color.WHITE);
		sidePanel.setBounds(0, 0, 201, 616);
		contentPane.add(sidePanel);
		sidePanel.setLayout(null);
		sidePanel.setBorder(BorderFactory.createCompoundBorder(border, 
		            BorderFactory.createEmptyBorder(5, 5, 5, 5)));
		
		JButton btnAdminDashboard = new JButton("Admin Dashboard");
		btnAdminDashboard.setBackground(new Color(255, 204, 204));
		btnAdminDashboard.setForeground(Color.RED);
		btnAdminDashboard.setBounds(10, 276, 191, 43);
		sidePanel.add(btnAdminDashboard);
		btnAdminDashboard.setBorder(BorderFactory.createCompoundBorder(border, 
	            BorderFactory.createEmptyBorder(5, 5, 5, 5)));
		JButton btnAddCustomer = new JButton("Add New Customer");
		
		btnAddCustomer.setBackground(Color.WHITE);
		btnAddCustomer.setForeground(Color.RED);
		btnAddCustomer.setBounds(10, 322, 191, 43);
		sidePanel.add(btnAddCustomer);
		btnAddCustomer.setBorder(BorderFactory.createCompoundBorder(border, 
	            BorderFactory.createEmptyBorder(5, 5, 5, 5)));
		JButton btnManageDeals = new JButton("Manage Deals");
		btnManageDeals.setBackground(Color.WHITE);
		btnManageDeals.setForeground(Color.RED);
		btnManageDeals.setBounds(10, 368, 191, 43);
		sidePanel.add(btnManageDeals);
		btnManageDeals.setBorder(BorderFactory.createCompoundBorder(border, 
	            BorderFactory.createEmptyBorder(5, 5, 5, 5)));
		JButton btnManageProducts = new JButton("Manage Products");
		btnManageProducts.setBackground(Color.WHITE);
		btnManageProducts.setForeground(Color.RED);
		btnManageProducts.setBounds(10, 415, 191, 43);
		sidePanel.add(btnManageProducts);
		btnManageProducts.setBorder(BorderFactory.createCompoundBorder(border, 
	            BorderFactory.createEmptyBorder(5, 5, 5, 5)));
		JButton btnManageUsers = new JButton("Manage Users");
		btnManageUsers.setBackground(Color.WHITE);
		btnManageUsers.setForeground(Color.RED);
		btnManageUsers.setBounds(10, 460, 191, 43);
		sidePanel.add(btnManageUsers);
		btnManageUsers.setBorder(BorderFactory.createCompoundBorder(border, 
	            BorderFactory.createEmptyBorder(5, 5, 5, 5)));
		
		JLabel lblAdminDashboard = new JLabel("Admin Panel");
		lblAdminDashboard.setForeground(Color.RED);
		lblAdminDashboard.setFont(new Font("Microsoft Sans Serif", Font.BOLD, 14));
		lblAdminDashboard.setHorizontalAlignment(SwingConstants.CENTER);
		lblAdminDashboard.setBounds(0, 215, 201, 50);
		sidePanel.add(lblAdminDashboard);
		
		JPanel slider = new JPanel();
		slider.setBounds(0, 276, 10, 43);
		sidePanel.add(slider);
		slider.setBackground(Color.RED);
		
		btnAddCustomer.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				btnAdminDashboard.setBackground(Color.WHITE);
				btnManageDeals.setBackground(Color.WHITE);
				btnManageUsers.setBackground(Color.WHITE);
				btnManageAdmins.setBackground(Color.WHITE);
				btnManageProducts.setBackground(Color.WHITE);
				btnAddCustomer.setBackground(new Color(255, 204, 204));
				slider.setLocation(0, 322);
				setAddCustomer();
				
			}
		});
		
		btnManageProducts.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				btnAdminDashboard.setBackground(Color.WHITE);
				btnManageDeals.setBackground(Color.WHITE);
				btnManageUsers.setBackground(Color.WHITE);
				btnManageAdmins.setBackground(Color.WHITE);
				btnAddCustomer.setBackground(Color.WHITE);
				btnManageProducts.setBackground(new Color(255, 204, 204));
				slider.setLocation(0, 415);
				setManageProducts();
				
			}
		});
		
		
		JPanel imgPanel = new JPanel();
		imgPanel.setBackground(Color.WHITE);
		imgPanel.setBounds(10, 11, 181, 198);
		sidePanel.add(imgPanel);
		
		JLabel label = new JLabel("");
		imgPanel.add(label);
		label.setBackground(Color.WHITE);
		label.setIcon(new ImageIcon(AdminPanelView.class.getResource("/pkg/images/logo.png")));
		
		
		
		contentPanel = new JPanel();
		contentPanel.setBackground(Color.WHITE);
		contentPanel.setBounds(202, 148, 797, 468);
		contentPane.add(contentPanel);
		contentPanel.setLayout(null);
		
		
		
		txtMainHeading = new JLabel();
		txtMainHeading.setHorizontalAlignment(SwingConstants.CENTER);
		txtMainHeading.setForeground(Color.RED);
		txtMainHeading.setFont(new Font("Microsoft Sans Serif", Font.BOLD, 18));
		txtMainHeading.setText("Add Customer");
		txtMainHeading.setBounds(202, 94, 797, 43);
		contentPane.add(txtMainHeading);
		
		btnLogOut = new JButton((String) null);
		btnLogOut.setIcon(new ImageIcon(AdminPanelView.class.getResource("/pkg/images/avatar.png")));
		btnLogOut.setForeground(Color.RED);
		btnLogOut.setBackground(Color.WHITE);
		btnLogOut.setBounds(742, 15, 174, 26);
		contentPane.add(btnLogOut);
	}
}
