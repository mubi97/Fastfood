package pkg.Views;

import java.awt.Color;
import java.awt.Font;
import java.awt.Frame;

import javax.swing.BorderFactory;
import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.border.Border;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;
import javax.swing.text.MaskFormatter;
import javax.swing.SwingConstants;
import java.awt.CardLayout;
import javax.swing.JSlider;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JSeparator;
import javax.swing.JFormattedTextField;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import javax.swing.JComboBox;

public class SaleView extends JFrame {

	private JPanel contentPane;
	private JTextField textName;
	private JTextField textPhone;
	private JTextArea textAddress;
	private JButton btnCheckout;
	private JTable table;
	private JButton btnLogOut;
	private CardLayout cardLayout;
	private JComboBox textProduct;
	private JTextField textQuantity;
	private String userName;
	private JLabel totalPrice;
	private DefaultComboBoxModel model2;
	public JLabel getTotalPrice() {
		return this.totalPrice;
	}
	public DefaultComboBoxModel getModel2() {
		return this.model2;
	}
	public void setName(String userName) {
		this.userName = userName;
		btnLogOut.setText(userName);
	}
	public JTable getTable() {
		return table;
	}
	public  JTextField getTextName() {
		return textName;
	}
	public JTextField getTextPhone() {
		return textPhone;
	}
	public JTextArea getTextAddress() {
		return textAddress;
	}
	public JComboBox getTextProduct() {
		return textProduct;
	}
	public JTextField getTextQuantity() {
		return textQuantity;
	}
	public JButton getBtnCheckout() {
		return btnCheckout;
	}
	/**
	 * Create the frame.
	 */
	public SaleView() {
		model2 = new DefaultComboBoxModel();
		Border border2 = BorderFactory.createLineBorder(Color.WHITE);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1277, 594);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setUndecorated(true);
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel topBorder = new JPanel();
		topBorder.setBounds(0, 0, 1277, 10);
		topBorder.setBackground(Color.RED);
		contentPane.add(topBorder);
		Border border = BorderFactory.createLineBorder(Color.GRAY);
		
