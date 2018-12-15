package pkg.Views;

import javax.swing.JPanel;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JPasswordField;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ManageProduct extends JPanel {
	private JTextField productBox;
	private JTextField priceBox;
	private JTable table;

	/**
	 * Create the panel.
	 */
	public ManageProduct() {
		setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.WHITE);
		panel.setBounds(0, 0, 788, 468);
		add(panel);
		panel.setLayout(null);
		
		JPanel productPanel = new JPanel();
		productPanel.setLayout(null);
		productPanel.setBackground(new Color(255, 204, 204));
		productPanel.setBounds(10, 22, 777, 53);
		panel.add(productPanel);
		
		productBox = new JTextField();
		productBox.setBounds(113, 11, 650, 28);
		productPanel.add(productBox);
		
		JLabel lblProductname = new JLabel("Product Name");
		lblProductname.setFont(new Font("Century Gothic", Font.BOLD, 12));
		lblProductname.setBounds(10, 17, 93, 14);
		productPanel.add(lblProductname);
		
		JPanel pricePanel = new JPanel();
		pricePanel.setLayout(null);
		pricePanel.setBackground(Color.WHITE);
		pricePanel.setBounds(10, 86, 778, 53);
		panel.add(pricePanel);
		
		priceBox = new JTextField();
		priceBox.setBounds(113, 11, 650, 28);
		pricePanel.add(priceBox);
		
		JLabel lblUnitPrice = new JLabel("Unit Price");
		lblUnitPrice.setFont(new Font("Century Gothic", Font.BOLD, 12));
		lblUnitPrice.setBounds(10, 17, 93, 14);
		pricePanel.add(lblUnitPrice);
		
		
		JButton btnAddProduct = new JButton("Add Product");
		btnAddProduct.setIcon(new ImageIcon(ManageProduct.class.getResource("/pkg/images/add-document.png")));
		btnAddProduct.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		btnAddProduct.setForeground(Color.WHITE);
		btnAddProduct.setFont(new Font("Century Gothic", Font.BOLD, 14));
		btnAddProduct.setBackground(Color.RED);
		btnAddProduct.setBounds(199, 150, 346, 47);
		panel.add(btnAddProduct);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(0, 252, 788, 216);
		panel.add(scrollPane);
		
		table = new JTable();
		table.setModel(new DefaultTableModel(
			new Object[][] {
				{null, null, null, null},
			},
			new String[] {
				"Product ID", "Product Name", "Unit Price", "Edit"
			}
		));
		table.getColumnModel().getColumn(1).setPreferredWidth(397);
		scrollPane.setViewportView(table);
		JPanel sliderPanel = new JPanel();
		sliderPanel.setBounds(0, 22, 10, 53);
		panel.add(sliderPanel);
		sliderPanel.setBackground(Color.RED);

	}
}
