package pkg.Views;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Window.Type;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.ImageIcon;
import javax.swing.SwingConstants;
import javax.swing.JTextArea;
import javax.swing.JButton;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class DialogBox extends JFrame {

	private JPanel contentPane;

	

	/**
	 * Create the frame.
	 */
	public DialogBox(String title, String message) {
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(500, 400, 529, 147);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblTitle = new JLabel(title);
		lblTitle.setHorizontalAlignment(SwingConstants.CENTER);
		lblTitle.setFont(new Font("Century Gothic", Font.PLAIN, 16));
		lblTitle.setBounds(96, 43, 423, 32);
		contentPane.add(lblTitle);
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.RED);
		panel.setBounds(0, 0, 529, 10);
		contentPane.add(panel);
		
		JLabel label = new JLabel("");
		if(message.equals("Error")) {
			label.setIcon(new ImageIcon(DialogBox.class.getResource("/pkg/images/error_icon1.png")));
		}else {
			label.setIcon(new ImageIcon(DialogBox.class.getResource("/pkg/images/tick.png")));
		}
		
		label.setBounds(10, 21, 64, 78);
		contentPane.add(label);
		
		JButton btnOk = new JButton("OK");
		btnOk.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				setVisible(false);
			}
		});
		btnOk.setBounds(220, 111, 89, 23);
		contentPane.add(btnOk);
		setUndecorated(true);
	}
}
