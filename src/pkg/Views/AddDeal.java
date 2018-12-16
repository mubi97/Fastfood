package pkg.Views;

import javax.swing.JPanel;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.JButton;
import javax.swing.ComboBoxModel;
import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import org.eclipse.wb.swing.FocusTraversalOnArray;
import java.awt.Component;
import javax.swing.JComboBox;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class AddDeal extends JPanel {
	private JTable producttable;
	private JTable Dealtable;
	private DefaultComboBoxModel model;
	private DefaultTableModel model2;
	private DefaultTableModel model3;
	private JTextField quantityBox;
	private JButton btnAddProduct;
	private JButton btnAddDeal;
	private JComboBox productDrop;
	private JTextField PriceBox;
	private JTextField dealName;

	/**
	 * Create the panel.
	 */
	public void setFocus() {
//		productBox.grabFocus();
		
	}
	public JTextField getQuantity() {
		return this.quantityBox;
	}
	public JComboBox getProduct() {
		return this.productDrop;
	}
	public JTextField getDealName() {
		return this.dealName;
	}
	public JTextField getPrice() {
		return this.PriceBox;
	}
	public DefaultComboBoxModel getModel() {
		return this.model;
	}
	public JButton getBtnData() {
		return this.btnAddProduct;
	}
	public JButton getBtnDeal() {
		return this.btnAddDeal;
	}
	public DefaultTableModel getModel3() {
		return this.model3;
	}
	public DefaultTableModel getModel2() {
		return this.model2;
	}
	public AddDeal() {
		setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.WHITE);
		panel.setBounds(0, 0, 797, 468);
		add(panel);
		panel.setLayout(null);
		
		JPanel productPanel = new JPanel();
		productPanel.setLayout(null);
		productPanel.setBackground(new Color(255, 204, 204));
		productPanel.setBounds(10, 11, 777, 53);
		panel.add(productPanel);
		
		JLabel label = new JLabel("Product Name");
		label.setFont(new Font("Century Gothic", Font.BOLD, 12));
		label.setBounds(10, 17, 93, 14);
		productPanel.add(label);
		
		productDrop = new JComboBox();
		productDrop.setBounds(113, 15, 130, 20);
		productPanel.add(productDrop);
		model = new DefaultComboBoxModel<String>();
		productDrop.setModel(model);
		
		JLabel lblQuantity = new JLabel("Quantity");
		lblQuantity.setFont(new Font("Century Gothic", Font.BOLD, 12));
		lblQuantity.setBounds(279, 18, 93, 14);
		productPanel.add(lblQuantity);
		
		quantityBox = new JTextField();
		quantityBox.setBounds(345, 15, 124, 20);
		productPanel.add(quantityBox);
		quantityBox.setColumns(10);
		
		btnAddProduct = new JButton("Add Product");
		
		btnAddProduct.setForeground(Color.WHITE);
		btnAddProduct.setFont(new Font("Century Gothic", Font.BOLD, 14));
		btnAddProduct.setBackground(Color.RED);
		btnAddProduct.setBounds(514, 11, 157, 24);
		productPanel.add(btnAddProduct);
		
		JLabel lblProductsInDeal = new JLabel("Products In Deal");
		lblProductsInDeal.setFont(new Font("Microsoft Sans Serif", Font.BOLD, 18));
		lblProductsInDeal.setHorizontalAlignment(SwingConstants.CENTER);
		lblProductsInDeal.setBounds(0, 75, 787, 14);
		panel.add(lblProductsInDeal);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(0, 100, 787, 122);
		panel.add(scrollPane);
		
		producttable = new JTable();
		model3 = new DefaultTableModel(
				new Object[][] {
				},
				new String[] {
					"Item#", "Product Name", "Unit Price", "Cost", "Quantity", "Edit"
				}
			);
		producttable.setModel(model3);
		producttable.getColumnModel().getColumn(1).setPreferredWidth(275);
		producttable.getColumnModel().getColumn(2).setPreferredWidth(122);
		scrollPane.setViewportView(producttable);
		
		JLabel lblDeal = new JLabel("Deal Table");
		lblDeal.setFont(new Font("Microsoft Sans Serif", Font.BOLD, 15));
		lblDeal.setHorizontalAlignment(SwingConstants.CENTER);
		lblDeal.setBounds(0, 288, 787, 14);
		panel.add(lblDeal);
		
		JScrollPane scrollPane_1 = new JScrollPane();
		scrollPane_1.setBounds(0, 313, 788, 155);
		panel.add(scrollPane_1);
		
		Dealtable = new JTable();
		model2 = new DefaultTableModel(
				new Object[][] {
					
				},
				new String[] {
					"Item#", "Deal Name", "Deal Price",  "Edit"
				}
			);
		Dealtable.setModel(model2);
		Dealtable.getColumnModel().getColumn(0).setResizable(false);
		Dealtable.getColumnModel().getColumn(1).setResizable(false);
		Dealtable.getColumnModel().getColumn(1).setPreferredWidth(397);
		Dealtable.getColumnModel().getColumn(2).setResizable(false);
		Dealtable.getColumnModel().getColumn(3).setResizable(false);
		scrollPane_1.setViewportView(Dealtable);
		

		JPanel slider = new JPanel();
		slider.setBackground(Color.RED);
		slider.setBounds(0, 11, 10, 53);
		panel.add(slider);
		
		JPanel dealPanel = new JPanel();
		dealPanel.setLayout(null);
		dealPanel.setBackground(new Color(255, 204, 204));
		dealPanel.setBounds(10, 233, 777, 45);
		panel.add(dealPanel);
		
		JLabel lblDealName = new JLabel("Deal Name");
		lblDealName.setFont(new Font("Century Gothic", Font.BOLD, 12));
		lblDealName.setBounds(10, 17, 93, 14);
		dealPanel.add(lblDealName);
		
		JLabel lblPrice = new JLabel("Price");
		lblPrice.setFont(new Font("Century Gothic", Font.BOLD, 12));
		lblPrice.setBounds(279, 17, 87, 14);
		dealPanel.add(lblPrice);
		
		PriceBox = new JTextField();
		PriceBox.setColumns(10);
		PriceBox.setBounds(329, 15, 165, 20);
		dealPanel.add(PriceBox);
		
		 btnAddDeal = new JButton("Add Deal");
		btnAddDeal.setForeground(Color.WHITE);
		btnAddDeal.setFont(new Font("Century Gothic", Font.BOLD, 14));
		btnAddDeal.setBackground(Color.RED);
		btnAddDeal.setBounds(514, 11, 157, 24);
		dealPanel.add(btnAddDeal);
		
		dealName = new JTextField();
		dealName.setColumns(10);
		dealName.setBounds(87, 15, 171, 20);
		dealPanel.add(dealName);

	}
}
