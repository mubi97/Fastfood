package pkg.Views;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JButton;
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
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.RED);
		panel.setBounds(0, 0, 999, 10);
		contentPane.add(panel);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(Color.RED);
		panel_1.setBounds(0, 0, 201, 616);
		contentPane.add(panel_1);
		panel_1.setLayout(null);
		
		JButton btnNewButton = new JButton("Admin Dashboard");
		btnNewButton.setBackground(Color.WHITE);
		btnNewButton.setForeground(Color.RED);
		btnNewButton.setBounds(0, 276, 201, 43);
		panel_1.add(btnNewButton);
		
		JButton button_2 = new JButton("Add New Customer");
		button_2.setBackground(Color.RED);
		button_2.setForeground(Color.WHITE);
		button_2.setBounds(0, 322, 201, 43);
		panel_1.add(button_2);
		
		JButton btnAddNewDeal = new JButton("Add New Deal");
		btnAddNewDeal.setBackground(Color.RED);
		btnAddNewDeal.setForeground(Color.WHITE);
		btnAddNewDeal.setBounds(0, 368, 201, 43);
		panel_1.add(btnAddNewDeal);
		
		JButton btnAddNewProduct = new JButton("Add New Product");
		btnAddNewProduct.setBackground(Color.RED);
		btnAddNewProduct.setForeground(Color.WHITE);
		btnAddNewProduct.setBounds(0, 415, 201, 43);
		panel_1.add(btnAddNewProduct);
		
		JButton btnAddNewOperator = new JButton("Add New Operator");
		btnAddNewOperator.setBackground(Color.RED);
		btnAddNewOperator.setForeground(Color.WHITE);
		btnAddNewOperator.setBounds(0, 460, 201, 43);
		panel_1.add(btnAddNewOperator);
		
		JButton btnAddNewAdmin = new JButton("Add New Admin");
		btnAddNewAdmin.setBackground(Color.RED);
		btnAddNewAdmin.setForeground(Color.WHITE);
		btnAddNewAdmin.setBounds(0, 507, 201, 43);
		panel_1.add(btnAddNewAdmin);
		
		JLabel lblAdminDashboard = new JLabel("Admin Panel");
		lblAdminDashboard.setForeground(Color.WHITE);
		lblAdminDashboard.setFont(new Font("Microsoft Sans Serif", Font.BOLD, 14));
		lblAdminDashboard.setHorizontalAlignment(SwingConstants.CENTER);
		lblAdminDashboard.setBounds(0, 215, 201, 50);
		panel_1.add(lblAdminDashboard);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBackground(Color.WHITE);
		panel_2.setBounds(0, 10, 202, 199);
		panel_1.add(panel_2);
		
		JLabel label = new JLabel("");
		panel_2.add(label);
		label.setBackground(Color.WHITE);
		label.setIcon(new ImageIcon(AdminPanelView.class.getResource("/pkg/images/logo.png")));
	}

}
