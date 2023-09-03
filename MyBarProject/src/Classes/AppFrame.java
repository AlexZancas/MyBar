package Classes;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.WindowConstants;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.FlowLayout;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JToggleButton;
import java.awt.Color;
import java.awt.Component;
import javax.swing.Box;
import javax.swing.JSplitPane;
import java.awt.CardLayout;
import javax.swing.border.SoftBevelBorder;
import javax.swing.border.BevelBorder;
import java.awt.SystemColor;
import javax.swing.SwingConstants;
import java.awt.BorderLayout;

public class AppFrame extends JFrame {

	private JPanel contentPane;
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AppFrame frame = new AppFrame();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public AppFrame() {
		setTitle("MainMenu");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(0, 0, 1000, 500);
		
		contentPane = new JPanel();
		contentPane.setBackground(SystemColor.control);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Morgan's Bar");
		lblNewLabel.setFont(new Font("Sitka Small", Font.BOLD | Font.ITALIC, 18));
		lblNewLabel.setBounds(410, 11, 169, 54);
		contentPane.add(lblNewLabel);
		
		JPanel buttonPanel = new JPanel();
		buttonPanel.setBackground(SystemColor.menu);
		buttonPanel.setBounds(10, 64, 964, 386);
		contentPane.add(buttonPanel);
		buttonPanel.setLayout(new GridLayout(0, 3, 20, 20));
		
		JButton ordersMenuBtn = new JButton("Table orders");
		buttonPanel.add(ordersMenuBtn);
		
		JButton billMenuBtn = new JButton("Give the bill");
		buttonPanel.add(billMenuBtn);
		
		JButton availabilityBtn = new JButton("Availability");
		buttonPanel.add(availabilityBtn);
		
		JButton foodMenuBtn = new JButton("Menu");
		buttonPanel.add(foodMenuBtn);
		
		JButton signingMenuBtn = new JButton("Signing");
		buttonPanel.add(signingMenuBtn);
		
		JButton adminMenuBtn = new JButton("Admin");
		buttonPanel.add(adminMenuBtn);
	}
}
