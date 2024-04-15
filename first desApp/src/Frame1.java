import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import java.awt.BorderLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import javax.swing.SwingConstants;
import java.awt.Insets;
import javax.swing.JTextField;
import javax.swing.UIManager;
import javax.swing.JLabel;
import javax.swing.border.BevelBorder;

public class Frame1 {

	private JFrame frame;
	private JLabel label;
	private JButton btnNewButton_1;
	private JButton btnNewButton_2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Frame1 window = new Frame1();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Frame1() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 594, 390);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setTitle("First Java Desktop App By Abubaker Azhari");
		frame.getContentPane().setLayout(null);
		
		
		JButton btnNewButton = new JButton("Show Message pop");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "hi Abubaker Azhari...");
			}
		});
		btnNewButton.setForeground(new Color(255, 0, 255));
		btnNewButton.setBackground(new Color(0, 206, 209));
		btnNewButton.setBounds(102, 186, 154, 43);
		frame.getContentPane().add(btnNewButton);
		
		label = new JLabel("message");
		label.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		label.setBackground(new Color(192, 192, 192));
		label.setBounds(102, 87, 338, 29);
		frame.getContentPane().add(label);
		
		btnNewButton_1 = new JButton("show message label");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				label.setText("Hi Abubaker Azhari");	
			}
		});
		btnNewButton_1.setBackground(new Color(152, 251, 152));
		btnNewButton_1.setBounds(289, 186, 151, 43);
		frame.getContentPane().add(btnNewButton_1);
		
		btnNewButton_2 = new JButton("clear label");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				label.setText("");
			}
		});
		btnNewButton_2.setBounds(220, 262, 116, 23);
		frame.getContentPane().add(btnNewButton_2);
	}
}
