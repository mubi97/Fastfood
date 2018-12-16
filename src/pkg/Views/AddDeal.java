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
import javax.swing.ImageIcon;
import org.eclipse.wb.swing.FocusTraversalOnArray;
import java.awt.Component;

public class AddDeal extends JPanel {
	private JTextField productBox;
	private JTable producttable;
	private JTable Dealtable;

	/**
	 * Create the panel.
	 */
	public void setFocus() {
		productBox.grabFocus();
		
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
		
		productBox = new JTextField();
		
		productBox.setBounds(113, 11, 650, 28);
		productPanel.add(productBox);
		
		JLabel label = new JLabel("Product Name");
		label.setFont(new Font("Century Gothic", Font.BOLD, 12));
		label.setBounds(10, 17, 93, 14);
		productPanel.add(label);
		
		JLabel lblProductsInDeal = new JLabel("Products In Deal");
		lblProductsInDeal.setFont(new Font("Microsoft Sans Serif", Font.BOLD, 18));
		lblProductsInDeal.setHorizontalAlignment(SwingConstants.CENTER);
		lblProductsInDeal.setBounds(0, 75, 787, 14);
		panel.add(lblProductsInDeal);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(0, 100, 787, 122);
		panel.add(scrollPane);
		
		producttable = new JTable();
		producttable.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"Item#", "Product Name", "Unit Price", "Cost", "Edit"
			}
		));
		producttable.getColumnModel().getColumn(1).setPreferredWidth(275);
		producttable.getColumnModel().getColumn(2).setPreferredWidth(122);
		scrollPane.setViewportView(producttable);
		
		JButton btnAddDeal = new JButton("Add Deal");
		btnAddDeal.setIcon(new ImageIcon(AddDeal.class.getResource("/pkg/images/add-document.png")));
		btnAddDeal.setForeground(Color.WHITE);
		btnAddDeal.setFont(new Font("Century Gothic", Font.BOLD, 14));
		btnAddDeal.setBackground(Color.RED);
		btnAddDeal.setBounds(238, 236, 310, 41);
		panel.add(btnAddDeal);
		
		JLabel lblDeal = new JLabel("Deal Table");
		lblDeal.setFont(new Font("Microsoft Sans Serif", Font.BOLD, 15));
		lblDeal.setHorizontalAlignment(SwingConstants.CENTER);
		lblDeal.setBounds(0, 288, 787, 14);
		panel.add(lblDeal);
		
		JScrollPane scrollPane_1 = new JScrollPane();
		scrollPane_1.setBounds(0, 313, 788, 155);
		panel.add(scrollPane_1);
		
		Dealtable = new JTable();
		Dealtable.setModel(new DefaultTableModel(
			new Object[][] {
				{null, null, null, null},
			},
			new String[] {
				"Item#", "Deal Name", "Deal Price", "Edit"
			}
		));
		Dealtable.getColumnModel().getColumn(1).setPreferredWidth(397);
		scrollPane_1.setViewportView(Dealtable);
		

		JPanel slider = new JPanel();
		slider.setBackground(Color.RED);
		slider.setBounds(0, 11, 10, 53);
		panel.add(slider);
		setFocusTraversalPolicy(new FocusTraversalOnArray(new Component[]{productBox}));

	}
}
