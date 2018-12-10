package pkg.Views;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JTable;
import javax.swing.JTextArea;
import javax.swing.table.DefaultTableModel;
import javax.swing.JScrollBar;
import javax.swing.JScrollPane;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.ImageIcon;

public class SaleView extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTable table;


	/**
	 * Create the frame.
	 */
	public SaleView() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 980, 504);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setUndecorated(true);
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(0, 0, 980, 10);
		panel.setBackground(Color.RED);
		contentPane.add(panel);
		
		textField = new JTextField();
		textField.setBounds(103, 183, 547, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(103, 21, 214, 20);
		textField_1.setColumns(10);
		contentPane.add(textField_1);
		
		JTextArea textArea = new JTextArea();
		textArea.setBounds(103, 115, 547, 43);
		contentPane.add(textArea);
		
		textField_2 = new JTextField();
		textField_2.setBounds(436, 21, 214, 20);
		contentPane.add(textField_2);
		textField_2.setColumns(10);
		
		textField_3 = new JTextField();
		textField_3.setBounds(103, 66, 214, 20);
		textField_3.setColumns(10);
		contentPane.add(textField_3);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(103, 228, 867, 249);
		contentPane.add(scrollPane);
		
		table = new JTable();
		table.setModel(new DefaultTableModel(
			new Object[][] {
				{null, null, null, null, null, null},
			},
			new String[] {
				"Item #", "Product Name", "Unit Price", "Quantity", "Cost", "Edit"
			}
		) {
			boolean[] columnEditables = new boolean[] {
				false, false, false, true, false, false
			};
			public boolean isCellEditable(int row, int column) {
				return columnEditables[column];
			}
		});
		table.getColumnModel().getColumn(0).setResizable(false);
		table.getColumnModel().getColumn(0).setPreferredWidth(47);
		table.getColumnModel().getColumn(1).setResizable(false);
		table.getColumnModel().getColumn(1).setPreferredWidth(307);
		table.getColumnModel().getColumn(2).setResizable(false);
		table.getColumnModel().getColumn(3).setResizable(false);
		table.getColumnModel().getColumn(4).setResizable(false);
		table.getColumnModel().getColumn(4).setPreferredWidth(73);
		table.getColumnModel().getColumn(5).setResizable(false);
		table.getColumnModel().getColumn(5).setPreferredWidth(43);
		table.setFillsViewportHeight(true);
		table.setColumnSelectionAllowed(true);
		table.setCellSelectionEnabled(true);
		scrollPane.setViewportView(table);
		
		JLabel lblTotal = new JLabel("TOTAL");
		lblTotal.setForeground(Color.RED);
		lblTotal.setBackground(Color.WHITE);
		lblTotal.setFont(new Font("MS Gothic", Font.BOLD, 19));
		lblTotal.setBounds(725, 28, 71, 43);
		contentPane.add(lblTotal);
		
		JLabel label = new JLabel("0.00");
		label.setForeground(Color.RED);
		label.setFont(new Font("MS Gothic", Font.BOLD, 19));
		label.setBounds(829, 28, 71, 43);
		contentPane.add(label);
		
		JLabel lblCustomerName = new JLabel("Name");
		lblCustomerName.setFont(new Font("Microsoft Sans Serif", Font.BOLD, 13));
		lblCustomerName.setBounds(10, 23, 83, 14);
		contentPane.add(lblCustomerName);
		
		JLabel lblPhone = new JLabel("Phone #");
		lblPhone.setFont(new Font("Microsoft Sans Serif", Font.BOLD, 13));
		lblPhone.setBounds(10, 69, 83, 14);
		contentPane.add(lblPhone);
		
		JLabel lblEmail = new JLabel("Email");
		lblEmail.setFont(new Font("Microsoft Sans Serif", Font.BOLD, 13));
		lblEmail.setBounds(347, 24, 83, 14);
		contentPane.add(lblEmail);
		
		JLabel lblAddress = new JLabel("Address");
		lblAddress.setFont(new Font("Microsoft Sans Serif", Font.BOLD, 13));
		lblAddress.setBounds(10, 120, 83, 14);
		contentPane.add(lblAddress);
		
		JLabel lblProduct = new JLabel("Product");
		lblProduct.setFont(new Font("Microsoft Sans Serif", Font.BOLD, 13));
		lblProduct.setBounds(10, 186, 83, 14);
		contentPane.add(lblProduct);
		
		JButton btnAddOrder = new JButton("Add Order");
		btnAddOrder.setForeground(Color.WHITE);
		btnAddOrder.setFont(new Font("Century Gothic", Font.BOLD, 14));
		btnAddOrder.setBackground(Color.RED);
		btnAddOrder.setBounds(725, 82, 245, 121);
		contentPane.add(btnAddOrder);
		
		JButton button = new JButton("");
		button.setIcon(new ImageIcon(SaleView.class.getResource("/pkg/images/minmizeImage.png")));
		button.setBackground(Color.WHITE);
		button.setBounds(914, 15, 33, 26);
		contentPane.add(button);
		
		JButton button_1 = new JButton("");
		button_1.setIcon(new ImageIcon(SaleView.class.getResource("/pkg/images/closeImage.png")));
		button_1.setBackground(Color.WHITE);
		button_1.setBounds(947, 15, 33, 26);
		contentPane.add(button_1);
	}
}