		JButton button = new JButton("");
		button.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				setState(Frame.ICONIFIED);
			}
		});
		button.setBounds(1201, 21, 33, 26);
		button.setIcon(new ImageIcon(SaleView.class.getResource("/pkg/images/minmizeImage.png")));
		button.setBackground(Color.WHITE);
		contentPane.add(button);
		
		JButton button_1 = new JButton("");
		button_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				System.exit(0);
			}
		});
		button_1.setBounds(1234, 21, 33, 26);
		button_1.setIcon(new ImageIcon(SaleView.class.getResource("/pkg/images/closeImage.png")));
		button_1.setBackground(Color.WHITE);
		contentPane.add(button_1);
		button.setBorder(BorderFactory.createCompoundBorder(border2, 
	            BorderFactory.createEmptyBorder(5, 5, 5, 5)));
		button_1.setBorder(BorderFactory.createCompoundBorder(border2, 
	            BorderFactory.createEmptyBorder(5, 5, 5, 5)));
		
		JPanel panelCreateSale = new JPanel();
		panelCreateSale.setBackground(Color.WHITE);
		panelCreateSale.setBounds(288, 87, 989, 507);
		contentPane.add(panelCreateSale);
		panelCreateSale.setLayout(null);
		
		textName = new JTextField();
		textName.setColumns(10);
		textName.setBounds(103, 15, 214, 20);
		panelCreateSale.add(textName);
		
		textAddress = new JTextArea();
		textAddress.setBounds(103, 109, 547, 43);
		panelCreateSale.add(textAddress);
		textAddress.setBorder(BorderFactory.createCompoundBorder(border, 
		            BorderFactory.createEmptyBorder(5, 5, 5, 5)));
		
		textPhone = new JTextField();
		textPhone.setColumns(10);
		textPhone.setBounds(103, 60, 214, 20);
		panelCreateSale.add(textPhone);
		
		JScrollPane scrollProducts = new JScrollPane();
		scrollProducts.setEnabled(false);
		scrollProducts.setBounds(103, 222, 867, 249);
		panelCreateSale.add(scrollProducts);
		
		table = new JTable();
		table.setEnabled(false);
		table.setRowSelectionAllowed(false);
		table.setBackground(Color.WHITE);
		table.setModel(new DefaultTableModel(
			new Object[][] {
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
		table.getColumnModel().getColumn(1).setPreferredWidth(277);
		table.getColumnModel().getColumn(2).setResizable(false);
		table.getColumnModel().getColumn(3).setResizable(false);
		table.getColumnModel().getColumn(4).setResizable(false);
		table.getColumnModel().getColumn(5).setResizable(false);
		scrollProducts.setViewportView(table);
		
		JLabel label = new JLabel("TOTAL");
		label.setForeground(Color.RED);
		label.setFont(new Font("MS Gothic", Font.BOLD, 19));
		label.setBackground(Color.WHITE);
		label.setBounds(728, 37, 71, 43);
		panelCreateSale.add(label);
		
		totalPrice = new JLabel("0.00");
		totalPrice.setForeground(Color.RED);
		totalPrice.setFont(new Font("MS Gothic", Font.BOLD, 19));
		totalPrice.setBounds(832, 37, 138, 43);
		panelCreateSale.add(totalPrice);
		
		JLabel label_2 = new JLabel("Name");
		label_2.setFont(new Font("Microsoft Sans Serif", Font.BOLD, 13));
		label_2.setBounds(10, 17, 83, 14);
		panelCreateSale.add(label_2);
		
		JLabel label_3 = new JLabel("Phone #");
		label_3.setFont(new Font("Microsoft Sans Serif", Font.BOLD, 13));
		label_3.setBounds(10, 63, 83, 14);
		panelCreateSale.add(label_3);
		
		JLabel label_5 = new JLabel("Address");
		label_5.setFont(new Font("Microsoft Sans Serif", Font.BOLD, 13));
		label_5.setBounds(10, 114, 83, 14);
		panelCreateSale.add(label_5);
		
		JLabel lblQuantity = new JLabel("Quantity");
		lblQuantity.setFont(new Font("Microsoft Sans Serif", Font.BOLD, 13));
		lblQuantity.setBounds(336, 183, 83, 14);
		panelCreateSale.add(lblQuantity);
		
		btnCheckout = new JButton("Checkout");
		btnCheckout.setIcon(new ImageIcon(SaleView.class.getResource("/pkg/images/checkout.png")));
		btnCheckout.setForeground(Color.WHITE);
		btnCheckout.setFont(new Font("Century Gothic", Font.BOLD, 14));
		btnCheckout.setBackground(Color.RED);
		btnCheckout.setBounds(725, 97, 245, 100);
		panelCreateSale.add(btnCheckout);
		
		textProduct = new JComboBox();
		textProduct.setBounds(103, 178, 214, 20);
		panelCreateSale.add(textProduct);
		textProduct.setModel(model2);
		
		JLabel label_4 = new JLabel("Product");
		label_4.setFont(new Font("Microsoft Sans Serif", Font.BOLD, 13));
		label_4.setBounds(10, 183, 83, 14);
		panelCreateSale.add(label_4);
		
		textQuantity = new JTextField();
		textQuantity.setColumns(10);
		textQuantity.setBounds(407, 177, 106, 20);
		panelCreateSale.add(textQuantity);
		
		JLabel lblCreateNewSale = new JLabel("CREATE NEW SALE");
		lblCreateNewSale.setFont(new Font("Microsoft Sans Serif", Font.BOLD, 19));
		lblCreateNewSale.setForeground(Color.RED);
		lblCreateNewSale.setBounds(288, 11, 322, 65);
		contentPane.add(lblCreateNewSale);
		
		JLabel lblDeals = new JLabel("Deals");
		lblDeals.setBounds(0, 21, 286, 55);
		contentPane.add(lblDeals);
		lblDeals.setHorizontalAlignment(SwingConstants.CENTER);
		lblDeals.setForeground(Color.RED);
		lblDeals.setFont(new Font("Microsoft Sans Serif", Font.BOLD, 19));
		
		JPanel panelDeals = new JPanel();
		panelDeals.setBounds(0, 87, 286, 461);
		contentPane.add(panelDeals);
		cardLayout = new CardLayout(0,0);
		panelDeals.setLayout(cardLayout);
		
		JPanel panelDeal = new JPanel();
		panelDeal.setBackground(Color.WHITE);
		panelDeals.add(panelDeal, "name_148743801470498");
		panelDeal.setLayout(null);
		
		JLabel lblDeal = new JLabel("Deal # 1");
		lblDeal.setBounds(0, 11, 286, 14);
		lblDeal.setForeground(Color.RED);
		lblDeal.setHorizontalAlignment(SwingConstants.CENTER);
		lblDeal.setFont(new Font("Microsoft Sans Serif", Font.BOLD, 11));
		panelDeal.add(lblDeal);
		
		JPanel panelDealImage = new JPanel();
		panelDealImage.setBounds(10, 66, 266, 199);
		panelDealImage.setBackground(Color.WHITE);
		panelDeal.add(panelDealImage);
		
		JLabel imageDeal = new JLabel("");
		imageDeal.setIcon(new ImageIcon(SaleView.class.getResource("/pkg/images/logo.png")));
		imageDeal.setBackground(Color.WHITE);
		panelDealImage.add(imageDeal);
		
		JLabel labelPriceDeal = new JLabel("Price : 2,500 /-");
		labelPriceDeal.setBounds(0, 36, 286, 14);
		labelPriceDeal.setHorizontalAlignment(SwingConstants.CENTER);
		labelPriceDeal.setForeground(Color.RED);
		labelPriceDeal.setFont(new Font("Microsoft Sans Serif", Font.BOLD, 11));
		panelDeal.add(labelPriceDeal);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 276, 266, 174);
		panelDeal.add(scrollPane);
		
		JPanel panelDealDetails = new JPanel();
		panelDealDetails.setBackground(Color.WHITE);
		scrollPane.setViewportView(panelDealDetails);
		panelDealDetails.setLayout(null);
		
		JLabel lblProducts = new JLabel("2 x Pizza (XL)");
		lblProducts.setHorizontalAlignment(SwingConstants.CENTER);
		lblProducts.setFont(new Font("Microsoft Sans Serif", Font.BOLD, 11));
		lblProducts.setForeground(Color.RED);
		lblProducts.setBounds(10, 1, 244, 14);
		panelDealDetails.add(lblProducts);
		
		JSeparator separator = new JSeparator();
		separator.setBackground(Color.BLACK);
		separator.setBounds(10, 16, 244, 5);
		panelDealDetails.add(separator);
		
		JLabel label_7 = new JLabel("2 x Pizza (XL)");
		label_7.setHorizontalAlignment(SwingConstants.CENTER);
		label_7.setForeground(Color.RED);
		label_7.setFont(new Font("Microsoft Sans Serif", Font.BOLD, 11));
		label_7.setBounds(10, 22, 244, 14);
		panelDealDetails.add(label_7);
		
		JLabel label_8 = new JLabel("2 x Pizza (XL)");
		label_8.setHorizontalAlignment(SwingConstants.CENTER);
		label_8.setForeground(Color.RED);
		label_8.setFont(new Font("Microsoft Sans Serif", Font.BOLD, 11));
		label_8.setBounds(10, 64, 244, 14);
		panelDealDetails.add(label_8);
		
		JLabel label_9 = new JLabel("2 x Pizza (XL)");
		label_9.setHorizontalAlignment(SwingConstants.CENTER);
		label_9.setForeground(Color.RED);
		label_9.setFont(new Font("Microsoft Sans Serif", Font.BOLD, 11));
		label_9.setBounds(10, 43, 244, 14);
		panelDealDetails.add(label_9);
		
		JLabel label_10 = new JLabel("2 x Pizza (XL)");
		label_10.setHorizontalAlignment(SwingConstants.CENTER);
		label_10.setForeground(Color.RED);
		label_10.setFont(new Font("Microsoft Sans Serif", Font.BOLD, 11));
		label_10.setBounds(10, 85, 244, 14);
		panelDealDetails.add(label_10);
		
		JLabel label_11 = new JLabel("2 x Pizza (XL)");
		label_11.setHorizontalAlignment(SwingConstants.CENTER);
		label_11.setForeground(Color.RED);
		label_11.setFont(new Font("Microsoft Sans Serif", Font.BOLD, 11));
		label_11.setBounds(10, 106, 244, 14);
		panelDealDetails.add(label_11);
		
		JLabel label_12 = new JLabel("2 x Pizza (XL)");
		label_12.setHorizontalAlignment(SwingConstants.CENTER);
		label_12.setForeground(Color.RED);
		label_12.setFont(new Font("Microsoft Sans Serif", Font.BOLD, 11));
		label_12.setBounds(10, 148, 244, 14);
		panelDealDetails.add(label_12);
		
		JLabel label_13 = new JLabel("2 x Pizza (XL)");
		label_13.setHorizontalAlignment(SwingConstants.CENTER);
		label_13.setForeground(Color.RED);
		label_13.setFont(new Font("Microsoft Sans Serif", Font.BOLD, 11));
		label_13.setBounds(10, 127, 244, 14);
		panelDealDetails.add(label_13);
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setBackground(Color.BLACK);
		separator_1.setBounds(10, 37, 244, 5);
		panelDealDetails.add(separator_1);
		
		JSeparator separator_2 = new JSeparator();
		separator_2.setBackground(Color.BLACK);
		separator_2.setBounds(10, 58, 244, 5);
		panelDealDetails.add(separator_2);
		
		JSeparator separator_3 = new JSeparator();
		separator_3.setBackground(Color.BLACK);
		separator_3.setBounds(10, 79, 244, 5);
		panelDealDetails.add(separator_3);
		
		JSeparator separator_4 = new JSeparator();
		separator_4.setBackground(Color.BLACK);
		separator_4.setBounds(10, 100, 244, 5);
		panelDealDetails.add(separator_4);
		
		JSeparator separator_5 = new JSeparator();
		separator_5.setBackground(Color.BLACK);
		separator_5.setBounds(10, 121, 244, 5);
		panelDealDetails.add(separator_5);
		
		JSeparator separator_6 = new JSeparator();
		separator_6.setBackground(Color.BLACK);
		separator_6.setBounds(10, 142, 244, 5);
		panelDealDetails.add(separator_6);
		
		JSeparator separator_7 = new JSeparator();
		separator_7.setBackground(Color.BLACK);
		separator_7.setBounds(10, 163, 244, 5);
		panelDealDetails.add(separator_7);
		
		JPanel panelDeal2 = new JPanel();
		panelDeal2.setBackground(Color.WHITE);
		panelDeals.add(panelDeal2, "name_152182633015058");
		panelDeal2.setLayout(null);
		
		JLabel lblDeal_1 = new JLabel("Deal # 2");
		lblDeal_1.setBounds(0, 11, 286, 14);
		lblDeal_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblDeal_1.setForeground(Color.RED);
		lblDeal_1.setFont(new Font("Microsoft Sans Serif", Font.BOLD, 11));
		panelDeal2.add(lblDeal_1);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(10, 66, 266, 199);
		panel_1.setBackground(Color.WHITE);
		panelDeal2.add(panel_1);
		
		JLabel label_15 = new JLabel("");
		label_15.setIcon(new ImageIcon(SaleView.class.getResource("/pkg/images/logo.png")));
		label_15.setBackground(Color.WHITE);
		panel_1.add(label_15);
		
		JLabel lblPrice = new JLabel("Price : 4,000 /-");
		lblPrice.setBounds(0, 36, 286, 14);
		lblPrice.setHorizontalAlignment(SwingConstants.CENTER);
		lblPrice.setForeground(Color.RED);
		lblPrice.setFont(new Font("Microsoft Sans Serif", Font.BOLD, 11));
		panelDeal2.add(lblPrice);
		
		JScrollPane scrollPane_1 = new JScrollPane();
		scrollPane_1.setBounds(10, 276, 266, 174);
		panelDeal2.add(scrollPane_1);
		
		JPanel panel_2 = new JPanel();
		scrollPane_1.setViewportView(panel_2);
		panel_2.setLayout(null);
		
		JLabel label_14 = new JLabel("2 x Pizza (XL)");
		label_14.setForeground(Color.RED);
		label_14.setFont(new Font("Microsoft Sans Serif", Font.BOLD, 11));
		label_14.setBounds(10, 6, 244, 14);
		panel_2.add(label_14);
		
		JLabel label_16 = new JLabel("2 x Pizza (XL)");
		label_16.setForeground(Color.RED);
		label_16.setFont(new Font("Microsoft Sans Serif", Font.BOLD, 11));
		label_16.setBounds(10, 26, 244, 14);
		panel_2.add(label_16);
		
		JLabel label_17 = new JLabel("2 x Pizza (XL)");
		label_17.setForeground(Color.RED);
		label_17.setFont(new Font("Microsoft Sans Serif", Font.BOLD, 11));
		label_17.setBounds(10, 66, 244, 14);
		panel_2.add(label_17);
		
		JLabel label_18 = new JLabel("2 x Pizza (XL)");
		label_18.setForeground(Color.RED);
		label_18.setFont(new Font("Microsoft Sans Serif", Font.BOLD, 11));
		label_18.setBounds(10, 46, 244, 14);
		panel_2.add(label_18);
		
		JLabel label_19 = new JLabel("2 x Pizza (XL)");
		label_19.setForeground(Color.RED);
		label_19.setFont(new Font("Microsoft Sans Serif", Font.BOLD, 11));
		label_19.setBounds(10, 86, 244, 14);
		panel_2.add(label_19);
		
		JLabel label_20 = new JLabel("2 x Pizza (XL)");
		label_20.setForeground(Color.RED);
		label_20.setFont(new Font("Microsoft Sans Serif", Font.BOLD, 11));
		label_20.setBounds(10, 106, 244, 14);
		panel_2.add(label_20);
		
		JLabel label_21 = new JLabel("2 x Pizza (XL)");
		label_21.setForeground(Color.RED);
		label_21.setFont(new Font("Microsoft Sans Serif", Font.BOLD, 11));
		label_21.setBounds(10, 146, 244, 14);
		panel_2.add(label_21);
		
		JLabel label_22 = new JLabel("2 x Pizza (XL)");
		label_22.setForeground(Color.RED);
		label_22.setFont(new Font("Microsoft Sans Serif", Font.BOLD, 11));
		label_22.setBounds(10, 126, 244, 14);
		panel_2.add(label_22);
		
		JButton button_3 = new JButton("");
		button_3.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				cardLayout.next(panelDeals);
				
			}
		});
		button_3.setIcon(new ImageIcon(SaleView.class.getResource("/pkg/images/next.png")));
		button_3.setBackground(Color.WHITE);
		button_3.setBounds(237, 552, 41, 33);
		contentPane.add(button_3);
		button_3.setBorder(BorderFactory.createCompoundBorder(border2, 
	            BorderFactory.createEmptyBorder(5, 5, 5, 5)));
		
		JButton button_4 = new JButton("");
		button_4.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				cardLayout.previous(panelDeals);
			}
		});
		button_4.setIcon(new ImageIcon(SaleView.class.getResource("/pkg/images/prev.png")));
		button_4.setBackground(Color.WHITE);
		button_4.setBounds(10, 552, 41, 33);
		contentPane.add(button_4);
		button_4.setBorder(BorderFactory.createCompoundBorder(border2, 
	            BorderFactory.createEmptyBorder(5, 5, 5, 5)));
		
		btnLogOut = new JButton(userName);
		btnLogOut.setForeground(Color.RED);
		btnLogOut.setBackground(Color.WHITE);
		btnLogOut.setIcon(new ImageIcon(SaleView.class.getResource("/pkg/images/avatar.png")));
		btnLogOut.setBounds(1017, 21, 174, 26);
		contentPane.add(btnLogOut);
		btnLogOut.setBorder(BorderFactory.createCompoundBorder(border2, 
	            BorderFactory.createEmptyBorder(5, 5, 5, 5)));
		
		
		
	}
}
