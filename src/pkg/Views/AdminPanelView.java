package pkg.Views;

import java.awt.BorderLayout;
import java.awt.EventQueue;

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

public class AdminPanelView extends JFrame {

	private JPanel contentPane;
	/**
	 * Create the frame.
	 */
	public AdminPanelView() {
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
		
		JButton button = new JButton("");
		button.setIcon(new ImageIcon(AdminPanelView.class.getResource("/pkg/images/minmizeImage.png")));
		button.setBackground(Color.WHITE);
		button.setBounds(923, 15, 33, 26);
		contentPane.add(button);
		
		JButton button_1 = new JButton("");
		button_1.setIcon(new ImageIcon(AdminPanelView.class.getResource("/pkg/images/closeImage.png")));
		button_1.setBackground(Color.WHITE);
		button_1.setBounds(956, 15, 33, 26);
		contentPane.add(button_1);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(Color.WHITE);
		panel_1.setBounds(0, 0, 201, 616);
		contentPane.add(panel_1);
		panel_1.setLayout(null);
		Border border = BorderFactory.createLineBorder(Color.RED);
		panel_1.setBorder(BorderFactory.createCompoundBorder(border, 
		            BorderFactory.createEmptyBorder(5, 5, 5, 5)));
		
		JButton btnAdminDashboard = new JButton("Admin Dashboard");
		btnAdminDashboard.setBackground(new Color(255, 204, 204));
		btnAdminDashboard.setForeground(Color.RED);
		btnAdminDashboard.setBounds(10, 276, 191, 43);
		panel_1.add(btnAdminDashboard);
		btnAdminDashboard.setBorder(BorderFactory.createCompoundBorder(border, 
	            BorderFactory.createEmptyBorder(5, 5, 5, 5)));
		JButton btnAddCustomer = new JButton("Add New Customer");
		btnAddCustomer.setBackground(Color.WHITE);
		btnAddCustomer.setForeground(Color.RED);
		btnAddCustomer.setBounds(10, 322, 191, 43);
		panel_1.add(btnAddCustomer);
		btnAddCustomer.setBorder(BorderFactory.createCompoundBorder(border, 
	            BorderFactory.createEmptyBorder(5, 5, 5, 5)));
		JButton btnAddDeal = new JButton("Add New Deal");
		btnAddDeal.setBackground(Color.WHITE);
		btnAddDeal.setForeground(Color.RED);
		btnAddDeal.setBounds(10, 368, 191, 43);
		panel_1.add(btnAddDeal);
		btnAddDeal.setBorder(BorderFactory.createCompoundBorder(border, 
	            BorderFactory.createEmptyBorder(5, 5, 5, 5)));
		JButton btnAddProduct = new JButton("Add New Product");
		btnAddProduct.setBackground(Color.WHITE);
		btnAddProduct.setForeground(Color.RED);
		btnAddProduct.setBounds(10, 415, 191, 43);
		panel_1.add(btnAddProduct);
		btnAddProduct.setBorder(BorderFactory.createCompoundBorder(border, 
	            BorderFactory.createEmptyBorder(5, 5, 5, 5)));
		JButton btnAddOperator = new JButton("Add New Operator");
		btnAddOperator.setBackground(Color.WHITE);
		btnAddOperator.setForeground(Color.RED);
		btnAddOperator.setBounds(10, 460, 191, 43);
		panel_1.add(btnAddOperator);
		btnAddOperator.setBorder(BorderFactory.createCompoundBorder(border, 
	            BorderFactory.createEmptyBorder(5, 5, 5, 5)));
		JButton btnAddAdmin = new JButton("Add New Admin");
		btnAddAdmin.setBackground(Color.WHITE);
		btnAddAdmin.setForeground(Color.RED);
		btnAddAdmin.setBounds(10, 507, 191, 43);
		panel_1.add(btnAddAdmin);
		btnAddAdmin.setBorder(BorderFactory.createCompoundBorder(border, 
	            BorderFactory.createEmptyBorder(5, 5, 5, 5)));
		
		JLabel lblAdminDashboard = new JLabel("Admin Panel");
		lblAdminDashboard.setForeground(Color.RED);
		lblAdminDashboard.setFont(new Font("Microsoft Sans Serif", Font.BOLD, 14));
		lblAdminDashboard.setHorizontalAlignment(SwingConstants.CENTER);
		lblAdminDashboard.setBounds(0, 215, 201, 50);
		panel_1.add(lblAdminDashboard);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBackground(Color.WHITE);
		panel_2.setBounds(10, 11, 181, 198);
		panel_1.add(panel_2);
		
		JLabel label = new JLabel("");
		panel_2.add(label);
		label.setBackground(Color.WHITE);
		label.setIcon(new ImageIcon(AdminPanelView.class.getResource("/pkg/images/logo.png")));
		
		JPanel slider = new JPanel();
		slider.setBounds(0, 276, 10, 43);
		panel_1.add(slider);
		slider.setBackground(Color.RED);
	}
}
